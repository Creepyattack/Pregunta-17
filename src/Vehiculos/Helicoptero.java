/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ppbet
 */
public class Helicoptero extends Vehiculos_Aereo{
    
    private String aleta, estabilizador, cola, patin_de_aterrizaje, planca;

    public Helicoptero(){
        
    }
    public Helicoptero(String aleta, String estabilizador, String cola, String patin_de_aterrizaje, String planca, String queroseno, String color, String model, String marca, String ruedas) {
        super(queroseno, color, model, marca, ruedas);
        this.aleta = aleta;
        this.estabilizador = estabilizador;
        this.cola = cola;
        this.patin_de_aterrizaje = patin_de_aterrizaje;
        this.planca = planca;
    }

    public String getAleta() {
        return aleta;
    }

    public void setAleta(String aleta) {
        this.aleta = aleta;
    }

    public String getEstabilizador() {
        return estabilizador;
    }

    public void setEstabilizador(String estabilizador) {
        this.estabilizador = estabilizador;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getPatin_de_aterrizaje() {
        return patin_de_aterrizaje;
    }

    public void setPatin_de_aterrizaje(String patin_de_aterrizaje) {
        this.patin_de_aterrizaje = patin_de_aterrizaje;
    }

    public String getPlanca() {
        return planca;
    }

    public void setPlanca(String planca) {
        this.planca = planca;
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
