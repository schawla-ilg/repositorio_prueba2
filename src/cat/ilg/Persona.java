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

        try {
            if (this.dni == null){
                this.dni = dni;
            }
            else {
                throw new Exception("Ya tiene DNI asiganado ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getDni(){
        return this.dni;
    }

    public String obtenirDades() {
        return "Persona amb nom: "+ this.nom+ " i DNI: "+ this.dni ;

    }


}
