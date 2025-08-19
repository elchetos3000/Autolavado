/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.utxicotepec.autolavado.model;

/**
 *
 * @author PC-03
 */
public class ServiciosModel {

    public int getIdServicios() {
        return idServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public byte getEstatus() {
        return estatus;
    }
    private int idServicios;
    private String nombre;
    private String descripcion; 
    private double precio;
    private byte estatus;

    public void ServiciosModel(int idServicios, String nombre, String descripcion, double precio, byte estatus) {
        this.idServicios = idServicios;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estatus = estatus;
    }

    public void ServiciosModel(String nombre, String descripcion, double precio, byte estatus) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estatus = estatus;
    }
}
