package com.appdafamilia.data;

import com.appdafamilia.model.Cat;

import java.util.HashMap;
import java.util.Map;

public class CatRepositoryImpl implements CatRepository {

    private Map<Long, Cat> database = new HashMap<>();
    private Long idSequence = 1L;

    @Override
    public Boolean save(Cat cat) {
        database.put(idSequence, cat);

        cat.setId(idSequence);

        idSequence++;
        return true;
    }
}
