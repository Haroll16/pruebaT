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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "obras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Obras.findAll", query = "SELECT o FROM Obras o"),
    @NamedQuery(name = "Obras.findById", query = "SELECT o FROM Obras o WHERE o.id = :id"),
    @NamedQuery(name = "Obras.findByNombre", query = "SELECT o FROM Obras o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "Obras.findByPais", query = "SELECT o FROM Obras o WHERE o.pais = :pais")})
public class Obras implements Serializable {

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
    @JoinColumn(name = "id_artista", referencedColumnName = "id")
    @ManyToOne
    private Artistas idArtista;

    public Obras() {
    }

    public Obras(Integer id) {
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

    public Artistas getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Artistas idArtista) {
        this.idArtista = idArtista;
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
        if (!(object instanceof Obras)) {
            return false;
        }
        Obras other = (Obras) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pruebaT.pruebaT.entity.Obras[ id=" + id + " ]";
    }
    
}
