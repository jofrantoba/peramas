package com.slog.bean;

import com.slog.bean.Listaprecio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Tipolistaprecio.class)
public class Tipolistaprecio_ { 

    public static volatile SingularAttribute<Tipolistaprecio, String> codigo;
    public static volatile SingularAttribute<Tipolistaprecio, Date> fecharegTp;
    public static volatile SingularAttribute<Tipolistaprecio, Character> estado;
    public static volatile SingularAttribute<Tipolistaprecio, String> descri;
    public static volatile CollectionAttribute<Tipolistaprecio, Listaprecio> listaprecioCollection;

}