
package exp_s2_grupo25;
/* dar mensajes en las distintas opciones 
si un usuario no esta 
creado diciendo que priemro se debe 
crear usuario para efectuar las operaciones
*/

import java.util.Scanner;


public class Exp_S2_Grupo25 {

   
    public static void main(String[] args) {
       
        Scanner scanner= new Scanner (System.in);
        
        int opcion,opcionCuenta;
        String rut="",nombre="",apellidoPaterno="",apellidoMaterno="",domicilio="",comuna="";
        int telefono=0,cuenta=0,saldo=0,deposito=0,giro=0;
        
        Cliente cliente =new Cliente(rut,nombre,apellidoPaterno,apellidoMaterno,domicilio,comuna,telefono,cuenta);
        Cuenta_Corriente cc = new Cuenta_Corriente(cuenta , saldo,nombre,cliente); 
        Cuenta_Ahorro ca = new Cuenta_Ahorro(cuenta,saldo ,nombre,cliente);
        Cuenta_Credito credito=new Cuenta_Credito(cuenta ,saldo,nombre,cliente);
        
        
        
        
        
        System.out.println("Bienvenidos A Bank Boston");
        do{
        System.out.println("Presione");
        System.out.println("1 Para Registrar Cliente");
        System.out.println("2 Para Ver datos del Cliente");
        System.out.println("3 Para elegir tipo de Cuenta");
        System.out.println("4 Para Consultar saldo");
        System.out.println("5 Para Salir");
        opcion=scanner.nextInt();
        
        
       
       cliente.setRut(rut);
        cliente.setNombre(nombre);
        cliente.setApellidoPaterno(apellidoPaterno);
        cliente.setApellidoMaterno(apellidoMaterno);
        cliente.setDomicilio(domicilio);
        cliente.setComuna(comuna);
        cliente.setTelefono(telefono);
        cliente.setCuenta(cuenta);
        
        
        
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
                    do{
                    System.out.println("Ingrese Numero de Cuenta de 9 digitos");
                    cuenta=scanner.nextInt();
                    }while(cuenta < 100000000|| cuenta >999999999);
                    break;
                case 2:
                    System.out.println("Datos del Cliente");
                    if (cuenta==0) {
                        System.out.println("Debe crear un cliente primero");
                        break;
                    }
                    cliente.info();
                    
                    break;
                case 3:
                    System.out.println("Cuentas Bancarias");
                    if (cuenta==0) {
                        System.out.println("Debe crear un cliente primero");
                        break;
                    }
        do {
                    System.out.println("Seleccione la cuenta:");
                    System.out.println("1. Cuenta Ahorro");
                    System.out.println("2. Cuenta Corriente");
                    System.out.println("3. Cuenta Crédito");
                    System.out.println("4. Salir");
                    opcionCuenta = scanner.nextInt();

                Cuenta_Bancaria cuentaSeleccionada = null;

            switch(opcionCuenta) {
              case 1:
                     cuentaSeleccionada = ca;
                break;
              case 2:
                     cuentaSeleccionada = cc;
                break;
              case 3:
                     cuentaSeleccionada = credito;
                break;
              case 4:
                      System.out.println("Saliendo...");
                break;
             default:
                     System.out.println("Opción no válida.");
    }   

                 if (cuentaSeleccionada != null) {
                       int opcionOperacion;
        do {
               if (opcionCuenta==1) {
                    ca.tipoCuenta();
              }else if (opcionCuenta==2) {
                    cc.tipoCuenta();
              }else if (opcionCuenta==3) {
                    credito.tipoCuenta();
            }
            
            opcionOperacion = scanner.nextInt();

            switch(opcionOperacion) {
                case 1:
                    
                    System.out.println("Ingrese monto a depositar: ");
                    deposito = scanner.nextInt();
                    cuentaSeleccionada.depositar(deposito);
                    break;
                case 2:
                    if (opcionCuenta==1) {
                        ca.girar();
                        break;
                    }
                    System.out.println("Ingrese monto a girar: ");
                    giro = scanner.nextInt();
                    cuentaSeleccionada.girar(giro);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuentaSeleccionada.getSaldo());
                    break;
                case 4:
                    System.out.println("Volviendo al menú de cuentas...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
    }   while(opcionOperacion != 4);
    }

}        while(opcionCuenta != 4);
                    break;
                
                case 4: 
                    System.out.println("Consulta saldo");
                    if (cuenta==0) {
                        System.out.println("Debe crear un cliente primero");
                        break;
                    }
                    System.out.println("Saldo Cuenta Ahorro: " + ca.getSaldo());
                    System.out.println("Saldo Cuenta Corriente: " + cc.getSaldo());
                    System.out.println("Saldo Cuenta Crédito: " + credito.getSaldo());
                    int saldoTotal = ca.getSaldo()+cc.getSaldo()+credito.getSaldo();
                    System.out.println("Saldo total es: "+saldoTotal);
                    break;
                case 5 :
                    System.out.println("Saliendo... Gracias por venir a Bank Boston");
            }       
        
        }while(opcion!=5);
    
        
   
        
        
    }
    
    
    
}
