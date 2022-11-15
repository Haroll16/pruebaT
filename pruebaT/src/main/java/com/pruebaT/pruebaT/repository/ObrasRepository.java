/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.repository;

import com.pruebaT.pruebaT.entity.Obras;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public interface ObrasRepository extends CrudRepository<Obras, Integer>{
    

        //@Query("Select x from Obras x where x.artistas.id= :filtro")
    /*/
        @Query(
            value="select  nombre from pruebat.obras o ,pruebat.artistas a where a.id= :filtro and o.pais = 'Colombia' and o.id_artista =a.id ",
            nativeQuery = true
    )/*/
            
            
      @Query(
            value="select  * from obras  where obras.id_artista like :filtro and obras.pais like  'Colombia'",
            nativeQuery = true
    )       
    List<Obras>consultar1(@Param("filtro") Integer filtro);
    
}
