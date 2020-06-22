import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruits> {
    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public Box(T... fruits){
        this.box = new ArrayList(Arrays.asList(fruits));
    }

    public float getWeight() {
        float curWeight = 0.0f;
        for (T curFruit : box) {
            curWeight += curFruit.getWeight();
        }
        return curWeight;
    }

    public boolean checkBoxes(Box<?> anotherBox){
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.001;
    }

    public void changeFruits(Box<? super T> anotherBox) {
        if (anotherBox == this) {
            return;
        } else {
            anotherBox.box.addAll(this.box);
            this.box.clear();
        }
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }
}
