package zad2;

public class Item {

  private int id;

  private int weight;

  private boolean newItem = false;

  public Item()
  {
  }

  synchronized void setItemInfo(int id, int weight)
  {
    while (newItem) {
      try {
        wait();
      } catch(InterruptedException exc) {
        // ...
      }
    }

    this.id = id;
    this.weight = weight;

    newItem = true;
    notifyAll();
  }

  synchronized int getWeight()
  {
    while (!newItem) {
      try {
        wait();
      } catch(InterruptedException exc) {
        // ...
      }
    }

    newItem = false;
    notifyAll();

    return weight;
  }
}
