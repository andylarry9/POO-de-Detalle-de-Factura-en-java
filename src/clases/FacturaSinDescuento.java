/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author harol
 */
public class FacturaSinDescuento extends AbstractFactura {
    //atributos los mismos que se heredan de la clase padre AbstractFactura
    
    //metodos constructores
    public FacturaSinDescuento() {
    }

    public FacturaSinDescuento(String codigoFac, double subTotal, double porcientoIVA) {
        super(codigoFac, subTotal, porcientoIVA);
    }
    
    //metodos getter and setter los mismos que se heredan de la clase padre AbstractFactura
    
    //metodos de comportamiento
    @Override
    public double obtenerValorIVA() {
        double valorIVA = this.subTotal * this.porcientoIVA / 100;
        return valorIVA;
    }
    
    @Override
    public double obtenerTotalFacturar() {
        double totalFactura = this.subTotal + this.obtenerValorIVA();
        return totalFactura;
    } 
    
    @Override
    public String toString() {
        String estado = "Detalles de la factura sin descuento: \n";
        estado += "\t Código: " + this.codigoFac + "\n";
        estado += "\t Valor Subtotal: $" + this.subTotal + "\n";
        estado += "\t Valor de IVA(" + this.porcientoIVA + "%): $" + this.obtenerValorIVA() + "\n";
        estado += "\t Valor Total: $" + this.obtenerTotalFacturar() + "\n";
        
        return estado;
    }
    
}
