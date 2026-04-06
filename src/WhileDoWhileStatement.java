public class WhileDoWhileStatement {
    public static void main(String[] args) {
//        int j = 1;
//        boolean isReady = false;
//        while (isReady) {
//            if (j > 10) break;
//            System.out.println(j);
//            j++;
//        }

//
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if (j > 10) break;
//            System.out.println(j);
//            j++;
//            isReady = j > 0;
//        } while (isReady);


        int j = 0;

        while (j < 50) {
            j += 5;
            if (j % 25 == 0) continue;
            System.out.print(j + "_");


        }
        ;
    }
}
