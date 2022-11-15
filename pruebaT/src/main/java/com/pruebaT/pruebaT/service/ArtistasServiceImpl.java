/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.service;

import com.pruebaT.pruebaT.entity.Artistas;
import com.pruebaT.pruebaT.repository.ArtistasRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */

@Service
public class ArtistasServiceImpl implements ArtistasService{

    @Autowired
    private ArtistasRepository repositorio;
    
    @Override
    @Transactional
    public List<Artistas> listarTodos() {
             return (List<Artistas>) repositorio.findAll();

    }

    @Override
    public void guardar(Artistas artista) {

    }

    @Override
    public Artistas buscarPorId(Integer id) {
      
           return repositorio.findById(id).orElse(null);
  
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void editar(Artistas artista) {
   
    }
    
}
