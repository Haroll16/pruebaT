/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "museos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Museos.findAll", query = "SELECT m FROM Museos m"),
    @NamedQuery(name = "Museos.findById", query = "SELECT m FROM Museos m WHERE m.id = :id"),
    @NamedQuery(name = "Museos.findByNombre", query = "SELECT m FROM Museos m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Museos.findByPais", query = "SELECT m FROM Museos m WHERE m.pais = :pais"),
    @NamedQuery(name = "Museos.findByCiudad", query = "SELECT m FROM Museos m WHERE m.ciudad = :ciudad"),
    @NamedQuery(name = "Museos.findByDireccion", query = "SELECT m FROM Museos m WHERE m.direccion = :direccion")})
public class Museos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "pais")
    private String pais;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "direccion")
    private String direccion;

    public Museos() {
    }

    public Museos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Museos)) {
            return false;
        }
        Museos other = (Museos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pruebaT.pruebaT.entity.Museos[ id=" + id + " ]";
    }
    
}
