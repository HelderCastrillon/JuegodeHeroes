/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeheroes.ConsoleView;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import juegodeheroes.dao.UsuarioDao;
import juegodeheroes.model.Usuarios;

/**
 *
 * @author hcastrillon
 */
public class consoleMode {
    
   
    public static void inicarJuego() throws SQLException{

        Scanner leer = new Scanner(System.in);   
        List<Usuarios> listaUsuariosFound;
        List<Usuarios> listaUsuarios = UsuarioDao.getUsuarios();
         
        System.out.println("Bienvenido al Juego, Digite una opción");
        System.out.println("1. Ver Listado de usuarios");
        System.out.println("2. Buscar usuario");
        System.out.println("3 Salir");
        int option=leer.nextInt();
         
        switch(option){
            case 1:
                printList(listaUsuarios);
            case 2:
                 System.out.println("Digite el nombre de la persona que desa buscar");
                 String nombre=leer.next();
                 
                listaUsuariosFound = findUser(listaUsuarios, nombre);
                printList(listaUsuariosFound);
            case 3: 
                System.out.println("Nos vemos en el próximo juego");
                 
        }        
      }
    
    public static List<Usuarios> findUser(List<Usuarios> listaUsuarios, String nombre) throws SQLException{
       
        
         return UsuarioDao.findUsuarios(nombre);
   
    }
    public static void printList(List<Usuarios> listaUsuarios){
        for(int k=0; k< listaUsuarios.size();k++){
           System.out.println("Nombre: "+listaUsuarios.get(k).getNombre());
           System.out.println("ID: "+listaUsuarios.get(k).getId());

       }
    }
}
