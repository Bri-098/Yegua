/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.yegua.entidades;

import java.util.ArrayList;
import java.util.List;
import mx.itson.yegua.enums.Categoria;
import mx.itson.yegua.enums.TipoVenta;

/**
 *
 * @author icesp
 */
public class Venta {

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the tipo
     */
    public TipoVenta getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoVenta tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the articulo
     */
    public List<Articulo> getArticulo() {
        return articulo;
    }

    /**
     * @param articulo the articulo to set
     */
    public void setArticulo(List<Articulo> articulo) {
        this.articulo = articulo;
    }
    
    private String cliente;
    private TipoVenta tipo;
    private double subtotal;
    private double descuento;
    private double total;
    private List<Articulo> articulo;
    
    public void calcularSubtotal(){
        double interes = 0.30;
        double subtotal = 0;
        double total = 0;
        //if this.tipo == tipoVenta.CREDITO {
        //}
        for (Articulo a : articulo) {
            double precio = a.getPrecio();
            total += a.getPrecio();
            if (tipo == TipoVenta.CREDITO){
                a.setPrecio(precio*interes);
            }
        subtotal = total;    
        }
    }
    
    public void calcularTotal(){
        for (Articulo a : articulo) {
            
        }
        
        }
    
}
