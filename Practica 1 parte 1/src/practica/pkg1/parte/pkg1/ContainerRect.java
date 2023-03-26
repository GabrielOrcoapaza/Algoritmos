/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1.parte.pkg1;

/**
 *
 * @author Gabriel
 */
public class ContainerRect {

	private Rectangulo []arrRectangulos;
	private double []arrDistancias;
	private double []arrAreas;
	private int n;
	
	private static int numRec = 0;
	
	public ContainerRect(int n){
		this.n = n;
		arrRectangulos = new Rectangulo[this.n];
		arrDistancias = new double[this.n];
		arrAreas = new double[this.n];
	}
	public Rectangulo[] getArrRectangulos() {
		return arrRectangulos;
	}
	public void setArrRectangulos(Rectangulo[] arrRectangulos) {
		this.arrRectangulos = arrRectangulos;
	}
	public double[] getArrDistancias() {
		return arrDistancias;
	}
	public void setArrDistancias(double[] arrDistancias) {
		this.arrDistancias = arrDistancias;
	}
	public double[] getArrAreas() {
		return arrAreas;
	}
	public void setArrAreas(double[] arrAreas) {
		this.arrAreas = arrAreas;
	}
	public int getNum() {
		return n;
	}
	public void setNum(int n) {
		this.n = n;
	}
	public static int getNumRec() {
		return numRec;
	}
	public static void setNumRec(int numRec) {
		ContainerRect.numRec = numRec;
	}
	
	//METODO PARA PODER AGREGAR RECTANGULOS
        
	public void addRectagulo(Rectangulo R){
		numRec++;
		arrRectangulos[numRec-1] = R;
		arrDistancias[numRec-1] = Coordenada.distancia(R.getEsquina1(), R.getEsquina2());
		arrAreas[numRec-1] = R.calculoArea();
		if(numRec==n) {
			System.out.println("Ya no se agrega rectangulos!!");
			System.out.println("==========");
		}
	}
	
	//METODO TO STRING PARA MOsTAR DATOs
        
	public String toString() {
		
		System.out.println("Rectangulo	Coordenadas			Distancia	Area");
 		for( int i=0 ; i<n ;i++){
			System.out.println("     "+(i+1)+"		"+arrRectangulos[i].toString()+
			"	"+Math.round(arrDistancias[i]*1000d)/1000d+"		"+Math.round(arrAreas[i]*100d)/100d);
											}
		return " ";
	}
	
}
