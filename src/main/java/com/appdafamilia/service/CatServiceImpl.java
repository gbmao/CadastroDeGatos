package com.appdafamilia.service;

import com.appdafamilia.dto.CatDto;

public class CatServiceImpl implements CatService {
    @Override
    public CatDto createCat(String name) {

        if(name == null) throw new CatServiceException("Name cannot be null");

        return new CatDto(name);
    }
}
