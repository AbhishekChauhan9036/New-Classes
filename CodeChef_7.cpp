/**
 *    author:  Abhishek Chauhan
 *    created: Fri Apr  8 20:13:53 IST 2022 
**
**/
#include<bits/stdc++.h>
using namespace std;
void BhagWat_Geeta(){
    long long int x;
     cin>>x;
     long long int a,b,c,r;
     if(x<=5 || x%2!=0)
         cout<<-1<<endl;
     else
     {
         a=0;
            c=x/2;
            b=2;
            r=b^c;
            if(r<c)
            {
                cout<<a<<" "<<b<<" "<<c<<endl;
            }
            else
                cout<<-1<<endl;
     }
     cout<<endl;

}
int32_t main() {
    int t;
    cin>>t;
    while(t--){
        BhagWat_Geeta();
    }
	return 0;
}