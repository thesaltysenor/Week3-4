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

        int[] nameLengths;


            // I Hope this makes it to github please

    }
}
