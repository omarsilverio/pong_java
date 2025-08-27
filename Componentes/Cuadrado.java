/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author omarsilverio
 */
public class Cuadrado {
    private Punto puntoA, puntoB, puntoC, puntoD;
    private Linea lineaAB, lineaBC, lineaCD, lineaDA;   
    int lado;
    private Queue<Punto> contorno;

    public Cuadrado(Punto puntoA, int lado, int ancho) {
        this.puntoA = puntoA;
        this.lado = lado;
        
        puntoB = new Punto(ancho + puntoA.getX(),puntoA.getY());        
        puntoC = new Punto(puntoB.getX(), puntoB.getY() + lado);
        puntoD = new Punto(puntoA.getX(), puntoA.getY() + lado);
        lineaAB = new Linea(puntoA, puntoB);
        lineaBC = new Linea(puntoB,puntoC);
        lineaCD = new Linea(puntoD,puntoC);
        lineaDA = new Linea(puntoA,puntoD);  
        this.contorno = this.getContornoP();
    }    
    
    
    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    public Punto getPuntoC() {
        return puntoC;
    }

    public void setPuntoC(Punto puntoC) {
        this.puntoC = puntoC;
    }

    public Punto getPuntoD() {
        return puntoD;
    }

    public void setPuntoD(Punto puntoD) {
        this.puntoD = puntoD;
    }

    public Linea getLineaAB() {
        return lineaAB;
    }

    public void setLineaAB(Linea lineaAB) {
        this.lineaAB = lineaAB;
    }

    public Linea getLineaBC() {
        return lineaBC;
    }

    public void setLineaBC(Linea lineaBC) {
        this.lineaBC = lineaBC;
    }

    public Linea getLineaCD() {
        return lineaCD;
    }

    public void setLineaCD(Linea lineaCD) {
        this.lineaCD = lineaCD;
    }

    public Linea getLineaDA() {
        return lineaDA;
    }

    public void setLineaDA(Linea lineaDA) {
        this.lineaDA = lineaDA;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public Punto getPuntoMedio(){
        int x = (puntoA.getX() + puntoC.getX())/2 ;
        int y = (puntoA.getY() + puntoC.getY())/2 ;
        return new Punto(x,y);
    }
    
    private LinkedList<Punto> getContornoP(){
        LinkedList<Punto> cola_coordenadas = new LinkedList();
        Queue<Punto> ladoAB = lineaAB.getContorno();
        Queue<Punto> ladoBC = lineaBC.getContorno();
        Queue<Punto> ladoCD = lineaCD.getContorno();
        Queue<Punto> ladoDA = lineaDA.getContorno();
        while(!ladoAB.isEmpty()){
            cola_coordenadas.add(ladoAB.remove());            
        }
        while(!ladoBC.isEmpty()){
            cola_coordenadas.add(ladoBC.remove());
            
        }
        while(!ladoCD.isEmpty()){
            cola_coordenadas.add(ladoCD.remove());
            
        }
        while(!ladoDA.isEmpty()){
           cola_coordenadas.add(ladoDA.remove());
        }
        return cola_coordenadas;
    }
    
    public Queue<Punto> getContorno(){
        return contorno;
    }
    public void setContorno(Queue<Punto> contorno){
        this.contorno = contorno;
    }
    
    
}
