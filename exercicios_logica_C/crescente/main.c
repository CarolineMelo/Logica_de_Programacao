#include <stdio.h>


int main()
{
    int n1,n2;
    printf("Digite dois numeros:\n");
    scanf("%d %d",&n1,&n2);

    while (n1 != n2){
        if(n1<n2)
        {
            printf("Cresente!\n");
        }
        else
        {
            printf("Decrescente!\n");
        }

        printf("Digite outros dois numeros:\n");
        scanf("%d %d", &n1, &n2);
    }
    return 0;
}
