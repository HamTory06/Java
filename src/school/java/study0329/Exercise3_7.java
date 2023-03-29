package school.java.study0329;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = 5.0f/9*(fahrenheit - 32);
        celcius+=0.005;
        //celcius: 37.78278
        int a = (int) (celcius*100);
        System.out.println("Fahrenheit: "+fahrenheit);
        //celcius: 37.78
        System.out.println("celcius: "+a/100.0f);
    }
}