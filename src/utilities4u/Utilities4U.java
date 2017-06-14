/*
 * Copyright (C) 2017 NahumFrog
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package utilities4u;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author NahumFrog
 */
public class Utilities4U {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Main
        open();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    private static void open(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            ServerSocket soc = new ServerSocket(9998, 10, InetAddress.getLocalHost());//abre un socket
            new MainMenuForm().setVisible(true);//Create main window
            
        }catch(java.net.BindException  b){//captura la excepción
            //Lanza una ventana de advertencia si el socket ya esta abierto
            JOptionPane.showMessageDialog(null, "El programa ya está en ejecución","Atención!",JOptionPane.ERROR_MESSAGE);
            
        }catch(Exception e){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al tratar de ejecutar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
