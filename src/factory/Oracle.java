/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Julian
 */
public  class Oracle implements conexionesDB{
        @Override
        public void conectar(){
            System.out.println("Conectado a Oracle");
        }
        
        @Override
        public void desconectar(){
            System.out.println("Desconectado de Oracle");
        }
}
