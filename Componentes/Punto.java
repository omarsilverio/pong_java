/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author omarsilverio
 */
public class Punto {
    private int X, Y; //Almacena las coordenadas

        public Punto(int X, int Y){            
            this.X = X;
            this.Y = Y;        
        }  
        /**
         * 
         * @return retorna la coordenada X
         */
        public int getX(){
            return X;
        }  
            
        /**
         * 
         * @return retorna la coordenada y
         */
        public int getY(){
            return Y;
        }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
        
        @Override
        public String toString(){
            return "x: " + X+ " " + "y: " + Y;
        }
}
