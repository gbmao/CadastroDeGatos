package com.appdafamilia.service;

import com.appdafamilia.dto.CatDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CatServiceTest {

    CatService catService;

    @Test
    void testCreateCat_whenGivenValidInformation_thenReturnCatDTO(){

        // Arrange
        String catName = "Boris";
        catService = new CatServiceImpl();

        // Act
        CatDto actualName = catService.createCat("Boris");

        // Assert
        assertEquals(catName,actualName.name(), "Names should be equals");
    }

    @Test
    void testeCreateCat_whenNameIsNull_thenThrowIllegalArgumentException(){

        // Arrange
        String catName = null;
        catService = new CatServiceImpl();

        // Act
        assertThrows(IllegalArgumentException.class, ()->{
            catService.createCat(catName);
        });

        // Assert
    }
}
