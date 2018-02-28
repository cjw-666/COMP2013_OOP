#include <stdio.h>

int main () {
	int amount;
	float accumulate = 1.0;
	printf("How many floating point numbers do you want to multiply together: ");
	scanf("%d", &amount);
	for(int i = 0; i < amount; i++){
		float temp;
		printf("Enter a floating point number: ");
		scanf("%f", &temp);
		accumulate *= temp;
	}
	printf("The product is %f\n", accumulate);
	return 0;
}