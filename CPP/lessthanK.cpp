#include<iostream>
#include<utility>
#include<vector>
using namespace std;

vector <int> lessthan(vector <int> arr,int n,int k){
    vector <int> lessarr;
    for(int &x: arr){
        if(x<k)
        lessarr.push_back(x);
    }
    return lessarr;
}
int main() {
    vector <int> v{10,50,65,20,30,80,5,90,40,55};
    vector <int> v2;
    v2 = lessthan(v, v.size(),40);
    for(int i:v2)
    cout << i << " ";


}