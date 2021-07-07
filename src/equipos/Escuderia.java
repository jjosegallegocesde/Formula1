/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipos;

/**
 *
 * @author Juan
 */
public class Escuderia {
    
    //ATRIBUTOS
    private String nombreEscuderia;
    private String nombrePiloto;
    private String motorEscuderia;
    private int costoAnualEscuderia;
    
    //CONSTRUCTOR
    public Escuderia() {
    }
 
    public Escuderia(String nombreEscuderia, String nombrePiloto, String motorEscuderia, int costoAnualEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
        this.nombrePiloto = nombrePiloto;
        this.motorEscuderia = motorEscuderia;
        this.costoAnualEscuderia = costoAnualEscuderia;
    }
    
    //METODOS

    public String getNombreEscuderia() {
        return nombreEscuderia;
    }

    public void setNombreEscuderia(String nombreEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public String getMotorEscuderia() {
        return motorEscuderia;
    }

    public void setMotorEscuderia(String motorEscuderia) {
        this.motorEscuderia = motorEscuderia;
    }

    public int getCostoAnualEscuderia() {
        return costoAnualEscuderia;
    }

    public void setCostoAnualEscuderia(int costoAnualEscuderia) {
        this.costoAnualEscuderia = costoAnualEscuderia;
    }
    

    
    
    
}
