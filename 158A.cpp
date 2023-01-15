#include <iostream>

int main(){
    int n,k;
    
    std::cin>>n;
    std::cin>>k;
    int l[n];
    int count =0;
    for (int i = 0; i < n; i++)
    {
        int m;
        std::cin>>m;
        l[i]= m;
    }
    for (int i = 0; i < n; i++)
    {
        if (l[i] >0 && l[i]>=l[k-1])
        {
            count++;
            
    }
    else{
        continue;
    }
    //std::cout<<l[i];    
    }
    std::cout<<count<<std::endl;
    
    
    return 0;
}