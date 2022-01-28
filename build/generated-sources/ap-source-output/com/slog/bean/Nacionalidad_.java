package com.slog.bean;

import com.slog.bean.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Nacionalidad.class)
public class Nacionalidad_ { 

    public static volatile SingularAttribute<Nacionalidad, String> descriNacion;
    public static volatile SingularAttribute<Nacionalidad, Integer> codsunatNacion;
    public static volatile CollectionAttribute<Nacionalidad, Proveedor> proveedorCollection;
    public static volatile SingularAttribute<Nacionalidad, Integer> ideNacion;

}