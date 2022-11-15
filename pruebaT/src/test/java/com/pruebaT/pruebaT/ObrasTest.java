/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT;

import com.pruebaT.pruebaT.entity.Artistas;
import com.pruebaT.pruebaT.entity.Obras;
import com.pruebaT.pruebaT.repository.ObrasRepository;
import com.pruebaT.pruebaT.service.ObrasService;
import com.pruebaT.pruebaT.service.ObrasServiceImpl;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author ASUS
 */

public class ObrasTest {

    @Mock
    private ObrasRepository repository;

    @InjectMocks
    private ObrasServiceImpl service;


    private Obras obra;
    
    @BeforeEach
    void setUp() {
          MockitoAnnotations.initMocks(this);
        obra = new Obras();
        obra.setId(23);
        obra.setNombre("Performance");
        obra.setPais("Colombia");
        obra.setIdArtista(new Artistas());

    }

    @Test
    void findAll() {
        when(repository.findAll()).thenReturn(Arrays.asList(obra));
        assertNotNull(service.listarTodos());
        
    }

    @Test
    void consulta1() throws Exception {
        when(repository.consultar1(any(Integer.class))).thenReturn(Arrays.asList(obra));
        assertNotNull(service.consultar1(1));

    }

}
