package zad2;

import java.util.Random;

public class generator {

  public static void main(String[] args) {


    Random generator = new Random();

    for (int i = 0; i <= 10000; i++) {
      int towarId = generator.nextInt(1000);
      int waga = generator.nextInt(10000);

      System.out.println(towarId + " " + waga);
    }


  }

}
