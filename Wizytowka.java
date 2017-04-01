import java.util.Scanner;

class Wiz{
		
	public String imie, plec, wiek, matma, praca;
	public char pierwszaLiteraImienia;
	public String pierwszaLiteraImieniaString;
	public String imieWielkaLitera;
	int czyWiekToLiczba;
	int wiekInt;
	int wiekStan;
	public Scanner odczyt;
	
	public Wiz(){
		
		imie = "...";
		plec = "...";
		wiek = "...";
		matma = "...";
		praca = "...";
		pierwszaLiteraImienia = '.';
		pierwszaLiteraImieniaString = "...";
		imieWielkaLitera = "...";
		czyWiekToLiczba = 0;
		wiekInt = 0;
		wiekStan = 0;
		
		odczyt = new Scanner(System.in);
	}
	
	public void pytanieImie(){
		
		System.out.println("> Witaj! Jestem Adek i jestem programem komputerowym. A ja jak mam się do Ciebie zwracać?"
				+ ":)");
		imie = odczyt.nextLine();
	}
	
	public void imieWielkaLitera(){
		
		pierwszaLiteraImienia = imie.charAt(0);
		pierwszaLiteraImieniaString = ""+pierwszaLiteraImienia;	
		imieWielkaLitera = pierwszaLiteraImieniaString.toUpperCase() + imie.substring(1,imie.length());
	}
	
	public void rozpoznawaniePlciPoLiterze(){
		
		if ( imie.charAt( imie.length()-1 ) == 'a' || imie.charAt( imie.length()-1 ) == 'A') plec = "kobietą";
		else plec = "mężczyzną";
	}
	
	public void pytanieWiek(){
		
		if(plec == "mężczyzną") System.out.println("> " +imieWielkaLitera+ "? Podoba mi się to imię! "
				+ "A więc " +imieWielkaLitera+", ile masz lat? ^^"
				+ " Wstyd się przyznać, ale ja zostałem napisany dopiero wczoraj, "
				+ "więc na pewno możesz czuć się starszy. :/");
				
		else System.out.println("> " +imieWielkaLitera+ "? Podoba mi się to imię! A więc " +imieWielkaLitera+", "
				+ "ile masz lat? ^^"
				+ " Wstyd się przyznać, ale ja zostałem napisany dopiero wczoraj, "
				+ "więc na pewno możesz czuć się starsza. :/");
		
		wiek = odczyt.nextLine();
	}
	
	public void czyWiekToLiczba(){
		
		if( wiek.charAt(0) > 47 && wiek.charAt(0) < 58 ){
			
			czyWiekToLiczba = 1;
			wiekInt = Integer.parseInt(wiek);
		}
		else czyWiekToLiczba = 0;
	}
	
	public void dodatkowePytanieZwiazaneZWiekiem(){
		
		if (wiekInt > 0 && wiekInt < 7 && czyWiekToLiczba == 1) {
			
			wiekStan = 1;
			System.out.println(">Masz tylko " +wiekInt+ " lat i już umiesz posługiwać się klawiaturą?"
			+ " Chyba mnie oszukuuuujesz. ;> Ale mimo to troche już o Tobie wiem. A więc...");
		}
				
		else if (wiekInt > 6 && wiekInt < 24 && czyWiekToLiczba == 1) {
			
			wiekStan = 2;
			System.out.println(">No ładnie, " +wiekInt+ " lat to wiek, w którym uczysz się najwięcej."
			+ " Gdybym mógł chodzić do szkoły najchętniej chodziłbym na matematykę! Co masz z matematyki? :D");
			
			matma = odczyt.nextLine();
			
			int czyMatmaToLiczba;
			int matmaInt = -1;
			
			if( matma.charAt(0) > 47 && matma.charAt(0) < 58 ){
				
				czyMatmaToLiczba = 1;
				matmaInt = Integer.parseInt(matma);
			}
			else czyMatmaToLiczba = 0;
			
			
			if ( matmaInt > 0 && matmaInt < 4 && czyMatmaToLiczba == 1 ) System.out.println(">Ooooj, "
			+ "to średnio dobrze. :<"
			+ " Matematyka jest ważnym przedmiotem, przyłóż się! :3 "
			+ "Dowiedziałem się tyle, że mogę Cię po krótce opisać...");
			
			else if ( matmaInt > 3 && matmaInt < 6 && czyMatmaToLiczba == 1 ) System.out.println(">Brawo " 
			+imieWielkaLitera+ "! "
			+matmaInt+ " to bardzo dobra ocena. :) A więc trochę już o Tobie wiem...");
			
			else if ( matmaInt > 6 && matmaInt < 0 && czyMatmaToLiczba == 1 ) System.out.println(">Hmmm... "
			+ "Coś mnie oszukujesz."
			+ " Nie chcesz to nie mów! :P Mimo to troche już o Tobie wiem. A więc...");
			
			else  System.out.println(">Twoja ocena z matematyki to " +matma+ ", no dobra. "
			+ "Następnym razem tylko pisz liczbami, "
			+ "pamiętaj - ja wciąż jestem tylko komputerem! ;) Teraz spróbuję Cię opisać...");
		}
		
		else if (wiekInt > 23 && wiekInt < 70 && czyWiekToLiczba == 1) {
			
			wiekStan = 3;
			
			if(plec == "mężczyzną") System.out.println(">Jejkuuu, to naprawdę jesteś DUŻO starszy ode mnie. O.o "
			+ "I pewnie masz już pracę..."
			+ " Zatem pracujesz jako ...?");
			
			else System.out.println(">Jejkuuu, to naprawdę jesteś DUŻO starsza ode mnie. O.o I pewnie masz już pracę..."
			+ " Zatem pracujesz jako ...?");
			
			praca = odczyt.nextLine();
			
			System.out.println(">Pracujesz jako " +praca+ ", ciekawe. :) Też chciałbym tego spróbować, "
			+ "jest tylko jeden problem..."
			+ " Natury programistyczno-problematycznej. :( Dość marudzenia, "
			+ "zobacz jak ciekawie potrafię Cie opisać! :D");
			
		}
				
		else if ( wiekInt > 69 && wiekInt < 110 && czyWiekToLiczba == 1){
			
			wiekStan = 4;
			System.out.println(">Jeeej, to teraz już tylko odpoczynek"
			+ " na zasłużonej emeryturze, prawda? :) Pozwól mi opisać Ciebie w paru zdaniach, zerknij proszę!");
		}
		
		else if ( (wiekInt > 109 || wiekInt < 0) && czyWiekToLiczba == 1 ){
			
			wiekStan = 5;
			System.out.println(">Hmmm... Coś mnie oszukujesz."
			+ " Nie chcesz to nie mów! :P Mimo to troche już o Tobie wiem. A więc...");
		}
		
		else if ( czyWiekToLiczba == 0 ){
			
			wiekStan = 6;
			System.out.println(">Mówisz, że masz " +wiek+ " lat? No dobrze, ale na drugi raz pisz liczbami"
			+ " - łatwiej mi będzie to zweryfikować. ;) Teraz przejdę do Twojego opisu, zerknij proszę!");
		}
		
		else {}
	}
	
