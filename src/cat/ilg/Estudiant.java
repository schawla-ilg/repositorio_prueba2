package cat.ilg;

public class Estudiant extends Persona{
    private double nota;

    public Estudiant(){
        super();
    }

    public void posarNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }

    public String obtenirDades() {
        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + "(ESTUDIANT amb nota:" +getNota()+")";
    }
}
