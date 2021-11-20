/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual;

/**
 *
 * @author anahi
 */
public class Productos {
    private String articulo; 
    private Integer precio; 
    
    public Productos(){
        
    }

    public Productos(String articulo, Integer precio) {
        this.articulo = articulo;
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Productos{" + "articulo=" + articulo + ", precio=" + precio + '}';
    }
    
}
