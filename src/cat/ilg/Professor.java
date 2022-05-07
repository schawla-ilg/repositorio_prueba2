package cat.ilg;

public class Professor extends Persona{
    private double sou;

    public void setSou (double sou){
        try {
            if (sou < 3000 && sou > 0){
                this.sou = sou;
            }
            else {
                throw new Exception("El salario no puede exceder el limite ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public double getSou (){
        return this.sou;
    }

    public void canviarSou (double sou) {
        this.sou = sou;
    }

    public String obtenirDades() {
        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + "(Professor amb sou: " + getSou()+")";
    }

}
