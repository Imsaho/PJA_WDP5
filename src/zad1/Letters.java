package zad1;

import java.util.ArrayList;

public class Letters
{
  private ArrayList<Thread> threads = new ArrayList<>();

  public Letters(String s)
  {
    char[] chars = s.toCharArray();
    for (char l : chars) {
      Thread t = new Thread(new LettersRunnable(l), "Thread " + String.valueOf(l));
      threads.add(t);
    }
  }

  public ArrayList<Thread> getThreads()
  {
    return threads;
  }

  public void start()
  {
    for (Thread t : threads) t.start();
  }

  public void stop()
  {
    for (Thread t : threads) t.interrupt();
  }
}
