/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;
import java.util.Date;
import java.util.Locale;
import java.io.IOException;

/**
 *
 * @author yhago
 */
public class HoraDoSistema {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date relogio = new Date();
        System.out.println("A hora do sistema é ");
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        System.out.println (loc.getLanguage());
        // TODO code application logic here
        
        try
       {
          Runtime.getRuntime().exec("cmd.exe /c start dxdiag.exe");
       }
       catch(IOException iOException)
       {
    }
    }
}
    

