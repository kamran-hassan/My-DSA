#include <bits/stdc++.h>
using namespace std;

int revers(int arr[],int n){
    cout << "array before reverse\n";
    for(int i = 0;i<n;i++)
        cout << arr[i] <<" ";
    // for reversing
    for(int i = 0;i<n/2;i++){
        arr[i] = arr[i]+arr[n-1-i];
        arr[n-1-i] = arr[i]-arr[n-1-i];
        arr[i] = arr[i]-arr[n-1-i];
    }
    cout << "array after reverse\n";
    for(int i = 0;i<n;i++)
        cout << arr[i] <<" ";


    return 0;
}

int main()
{
    int size;
    cout << "Give the size of array" << endl;
    cin >> size;
    int arr[size];
    for(int i =0;i<size;i++)
        cin >> arr[i];
    cout << "you have entered --------\n";
    revers(arr,size);
        return 0;
}