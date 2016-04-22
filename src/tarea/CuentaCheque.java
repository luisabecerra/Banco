package tarea;


public class CuentaCheque extends Cuenta {
    private double comision;
    

    public CuentaCheque(double comision, int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    @Override
    public void depositar(double ing){
        try {
            super.depositar(ing);
        } catch (ExceptionSaldo ex) {
           System.out.println(ex.getMessage());
        }
    }
    @Override
    public void retirar(double sal){
        try {
            super.retirar( sal);
            saldo=saldo-comision;
        } catch (ExceptionSaldo ex) {
            System.out.print(ex.getMessage());
            System.out.println("/Se le cobrara comision");
            saldo=saldo-comision;
        }
    }
    
}