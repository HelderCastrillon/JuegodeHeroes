package juegodeheroes;

import java.sql.SQLException;
import java.util.Scanner;
import juegodeheroes.ConsoleView.consoleMode;
import juegodeheroes.View.jfIniciar;



/**
 *
 * @author Helder Castrillon
 */
public class juegodeheroes {
    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) throws SQLException{
        
        //Scanner leer = new Scanner(System.in);
      
         jfIniciar frameinicial = new jfIniciar();
         frameinicial.setVisible(true);
       
            //consoleMode.inicarJuego();      
      
    }
    
    }
