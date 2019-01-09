/**
 *
 *  @author Bednarczyk Joanna PD2598
 *
 */

package zad2;


public class Main {

  public static void main(String[] args)
  {
    Item item = new Item();

    CreatorRunnable creatorRunnable = new CreatorRunnable(item);
    WeightCounterRunnable weightCounterRunnable = new WeightCounterRunnable(item);

    Thread threadA = new Thread(creatorRunnable, "Thread A");
    Thread threadB = new Thread(weightCounterRunnable, "Thread B");

    threadA.start();
    threadB.start();
  }
}
