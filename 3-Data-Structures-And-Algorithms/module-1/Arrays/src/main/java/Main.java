public class Main {
    public static void main(String[] args) {

        // Static init
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // or
        String[] daysOfWeek2;
        daysOfWeek2 = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Dynamic init
        String[] daysOfWeek3 = new String[7];
        daysOfWeek3[0] = "Monday";
        daysOfWeek3[1] = "Tuesday";
        daysOfWeek3[2] = "Wednesday";
        daysOfWeek3[3] = "Thursday";
        daysOfWeek3[4] = "Friday";
        daysOfWeek3[5] = "Saturday";
        daysOfWeek3[6] = "Sunday";

        String[] daysOfWeek4 = new String[7];
        for (int i = 0; i < daysOfWeek.length; i++) {
            daysOfWeek4[i] = daysOfWeek[i];
        }
    }
}
