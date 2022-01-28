package com.slog.bean;

import com.slog.bean.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Tipodocumento.class)
public class Tipodocumento_ { 

    public static volatile SingularAttribute<Tipodocumento, String> codigoTd;
    public static volatile SingularAttribute<Tipodocumento, String> nomfuncionvalidTd;
    public static volatile CollectionAttribute<Tipodocumento, Proveedor> proveedorCollection;
    public static volatile SingularAttribute<Tipodocumento, Character> validarTd;
    public static volatile SingularAttribute<Tipodocumento, Integer> longitudTd;
    public static volatile SingularAttribute<Tipodocumento, String> descriTd;

}