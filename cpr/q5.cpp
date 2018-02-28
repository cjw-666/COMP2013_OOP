#include <stdio.h>

int array_abs(float* input_array);

int main () {
	float dataset[5];
	for (int i = 0; i < 5; i++) {
		float temp;
		printf("Enter a floating point number: ");
		scanf("%f", &temp);
		dataset[i] = temp;
	}
	array_abs(dataset);
	printf("The result is: ");
	for (int i = 0; i < 5; i++) {
		printf("%f ", dataset[i]);
	}
	printf("\n");
	return 0;
}

int array_abs(float* input_array){
	for (int i = 0; i < 5; i++){
		if (input_array[i] < 0){
			input_array[i] = -input_array[i];
		}else{
			continue;
		}
	}
	return 0;
}