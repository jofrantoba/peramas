package com.slog.bean;

import com.slog.bean.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, String> descriMarca;
    public static volatile SingularAttribute<Marca, Integer> ideMarca;
    public static volatile CollectionAttribute<Marca, Item> itemCollection;

}