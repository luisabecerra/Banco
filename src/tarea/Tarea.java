package tarea;


public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha fecha=new Fecha(10,3,2017);
        Fecha fechaHoy=new Fecha(10,3,2017);
        CuentaAhorro Ahorro= new CuentaAhorro(fecha,0.12,1234,"Julia",20000);
        Ahorro.depositar(12000,fechaHoy); 
        Ahorro.retirar(40000,fechaHoy);
        Ahorro.consultar();
        System.out.println("________________");
        CuentaCheque Cheque=new CuentaCheque(1000,2345,"Roberto",30000);
        Cheque.depositar(30000);
        Cheque.retirar(100000);
        Cheque.consultar();
    }
    
}