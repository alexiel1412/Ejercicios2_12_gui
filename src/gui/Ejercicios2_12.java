package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicios2_12 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbAceptar;
	private JRadioButton rdbRechazar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicios2_12 frame = new Ejercicios2_12();
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
	public Ejercicios2_12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][grow][][][]"));
		
		JLabel lblNewLabel = new JLabel("Aceptar las condiciones del servicio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("Acuerdo de licencia");
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 2,grow");
		panel.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "cell 0 0,grow");
		
		JTextPane txtpnGraciasPorSu = new JTextPane();
		txtpnGraciasPorSu.setText("Gracias por su interés en los servicios de juegos en línea y los juegos interactivos de Blizzard, así como los juegos interactivos de otros desarrolladores (\"Licenciantes\") que ofrecen sus juegos para estén disponibles a través de la Plataforma del servicio de juegos Battle.net. (Los juegos de Blizzard y de los Licenciantes se denominan colectivamente en el presente documento como los \"Juegos\"). El presente Contrato establece los términos y condiciones bajo los cuales tiene licencia para instalar y usar la Plataforma y, además, rige otros aspectos de la relación entre usted y Blizzard expuestos a continuación. Tal como se utiliza en este Contrato, el término \"Plataforma\" se refiere colectivamente, y en ocasiones individualmente, a 1) el software de la aplicación de escritorio Battle.net, 2) el servicio de juegos Battle.net, 3) cada uno de los Juegos, 4) Aplicaciones móviles autorizadas relacionadas con los Juegos y el servicio de juegos Battle.net, y 5) todas las funciones y componentes de cada uno de ellos, independientemente de que estén instalados o se usen en un ordenador, consola o dispositivo móvil.");
		scrollPane.setViewportView(txtpnGraciasPorSu);
		
		rdbAceptar = new JRadioButton("Aceptar Condiciones del Servicio");
		rdbAceptar.setSelected(true);
		buttonGroup.add(rdbAceptar);
		contentPane.add(rdbAceptar, "cell 0 3");
		
		rdbRechazar = new JRadioButton("No aceptar");
		buttonGroup.add(rdbRechazar);
		contentPane.add(rdbRechazar, "cell 0 4");
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				condiciones();
			}
		});
		contentPane.add(btnSiguiente, "cell 0 5,alignx center");
	}

	protected void condiciones()
	{
		int resp = 0;
		String mensaje = "Pasa por caja…";
		if (rdbAceptar.isSelected())
		{
            JOptionPane.showMessageDialog(null, mensaje);
            System.exit(0);
		}
		else if (rdbRechazar.isSelected())
		{
			resp = JOptionPane.showConfirmDialog(null, "¿Estás Seguro?", "YES_NO_OPTION",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
	        switch (resp)
	        {
		        case JOptionPane.YES_OPTION:
		        	JOptionPane.showMessageDialog(null, "La próxima vez será");
		        	System.exit(0);
		        	break;
		        case JOptionPane.NO_OPTION:
		            JOptionPane.showMessageDialog(null, mensaje);
		            System.exit(0);
	        }
        }
	}
}
