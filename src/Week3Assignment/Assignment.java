package Week3Assignment;
public class Assignment {

    public static void main(String[] args) {
        int[] age = {3, 9, 23, 64, 2, 8, 28, 93, 3};
        int result = age[0] - age[age.length - 1];

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

       int[] nameLengths = new int[names.length];
       for (int i = 0; i < nameLengths.length; i++) {
           nameLengths[i] = names[i].length();
       }

       double nameLengthSum = 0;
       for (int i = 0; i < nameLengths.length; i++) {
           nameLengthSum = nameLengthSum + nameLengths[i];
           System.out.println(nameLengthSum);
       }

       String moreNonsense = nonSense("Hello", 3);
        p("thing");
       System.out.println(moreNonsense);


        int[] array = {5, 10, 15, 20, 25};
        boolean isSumGreaterThan100 = isSumGreaterThan100(array);
        System.out.println(isSumGreaterThan100);

        double[] array1 = {1.4, 2.1, 2.5, 5.6};
        double average1 = averageOfAllElements(array1);
        System.out.println(average);


        // I Hope this makes it to github please

    }
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

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum >100;
    }



    public static double averageOfAllElements(double[] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }



}
