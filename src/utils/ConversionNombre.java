package utils;

public class ConversionNombre {

    public static void main(String[] args) {
        // Conversion d'une chaîne en entier
        String variable = "42";
        int nombre = Integer.parseInt(variable);
        System.out.println("Le nombre converti est " + nombre);

        // Calcul du maximum entre deux entiers
        int a = 5;
        int b = 3;
        int maximum = Math.max(a, b); // Utilisation directe de l'entier
        System.out.println("Le plus grand nombre est " + maximum);
    }
}
