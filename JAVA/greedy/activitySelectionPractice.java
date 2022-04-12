import java.util.*;
public class activitySelectionPractice {
    public static void main(String[] args){
        ArrayList<Activity> activityList = new ArrayList<Activity>();
        activityList.add(new Activity(2,4));
        activityList.add(new Activity(3,8));
        activityList.add(new Activity(1,3));
        activityList.add(new Activity(10,11));

        //Arrays.sort(activityList,new MyCmp());



        activityList.sort(new MyCmp());

        System.out.println("Total Activity = "+getMaxActivityCount(activityList));


        //for(Activity activity : activityList) System.out.println(activity.finish);
    }

    static int getMaxActivityCount(ArrayList<Activity> activityList){
        Activity a1 = activityList.get(0);
        int t=1;
        System.out.println("Activity "+t+"->("+a1.start+","+a1.finish+")");
        for(int i=1;i<activityList.size();i++){
            if(activityList.get(i).start >= a1.finish){
                a1 = activityList.get(i);
                t++;
                System.out.println("Activity "+t+"->("+a1.start+","+a1.finish+")");
            }

        }

        return t;
    }
}

class Activity{
    int start;
    int finish;
    Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
class MyCmp implements Comparator<Activity>
{
	public int compare(Activity a1, Activity a2)
	{
		return a1.finish - a2.finish;
	}
}
