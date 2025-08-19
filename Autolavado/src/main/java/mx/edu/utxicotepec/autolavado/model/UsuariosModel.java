/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.utxicotepec.autolavado.model;

import java.sql.Date;

/**
 *
 * @author PC-03
 */
public class UsuariosModel {

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getIdRol() {
        return idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }
    private int idUsuario;
    private String correo;
    private String direccion;
    private Date fecha_nacimiento;
    private int idRol;
    private String nombre;
    private String password;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String usuario;

    public void UsuariosModel(int idUsuario, String correo, String direccion, Date fecha_nacimiento, int idRol, String nombre, String password,
            String primerApellido, String segundoApellido, String telefono, String usuario) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idRol = idRol;
        this.nombre = nombre;
        this.password = password;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.usuario = usuario;
    }

    public void UsuariosModel(String correo, String direccion, Date fecha_nacimiento, int idRol, String nombre, String password,
            String primerApellido, String segundoApellido, String telefono, String usuario) {
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idRol = idRol;
        this.nombre = nombre;
        this.password = password;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.usuario = usuario;
    }
}
