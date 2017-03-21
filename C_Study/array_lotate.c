

#include <stdio.h>


void result(int (*a)[4]) {
    
    for(int i=0; i<4; i++) {
        for(int j=0; j<4; j++) {
            
            printf("%3d ", a[i][j]);
        }
        printf("\n");
    }
    
}

void Rotate(int (*a)[4]) {
    int temp[4][4];
    
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++)
            temp[j][3-i]=a[i][j];
    }
    
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++)
            a[i][j]=temp[i][j];
    }
}

int main(void) {
    
    int arr[4][4] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    
    int i=4;
    
    while(i!=0) {
        
        Rotate(arr);
        result(arr);
        printf("\n");
        i--;
    }
    
    return 0;
}
