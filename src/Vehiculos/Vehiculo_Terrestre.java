/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ppbet
 */
public class Vehiculo_Terrestre  extends Vehiculo{
    
    private String gasolina;
    
    public Vehiculo_Terrestre(){
        
    }

    public Vehiculo_Terrestre(String gasolina, String color, String model, String marca, String ruedas) {
        super(color, model, marca, ruedas);
        this.gasolina = gasolina;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }
    
    public void derrapar(){
        
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
