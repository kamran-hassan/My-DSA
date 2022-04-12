// { Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
//User function Template for C++

//vector<int> v: containing N elements
// Find and return vector of elements containing
// prime number at prime index
bool isprime(int n) {
   int i, flag = 0;
   for(i=2; i<=n/2; ++i) {
      if(n%i==0) {
         flag=1;
         break;
      }
   }
   if (flag==0)
   return true;
   else
   return false;
}
vector<int> prime_at_prime(vector<int>v)
{
    // Your code here
    vector <int> primevalue;
    vector <int> v2;
    
    for(int i=2;i<v.size();i++){
    if(isprime(i))
    primevalue.push_back(i);
    }
    for(int x:primevalue){
        if(isprime(v[x-1]))
        v2.push_back(v[x-1]);
    }
    
    
    return v2;
    
}


// { Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    vector<int>v;
	    for(int i=0;i<n;i++)
	    {
	        int m;
	        cin>>m;
	        v.push_back(m);
	    }
	    vector<int>result=prime_at_prime(v);
	    for(auto i:result)
	    {
	        cout<<i<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}



  // } Driver Code Ends