/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1.parte.pkg1;

/**
 *
 * @author Gabriel
 */
import java.util.*;
public class Coordenada{
    private double x;
    private double y;
    
    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }
    
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Coordenada(Coordenada c){
        this.x = c.getX();
        this.y = c.getY();
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double distancia(Coordenada c){
        double dx = this.x - c.getX();
        double dy = this.y - c.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public static double distancia(Coordenada c1, Coordenada c2){
        double dx = c1.getX() - c2.getX();
        double dy = c1.getY() - c2.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}

