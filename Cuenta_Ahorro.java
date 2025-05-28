
package exp_s2_grupo25;


public class Cuenta_Ahorro  extends Cuenta_Bancaria implements Mensaje {

    public Cuenta_Ahorro(int cuenta, int saldo,String nombre, Cliente cliente) {
        super(cuenta, saldo,nombre, cliente);
    }
       
    @Override
    public void tipoCuenta(){
        System.out.println("cuenta ahorro");
        
    }
}
    