	public void opis(){
		
		if( wiekStan == 1 ) System.out.println("\n>OPIS: Masz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
				+ " Dowiedziałem się, że masz " +wiekInt+ " lat i naprawdę jestemw  podziwie, "
				+ "że tak szybko opanowałeś obsługę"
				+ " klawiatury. To dobrze, bo będziemy mogli częściej rozmawiać! :) ");
		
		else if( wiekStan == 2 ) System.out.println("\n>OPIS: Masz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
				+ " Dowiedziałem się, że masz " +wiekInt+ " lat i wciąż jeszcze się uczysz. Pamiętam, "
				+ "bo rozmwialiśmy o matematyce, a ja"
				+ " bardzo lubię matematykę. :3 ");
		
		else if( wiekStan == 3 ) System.out.println("\n>OPIS: Masz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
				+ " Dowiedziałem się, że masz " +wiekInt+ " lat, a twój zawód to " +praca+ ".gosia Mam nadzieję, "
				+ "że lubisz tę pracę, słyszałem"
				+ " od ludzi, że najlepiej jest robić to co się lubi! :) ");
		
		else if( wiekStan == 4 ) System.out.println("\n>OPIS: Masz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
				+ " Dowiedziałem się, że masz " +wiekInt+ " lat, a obecnie pewnie głowę zaprzątają Ci wnuki. "
				+ "Ciekawe jak to jest"
				+ " odpoczywać od pracy, hmm... Ja nigdy nie jestem zmęczony! :D");
		
		else if( wiekStan == 5 ) System.out.println("\n>OPIS: Masz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
				+ " Niestety nie mogłem dowiedzieć się ile masz lat. "
				+ "Wciąż nie rozumiem dlaczego ludzie nie lubią mówić o swoim wieku, hmm..."
				+ " \nPrzecież lata to doświadczenie, czyli zmienna pozytywna, czego tu się wstydzić? "
				+ "Ja się niestety doświadczeniem pochwalić"
				+ " nie mogę. :<");
		
		else if( wiekStan == 6 ) System.out.println("\n>OPIS: Masz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
				+ " Dowiedziałem się, że masz " +wiek+ " lat i lubisz testować moją cierpliwość. x3 "
				+ "Przecież, gdy pytam o wiek to"
				+ " wiadomo, że chodzi mi o liczbę! :D ");
		
	}
}


public class Wizytowka {

	public static void main(String[] args) {
		
		Wiz wiz = new Wiz();
		
		wiz.pytanieImie();
		
		wiz.imieWielkaLitera();
		
		wiz.rozpoznawaniePlciPoLiterze();
		
		wiz.pytanieWiek();

		wiz.czyWiekToLiczba();
		
		wiz.dodatkowePytanieZwiazaneZWiekiem();
		
		wiz.opis();
		
		wiz.odczyt.close();
		
	}

}
