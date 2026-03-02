package com.appdafamilia.service;

import com.appdafamilia.dto.CatDto;

public class CatServiceImpl implements CatService {
    @Override
    public CatDto createCat(String name) {
        return new CatDto(name);
    }
}
