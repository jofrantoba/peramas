package com.slog.bean;

import com.slog.bean.Listapreciofpago;
import com.slog.bean.Listapreciovalor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Fpago.class)
public class Fpago_ { 

    public static volatile CollectionAttribute<Fpago, Listapreciofpago> listapreciofpagoCollection;
    public static volatile SingularAttribute<Fpago, String> codigoFpago;
    public static volatile SingularAttribute<Fpago, String> descriFpago;
    public static volatile SingularAttribute<Fpago, Character> cancelacionFpago;
    public static volatile CollectionAttribute<Fpago, Listapreciovalor> listapreciovalorCollection;

}