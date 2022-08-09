/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ppbet
 */
public class Avion extends Vehiculos_Aereo{
    
    private String alas, propulsores, planeador, tren_de_aterrizaje;
    
    public Avion(){
        
    }
    public Avion(String alas, String propulsores, String planeador, String tren_de_aterrizaje, String queroseno, String color, String model, String marca, String ruedas) {
        super(queroseno, color, model, marca, ruedas);
        this.alas = alas;
        this.propulsores = propulsores;
        this.planeador = planeador;
        this.tren_de_aterrizaje = tren_de_aterrizaje;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(String propulsores) {
        this.propulsores = propulsores;
    }

    public String getPlaneador() {
        return planeador;
    }

    public void setPlaneador(String planeador) {
        this.planeador = planeador;
    }

    public String getTren_de_aterrizaje() {
        return tren_de_aterrizaje;
    }

    public void setTren_de_aterrizaje(String tren_de_aterrizaje) {
        this.tren_de_aterrizaje = tren_de_aterrizaje;
    }
    
    @Override
    public void despegar(){
        
    }
    
    @Override
    public void aterrizar(){
        
    }
    
    @Override
   public void arrancar(){
        
    }
    
    @Override
    public void acelerar(){
        
    }
    
    @Override
    public void detenerse(){
        
    }
    
    @Override
    public void frenar(){
        
    } 
    
    
    
}
