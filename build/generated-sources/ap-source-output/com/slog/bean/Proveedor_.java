package com.slog.bean;

import com.slog.bean.Item;
import com.slog.bean.Nacionalidad;
import com.slog.bean.Tipodocumento;
import com.slog.bean.Tipogironegocio;
import com.slog.bean.Ubigeo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombrecomercialProv;
    public static volatile SingularAttribute<Proveedor, String> paternoPer;
    public static volatile SingularAttribute<Proveedor, String> tipoProv;
    public static volatile SingularAttribute<Proveedor, String> maternoPer;
    public static volatile SingularAttribute<Proveedor, Character> estadoPer;
    public static volatile SingularAttribute<Proveedor, Nacionalidad> ideNacion;
    public static volatile SingularAttribute<Proveedor, Tipodocumento> codigoTd;
    public static volatile SingularAttribute<Proveedor, Date> fechainiactividad;
    public static volatile CollectionAttribute<Proveedor, Item> itemCollection;
    public static volatile SingularAttribute<Proveedor, String> codigoaltProv;
    public static volatile SingularAttribute<Proveedor, Date> fechacreaPer;
    public static volatile SingularAttribute<Proveedor, String> numeroProv;
    public static volatile SingularAttribute<Proveedor, String> emailPer;
    public static volatile SingularAttribute<Proveedor, Ubigeo> ubigeoProv;
    public static volatile SingularAttribute<Proveedor, Integer> ideProv;
    public static volatile SingularAttribute<Proveedor, Character> nuevorus;
    public static volatile SingularAttribute<Proveedor, Integer> ideTpersona;
    public static volatile SingularAttribute<Proveedor, String> descriPer;
    public static volatile SingularAttribute<Proveedor, String> nombresPer;
    public static volatile SingularAttribute<Proveedor, String> comentaProv;
    public static volatile SingularAttribute<Proveedor, Character> agtepercepcionProv;
    public static volatile SingularAttribute<Proveedor, String> razonsocialProv;
    public static volatile SingularAttribute<Proveedor, Character> sexoPer;
    public static volatile SingularAttribute<Proveedor, Tipogironegocio> giroProv;
    public static volatile SingularAttribute<Proveedor, Date> fechanacPer;

}