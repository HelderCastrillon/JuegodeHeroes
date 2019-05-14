package juegodeheroes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import juegodeheroes.dao.UsuarioDao;
import juegodeheroes.model.Usuarios;

/**
 *
 * @author Helder Castrillon
 */
public class juegodeheroes {
    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) throws SQLException{

        Scanner leer = new Scanner(System.in);    
        UsuarioDao usuarios = null;
         List<Usuarios> listaUsuarios = usuarios.getUsuarios();
        printList(listaUsuarios);
       
        System.out.println("Digite el nombre de la persona que desa buscar");
        String nombre=leer.next();
         listaUsuarios = usuarios.findUsuarios(nombre);
         printList(listaUsuarios);
      }
    
    public static void printList(List<Usuarios> listaUsuarios){
        for(int k=0; k< listaUsuarios.size();k++){
           System.out.println("Nombre: "+listaUsuarios.get(k).getNombre());
           System.out.println("ID: "+listaUsuarios.get(k).getId());

       }
    }
    
    }
