package com.slog.bean;

import com.slog.bean.Localidad;
import com.slog.bean.Tipoactividad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-11-24T12:35:58")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> codigoEmp;
    public static volatile SingularAttribute<Empresa, byte[]> fondoEmp;
    public static volatile SingularAttribute<Empresa, Character> estadoEmp;
    public static volatile SingularAttribute<Empresa, String> telefonoEmp;
    public static volatile SingularAttribute<Empresa, String> nombreEmp;
    public static volatile SingularAttribute<Empresa, Tipoactividad> tipoactividad;
    public static volatile SingularAttribute<Empresa, Date> fechacreaEmp;
    public static volatile SingularAttribute<Empresa, String> dcomercialEmp;
    public static volatile SingularAttribute<Empresa, Character> aportesenati;
    public static volatile SingularAttribute<Empresa, String> rucEmp;
    public static volatile SingularAttribute<Empresa, String> direccionEmp;
    public static volatile SingularAttribute<Empresa, String> representanteEmp;
    public static volatile CollectionAttribute<Empresa, Localidad> localidadCollection;

}