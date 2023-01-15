#include <iostream>

int main(){
    int n;
    int counter = 0;
    std::cin>>n;
    
    for (int i = 0; i < n; i++)
    {
         int l[3];            
         for (int i = 0; i < 3; i++){
         int p;    
         std::cin>>p;
         l[i]= p;
         //std::cout << "Jehu" ;
         }
         std::cout<<std::endl;
          if (l[0]==1 and l[1] ==1 )
     {
         counter++;
     }
     else if(l[1]==1 and l[2] ==1){
         counter++;
     }
     else if(l[0]==1 and l[2] ==1){
         counter++;
     }
     
   // std::cout<<counter;
    }
     std::cout<<counter;  
    
    

    return 0;
}