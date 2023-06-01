
package ejercicio.herencia;


public class CalculadoraEspecial  extends EjercicioHerencia {

    CalculadoraEspecial(String jose_veliz) {
        
    }
       public boolean esPrimo(int numeroBuscado){
        if(numeroBuscado < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(numeroBuscado); i++){
            if(numeroBuscado % i == 0){
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



