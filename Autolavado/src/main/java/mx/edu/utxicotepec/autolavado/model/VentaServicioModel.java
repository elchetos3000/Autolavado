/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.utxicotepec.autolavado.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author PC-03
 */
public class VentaServicioModel {

    public int getVentaServicio() {
        return ventaServicio;
    }

    public int getIdUsuarioC() {
        return idUsuarioC;
    }

    public int getIdUsuarioL() {
        return idUsuarioL;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public String getEstatus() {
        return estatus;
    }

    public byte getPagado() {
        return pagado;
    }

    private int ventaServicio;
    private int idUsuarioC;
    private int idUsuarioL;
    private int idServicio;
    private int idVehiculo;
    private Date fecha; 
    private Time hora;
    private String estatus;
    private byte pagado;

    public void VentaServicioModel(int ventaServicio, int idUsuarioC, int idUsuarioL, int idServicio, int idVehiculo,
            Date fecha, Time hora, String estatus, byte pagado) {
        this.ventaServicio = ventaServicio;
        this.idUsuarioC = idUsuarioC;
        this.idUsuarioL = idUsuarioL;
        this.idServicio = idServicio;
        this.idVehiculo = idVehiculo;
        this.fecha = fecha;
        this.hora = hora;
        this.estatus = estatus;
        this.pagado = pagado;
    }
    public void VentaServicioModel (int idUsuarioC, int idUsuarioL, int idServicio, int idVehiculo,
            Date fecha, Time hora, String estatus, byte pagado){
        this.idUsuarioC = idUsuarioC;
        this.idUsuarioL = idUsuarioL;
        this.idServicio = idServicio;
        this.idVehiculo = idVehiculo;
        this.fecha = fecha;
        this.hora = hora;
        this.estatus = estatus;
        this.pagado = pagado;
    }
}
