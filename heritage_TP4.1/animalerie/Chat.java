package iset.dsi2.animalerie;

public class Chat extends Animal {
    private boolean sauvage;

    public Chat() {
    }
    public Chat(String couleur, int poids, boolean sauvage) {
        super(couleur, poids);
        this.sauvage = sauvage;
    }
}
