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
int comma=0;
int commb=0;
for(int i = 0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(a[i]==a[j])
        comma++;
    }
}
for(int i = 0;i<m;i++){
    for(int j=i+1;j<m;j++){
        if(b[i]==b[j])
        commb++;
    }
}
int comman = 0;
if(n<m){
for(int i = 0; i<n;i++){
    for(int j = 0;j<m;j++){
        if(a[i] = b[j]){
        comman++;
        break;
        }
    }
}
}
else{
for(int i = 0; i<m;i++){
    for(int j = 0;j<n;j++){
        if(b[i] == a[j]){
        comman++;
        break;
        }
    }
}
}

cout << (m-comma)+(n-commb)-comman;
}