package com.appdafamilia.service;

import com.appdafamilia.data.CatRepository;
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

        catRepository.save(new Cat(name));

        return new CatDto(name);
    }
}
