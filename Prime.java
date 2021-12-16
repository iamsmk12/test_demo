import java.util.*;
class Prime {
	public static void main (String[] args) {
	int n, flag = 0, i;
	System.out.println("Enter the number");
	Scanner obj = new Scanner(System.in);
	n = obj.nextInt();
	if (n == 0 || n == 1) {
	System.out.println("The number is not prime");
	}
	else {
	for (i = 2; i <= n/2; i++) {
		if (n % i == 0) {
		System.out.println("The number is not prime");
		flag = 1;
		break;
}
}
	if (flag == 0) {
	System.out.println("The number is prime");
}
}
}
}
	