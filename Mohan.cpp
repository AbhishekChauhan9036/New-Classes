#include<bits/stdc++.h>
using namespace std;
#define int long long
int32_t main()
{
    int t,n,m,i,j,k,l,flag=0;
    scanf("%d",&t);
    while(t--)
    {
        cin>>n>>m;
        int a[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
               cin>>a[i][j];
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i][j]==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        if(flag==1)
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
    return 0;
}