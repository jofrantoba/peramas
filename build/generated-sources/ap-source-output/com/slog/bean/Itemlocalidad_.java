package com.slog.bean;

import com.slog.bean.Item;
import com.slog.bean.ItemlocalidadPK;
import com.slog.bean.Localidad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Itemlocalidad.class)
public class Itemlocalidad_ { 

    public static volatile SingularAttribute<Itemlocalidad, Localidad> localidad;
    public static volatile SingularAttribute<Itemlocalidad, Character> estado;
    public static volatile SingularAttribute<Itemlocalidad, Date> fechacrea;
    public static volatile SingularAttribute<Itemlocalidad, ItemlocalidadPK> itemlocalidadPK;
    public static volatile SingularAttribute<Itemlocalidad, Character> flagigv;
    public static volatile SingularAttribute<Itemlocalidad, Item> item;

}