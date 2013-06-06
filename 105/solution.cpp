#include <iostream>

using namespace std;

int cal(int n) {
	int r;
	if (n >= 1073741823) {
		r = 715827882;
		r += cal(n - 1073741823);
	}
	else r = n * 2 / 3;
	return r;
}
int main() {
	int n;
	cin >> n;
	int r = cal(n);
	cout << r << endl;
	return 0;
}
