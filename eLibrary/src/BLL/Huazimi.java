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
@Table(name = "huazimi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Huazimi.findAll", query = "SELECT h FROM Huazimi h"),
    @NamedQuery(name = "Huazimi.findByHuazimiId", query = "SELECT h FROM Huazimi h WHERE h.huazimiId = :huazimiId"),
    @NamedQuery(name = "Huazimi.findByDataEHuazimit", query = "SELECT h FROM Huazimi h WHERE h.dataEHuazimit = :dataEHuazimit"),
    @NamedQuery(name = "Huazimi.findByDataERikthimit", query = "SELECT h FROM Huazimi h WHERE h.dataERikthimit = :dataERikthimit")})
public class Huazimi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "huazimi_id")
    private Integer huazimiId;
    @Column(name = "data_e_huazimit")
    @Temporal(TemporalType.DATE)
    private Date dataEHuazimit;
    @Column(name = "data_e_rikthimit")
    @Temporal(TemporalType.DATE)
    private Date dataERikthimit;
    @JoinColumn(name = "fk_libri_id", referencedColumnName = "libri_id")
    @ManyToOne
    private Libri fkLibriId;

    public Huazimi() {
    }

    public Huazimi(Integer huazimiId) {
        this.huazimiId = huazimiId;
    }

    public Integer getHuazimiId() {
        return huazimiId;
    }

    public void setHuazimiId(Integer huazimiId) {
        this.huazimiId = huazimiId;
    }

    public Date getDataEHuazimit() {
        return dataEHuazimit;
    }

    public void setDataEHuazimit(Date dataEHuazimit) {
        this.dataEHuazimit = dataEHuazimit;
    }

    public Date getDataERikthimit() {
        return dataERikthimit;
    }

    public void setDataERikthimit(Date dataERikthimit) {
        this.dataERikthimit = dataERikthimit;
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
        hash += (huazimiId != null ? huazimiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Huazimi)) {
            return false;
        }
        Huazimi other = (Huazimi) object;
        if ((this.huazimiId == null && other.huazimiId != null) || (this.huazimiId != null && !this.huazimiId.equals(other.huazimiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Huazimi[ huazimiId=" + huazimiId + " ]";
    }
    
}
