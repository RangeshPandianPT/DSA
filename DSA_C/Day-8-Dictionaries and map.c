#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <search.h>   // for hcreate, hsearch, ENTRY

int main() {
    int n;
    scanf("%d", &n);

    
    hcreate(n);

   
    for (int i = 0; i < n; i++) {
        char name[50], phone[20];
        scanf("%s %s", name, phone);

        ENTRY e, *ep;
        e.key = strdup(name);
        e.data = strdup(phone);

        hsearch(e, ENTER); // insert into hash table
    }

    char query[50];
    while (scanf("%s", query) != EOF) {
        ENTRY e, *ep;
        e.key = query;

        ep = hsearch(e, FIND);
        if (ep != NULL) {
            printf("%s=%s\n", ep->key, (char*)ep->data);
        } else {
            printf("Not found\n");
        }
    }

    return 0;
}
