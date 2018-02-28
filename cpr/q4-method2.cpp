#include <stdio.h>
#include <stdlib.h>  // Include it in order to use dynamic memory allocation

int main() {
	int amount;
	float accumulate = 1.0;
	printf("How many floating point numbers do you want to multiply together: ");
	scanf("%d", &amount);
	float* input_array = (float*)malloc(amount * sizeof(float)); // Allocate memory space
	for (int i = 0; i < amount; i++) {
		printf("Enter a floating point number: ");
		scanf("%f", &input_array[i]);
	}
	for (int i = 0; i < amount; i++) {
		accumulate *= input_array[i];
	}
	printf("The product is %f\n", accumulate);
	free(input_array); // Free up the allocated memory
	return 0;
}