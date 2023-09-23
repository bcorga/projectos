package algoritmoPlanificacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class algoritmoPlanificacionFrame extends JFrame implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	static int disk_size = 200;
	private JPanel contentPane;
	private JTextField txtPeticiones;
	private JScrollPane scp;
	private JTextArea txtRespuesta;
	private JButton btnFCFS;
	private JTextField txtCantPeticiones;
	private JTextField txtHead;
	private JButton btnSSTF;
	private JButton btnSCAN;
	private JButton btnCSCAN;
	private JButton btnLOOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					algoritmoPlanificacionFrame frame = new algoritmoPlanificacionFrame();
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
	public algoritmoPlanificacionFrame() {
		setTitle("UPC - EPE ( U202320106 - BRYAN CORDOVA GALINDO)");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\UPC\\UPC_logo_transparente.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("ALGORITMOS DE PLANIFICACIÓN");
		lblTitulo.setBackground(new Color(240, 240, 240));
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 28));
		lblTitulo.setBounds(186, 0, 515, 70);
		contentPane.add(lblTitulo);
		
		btnFCFS = new JButton("FCFS");
		btnFCFS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFCFS.addActionListener(this);
		btnFCFS.setBounds(30, 177, 118, 35);
		contentPane.add(btnFCFS);
		
		btnSSTF = new JButton("SSTF");
		btnSSTF.addActionListener(this);
		btnSSTF.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSSTF.setBounds(30, 223, 118, 35);
		contentPane.add(btnSSTF);
		
		btnSCAN = new JButton("SCAN");
		btnSCAN.addActionListener(this);
		btnSCAN.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSCAN.setBounds(30, 267, 118, 35);
		contentPane.add(btnSCAN);
		
		btnCSCAN = new JButton("CSCAN");
		btnCSCAN.addActionListener(this);
		btnCSCAN.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCSCAN.setBounds(30, 313, 118, 35);
		contentPane.add(btnCSCAN);
		
		btnLOOK = new JButton("LOOK");
		btnLOOK.addActionListener(this);
		btnLOOK.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLOOK.setBounds(30, 359, 118, 35);
		contentPane.add(btnLOOK);
		
		scp = new JScrollPane();
		scp.setBounds(185, 142, 550, 271);
		contentPane.add(scp);

		txtRespuesta = new JTextArea();
		txtRespuesta.setText("Inicio de Peteición: \r\nIngresar el punto de partida de la secuencia.\r\nCantidad de Peticiones:\r\nNúmero de peticiones que va ingresar.\r\nEjemplo: 5\r\nPeticiones:\r\nAñada la secuencia de peticiones separadas por una (\",\")\r\nEjemplo: 23, 56, 67, 90, 150");
		scp.setViewportView(txtRespuesta);
		
		txtPeticiones = new JTextField();
		txtPeticiones.addKeyListener(this);
		txtPeticiones.setBounds(268, 111, 468, 20);
		contentPane.add(txtPeticiones);
		txtPeticiones.setColumns(10);
		
		JLabel lblPeticiones = new JLabel("PETICIONES:");
		lblPeticiones.setBounds(185, 111, 73, 20);
		contentPane.add(lblPeticiones);
		
		JLabel lblCantPeticiones = new JLabel("Cantidad de Peticiones:");
		lblCantPeticiones.setBounds(328, 81, 135, 14);
		contentPane.add(lblCantPeticiones);
		
		txtCantPeticiones = new JTextField();
		txtCantPeticiones.addKeyListener(this);
		txtCantPeticiones.setBounds(478, 78, 50, 20);
		contentPane.add(txtCantPeticiones);
		txtCantPeticiones.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Inicio Petición:");
		lblNewLabel.setBounds(185, 81, 101, 14);
		contentPane.add(lblNewLabel);
		
		txtHead = new JTextField();
		txtHead.addKeyListener(this);
		txtHead.setBounds(277, 78, 41, 20);
		contentPane.add(txtHead);
		txtHead.setColumns(10);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setIcon(new ImageIcon("E:\\UPC\\fonfoooo.png"));
		lblFondo.setBounds(0, 0, 883, 475);
		contentPane.add(lblFondo);
	}
	
	// Direcciona eventos de tipo ActionEvent
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == btnLOOK) {
				btnLOOKActionPerformed(arg0);
			}
			if (arg0.getSource() == btnCSCAN) {
				btnCSCANActionPerformed(arg0);
			}
			if (arg0.getSource() == btnSCAN) {
				btnSCANActionPerformed(arg0);
			}
			if (arg0.getSource() == btnSSTF) {
				btnSSTFActionPerformed(arg0);
			}
			if (arg0.getSource() == btnFCFS) {
				btnFCFSActionPerformed(arg0);
			}
			
		}
		
	// Procesa la pulsación del botón FCFS	
	protected void btnFCFSActionPerformed(ActionEvent arg0) {
		
		int size = Integer.valueOf(txtCantPeticiones.getText());
		int head = Integer.valueOf(txtHead.getText());
		String peticiones = txtPeticiones.getText().replaceAll("\\s","");
		
		String [] lista = peticiones.split(",");
		try {
			
			int seek_count = 0;
			int distance;
			String cur_track;

			for (int i = 0; i < size; i++)
			{
				cur_track = lista[i];

				// calculate absolute distance
				distance = Math.abs(Integer.valueOf(cur_track) - head);

				// increase the total count
				seek_count += distance;

				// accessed track is now new head
				head = Integer.valueOf(cur_track);
			}

			System.out.println("Total " +
							"seek time = " +
								seek_count);

			// Seek sequence would be the same
			// as request array sequence
			System.out.println("Seek Sequence is");
			
			txtRespuesta.setText("RESPUESTA DE PETICIONES \n");
			txtRespuesta.append("Total seek time : " + seek_count + "\n");
			txtRespuesta.append("La secuencia es la siguiente : " + "\n");
			for (int i = 0; i < size; i++)
			{
				System.out.println(lista[i]);
				txtRespuesta.append(lista[i]+ "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			txtRespuesta.setText(e.getMessage());
		}
		
	}
	
	public static void calculateDifference(String[] request,
			int head, node diff[])
			
	{
	for (int i = 0; i < diff.length; i++)
	diff[i].distance = Math.abs(Integer.parseInt(request[i]) - head);
	}
	
	// find unaccessed track
	// which is at minimum distance from head
	public static int findMin(node diff[])
	{
	int index = -1, minimum = Integer.MAX_VALUE;
	
	for (int i = 0; i < diff.length; i++) {
	if (!diff[i].accessed && minimum > diff[i].distance) {
	
	minimum = diff[i].distance;
	index = i;
	}
	}
	return index;
	}
	
	class node {
		
		// represent difference between
		// head position and track number
		int distance = 0;
		
		// true if track has been accessed
		boolean accessed = false;
	}

	protected void btnSSTFActionPerformed(ActionEvent arg0) {
		
		int head = Integer.valueOf(txtHead.getText());
		String peticiones = txtPeticiones.getText().replaceAll("\\s","");
		
		String [] request = peticiones.split(",");
		
		try {
			if (request.length == 0)
				return;
				
			// create array of objects of class node
			node diff[] = new node[request.length];
			
			// initialize array
			for (int i = 0; i < diff.length; i++)
			
				diff[i] = new node();
			
			// count total number of seek operation
			int seek_count = 0;
			
			// stores sequence in which disk access is done
			int[] seek_sequence = new int[request.length + 1];
			
			for (int i = 0; i < request.length; i++) {
				
				seek_sequence[i] = head;
				calculateDifference(request, head, diff);
				
				int index = findMin(diff);
				
				diff[index].accessed = true;
				
				// increase the total count
				seek_count += diff[index].distance;
				
				// accessed track is now new head
				head = Integer.parseInt(request[index]);
			}
			
			// for last accessed track
			seek_sequence[seek_sequence.length - 1] = head;
			
			System.out.println("Total number of seek operations = "
														+ seek_count);
														
			System.out.println("Seek Sequence is");
			txtRespuesta.setText("RESPUESTA DE PETICIONES \n");
			txtRespuesta.append("Total seek time : " + seek_count + "\n");
			txtRespuesta.append("La secuencia es la siguiente : " + "\n");
			
			// print the sequence
			for (int i = 0; i < seek_sequence.length; i++) {
				System.out.println(seek_sequence[i]);
			txtRespuesta.append(seek_sequence[i]+ "\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			txtRespuesta.setText(e.getMessage());
		}
		
		
	}
	protected void btnSCANActionPerformed(ActionEvent arg0) {
		
		
		try {
			int size = Integer.valueOf(txtCantPeticiones.getText());
			int head = Integer.valueOf(txtHead.getText());
			String peticiones = txtPeticiones.getText().replaceAll("\\s","");
			
			String [] arr = peticiones.split(",");

		    String direction = "left";
			
			int seek_count = 0;
		    int distance, cur_track;
		    Vector<Integer> left = new Vector<Integer>(),
		                    right = new Vector<Integer>();
		    Vector<Integer> seek_sequence = new Vector<Integer>();
		 
		    // appending end values
		    // which has to be visited
		    // before reversing the direction
		    if (direction == "left")
		        left.add(0);
		    else if (direction == "right")
		        right.add(disk_size - 1);
		 
		    for (int i = 0; i < size; i++)
		    {
		        if (Integer.parseInt(arr[i]) < head)
		            left.add(Integer.parseInt(arr[i]));
		        if (Integer.parseInt(arr[i]) > head)
		            right.add(Integer.parseInt(arr[i]));
		    }
		 
		    // sorting left and right vectors
		    Collections.sort(left);
		    Collections.sort(right);
		 
		    // run the while loop two times.
		    // one by one scanning right
		    // and left of the head
		    int run = 2;
		    while (run-- >0)
		    {
		        if (direction == "left")
		        {
		            for (int i = left.size() - 1; i >= 0; i--)
		            {
		                cur_track = left.get(i);
		 
		                // appending current track to seek sequence
		                seek_sequence.add(cur_track);
		 
		                // calculate absolute distance
		                distance = Math.abs(cur_track - head);
		 
		                // increase the total count
		                seek_count += distance;
		 
		                // accessed track is now the new head
		                head = cur_track;
		            }
		            direction = "right";
		        }
		        else if (direction == "right")
		        {
		            for (int i = 0; i < right.size(); i++)
		            {
		                cur_track = right.get(i);
		                 
		                // appending current track to seek sequence
		                seek_sequence.add(cur_track);
		 
		                // calculate absolute distance
		                distance = Math.abs(cur_track - head);
		 
		                // increase the total count
		                seek_count += distance;
		 
		                // accessed track is now new head
		                head = cur_track;
		            }
		            direction = "left";
		        }
		    }
		 
		    System.out.print("Total number of seek operations = "
		                        + seek_count + "\n");
		 
		    System.out.print("Seek Sequence is" + "\n");
		    txtRespuesta.setText("RESPUESTA DE PETICIONES \n");
			txtRespuesta.append("Total seek time : " + seek_count + "\n");
			txtRespuesta.append("La secuencia es la siguiente : " + "\n");
		 
		    for (int i = 0; i < seek_sequence.size(); i++)
		    {
		        System.out.print(seek_sequence.get(i) + "\n");
		        txtRespuesta.append(seek_sequence.get(i)+ "\n");
		    }
		} catch (Exception e) {
			// TODO: handle exception
			txtRespuesta.setText(e.getMessage());
		}
		
	}
	protected void btnCSCANActionPerformed(ActionEvent arg0) {
		
		int size = Integer.valueOf(txtCantPeticiones.getText());
		int head = Integer.valueOf(txtHead.getText());
		String peticiones = txtPeticiones.getText().replaceAll("\\s","");
		
		String [] arr = peticiones.split(",");				
		int seek_count = 0;
		int distance, cur_track;

		try {
			Vector<Integer> left = new Vector<Integer>();
			Vector<Integer> right = new Vector<Integer>();
			Vector<Integer> seek_sequence
				= new Vector<Integer>();

			// Appending end values which has
			// to be visited before reversing
			// the direction
			left.add(0);
			right.add(disk_size - 1);

			// Tracks on the left of the
			// head will be serviced when
			// once the head comes back
			// to the beginning (left end).
			for (int i = 0; i < size; i++) {
				if (Integer.parseInt(arr[i]) < head)
					left.add(Integer.parseInt(arr[i]));
				if (Integer.parseInt(arr[i]) > head)
					right.add(Integer.parseInt(arr[i]));
			}

			// Sorting left and right vectors
			Collections.sort(left);
			Collections.sort(right);

			// First service the requests
			// on the right side of the
			// head.
			for (int i = 0; i < right.size(); i++) {
				cur_track = right.get(i);

				// Appending current track to seek sequence
				seek_sequence.add(cur_track);

				// Calculate absolute distance
				distance = Math.abs(cur_track - head);

				// Increase the total count
				seek_count += distance;

				// Accessed track is now new head
				head = cur_track;
			}

			// Once reached the right end
			// jump to the beginning.
			head = 0;

			// adding seek count for head returning from 199 to
			// 0
			seek_count += (disk_size - 1);

			// Now service the requests again
			// which are left.
			for (int i = 0; i < left.size(); i++) {
				cur_track = left.get(i);

				// Appending current track to
				// seek sequence
				seek_sequence.add(cur_track);

				// Calculate absolute distance
				distance = Math.abs(cur_track - head);

				// Increase the total count
				seek_count += distance;

				// Accessed track is now the new head
				head = cur_track;
			}

			System.out.println("Total number of seek "
							+ "operations = " + seek_count);

			System.out.println("Seek Sequence is");
			txtRespuesta.setText("RESPUESTA DE PETICIONES \n");
			txtRespuesta.append("Total seek time : " + seek_count + "\n");
			txtRespuesta.append("La secuencia es la siguiente : " + "\n");
			
			for (int i = 0; i < seek_sequence.size(); i++) {
				System.out.println(seek_sequence.get(i));
				txtRespuesta.append(seek_sequence.get(i)+ "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			txtRespuesta.setText(e.getMessage());
		}
		
	}
	protected void btnLOOKActionPerformed(ActionEvent arg0) {
		
		int size = Integer.valueOf(txtCantPeticiones.getText());
		int head = Integer.valueOf(txtHead.getText());
		String peticiones = txtPeticiones.getText().replaceAll("\\s","");
		
		String [] arr = peticiones.split(",");	
		int seek_count = 0;
		int distance, cur_track;
		
		try {
			Vector<Integer> left = new Vector<Integer>();
			Vector<Integer> right = new Vector<Integer>();
			Vector<Integer> seek_sequence = new Vector<Integer>();

			// Tracks on the left of the
			// head will be serviced when
			// once the head comes back
			// to the beginning (left end)
			for(int i = 0; i < size; i++)
			{
				if (Integer.parseInt(arr[i]) < head)
					left.add(Integer.parseInt(arr[i]));
				if (Integer.parseInt(arr[i]) > head)
					right.add(Integer.parseInt(arr[i]));
			}

			// Sorting left and right vectors
			Collections.sort(left);
			Collections.sort(right);

			// First service the requests
			// on the right side of the
			// head
			for(int i = 0; i < right.size(); i++)
			{
				cur_track = right.get(i);

				// Appending current track
				// to seek sequence
				seek_sequence.add(cur_track);

				// Calculate absolute distance
				distance = Math.abs(cur_track - head);

				// Increase the total count
				seek_count += distance;

				// Accessed track is now new head
				head = cur_track;
			}

			// Once reached the right end
			// jump to the last track that
			// is needed to be serviced in
			// left direction
			seek_count += Math.abs(head - left.get(0));
			head = left.get(0);

			// Now service the requests again
			// which are left
			for(int i = 0; i < left.size(); i++)
			{
				cur_track = left.get(i);

				// Appending current track to
				// seek sequence
				seek_sequence.add(cur_track);

				// Calculate absolute distance
				distance = Math.abs(cur_track - head);

				// Increase the total count
				seek_count += distance;

				// Accessed track is now the new head
				head = cur_track;
			}
			
			System.out.println("Total number of seek " +
							"operations = " + seek_count);

			System.out.println("Seek Sequence is");

			txtRespuesta.setText("RESPUESTA DE PETICIONES \n");
			txtRespuesta.append("Total seek time : " + seek_count + "\n");
			txtRespuesta.append("La secuencia es la siguiente : " + "\n");
			
			for(int i = 0; i < seek_sequence.size(); i++)
			{
				System.out.println(seek_sequence.get(i));
				txtRespuesta.append(seek_sequence.get(i)+ "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			txtRespuesta.setText(e.getMessage());
		}
		
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtCantPeticiones) {
			txtCantPeticionesKeyTyped(e);
		}
		if (e.getSource() == txtHead) {
			txtHeadKeyTyped(e);
		}
		if (e.getSource() == txtPeticiones) {
			txtPeticionesKeyTyped(e);
		}
	}
	protected void txtPeticionesKeyTyped(KeyEvent e) {
		int key = e.getKeyChar();

		if((key<'0' || key>'9') && (key<',' || key>',')) e.consume();
	}
	protected void txtHeadKeyTyped(KeyEvent e) {
		char car = e.getKeyChar();
		if((car<'0' || car>'9')) e.consume();
	}
	protected void txtCantPeticionesKeyTyped(KeyEvent e) {
		char car = e.getKeyChar();
		if((car<'0' || car>'9')) e.consume();
	}
}
