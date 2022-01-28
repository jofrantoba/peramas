package com.slog.bean;

import com.slog.bean.Listaprecio;
import com.slog.bean.Localidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Almacen.class)
public class Almacen_ { 

    public static volatile SingularAttribute<Almacen, String> responsable;
    public static volatile SingularAttribute<Almacen, String> abrevAlmacen;
    public static volatile SingularAttribute<Almacen, String> direccion;
    public static volatile SingularAttribute<Almacen, Localidad> localidad;
    public static volatile SingularAttribute<Almacen, String> codoperventa;
    public static volatile SingularAttribute<Almacen, String> descriAlmacen;
    public static volatile SingularAttribute<Almacen, String> codigoAlmacen;
    public static volatile SingularAttribute<Almacen, Character> puntoventa;
    public static volatile SingularAttribute<Almacen, String> ubigeoAlmacen;
    public static volatile CollectionAttribute<Almacen, Listaprecio> listaprecioCollection;
    public static volatile SingularAttribute<Almacen, Integer> ideAlmacen;

}