package cat.ilg;

public class Estudiant extends Persona{
    private double nota;

    public Estudiant(){
        super();
    }

    public void posarNota(double nota) {
        try {
            if (nota >= 0 && nota <= 10){
                this.nota = nota;
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
        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + "(ESTUDIANT amb nota:" +getNota()+")";
    }
}
