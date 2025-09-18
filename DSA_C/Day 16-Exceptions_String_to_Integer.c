#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    cin >> s;
    try {
        int val = stoi(s);  
        cout << val << endl;
    } catch (exception &e) 
	{
        cout << "Bad String" << endl;
    }
    return 0;
}
