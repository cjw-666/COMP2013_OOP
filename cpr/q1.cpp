#include <stdio.h>

int main () {
	int first, second;
	printf("Enter the first integer: ");
	scanf("%d", &first);
	printf("Enter the second integer: ");
	scanf("%d", &second);

	if (first >= 0 && second >= 0){
		printf("The integers %d and %d are both positive\n", first, second);
	}else{
		printf("The integers %d and %d are not both positive\n", first, second);
	}
	return 0;
}
