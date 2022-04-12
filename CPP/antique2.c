#include <bits/stdc++.h>
using namespace std;

bool foundin(int arr[],int size,int match){
bool check = false;
for(int i = 0;i<size;i++){
    if(arr[i] == match){
    check = true;
    break;
    }
}
return check;
}

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
for(int i=0;i<m+n;i++)
    cout << c[i] << " ";
int found[m+n];
int f=-1;

int comma= 0;
for(int i = 0;i<n+m;i++){
    for(int j=i+1;j<n+m;j++){
        if(!foundin(found,f,c[i]) && c[i]==c[j]){
        comma++;
        f++;
        found[f] = c[i];
        }
    }
}

cout << comma-1;
}