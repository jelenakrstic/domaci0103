package domaci0103;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite figuru ciju povrsinu zelite da izracunate");
		String figura;
		boolean izlazak = false;
		while (true) {
			figura = sc.nextLine();
			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
				break;
			case "pravougaonik":
				racunajPravougaonik();
				break;
			case "krug":
				racunajKrug();
				break;
			case "izadji":
				izlazak = true;
				break;
			default:
				System.out.println("Figura nije poznata");
			}
			if (izlazak) {
				break;
			}
			System.out.println("Unesite figuru ciju povrsinu zelite da izracunate");
		}
	}

	private static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Unesite poluprecnik kruga");
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kruga je: " + pKruga(r));
	}

	private static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite stranicu a");
		a = sc.nextDouble();
		System.out.println("Unesite stranicu b");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));

	}

	private static void racunajKvadrat() {
		System.out.println("Unesite stranicu kvadrata");
		Scanner sc = new Scanner(System.in);
		double a;
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a));

	}

	private static double pKruga(double r) {
		return r * r * 3.14;
	}

	private static double pKvadrata(double a) {
		return a * a;
	}

	private static double pPravougaonika(double a, double b) {
		return a * b;
	}
}

