
package ejercicio.herencia;


public class Calculadora {
        public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    //Constructor de la clase
    public Calculadora(String propietario){
        this.tipoCalculadora = "Calculadora Básica";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "Azul";
        this.nombrePropietario = propietario;
    }
    
    //Constructor vacío
    public Calculadora(){
    }
    
    //Métodos de la calculadora
    
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double primerNumero ){
        double resultado;
        resultado= Math.sqrt(primerNumero);
        return resultado;
        
    }
    
    }