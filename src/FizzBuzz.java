//Author: santiagocb

public class FizzBuzz {

    public FizzBuzz(){
    }

    //Método genérico para cualquier divisor
    public boolean isDivisibleBy(int divisor, int number){
        return number % divisor == 0;
    }

    public boolean isDivisibleByThree(int number){
        return isDivisibleBy(3, number);
    }

    public boolean isDivisibleByFive(int number){
        return isDivisibleBy(5, number);
    }

    public boolean isDivisibleByThreeAndFive(int number){
        return (isDivisibleBy(3, number) && isDivisibleBy(5, number));
    }

    public String say(int number){
        String say = "";
        if(isDivisibleByThree(number)) say = "Fizz";
        if(isDivisibleByFive(number)) say = "Buzz";
        if(isDivisibleByThreeAndFive(number)) say = "FizzBuzz";
        return (say.isEmpty() ? Integer.toString(number) : say);
    }

}
