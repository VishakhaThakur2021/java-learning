package task;

public class Droid {
  String name;
  int batteryLevel;

  public Droid(String droidName){
    name=droidName;
    batteryLevel=100;
  }
  public String toString(){
    return "Hello, I’m the droid: droidNameHere " + name;
  }
  public void performTask(String task){
    System.out.println("“name is performing task: task“:" + task );
    int level =batteryLevel-10;
    batteryLevel=level;
  }
  public void energyReport(){
    System.out.println(batteryLevel);
  }


  public static void main (String[] args){
    Droid Codey=new Droid("piya");
    Codey.performTask("dancing");
    Codey.energyReport();
    System.out.println(Codey);







  }
}

