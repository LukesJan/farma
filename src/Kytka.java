import java.util.ArrayList;
import java.util.Random;

public class Kytka extends Flower{
    Random r = new Random();
    private ArrayList<Flower> growingFlowers = new ArrayList();
    private int luck = r.nextInt(51);

    public Kytka() {
    }

    @Override
    public void water() {
        chanceOfGrowth += luck;
    }

    @Override
    public void plant(Flower f) {
        try {
            if (growingFlowers.size() < 5){
                growingFlowers.add(f);
            }
        } catch (Exception e){
            new Exception("Nemůžeš zasadit rostlinu");
        }
    }

    @Override
    public void harvest(Flower f) {

        try {
            if (growingFlowers.size() > 1){
                growingFlowers.remove(growingFlowers.indexOf(f));
            }
        } catch (Exception e){
            new Exception("Nemůžeš vysadit rostlinu");
        }
    }
}
