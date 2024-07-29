package torta;

import java.util.HashSet;
import java.util.Set;

public class Torta implements Preparacion {
    private FormaTorta formaTorta;

    private String decoracion;

    private String tipoTorta;

    private String sabor;

    private Set<String> ingredientes = new HashSet<>();

    private double precio;

    public Torta() {
    }

    public Torta(FormaTorta formaTorta, String decoracion, String tipoTorta, String sabor, Set<String> ingredientes, double precio) {
        this.formaTorta = formaTorta;
        this.decoracion = decoracion;
        this.tipoTorta = tipoTorta;
        this.sabor = sabor;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public FormaTorta getFormaTorta() {
        return formaTorta;
    }

    public void setFormaTorta(FormaTorta formaTorta) {
        this.formaTorta = formaTorta;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public String getTipoTorta() {
        return tipoTorta;
    }

    public void setTipoTorta(String tipoTorta) {
        this.tipoTorta = tipoTorta;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Set<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int sumar(int num1, int num2){
        return num1+num2;
    }

    //Capacidad de un METODO de realizar la misma accion de manera diferente 👍
    public void sumar(double num1, double num2){
        System.out.println( num1 + num2);
    }


    @Override
    public String toString() {
        return "Torta{" +
                "torta=" + formaTorta +
                ", decoracion='" + decoracion + '\'' +
                ", tipoTorta='" + tipoTorta + '\'' +
                ", sabor='" + sabor + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }

    @Override
    public void preparacion() {
        System.out.println("Preparando la " + this.tipoTorta);
    }
}
