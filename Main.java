import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dwsmou carbs, fats, protein \n");
        int carbs, fats, protein,BG, targetBG,  bgPerU,carbsPerU;
        double activeInsulin;

        System.out.print("Give carbs \n");
        carbs = input.nextInt();
        System.out.print("Gimme fats\n");
        fats = input.nextInt();
        System.out.println("Gimme proteins");
        protein = input.nextInt();
        System.out.print("Gimme Curent BG\n");
        BG = input.nextInt();
        System.out.print("Gimme target BG\n");
        targetBG = input.nextInt();
        System.out.print("Gimme Carbs per unite of insulin\n");
        carbsPerU = input.nextInt();
        System.out.print("Gimme how much a unite of insulin lowers your BG\n");
        bgPerU = input.nextInt();
        System.out.print("Active Insulin?\n");
        activeInsulin = input.nextDouble();

        variables info = new variables(BG,targetBG,carbs,fats,protein,carbsPerU,bgPerU, activeInsulin);
        String infos = info.toString();
        System.out.println(info.insulinCalc());
    }
}
