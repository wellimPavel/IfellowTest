package Task4;

class Corner {
    public static double betweenCorner(int hour, int minute) {
        if (hour < 0 || hour > 12 || minute < 0 || minute > 59) {
           return Double.NaN;
        }
        double angle = Math.abs(360 / 12 * hour + 0.5 * minute - 360 / 60 * minute);
        if (angle > 180) {
            angle = 360 - angle;
        }
        System.out.println("Угол между стрелками часов равен " + angle);
        return 0;
    }
}

