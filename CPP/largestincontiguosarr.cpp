#include <bits/stdc++.h>
using namespace std;

int main(){
    int arr[6] = {-5, 4, 6, -3, 4, -1};
    int main_max = 0;
    int current_max = 0;

    /*we will add element to the current_max if it appears to be less than 0 then we will leave at that point and
    start counting it again*/
    for(int i = 0;i<6;i++){
        current_max += arr[i];
        if(current_max<=0){
            current_max = 0;
        }
        if(main_max < current_max){
            main_max = current_max;
        }
            }
        cout << main_max;

}