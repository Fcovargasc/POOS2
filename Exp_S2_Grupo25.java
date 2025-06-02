
package exp_s2_grupo25;
/*  
*/

import java.util.Scanner;
import Registro.RegistroCliente;
import java.util.ArrayList;

public class Exp_S2_Grupo25 {

   
    public static void main(String[] args) {
        
        
       
        Scanner scanner= new Scanner (System.in);
        
        int opcion,opcionOperacion;
        String rut="",nombre="",apellidoPaterno="",apellidoMaterno="",domicilio="",comuna="";
        int telefono=0,cuenta=0,saldo=0,deposito=0,giro=0;
        
         ArrayList<Cuenta_Corriente> cuentasCorrientes = new ArrayList<>();
         ArrayList<Cuenta_Ahorro> cuentasAhorro = new ArrayList<>();
         ArrayList<Cuenta_Credito> cuentasCredito = new ArrayList<>();
         RegistroCliente registro=new RegistroCliente();
         
         Cuenta_Corriente ccEncontrada = null;
         Cuenta_Ahorro caEncontrada = null;
         Cuenta_Credito creditoEncontrada = null;
        
        
        
        
        System.out.println("Bienvenidos A Bank Boston");
        do{
        System.out.println("Presione");
        System.out.println("1 Para Registrar Cliente");
        System.out.println("2 Para Ver datos del Cliente");
        System.out.println("3 Para elegir tipo de Cuenta");
        System.out.println("4 Para Consultar saldo");
        System.out.println("5 Para Salir");
        opcion=scanner.nextInt();
 
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
                    
                    Cliente cliente =new Cliente(rut,nombre,apellidoPaterno,apellidoMaterno,domicilio,comuna,telefono,cuenta);
                    Cuenta_Corriente cc = new Cuenta_Corriente(cuenta , saldo,nombre,cliente); 
                    Cuenta_Ahorro ca = new Cuenta_Ahorro(cuenta,saldo ,nombre,cliente);
                    Cuenta_Credito credito=new Cuenta_Credito(cuenta ,saldo,nombre,cliente);
                    cliente.setRut(rut);
                    cliente.setNombre(nombre);
                    cliente.setApellidoPaterno(apellidoPaterno);
                    cliente.setApellidoMaterno(apellidoMaterno);
                    cliente.setDomicilio(domicilio);
                    cliente.setComuna(comuna);
                    cliente.setTelefono(telefono);
                    cliente.setCuenta(cuenta);
                    registro.agregarClientes(cliente);
                    cuentasCorrientes.add(cc);
                    cuentasAhorro.add(ca);
                    cuentasCredito.add(credito);
                    break;
                case 2:
                    
                    if (cuenta==0) {
                        System.out.println("Debe crear un cliente primero");
                        break;
                    }
                    
                    registro.mostrarClientes();
                    System.out.println("total de cuentas: "+registro.totalCuentas());
                    break;
                case 3:
                    System.out.println("Cuentas Bancarias");
                    if (cuenta==0) {
                        System.out.println("Debe crear un cliente primero");
                        break;
                    }
                    System.out.println("Ingrese el número de cuenta:");
                    int numCuentaBuscar = scanner.nextInt();

                    for (Cuenta_Ahorro a : cuentasAhorro) {
                        if (a.getCuenta() == numCuentaBuscar) {
                            caEncontrada = a;
                            break;
                        }
                    }
                    for (Cuenta_Corriente c : cuentasCorrientes) {
                        if (c.getCuenta() == numCuentaBuscar) {
                            ccEncontrada = c;
                            break;
                        }
                    }
                    for (Cuenta_Credito cr : cuentasCredito) {
                        if (cr.getCuenta() == numCuentaBuscar) {
                            creditoEncontrada = cr;
                            break;
                        }
                    }

                    if (caEncontrada == null && ccEncontrada == null && creditoEncontrada == null) {
                        System.out.println("No existe ninguna cuenta con ese número.");
                        break;
                    }

                    int opcionCuentas=0;
                    Cuenta_Bancaria cuentaSeleccionada = null;
                    
        do {
                    System.out.println("Seleccione la cuenta:");
                    
                        System.out.println("1. Cuenta Ahorro");  
                        System.out.println("2. Cuenta Corriente");
                        System.out.println("3. Cuenta Crédito");
                        System.out.println("4. Salir");

                    opcionCuentas = scanner.nextInt();
                   cuentaSeleccionada=null;

                    switch(opcionCuentas) {
                        case 1: 
                            cuentaSeleccionada = caEncontrada;
                            break;
                        case 2:
                            cuentaSeleccionada = ccEncontrada;
                            break;
                        case 3: 
                            cuentaSeleccionada = creditoEncontrada;
                            break;
                        case 4: 
                            System.out.println("Saliendo..."); 
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }

            if (cuentaSeleccionada != null) {

                    do {
            
                        
                        if (opcionCuentas==1) {
                                caEncontrada.tipoCuenta();
                          }else if (opcionCuentas==2) {
                                ccEncontrada.tipoCuenta();
                          }else if (opcionCuentas==3) {
                                creditoEncontrada.tipoCuenta();
                        }
                        opcionOperacion = scanner.nextInt();
                        
                        switch(opcionOperacion) {
                            case 1:
                                System.out.println("Ingrese monto a depositar: ");
                                deposito = scanner.nextInt();
                                cuentaSeleccionada.depositar(deposito);
                                System.out.println("Nuevo saldo: " + cuentaSeleccionada.getSaldo());
                                break;
                            case 2:
                                if (opcionCuentas==1) {
                                    caEncontrada.girar();
                                    break;
                                    
                                }
                                System.out.println("Monto a girar: ");
                                giro = scanner.nextInt();
                                cuentaSeleccionada.girar(giro);
                                System.out.println("Nuevo saldo: " + cuentaSeleccionada.getSaldo());
                                break;
                            case 3:
                                System.out.println("Saldo actual: " + cuentaSeleccionada.getSaldo());
                                break;
                            case 4:
                                System.out.println("Volviendo al menú de selección de cuenta...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while(opcionOperacion != 4);
                }
            } while(opcionCuentas != 4);
                     break;           
               
                case 4: 
                    System.out.println("Consulta saldo");
                    
                    if (cuenta==0) {
                        System.out.println("Debe crear un cliente primero");
                        break;
                    }
                     System.out.println("Ingrese numero de cuenta");
                    int numCuenta =scanner.nextInt();
                   
                    for (Cuenta_Corriente c : cuentasCorrientes) {
                        if (c.getCuenta()==numCuenta) {
                            ccEncontrada=c;
                        }
                    }
                    for (Cuenta_Ahorro a : cuentasAhorro) {
                        if (a.getCuenta()==numCuenta) {
                            caEncontrada=a;
                            break;
                        }
                    }
                    for (Cuenta_Credito cr : cuentasCredito) {
                        if (cr.getCuenta() == numCuenta) {
                            creditoEncontrada = cr;
                            break;
                         }
                    }
                    
                    if (ccEncontrada == null && caEncontrada == null && creditoEncontrada == null) {
                        System.out.println("No existe ninguna cuenta con ese número.");
                       
                        break;
                     }
                    
                    if (caEncontrada != null)
                        System.out.println("Saldo Cuenta Ahorro: " + caEncontrada.getSaldo());
                    
                    if (ccEncontrada != null)
                        System.out.println("Saldo Cuenta Corriente: " + ccEncontrada.getSaldo());
                    
                    if (creditoEncontrada != null)
                        System.out.println("Saldo Cuenta Crédito: " + creditoEncontrada.getSaldo());
                    

                   int saldoTotal = 0;
                   if (caEncontrada != null)
                       saldoTotal += caEncontrada.getSaldo();
                   
                   if (ccEncontrada != null) 
                       saldoTotal += ccEncontrada.getSaldo();
                   
                    if (creditoEncontrada != null)
                        saldoTotal += creditoEncontrada.getSaldo();

                       System.out.println("Saldo total es: " + saldoTotal);

                    break;
                case 5 :
                    System.out.println("Saliendo... Gracias por venir a Bank Boston");
            }       
        
        }while(opcion!=5);
    
        
   
        
        
    }
    
    
    
}
