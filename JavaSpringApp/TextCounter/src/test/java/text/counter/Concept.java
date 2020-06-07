package text.counter;

public class Concept {

	public static void main(String[] args) {
		/***
		 * successfully runned application
		 */
		Run.run();
		
		/**
		 * jedan string će se parsirati i taj string će biti u klasi pri tome će se u main pprogramu ili controlleru ili 
		 * implementaciji interface funkcije stavljati u listu ili polje. kada se parsira obična datoteka, parsirati će se riječ po riječ razmak
		 * je sredstvo razdvajanja. To će se pretvarati u listu ili polje, vjerojatno listu.
		 * Postojkati će i dodatna klasa koja će sadržavati char varijablu.
		 * u implementaciji interface-a ili u mainu ili controlleru će se svaki string koji je u polju ili listi pretvarati 
		 * u polje znakova. i tada će se brojiti frekvencija slova. 
		 * dodatna klasa će sadržavati englesku i hrvatsku abecedu. o odabiru koja će se abeceda koristiti 
		 * odlučiti će se izborom. 
		 * dodatna klasa statistike će izračunavati broj koliko se pojedini string pojavljuje, broj pojedinog slova u stringu, 
		 * duljina stringa, broj specijalnih znakova točke zagrade itd, broj numeričkih varijaBLI.
		 * parsiranje jsona će se koristiti putem posebne datoteke i stavljati u polje stringova koji će se kao u prethodnom objašnjenu 
		 * stavljati u polje stringova i u polje charactera.
		 * rezultati će se spremati u bazu putem jpa. baza koja će se koristiti je mysql putem phpmyadmina, dakle mariadb. stavljati će se statistika.
		 * rezultati će se prikazivati na stranici. povijest će se stavljati u json.
		 * povijest će se pregledavati na stranici koja će sadržavati i paginaciju i filtriranje po datumu. 
		 * SPREMATI ĆE SE ZAPRAVO U BAZU. će imati prvo jedinstveni broj, onda će biti datum parsiranja naziv file-a. kada korisnik 
		 * želi od jednog datuma prikazati parsirane stvari na stranici, izabirati će pomoću filtra. Može i filtrirati i putem naziva.
		 * onda će se na idućoj stranici  vidjeti sve filtrirano. prvo ako je samo datum prikazuju se sve datoteke tog datuma ako je samo naziv prikazuju 
		 * se samo datoteke po nazivu. ako nema filtriranja, prikazuje se sve sa limitom od deset odjednom. povijest se na kraju stavlja u bazu, tj korisniku
		 * se ostavlja opcija da li želi trajnu pohranu. Privremena se stavlja u json. nakon gotove sesrije ništi se privremeni json.
		 */

	}

}
