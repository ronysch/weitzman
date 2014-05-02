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
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JTextField;

public class ttl {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private Picture panel;
	private JTextField txtRealPart;
	private JTextField txtImaginaryPart;
	private JTextField txtExpression;
	private JTextField txtDiversion;
	private JTextField txtAnnotherExpression;
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private JTextField txtStopIf;
	private final Action action_6 = new SwingAction_6();
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
		frame.setBounds(100, 100, 730, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(445, 0, 269, 262);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxRootColoring = new JCheckBox("root coloring");
		chckbxRootColoring.setAction(action);
		chckbxRootColoring.setSelected(true);
		chckbxRootColoring.setBounds(6, 7, 97, 23);
		panel_1.add(chckbxRootColoring);
		
		JButton btnStart = new JButton("start");
		btnStart.setAction(action_6);
		
		btnStart.setBounds(6, 228, 89, 23);
		panel_1.add(btnStart);
		
		JCheckBox chckbxMandelbrotMode = new JCheckBox("mandelbrot mode");
		chckbxMandelbrotMode.setSelected(true);
		chckbxMandelbrotMode.setAction(action_2);
		chckbxMandelbrotMode.setBounds(6, 30, 118, 23);
		panel_1.add(chckbxMandelbrotMode);
		
		JCheckBox chckbxJuliaMode = new JCheckBox("julia mode");
		chckbxJuliaMode.setAction(action_3);
		chckbxJuliaMode.setBounds(6, 56, 97, 23);
		panel_1.add(chckbxJuliaMode);
		
		txtRealPart = new JTextField();
		txtRealPart.setText("real part");
		txtRealPart.setBounds(77, 86, 57, 20);
		panel_1.add(txtRealPart);
		txtRealPart.setColumns(10);
		
		txtImaginaryPart = new JTextField();
		txtImaginaryPart.setText("imaginary part");
		txtImaginaryPart.setBounds(144, 86, 86, 20);
		panel_1.add(txtImaginaryPart);
		txtImaginaryPart.setColumns(10);
		
		JCheckBox chckbxNewtonMode = new JCheckBox("newton mode");
		chckbxNewtonMode.setAction(action_4);
		chckbxNewtonMode.setBounds(6, 111, 97, 23);
		panel_1.add(chckbxNewtonMode);
		
		txtExpression = new JTextField();
		txtExpression.setText("expression");
		txtExpression.setBounds(77, 141, 86, 20);
		panel_1.add(txtExpression);
		txtExpression.setColumns(10);
		
		txtDiversion = new JTextField();
		txtDiversion.setText("diversion");
		txtDiversion.setBounds(173, 141, 86, 20);
		panel_1.add(txtDiversion);
		txtDiversion.setColumns(10);
		
		JCheckBox chckbxFreeMode = new JCheckBox("free mode");
		chckbxFreeMode.setAction(action_5);
		chckbxFreeMode.setBounds(6, 168, 97, 23);
		panel_1.add(chckbxFreeMode);
		
		txtAnnotherExpression = new JTextField();
		txtAnnotherExpression.setText("annother expression");
		txtAnnotherExpression.setBounds(77, 198, 118, 20);
		panel_1.add(txtAnnotherExpression);
		txtAnnotherExpression.setColumns(10);
		
		txtStopIf = new JTextField();
		txtStopIf.setText("stop if");
		txtStopIf.setBounds(125, 229, 86, 20);
		panel_1.add(txtStopIf);
		txtStopIf.setColumns(10);
		
		Picture panel = new Picture();
		panel.addMouseListener(panel);
		panel.addMouseMotionListener(panel);
		panel.addMouseWheelListener(panel);
		
		btnStart.addActionListener(panel);
		frame.getContentPane().add(panel);
		panel.setBounds(0, 0, 445, 445);
		
		
	}
	
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "root coloring");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Details.setRoot(!Details.isRoot());
			
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
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "mandelbrot mode");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Details.setMandelbrot(!Details.isMandelbrot());
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "julia mode");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Details.setJulia(!Details.isJulia());
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "newton mode");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Details.setNewton(!Details.isNewton());
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "free mode");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Details.setFree(!Details.isFree());
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "start");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Details.setAnnotherExpression(txtAnnotherExpression.getText());
			Details.setExpression(txtExpression.getText());
			Details.setDiversion(txtDiversion.getText());
			Details.setRealPart(txtRealPart.getText());
			Details.setImaginaryPart(txtImaginaryPart.getText());
			Details.setStopIf(Double.parseDouble(txtStopIf.getText()));
		}
	}
}
