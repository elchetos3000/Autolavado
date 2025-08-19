/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.utxicotepec.autolavado.model;

/**
 *
 * @author PC-03
 */
public class RolModel {

    public int getIdRol() {
        return idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }
        private int idRol;
        private String nombreRol;
        
        public void RolModel(int idRol, String nombreRol){
            this.idRol= idRol;
            this.nombreRol = nombreRol;
        }
        
        public void RolModel(String nombreRol){
            this.nombreRol = nombreRol;
            
        }
}
