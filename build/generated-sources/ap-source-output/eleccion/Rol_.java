package eleccion;

import eleccion.Personarol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-12-12T16:32:45")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> rolId;
    public static volatile SingularAttribute<Rol, String> rolNom;
    public static volatile CollectionAttribute<Rol, Personarol> personarolCollection;

}