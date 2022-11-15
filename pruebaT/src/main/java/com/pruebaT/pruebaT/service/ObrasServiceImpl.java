/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.service;

import com.pruebaT.pruebaT.entity.Obras;
import com.pruebaT.pruebaT.repository.ObrasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class ObrasServiceImpl implements ObrasService {

    @Autowired
    private ObrasRepository repository;

    @Override
    public List<Obras> listarTodos() {
        return (List<Obras>) repository.findAll();

    }

    @Override
    public void guardar(Obras artista) {

    }

    @Override
    public Obras buscarPorId(int id) {
        return null;

    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void editar(Obras artista) {

    }

    @Override
    public List<Obras> consultar1(Integer filtro) throws Exception {
        try {
            List<Obras> obras = repository.consultar1(filtro);
            return obras;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
