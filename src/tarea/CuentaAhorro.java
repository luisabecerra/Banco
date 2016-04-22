package tarea;


public class CuentaAhorro extends Cuenta {
   

    private  Fecha FechaDeVencimiento;
    private double InteresAnual;

    public CuentaAhorro(Fecha FechaDeVencimiento, double InteresAnual, int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.FechaDeVencimiento = FechaDeVencimiento;
        this.InteresAnual = InteresAnual;
    }
    
     public void depositar(double ing,Fecha hoy){
        double aux = 0;
        if(hoy.dia==1){
        aux=(saldo*(InteresAnual/12));
        }
        try {
            super.depositar(ing);
        } catch (ExceptionSaldo ex) {
                System.out.println(ex.getMessage());
        }
        saldo=saldo+aux;
        System.out.println("Deposito de interes : "+aux);
    }
    public void retirar (double sal,Fecha hoy) {
        if(((hoy.año == FechaDeVencimiento.año) && (hoy.dia == FechaDeVencimiento.dia))&&(hoy.mes==FechaDeVencimiento.mes)){
            try {
                
                super.retirar(sal);
            } catch (ExceptionSaldo ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            System.out.println("Aun no se puede retirar");
        }
    }
    
    
}