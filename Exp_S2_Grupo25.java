
package exp_s2_grupo25;


import java.util.Scanner;


public class Exp_S2_Grupo25 {

   
    public static void main(String[] args) {
       
        Scanner scanner= new Scanner (System.in);
        
        int opcion;
        String rut="1111",nombre="fffffffff",apellidoPaterno="tt",apellidoMaterno="uu",domicilio="yuyuyuyu",comuna="rrr";
        int telefono=666,cuenta=420,saldo=69,deposito=0,giro=0;
        
        Cliente cliente =new Cliente(rut,nombre,apellidoPaterno,apellidoMaterno,domicilio,comuna,telefono,cuenta,saldo);
        Cuenta_Ahorro ca = new Cuenta_Ahorro(cuenta ,saldo,nombre,cliente);
        Cuenta_Credito credito=new Cuenta_Credito(cuenta ,saldo,nombre,cliente);
        credito.setSaldo(saldo);
        
        System.out.println("Bienvenidos A Bank Boston");
        do{
        System.out.println("Presione");
        System.out.println("1 Para Registrar Cliente");
        System.out.println("2 Para Ver datos del Cliente");
        System.out.println("3 Para Depositar");
        System.out.println("4 Para Girar");
        System.out.println("5 Para Consultar saldo");
        System.out.println("6 Para Salir");
        opcion=scanner.nextInt();
        
        
        //Cuenta_Credito cc = new Cuenta_Credito();
       // cc.setNombre(nombre);
       cliente.setRut(rut);
        cliente.setNombre(nombre);
        cliente.setApellidoPaterno(apellidoPaterno);
        cliente.setApellidoMaterno(apellidoMaterno);
        cliente.setDomicilio(domicilio);
        cliente.setComuna(comuna);
        cliente.setTelefono(telefono);
        cliente.setCuenta(cuenta);
        cliente.setSaldo(saldo);
        
        
            switch(opcion){
                case 1: 
                    saldo=0;
                    System.out.println("Registro de clientes");
                    do{
                    System.out.println("Ingrese su rut con punto y guion");
                    scanner.nextLine();
                    rut=scanner.nextLine();
                    }while(rut.length()>12||rut.length()<11);
                    System.out.println("Ingrese su Nombre");
                    nombre=scanner.nextLine();
                    System.out.println("Ingrese Apellido Paterno");
                    apellidoPaterno=scanner.nextLine();
                    System.out.println("Ingrese Apellido Materno");
                    apellidoMaterno=scanner.nextLine();
                    System.out.println("Ingrese Su Domicilio");
                    domicilio=scanner.nextLine();
                    System.out.println("Ingrese Comuna");
                    comuna=scanner.nextLine();
                    System.out.println("Ingrese Numero de Telefono");
                    telefono=scanner.nextInt();
                    
                    System.out.println("Ingrese Numero de Cuenta");
                    cuenta=scanner.nextInt();
                    
                    break;
                case 2:
                    System.out.println("Datos del CLiente");
                    cliente.info();
                    
                    break;
                case 3:
                    System.out.println("Deposito");
                    do{
                    System.out.println("Ingrese monto a depositar");
                     deposito=scanner.nextInt();
                    }while(deposito<=0);
                     saldo+=deposito;
                    cliente.depositar();
                    System.out.println("Ud tiene un saldo actual de: "+saldo);
                    break;
                case 4:
                    System.out.println("Giro");
                    do{
                    System.out.println("Ingrese monto a Girar");
                    giro=scanner.nextInt();
                    }while(giro>=saldo||giro<0);
                    saldo-=giro;
                    cliente.girar();
                    System.out.println("Ud tiene un saldo actual de: "+saldo);
                    break;
                case 5: 
                    System.out.println("Consulta saldo");
                    cliente.consultaSaldo();
                    ca.tipoCuenta();
                    credito.tipoCuenta();
                    break;
                case 6 :
                    System.out.println("Saliendo... Gracias por venir a Bank Boston");
            }       
        
        }while(opcion!=6);
    
        
   
        
        
    }
    
    
    
}
