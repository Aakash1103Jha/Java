import java.lang.Math;

public class SpeedConverter {
    // method overloading for printConversion
    public static void printConversion(double parameter) {
        if (parameter < 0) {
            System.out.println("Invalid value");
        } else {
            long result = toMilesPerHour(parameter);
            System.out.println(parameter + " km/h = " + result + " mi/h");
        }
    }

    public static void printConversion(double parameter, String message) {
        if (parameter < 0) {
            System.out.println("Invalid value");
        } else {
            long result = toMilesPerHour(parameter);
            System.out.println(parameter + " km/h = " + result + " mi/h");
            System.out.println("Message: " + message);
        }
    }

    // method to convert km/hr to miles/hr
    // @param {double} kilometersPerHour
    // returns {double} milesPerHour - rounded off to whole number
    public static long toMilesPerHour(double kilometersPerHour) {
        double k = (1.60934);
        if (kilometersPerHour < 0)
            return -1;
        return (long) Math.round(kilometersPerHour / k);
    }
}
