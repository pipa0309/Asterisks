public class Asterisks {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (       ((i == 5) && (j == 0))
                        || ((i == 0) && (j == 5))
                        || ((i == 5) && (j == 1))
                        || ((i == 1) && (j == 5))
                        || ((j == 0) && (i == (5-1)))
                        || ((i == 0) && (j == (5-1)))
                        || ((i == 1) && (j == (5-1)))
                        || ((j == 1) && (i == (5-1))) ) {
                    System.out.print(" " + "    ");
                } else {
                    System.out.print("*" + "    ");
                }
            }
            System.out.println("\n");
        }
    }
}
