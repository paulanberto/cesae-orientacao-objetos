package Ex_02;

public class Main {
    public static void main(String[] args) {
        Cao cao1 = new Cao ("Zuzu", "Shi-tzu");
        Cao cao2 = new Cao ("Pipoca", "Golden");
        Cao cao3 = new Cao ("Paçoca", "Vira-lata");

        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        cao3.setLatido("Woof... Woof...");

        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        cao1.setLatido("Au... Au...");
        cao2.setLatido("Ruf, Ruf");

        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        cao1.ladrar(5);

    }

}
