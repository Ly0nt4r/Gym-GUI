package Gimnasio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameGym extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGym frame = new FrameGym();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameGym() {
		setTitle("Administración de usuarios");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 475);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("GIMNASIO VIGOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 49));
		lblNewLabel.setBounds(184, 0, 443, 79);
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBounds(184, 68, 565, 358);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido1 Apellido 2, Name");
		lblNewLabel_1.setBounds(121, 11, 374, 48);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha Nacimiento");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1.setBounds(29, 70, 257, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telefono de contacto");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1_1.setBounds(29, 116, 300, 28);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Metodo de Pago");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1_1_1.setBounds(29, 155, 300, 41);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Cuota");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1_1_1_1.setBounds(29, 207, 300, 28);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Fecha a pagar");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1_1_1_2.setBounds(29, 246, 300, 41);
		panel.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("TOTAL A PAGAR");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1_1_1_2_1.setBounds(29, 298, 300, 41);
		panel.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Promociones");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_2.setBounds(369, 70, 206, 35);
		panel.add(lblNewLabel_1_1_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tercera Edad");
		chckbxNewCheckBox.setBounds(389, 116, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTerceraEdad = new JCheckBox("Militar | PNC");
		chckbxTerceraEdad.setBounds(389, 142, 97, 23);
		panel.add(chckbxTerceraEdad);
		
		JCheckBox chckbxPagoAnual = new JCheckBox("Pago anual");
		chckbxPagoAnual.setBounds(389, 172, 97, 23);
		panel.add(chckbxPagoAnual);
		
		JCheckBox chckbxPagoAnual_1 = new JCheckBox("Pago anual");
		chckbxPagoAnual_1.setBounds(389, 198, 97, 23);
		panel.add(chckbxPagoAnual_1);
		
		JButton btnNewButton = new JButton("PAGADO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(389, 257, 106, 35);
		panel.add(btnNewButton);
		
	}
}
