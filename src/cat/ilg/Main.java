package cat.ilg;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Institut
        System.out.println("*****INSTITUT*****");
        Institut ins1 = new Institut();
        ins1.setNom("La Guineueta");
        System.out.println(ins1.getNom());

        //Professor
        System.out.println();
        System.out.println("********PROFESSOR*******");
        Professor profe1 = new Professor();
        profe1.assignarNom("Jose");
        profe1.assignarDni("XL12343DS");
        //profe1.assignarDni("XLddhhd6");
        profe1.setSou(2200);
        System.out.println(profe1.obtenirDades());
        ins1.afegirProfe(profe1);

        System.out.println();
        System.out.println("******ESTUDIANT******");
        Estudiant estudiant1 = new Estudiant();
        estudiant1.assignarNom("Laura");
        estudiant1.assignarDni("XL567M2");
        estudiant1.posarNota(12);
        System.out.println(estudiant1.obtenirDades());


        //Professor Substitut
        ProfessorSubstitut profe2 = new ProfessorSubstitut();
        profe2.assignarNom("Laura");
        profe2.assignarDni("LX8888P3");
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        profe2.assignarSubstitucio(dataInici, dataFi);
        ins1.afegirProfe(profe2);


        System.out.println();
        System.out.println("******PERSONA*****");
        Persona p1 = new Persona();
        //p1.assignarDni("XVFRP");
        //p1.assignarNom("Joel");

        try {
            if ( p1.getDni() != null ||  p1.getNom() != null) {
                System.out.println(p1.obtenirDades());

            } else {
                throw new Exception("Error: falta el nombre o el dni");

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        /*
        Scanner objeto1 = new Scanner(System.in);

        System.out.println("Introdueix el número de l’acció que vulguis fer:");
        System.out.println("1) Veure la llista d’Instituts\n" +
                "2) Veure la informació completa d’un Institut\n" +
                "3) Afegir persona a un Institut\n" +
                "4) Eliminar un Institut\n" +
                "5) Crear un Institut\n");

        int posicion = objeto1.nextInt();

        switch(posicion) {
            case 1:
                Institut instituts = new Institut();

            case 2:


            case 3:

        }

    */
    }

}
