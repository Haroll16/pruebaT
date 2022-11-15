/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT;

import com.pruebaT.pruebaT.entity.Museos;
import com.pruebaT.pruebaT.entity.Obras;
import com.pruebaT.pruebaT.repository.MuseosRepository;
import com.pruebaT.pruebaT.repository.ObrasRepository;
import com.pruebaT.pruebaT.service.MuseosService;
import com.pruebaT.pruebaT.service.MuseosServiceImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author ASUS
 */
public class MuseosTest {
    
    @Mock
    private MuseosRepository repository;

    @InjectMocks
    private MuseosServiceImpl service;
    
    
    
    private Museos museo;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        
        museo = new Museos();
        
        museo.setId(1);
        museo.setDireccion("Carrera 5");
        museo.setNombre("Botanico");
        museo.setPais("Colombia");
        museo.setCiudad("Medellin");
    }

    @Test
    void consulta2() throws Exception {
        when(repository.consultar2("Mexico")).thenReturn(Arrays.asList(museo));
        assertNotNull(service.consultar2("cccc"));
        
    }
    

}
