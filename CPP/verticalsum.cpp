// { Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
//User function Template for C++

int minimum_vertical_sum(vector<vector<int>>v)
{
    //Your code here
    int max_size = INT_MIN;
    int min = INT_MAX;
    int sum = 0;
    for(vector <int> &v1:v){
        if(int(v1.size()) > int(max_size)){
            max_size = int(v1.size());
        }
    }
    cout << "max_size is " << max_size << endl;
    for(vector <int> &v1:v)
        v1.resize(max_size,0);

    for(vector <int> &v1:v){
        for(int &x:v1)
            cout << x << " ";
            cout << "\n";}

    for(int i = 0;i < max_size;i++){
        sum =0;
        for(int j = 0;j < v.size();j++){
            sum =  sum + v[j][i];
        }
        cout << sum << endl;
        if(sum<min){
            min = sum;
        }
    }

    return min;
}

// { Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    vector<vector<int>>v;
	    for(int i=0;i<n;i++)
	    {
	        int m;
	        cin>>m;
	        vector<int>temp;
	        for(int j=0;j<m;j++)
	        {
	            int k;
	            cin>>k;
	            temp.push_back(k);
	        }
	        v.push_back(temp);
	    }
	    int min_sum=minimum_vertical_sum(v);
	    cout<<min_sum<<endl;
	}
	return 0;
}
  // } Driver Code Ends