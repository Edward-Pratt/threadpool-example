public class Job implements Runnable{
  private int jobNumberl

  Job (int) jobNumber{
    this.jobNumber = jobNumber;
  }
  public void run () {
    System.out.println("Job:" + jobNumber + "is being processed by thread : " + Thread.currentThread().getName());
  try {
    Thread.sleep(1000);
  } catch (InterruptedException e){}
  System.out.println("Job: " + jobNumber + " is ending in thread : " + Thread.currentThread().getName());
  }
}
