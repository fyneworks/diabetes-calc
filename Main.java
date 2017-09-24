package sample;


import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dwsmou carbs, fats, protein \n");
        int carbs, fats, protein,BG, targetBG, insulinPerU, bgPerU,carbsPerU;
        double activeInsulin;

        carbs = input.nextInt();
        fats = input.nextInt();
        protein = input.nextInt();
        BG = input.nextInt();
        targetBG = input.nextInt();
        carbsPerU = input.nextInt();
        bgPerU = input.nextInt();


        activeInsulin = input.nextDouble();

        variables test = new variables(BG,targetBG,carbs,fats,protein,carbsPerU,bgPerU, activeInsulin);
        String kati = test.toString();
        System.out.println(test.insulinCalc());
    }
}
