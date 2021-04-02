/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ylli
 */
@Entity
@Table(name = "Rezervo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rezervo.findAll", query = "SELECT r FROM Rezervo r"),
    @NamedQuery(name = "Rezervo.findByRezervoId", query = "SELECT r FROM Rezervo r WHERE r.rezervoId = :rezervoId"),
    @NamedQuery(name = "Rezervo.findByDataERezervimit", query = "SELECT r FROM Rezervo r WHERE r.dataERezervimit = :dataERezervimit")})
public class Rezervo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rezervo_id")
    private Integer rezervoId;
    @Column(name = "data_e_rezervimit")
    @Temporal(TemporalType.DATE)
    private Date dataERezervimit;
    @JoinColumn(name = "fk_libri_id", referencedColumnName = "libri_id")
    @ManyToOne
    private Libri fkLibriId;

    public Rezervo() {
    }

    public Rezervo(Integer rezervoId) {
        this.rezervoId = rezervoId;
    }

    public Integer getRezervoId() {
        return rezervoId;
    }

    public void setRezervoId(Integer rezervoId) {
        this.rezervoId = rezervoId;
    }

    public Date getDataERezervimit() {
        return dataERezervimit;
    }

    public void setDataERezervimit(Date dataERezervimit) {
        this.dataERezervimit = dataERezervimit;
    }

    public Libri getFkLibriId() {
        return fkLibriId;
    }

    public void setFkLibriId(Libri fkLibriId) {
        this.fkLibriId = fkLibriId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rezervoId != null ? rezervoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rezervo)) {
            return false;
        }
        Rezervo other = (Rezervo) object;
        if ((this.rezervoId == null && other.rezervoId != null) || (this.rezervoId != null && !this.rezervoId.equals(other.rezervoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Rezervo[ rezervoId=" + rezervoId + " ]";
    }
    
}
