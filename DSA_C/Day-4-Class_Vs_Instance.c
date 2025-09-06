//DAY-4

#include <stdio.h>

typedef struct{
    int age;
} Person;


Person createPerson(int initialAge){
    Person p;
    if (initialAge < 0){
        printf("Age is not valid, setting age to 0.\n");
        p.age = 0;
    } else {
        p.age = initialAge;
    }
    return p;
}

void amIOld(Person *p){
    if (p->age < 13){
        printf("You are young.\n");
    } else if (p->age >= 13 && p->age < 18){
        printf("You are a teenager.\n");
    } else {
        printf("You are old.\n");
    }
}

void yearPasses(Person *p){
    p->age++;
}

int main() {
    int t, age;
    scanf("%d", &t);

    for (int i = 0; i < t; i++){
        scanf("%d", &age);
        Person p = createPerson(age);
        amIOld(&p);
        for (int j = 0; j < 3; j++){
            yearPasses(&p);
        }
        amIOld(&p);
        printf("\n");
    }

    return 0;
}
