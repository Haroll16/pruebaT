package com.pruebaT.pruebaT.repository;


import com.pruebaT.pruebaT.entity.Artistas;
import com.pruebaT.pruebaT.entity.Obras;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
@Repository
public interface ArtistasRepository extends CrudRepository<Artistas, Integer>{
   // public List<Artistas> findAll();
   // public Artistas findOne();
 //public Artistas save(Artistas a);
 //void delete(Artistas a);
    

}
