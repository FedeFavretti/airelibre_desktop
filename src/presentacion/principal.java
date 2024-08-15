package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class principal {

	private JFrame frmAirelibre;
	private JTextField textNickname;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEmail;
	private JTextField textFecha;
	private JPasswordField passwordContrasena;
	private JTextField textDisciplina;
	private JTextField textWeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frmAirelibre.setVisible(true);
					window.frmAirelibre.setSize(1200, 600);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//=== FRAME AIRELIBRE ==============================================================================
		frmAirelibre = new JFrame();
		frmAirelibre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAirelibre.setTitle("AireLibre");
		frmAirelibre.getContentPane().setLayout(null);
		
		JInternalFrame IfAlta_Usuario = new JInternalFrame("Alta Usuario");
		IfAlta_Usuario.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		IfAlta_Usuario.setBounds(10, 11, 524, 257);
		IfAlta_Usuario.setIconifiable(true);
		IfAlta_Usuario.setMaximizable(true);
		frmAirelibre.getContentPane().add(IfAlta_Usuario);
		IfAlta_Usuario.getContentPane().setLayout(null);
		
		//=== MENU BAR =====================================================================================
		JMenuBar menuBar = new JMenuBar();
		frmAirelibre.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuario");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAltaUsuario = new JMenuItem("Alta Usuario");
		 mntmAltaUsuario.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Muestro el InternalFrame para registrar un usuario
	            	IfAlta_Usuario.setVisible(true);
	            }
	        });
		mnNewMenu.add(mntmAltaUsuario);
		
		
		JMenuItem mntmConsultaUsuario = new JMenuItem("Consulta Usuario");
		mnNewMenu.add(mntmConsultaUsuario);
		
		JMenuItem mntmModificarUsuario = new JMenuItem("Modificar Usuario");
		mnNewMenu.add(mntmModificarUsuario);
		
		JMenu mnNewMenu_1 = new JMenu("Actividad");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAltaActividad = new JMenuItem("Alta Actividad");
		mnNewMenu_1.add(mntmAltaActividad);
		
		JMenuItem mntmConsultaActividad = new JMenuItem("Consulta Actividad");
		mnNewMenu_1.add(mntmConsultaActividad);
		
		JMenuItem mntmModificarActividad = new JMenuItem("Modificar Actividad");
		mnNewMenu_1.add(mntmModificarActividad);
		
		JMenuItem mntmRankingActividad = new JMenuItem("Ranking Actividad");
		mnNewMenu_1.add(mntmRankingActividad);
		
		JMenu mnNewMenu_2 = new JMenu("Clase e Inscrip");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmAltaClase = new JMenuItem("Alta Clase");
		mnNewMenu_2.add(mntmAltaClase);
		
		JMenuItem mntmConsultaClase = new JMenuItem("Consulta Clase");
		mnNewMenu_2.add(mntmConsultaClase);
		
		JMenuItem mntmAltaInscripcion = new JMenuItem("Alta Inscripcion");
		mnNewMenu_2.add(mntmAltaInscripcion);
		
		JMenuItem mntmConsultaInscripcion = new JMenuItem("Consulta Inscripcion");
		mnNewMenu_2.add(mntmConsultaInscripcion);
		IfAlta_Usuario.setVisible(false);
		
		//=== FRAME ALTA USUARIO ===========================================================================
		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setBounds(10, 14, 63, 13);
		IfAlta_Usuario.getContentPane().add(lblNickname);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setBounds(10, 47, 63, 13);
		IfAlta_Usuario.getContentPane().add(lblContrasena);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 75, 63, 13);
		IfAlta_Usuario.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 109, 63, 13);
		IfAlta_Usuario.getContentPane().add(lblApellido);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 143, 63, 13);
		IfAlta_Usuario.getContentPane().add(lblEmail);
		
		JLabel lblFecha = new JLabel("Fecha de Nacimiento");
		lblFecha.setBounds(10, 173, 105, 13);
		IfAlta_Usuario.getContentPane().add(lblFecha);
		
		textNickname = new JTextField();
		textNickname.setBounds(125, 14, 96, 19);
		IfAlta_Usuario.getContentPane().add(textNickname);
		
		passwordContrasena = new JPasswordField();
		passwordContrasena.setBounds(125, 43, 96, 20);
		IfAlta_Usuario.getContentPane().add(passwordContrasena);
		textNickname.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(125, 74, 96, 19);
		IfAlta_Usuario.getContentPane().add(textNombre);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(125, 108, 96, 19);
		IfAlta_Usuario.getContentPane().add(textApellido);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(125, 139, 96, 19);
		IfAlta_Usuario.getContentPane().add(textEmail);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(125, 169, 96, 19);
		IfAlta_Usuario.getContentPane().add(textFecha);
		
		JPanel panelDeposrtista = new JPanel();
		FlowLayout fl_panelDeposrtista = (FlowLayout) panelDeposrtista.getLayout();
		fl_panelDeposrtista.setAlignment(FlowLayout.LEFT);
		fl_panelDeposrtista.setAlignOnBaseline(true);
		panelDeposrtista.setBounds(253, 32, 233, 33);
		IfAlta_Usuario.getContentPane().add(panelDeposrtista);
		
		JCheckBox chckbxEsProfesioanl = new JCheckBox("Profesional");
		chckbxEsProfesioanl.setEnabled(false);
		panelDeposrtista.add(chckbxEsProfesioanl);
		
		JPanel panelEntrenador = new JPanel();
		panelEntrenador.setBounds(253, 102, 233, 55);
		IfAlta_Usuario.getContentPane().add(panelEntrenador);
		panelEntrenador.setLayout(null);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setEnabled(false);
		lblDisciplina.setBounds(10, 5, 68, 14);
		panelEntrenador.add(lblDisciplina);
		
		JLabel lblWeb = new JLabel("Pagina Web");
		lblWeb.setEnabled(false);
		lblWeb.setBounds(10, 35, 68, 14);
		panelEntrenador.add(lblWeb);
		
		textDisciplina = new JTextField();
		textDisciplina.setColumns(10);
		textDisciplina.setBounds(88, 2, 135, 19);
		textDisciplina.setEnabled(false);
		panelEntrenador.add(textDisciplina);
		
		textWeb = new JTextField();
		textWeb.setColumns(10);
		textWeb.setBounds(88, 32, 135, 19);
		textWeb.setEnabled(false);
		panelEntrenador.add(textWeb);
		
		JRadioButton rdbtnDeportista = new JRadioButton("Deportista");
		rdbtnDeportista.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (rdbtnDeportista.isSelected()) {
					chckbxEsProfesioanl.setEnabled(true);
				} else {
					chckbxEsProfesioanl.setEnabled(false);
				}
			}
		});
		rdbtnDeportista.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnDeportista.setBounds(253, 14, 233, 21);
		IfAlta_Usuario.getContentPane().add(rdbtnDeportista);
		
		JRadioButton rdbtnEntrenador = new JRadioButton("Entrenador");
		rdbtnEntrenador.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (rdbtnEntrenador.isSelected()) {
					lblDisciplina.setEnabled(true);
					textDisciplina.setEnabled(true);
					lblWeb.setEnabled(true);
					textWeb.setEnabled(true);
				}
				else {
					lblDisciplina.setEnabled(false);
					textDisciplina.setEnabled(false);
					lblWeb.setEnabled(false);
					textWeb.setEnabled(false);
				}
			}
		});
		rdbtnEntrenador.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnEntrenador.setBounds(253, 82, 233, 21);
		IfAlta_Usuario.getContentPane().add(rdbtnEntrenador);
		
		//Grupo de botones para que solo se seleccione uno
		ButtonGroup rdbtnGroup = new ButtonGroup();
		rdbtnGroup.add(rdbtnEntrenador);
		rdbtnGroup.add(rdbtnDeportista);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(278, 195, 105, 21);
		IfAlta_Usuario.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNickname.setText(null);
				passwordContrasena.setText(null);
				textNombre.setText(null);
				textApellido.setText(null);
				textEmail.setText(null);
				textFecha.setText(null);
				textDisciplina.setText(null);
				textWeb.setText(null);
				chckbxEsProfesioanl.setSelected(false);
				rdbtnGroup.clearSelection();
				IfAlta_Usuario.setVisible(false);
			}
		});
		btnCancelar.setBounds(393, 195, 105, 21);
		IfAlta_Usuario.getContentPane().add(btnCancelar);
		
		
		//=== FRAME X ==============================================================================
		
	}
	
}
