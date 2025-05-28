
package exp_s2_grupo25;


public class Cuenta_Corriente extends Cuenta_Bancaria  implements Mensaje {

    public Cuenta_Corriente(int cuenta, int saldo, String nombre, Cliente cliente) {
        super(cuenta, saldo, nombre, cliente);
    }
    
    @Override
    public void tipoCuenta(){
        System.out.println("Cuenta Corriente");
    }
    
}
