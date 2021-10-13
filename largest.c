#include<stdio.h>
int main()
    {
        int a,b,c;
        printf("Enter the values of numbers to be compared");
        scanf("%d %d %d", &a,&b,&c);
        if ((a>b) && (a>c))
        {
            printf("%d is the biggest",a);
            
        }
        
        else if ((b>a) && (b>c))
        {
            printf("%d is the greatest",b);
            
            
        }
        
        else
        {
            printf("%d is big",c);
            
        }
        
        return 0;
    }
