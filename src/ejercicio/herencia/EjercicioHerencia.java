
package ejercicio.herencia;
import java.util.Scanner;


public class EjercicioHerencia {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Calculadora calculadora = new Calculadora("jose veliz");
        CalculadoraEspecial CalculadoraEspecial = new CalculadoraEspecial("jose veliz");
        boolean salir = false;
        int opcion;

        do {
            System.out.println("");
            System.out.println("=======================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raiz Cuadrada");
            System.out.println("6. Verificar numero Primo");
            System.out.println("7. Area");
            System.out.println("8. Perimetro");
            System.out.println("9. Raiz Cubica");
            System.out.println("10. Potenciacion");
            System.out.println("11. Salir");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Selecciona una opcion");
            System.out.println("++++++++++++++++++++++++");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero:");
                    double num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num2 = sn.nextDouble();
                    System.out.println("El resultado de la suma es = " + calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero:");
                    num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sn.nextDouble();
                    System.out.println("El resultado de la resta es = " + calculadora.restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero:");
                    num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sn.nextDouble();
                    System.out.println("El resultado de la multiplicación es = " + calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero:");
                    num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sn.nextDouble();
                    System.out.println("El resultado de la división es = " + calculadora.dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Ingrese el numero:");
                    double numero = sn.nextDouble();
                    System.out.println("El resultado de la raiz cuadrada es = " + calculadora.raizCuadrada(numero));
                    break;
                case 6:
                    System.out.println("Ingrese el numero:");
                    int numeroPrimo = sn.nextInt();
                    System.out.println("¿Es primo? = " +   CalculadoraEspecial.esPrimo(numeroPrimo));
                    break;
                case 7:
                    System.out.println("Ingrese la base:");
                    double base = sn.nextDouble();
                    System.out.println("Ingrese la altura:");
                    double altura = sn.nextDouble();
                    System.out.println("El area es = " +  CalculadoraEspecial.calcularArea(base, altura));
                    break;
                case 8:
                    System.out.println("Ingrese el lado:");
                    double lado = sn.nextDouble();
                    System.out.println("El perimetro es = " +   CalculadoraEspecial.calcularPerimetro(lado));
                    break;
                case 9:
                    System.out.println("Ingrese el numero:");
                    double numeroCubico = sn.nextDouble();
                    System.out.println("El resultado de la raiz cubica es = " +   CalculadoraEspecial.raizCubica(numeroCubico));
                    break;
                case 10:
                    System.out.println("Ingrese la base:");
                    double basePotencia = sn.nextDouble();
                    System.out.println("Ingrese el exponente:");
                    double exponente = sn.nextDouble();
                    System.out.println("El resultado de la potenciacion es = " + CalculadoraEspecial.potenciacion(basePotencia, exponente));
                    break;
                case 11:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros entre 1 y 11");
            }
        } while (!salir);
    }
}
