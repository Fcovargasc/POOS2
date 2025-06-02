
package Registro;

import exp_s2_grupo25.Cliente;

import java.util.ArrayList;



public class RegistroCliente {
    private ArrayList<Cliente>lista = new ArrayList<>();
    
    public void agregarClientes(Cliente cliente){
            lista.add(cliente);
    }
    
    public void mostrarClientes(){
        for (Cliente cliente : lista) {
         System.out.println("Datos del Cliente");
            cliente.info();
      
        }     
    }
    
    public int totalCuentas(){
         return lista.size();
        }
   
    
}
