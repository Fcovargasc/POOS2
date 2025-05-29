
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
    

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void girar(int giro){
        if (giro > 0 && saldo >= giro) {
            
            saldo -= giro;
            System.out.println("Saldo Girado exitosamente su saldo actual es:  ");
        }else {
            System.out.println("Operacion invalida");}
    }
    
    public void depositar(int deposito){
        if (deposito >0) {
            
            saldo+=deposito;
            System.out.println("Saldo depositado exitosamente Su saldo actual es: ");
            
        }else {
            System.out.println("Operacion invalida ");
        }
    }
    
    //metodo abstracto
    public abstract void tipoCuenta();
    
    
    
    
    
}
