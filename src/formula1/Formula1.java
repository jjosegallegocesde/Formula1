/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import equipos.Escuderia;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Formula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Bienvienido F1TOTAL");
        System.out.println("Digite por favor el numero de escuderias a registrar: ");
        int numeroEscuderias=entrada.nextInt();
        System.out.println("*****************");
        
        
        Escuderia[] escuderias = new Escuderia[numeroEscuderias];
        
        Escuderia prueba = new Escuderia();
        prueba.setNombrePiloto("juan");
        
        
        for(int i=0; i<escuderias.length; i++){
            
            escuderias[i]=new Escuderia(); //OBJETO-FOTOCOPIA
            
            System.out.println("Digite el nombre de la escuderia: ");
            escuderias[i].setNombreEscuderia(entrada.next());
            
            System.out.println("Digite la marca del motor: ");
            escuderias[i].setMotorEscuderia(entrada.next());
            
            System.out.println("Digite el nombre del piloto");
            escuderias[i].setNombrePiloto(entrada.next());
            
            System.out.println("Digite el costo anual de la escuderia");
            escuderias[i].setCostoAnualEscuderia(entrada.nextInt());
            
            System.out.println("");
            System.out.println("*************");
            
        }
        
        int costoInicial=escuderias[0].getCostoAnualEscuderia();
        int posicion=0;
        
        for(int i=1; i<escuderias.length; i++){
            
            int costo=escuderias[i].getCostoAnualEscuderia();
            
            if(costo>costoInicial){
                
                posicion=i;
                
            }
            
             
        }
        
        System.out.println("La escuderia mas costosa es: "+escuderias[posicion].getNombreEscuderia());
        
        
        
        
        
    }
    
}
