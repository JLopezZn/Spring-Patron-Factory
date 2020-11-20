/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import factory.MySQL;
import factory.Oracle;
import factory.POSTGRE;
import factory.conexionesDB;

/**
 *
 * @author Julian
 */

    public class FabricaConexiones {
    
    public conexionesDB getConexion (String conexion){
    if(conexion.equalsIgnoreCase("MYSQL")){
    return new MySQL();
    }
    if(conexion.equalsIgnoreCase("ORACLE")){
    return new Oracle();
    }
    if(conexion.equalsIgnoreCase("POSTGRE")){
    return new POSTGRE();
    }
    return new ConexionVacia();
    }
    
}

