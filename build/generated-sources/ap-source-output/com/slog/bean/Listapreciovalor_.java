package com.slog.bean;

import com.slog.bean.Fpago;
import com.slog.bean.Listaprecioitem;
import com.slog.bean.ListapreciovalorPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Listapreciovalor.class)
public class Listapreciovalor_ { 

    public static volatile SingularAttribute<Listapreciovalor, Double> margenutilidad;
    public static volatile SingularAttribute<Listapreciovalor, String> operacion;
    public static volatile SingularAttribute<Listapreciovalor, Double> valorventa;
    public static volatile SingularAttribute<Listapreciovalor, ListapreciovalorPK> listapreciovalorPK;
    public static volatile SingularAttribute<Listapreciovalor, Fpago> fpago;
    public static volatile SingularAttribute<Listapreciovalor, Listaprecioitem> listaprecioitem;

}