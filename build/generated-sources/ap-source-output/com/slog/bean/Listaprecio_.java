package com.slog.bean;

import com.slog.bean.Almacen;
import com.slog.bean.Listapreciofpago;
import com.slog.bean.Listaprecioitem;
import com.slog.bean.Moneda;
import com.slog.bean.Tipolistaprecio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Listaprecio.class)
public class Listaprecio_ { 

    public static volatile SingularAttribute<Listaprecio, Date> fechaini;
    public static volatile SingularAttribute<Listaprecio, String> operacion;
    public static volatile SingularAttribute<Listaprecio, Almacen> idealmacen;
    public static volatile SingularAttribute<Listaprecio, Date> fechafin;
    public static volatile CollectionAttribute<Listaprecio, Listaprecioitem> listaprecioitemCollection;
    public static volatile SingularAttribute<Listaprecio, Moneda> codmoneda;
    public static volatile SingularAttribute<Listaprecio, Tipolistaprecio> codtipolista;
    public static volatile CollectionAttribute<Listaprecio, Listapreciofpago> listapreciofpagoCollection;
    public static volatile SingularAttribute<Listaprecio, Integer> ideLp;
    public static volatile SingularAttribute<Listaprecio, Date> fechaultLp;
    public static volatile SingularAttribute<Listaprecio, Date> fecharegLp;
    public static volatile SingularAttribute<Listaprecio, Character> estadoLp;
    public static volatile SingularAttribute<Listaprecio, String> descriLp;
    public static volatile SingularAttribute<Listaprecio, Double> descuentoLp;

}