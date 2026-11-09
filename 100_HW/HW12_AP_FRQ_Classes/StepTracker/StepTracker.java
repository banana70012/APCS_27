public class StepTracker{
   private int steps;
   private int days;
   private int actdays;
   private double ave;
   private int min;
   public StepTracker(int s){
        min = s;
   }
   public void addDailySteps(int s){
        steps = steps+s;
        days++;
        if(s>=min){
            actdays++;
        }
   }
   public int activeDays(){
        return actdays;
   }
   public int averageSteps(){
        return steps/days;
   }
}