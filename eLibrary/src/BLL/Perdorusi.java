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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Perdorusi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perdorusi.findAll", query = "SELECT p FROM Perdorusi p"),
    @NamedQuery(name = "Perdorusi.findByUsersid", query = "SELECT p FROM Perdorusi p WHERE p.usersid = :usersid"),
    @NamedQuery(name = "Perdorusi.findByUsername", query = "SELECT p FROM Perdorusi p WHERE p.username = :username"),
    @NamedQuery(name = "Perdorusi.findByPassword", query = "SELECT p FROM Perdorusi p WHERE p.password = :password")})
public class Perdorusi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Users_id")
    private Integer usersid;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "fk_roli_id", referencedColumnName = "roli_id")
    @ManyToOne
    private RoliL fkRoliId;
    @OneToMany(mappedBy = "fkPerdorusiId")
    private Collection<Admins> adminsCollection;
    @OneToMany(mappedBy = "fkUserId")
    private Collection<Studenti> studentiCollection;

    public Perdorusi() {
    }

    public Perdorusi(Integer usersid) {
        this.usersid = usersid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoliL getFkRoliId() {
        return fkRoliId;
    }

    public void setFkRoliId(RoliL fkRoliId) {
        this.fkRoliId = fkRoliId;
    }

    @XmlTransient
    public Collection<Admins> getAdminsCollection() {
        return adminsCollection;
    }

    public void setAdminsCollection(Collection<Admins> adminsCollection) {
        this.adminsCollection = adminsCollection;
    }

    @XmlTransient
    public Collection<Studenti> getStudentiCollection() {
        return studentiCollection;
    }

    public void setStudentiCollection(Collection<Studenti> studentiCollection) {
        this.studentiCollection = studentiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersid != null ? usersid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perdorusi)) {
            return false;
        }
        Perdorusi other = (Perdorusi) object;
        if ((this.usersid == null && other.usersid != null) || (this.usersid != null && !this.usersid.equals(other.usersid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return username;
    }
    
}
