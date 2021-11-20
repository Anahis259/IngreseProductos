/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual;

import tiendavirtual.servicios.ProductosServicios;

/**
 *
 * @author anahi
 */
public class TiendaVirtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductosServicios Obj = new ProductosServicios(); 
        Productos articulo = new Productos();
        Obj.menu(articulo);
    }
    
}
