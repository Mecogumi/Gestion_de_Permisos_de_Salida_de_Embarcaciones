package org.littleboat;

import org.littleboat.Controller.LoginController;
import org.littleboat.Controller.NavWDController;
import org.littleboat.View.Login;
import org.littleboat.View.NavigationWindow;
import org.littleboat.View.NuevoTripulante;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //NuevoTripulante barco = new NuevoTripulante();
        //barco.setVisible(true);
       NavigationWindow navigationWindow = new NavigationWindow();
       Login login = new Login();
       LoginController appLogin = new LoginController(navigationWindow, login);
        login.setVisible(true);
    }
}
