package sample;

public class variables {

    private int BG;         // current blood sugar value
    private int targetBG;   // target bg value
    private int carbs;
    private int fats;
    private int protein;
    private int carbsPerU;
    private int bgPerU;
    private double activeInsulin = 0;

    public variables(int BG, int targetBG, int carbs, int fats, int protein, int carbsPerU, int bgPerU, double activeInsulin) {
        this.BG = BG;
        this.targetBG = targetBG;
        this.carbs = carbs;
        this.fats = fats;
        this.protein = protein;
        this.carbsPerU = carbsPerU;
        this.bgPerU = bgPerU;
        this.activeInsulin = activeInsulin;
    }

    /**fsdfd**/


    @Override
    public String toString() {
        return "variables{" +
                "carbs=" + carbs +
                ", fats=" + fats +
                ", protein=" + protein +
                '}';
    }

    public double insulinCalc(int carbs, int fats, int protein, boolean activeInsulin){
        carbs = this.carbs;
        fats = this.fats;
        protein = this.protein;
        activeInsulin = this.activeInsulin;
        double dosage;

        if (activeInsulin == true) {
            //calculate dosage to reach target
            int temp = targetBG - BG;
            dosage = temp / bgPerU;
            temp = carbs * carbsPerU;
            dosage += temp;
        }
        



        }
    }
}
