package cat.ilg;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Institut

        Institut ins1 = new Institut();
        ins1.setNom("La Guineueta");

        //Professor
        Professor profe1 = new Professor();
        System.out.println(profe1.obtenirDades());
        profe1.assignarNom("Jose");
        profe1.assignarDni("XL12343DS");
        profe1.assignarDni("XLddhhd6");
        System.out.println(profe1.obtenirDades());
        ins1.afegirProfe(profe1);


        //Professor Substitut
        ProfessorSubstitut profe2 = new ProfessorSubstitut();
        profe2.assignarNom("Laura");
        profe2.assignarDni("LX8888P3");
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        profe2.assignarSubstitucio(dataInici, dataFi);
        ins1.afegirProfe(profe2);







    }
}
