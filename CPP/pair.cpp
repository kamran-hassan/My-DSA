#include<iostream>
#include<utility>
#include <bits/stdc++.h>
using namespace std;

int main(){
    // 3 1 2
    // I J K
    int n,a;
    char b;
    cout << "give the size of input ";
    cin >> n;
    pair <int, char> pairArr[n];

    for(int i =0;i<n;i++){
        cout << "enter fist value ";
        cin >> a;
        cout << "enter second value ";
        cin >> b;
        pairArr[i] = {a,b};
    }

    for(int i = 0;i<n;i++)
    cout << pairArr[i].first << " " << pairArr[i].second << "\n";

    sort(pairArr,pairArr+n);

    for(int i = 0;i<n;i++)
    cout << pairArr[i].first << " " << pairArr[i].second << "\n";
}