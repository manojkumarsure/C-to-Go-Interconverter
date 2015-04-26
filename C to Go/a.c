#include<stdio.h>
int gen() {
    return 20;
}
int main() {
    int x,y;
    int x[10];
    for(x=0;x<10;x++) {
        y=x*x+gen();
        if(x==0)
            y=0;
        printf("%d\n",y);
    }
    
    return 0;
}