
package exp_s2_grupo25;
//clase abstracta
public abstract class Cuenta_Bancaria extends Cliente {
    //4 atributos
    protected int cuenta,saldo;
    protected String nombre;
    protected Cliente cliente;
//constructor
    public Cuenta_Bancaria(int cuenta, int saldo,String nombre, Cliente cliente){
        this.cuenta=cuenta;
        this.saldo=saldo;
        this.nombre=nombre;
        this.cliente=cliente;
    }
    //metodo abstracto
    public abstract void tipoCuenta();
    
    
    
    
    
}
