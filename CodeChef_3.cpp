
/**
 *    author:  Abhishek Chauhan
 *    created: Fri Apr  8 20:31:42 IST 2022
**
**/


/*कर्पूरगौरं- कर्पूर के समान गौर वर्ण वाले. करुणावतारं-
करुणा के जो साक्षात् अवतार हैं. संसारसारं- समस्त 
सृष्टि केजो सार हैं. भुजगेंद्रहारम्- इस शब्द का अर्थ है
जो सांप को हार के रूप में धारण करते हैं.*/
#include<bits/stdc++.h>
using namespace std;
void BhagWat_Geeta(){
        int apple,boy;
        cin>>apple;
        cin>>boy;
        if(boy%apple==0)
        {


            /*कर्पूरगौरं- कर्पूर के समान गौर वर्ण वाले. करुणावतारं-
करुणा के जो साक्षात् अवतार हैं. संसारसारं- समस्त 
सृष्टि केजो सार हैं. भुजगेंद्रहारम्- इस शब्द का अर्थ है
जो सांप को हार के रूप में धारण करते हैं.*/
            int ans=boy/apple-1;
            if(ans<0)
           {
               cout<<0<<endl;
           }
           else
           {
                cout<<ans<<endl;
           }
        }

        /*कर्पूरगौरं- कर्पूर के समान गौर वर्ण वाले. करुणावतारं-
करुणा के जो साक्षात् अवतार हैं. संसारसारं- समस्त 
सृष्टि केजो सार हैं. भुजगेंद्रहारम्- इस शब्द का अर्थ है
जो सांप को हार के रूप में धारण करते हैं.*/
        else
        {
            int ans=boy/apple;
            cout<<ans<<endl;       
        }


}
int32_t main() {
    int t;
    cin>>t;

    /*कर्पूरगौरं- कर्पूर के समान गौर वर्ण वाले. करुणावतारं-
करुणा के जो साक्षात् अवतार हैं. संसारसारं- समस्त 
सृष्टि केजो सार हैं. भुजगेंद्रहारम्- इस शब्द का अर्थ है
जो सांप को हार के रूप में धारण करते हैं.*/
    while(t--){
        BhagWat_Geeta();
    }
    return 0;
}