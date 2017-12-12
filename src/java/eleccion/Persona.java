/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccion;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Diana
 */
@Entity
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByPersonaId", query = "SELECT p FROM Persona p WHERE p.personaId = :personaId")
    , @NamedQuery(name = "Persona.findByPersonaNom", query = "SELECT p FROM Persona p WHERE p.personaNom = :personaNom")
    , @NamedQuery(name = "Persona.findByPersonaCorreo", query = "SELECT p FROM Persona p WHERE p.personaCorreo = :personaCorreo")
    , @NamedQuery(name = "Persona.findByPersonaCelular", query = "SELECT p FROM Persona p WHERE p.personaCelular = :personaCelular")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PersonaId")
    private String personaId;
    @Size(max = 40)
    @Column(name = "PersonaNom")
    private String personaNom;
    @Size(max = 40)
    @Column(name = "PersonaCorreo")
    private String personaCorreo;
    @Size(max = 20)
    @Column(name = "PersonaCelular")
    private String personaCelular;
    @OneToMany(mappedBy = "personaId")
    private Collection<Personarol> personarolCollection;

    public Persona() {
    }

    public Persona(String personaId) {
        this.personaId = personaId;
    }

    public String getPersonaId() {
        return personaId;
    }

    public void setPersonaId(String personaId) {
        this.personaId = personaId;
    }

    public String getPersonaNom() {
        return personaNom;
    }

    public void setPersonaNom(String personaNom) {
        this.personaNom = personaNom;
    }

    public String getPersonaCorreo() {
        return personaCorreo;
    }

    public void setPersonaCorreo(String personaCorreo) {
        this.personaCorreo = personaCorreo;
    }

    public String getPersonaCelular() {
        return personaCelular;
    }

    public void setPersonaCelular(String personaCelular) {
        this.personaCelular = personaCelular;
    }

    @XmlTransient
    public Collection<Personarol> getPersonarolCollection() {
        return personarolCollection;
    }

    public void setPersonarolCollection(Collection<Personarol> personarolCollection) {
        this.personarolCollection = personarolCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaId != null ? personaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.personaId == null && other.personaId != null) || (this.personaId != null && !this.personaId.equals(other.personaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eleccion.Persona[ personaId=" + personaId + " ]";
    }
    
}
