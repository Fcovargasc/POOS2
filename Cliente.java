
package exp_s2_grupo25;


public  class Cliente implements Mensaje {
    

    private String rut,nombre,apellidoPaterno,apellidoMaterno,domicilio,comuna;
    private int telefono,cuenta;
    
   
public Cliente(){} 



    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, int telefono, int cuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuenta = cuenta;
        
    }


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

    
   
    
    
    
    
    @Override
    public void girar(){}
    
    
    @Override
    public  void info(){
        
        System.out.println("Rut: "+getRut());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido Paterno: "+getApellidoPaterno());
        System.out.println("Apellido Materno: "+getApellidoMaterno());
        System.out.println("Domicilio: "+getDomicilio());
        System.out.println("Comuna: "+getComuna());
        System.out.println("Telefono: "+getTelefono());
        System.out.println("Numero de Cuenta Corriente: "+getCuenta());
        System.out.println("");
        
        
        
    }

}
