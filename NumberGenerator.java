import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {

    int minNum;
    int maxNum;
    int numAmmount;
    int numOfDigits;

    // The number ammount of unique numbers and number of digits are SET along with
    // maximun and minimun numbers in such age range.
    public void unRandNum(int numAmmount, int numOfDigits) {
        if (numOfDigits == 1) {
            if (numAmmount > 10) {
                this.numAmmount = 10;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 0;
            this.maxNum = 10;
            this.numOfDigits = numOfDigits;
            numbersGenerators();
        }

        else if (numOfDigits == 2) {
            if (numAmmount > 90) {
                this.numAmmount = 90;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 10;
            this.maxNum = 100;
            this.numOfDigits = numOfDigits;
            numbersGenerators();
        }

        else if (numOfDigits == 3) {
            if (numAmmount > 900) {
                this.numAmmount = 900;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 100;
            this.maxNum = 100;
            numbersGenerators();
        }

        else if (numOfDigits == 4) {
            if (numAmmount > 9000) {
                this.numAmmount = 9000;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 1000;
            this.maxNum = 10000;
            numbersGenerators();
        }

        else if (numOfDigits == 5) {
            if (numAmmount > 90000) {
                this.numAmmount = 90000;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 10000;
            this.maxNum = 100000;
            numbersGenerators();
        }

        else if (numOfDigits == 6) {
            if (numAmmount > 900000) {
                this.numAmmount = 900000;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 100000;
            this.maxNum = 1000000;
            numbersGenerators();
        }

        else if (numOfDigits == 7) {
            if (numAmmount > 9000000) {
                this.numAmmount = 9000000;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 1000000;
            this.maxNum = 10000000;
            numbersGenerators();
        }

        else if (numOfDigits == 8) {
            if (numAmmount > 90000000) {
                this.numAmmount = 90000000;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 10000000;
            this.maxNum = 100000000;
            numbersGenerators();
        }

        else if (numOfDigits == 9) {
            if (numAmmount > 900000000) {
                this.numAmmount = 900000000;
                System.out.println("We're sorry for the inconvenience but lists of numbers with " + numOfDigits
                        + " digits have a maximun capacity of " + numAmmount + " elements.");
            } else {
                this.numAmmount = numAmmount;
            }
            this.minNum = 100000000;
            this.maxNum = 1000000000;
            numbersGenerators();
        }

        else {
            System.out.println("please enter a number digit from 1 to 9");
        }

    }

    // This method generates the random numbers with a TRIPPLE NESTED FOR LOOP WHOA!
    public void numbersGenerators() {
        System.out.println(
                "the numbers are: " + this.maxNum + " " + this.minNum + " " + this.numAmmount + " " + this.numOfDigits);
        int[] uniqueRandNum = new int[numAmmount];
        for (int i = 0; i < numAmmount; i++) {
            Random random = new Random();
            int randNum = random.nextInt(maxNum) + minNum;
            uniqueRandNum[i] = randNum;
        }
        for (int j = 0; j < uniqueRandNum.length; j++) {
            for (int l = 0; l < uniqueRandNum.length; l++) {
                if (j == l) {
                    continue;
                }
                // this method is to iterate trough the array and make sure that each element is
                // different from the other.
                // if an element is different from the
                if (uniqueRandNum[j] == uniqueRandNum[l]) {
                    Random randy = new Random();
                    int randyNum = randy.nextInt(maxNum) + minNum;
                    uniqueRandNum[j] = randyNum;
                    for (int k = 0; k < uniqueRandNum.length; k++) {
                        if (j == k) {
                            continue;
                        } else if (uniqueRandNum[j] == uniqueRandNum[k]) {
                            int randn = randy.nextInt(maxNum) + minNum;
                            uniqueRandNum[j] = randn;
                            k = -1;
                            // This commented line bellow is there in case you wish to see the array change
                            // digit by digit as each number becomes unique.
                            // System.out.println(Arrays.toString(uniqueRandNum));
                        }
                        continue;
                    }
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(uniqueRandNum));
    }
};
