package cat.ilg;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Institut {
    private String nom;

    ArrayList <Persona> estudiants = new ArrayList<>();
    ArrayList <Persona> professors = new ArrayList<>();


    public void setNom(String nom){
        this.nom = nom;
    }
    public void canviarNom(String nom) {
        this.nom = nom;
    }




    public String getNom(){
        return "El nom del Institut es: " +  this.nom;
    }

    public void afegirProfe(Professor professor) {
        professors.add(professor);
    }

    public void afegirEstudiant(Estudiant estudiant) {
        estudiants.add(estudiant);
    }

    public void imprimirInfo(){
        for (Persona professor1: professors) {
            System.out.println(professor1.obtenirDades());
        }
    }

}
