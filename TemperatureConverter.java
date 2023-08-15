import java.util.Scanner;

class InvalidTemperatureException extends Exception{
    public InvalidTemperatureException(String message){
        super(message);
    }
}
class TemperatureConverter {
    public static double celsiusToFahrenheit(double ch) throws InvalidTemperatureException{
        if(ch>=-100 && ch<=100){
            double answer = 0;
            answer=((9*ch)/5)+32;
            return answer;
        }
        else{
            throw new InvalidTemperatureException("Temperature must be between -100 C to 100 C");
        }
    }
    public static double fahrenheitToCelsius(double F) throws InvalidTemperatureException{
        if(F>=-150 && F<=150){
            double answer = 0;
            answer=((5*(F-32))/9);
                    return answer;
        }
        else{
            throw new InvalidTemperatureException("Temperature must be between -150 F to 150 F");

        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        try {
            String choice;
            System.out.print("Enter Temperature : ");
            double value = sc.nextDouble();
            System.out.print("Enter unit(C or F): ");
            choice = sc.next();
            if(choice.charAt(0)=='C' || choice.charAt(0)=='c'){
               double res= celsiusToFahrenheit(value);
                System.out.println("Converted temperature in Fahrenheit:"+res+" F");
            }
            else if(choice.charAt(0)=='f' || choice.charAt(0)=='F'){
                double res= fahrenheitToCelsius(value);
                System.out.println("Converted temperature in Celsius:"+res+" C");
            }

        }catch (InvalidTemperatureException e){
            System.out.println(e.getMessage());
        }
    }

}
