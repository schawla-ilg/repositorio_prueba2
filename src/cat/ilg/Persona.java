package cat.ilg;

public class Persona {

    private String nom;
    private String dni;

    public void assignarNom(String nom){ this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void assignarDni(String dni){
        this.dni = dni;
    }
    public String getDni(){
        return this.dni;
    }

    public String obtenirDades() {
        return "Persona amb nom: "+ this.nom+ " i DNI: "+ this.dni + "(PROFE amb sou:)";

    }


}
