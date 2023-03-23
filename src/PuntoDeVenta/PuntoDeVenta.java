/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PuntoDeVenta;

import Controlador.controlador;
import Vista.FRMusuario;
import Modelo.modeloUsuario;
import Vista.FRMtodo;
import Vista.FRMInventairo;
import Vista.FRMMenu;
/**
 *
 * @author Zero
 */
public class PuntoDeVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FRMusuario formulario = new FRMusuario();
        FRMtodo tablaT = new FRMtodo();
        FRMInventairo inventario = new FRMInventairo();
        FRMMenu menu = new FRMMenu();
        modeloUsuario modeloV = new modeloUsuario();
        
        menu.setVisible(true);
        
        controlador objC = new controlador(formulario,modeloV, tablaT,inventario, menu);
    }
    
}
