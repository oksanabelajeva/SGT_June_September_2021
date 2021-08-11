package lesson9;

public class Arrays {
    public static void main(String[] args) {

        int[] firstArray = new int[3];
        firstArray[0] = 55;
        firstArray[1] = 1900;
        firstArray[2] = 1;

        System.out.println("This is the FIRST element: " + firstArray[0]);
        System.out.println("I want to get 1900. Here it is: " + firstArray[1]);

        // Short array initialization
        int[] temperatures = {33, 34, 31, 30, 29, 28, 36};
        System.out.println("This is the temperature for Friday: " + temperatures[4]);
        System.out.println("In temperatures array we have " + temperatures.length + " elements.");
        System.out.println("Last element in the array is " + temperatures[temperatures.length - 1]);

        int[] weatherForecast = new int[7];
        weatherForecast[0] = 29;
        weatherForecast[1] = 31;
        weatherForecast[2] = 30;
//        int[]weatherForecast = {29, 31, 30};
        weatherForecast[3] = 37;
        weatherForecast[4] = 37;
        weatherForecast[5] = 30;
        weatherForecast[6] = 19;

        double averageTemperature = (weatherForecast[0] + weatherForecast[1] + weatherForecast[2]
                + weatherForecast[3] + weatherForecast[4] + weatherForecast[5] + weatherForecast[6]) / 7d;

        System.out.println("Average temperature for the week is " + averageTemperature + " degrees.");
    }
}
