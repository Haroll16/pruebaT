/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.service;

import com.pruebaT.pruebaT.entity.Museos;
import java.util.List;

/**
 *
 * @author ASUS
 */

public interface MuseosService {
    public List<Museos>listarTodos();
     public List<Museos> consultar2(String parametro) throws Exception;
}
