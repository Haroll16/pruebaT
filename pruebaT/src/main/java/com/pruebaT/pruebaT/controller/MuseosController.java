/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.controller;

import com.pruebaT.pruebaT.entity.Museos;
import com.pruebaT.pruebaT.service.MuseosService;
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
@RequestMapping(path = "/museos")
public class MuseosController {

    @Autowired
    MuseosService service;

    
    @GetMapping("")
    public List<Museos> listarAll() {
        return (List<Museos>) service.listarTodos();
    }
    
    
//http://localhost:8080/museos/consulta2?parametro=Medellin
    @GetMapping("/consulta2")
    public ResponseEntity<?> consulta1(@RequestParam String parametro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.consultar2(parametro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body((e.getMessage()));
        }

    }
}
