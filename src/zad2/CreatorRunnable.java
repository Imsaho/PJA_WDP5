package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreatorRunnable implements Runnable {

  private Item item;

  public CreatorRunnable (Item item)
  {
    this.item = item;
  }

  @Override
  public void run() {
    String fname = ".." + System.getProperty("file.separator") + "Towary.txt";

    int counter = 0;

    try {
      Scanner scan = new Scanner(new File(fname));
        while (scan.hasNextLine()) {
          String[] itemInfo = scan.nextLine().split(" ");

          int id = Integer.parseInt(itemInfo[0]);
          int weight = Integer.parseInt(itemInfo[1]);

          item.setItemInfo(id, weight);
          counter ++;

          if (counter % 200 == 0)
            System.out.println("utworzono " + counter + " obiektów");
        }
        scan.close();

        // Ustawienie warunku, który zakończy działanie programu
        item.setItemInfo(-1, -1);
    } catch (FileNotFoundException ex) {
      //...
    }
  }
}
