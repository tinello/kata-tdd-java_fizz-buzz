package ar.com.tinello.kata.fizzbuzz;

public class FizzBuzz {
    public String play(int playNumber) {

        if (isDivisible3(playNumber) && isDivisible5(playNumber)){
            return "FIZZBUZZ";
        }

        if(isDivisible3(playNumber)) {
            return "FIZZ";
        }

        if (isDivisible5(playNumber)) {
            return "BUZZ";
        }

        return String.valueOf(playNumber);
    }

    private boolean isDivisible5(int playNumber) {
        return isDivisible(playNumber, 5);
    }

    private boolean isDivisible3(int playNumber) {
        return isDivisible(playNumber, 3);
    }

    private boolean isDivisible(int playNumber, int i) {
        return playNumber % i == 0;
    }
}
