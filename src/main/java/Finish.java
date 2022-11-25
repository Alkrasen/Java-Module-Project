public class Finish {
    public static String finish(float overallCost) {
        String suffix;
        int hundred = (int) Math.floor(overallCost % 100);
        if (hundred <= 20 && hundred >= 5) {
            suffix = " рублей ";
        } else {
            int ten = hundred % 10;
            if (ten == 1) {
                suffix = " рубль ";
            } else if (ten >= 2 && ten <= 4) {
                suffix = " рубля ";
            } else {
                suffix = " рублей ";
            }


        }
return suffix;
    }
    }
