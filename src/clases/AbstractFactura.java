/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author harol
 */
//abstract define como clase abstracta
public abstract class AbstractFactura {
    //atributos
    protected String codigoFac;
    protected double subTotal;
    protected double porcientoIVA;
    
    //metodos constructores
    public AbstractFactura() {
    }
    
    public AbstractFactura(String codigoFac, double subTotal, double porcientoIVA) {
        this.codigoFac = codigoFac;
        this.subTotal = subTotal;
        this.porcientoIVA = porcientoIVA;
    }
    
    //metodos getter and setter
    public String getCodigoFac() {
        return codigoFac;
    }

    public void setCodigoFac(String codigoFac) {
        this.codigoFac = codigoFac;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getPorcientoIVA() {
        return porcientoIVA;
    }

    public void setPorcientoIVA(double porcientoIVA) {
        this.porcientoIVA = porcientoIVA;
    }
    
    //metodos de comportamiento
    public abstract double obtenerValorIVA();
    
    public abstract double obtenerTotalFacturar();
}
