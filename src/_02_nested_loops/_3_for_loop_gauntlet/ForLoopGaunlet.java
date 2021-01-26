package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGaunlet {
public static void main(String[] args) {
	
	
	for (int i = 0; i <= 100; i++) {
		System.out.println(i);
	}
	for (int y = 100; y >= 0; y--) {
		System.out.println(y);
	}
	for (int s = 2; s <=100; s++) {
		if (s%2==0) {
			System.out.println(s);
		}
	}
	for (int a = 1; a <= 99; a++) {
		if (a%2==1) {
			System.out.println(a);
		}
	}
	for (int f = 1; f <= 500; f++) {
		System.out.print(f);
		if (f%2==0) {
			System.out.println(" is even");
		}
		else {
			System.out.println(" is odd");
		}
	}
	
	for (int e = 0; e <= 777; e++) {
		if (e%7==0) {
			System.out.println(e);
		}
	}
	for (int y = 2010; y <=2021 ; y++ ) {
		System.out.print("In ");
		System.out.print(y);
		System.out.print(" I was ");
		System.out.print(y - 2010);
		System.out.println(" years old.");
		
	}
	for (int c = 0; c < 3; c++) {
		for (int n = 0; n < 3; n ++) {
		System.out.println(c +" "+ n);
	}
	}
	// x = x + 3; x += 3;
	for (int x = 1; x < 8; x = x + 3) {
		for (int q = x; q < x+3; q++) {
			System.out.print(q + " ");
		}
		System.out.println();
	}
	for (int y = 1; y < 92; y = y + 10) {
		for (int z = y; z < y+10; z++) {
			System.out.print(z + " ");
		}
		System.out.println();
	}
	for (int p = 1; p < 7; p++) {
		for ( int n = 0; n < p; n++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
}
