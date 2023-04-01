package Week3Assignment;
public class Assignment {

    public static void main(String[] args) {
        int[] age = {3, 9, 23, 64, 2, 8, 28, 93, 3};
        int result = age[1] - age[age.length - 1];

        System.out.println(result);
        double sum = 0;

      for (int i = 0; i < age.length; i++) {
          sum += age[i];
      }

      double average = sum / age.length;
      System.out.println(average);

      String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int sumOfLetters = 0;
         for (int i = 0; i < names.length; i++) {
             sumOfLetters += names[i].length();
         }

         double averageLettersPerName = sumOfLetters / names.length;
         System.out.println(averageLettersPerName);

         String allNames = "";

         for (int i = 0; i < names.length; i++) {
            allNames += names[i];
            if(i < names.length - 1) {
                allNames += " ";
            }
         }

         System.out.println(allNames);

         // 3. you use a .length - 1, that way it will not stop at the end of the array and keep
        // it dynamic if you need to add more to the array
        // 4. you would use [0] since 0 marks the first element

        System.out.println("SPACE BREAK HERE");

        //5
       int[] nameLengths = new int[names.length];
       for (int i = 0; i < nameLengths.length; i++) {
           nameLengths[i] = names[i].length();
       }
        //6
       double nameLengthSum = 0;
       for (int i = 0; i < nameLengths.length; i++) {
           nameLengthSum = nameLengthSum + nameLengths[i];
           System.out.println(nameLengthSum);
       }


        System.out.println("SPACE BREAK HERE");

       //7
       String moreNonsense = nonSense("Hello", 3);
        p("thing");
       System.out.println(moreNonsense);



        System.out.println("SPACE BREAK HERE");

       //8
        String firstName = "John";
        String lastName = "Doe";
        String fullName = getFullName(firstName, lastName);
        System.out.println(fullName);



        System.out.println("SPACE BREAK HERE");

        //9
        int[] array = {5, 10, 15, 20, 25};
        boolean isSumGreaterThan100 = isSumGreaterThan100(array);
        System.out.println(isSumGreaterThan100);


        System.out.println("SPACE BREAK HERE");

        //10
        double[] array1 = {1.4, 2.1, 2.5, 5.6};
        double average1 = averageOfAllElements(array1);
        System.out.println(average);


        System.out.println("SPACE BREAK HERE");

        //11
        double[] arr1 = { 1.5, 2.0, 3.5, 2.5 };
        double[] arr2 = { 1.0, 2.5, 3.0, 4.0 };
        boolean isAvgOfFirstGreaterThanSecond = isAverageOfFirstArrayGreaterThanSecond(arr1, arr2);
        System.out.println("Is the average of the first array greater than the average of the second array? " + isAvgOfFirstGreaterThanSecond);


        System.out.println("SPACE BREAK HERE");

        //12
        boolean isHotOutside = true;
        double moneyInPocket = 15.0;
        boolean willBuy = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println("will you buy a drink? " + willBuy);

        System.out.println("SPACE BREAK HERE");

        //13
        String[] membershipStatus = {"isMember", "isNotMember", "isNotMember", "isMember", "isMember"};
        boolean[] isVoteAccepted = vote(membershipStatus);
        for (int i = 0; i < isVoteAccepted.length; i++) {
            if (isVoteAccepted[i]) {
                System.out.println("Voter " + (i + 1) + ": Vote Accepted");
            }else {
                System.out.println("Voter " + (i + 1) + ": Vote Not Accepted");

             }
        }



        // I Hope this makes it to github please

    }
    //7
    public static void p(String whatToPrint) {
        System.out.println(whatToPrint);
    }
    public static String nonSense(String word, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + word;
        }

        return result;
    }

    //8
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //9
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum >100;
    }


    //10
    public static double averageOfAllElements(double[] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    //11
    public static boolean isAverageOfFirstArrayGreaterThanSecond(double[] arr1, double[] arr2) {
        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[1];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        double avg1 = sum1 / arr1.length;
        double avg2 = sum2 / arr2.length;
        return avg1 > avg2;
    }

    //12
    public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {

        boolean willBuy;
        if (isHotOutSide && moneyInPocket > 10.50) {
            willBuy = true;
        } else {
            willBuy = false;
        }

        return willBuy;

    }

    //13 this method will tell a member or nonmember if their vote has been accepted.
    // Currently I am dealing with union voting issues and this idea came to mind to a sort of voting application
    // that would tell a voter if their vote was accepted or not depending on their membership status
    public static boolean[] vote(String[] membershipStatus) {
        boolean[] isVoteAccepted = new boolean[membershipStatus.length];
        for (int i = 0; i < membershipStatus.length; i++) {
            if (membershipStatus[i].equalsIgnoreCase("isMember")) {
                isVoteAccepted[i] = true;
            } else if (membershipStatus[i].equalsIgnoreCase("isNotMember")) {
                isVoteAccepted[i] = false;
            } else {
                System.out.println("Invalid membership status.");
                isVoteAccepted[i] = false;
            }


        }
        return isVoteAccepted;
    }

}
