/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import tiendavirtual.Productos;

/**
 *
 * @author anahi
 */
public class ProductosServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> art = new HashMap();

    public void menu(Productos Obj) {
        int opcion;
        boolean recorrido = false;
        do {
            System.out.println("Bienvenido a tu tienda virtual");
            System.out.println("Te presento el siguiente MENU para que puedar armar el INVENTARIO:");
            System.out.println("----------------------OPCIONES---------------------");
            System.out.println("1. Crea un nuevo articulo DESCRIPCION y PRECIO.");
            System.out.println("2. Modifica la nombre y precio de un articulo.");
            System.out.println("3. Elimina un articulo.");
            System.out.println("4. Mostrar lista de articulos agregados y disponibles.");
            System.out.println("0. Salir del sistema. ");

            System.out.println("----> Ingrese la opcion a realizar: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    String resp;
                    do {

                        System.out.println("Ingrese el nombre del PRODUCTO a ingresar: ");
                        Obj.setArticulo(leer.next());
                        System.out.println("Ingrese el precio del PRODUCTO a ingresar: ");
                        Obj.setPrecio(leer.nextInt());
                        art.put(Obj.getArticulo(), Obj.getPrecio());
                        Obj = new Productos();
                        System.out.println("¿Desea ingresar otro PRODUCTO?(SI/NO)");
                        resp = leer.next();
                        for (Map.Entry<String, Integer> aux : art.entrySet()) {
                            String key = aux.getKey();
                            Integer value = aux.getValue();
                            System.out.println("Articulo: " + key + "------ precio: " + value);
                        }
                    } while ("si".equals(resp) || "SI".equals(resp));
                    break;

                case 2:
                    System.out.println("Ingrese el producto a modificar-------->:");
                    String mod = leer.next();
                    if (art.containsKey(mod)) {
                        System.out.println("Ingrese del producto: " + mod + " el precio a modificar a modificar:");
                        int modif = leer.nextInt();
                        art.put(mod, modif);
                        System.out.println("EL producto actualizado es: " + mod + " " + modif);
                    } else {
                        System.out.println("El articulo ingresado es incorrecto.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el ARTICULO a eliminar: ");
                    String prod = leer.next();
                    System.out.println("LISTA DE PRODUCTOS");
                    if (art.containsKey(prod)) {
                        art.remove(prod);
                    } else {
                        System.out.println("El articulo ingresado es incorrecto.");
                    }

                    break;

                case 4:
                    for (Map.Entry<String, Integer> aux : art.entrySet()) {
                        String key = aux.getKey();
                        Integer value = aux.getValue();
                        System.out.println("Articulo: " + key + "------ precio: " + value);
                    }
                    break;
                default:
                    System.out.println("Gracias por ser tan grande....");
            }
        } while (opcion != 0);
    }
}

//try { 
//catch (InputMismatchException e) {
//                System.out.println("Debes insertar un número");
//                leer.next();
//        
//        }
