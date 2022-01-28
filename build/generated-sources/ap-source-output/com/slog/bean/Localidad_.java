package com.slog.bean;

import com.slog.bean.Almacen;
import com.slog.bean.Empresa;
import com.slog.bean.Itemlocalidad;
import com.slog.bean.LocalidadPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Localidad.class)
public class Localidad_ { 

    public static volatile SingularAttribute<Localidad, LocalidadPK> localidadPK;
    public static volatile CollectionAttribute<Localidad, Itemlocalidad> itemlocalidadCollection;
    public static volatile SingularAttribute<Localidad, Empresa> empresa;
    public static volatile CollectionAttribute<Localidad, Almacen> almacenCollection;
    public static volatile SingularAttribute<Localidad, String> descriLocalidad;

}