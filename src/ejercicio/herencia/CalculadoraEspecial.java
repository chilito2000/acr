
package ejercicio.herencia;


public class CalculadoraEspecial  extends Calculadora {

    CalculadoraEspecial(String jose_veliz) {
        
    }
       public boolean esPrimo(int primerNumero){
        if(primerNumero < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(primerNumero); i++){
            if(primerNumero % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public double calcularArea(double base, double altura){
        return base * altura;
    }
    
    public double calcularPerimetro(double lado){
        return 4 * lado;
    }
    
    public double raizCubica(double numero){
        return Math.cbrt(numero);
    }
    
    public double potenciacion(double base, double exponente){
        return Math.pow(base, exponente);
    }
}



