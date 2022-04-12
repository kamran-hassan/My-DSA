#include <bits/stdc++.h>
using namespace std;

int main()
{
int n,m;
cout << "please inter the size of 1st array";
cin >> n;
int a[n];
for(int i =0;i<n;i++)
    cin >> a[i];
cout << "please inter the size of 2nd array";
cin >> m;
int b[m];
for(int i =0;i<m;i++)
    cin >> b[i];

int c[m+n];
for(int i=0;i<m+n;i++){
    if(i<n){
        c[i] = a[i];
    }
    else{
        c[i] = b[i-n];
    }
}
int j,i;
int arr2[m+n];
for(i= 0,j=0;i<m+n;i++){
    int key = c[i];
    int exixt = 0;
    for(int k= 0;k<i;k++){
        if(arr2[k] == key)
        exixt = 1;
    }
    if(!exixt){
        arr2[j] = c[i];
        j++;
    }
}

/*for(int i = 0;i<j;i++)
    cout << arr2[i] << " ";
}*/
cout << j;   
}