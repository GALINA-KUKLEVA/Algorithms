import java.util.Arrays;

public class FizzBuzz {

    public String[] fizzBuzz(int startNumber, int endNumber){
        String[] numbers = new String[endNumber - startNumber + 1];
        int newNumber = startNumber;

        for (int i = startNumber - startNumber; i < (endNumber - startNumber + 1); i++){
            if (newNumber % 15 == 0) {
                numbers[i] = "FizzBuzz";
            } else if (newNumber % 3 == 0){
                numbers[i] = "Fizz";
            } else if (newNumber % 5 == 0){
                numbers[i] = "Buzz";
            } else {
                numbers[i] = String.valueOf(newNumber);
            }
            newNumber +=1;
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}


//    double numer1 = 1.11;
//    double numer2 = 1.99;
//    int rangeArray = (int) (Math.nextUp(numer2) * 100.00 - Math.nextUp(numer1) * 100.00);
//    double[] newDoubleSmekalkaArray = new double[rangeArray + 1];
//        for (int i = 0; i <= rangeArray; i++) {
//                newDoubleSmekalkaArray[i] = (Math.round(Math.nextUp(numer1) * 100.00 + i)) / 100.00;
//                }
//                System.out.println("PRINT ARRAY:");
//                System.out.println(Arrays.toString(newDoubleSmekalkaArray));

