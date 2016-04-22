package tarea;


public class Cuenta {
    private int numero;
    private String nombre;
    double saldo;

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void consultar (){
        System.out.println("El saldo de la cuenta "+numero+" es:"+saldo);
    }
    public void depositar (double ing) throws ExceptionSaldo{
        System.out.println("Depositando"+ing);
        if(ing<0){
            throw new ExceptionSaldo("Solo se aceptan valores positivos");
        }else{
        saldo=saldo+ing;
        }
    }
    public void retirar (double sal) throws ExceptionSaldo{
        System.out.println("Retirando"+sal);
        
        if(saldo-sal<0){
            throw new ExceptionSaldo("El saldo es insuficiente");
                    }else{
            
            saldo=saldo-sal;
        }
    }
}