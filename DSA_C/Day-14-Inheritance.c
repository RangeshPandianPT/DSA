#include <iostream>
#include <vector>

using namespace std;


class Person{
	protected:
		string firstName;
		string lastName;
		int id;
	public:
		Person(string firstName, string lastName, int identification){
			this->firstName = firstName;
			this->lastName = lastName;
			this->id = identification;
		}
		void printPerson(){
			cout<< "Name: "<< lastName << ", "<< firstName <<"\nID: "<< id << "\n"; 
		}
	
};

class Person {
protected:
    string firstName;
    string lastName;
    int idNumber;
public:
    Person(string firstName, string lastName, int identification) {
        this->firstName = firstName;
        this->lastName = lastName;
        this->idNumber = identification;
    }
    void printPerson() {
        cout << "Name: " << lastName << ", " << firstName << "\n";
        cout << "ID: " << idNumber << "\n";
    }
};

class Student : public Person {
private:
    vector<int> testScores;
public:
    //  Constructor
    Student(string firstName, string lastName, int id, vector<int> scores)
        : Person(firstName, lastName, id) {
        this->testScores = scores;
    }

    //  Calculate method
    char calculate() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        int avg = sum / testScores.size();

        if (avg >= 90 && avg <= 100) return 'O'; // Outstanding
        if (avg >= 80) return 'E';               // Exceeds Expectations
        if (avg >= 70) return 'A';               // Acceptable
        if (avg >= 55) return 'P';               // Poor
        if (avg >= 40) return 'D';               // Dreadful
        return 'T';                              // Troll
    }
};


int main() {
	string firstName;
  	string lastName;
	int id;
  	int numScores;
	cin >> firstName >> lastName >> id >> numScores;
  	vector<int> scores;
  	for(int i = 0; i < numScores; i++){
	  	int tmpScore;
	  	cin >> tmpScore;
		scores.push_back(tmpScore);
	}
	Student* s = new Student(firstName, lastName, id, scores);
	s->printPerson();
	cout << "Grade: " << s->calculate() << "\n";
	return 0;
}