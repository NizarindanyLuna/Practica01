
package prac01;

import java.util.Scanner;


public class Prac01 {
    
    public static void main(String[] args) {
        
        Scanner Obj =new Scanner(System.in);
        Producto Pro =new Producto();
        Producto Pronew =new Producto("1203","Atun de Agua","piezas",10,15,100);
        
        System.out.println("Codigo: ");
        Pro.setCodigo(Obj.nextLine());
        System.out.println("Descripcion: ");
        Pro.setDescripcion(Obj.nextLine());
        System.out.println("Unidad de medida: ");
        Pro.setUMedida(Obj.nextLine());
        System.out.println("Precio compra: ");
        Pro.setPrecioCompra(Obj.nextFloat());
        System.out.println("Precio venta: ");
        Pro.setPrecioVenta(Obj.nextFloat());
        System.out.println("Cantidad: ");
        Pro.setCProducto(Obj.nextFloat());
        
        Pro.getMostrarPro();
        //---------Mostrando con el producto guardado de ejemplo-----------
        Pronew.getMostrarPro();
      }
}
