#include <stdio.h>

#define MONTHS 12

int main() {
	int days_in_month[MONTHS] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int user_month = 0, user_day = 0, accumulate = 0;

	do{
		printf("Enter the month: ");
		scanf("%d", &user_month);
	}while(user_month > MONTHS || user_month <= 0);

	do{
		printf("Enter the day: ");
		scanf("%d", &user_day);
	}while(user_day > days_in_month[user_month - 1] || user_day < 0);

	for (int i = 0; i < user_month - 1; i++){
		accumulate += days_in_month[i];
	}

	printf("%d/%d is the day number %d in the year\n", user_day, user_month, accumulate + user_day);
	return 0;
}
