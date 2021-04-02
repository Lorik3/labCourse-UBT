/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ylli
 */
@Entity
@Table(name = "admins")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admins.findAll", query = "SELECT a FROM Admins a"),
    @NamedQuery(name = "Admins.findByAdminid", query = "SELECT a FROM Admins a WHERE a.adminid = :adminid"),
    @NamedQuery(name = "Admins.findByAdminname", query = "SELECT a FROM Admins a WHERE a.adminname = :adminname"),
    @NamedQuery(name = "Admins.findByPassword", query = "SELECT a FROM Admins a WHERE a.password = :password")})
public class Admins implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Admin_id")
    private Integer adminid;
    @Column(name = "adminname")
    private String adminname;
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "fk_id_autori", referencedColumnName = "autori_id")
    @ManyToOne
    private Autori fkIdAutori;
    @JoinColumn(name = "fk_libri_id", referencedColumnName = "libri_id")
    @ManyToOne
    private Libri fkLibriId;
    @JoinColumn(name = "fk_lloji_id", referencedColumnName = "lloji_id")
    @ManyToOne
    private Lloji fkLlojiId;
    @JoinColumn(name = "fk_perdorusi_id", referencedColumnName = "Users_id")
    @ManyToOne
    private Perdorusi fkPerdorusiId;
    @JoinColumn(name = "fk_student_id", referencedColumnName = "student_id")
    @ManyToOne
    private Studenti fkStudentId;

    public Admins() {
    }

    public Admins(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Autori getFkIdAutori() {
        return fkIdAutori;
    }

    public void setFkIdAutori(Autori fkIdAutori) {
        this.fkIdAutori = fkIdAutori;
    }

    public Libri getFkLibriId() {
        return fkLibriId;
    }

    public void setFkLibriId(Libri fkLibriId) {
        this.fkLibriId = fkLibriId;
    }

    public Lloji getFkLlojiId() {
        return fkLlojiId;
    }

    public void setFkLlojiId(Lloji fkLlojiId) {
        this.fkLlojiId = fkLlojiId;
    }

    public Perdorusi getFkPerdorusiId() {
        return fkPerdorusiId;
    }

    public void setFkPerdorusiId(Perdorusi fkPerdorusiId) {
        this.fkPerdorusiId = fkPerdorusiId;
    }

    public Studenti getFkStudentId() {
        return fkStudentId;
    }

    public void setFkStudentId(Studenti fkStudentId) {
        this.fkStudentId = fkStudentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminid != null ? adminid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admins)) {
            return false;
        }
        Admins other = (Admins) object;
        if ((this.adminid == null && other.adminid != null) || (this.adminid != null && !this.adminid.equals(other.adminid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Admins[ adminid=" + adminid + " ]";
    }
    
}
