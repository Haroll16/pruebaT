/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.controller;

import com.pruebaT.pruebaT.entity.Artistas;
import com.pruebaT.pruebaT.entity.Obras;
import com.pruebaT.pruebaT.service.ArtistasService;
import com.pruebaT.pruebaT.service.ObrasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/obras")
public class ObrasController {

    @Autowired
    ObrasService service;
   

    @GetMapping("/")
    public List<Obras> listar() {
        return service.listarTodos();
    }

    //http://localhost:8080/obras/consulta1?filtro=1
    @GetMapping("/consulta1")
    public ResponseEntity<?> consulta1(@RequestParam Integer filtro) {
          try {
           return ResponseEntity.status(HttpStatus.OK).body(service.consultar1(filtro));
        } catch (Exception e) {
            return   ResponseEntity.status(HttpStatus.NOT_FOUND).body((e.getMessage()));
        }
 
  
    }

}
