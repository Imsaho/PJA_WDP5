package zad2;

public class WeightCounterRunnable implements Runnable {

  private Item item;

  private int totalWeight = 0;

  public WeightCounterRunnable(Item item)
  {
    this.item = item;
  }

  @Override
  public void run()
  {
    int itemWeight = item.getWeight();
    int counter = 0;

    while(itemWeight != -1) {
      totalWeight += itemWeight;
      counter ++;

      if (counter % 100 == 0)
        System.out.println("policzono wage " + counter + " obiektów");

      itemWeight = item.getWeight();
    }
    stop();
  }

  public void stop()
  {
    System.out.println(totalWeight);
  }
}
