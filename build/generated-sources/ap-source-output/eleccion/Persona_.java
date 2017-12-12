package eleccion;

import eleccion.Personarol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-12-12T16:32:45")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> personaCelular;
    public static volatile SingularAttribute<Persona, String> personaNom;
    public static volatile SingularAttribute<Persona, String> personaCorreo;
    public static volatile SingularAttribute<Persona, String> personaId;
    public static volatile CollectionAttribute<Persona, Personarol> personarolCollection;

}