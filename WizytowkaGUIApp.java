import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class WizytowkaGUIApp {

	private JFrame frmBotAdek;
	
	public String imie, plec, wiek, matma, praca;
	public char pierwszaLiteraImienia;
	public String pierwszaLiteraImieniaString;
	public String imieWielkaLitera;
	int czyWiekToLiczba;
	int wiekInt;
	int wiekStan;
	
	private JTextField TextFieldImie;
	private JTextField TextFieldWiek;
	private JTextField TextFieldDodatkowe;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WizytowkaGUIApp window = new WizytowkaGUIApp();
					window.frmBotAdek.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WizytowkaGUIApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotAdek = new JFrame();
		frmBotAdek.getContentPane().setLayout(null);
		
		JLabel LabelWitaj = new JLabel("Witaj!");
		LabelWitaj.setForeground(new Color(204, 255, 204));
		LabelWitaj.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		LabelWitaj.setBounds(155, 11, 117, 45);
		frmBotAdek.getContentPane().add(LabelWitaj);
		
		JLabel LabelPytanieImie = new JLabel("<html><center><p>Jestem Adek i jestem programem komputerowym.A ja jak mam się do Ciebie zwracać? :)</p></center></html>");
		LabelPytanieImie.setForeground(new Color(204, 255, 204));
		LabelPytanieImie.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		LabelPytanieImie.setBounds(33, 46, 371, 96);
		frmBotAdek.getContentPane().add(LabelPytanieImie);
		
		TextFieldImie = new JTextField();
		TextFieldImie.setHorizontalAlignment(SwingConstants.CENTER);
		TextFieldImie.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		TextFieldImie.setBackground(new Color(204, 255, 204));
		TextFieldImie.setForeground(new Color(0, 153, 0));
		TextFieldImie.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		TextFieldImie.setBounds(112, 153, 117, 39);
		frmBotAdek.getContentPane().add(TextFieldImie);
		TextFieldImie.setColumns(10);
		
		TextFieldWiek = new JTextField();
		TextFieldWiek.setHorizontalAlignment(SwingConstants.CENTER);
		TextFieldWiek.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		TextFieldWiek.setBackground(new Color(204, 255, 204));
		TextFieldWiek.setForeground(new Color(0, 153, 0));
		TextFieldWiek.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		TextFieldWiek.setBounds(112, 153, 117, 39);
		frmBotAdek.getContentPane().add(TextFieldWiek);
		TextFieldWiek.setColumns(10);
		TextFieldWiek.setVisible(false);
		
		JTextArea TextAreaPytanieWiek = new JTextArea();
		TextAreaPytanieWiek.setForeground(new Color(204, 255, 204));
		TextAreaPytanieWiek.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		TextAreaPytanieWiek.setEditable(false);
		TextAreaPytanieWiek.setOpaque(false);
		TextAreaPytanieWiek.setText("...");
		TextAreaPytanieWiek.setBounds(10, 11, 414, 212);
		TextAreaPytanieWiek.setBackground(new Color(0, 0, 0, 0));
		frmBotAdek.getContentPane().add(TextAreaPytanieWiek);
		TextAreaPytanieWiek.setVisible(false);
		
		JButton ButtonOk2 = new JButton("OK");
		ButtonOk2.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		ButtonOk2.setForeground(new Color(204, 255, 204));
		ButtonOk2.setBorder(null);
		ButtonOk2.setBackground(Color.RED);
		ButtonOk2.setBounds(252, 153, 58, 40);
		frmBotAdek.getContentPane().add(ButtonOk2);
		ButtonOk2.setVisible(false);
		
		JButton ButtonOk1 = new JButton("OK");
		ButtonOk1.setBorder(null);
		ButtonOk1.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		ButtonOk1.setForeground(new Color(204, 255, 204));
		ButtonOk1.setBackground(new Color(0, 153, 0));
		ButtonOk1.setBounds(250, 153, 60, 40);
		frmBotAdek.getContentPane().add(ButtonOk1);
		ButtonOk1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent klik) {
				
				imie = TextFieldImie.getText();
				
				pierwszaLiteraImienia = imie.charAt(0);
				pierwszaLiteraImieniaString = ""+pierwszaLiteraImienia;	
				imieWielkaLitera = pierwszaLiteraImieniaString.toUpperCase() + imie.substring(1,imie.length());
				
				if ( imie.charAt( imie.length()-1 ) == 'a' || imie.charAt( imie.length()-1 ) == 'A') plec = "kobietą";
				else plec = "mężczyzną";
				

				LabelWitaj.setVisible(false);
				LabelPytanieImie.setVisible(false);
				TextFieldImie.setVisible(false);
				//frmBotAdek.getContentPane().remove(TextFieldWiek);
				//TextFieldWiek.setVisible(false);
				ButtonOk1.setVisible(false);
				frmBotAdek.getContentPane().remove(ButtonOk1);
				
				TextFieldWiek.setVisible(true);
				TextAreaPytanieWiek.setVisible(true);
				ButtonOk2.setVisible(true);
				
				if(plec == "mężczyzną") TextAreaPytanieWiek.setText( imieWielkaLitera+ "? Podoba mi się to imię!\nA więc " +imieWielkaLitera+", "
						+ "ile masz lat? ^^"
						+ "\nWstyd się przyznać, ale ja zostałem\nnapisany dopiero wczoraj, "
						+ "\nwięc na pewno możesz czuć się starszy. :/");
						
				else TextAreaPytanieWiek.setText( imieWielkaLitera+ "? Podoba mi się to imię!\nA więc " +imieWielkaLitera+", "
						+ "ile masz lat? ^^"
						+ "\nWstyd się przyznać, ale ja zostałem\nnapisany dopiero wczoraj, "
						+ "\nwięc na pewno możesz czuć się starsza. :/");
				
				TextAreaPytanieWiek.setVisible(true);
				
			}
		});
		

		TextFieldDodatkowe = new JTextField();
		TextFieldDodatkowe.setHorizontalAlignment(SwingConstants.CENTER);
		TextFieldDodatkowe.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		TextFieldDodatkowe.setBackground(new Color(204, 255, 204));
		TextFieldDodatkowe.setForeground(new Color(0, 153, 0));
		TextFieldDodatkowe.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		TextFieldDodatkowe.setBounds(112, 153, 117, 39);
		//frmBotAdek.getContentPane().add(TextFieldDodatkowe);
		TextFieldDodatkowe.setColumns(10);
		
		JTextArea TextAreaPytanieDodatkowe = new JTextArea();
		TextAreaPytanieDodatkowe.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		TextAreaPytanieDodatkowe.setEditable(false);
		TextAreaPytanieDodatkowe.setOpaque(false);
		TextAreaPytanieDodatkowe.setText("...");
		TextAreaPytanieDodatkowe.setBounds(10, 11, 414, 212);
		TextAreaPytanieDodatkowe.setBackground(new Color(0, 0, 0, 0));
		//frmBotAdek.getContentPane().add(TextAreaPytanieDodatkowe);
		TextAreaPytanieDodatkowe.setVisible(false);
		
		// .... button
		ButtonOk2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent klik2) {
				
				wiek = TextFieldWiek.getText();
				
				if( wiek.charAt(0) > 47 && wiek.charAt(0) < 58 ){
					
					czyWiekToLiczba = 1;
					wiekInt = Integer.parseInt(wiek);
				}
				else czyWiekToLiczba = 0;
				
				frmBotAdek.getContentPane().remove(TextAreaPytanieWiek);
				TextAreaPytanieWiek.setVisible(false);
				frmBotAdek.getContentPane().remove(ButtonOk2);
				ButtonOk2.setVisible(false);
				frmBotAdek.getContentPane().remove(TextFieldWiek);
				TextFieldWiek.setVisible(false);

				
				if (wiekInt > 0 && wiekInt < 7 && czyWiekToLiczba == 1) {
					
					wiekStan = 1;
					TextAreaPytanieDodatkowe.setText("Masz tylko " +wiekInt+ " lat i już umiesz posługiwać się klawiaturą?"
					+ " Chyba mnie oszukuuuujesz. ;> Ale mimo to troche już o Tobie wiem. A więc...");
				}
						
				else if (wiekInt > 6 && wiekInt < 24 && czyWiekToLiczba == 1) {
					
					wiekStan = 2;
					TextAreaPytanieDodatkowe.setText("No ładnie, " +wiekInt+ " lat to wiek, w którym uczysz się najwięcej."
					+ " Gdybym mógł chodzić do szkoły najchętniej chodziłbym na matematykę! Co masz z matematyki? :D");
					
					//matma = odczyt.nextLine();
					
					int czyMatmaToLiczba;
					int matmaInt = -1;
					
					if( matma.charAt(0) > 47 && matma.charAt(0) < 58 ){
						
						czyMatmaToLiczba = 1;
						matmaInt = Integer.parseInt(matma);
					}
					else czyMatmaToLiczba = 0;
					
					
					if ( matmaInt > 0 && matmaInt < 4 && czyMatmaToLiczba == 1 ) TextAreaPytanieDodatkowe.setText("Ooooj, "
					+ "to średnio dobrze. :<"
					+ " Matematyka jest ważnym przedmiotem, przyłóż się! :3 "
					+ "Dowiedziałem się tyle, że mogę Cię po krótce opisać...");
					
					else if ( matmaInt > 3 && matmaInt < 6 && czyMatmaToLiczba == 1 ) TextAreaPytanieDodatkowe.setText("Brawo " 
					+imieWielkaLitera+ "! "
					+matmaInt+ " to bardzo dobra ocena. :) A więc trochę już o Tobie wiem...");
					
					else if ( matmaInt > 6 && matmaInt < 0 && czyMatmaToLiczba == 1 ) TextAreaPytanieDodatkowe.setText("Hmmm... "
					+ "Coś mnie oszukujesz."
					+ " Nie chcesz to nie mów! :P Mimo to troche już o Tobie wiem. A więc...");
					
					else  TextAreaPytanieDodatkowe.setText("Twoja ocena z matematyki to " +matma+ ", no dobra. "
					+ "Następnym razem tylko pisz liczbami, "
					+ "pamiętaj - ja wciąż jestem tylko komputerem! ;) Teraz spróbuję Cię opisać...");
				}
				
				else if (wiekInt > 23 && wiekInt < 70 && czyWiekToLiczba == 1) {
					
					wiekStan = 3;
					
					if(plec == "mężczyzną") TextAreaPytanieDodatkowe.setText("Jejkuuu, to naprawdę jesteś DUŻO starszy ode mnie. O.o "
					+ "I pewnie masz już pracę..."
					+ " Zatem pracujesz jako ...?");
					
					else TextAreaPytanieDodatkowe.setText("Jejkuuu, to naprawdę jesteś DUŻO starsza ode mnie. O.o I pewnie masz już pracę..."
					+ " Zatem pracujesz jako ...?");
					
					praca = odczyt.nextLine();
					
					TextAreaPytanieDodatkowe.setText("Pracujesz jako " +praca+ ", ciekawe. :) Też chciałbym tego spróbować, "
					+ "jest tylko jeden problem..."
					+ " Natury programistyczno-problematycznej. :( Dość marudzenia, "
					+ "zobacz jak ciekawie potrafię Cie opisać! :D");
					
				}
						
				else if ( wiekInt > 69 && wiekInt < 110 && czyWiekToLiczba == 1){
					
					wiekStan = 4;
					TextAreaPytanieDodatkowe.setText("Jeeej, to teraz już tylko odpoczynek"
					+ " na zasłużonej emeryturze, prawda? :) Pozwól mi opisać Ciebie w paru zdaniach, zerknij proszę!");
				}
				
				else if ( (wiekInt > 109 || wiekInt < 0) && czyWiekToLiczba == 1 ){
					
					wiekStan = 5;
					TextAreaPytanieDodatkowe.setText("Hmmm... Coś mnie oszukujesz."
					+ " Nie chcesz to nie mów! :P Mimo to troche już o Tobie wiem. A więc...");
				}
				
				else if ( czyWiekToLiczba == 0 ){
					
					wiekStan = 6;
					TextAreaPytanieDodatkowe.setText("Mówisz, że masz " +wiek+ " lat? No dobrze, ale na drugi raz pisz liczbami"
					+ " - łatwiej mi będzie to zweryfikować. ;) Teraz przejdę do Twojego opisu, zerknij proszę!");
				}
				
				else {}
				
				TextAreaPytanieDodatkowe.setVisible(true);
				
			}
		});
		
		
		
		
		
		
		
		
		
		JLabel LabelTlo = new JLabel(new ImageIcon("C:\\Users\\Milele\\EclipseProjects\\WizytowkaApp\\images\\AdekTlo.jpg"));
		LabelTlo.setBounds(0, -22, 434, 283);
		frmBotAdek.getContentPane().add(LabelTlo);
		
		
		frmBotAdek.setIconImage(Toolkit.getDefaultToolkit().getImage(WizytowkaGUIApp.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
		frmBotAdek.setTitle("Bot Adek");
		frmBotAdek.setBounds(100, 100, 450, 300);
		frmBotAdek.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
