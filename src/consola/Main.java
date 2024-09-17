/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consola;

import clases.AbstractFactura;
import clases.FacturaConDescuento;
import clases.FacturaSinDescuento;
import clases.Reportes;
import java.util.ArrayList;


/**
 *
 * @author harol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        FacturaSinDescuento objFacSinDesc = new FacturaSinDescuento("001-001-0000001", 100, 12);
        System.out.println(objFacSinDesc.toString());
        FacturaConDescuento objFacConDesc = new FacturaConDescuento(10,"001-001-0000002" , 100, 12);
        System.out.println(objFacConDesc.toString());
        //objFacConDesc.
        //Aplicacion del principio de LISKOV
        AbstractFactura objFactura1 = new FacturaSinDescuento("001-001-0000003", 200, 12);
        AbstractFactura objFactura2 = new FacturaConDescuento(10,"001-001-0000004" , 200, 12); 
        */
        
        ArrayList<AbstractFactura> listaFacturas = new ArrayList<>();
        listaFacturas.add(new FacturaSinDescuento("1", 100, 12));
        listaFacturas.add(new FacturaConDescuento(10, "2" , 100, 12));
        listaFacturas.add(new FacturaSinDescuento("3", 200, 12));
        listaFacturas.add(new FacturaConDescuento(10,"4", 200, 12));
        
        String estadoFacturas = Reportes.obtenerDetallesFacturas(listaFacturas);
        System.out.println("Detalles de todas las facturas ingresadas: ");
        System.out.println(estadoFacturas);
        
        int cantFacturasSinDescuento = Reportes.obtenerCantFacturasSinDescuento(listaFacturas);
        System.out.println("Total de facturas sin descuento registradas: " + cantFacturasSinDescuento);
        
        int cantFacturasSuperanMontoDado = Reportes.obtenerCantFacturasSuperanMonto(listaFacturas, 200);
        System.out.println("Total de facturas que superan el monto de los $100: " + cantFacturasSuperanMontoDado);
    }
    
}
