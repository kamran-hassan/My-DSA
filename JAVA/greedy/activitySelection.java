import java.util.*;
public class activitySelection{

    public static void main(String[] args){
    Activity a[] = new Activity[5];  // five activity {new ..., new ...., new..., like this}
    a[0] = new Activity(1,2);
    a[1] = new Activity(4,7);
    a[2] = new Activity(3,7);
    a[3] = new Activity(7,8);
    a[4] = new Activity(6,8);
    Arrays.sort(a);
    for(Activity x : a){
        System.out.println(x.start + " " + x.end);
    }

}

}

class Activity{
    int start, end;
    Activity(int s,int e){start=s;end=e;}
}