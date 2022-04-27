package cat.ilg;

public class Professor extends Persona{
    private double sou;

    public void setSou (double sou){
        this.sou = sou;
    }

    public double getSou (){
        return this.sou;
    }

    public void canviarSou (double sou) {
        this.sou = sou;
    }

    public String obtenirDades() {
        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + "(Professor amb sou: )";
    }

}
