package com.slog.bean;

import com.slog.bean.Listaprecio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Moneda.class)
public class Moneda_ { 

    public static volatile SingularAttribute<Moneda, String> codigoMoneda;
    public static volatile SingularAttribute<Moneda, String> abreviaturaMoneda;
    public static volatile SingularAttribute<Moneda, String> descriMoneda;
    public static volatile CollectionAttribute<Moneda, Listaprecio> listaprecioCollection;

}