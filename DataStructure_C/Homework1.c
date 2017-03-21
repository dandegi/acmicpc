
// Xcode에서 작성했습니다.

#include <stdio.h>
#include <string.h>

void AnsWrite(int ans[], char str[]) {
    
    for(int i=0; i<strlen(str); i++) {
        
        //대문자일때문자를 소문자로 바꿈
        if(str[i]>=65 && str[i]<=90) {
            
            ans[str[i] - 65]++;
            str[i] += 32;
            
        }else if(str[i]>=97 && str[i]<=122){
            
            ans[str[i] - 97]++;
            
        }
        
    }
    
}

void AnsPrint(int ans[], char str[]) {
    
    printf("Result are follows: \n");
    
    for(int i=0; i<26; i++) {
        
        if(ans[i] == 0) {
            continue;
        } else {
            
            printf(">> %c: %d\n", i+97, ans[i]);
            
        }
        
    }
    
}

int main(void) {
    //1000자리까지 입력가능
    char str[1001];
    int ans[26];
    
    printf("Enter the sentence: ");
    fgets(str, sizeof(str), stdin);
    str[strlen(str) - 1] = '\0';
    
    AnsWrite(ans, str);
    AnsPrint(ans, str);
    
    return 0;
}
