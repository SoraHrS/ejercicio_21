import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double lado1, lado2, lado3, perimetro, semiperimetro, area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ingrese el valor del lado 1 del triangulo: ");
        lado1 = sc.nextDouble();
        System.out.println("Ingrese el valor del lado 2 del triangulo: ");
        lado2 = sc.nextDouble();
        System.out.println("Ingrese el valor del lado 3 del triangulo: ");
        lado3 = sc.nextDouble();
        perimetro = lado1 + lado2 + lado3;
        semiperimetro = perimetro / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro-lado1) * (semiperimetro-lado2) * (semiperimetro-lado3));
        System.out.println("El perimetro del triangulo es: " + perimetro);
        System.out.println("El semiperimetro del triangulo es: " + semiperimetro);
        System.out.println("El area del triangulo es: " + area);
    }
}