package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int x = 1; x <= cathetusLength; x++) {
            for (int y = cathetusLength - x; y >= 1; y--) {
                System.out.print(" ");
            }
            for (int y = x; y > 1; y--) {
                System.out.print(y);
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
