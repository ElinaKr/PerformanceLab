package Mission1;

public class Main {
    public static void main(String[] args) {
        Segments cut1 = new Segments(1, 1, 2, 2);
        Segments cut2 = new Segments(-3, 0, 1, 1);
        Segments cut3 = new Segments(1, 1, 2, 2);
        cut1.getLenght();
        cut2.getLenght();
        cut1.ESegments(cut2);
        cut1.ESegments(cut3);

    }
}

