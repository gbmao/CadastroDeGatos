package com.appdafamilia.service;

import com.appdafamilia.data.CatRepository;
import com.appdafamilia.data.CatRepositoryImpl;
import com.appdafamilia.dto.CatDto;
import com.appdafamilia.model.Cat;

public class CatServiceImpl implements CatService {

    CatRepository catRepository;

    public CatServiceImpl(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public CatDto createCat(String name) {

        if(name == null) throw new CatServiceException("Name cannot be null");
        if(name.length() < 2) throw new CatServiceException("Name length can't be less than 2");

        boolean isCatCreated;

        Cat createdCat = new Cat(name);

        try {
        isCatCreated = catRepository.save(createdCat);
        } catch (RuntimeException e) {
            throw new CatServiceException(e.getMessage());
        }

        if (!isCatCreated) throw new CatServiceException("Could not create cat");

        return new CatDto(createdCat.getName(),createdCat.getId());
    }
}
