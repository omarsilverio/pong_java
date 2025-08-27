/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transformacion;

import Componentes.Punto;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author omarsilverio
 */
public class Transformaciones {
     public Queue<Punto> trasladarRaqueta(int tx, int ty, Queue<Punto> cola){
        Queue<Punto> cola_coordenadas = new LinkedList();
        int x,y;
        while(!cola.isEmpty()){
            Punto puntoTemp = cola.remove();
            x = puntoTemp.getX();
            y = puntoTemp.getY();
            int xaux = x;
            x = xaux;
            int yaux = y + ty;
            y = yaux;
            cola_coordenadas.add(new Punto(x,y));
        }
        
        return cola_coordenadas;
    }    
    
    public Queue<Punto> escalar(int sx, int sy,Punto puntoAux,Queue<Punto> cola){
        Queue<Punto> cola_coordenada = new LinkedList();
        while(!cola.isEmpty()){
            Punto puntoTemp = cola.remove();
            double x = puntoTemp.getX();
            double y = puntoTemp.getY();
            double xn = puntoAux.getX() + (sx * (x - puntoAux.getX()));
            double yn = puntoAux.getY() + (sy * (y - puntoAux.getY()));
            cola_coordenada.add(new Punto((int)xn,(int)yn));
        }
        return cola_coordenada;
        
    }
    
    public Queue<Punto> rotar(double xc, double yc, double angulo, Queue<Punto> cola){
        Queue<Punto> cola_coordenadas = new LinkedList();
        double PI = 3.1416;
        while(!cola.isEmpty()){
            Punto puntoAux = cola.remove();
            double x = puntoAux.getX();
            double y = puntoAux.getY();   
            
            double xn = Math.rint((xc + (x - xc) * (Math.cos(angulo * PI / 180)))- ((y - yc) * Math.sin(angulo * PI / 180)));
            double yn = Math.rint((yc + (x - xc) * (Math.sin(angulo * PI / 180))) + ((y - yc) * Math.cos(angulo * PI / 180)));
            cola_coordenadas.add(new Punto((int)xn,(int)yn));
        }
        return cola_coordenadas;
    }
    
    
}
