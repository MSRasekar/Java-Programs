package BasicPrograms;

import java.util.Scanner;

public class TempConversion {
    
    public void fahrenheitToCelsius(float temperature){

        temperature = ((temperature -32)*5)/9;

        System.out.println("Temperature in Celsius is " + temperature+"℃");

    }

    public void celsiusToFahrenheit(float temperature){

        System.out.println("Temperature in Fahrenheit is ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TempConversion obj = new TempConversion();


        System.out.println("Enter the Temperature in Fahrenheit");
        float temp = sc.nextFloat();

        obj.fahrenheitToCelsius(temp);
        
    }

}
