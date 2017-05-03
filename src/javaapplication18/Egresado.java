/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author sena
 */
public class Egresado {
     private String idEgresado; 
      private String nombre; 
       private String direccion; 
        private String telefono; 
         private String correo; 
    public void setIdEgresado(String idEgresadoP){ 
        this.idEgresado= idEgresadoP; 
    } 
    public String getIdEgresado(){ 
        return idEgresado; 
    } public void solicitar(){
        System.out.println("solicitar_documentos");
        System.out.println("solicitar_documentos2"); 
    }
    public void setNombre(String nombreP){ 
        this.nombre= nombreP; 
    } public String getNombre(){
        return nombre; 
    } public void ingresar(){}
    public void setDireccion(String direccionP){ 
        this.direccion= direccionP; 
    } 
    public String getdireccion(){ 
        return direccion; 
    } 
    public void setTelefono(String telefonoP){
        this.telefono= telefonoP; 
    } 
    public String getTelefono(){ 
        return telefono; 
    } 
    public void setCorreo(String correoP){ 
        this.correo= correoP; 
    } 
    public String getCorreo(){ 
        return correo; 
    } 
}
    

