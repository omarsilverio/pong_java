/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementos;

import Componentes.Circulo;
import Componentes.Cuadrado;
import Componentes.Punto;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author omarsilverio
 */
public class Tablero extends Canvas{    
    private final Cuadrado raqueta1, raqueta2, campo;
    private Cuadrado centro = new Cuadrado(new Punto(250,0),530, 40);
    private Circulo pelota;
    boolean inicio = true;
    public Tablero(Cuadrado raqueta1, Cuadrado raqueta2, Circulo pelota, Cuadrado campo){
        this.campo = campo;
        this.raqueta1 = raqueta1;
        this.raqueta2 = raqueta2;
        this.pelota = pelota;        
        this.setBackground(new Color(0,0,0));
    }
    public void setPosicionPelota(Circulo pelota){
        this.pelota = pelota;
    }   
    public void setAnimacion(boolean inicio){
        this.inicio = inicio;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);        
        g.setColor(new Color(255, 255, 255));
        centro.getContorno().forEach(punto -> g.drawLine(punto.getX(), punto.getY(), punto.getX(), punto.getY()));
        campo.getContorno().forEach(punto -> g.drawLine(punto.getX(), punto.getY(), punto.getX(), punto.getY()));
        g.setColor(new Color(252, 252, 0));
        raqueta1.getContorno().forEach(punto -> g.drawLine(punto.getX(), punto.getY(), punto.getX(), punto.getY()));
        //raqueta1.getContorno().forEach(punto -> g.fillRect(punto.getX(), punto.getY(), 1, 20));
        
        raqueta2.getContorno().forEach(punto -> g.drawLine(punto.getX(), punto.getY(), punto.getX(), punto.getY()));        
        //raqueta2.getContorno().forEach(punto -> g.fillRect(punto.getX(), punto.getY(), 1, 20));
        g.setColor(new Color(255, 0, 0));
        pelota.getContorno().forEach(punto -> g.drawLine(punto.getX(), punto.getY(), punto.getX(), punto.getY()));
         //g.setColor(new Color(0, 0, 0));
        
         
    }
    
    
}
