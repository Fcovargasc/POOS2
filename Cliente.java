
package exp_s2_grupo25;


public  class Cliente implements Mensaje {
    

    private String rut,nombre,apellidoPaterno,apellidoMaterno,domicilio,comuna;
    private int telefono,cuenta,saldo;
    
  //constructor sin atributos  
public Cliente(){} 

//cosntructor con atributos

    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, int telefono, int cuenta, int saldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

//creando setters and getters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
   
    
    
    //creacion de metodos
    
    public void depositar(){
        System.out.println("¡Deposito realizado de manera exitosa! ");
        

    }
    public void girar (){
        System.out.println("¡Giro Realizado de manera exitosa!");
        
    }
    public void consultaSaldo(){
        System.out.println("Saldo Actual $ "+saldo);
    }
    
     @Override
    public void mensaje(){
        System.out.println("estamos juggfando con la terea");
    }
    
    public  void info(){
        
        System.out.println("Rut: "+getRut());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido Paterno: "+getApellidoPaterno());
        System.out.println("Apellido Materno: "+getApellidoMaterno());
        System.out.println("Domicilio: "+getDomicilio());
        System.out.println("Comuna: "+getComuna());
        System.out.println("Telefono: "+getTelefono());
        System.out.println("Numero de Cuenta Corriente: "+getCuenta());
        System.out.println("Saldo: "+getSaldo());
        
    }

}
