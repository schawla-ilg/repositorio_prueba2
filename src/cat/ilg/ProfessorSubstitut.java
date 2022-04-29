package cat.ilg;

import javax.swing.*;
import java.util.Date;

public class ProfessorSubstitut extends Professor {
    private Date dataInici;
    private Date dataFi;

    public void assignarSubstitucio (Date dataInici, Date dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public String obtenirDades() {
        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + "(Persona amb sou: )";
    }
}
