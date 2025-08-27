/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author omarsilverio
 * 
 */
public class Circulo {
    private int radio;
    private Punto puntoMedio;
    private Queue<Punto> contorno;
    
    public Circulo(int radio, Punto puntoMedio) {
        this.radio = radio;
        this.puntoMedio = puntoMedio;
        this.contorno = getContornoP();
    }

    public void setContorno(Queue<Punto> contorno) {
        this.contorno = contorno;
    }
    public Queue<Punto> getContorno() {
        return contorno;
    }
     
    

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getPuntoMedio() {
        return puntoMedio;
    }

    public void setPuntoMedio(Punto puntoMedio) {
        this.puntoMedio = puntoMedio;
    }
    
    public Queue<Punto> getContornoP(){
        Queue<Punto> cola_coordenadas = new LinkedList();
        int x = 0;
        int y = radio;
        int p = 3 - (2 * radio);
        while(x <= y){
            Punto puntoAux1 = new Punto( (puntoMedio.getX() + x), (puntoMedio.getY() + y) ); cola_coordenadas.add(puntoAux1);
            Punto puntoAux2 = new Punto( (puntoMedio.getX() - x), (puntoMedio.getY() + y) ); cola_coordenadas.add(puntoAux2);
            Punto puntoAux3 = new Punto( (puntoMedio.getX() + x), (puntoMedio.getY() - y) ); cola_coordenadas.add(puntoAux3);
            Punto puntoAux4 = new Punto( (puntoMedio.getX() - x), (puntoMedio.getY() - y) ); cola_coordenadas.add(puntoAux4);       
            Punto puntoAux5 = new Punto( (puntoMedio.getX() + y), (puntoMedio.getY() + x) ); cola_coordenadas.add(puntoAux5);
            Punto puntoAux6 = new Punto( (puntoMedio.getX() - y), (puntoMedio.getY() + x) ); cola_coordenadas.add(puntoAux6);
            Punto puntoAux7 = new Punto( (puntoMedio.getX() + y), (puntoMedio.getY() - x) ); cola_coordenadas.add(puntoAux7);
            Punto puntoAux8 = new Punto( (puntoMedio.getX() - y), (puntoMedio.getY() - x) ); cola_coordenadas.add(puntoAux8);
            if(p <0){
                p += (4 * x) + 6;            
            }else{
                p += (4 * (x - y)) + 10;
                y -= 1;
            }
            x += 1;
        }
        return cola_coordenadas;
        }
    
    
}