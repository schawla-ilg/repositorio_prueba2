package cat.ilg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Persona person1 = new Persona();
        person1.assignarNom("Mark");
        person1.assignarDni("23jj3");

        System.out.println(person1.obtenirDades());
    }
}
