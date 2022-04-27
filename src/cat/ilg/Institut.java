package cat.ilg;

import java.util.ArrayList;

public class Institut {
    private String nom;

    ArrayList <Persona> estudiants = new ArrayList<>();
    ArrayList <Persona> professors = new ArrayList<>();


    public void afegirProfe(Persona Professor) {
        professors.add(Professor);
    }

    public void afegirEstudiant(Persona Estudiant) {
        estudiants.add(Estudiant);
    }
}
