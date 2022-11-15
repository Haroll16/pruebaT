/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.service;

import com.pruebaT.pruebaT.entity.Obras;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ObrasService {
    
    
    public List<Obras> listarTodos();

    public void guardar(Obras artista);

    public Obras buscarPorId(int id);

    public void eliminar(int id);

    public void editar(Obras artista);
    
     public List<Obras> consultar1(Integer filtro) throws Exception;
    
}
