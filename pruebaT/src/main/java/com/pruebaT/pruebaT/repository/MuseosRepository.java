/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.repository;

import com.pruebaT.pruebaT.entity.Museos;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ASUS
 */
public interface MuseosRepository extends CrudRepository<Museos, Integer> {

    @Query(
            value = "select * from museos where museos.ciudad like :parametro and museos.nombre like  'L%'",
            nativeQuery = true
    )
    List<Museos> consultar2(@Param("parametro") String parametro);
}
