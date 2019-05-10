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

        UsuarioDao usuarios = null;
         List<Usuarios> listaUsuarios = usuarios.getUsuarios();
       for(int k=0; k< listaUsuarios.size();k++){
           System.out.println("Nombre: "+listaUsuarios.get(k).getNombre());
           System.out.println("ID: "+listaUsuarios.get(k).getId());

       }
        
      }
    
    }
