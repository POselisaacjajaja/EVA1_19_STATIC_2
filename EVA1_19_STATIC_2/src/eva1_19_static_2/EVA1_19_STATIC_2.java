/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static_2;


/**
 *
 * @author isaaczapatto
 */
public class EVA1_19_STATIC_2 {
    /**
     * @param args the command line arguments
     */
int x = 100;
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(cola);
        //mensajeNoEstatico();
        
        EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
        mensajeEstatico();
    }
    
    public void mensajeNoEstatico(){ //No existe
        System.out.println("Mensaje no estático");
    }
    
    public static void mensajeEstatico(){ //Existe al iniciar el programa
        System.out.println("Mensaje estático");
    }
    
}
