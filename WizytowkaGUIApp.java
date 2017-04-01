import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class WizytowkaGUIVer3App extends Frame implements ActionListener{
	
	public String imie, plec, wiek;
	public char pierwszaLiteraImienia;
	public String pierwszaLiteraImieniaString;
	public String imieWielkaLitera;
	int czyWiekToLiczba;
	int wiekInt;
	int wiekStan;
	String opisKoncowy;
	String stan = "button1";
	
	JFrame frmBotAdekVer;
	JLabel LabelWitaj, LabelPytanieImie, LabelTlo;
	JTextArea TextArea;
	JTextField TextField;
	JButton ButtonOk1, ButtonOk2, ButtonOk3;
	
	/*KONSTRUKTOR*/
	public WizytowkaGUIVer3App() {
		
		frmBotAdekVer = new JFrame();
		frmBotAdekVer.setIconImage(Toolkit.getDefaultToolkit().getImage(WizytowkaGUIApp.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
		frmBotAdekVer.setTitle("Bot Adek ver. 3.0");
		frmBotAdekVer.setBounds(100, 100, 450, 300);
		frmBotAdekVer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotAdekVer.getContentPane().setLayout(null);
		
		LabelWitaj = new JLabel("Witaj!");
		LabelWitaj.setForeground(new Color(204, 255, 204));
		LabelWitaj.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		LabelWitaj.setBounds(155, 11, 117, 45);
		frmBotAdekVer.getContentPane().add(LabelWitaj);
		
		LabelPytanieImie = new JLabel("<html><center><p>Jestem Adek i jestem programem komputerowym.A ja jak mam się do Ciebie zwracać? :)</p></center></html>");
		LabelPytanieImie.setForeground(new Color(204, 255, 204));
		LabelPytanieImie.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		LabelPytanieImie.setBounds(33, 46, 371, 96);
		frmBotAdekVer.getContentPane().add(LabelPytanieImie);
		
		TextField = new JTextField();
		TextField.setHorizontalAlignment(SwingConstants.CENTER);
		TextField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		TextField.setBackground(new Color(204, 255, 204));
		TextField.setForeground(new Color(0, 153, 0));
		TextField.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		TextField.setBounds(112, 153, 117, 39);
		frmBotAdekVer.getContentPane().add(TextField);
		TextField.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

            	if(stan == "button1"){
            		ButtonOk1.doClick();
            	}
            	else if(stan == "button2"){
            		ButtonOk2.doClick();
            	}
       	
            }});
		
		
		ButtonOk1 = new JButton("OK");
		ButtonOk1.setBorder(null);
		ButtonOk1.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		ButtonOk1.setForeground(new Color(204, 255, 204));
		ButtonOk1.setBackground(new Color(0, 153, 0));
		ButtonOk1.setBounds(250, 153, 60, 40);
		ButtonOk1.addActionListener(this);
		frmBotAdekVer.getContentPane().add(ButtonOk1);
		
		ButtonOk2 = new JButton("OK");
		ButtonOk2.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		ButtonOk2.setForeground(new Color(204, 255, 204));
		ButtonOk2.setBorder(null);
		ButtonOk2.setBackground(new Color(0, 153, 0));
		ButtonOk2.setBounds(252, 153, 58, 40);
		ButtonOk2.addActionListener(this);
		frmBotAdekVer.getContentPane().add(ButtonOk2);
		
		ButtonOk3 = new JButton("OK");
		ButtonOk3.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		ButtonOk3.setForeground(new Color(204, 255, 204));
		ButtonOk3.setBorder(null);
		ButtonOk3.setBackground(new Color(0, 153, 0));
		ButtonOk3.setBounds(182, 153, 58, 40);
		ButtonOk3.addActionListener(this);
		frmBotAdekVer.getContentPane().add(ButtonOk3);
		ButtonOk3.setVisible(false);
		
		TextArea = new JTextArea();
		TextArea.setForeground(new Color(204, 255, 204));
		TextArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		TextArea.setEditable(false);
		TextArea.setOpaque(false);
		TextArea.setBounds(10, 11, 414, 212);
		TextArea.setBackground(new Color(0, 0, 0, 0));
		frmBotAdekVer.getContentPane().add(TextArea);
		
		LabelTlo = new JLabel(new ImageIcon("C:\\Users\\Milele\\EclipseProjects\\WizytowkaApp\\images\\AdekTlo.jpg"));
		LabelTlo.setBounds(0, -22, 434, 283);
		frmBotAdekVer.getContentPane().add(LabelTlo);
		
		
	}
	
	
	/*NACISNIECIE PRZYCISKÓW OK1, OK2, OK3 I ZWIĄZANE Z TYM AKCJE*/
	public void actionPerformed(ActionEvent e){
			
		try{
			
			Object source = e.getSource();
		
				if (source == ButtonOk1){
					
					stan = "button1";
					imie = TextField.getText();
					TextField.setText("");
					
					pierwszaLiteraImienia = imie.charAt(0);
					pierwszaLiteraImieniaString = ""+pierwszaLiteraImienia;	
					imieWielkaLitera = pierwszaLiteraImieniaString.toUpperCase() + imie.substring(1,imie.length());
					
					if ( imie.charAt(imie.length()-1) == 'a' || imie.charAt(imie.length()-1) == 'A') plec="kobietą";
					else plec = "mężczyzną";
					

					LabelWitaj.setVisible(false);
					frmBotAdekVer.remove(LabelWitaj);
					LabelPytanieImie.setVisible(false);
					frmBotAdekVer.remove(LabelPytanieImie);
					ButtonOk1.setVisible(false);
					frmBotAdekVer.remove(ButtonOk1);
					
					if(plec == "mężczyzną") TextArea.setText( imieWielkaLitera+ "? Podoba mi się to imię!\n"
							+ "A więc " +imieWielkaLitera+", "
							+ "ile masz lat? ^^"
							+ "\nWstyd się przyznać, ale ja zostałem\nnapisany dopiero wczoraj, "
							+ "\nwięc na pewno możesz czuć się starszy. :/");
							
					else TextArea.setText( imieWielkaLitera+ "? Podoba mi się to imię!\nA więc " +imieWielkaLitera+", "
							+ "ile masz lat? ^^"
							+ "\nWstyd się przyznać, ale ja zostałem\nnapisany dopiero wczoraj, "
							+ "\nwięc na pewno możesz czuć się starsza. :/");
					
					stan = "button2";
				}
				
				
				else if(source == ButtonOk2){
					
					stan = "button2";
					wiek = TextField.getText();
					TextField.setText("");
					
					if( wiek.charAt(0) > 47 && wiek.charAt(0) < 58 ){
						
						czyWiekToLiczba = 1;
						wiekInt = Integer.parseInt(wiek);
					}
					else czyWiekToLiczba = 0;
					
					
					
					if (wiekInt > 0 && wiekInt < 7 && czyWiekToLiczba == 1) {
						
						wiekStan = 1;
						TextArea.setText("Masz tylko " +wiekInt+ " lat i już umiesz posługiwać \nsię klawiaturą?"
						+ " Chyba mnie oszukujesz. ;> \nAle mimo to troche już o Tobie wiem. \nA więc...\n");
					}
							
					else if (wiekInt > 6 && wiekInt < 24 && czyWiekToLiczba == 1) {
						
						wiekStan = 2;
						TextArea.setText("No ładnie, " +wiekInt+ " lat to wiek, w którym uczysz \nsię najwięcej."
						+ " Gdybym mógł chodzić do \nszkoły najchętniej chodziłbym na \nmatematykę! :D Ale dość mojego"
						+ " \nmarudzenia, przejdzmy do Twojego opisu! :)");
					}	
					
					else if (wiekInt > 23 && wiekInt < 70 && czyWiekToLiczba == 1) {
						
						wiekStan = 3;
						
						if(plec == "mężczyzną") TextArea.setText("Jejkuuu, "
						+ "to naprawdę jesteś DUŻO \nstarszy ode mnie. O.o "
						+ "I pewnie masz już \npracę..."
						+ " Zazdroszczę Ci, ale dość marudzenia, \nzobacz jak ciekawie potrafię Cie opisać! :D");
						
						else TextArea.setText("Jejkuuu, to naprawdę jesteś DUŻO \nstarsza ode mnie. O.o "
						+ "I pewnie masz już \npracę..."
						+ " Zazdroszczę Ci, ale dość marudzenia, \nzobacz jak ciekawie potrafię Cie opisać! :D");
						
					}
							
					else if ( wiekInt > 69 && wiekInt < 110 && czyWiekToLiczba == 1){
						
						wiekStan = 4;
						TextArea.setText("Jeeej, to teraz już tylko odpoczynek"
						+ " na \nzasłużonej emeryturze, prawda? :) Pozwól \nmi opisać Ciebie w paru zdaniach, "
						+ "zerknij \nproszę!");
					}
					
					else if ( (wiekInt > 109 || wiekInt < 0) && czyWiekToLiczba == 1 ){
						
						wiekStan = 5;
						TextArea.setText("Hmmm... Coś mnie oszukujesz."
						+ " Nie chcesz \nto nie mów! :P Mimo to troche już o Tobie \nwiem. A więc...");
					}
					
					else if ( czyWiekToLiczba == 0 ){
						
						wiekStan = 6;
						TextArea.setText("Mówisz, że masz " +wiek+ " lat? \nNo dobrze, ale na drugi raz pisz liczbami"
						+ " - \nłatwiej mi będzie to zweryfikować. ;) \nTeraz przejdę do Twojego opisu, zerknij \nproszę!");
					}
					
					else {}
					
					ButtonOk2.setVisible(false);
					frmBotAdekVer.remove(ButtonOk2);
					TextField.setVisible(false);
					frmBotAdekVer.remove(TextField);
					ButtonOk3.setVisible(true);
					
				}
				
				else if(source == ButtonOk3){
					
					if( wiekStan == 1 ) TextArea.setText("	OPIS: \nMasz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
							+ " \nDowiedziałem się, że masz " +wiekInt+ " lat \ni naprawdę jestemw  podziwie, "
							+ "\nże tak szybko opanowałeś obsługę"
							+ "\nklawiatury. To dobrze, bo będziemy mogli \nczęściej rozmawiać! :) ");
					
					else if( wiekStan == 2 ) TextArea.setText("	OPIS: \nMasz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
							+ " \nDowiedziałem się, że masz " +wiekInt+ " lat \ni wciąż jeszcze się uczysz. \nPamiętam, "
							+ "bo rozmawialiśmy o matematyce, \na ja"
							+ " bardzo lubię matematykę. :3 ");
					
					else if( wiekStan == 3 ) TextArea.setText("	OPIS: \nMasz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
							+ " \nDowiedziałem się, że masz " +wiekInt+ " lat \ni pracujesz w zawodzie. Mam nadzieję,\n "
							+ "że lubisz swoją pracę, słyszałem\n"
							+ " od ludzi, że najlepiej jest robić \nto co się lubi! :) ");
					
					else if( wiekStan == 4 ) TextArea.setText("	OPIS: \nMasz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
							+ " \nDowiedziałem się, że masz " +wiekInt+ " lat, \na obecnie pewnie głowę zaprzątają Ci \nwnuki. "
							+ "Ciekawe jak to jest"
							+ " odpoczywać od pracy, \nhmm... Ja nigdy nie jestem zmęczony! :D");
					
					else if( wiekStan == 5 ) TextArea.setText("	OPIS: \nMasz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
							+ " \nNiestety nie mogłem dowiedzieć się ile masz lat. "
							+ "Wciąż nie rozumiem dlaczego ludzie \nnie lubią mówić o swoim wieku, hmm..."
							+ " \nPrzecież lata to doświadczenie, czyli \nzmienna pozytywna, czego tu się wstydzić? "
							+ "\nJa się niestety doświadczeniem pochwalić"
							+ " \nnie mogę. :<");
					
					else if( wiekStan == 6 ) TextArea.setText("	OPIS: \nMasz na imię " +imieWielkaLitera+ " i jesteś " +plec+ "."
							+ " \nDowiedziałem się, że masz " +wiek+ " lat i \nlubisz testować moją cierpliwość. x3 "
							+ "\nPrzecież, gdy pytam o wiek to"
							+ "\nwiadomo, że chodzi mi o liczbę! :D ");
					
					ButtonOk3.setVisible(false);
					frmBotAdekVer.remove(ButtonOk3);
				}
				
				
			}
			catch(StringIndexOutOfBoundsException oob){
				
				JOptionPane.showMessageDialog(null, "Najpierw wprowadz treść! :)", "Ostrzeżenie", JOptionPane.WARNING_MESSAGE);
			}
				
	}
	
	/*public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode()==KeyEvent.VK_ENTER){
	        System.out.println("Hello");

	        JOptionPane.showMessageDialog(null , "You've Submitted the name ");
	    }

	}*/

	public static void main(String[] args) {

		try {
			WizytowkaGUIVer3App window = new WizytowkaGUIVer3App();
			window.frmBotAdekVer.setVisible(true);			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

