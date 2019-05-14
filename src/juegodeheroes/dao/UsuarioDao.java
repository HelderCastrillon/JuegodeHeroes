/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeheroes.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import juegodeheroes.connect.pgConnect;
import juegodeheroes.model.Usuarios;

/**
 *
 * @author hcastrillon
 */
public class UsuarioDao {
    
         public static List<Usuarios> getUsuarios() throws SQLException{
                   List<Usuarios> listaUsuarios = new ArrayList();
                // TODO code application logic here

              try {
                  pgConnect connectPG = new pgConnect();
                  Connection conex=connectPG.settingConnect();
                  java.sql.Statement st = conex.createStatement();  
  
                  String sql ="SELECT id,nombre FROM usuarios";
                  ResultSet result = st.executeQuery(sql);
                  
                  while(result.next()) {
                      String nombre = result.getString("nombre");
                      int id = result.getInt("id");                      
                      
                       Usuarios miusuario = new Usuarios(id,nombre);
                       listaUsuarios.add(miusuario);
                  }
                  result.close();
                  st.close();
                  conex.close();
              } catch(ClassNotFoundException | SQLException exc) {
                  System.out.println("Error: "+exc.getMessage());
                  Usuarios usuario = new Usuarios(0,"Error no se pudo hacer la consulta SQL");
                   listaUsuarios.add(usuario);
              }

        return listaUsuarios;
         
         }
         
              public static void setUsuarios(Usuarios usuario){
                // TODO code application logic here

              try {
                  pgConnect connectPG = new pgConnect();
                  Connection conex=connectPG.settingConnect();
                  java.sql.Statement st = conex.createStatement();  
                  
                  //ojo con el tipo de datos
                  //idestudiante es entero
                  //nombre es String
                  //nota es entero7
                  //"INSERT INTO estudiantes (idestudiante, nombre, nota) VALUES (10,'Helder',3)"
                  String sql ="INSERT INTO usuarios(id, nombre) VALUES ("+usuario.getId()+", '"+usuario.getNombre()+"')";
                  System.out.println(sql);
                  st.executeUpdate(sql);
                  st.close();
                  conex.close();
              } catch(ClassNotFoundException | SQLException exc) {
                  System.out.println("Error: "+exc.getMessage());
              }

}
                public static List<Usuarios> findUsuarios(String nombreFind) throws SQLException{
                   List<Usuarios> listaUsuarios = new ArrayList();
                // TODO code application logic here

              try {
                  pgConnect connectPG = new pgConnect();
                  Connection conex=connectPG.settingConnect();
                  java.sql.Statement st = conex.createStatement();  
  
                  String sql ="SELECT id,nombre FROM usuarios WHERE nombre like '%"+nombreFind+"%'";
                  ResultSet result = st.executeQuery(sql);
                  
                  while(result.next()) {
                      String nombre = result.getString("nombre");
                      int id = result.getInt("id");                      
                      
                       Usuarios miusuario = new Usuarios(id,nombre);
                       listaUsuarios.add(miusuario);
                  }
                  result.close();
                  st.close();
                  conex.close();
              } catch(ClassNotFoundException | SQLException exc) {
                  System.out.println("Error: "+exc.getMessage());
                  Usuarios usuario = new Usuarios(0,"Error no se pudo hacer la consulta SQL");
                   listaUsuarios.add(usuario);
              }

        return listaUsuarios;
         
         }
              
}
