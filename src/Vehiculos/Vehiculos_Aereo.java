/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ppbet
 */
public class Vehiculos_Aereo extends Vehiculo{
    
    private String queroseno;
    
    public Vehiculos_Aereo(){
        
    }

    public Vehiculos_Aereo(String queroseno, String color, String model, String marca, String ruedas) {
        super(color, model, marca, ruedas);
        this.queroseno = queroseno;
    }

    public String getQueroseno() {
        return queroseno;
    }

    public void setQueroseno(String queroseno) {
        this.queroseno = queroseno;
    }
    
    public void despegar(){
        
    }
    
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
