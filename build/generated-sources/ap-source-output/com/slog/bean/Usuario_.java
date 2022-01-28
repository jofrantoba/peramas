package com.slog.bean;

import com.slog.bean.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Date> fechacreaPer;
    public static volatile SingularAttribute<Usuario, String> paternoPer;
    public static volatile SingularAttribute<Usuario, String> emailPer;
    public static volatile SingularAttribute<Usuario, String> maternoPer;
    public static volatile SingularAttribute<Usuario, Character> estadoPer;
    public static volatile SingularAttribute<Usuario, Integer> ideTpersona;
    public static volatile SingularAttribute<Usuario, byte[]> passwordUsuario;
    public static volatile SingularAttribute<Usuario, String> descriPer;
    public static volatile SingularAttribute<Usuario, String> loginUsuario;
    public static volatile SingularAttribute<Usuario, String> nombresPer;
    public static volatile SingularAttribute<Usuario, Character> sexoPer;
    public static volatile CollectionAttribute<Usuario, Item> itemCollection;
    public static volatile SingularAttribute<Usuario, Date> fechanacPer;

}