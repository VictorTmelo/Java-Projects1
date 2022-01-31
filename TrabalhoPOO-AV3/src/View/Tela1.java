package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class Tela1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblBemvindoALoja = new JLabel("Bem-Vindo a Loja Console Games! O que voc\u00EA deseja? ");
		lblBemvindoALoja.setBackground(Color.BLACK);
		lblBemvindoALoja.setFont(new Font("Tahoma", Font.PLAIN, 27));
		frame.getContentPane().add(lblBemvindoALoja, BorderLayout.NORTH);
		
		JButton btnConsoles = new JButton("Consoles");
		btnConsoles.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnConsoles.setForeground(Color.BLUE);
		btnConsoles.setBackground(Color.WHITE);
		frame.getContentPane().add(btnConsoles, BorderLayout.WEST);
		
		JButton btnGames = new JButton("Games");
		btnGames.setForeground(Color.BLUE);
		btnGames.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGames.setBackground(Color.WHITE);
		frame.getContentPane().add(btnGames, BorderLayout.CENTER);
		
		JButton btnHeadset = new JButton("Headset");
		btnHeadset.setForeground(Color.BLUE);
		btnHeadset.setBackground(Color.WHITE);
		btnHeadset.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frame.getContentPane().add(btnHeadset, BorderLayout.EAST);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
