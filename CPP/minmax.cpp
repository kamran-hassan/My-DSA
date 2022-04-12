#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cout << "please inter the size of array";
    cin >> n;
    int arr[n],min,max;
    for(int i =0;i<n;i++)
    cin >> arr[i];
    min = arr[0];
    max =  arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]<min)
        min = arr[i];
        else if(arr[i]>max)
        max = arr[i];
        }
    cout << max << " " << min;
    return 0;
}