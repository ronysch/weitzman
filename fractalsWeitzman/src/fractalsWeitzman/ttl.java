package fractalsWeitzman;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;

public class ttl {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private Picture panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ttl window = new ttl();
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
	public ttl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(261, 0, 173, 262);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxRootColoring = new JCheckBox("root coloring");
		chckbxRootColoring.setAction(action);
		chckbxRootColoring.setSelected(true);
		chckbxRootColoring.setBounds(6, 7, 97, 23);
		panel_1.add(chckbxRootColoring);
		
		JButton btnStart = new JButton("start");
		btnStart.setAction(action_1);
		btnStart.setBounds(6, 228, 89, 23);
		panel_1.add(btnStart);
		
		Picture panel = new Picture();
		frame.getContentPane().add(panel);
		panel.setBounds(0, 0, 262, 262);
		
		
	}
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "root coloring");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Details.setRoot(!Details.isRoot());
			System.out.println(3);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "draw");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
}
