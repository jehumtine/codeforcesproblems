#include <iostream>

int main(){
    int n;
    std::cin>>n;
    std::string l[n];
    for (int i = 0; i < n; i++)
    {   
        std::string a;
        std::cin>>a;
        l[i]= a;
    }
    for(int i =0;i<n; i++){
        if (l[i].length()>10)
        {
            std::cout << l[i][0]<<l[i].length()-2<<l[i][l[i].length()-1] << std::endl;
        }
        else{
            std::cout << l[i] << std::endl;
        }
        
    }
    

    return 0;
}