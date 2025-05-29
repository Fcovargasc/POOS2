
package exp_s2_grupo25;


public class Cuenta_Ahorro  extends Cuenta_Bancaria implements Mensaje {

    public Cuenta_Ahorro(int cuenta, int saldo,String nombre, Cliente cliente) {
        super(cuenta, saldo,nombre, cliente);
    }
       
    @Override
    public void tipoCuenta(){
        System.out.println("cuenta ahorro ");
        System.out.println("1. Depositar");
        System.out.println("2. Girar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Volver");
    }
    public void girar(){
       
        System.out.println("para girar debe comunicarse  con su ejecutivo de cuenta para autorizar el giro");
    }
     
    
}
    