#include <stdio.h>

float abs(float original);

int main () {
	float user_input;
	printf("Enter a floating-point number: ");
	scanf("%f", &user_input);
	printf("The absolute value of %f is %f\n", user_input, abs(user_input));
	return 0;
}

float abs(float original){
	if (original < 0){
		return -original;
	}else{
		return original;
	}
}