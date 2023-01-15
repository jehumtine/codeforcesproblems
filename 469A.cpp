#include <iostream>
#include <list>
using std::cin, std::cout, std::list, std::advance;

int main(){
    int n,p,x;
    cin>>n;
    cin>>p;
    list<int> y;
    
    for (int i = 0; i < p; i++)
    {
        int a;
        cin>>a;
        y.push_back(a);
    }
    cin>>x;
    list<int> t;
    for (int i=0;i<x;i++){
        int a;
        cin>>a;
        t.push_back(a);
    }
    y.merge(t);
    y.sort();
    auto itr=y.begin();
    advance(itr,y.size()-1);

    if (*itr ==n)
    {
        std::cout << "I become the guy." << "\n";
    }else{
        std::cout << "Oh, my keyboard!" << "\n";
    }
       

    return 0;
}