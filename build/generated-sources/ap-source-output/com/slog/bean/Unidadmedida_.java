package com.slog.bean;

import com.slog.bean.Factorconv;
import com.slog.bean.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Unidadmedida.class)
public class Unidadmedida_ { 

    public static volatile CollectionAttribute<Unidadmedida, Factorconv> factorconvCollection;
    public static volatile SingularAttribute<Unidadmedida, String> codigoUm;
    public static volatile SingularAttribute<Unidadmedida, String> descriUm;
    public static volatile CollectionAttribute<Unidadmedida, Item> itemCollection1;
    public static volatile CollectionAttribute<Unidadmedida, Item> itemCollection2;
    public static volatile CollectionAttribute<Unidadmedida, Item> itemCollection;
    public static volatile CollectionAttribute<Unidadmedida, Factorconv> factorconvCollection1;

}