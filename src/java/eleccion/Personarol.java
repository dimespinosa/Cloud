/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccion;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diana
 */
@Entity
@Table(name = "personarol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personarol.findAll", query = "SELECT p FROM Personarol p")
    , @NamedQuery(name = "Personarol.findByPersonaRolId", query = "SELECT p FROM Personarol p WHERE p.personaRolId = :personaRolId")})
public class Personarol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PersonaRolId")
    private String personaRolId;
    @JoinColumn(name = "PersonaId", referencedColumnName = "PersonaId")
    @ManyToOne
    private Persona personaId;
    @JoinColumn(name = "RolId", referencedColumnName = "RolId")
    @ManyToOne
    private Rol rolId;

    public Personarol() {
    }

    public Personarol(String personaRolId) {
        this.personaRolId = personaRolId;
    }

    public String getPersonaRolId() {
        return personaRolId;
    }

    public void setPersonaRolId(String personaRolId) {
        this.personaRolId = personaRolId;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public Rol getRolId() {
        return rolId;
    }

    public void setRolId(Rol rolId) {
        this.rolId = rolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaRolId != null ? personaRolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personarol)) {
            return false;
        }
        Personarol other = (Personarol) object;
        if ((this.personaRolId == null && other.personaRolId != null) || (this.personaRolId != null && !this.personaRolId.equals(other.personaRolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eleccion.Personarol[ personaRolId=" + personaRolId + " ]";
    }
    
}
