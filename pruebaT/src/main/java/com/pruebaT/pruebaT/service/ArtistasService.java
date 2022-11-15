/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.service;

import com.pruebaT.pruebaT.entity.Artistas;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ArtistasService {

    public List<Artistas> listarTodos();

    public void guardar(Artistas artista);

    public Artistas buscarPorId(Integer id);

    public void eliminar(Integer id);

    public void editar(Artistas artista);

}
