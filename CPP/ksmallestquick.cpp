#include <bits/stdc++.h>
using namespace std;

int swap(int *a, int *b){
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;
    return 0;
}
int main()
{
int n;
cout << "please inter the size of array";
cin >> n;
int arr[n];
for(int i =0;i<n;i++)
    cin >> arr[i];
cout << "tell k for now kth smallest";
int k;
cin >> k;
for(int i =0; i <n-1;i++){
    for(int j=0;j<n-1;j++){
        if(arr[j]>arr[j+1]){
            swap(&arr[j],&arr[j+1]);
        }
    }
}

cout << arr[k-1];

for(int i =0;i<n;i++)
    cout << arr[i] << " ";


}