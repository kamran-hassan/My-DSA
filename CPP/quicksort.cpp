#include <bits/stdc++.h>
using namespace std;

int printarray(int a[],int n)
{
    for(int ii=0;ii<n;ii++)
        cout << a[ii] << ", ";
    cout << "\n";
    return 0;
}
int swap(int *a, int *b){
    int temp = *a ;
    *a = *b;
    *b = temp;
    return 0;
}

int partition(int arr[],int low,int high){
    int i = low;
    int j = low;
    int pivot = arr[high];
    while(i<=high){
        if(arr[i] > pivot){
            // equal or less 
            i++;
            //printarray(arr,10);
        }
        else {
            swap(&arr[i],&arr[j]);
            i++;
            j++;
        }
    }
    
    return j-1;
}

/*  idea partition
int partition(int arr[],int low,int high,int p){
    int i = low;
    int j = low;

    while(i<high){
        if(arr[i] > arr[p]){
            i++;
        }
        else{
            // equal or less 
            swap(&arr[i],&arr[j]);
            i++;
            j++;
            printarray(arr,10);
        }
    }
    
    return j-1;
}
*/

int quick(int arr[], int lo, int hi){
    if(lo > hi){
        return 0;
    }
    int part = partition(arr,lo,hi);
    quick(arr,lo,part-1);
    quick(arr,part+1,hi);
    return 0;
}


int main(){
    int arr[13] = {2,8,1,9,5,7,3,6,10,12,4,15,20};
    //cout << partition(arr,0,9);
    //cout << partition(arr,0,2);
    quick(arr,0,12);
    printarray(arr,13);
    return 0;
}