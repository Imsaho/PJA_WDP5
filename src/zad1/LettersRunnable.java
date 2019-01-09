package zad1;

public class LettersRunnable implements Runnable
{
  private String letter;

  public LettersRunnable(char letter)
  {
    this.letter = String.valueOf(letter);
  }

  @Override
  public void run()
  {
    while (true) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        return;
      }

      System.out.print(letter);
    }
  }
}
