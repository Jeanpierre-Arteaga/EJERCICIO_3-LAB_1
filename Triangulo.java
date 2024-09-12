package EJERCICIO_3;
public class Triangulo {
    // ATRIBUTOS
    // Representado por tres puntos de la clase Punto
    private Punto p1, p2, p3; 
    
    // METODOS CONSTRUCTORES
    public Triangulo(){
    }
    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    // METODOS SETTERS
    public void setP1(Punto p1){
        this.p1 = p1;
    }
    public void setP2(Punto p2){
        this.p2 = p2;
    }
    public void setP3(Punto p3){
        this.p3 = p3;
    }
    
    // METODOS GETTERS
    public Punto getP1(){
        return p1;
    }
    public Punto getP2(){
        return p2;
    }
    public Punto getP3(){
        return p3;
    }
    
    // METODO PARA CALCULAR LA LONGITUD DE LOS LADOS DEL TRIANGULO
    // Nota: se esta utilizando el metodo distancia de la clase Punto
    public double[] Lados(){
        // COLOCAMOS LOS 3 LADOS EN UN ARRAY PARA RETORNARLOS JUNTOS Y UTILIZARLOS EN SIGUIENTES MÉTODOS
        return new double[]{p1.distancia(p2), p2.distancia(p3), p3.distancia(p1)};
    }

    // METODO PARA VERIFICAR LA EXISTENCIA DEL TRIANGULO
    public String Existencia() {
        // SE DEFINEN LOS LADOS DEL TRIANGULO Y LUEGO SE REALIZA LA DESIGUALDAD TRIANGULAR
        double lado1=Lados()[0], lado2=Lados()[1], lado3=Lados()[2];
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
            return "Existe";
        }
        return "No existe";
    }

    // METODO PARA CALCULAR EL AREA DEL TRIANGULO
    public double Area(){
        // UTILIZAMOS LA FORMULA DEL AREA UTILIZANDO LAS COORDENADAS DEL TRIANGULO
        // FORMA PARTICULAR DEL DETERMINANTE DE UNA MATRIZ DE COORDENADAS DEL TRIANGULO
        return Math.abs(0.5 * (p1.getX() * (p2.getY() - p3.getY()) +
                               p2.getX() * (p3.getY() - p1.getY()) +
                               p3.getX() * (p1.getY() - p2.getY())));
    }
    
    // METODO PARA CALCULAR EL PERIMETRO DEL TRIANGULO
    // Nota: se esta utilizando el metodo distancia de la clase Punto
    public double Perimetro() {
        // PRIMERO SE VERIFICA LA EXISTENCIA DEL TRIANGULO
        if(Existencia().equals("Existe")){
            // SE DEFINEN LOS LADOS DEL TRIANGULO Y LUEGO SE REALIZA LA SUMA
            double lado1=Lados()[0], lado2=Lados()[1], lado3=Lados()[2];
            return lado1 + lado2 + lado3;
        }
        return 0;
    }
    
    // METODO PARA DETERMINAR EL TIPO DE TRIANGULO
    public String Tipo() {
        // PRIMERO SE VERIFICA LA EXISTENCIA DEL TRIANGULO
        if(Existencia().equals("Existe")){
            // SE DEFINEN LOS LADOS DEL TRIANGULO
            double lado1=Redondeo(Lados()[0]), lado2=Redondeo(Lados()[1]), lado3=Redondeo(Lados()[2]);
            // LUEGO SE REALIZAN COMPARACIONES CON LOS LADOS PARA IDENTIFICAR EL TIPO
            if (lado1 == lado2 && lado2 == lado3) {
                return "Equilátero";
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        }
        return "El triángulo no existe, por ende no tiene tipo.";
    }

    //METODO PARA DAR FORMATO DE CADENA A LA SALIDA UN OBJETO CREADO DE LA CLASE TRIANGULO
    public String toString() {
        return "El triángulo está formado por " + p1 + ", " + p2 + ", " + p3 +
                "\nSus lados (aprox) son: " + Redondeo(Lados()[0]) + ", " + Redondeo(Lados()[1]) + ", " + Redondeo(Lados()[2]);
    }
    
    // METODO PARA HACER EL REDONDEO DE LOS LADOS (PARA EVITAR PROBLEMAS CON EL TIPO EQUILATERO)
    public double Redondeo(double x){
        return Double.parseDouble(String.format("%.2f",x));
    }
}