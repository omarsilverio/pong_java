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
 */
public class Linea {
     private Punto puntoInicial;
    private Punto puntoFinal;
    private LinkedList<Punto> contorno;

    public Linea(Punto puntoInicial, Punto puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
        this.contorno = getContornoP();
    }

    public Linea(LinkedList<Punto> contorno) {
        this.contorno = contorno;
        this.puntoInicial = contorno.getFirst();
        this.puntoFinal = contorno.getLast();
    }
    
    

    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Punto puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }
  
    public LinkedList<Punto> getContorno(){
        return contorno;
    }
    private LinkedList<Punto> getContornoP(){
        LinkedList<Punto> cola_coordenadas = new LinkedList();
        int xf, xi, yf, yi,aux,opc,p,a,b;        
	int dx = puntoFinal.getX() - puntoInicial.getX();//paso 2 del algoritmo
	int dy = puntoFinal.getY() - puntoInicial.getY();//paso 2 del algoritmo     
        /**
	 * comprueba que el producto de dx * dy sea menor a 0
	 * si se cumple la condicion a aux es igual a -1
	 * si no se cumple aux es igual a uno
	 */
	if((dx*dy) < 0){
		aux = -1;
	}
	else{ aux = 1; }
	// se agrega el punto inicial a la cola de coordenadas
        cola_coordenadas.add(puntoInicial);
        /**
	 * esta condición se explico en clase :v,
	 * se asigna el punto inicial y el punto final
	 */
	if((dx < 0 && dy < 0) || (dx < 0 && dy > 0)){
		xf = puntoInicial.getX(); xi = puntoFinal.getX();
	    yf = puntoInicial.getY(); yi = puntoFinal.getY();
	}else{
		xf = puntoFinal.getX(); xi = puntoInicial.getX();
		yf = puntoFinal.getY(); yi = puntoInicial.getY();
	}
        // Se obtiene el valor absoluto de dx y dy
	dx = Math.abs(dx);
	dy = Math.abs(dy);

	if(dy > dx){ 
		a = 2*dx;	b = 2*(dx-dy);
		opc = 2;    p = 2*dx - dy;
	}else{
		a = 2*dy;   b = 2*(dy-dx);
		opc = 1;	p = 2*dy - dx;
	}
        //caso 1 el, else es el caso 2
	if(opc == 1){
		while(xi < xf){
			if(p<0){
				xi++; p+=a;
			}else{
				xi++; p+=b;
				yi+=aux;
			}
            Punto auxPunto = new Punto(xi,yi);
			cola_coordenadas.add(auxPunto);
		}
	}else{
		while(yi < yf)	{
			if(p<0){
				yi+=aux; p+=a;
			}else{
				xi++; p+=b;
				yi+=aux;
			}
            Punto auxPunto = new Punto(xi,yi);
			cola_coordenadas.add(auxPunto);
		}
	}
        return cola_coordenadas;
    } 
    
}
