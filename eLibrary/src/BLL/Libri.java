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
@Table(name = "libri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libri.findAll", query = "SELECT l FROM Libri l"),
    @NamedQuery(name = "Libri.findByLibriId", query = "SELECT l FROM Libri l WHERE l.libriId = :libriId"),
    @NamedQuery(name = "Libri.findByTitulli", query = "SELECT l FROM Libri l WHERE l.titulli = :titulli"),
    @NamedQuery(name = "Libri.findByNumriIFaqeve", query = "SELECT l FROM Libri l WHERE l.numriIFaqeve = :numriIFaqeve"),
    @NamedQuery(name = "Libri.findByAutori", query = "SELECT l FROM Libri l WHERE l.autori = :autori"),
    @NamedQuery(name = "Libri.findByBotusi", query = "SELECT l FROM Libri l WHERE l.botusi = :botusi")})
public class Libri implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "libri_id")
    private Integer libriId;
    @Column(name = "titulli")
    private String titulli;
    @Column(name = "numri_i_faqeve")
    private Integer numriIFaqeve;
    @Column(name = "autori")
    private String autori;
    @Column(name = "Botusi")
    private String botusi;
    @OneToMany(mappedBy = "fkLibriId")
    private Collection<Huazimi> huazimiCollection;
    @OneToMany(mappedBy = "fkLibriId")
    private Collection<Rezervo> rezervoCollection;
    @OneToMany(mappedBy = "fkLibriId")
    private Collection<Admins> adminsCollection;
    @JoinColumn(name = "fk_id_autori", referencedColumnName = "autori_id")
    @ManyToOne
    private Autori fkIdAutori;
    @JoinColumn(name = "fk_lloji_id", referencedColumnName = "lloji_id")
    @ManyToOne
    private Lloji fkLlojiId;

    public Libri() {
    }

    public Libri(Integer libriId) {
        this.libriId = libriId;
    }

    public Integer getLibriId() {
        return libriId;
    }

    public void setLibriId(Integer libriId) {
        this.libriId = libriId;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public Integer getNumriIFaqeve() {
        return numriIFaqeve;
    }

    public void setNumriIFaqeve(Integer numriIFaqeve) {
        this.numriIFaqeve = numriIFaqeve;
    }

    public String getAutori() {
        return autori;
    }

    public void setAutori(String autori) {
        this.autori = autori;
    }

    public String getBotusi() {
        return botusi;
    }

    public void setBotusi(String botusi) {
        this.botusi = botusi;
    }

    @XmlTransient
    public Collection<Huazimi> getHuazimiCollection() {
        return huazimiCollection;
    }

    public void setHuazimiCollection(Collection<Huazimi> huazimiCollection) {
        this.huazimiCollection = huazimiCollection;
    }

    @XmlTransient
    public Collection<Rezervo> getRezervoCollection() {
        return rezervoCollection;
    }

    public void setRezervoCollection(Collection<Rezervo> rezervoCollection) {
        this.rezervoCollection = rezervoCollection;
    }

    @XmlTransient
    public Collection<Admins> getAdminsCollection() {
        return adminsCollection;
    }

    public void setAdminsCollection(Collection<Admins> adminsCollection) {
        this.adminsCollection = adminsCollection;
    }

    public Autori getFkIdAutori() {
        return fkIdAutori;
    }

    public void setFkIdAutori(Autori fkIdAutori) {
        this.fkIdAutori = fkIdAutori;
    }

    public Lloji getFkLlojiId() {
        return fkLlojiId;
    }

    public void setFkLlojiId(Lloji fkLlojiId) {
        this.fkLlojiId = fkLlojiId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libriId != null ? libriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libri)) {
            return false;
        }
        Libri other = (Libri) object;
        if ((this.libriId == null && other.libriId != null) || (this.libriId != null && !this.libriId.equals(other.libriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titulli;
    }
    
}
