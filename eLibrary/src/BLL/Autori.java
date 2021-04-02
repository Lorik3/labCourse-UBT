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
@Table(name = "autori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autori.findAll", query = "SELECT a FROM Autori a"),
    @NamedQuery(name = "Autori.findByAutoriId", query = "SELECT a FROM Autori a WHERE a.autoriId = :autoriId"),
    @NamedQuery(name = "Autori.findByEmri", query = "SELECT a FROM Autori a WHERE a.emri = :emri"),
    @NamedQuery(name = "Autori.findByMbiemri", query = "SELECT a FROM Autori a WHERE a.mbiemri = :mbiemri"),
    @NamedQuery(name = "Autori.findByGjinia", query = "SELECT a FROM Autori a WHERE a.gjinia = :gjinia"),
    @NamedQuery(name = "Autori.findByAdressa", query = "SELECT a FROM Autori a WHERE a.adressa = :adressa"),
    @NamedQuery(name = "Autori.findByTel", query = "SELECT a FROM Autori a WHERE a.tel = :tel"),
    @NamedQuery(name = "Autori.findByEmail", query = "SELECT a FROM Autori a WHERE a.email = :email")})
public class Autori implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "autori_id")
    private Integer autoriId;
    @Column(name = "emri")
    private String emri;
    @Column(name = "mbiemri")
    private String mbiemri;
    @Column(name = "gjinia")
    private String gjinia;
    @Column(name = "adressa")
    private String adressa;
    @Column(name = "tel")
    private String tel;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "fkIdAutori")
    private Collection<Admins> adminsCollection;
    @OneToMany(mappedBy = "fkIdAutori")
    private Collection<Libri> libriCollection;

    public Autori() {
    }

    public Autori(Integer autoriId) {
        this.autoriId = autoriId;
    }

    public Integer getAutoriId() {
        return autoriId;
    }

    public void setAutoriId(Integer autoriId) {
        this.autoriId = autoriId;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getGjinia() {
        return gjinia;
    }

    public void setGjinia(String gjinia) {
        this.gjinia = gjinia;
    }

    public String getAdressa() {
        return adressa;
    }

    public void setAdressa(String adressa) {
        this.adressa = adressa;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash += (autoriId != null ? autoriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autori)) {
            return false;
        }
        Autori other = (Autori) object;
        if ((this.autoriId == null && other.autoriId != null) || (this.autoriId != null && !this.autoriId.equals(other.autoriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emri + mbiemri;
    }
    
}
