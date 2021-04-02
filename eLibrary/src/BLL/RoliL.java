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
@Table(name = "roliL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoliL.findAll", query = "SELECT r FROM RoliL r"),
    @NamedQuery(name = "RoliL.findByRoliId", query = "SELECT r FROM RoliL r WHERE r.roliId = :roliId"),
    @NamedQuery(name = "RoliL.findByEmertimi", query = "SELECT r FROM RoliL r WHERE r.emertimi = :emertimi")})
public class RoliL implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "roli_id")
    private Integer roliId;
    @Column(name = "Emertimi")
    private String emertimi;
    @OneToMany(mappedBy = "fkRoliId")
    private Collection<Perdorusi> perdorusiCollection;

    public RoliL() {
    }

    public RoliL(Integer roliId) {
        this.roliId = roliId;
    }

    public Integer getRoliId() {
        return roliId;
    }

    public void setRoliId(Integer roliId) {
        this.roliId = roliId;
    }

    public String getEmertimi() {
        return emertimi;
    }

    public void setEmertimi(String emertimi) {
        this.emertimi = emertimi;
    }

    @XmlTransient
    public Collection<Perdorusi> getPerdorusiCollection() {
        return perdorusiCollection;
    }

    public void setPerdorusiCollection(Collection<Perdorusi> perdorusiCollection) {
        this.perdorusiCollection = perdorusiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roliId != null ? roliId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoliL)) {
            return false;
        }
        RoliL other = (RoliL) object;
        if ((this.roliId == null && other.roliId != null) || (this.roliId != null && !this.roliId.equals(other.roliId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emertimi;
    }
    
}
