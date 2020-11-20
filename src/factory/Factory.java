/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import factory.FabricaConexiones;

/**
 *
 * @author Julian
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaConexiones f=new FabricaConexiones();
        conexionesDB c1=f.getConexion("MYSQL");
        c1.conectar();
        conexionesDB c2=f.getConexion("ORACLE");
        c2.conectar();
        conexionesDB c3=f.getConexion("POSTGRE");
        c3.conectar();
        
        
    }
    
}
