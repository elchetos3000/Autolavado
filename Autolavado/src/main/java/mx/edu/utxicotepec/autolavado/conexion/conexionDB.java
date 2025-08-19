/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.utxicotepec.autolavado.conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PC-08
 */
public class conexionDB {
    public static final String URL = "jdbc:mysql://localhost:3307/db_autolavado";
    public static final String USER = "root";
    private static final String PASSWORD = "1234";
    
    public static Connection obtenerConexion() throws SQLException{
       return DriveManager.getConnection(URL, USER, PASSWORD); 
    }
}
