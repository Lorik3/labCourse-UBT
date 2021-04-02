/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ylli
 */
@Entity
@Table(name = "studenti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studenti.findAll", query = "SELECT s FROM Studenti s"),
    @NamedQuery(name = "Studenti.findByStudentId", query = "SELECT s FROM Studenti s WHERE s.studentId = :studentId"),
    @NamedQuery(name = "Studenti.findByEmri", query = "SELECT s FROM Studenti s WHERE s.emri = :emri"),
    @NamedQuery(name = "Studenti.findByMbiemri", query = "SELECT s FROM Studenti s WHERE s.mbiemri = :mbiemri"),
    @NamedQuery(name = "Studenti.findByDataELindjes", query = "SELECT s FROM Studenti s WHERE s.dataELindjes = :dataELindjes"),
    @NamedQuery(name = "Studenti.findByGjinia", query = "SELECT s FROM Studenti s WHERE s.gjinia = :gjinia"),
    @NamedQuery(name = "Studenti.findByNrTelefonit", query = "SELECT s FROM Studenti s WHERE s.nrTelefonit = :nrTelefonit"),
    @NamedQuery(name = "Studenti.findByEmail", query = "SELECT s FROM Studenti s WHERE s.email = :email"),
    @NamedQuery(name = "Studenti.findByAdressa", query = "SELECT s FROM Studenti s WHERE s.adressa = :adressa")})
public class Studenti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "emri")
    private String emri;
    @Column(name = "mbiemri")
    private String mbiemri;
    @Column(name = "data_e_lindjes")
    @Temporal(TemporalType.DATE)
    private Date dataELindjes;
    @Column(name = "gjinia")
    private String gjinia;
    @Column(name = "nr_telefonit")
    private Integer nrTelefonit;
    @Column(name = "email")
    private String email;
    @Column(name = "adressa")
    private String adressa;
    @OneToMany(mappedBy = "fkStudentId")
    private Collection<Admins> adminsCollection;
    @JoinColumn(name = "fk_user_id", referencedColumnName = "Users_id")
    @ManyToOne
    private Perdorusi fkUserId;

    public Studenti() {
    }

    public Studenti(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

    public Date getDataELindjes() {
        return dataELindjes;
    }

    public void setDataELindjes(Date dataELindjes) {
        this.dataELindjes = dataELindjes;
    }

    public String getGjinia() {
        return gjinia;
    }

    public void setGjinia(String gjinia) {
        this.gjinia = gjinia;
    }

    public Integer getNrTelefonit() {
        return nrTelefonit;
    }

    public void setNrTelefonit(Integer nrTelefonit) {
        this.nrTelefonit = nrTelefonit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdressa() {
        return adressa;
    }

    public void setAdressa(String adressa) {
        this.adressa = adressa;
    }

    @XmlTransient
    public Collection<Admins> getAdminsCollection() {
        return adminsCollection;
    }

    public void setAdminsCollection(Collection<Admins> adminsCollection) {
        this.adminsCollection = adminsCollection;
    }

    public Perdorusi getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Perdorusi fkUserId) {
        this.fkUserId = fkUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studenti)) {
            return false;
        }
        Studenti other = (Studenti) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emri;
    }
    
}
