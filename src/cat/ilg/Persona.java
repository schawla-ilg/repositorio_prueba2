package cat.ilg;

public class Persona {

    private String nom;
    private String dni;

    public String assignarNom(String nom){
        return this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public String assignarDni(String dni){
        return this.dni = dni;
    }
    public String getDni(){
        return this.dni;
    }

    public String obtenirDades() {
        return "Persona amb nom: "+ this.nom+ " i DNI: "+ this.dni;

    }


}
