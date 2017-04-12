// Xcode에서 작성하였습니다.
#include <stdio.h>
#include <stdlib.h>

int main(void) {
    
    int r, c, i, j, n;
    int start = 1;
    int **arr;
    
    while(1) {
        //값 입력받아서 배열 만들기
        printf("Enter the size of magic square : ");
        scanf("%d", &n);
        
        if(n % 2 == 0 || n == 1) {
            
            puts("1을 제외한 홀수를 입력하세요");
            
        } else {
            
            arr = (int**) malloc(sizeof(int*) * n);
            
            for(i=0; i<n; i++) {
                arr[i] = (int*) malloc(sizeof(int*) * n);
            }
            
            for(i=0; i<n; i++) {
                for(j=0; j<n; j++) {
                    arr[i][j] = 0;
                }
            }
            
            break;
            
        }
    }
    //출발지점 정하기
    r = 0;
    c = n/2;
    
    arr[r][c] = start;
    
    for(i=0; i<(n*n)-1; i++) {
        
        r--;
        c++;
        
        if((r < 0 && c > n-1)) {
            //printf("1\n");
            r += 2;
            c --;
        }
        
        if(r < 0) {
            //printf("3\n");
            r = n-1;
        } else if(c > n-1) {
            //printf("4\n");
            c = 0;
        }
        
        if(arr[r][c] != 0) {
            //printf("2\n");
            r += 2;
            c --;
        }
        
        arr[r][c] = ++start;
        //printf("%d %d %d\n", r, c, arr[r][c]);
        
    }
    
    puts("");
    //출력
    for(i = 0; i<n; i++) {
        for(j =0; j<n; j++) {
            printf("%3d ", arr[i][j]);
        }
        puts("");
    }
    
    return 0;
}
