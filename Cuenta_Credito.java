
package exp_s2_grupo25;
/*public class Cuenta_Ahorro  extends Cuenta_Bancaria implements Mensaje {

    public Cuenta_Ahorro(int cuenta, int saldo,String nombre, Cliente cliente) {
        super(cuenta, saldo,nombre, cliente);
    }
       
    @Override
    public void tipoCuenta(){
        System.out.println("cuenta ahorro");
        
    }
}*/

public class Cuenta_Credito extends Cuenta_Bancaria implements Mensaje {
    public Cuenta_Credito(int cuenta, int saldo,String nombre, Cliente cliente){
        super(cuenta,saldo,nombre,cliente);
    }
    @Override
    public void tipoCuenta(){
        System.out.println("Cuenta Credito");
        /*if (getSaldo()>=69) {
            setSaldo(getSaldo()+100);
            System.out.println("golosa "+getSaldo());
        }*/
    }
    
   /* public void info(){
        System.out.println("nombre "+getNombre());
    }*/
     
}
