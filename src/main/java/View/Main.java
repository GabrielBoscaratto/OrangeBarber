/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.servicos;
import Model.usuario;

/**
 *
 * @author bieeo
 */
public class Main {
    
    
    
    public static void main (String[] args){
    
    String nome = "tiago";
    System.out.println(nome);
    
    servicos barba = new servicos(1, "barba", 30);
   
   System.out.println(barba.getDescrição());
   System.out.println(barba.getValor());
   
   Cliente cliente = new Cliente(1, "tiago", 'M', "11999999", "rua dos bobos");
    System.out.println(cliente);
    
    usuario Usuario =  new usuario(1, "barbeiro", "senha");
    System.out.println(Usuario);
    
    } 
    
 
}
