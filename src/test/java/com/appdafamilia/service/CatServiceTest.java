package com.appdafamilia.service;

import com.appdafamilia.dto.CatDto;
import com.appdafamilia.model.Cat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
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

    @DisplayName("Throw Cat Service Exception when name is null")
    @Test
    void testeCreateCat_whenNameIsNull_thenThrowCatServiceException(){

        // Arrange
        String catName = null;
        catService = new CatServiceImpl();
        String expectedMessage = "Name cannot be null";

        // Act
        CatServiceException thrown = assertThrows(CatServiceException.class, ()->{
            catService.createCat(catName);
        });

        // Assert
        assertEquals(expectedMessage, thrown.getMessage());
    }

    @Test
    void testCreateCat_whenGivenValidInformation_thenSaveOneTime(){
        // Arrange
        Mockito.when(catRepository.save(any(Cat.class)));
        // Act

        // Assert
    }
}
