#include <iostream>
using std::string;
bool compareFunction(string s1, string s2){
    int x = s1.compare(s2);
    if(x ==0){
        return true;
    }else{
        return false;
    }
}

 int main() {

    int n;
    int x =0;
    std::cin>>n;
    std::string l[n];
    for (int i = 0; i < n; i++)
    {
        string s;
        /*for (int i = 0; i < 3; i++)
        {
            string m;
            std::cin>>m;
            s.append(m);     
        }*/
        

       
        std::cin>>s;
        l[i]=s;
    }

    std:: string preAdd = "++X";
    std:: string postAdd = "X++";
    std:: string preSub = "--X";
    std:: string postSub = "X--";
    for (int i = 0; i < n; i++)
    {
        
        if (compareFunction(l[i],postAdd) or compareFunction(l[i],preAdd))
        {
            x++;
        }
        if (compareFunction(l[i],postSub) or compareFunction(l[i],preSub))
        {
            x--;
        }
        else
        {
            continue;
        }
    }

    std::cout << x << std::endl;

    return 0;
}