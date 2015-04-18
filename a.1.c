#include<stdio.h>
int gen() {
    return 20;
}
int main() {
    int x,y,*z;
    float a,b,c;
    for(x=0;x<10;x++) {
        y=x*x+gen();
        if(x==0)
            if(z==0)
                y=0;
        z = &y;
    }
    printf("%d\n",y%x);
    return 0;
}