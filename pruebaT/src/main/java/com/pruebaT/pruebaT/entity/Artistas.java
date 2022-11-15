/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaT.pruebaT.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "artistas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artistas.findAll", query = "SELECT a FROM Artistas a"),
    @NamedQuery(name = "Artistas.findById", query = "SELECT a FROM Artistas a WHERE a.id = :id"),
    @NamedQuery(name = "Artistas.findByTipoIde", query = "SELECT a FROM Artistas a WHERE a.tipoIde = :tipoIde"),
    @NamedQuery(name = "Artistas.findByNumeroIde", query = "SELECT a FROM Artistas a WHERE a.numeroIde = :numeroIde"),
    @NamedQuery(name = "Artistas.findByNombres", query = "SELECT a FROM Artistas a WHERE a.nombres = :nombres"),
    @NamedQuery(name = "Artistas.findByApellido", query = "SELECT a FROM Artistas a WHERE a.apellido = :apellido")})
public class Artistas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo_ide")
    private String tipoIde;
    @Column(name = "numero_ide")
    private String numeroIde;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellido")
    private String apellido;
    

    
    public Artistas() {
    }

    public Artistas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoIde() {
        return tipoIde;
    }

    public void setTipoIde(String tipoIde) {
        this.tipoIde = tipoIde;
    }

    public String getNumeroIde() {
        return numeroIde;
    }

    public void setNumeroIde(String numeroIde) {
        this.numeroIde = numeroIde;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        if (!(object instanceof Artistas)) {
            return false;
        }
        Artistas other = (Artistas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pruebaT.pruebaT.entity.Artistas[ id=" + id + " ]";
    }
    
}
