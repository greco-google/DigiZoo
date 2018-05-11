
public abstract class Domesticated extends Pet{

    public void play() {
        if (isSleeping) {
            System.out.println("This pet is sleeping.");
        } else {
            boredom -= 20;
            if (boredom < 0) boredom = 0;
            System.out.println("Play done!");
        }
    }
}
