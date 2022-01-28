package com.slog.bean;

import com.slog.bean.Item;
import com.slog.bean.Listaprecio;
import com.slog.bean.ListaprecioitemPK;
import com.slog.bean.Listapreciovalor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Listaprecioitem.class)
public class Listaprecioitem_ { 

    public static volatile SingularAttribute<Listaprecioitem, Double> porcdescto3;
    public static volatile SingularAttribute<Listaprecioitem, Double> porcdescto2;
    public static volatile SingularAttribute<Listaprecioitem, Double> porcdescto1;
    public static volatile SingularAttribute<Listaprecioitem, Double> costo1;
    public static volatile CollectionAttribute<Listaprecioitem, Listapreciovalor> listapreciovalorCollection;
    public static volatile SingularAttribute<Listaprecioitem, Double> flete;
    public static volatile SingularAttribute<Listaprecioitem, ListaprecioitemPK> listaprecioitemPK;
    public static volatile SingularAttribute<Listaprecioitem, Double> costo3;
    public static volatile SingularAttribute<Listaprecioitem, Double> otros;
    public static volatile SingularAttribute<Listaprecioitem, Item> item;
    public static volatile SingularAttribute<Listaprecioitem, Double> costo2;
    public static volatile SingularAttribute<Listaprecioitem, Double> costofin;
    public static volatile SingularAttribute<Listaprecioitem, Listaprecio> listaprecio;

}