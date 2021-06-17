#include <iostream>
#include <fstream>
#include <string>
#include <sstream>

using namespace std;

int main() {

  cout << "Podaj liczbe: ";
  int delta;
  cin >> delta;

  fstream feepFile;
  feepFile.open("feep.txt",ios::in);

  fstream resultFile;
  resultFile.open("result.txt",ios::out);

  bool firstLine = true;
  string line;
  while(getline(feepFile, line)) {

    if (firstLine) {
      firstLine = false;
    } else {
      resultFile << endl;
    }

    stringstream lineAsStream(line);
    bool firstNumber = true;
    int number;
    while (lineAsStream >> number) {
      int newValue = number + delta;
      if (firstNumber) {
        firstNumber = false;
      } else {
        resultFile << " ";
      }
      resultFile << newValue;
    }

  }

  resultFile.close();

  cout << endl << "Koniec obliczeń";

}