package com.slog.bean;

import com.slog.bean.Empresa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Tipoactividad.class)
public class Tipoactividad_ { 

    public static volatile SingularAttribute<Tipoactividad, String> codigo;
    public static volatile SingularAttribute<Tipoactividad, String> descri;
    public static volatile CollectionAttribute<Tipoactividad, Empresa> empresaCollection;

}