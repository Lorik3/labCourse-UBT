/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ylli
 */
@Entity
@Table(name = "lloji")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lloji.findAll", query = "SELECT l FROM Lloji l"),
    @NamedQuery(name = "Lloji.findByLlojiId", query = "SELECT l FROM Lloji l WHERE l.llojiId = :llojiId"),
    @NamedQuery(name = "Lloji.findByEmri", query = "SELECT l FROM Lloji l WHERE l.emri = :emri")})
public class Lloji implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "lloji_id")
    private Integer llojiId;
    @Column(name = "emri")
    private String emri;
    @OneToMany(mappedBy = "fkLlojiId")
    private Collection<Admins> adminsCollection;
    @OneToMany(mappedBy = "fkLlojiId")
    private Collection<Libri> libriCollection;

    public Lloji() {
    }

    public Lloji(Integer llojiId) {
        this.llojiId = llojiId;
    }

    public Integer getLlojiId() {
        return llojiId;
    }

    public void setLlojiId(Integer llojiId) {
        this.llojiId = llojiId;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    @XmlTransient
    public Collection<Admins> getAdminsCollection() {
        return adminsCollection;
    }

    public void setAdminsCollection(Collection<Admins> adminsCollection) {
        this.adminsCollection = adminsCollection;
    }

    @XmlTransient
    public Collection<Libri> getLibriCollection() {
        return libriCollection;
    }

    public void setLibriCollection(Collection<Libri> libriCollection) {
        this.libriCollection = libriCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (llojiId != null ? llojiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lloji)) {
            return false;
        }
        Lloji other = (Lloji) object;
        if ((this.llojiId == null && other.llojiId != null) || (this.llojiId != null && !this.llojiId.equals(other.llojiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emri;
    }
    
}
