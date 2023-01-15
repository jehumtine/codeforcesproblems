# include <iostream>

void solve(int w){
    int x = w-2;    
    int y = 2;
    if (x==0)
    {
        std::cout << "No" << std::endl;
    }
    else if (x%2 ==0)
    {
        std::cout << "Yes" << std::endl;
    }
    else{
        std::cout << "No" << std::endl;
    }
}

int main(){
   int n;
   std::cin>>n;
   solve(n); 
    
    return 0;
}