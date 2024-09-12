package EJERCICIO_3;
public class Punto {
    //ATRIBUTOS
    private double x;
    private double y;
    // METODOS CONSTRUCTORES
    public Punto(){
    }
    public Punto(double valX, double valY ){
    x = valX;
    y = valY;
    }
    //METODOS SETTERS
    public void setX(double valX ){
        x = valX;
    }
    public void setY(double valY ){
        y = valY;
    }
    //METODOS GETTERS
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    //METODO PARA CALCULAR LA DISTANCIA ENTRE DOS PUNTOS
    public double distancia(Punto p){
        double dx, dy;
        dx=p.x - this.x;
        dy=p.y - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    //METODO PARA DAR FORMATO DE CADENA A LA SALIDA DEL OBJETO
    public String toString(){
        return "(" + Formato(x) + "," + Formato(y) + ")";
    }
    //METODO PARA DAR FORMATO A LAS COORDENADAS DE LOS PUNTOS - TANTO ENTEROS COMO DOUBLE
    public Object Formato(double x){
        if(x == (long) x){
            return (int) x;
        }
        return Double.parseDouble(String.format("%.2f",x));
    }
}