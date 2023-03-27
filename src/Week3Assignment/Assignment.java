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
        for (String name : names) {
            sumOfLetters += name.length();

            System.out.println(sumOfLetters);

            // I Hope this makes it to github
        }
    }
}
