
public abstract class Domesticated extends Pet{

    public void play() {
        if (sleep) {
            System.out.println("This pet is sleeping.");
        } else {
            bored -= 20;
            if (bored < 0) bored = 0;
            System.out.println("Play done!");
        }
    }
}
