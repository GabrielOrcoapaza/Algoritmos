/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricadeinstrumentos;
import java.util.ArrayList;
/**
 *
 * @author Gabriel
 */
public class Fabrica {
    private ArrayList<Sucursal> sucursales;
    
    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }
    
    public double[] porcInstrumentosPorTipo(String nombreFab) {
        double[] porcentajes = new double[TipoInstrumento.values().length];
        Sucursal sucEncontrada = buscarSucursal(nombreFab);
        if (sucEncontrada != null) {
            porcentajes = sucEncontrada.porcInstrumentosPorTipo(); 
        }
        return porcentajes;
    }
 

    private Sucursal buscarSucursal(String nombreSuc) {
        int i = 0;
        Sucursal sucEncontrada = null;
        while (i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombreSuc)) {
            i++;
        }
        if (i < sucursales.size()) {
            sucEncontrada = this.sucursales.get(i);
        }
        return sucEncontrada;
    }

    public Instrumento borrarInstrumento(String ID) {
        Instrumento borrado = null;
        int i = 0;
        while (i < sucursales.size() && borrado == null) {
            borrado = sucursales.get(i).borrarInstrumento(ID);
            i++;
        }
        return borrado;
    }

    public void listarInstrumentos() {
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Sucursal sucursal : sucursales) {
            instEncontrados.addAll(sucursal.instrumentosPorTipo(tipo));
        }
        return instEncontrados;
    }

    public void agregarSucursal(Sucursal suc) {
        this.sucursales.add(suc);
    }
    
} 



