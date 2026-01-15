public class SwitchStatement {
    public static void main(String[] args) {
        normalSwitch();
        enhancedSwitch();

        String month = "OCTEMBER";
        System.out.println(getQuarter(month));

    }


    // Normal Switch Statement
    public static void normalSwitch() {
        int switchValue = 8;

        switch (switchValue) {
            case 0:
                System.out.println("Switch 0");
                break;
            case 1:
                System.out.println("Switch 1");
                break;
            case 2:
                System.out.println("Switch 2");
                break;
            case 3, 4, 5, 6:
                System.out.println("Was between 3 and 6");
                System.out.println("Actually, it was " + switchValue);
                break;
            default:
                System.out.println(switchValue + " is not in range.");
                break;
        }
    }

    // Enhanced Switch Statement
    public static void enhancedSwitch() {
        int switchValue = 8;


        switch (switchValue) {
            case 0 -> System.out.println("Switch 0");
            case 1 -> System.out.println("Switch 1");
            case 2 -> System.out.println("Switch 2");
            case 3, 4, 5, 6 -> {
                System.out.println("Was between 3 and 6");
                System.out.println("Actually, it was " + switchValue);
            }
            default -> System.out.println(switchValue + " is not in range.");

        }
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
            case "APRIL", "MAY", "JUNE" -> "2ND";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3RD";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH";
            default -> {
                String badResponse = month + " is a bad response";
                yield badResponse;
            }
        };
    }


}
