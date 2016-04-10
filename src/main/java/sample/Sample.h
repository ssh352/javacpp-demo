#include <stdio.h>

class Sample {
public:
    long id;
    Sample(int id) :
            id(id) {
    }
    virtual ~Sample() {
    }

    virtual int add(int a, int b) {
        return 0;
    }

    virtual int minus(int a, int b) {
        return 0;
    }

    virtual void printId() {
        printf("id=%d\n", id);
    }

};
