/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dimitris
 */
@Entity
@Table(name = "instrunments", catalog = "roletest", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instrunment.findAll", query = "SELECT i FROM Instrunment i")
    , @NamedQuery(name = "Instrunment.findByInstrumentId", query = "SELECT i FROM Instrunment i WHERE i.instrumentId = :instrumentId")
    , @NamedQuery(name = "Instrunment.findByModel", query = "SELECT i FROM Instrunment i WHERE i.model = :model")
    , @NamedQuery(name = "Instrunment.findByPrice", query = "SELECT i FROM Instrunment i WHERE i.price = :price")
    , @NamedQuery(name = "Instrunment.findByDescription", query = "SELECT i FROM Instrunment i WHERE i.description = :description")
    , @NamedQuery(name = "Instrunment.findByType", query = "SELECT i FROM Instrunment i WHERE i.type = :type")})
public class Instrunment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "instrument_id", nullable = false)
    private Integer instrumentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(nullable = false, length = 45)
    private String model;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double price;
    @Size(max = 100)
    @Column(length = 100)
    private String description;
    @Size(max = 45)
    @Column(length = 45)
    private String type;
@ManyToOne(optional = false)
    @JoinColumn(name = "brand_id")
    private Brand brand;
    public Instrunment() {
    }

    public Instrunment(Integer instrumentId) {
        this.instrumentId = instrumentId;
    }

    public Instrunment(Integer instrumentId, String model) {
        this.instrumentId = instrumentId;
        this.model = model;
    }

    public Integer getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Integer instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instrumentId != null ? instrumentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instrunment)) {
            return false;
        }
        Instrunment other = (Instrunment) object;
        if ((this.instrumentId == null && other.instrumentId != null) || (this.instrumentId != null && !this.instrumentId.equals(other.instrumentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Instrunment{" + "instrumentId=" + instrumentId + ", model=" + model + ", price=" + price + ", description=" + description + ", type=" + type  + '}';
    }

    
    
}
