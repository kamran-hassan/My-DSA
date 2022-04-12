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

int partition(int arr[], int l, int h, int pivot){
    int j = l;
    for(int i=l;i<=h;i++){
        if(arr[i]<= pivot){
            swap(&arr[i],&arr[j]);
            j++;
        }
        /*
        Similar to 
         if(arr[i] > pivot){
            // equal or less 
            i++;
            //printarray(arr,10);
        }
        else {
            swap(&arr[i],&arr[j]);
            i++;
            j++;
        } my old logic for quick sort in quicksort.cpp
        */
    }
    //partition(arr,j,h,0,9);
    return j-1;
}

int main(){
    int arr[12] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    cout << partition(arr,0,11,0);
    printarray(arr,12);
    cout << partition(arr,4,11,1);
    printarray(arr,12);
}