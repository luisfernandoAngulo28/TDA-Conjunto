/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapadeNegocio;

/**
 * Ayudantia
 * pasos
 *1.Atributos
 *2.Constructor
 *3.setters
 *4.getters
 *5.toString
 * 
 * @author fernando
 */
public class Conjunto {
    //Atributos
    int C[];
    int dim;
    //Constructo
    
    public Conjunto(int cant) {
      this.C=new int[cant];
       this.dim=-1;
      
        
    }
    //setters
    /*
    //Insertar un elemento al conjunto
    Void Insertar(elem)
    Pre://El conjunto no esta lleno
          //El elemento no debe pertenecer al Conjunto
    Post:El Conjunto se Modifica
    */
    public void insertar(int elemento){
       if(!Llena()){
          if(!Pertenece(elemento)){
              dim++;
              C[dim]=elemento;
          } 
       }else{
           System.out.println("Error::Insertar: el Conjunto ya esta lleno");
           System.exit(1); 
       } 
    }

    public  boolean Pertenece(int elemento) {
     int posicion=0;
        while ((posicion<=dim) &&(C[posicion]!=elemento)) {            
            posicion++;
        }
        return (posicion<=dim);
    }

    public  boolean Llena() {
        return (dim==C.length-1);
    }
    public  boolean Vacia() {
        return (dim==-1);
    }
    
    //toString
    @Override
    public String toString(){
        String Salida="{";
        for (int i = 0; i <= dim; i++) {
            Salida=Salida+C[i]+",";
        }
        Salida=Salida.substring(0, Salida.length()-1);
        return Salida+"}";
    }
    
    public static void main(String[] args) {
        Conjunto conjuntoA=new Conjunto(8);
        for (int i = 2; i < 7; i++) {
            conjuntoA.insertar(i);
        }
        System.out.println("A="+conjuntoA.toString());
        //Salida 
        //A={2,3,4,5,6}
    }
    
    
    
    
    
    
    
    
    
    
}
