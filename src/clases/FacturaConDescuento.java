/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author harol
 */
public class FacturaConDescuento extends AbstractFactura{
    //atributos
    private double porcientoDescuentoSubtotal;
    
    //metodos constructores

    public FacturaConDescuento() {
    }

    public FacturaConDescuento(double porcientoDescuentoSubtotal, String codigoFac, double subTotal, double porcientoIVA) {
        super(codigoFac, subTotal, porcientoIVA);
        this.porcientoDescuentoSubtotal = porcientoDescuentoSubtotal;
    }
    
    //metodos getters and setters

    public double getPorcientoDescuentoSubtotal() {
        return porcientoDescuentoSubtotal;
    }

    public void setPorcientoDescuentoSubtotal(double porcientoDescuentoSubtotal) {
        this.porcientoDescuentoSubtotal = porcientoDescuentoSubtotal;
    }
    
    //metodos de comportamiento
    
    public double obtenerValorDescuentoSubtotal(){
        double valorDescuentoSubtotal = this.subTotal * this.porcientoDescuentoSubtotal / 100;
        
        return valorDescuentoSubtotal;
    }
    
    @Override
    public double obtenerValorIVA() {
        double subtotalDescontado = this.subTotal - this.obtenerValorDescuentoSubtotal();
        double valorIVA = subtotalDescontado * this.porcientoIVA / 100;
        
        return valorIVA;
    }
    
    @Override
    public double obtenerTotalFacturar() {
        double subtotalDescontado = this.subTotal - this.obtenerValorDescuentoSubtotal();
        double totalFactura = subtotalDescontado + this.obtenerValorIVA();
        
        return totalFactura;
    }   
    
    public String toString() {
        String estado = "Detalles de la factura con descuento: \n";
        estado += "\t Código: " + this.codigoFac + "\n";
        estado += "\t Valor Subtotal: $" + this.subTotal + "\n";
        estado += "\t Valor a descontar (" + this.porcientoDescuentoSubtotal + "%)del Subtotal: $" + this.obtenerValorDescuentoSubtotal() + "\n";
        estado += "\t Valor Subtotal descontado: $" + (this.subTotal - this.obtenerValorDescuentoSubtotal()) + "\n";
        estado += "\t Valor de IVA(" + this.porcientoIVA + "%): $" + this.obtenerValorIVA() + "\n";
        estado += "\t Valor Total: $" + this.obtenerTotalFacturar() + "\n";
        
        return estado;
    }
}
