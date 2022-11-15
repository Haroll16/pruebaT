/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.service;

import com.pruebaT.pruebaT.entity.Museos;
import com.pruebaT.pruebaT.repository.MuseosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service

public class MuseosServiceImpl implements MuseosService {

    @Autowired
    private MuseosRepository repository;

    @Override
    public List<Museos> listarTodos() {
        return (List<Museos>) repository.findAll();
    }

    @Override
    public List<Museos> consultar2(String parametro) throws Exception {
        try {
            List<Museos> museo= repository.consultar2(parametro);
            return museo;
                    
            
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
        
    }

}
