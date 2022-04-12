public class thearr {
    public static void main(String[] args){
        int []a = {5,8,7};
        int sum = 0;
        for(int i=0;i<a.length;i++){
            a[i] = i+5;
        }
        for(int item:a){
            sum += item;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(sum);

    }
}
