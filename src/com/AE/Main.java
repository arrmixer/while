package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 6;
////        while(count != 6){
////            System.out.println("Count value is " + count + ".");
////            count++;
////        }
////        count = 1;
////        while(true){
////            if(count == 6){
////                break;
////            }
////            System.out.println("Count value is " + count + ".");
////            count++;
////        }
//        do{
//            System.out.println("Count value was " + count + ".");
//            count++;
//            if(count > 100){
//                break;
//            }
//
//        }while(count != 6);
//        int count = 0;
//        while(count <=6){
//            if (isEvenNumber(count)){
//                System.out.println(count + " is an even number.");
//
//            }
//            count++;
//        }

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }else{
                evenNumbersFound++;
                if (evenNumbersFound >= 5){
                    System.out.println("Exiting loop.");
                    System.out.println("Total even numbers found are " + evenNumbersFound + ".");
                    break;
                }
            }
            System.out.println("Even number " + number);
            number++;
        }

    }

    public static Boolean isEvenNumber(int n){
        if ((n%2) != 0){
            return false;
        }else{
            return true;
        }
    }
}
