package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		ArrayList<Article> stock = new ArrayList<Article>();

		stock.add(new Article(123, "7lib delice", 1250, 3));
		stock.add(new Article(456, "Chocolat Lindit", 15499, 5));
		stock.add(new Article(789, "CoCa Cola", 2100, 20));

		Scanner sc = new Scanner(System.in);

		int choix, ref;
		do {
			System.out.println("1 - Rechercher Article par reference");
			System.out.println("2 - Ajouter Article");
			System.out.println("3 - Supprimer Article");
			System.out.println("4 - Modifier Article");
			System.out.println("5 - Rechercher Article par nom");
			System.out.println("6 - Rechercher article par intervalle de prix ");
			System.out.println("7 - Afficher tous les Articles");
			System.out.println("8 - Quitter");
			System.out.print("Choisir une Option : ");
			choix = sc.nextInt();
			
			switch (choix) {
			case 1:
				System.out.print("Donner la reference : ");
				ref = sc.nextInt();
				Article.rechercheParReference(ref, stock);
				break;
			case 2:
				System.out.print("Donner la reference : ");
				ref = sc.nextInt();
				Article.ajouter(ref, stock);
				break;
			case 3:
				System.out.print("Donner la reference : ");
				ref = sc.nextInt();
				Article.supprimer(ref, stock);
				break;
			case 4:
				System.out.print("Donner la reference : ");
				ref = sc.nextInt();
				Article.modifier(ref, stock);
				break;
			case 5:
				System.out.print("Donner le nom : ");
				sc.nextLine();
				String nom = sc.nextLine();
				Article.rechercheParNom(nom, stock);
				break;
			case 6:
				System.out.print("Donner le prix minimum : ");
				double pmin = sc.nextDouble();
				System.out.print("Donner le prix maximum : ");
				double pmax = sc.nextDouble();
				if (pmax < pmin) {
					double p = pmax;
					pmax = pmin;
					pmin = p;
				}
				Article.rechercheParIntervalleDePrix(pmin, pmax, stock);
				break;
			case 7:
				Article.afficherTous(stock);
				break;
			case 8:
				System.out.println("Merci d'avoir utiliser notre programme !");
				break;
			default:
				System.out.println("Choix invalide !");
				break;
			}
			
		} while (choix != 8);

	}
}