package com.slog.bean;

import com.slog.bean.Fpago;
import com.slog.bean.Listaprecio;
import com.slog.bean.ListapreciofpagoPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Listapreciofpago.class)
public class Listapreciofpago_ { 

    public static volatile SingularAttribute<Listapreciofpago, Character> estado;
    public static volatile SingularAttribute<Listapreciofpago, Fpago> fpago;
    public static volatile SingularAttribute<Listapreciofpago, ListapreciofpagoPK> listapreciofpagoPK;
    public static volatile SingularAttribute<Listapreciofpago, Date> fechareg;
    public static volatile SingularAttribute<Listapreciofpago, Double> montominpedido;
    public static volatile SingularAttribute<Listapreciofpago, Character> flagflete;
    public static volatile SingularAttribute<Listapreciofpago, Listaprecio> listaprecio;

}