package juegodeheroes.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import juegodeheroes.connect.pgConnect;
import juegodeheroes.model.Heroe;
import juegodeheroes.model.Usuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcastrillon
 */
public class HeroeDao {
    
    public static List<Heroe> getHeroes() throws SQLException{
                   List<Heroe> listaHeroes = new ArrayList();
                // TODO code application logic here

              try {
                  pgConnect connectPG = new pgConnect();
                  Connection conex=connectPG.settingConnect();
                  java.sql.Statement st = conex.createStatement();  
  
                  String sql ="SELECT poder1, poder2, poder3, puntodebil1, puntodebil2, puntodebil3, foto, id  FROM superpersona";
                  ResultSet result = st.executeQuery(sql);
                  
                  while(result.next()) {
                      int id = result.getInt("id");
                      String poder1 = result.getString("poder1");
                      String poder2 = result.getString("poder1");
                      String poder3 = result.getString("poder1");
                      String puntodebil1 = result.getString("puntodebil1");
                      String puntodebil2 = result.getString("puntodebil2");
                      String puntodebil3 = result.getString("puntodebil3");
                      String foto = result.getString("foto");
                      
                      Heroe miHeroe = new Heroe(id, poder1, poder2, poder3, puntodebil1, puntodebil2, puntodebil3, foto);
                       listaHeroes.add(miHeroe);
                  }
                  result.close();
                  st.close();
                  conex.close();
              } catch(ClassNotFoundException | SQLException exc) {
                  System.out.println("Error: "+exc.getMessage());
                  Heroe heroe = new Heroe(0,"Error no se pudo hacer la consulta SQL","","","","","","");
                   listaHeroes.add(heroe);
              }

        return listaHeroes;
         
         }
         
              public static void setHeroes(Heroe heroe){
                // TODO code application logic here

              try {
                  pgConnect connectPG = new pgConnect();
                  Connection conex=connectPG.settingConnect();
                  java.sql.Statement st = conex.createStatement();  
                  String sql ="INSERT INTO superpersona(id,poder1, poder2, poder3, puntodebil1, puntodebil2, puntodebil3, foto) VALUES ("+heroe.getId()+", '"+heroe.getPoder1()+"', '"+heroe.getPoder2()+"', '"+heroe.getPoder3()+"', '"+heroe.getPuntodebil1()+"', '"+heroe.getPuntodebil2()+"', '"+heroe.getPuntodebil3()+"', '"+heroe.getFoto()+"')";
                  st.executeUpdate(sql);
                  st.close();
                  conex.close();
              } catch(ClassNotFoundException | SQLException exc) {
                  System.out.println("Error: "+exc.getMessage());
              }

}
    
}
