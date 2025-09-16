#include <iostream>
#include <vector>
#include <climits>
using namespace std;

class Difference 
{
private:
    vector<int> elements;  

public:
    int maximumDifference; 

    Difference(vector<int> arr) 
	{
        elements = arr;
        maximumDifference = 0;
    }

    void computeDifference() 
	{
        int minVal = INT_MAX, maxVal = INT_MIN;

        for (int num : elements) 
		{
            if (num < minVal) minVal = num;
            if (num > maxVal) maxVal = num;
        }

        maximumDifference = maxVal - minVal;
    }
};

int main() 
{
    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i = 0; i < n; i++) 
	{
        cin >> arr[i];
    }

    Difference d(arr);
    d.computeDifference();

    cout << d.maximumDifference << endl;

    return 0;
}
