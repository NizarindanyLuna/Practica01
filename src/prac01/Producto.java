
package prac01;

public class Producto {
    private String codigo,descripcion, uMedida;
    private float precioCompra, precioVenta,cProducto;

    public Producto(){
        
    }
    
    public Producto(String a,String b,String c,float d,float e,float f){
        codigo=a;
        descripcion=b;
        uMedida=c;
        precioCompra=d;
        precioVenta=e;
        cProducto=f;
    }
    
    public Producto(Producto Prod){
    }
    
    public void setDescripcion(String b){
        descripcion=b;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setCodigo(String a){
        codigo=a;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setUMedida(String c){
        uMedida=c;
    }
    
    public String getUMedida(){
        return uMedida;
    }
    
    public void setPrecioCompra(float d){
        precioCompra=d;
        
    }
    
    public float getPrecioCompra(){
        return precioCompra;
    }
    
    public void setPrecioVenta(float e){
        precioVenta=e;
        
    }
    
    public float getPrecioVenta(){
        return precioVenta;
    }
    
    public void setCProducto(float f){
        cProducto=f;
    }
    
    public float getCProducto(){
        return cProducto;
    }
    
    public float CalcularVenta(){
        return getPrecioVenta()*getCProducto();
    }
    public float CalcularCompra(){
        return getPrecioCompra()*getCProducto();
    }
    public float CalcularGanancia(){
        return CalcularVenta()-CalcularCompra();
    }
    
    public void getMostrarPro(){
        System.out.println("--------------Lista de Productos--------------");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Unidad de medida: "+getUMedida());
        System.out.println("Precio de Compra: "+getPrecioCompra());
        System.out.println("Precio de Venta: "+getPrecioVenta());
        System.out.println("Cantidad: "+getCProducto());
        System.out.println("Calcular venta: "+CalcularVenta());
        System.out.println("Calcular compra: "+CalcularCompra());
        System.out.println("Calcular ganancia: "+CalcularGanancia());
        System.out.println("\n\n");
    }
}