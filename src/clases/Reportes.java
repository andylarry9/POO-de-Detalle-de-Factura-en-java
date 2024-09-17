/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
    1. Mostrar los detalles de todas las facturas ingresadas hasta el momento. 

    2. Mostrar cuántas facturas superan un total facturado, dado ese valor. 

    3. Mostrar cuántas facturas se ingresaron con descuento y cuántas sin descuento. 

    4. Mostrar el detalle de una factura dado su código. 
*/
package clases;

import java.util.ArrayList;

/**
 *
 * @author harol
 */
public class Reportes {
    
    public static String obtenerDetallesFacturas(ArrayList<AbstractFactura> p_listaFacturas) {
        String estadoTotasFacturas = "";
        for (AbstractFactura objFactura : p_listaFacturas) {//foreach
            String estadoFactura = objFactura.toString();
            estadoTotasFacturas += estadoFactura;
        }
        
        return estadoTotasFacturas;        
    }
    
    public static int obtenerCantFacturasSuperanMonto(ArrayList<AbstractFactura> p_listaFacturas, double p_montoTotalFacturado) {
        int contadorFacturas = 0;
        for (AbstractFactura objFactura : p_listaFacturas) {
            double totalFactura = objFactura.obtenerTotalFacturar();
            if (totalFactura > p_montoTotalFacturado)
                contadorFacturas++;            
        }
        
        return contadorFacturas;        
    }
    
    public static int obtenerCantFacturasSinDescuento(ArrayList<AbstractFactura> p_listaFacturas) {
        int contadorFactSinDescuento = 0;
        for (AbstractFactura objFactura : p_listaFacturas) {
            if (objFactura instanceof FacturaSinDescuento)
                contadorFactSinDescuento++;                       
        }
        
        return contadorFactSinDescuento;        
    }
    
    /*
    public static int obtenerCantFacturasConDescuento(ArrayList<AbstractFactura> p_listaFacturas) {
        
    }
    
    public static String obtenerDetalleFacturaConCodigo(ArrayList<AbstractFactura> p_listaFacturas, String p_codFactura) {
        
    }
    */
    
}
