/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.utxicotepec.autolavado.model;

import java.time.*;

/**
 *
 * @author PC-03
 */
public class VehiculoModel {

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Year getYear() {
        return year;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdCliente() {
        return idCliente;
    }
    private int idVehiculo;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Year year;
    private String tipo;
    private int idCliente;

    public void                                                                                                      VehiculoModel(int idVehiculo, String matricula, String marca, String modelo, String color, Year year, String tipo, int idCliente) {
        this.idVehiculo = idVehiculo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
        this.tipo = tipo;
        this.idCliente = idCliente;
    }

    public void VehiculoModel(String matricula, String marca, String modelo, String color, Year year, String tipo, int idCliente) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
        this.tipo = tipo;
        this.idCliente = idCliente;
    }
}
