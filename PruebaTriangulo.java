package EJERCICIO_3;
import java.util.Scanner;
public class PruebaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3;
        
        // PRUEBA DE ESCRITORIO 1
        // Instanciación de tres objetos de la clase Punto
        Punto a1 = new Punto(0,0);
        Punto a2 = new Punto(5,1);
        Punto a3 = new Punto(2,4);
       
        // Instanciación del objeto triangulo de la clase Triangulo
        Triangulo triangulo1 = new Triangulo(a1,a2,a3);
        System.out.println("\nPRUEBA DE ESCRITORIO 1:\n"+triangulo1);
        
        // Mostrar la existencia, el área, el perímetro y el tipo de Triángulo
        System.out.println("Existencia del triangulo: el triangulo - " + triangulo1.Existencia());
        System.out.printf("Area (aprox) del triangulo: %.2f%n" , triangulo1.Area());
        System.out.printf("Perimetro (aprox) del triangulo: %.2f%n" , triangulo1.Perimetro());
        System.out.println("El tipo de triangulo es: " + triangulo1.Tipo());


        // PRUEBA DE ESCRITORIO 2
        // Instanciación de tres objetos de la clase Punto
        Punto b1 = new Punto(); // Llama al constructor por defecto (0,0)
        Punto b2 = new Punto(4,0);
        Punto b3 = new Punto(2,3);
       
        // Instanciación del objeto triangulo de la clase Triangulo
        Triangulo triangulo2 = new Triangulo(b1,b2,b3);
        System.out.println("\nPRUEBA DE ESCRITORIO 2:\n"+triangulo2);
        
        // Mostrar la existencia, el área, el perímetro y el tipo de Triángulo
        System.out.println("Existencia del triangulo: " + triangulo2.Existencia());
        System.out.printf("Area (aprox) del triangulo: %.2f%n" , triangulo2.Area());
        System.out.printf("Perimetro (aprox) del triangulo: %.2f%n" , triangulo2.Perimetro());
        System.out.println("El tipo de triangulo es: " + triangulo2.Tipo());


        // PRUEBA DE ESCRITORIO 3
        // Instanciación de tres objetos de la clase Punto
        Punto c1 = new Punto(); // Llama al constructor por defecto (0,0)
        Punto c2 = new Punto(2,0);
        /* Nota: Para que haya un triangulo equilatero es necesario:
        una coordenada irracional */ 
        Punto c3 = new Punto(1,Math.sqrt(3));
       
        // Instanciación del objeto triangulo de la clase Triangulo
        Triangulo triangulo3 = new Triangulo(c1,c2,c3);
        System.out.println("\nPRUEBA DE ESCRITORIO 3:\n"+triangulo3);
        
        // Mostrar la existencia, el área, el perímetro y el tipo de Triángulo
        System.out.println("Existencia del triangulo: " + triangulo3.Existencia());
        System.out.printf("Area (aprox) del triangulo: %.2f%n" , triangulo3.Area());
        System.out.printf("Perimetro (aprox) del triangulo: %.2f%n" , triangulo3.Perimetro());
        System.out.println("El tipo de triangulo es: " + triangulo3.Tipo());


        // PRUEBA DE ESCRITORIO 4
        // Instanciación de tres objetos de la clase Punto
        Punto d1 = new Punto(2,3);
        Punto d2 = new Punto(5,6);
        Punto d3 = new Punto(8,9);
       
        // Instanciación del objeto triangulo de la clase Triangulo
        Triangulo triangulo4 = new Triangulo(d1,d2,d3);
        System.out.println("\nPRUEBA DE ESCRITORIO 4:\n"+triangulo4);
        
        // Mostrar la existencia, el área, el perímetro y el tipo de Triángulo
        System.out.println("Existencia del triangulo: " + triangulo4.Existencia());
        System.out.printf("Area (aprox) del triangulo: %.2f%n" , triangulo4.Area());
        System.out.printf("Perimetro (aprox) del triangulo: %.2f%n" , triangulo4.Perimetro());
        System.out.println("El tipo de triangulo es: " + triangulo4.Tipo());


        // PRUEBA DE ESCRITORIO 5
        System.out.println("\nPRUEBA DE ESCRITORIO 5:");
        // Ingresamos las coordenadas del primer punto (x1,y1)
        System.out.println("Primer punto (x1,y1):");
        System.out.print("x1: "); x1 = entrada.nextDouble();
        System.out.print("y1: "); y1 = entrada.nextDouble();
        // Ingresamos las coordenadas del primer punto (x1,y1)
        System.out.println("Segundo punto (x2,y2):");
        System.out.print("x2: "); x2 = entrada.nextDouble();
        System.out.print("y2: "); y2 = entrada.nextDouble();
        // Ingresamos las coordenadas del primer punto (x1,y1)
        System.out.println("Tercer punto (x3,y3):");
        System.out.print("x3: "); x3 = entrada.nextDouble();
        System.out.print("y3: "); y3 = entrada.nextDouble();

        // Instanciación de tres objetos de la clase Punto
        Punto e1 = new Punto(x1,y1);
        Punto e2 = new Punto(x2,y2);
        Punto e3 = new Punto(x3,y3);
       
        // Instanciación del objeto triangulo de la clase Triangulo
        Triangulo triangulo5 = new Triangulo(e1,e2,e3);
        System.out.println("\n"+triangulo5);
        
        // Mostrar la existencia, el área, el perímetro y el tipo de Triángulo
        System.out.println("Existencia del triangulo: " + triangulo5.Existencia());
        System.out.printf("Area (aprox) del triangulo: %.2f%n" , triangulo5.Area());
        System.out.printf("Perimetro (aprox) del triangulo: %.2f%n" , triangulo5.Perimetro());
        System.out.println("El tipo de triangulo es: " + triangulo5.Tipo());

        entrada.close(); 
    }
}