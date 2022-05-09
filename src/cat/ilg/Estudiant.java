package cat.ilg;

import java.util.ArrayList;
import java.util.Collections;

public class Estudiant extends Persona{
    private double nota;

    ArrayList<Double> addNota = new ArrayList<Double>();


    public Estudiant(){
        super();
    }

    public void posarNota(double nota) {


        try {
            if (nota >= 0 && nota <= 10){
                this.nota = nota;
                addNota.add(nota);
                
            }
            else {
                throw new Exception("La nota esta incorrecta");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public double getNota(){
        return nota;
    }

    public String obtenirDades() {
        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + "(ESTUDIANT amb nota maxima :" + Collections.max(addNota) +")";
    }


    public String getMin(){
        return "Nota minima del Estudiant es "+ Collections.min(addNota);
    }


    public String getAverage(){
        double total = 0.0;
        for(double i  : addNota) {
            total += nota;
        }
        return "La nota mediana del Estudiant es "+ (total/addNota.size());
    }
}
