/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.controller;

import com.pruebaT.pruebaT.entity.Artistas;
import com.pruebaT.pruebaT.service.ArtistasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/artistas")
public class ArtistasController {
    
    @Autowired
    ArtistasService service;
    
    @GetMapping("/{id}")
    public ResponseEntity<?>  listarOne(@PathVariable Integer id){
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorId(id));
    }
    
    
     @GetMapping("")
    public List<Artistas>listarAll(){
    return (List<Artistas>) service.listarTodos();
    }
}


//Finish 15/11/2022 hora 11:41