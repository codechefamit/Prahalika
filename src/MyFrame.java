import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Color col;
	private JButton btnBlueTL,btnBlueTM,btnBlueTR,btnBlueML,btnBlueMM,btnBlueMR,btnBlueBL,btnBlueBM,btnBlueBR;
	private JButton btnRedTL,btnRedTM,btnRedTR,btnRedML,btnRedMM,btnRedMR,btnRedBL,btnRedBM,btnRedBR;
	private JLabel lblRedFacekeep;
	private JLabel lblPrahalikarubiksCubeSolver;
	private JLabel lblGreenFacekeep;
	private JButton btnGreenTM,btnGreenTR,btnGreenMR,btnGreenMM,btnGreenML,btnGreenTL,btnGreenBL,btnGreenBM,btnGreenBR;
	private JLabel lblOrangeFacekeep;
	private JButton btnOrangeTL,btnOrangeTM,btnOrangeTR,btnOrangeMR,btnOrangeBR,btnOrangeBM,btnOrangeBL,btnOrangeML,btnOrangeMM;
	private JButton btnYellowTL,btnYellowTM,btnYellowTR,btnYellowMR,btnYellowBR,btnYellowBM,btnYellowBL,btnYellowML,btnYellowMM;
	private JLabel lblWhiteFacekeep;
	private JButton btnWhiteTL,btnWhiteTM, btnWhiteTR,btnWhiteML,btnWhiteMM,btnWhiteMR,btnWhiteBL,btnWhiteBM,btnWhiteBR;
	private JButton btnReset;
	private JButton btnSolve;
	private JLabel lblPhases;
	private String[] phase={"Phase 1:White Cross","Phase 2:White Corners","Phase 3:Edges","Phase 4:Yellow Cross","Phase 5:Yellow Corners","Phase 6:Correcting Corners","Phase 7:Complete The Cube"};
	private JList<?> listOfPhases;
	private Cube state1,state2,state3,state4,state5,state6,state7;
	private String[] ph1r,ph2r,ph3r,ph4r,ph5r,ph6r,ph7r;
	private JScrollPane scrollPaneRotation;
	private JList<String> listRotation;
	private String[] fname={"res/L.png","res/R.png","res/U.png","res/F.png","res/B.png","res/AL.png","res/AR.png","res/AU.png","res/AF.png","res/AB.png"};
	private JLabel lblInstructions,thumb;
	private int picIndex;
	private JLabel lblLblnote;
	private JLabel lblMoves;
	private JLabel lblCount;
	private JLabel lblCopyright;
	public MyFrame() {
		super("Prahalika (A Rubiks Cube Solver) By Amit Kothiyal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		col=Color.BLUE;
		JLabel lblColor = new JLabel("Choose Color :");
		lblColor.setFont(new Font("Serif", Font.BOLD, 16));
		lblColor.setBounds(10, 50, 120, 40);
		getContentPane().add(lblColor);
		
		
		picIndex=0;
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setSelected(true);
		rdbtnBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				col=Color.BLUE;
			}
		});
		buttonGroup.add(rdbtnBlue);
		rdbtnBlue.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnBlue.setBounds(20, 89, 110, 23);
		getContentPane().add(rdbtnBlue);
		
		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				col=Color.RED;
			}
		});
		buttonGroup.add(rdbtnRed);
		rdbtnRed.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnRed.setBounds(20, 115, 110, 23);
		getContentPane().add(rdbtnRed);
		
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				col=Color.GREEN;
			}
		});
		buttonGroup.add(rdbtnGreen);
		rdbtnGreen.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnGreen.setBounds(20, 141, 110, 23);
		getContentPane().add(rdbtnGreen);
		
		JRadioButton rdbtnOrange = new JRadioButton("Orange");
		rdbtnOrange.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				col=Color.ORANGE;
			}
		});
		buttonGroup.add(rdbtnOrange);
		rdbtnOrange.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnOrange.setBounds(20, 167, 110, 23);
		getContentPane().add(rdbtnOrange);
		
		JRadioButton rdbtnYellow = new JRadioButton("Yellow");
		rdbtnYellow.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				col=Color.YELLOW;
			}
		});
		buttonGroup.add(rdbtnYellow);
		rdbtnYellow.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnYellow.setBounds(20, 193, 110, 23);
		getContentPane().add(rdbtnYellow);
		
		JRadioButton rdbtnWhite = new JRadioButton("White");
		rdbtnWhite.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				col=Color.WHITE;
			}
		});
		buttonGroup.add(rdbtnWhite);
		rdbtnWhite.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnWhite.setBounds(20, 219, 110, 23);
		getContentPane().add(rdbtnWhite);
		
		JLabel lblBlueFacekeep = new JLabel("Blue Face (keep yellow as top)");
		lblBlueFacekeep.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblBlueFacekeep.setBounds(150, 51, 160, 40);
		getContentPane().add(lblBlueFacekeep);
		
		btnBlueTL = new JButton("");
		btnBlueTL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueTL.setBackground(col);
			}
		});
		btnBlueTL.setBackground(Color.BLUE);
		btnBlueTL.setBounds(150, 89, 40, 40);
		getContentPane().add(btnBlueTL);
		
		btnBlueTM = new JButton("");
		btnBlueTM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueTM.setBackground(col);
			}
		});
		btnBlueTM.setBackground(Color.BLUE);
		btnBlueTM.setBounds(200, 89, 40, 40);
		getContentPane().add(btnBlueTM);
		
		btnBlueTR = new JButton("");
		btnBlueTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueTR.setBackground(col);
			}
		});
		btnBlueTR.setBackground(Color.BLUE);
		btnBlueTR.setBounds(250, 89, 40, 40);
		getContentPane().add(btnBlueTR);
		
		btnBlueML = new JButton("");
		btnBlueML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueML.setBackground(col);
			}
		});
		btnBlueML.setBackground(Color.BLUE);
		btnBlueML.setBounds(150, 134, 40, 40);
		getContentPane().add(btnBlueML);
		
		btnBlueMM = new JButton("");
		btnBlueMM.setBackground(Color.BLUE);
		btnBlueMM.setBounds(200, 134, 40, 40);
		getContentPane().add(btnBlueMM);
		
		btnBlueMR = new JButton("");
		btnBlueMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueMR.setBackground(col);
			}
		});
		btnBlueMR.setBackground(Color.BLUE);
		btnBlueMR.setBounds(250, 134, 40, 40);
		getContentPane().add(btnBlueMR);
		
		btnBlueBL = new JButton("");
		btnBlueBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueBL.setBackground(col);
			}
		});
		btnBlueBL.setBackground(Color.BLUE);
		btnBlueBL.setBounds(150, 179, 40, 40);
		getContentPane().add(btnBlueBL);
		
		btnBlueBM = new JButton("");
		btnBlueBM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueBM.setBackground(col);
			}
		});
		btnBlueBM.setBackground(Color.BLUE);
		btnBlueBM.setBounds(200, 179, 40, 40);
		getContentPane().add(btnBlueBM);
		
		btnBlueBR = new JButton("");
		btnBlueBR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueBR.setBackground(col);
			}
		});
		btnBlueBR.setBackground(Color.BLUE);
		btnBlueBR.setBounds(250, 179, 40, 40);
		getContentPane().add(btnBlueBR);
		
		btnRedTL = new JButton("");
		btnRedTL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedTL.setBackground(col);
			}
		});
		btnRedTL.setBackground(Color.RED);
		btnRedTL.setBounds(320, 86, 40, 40);
		getContentPane().add(btnRedTL);
		
		btnRedTM = new JButton("");
		btnRedTM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedTM.setBackground(col);
			}
		});
		btnRedTM.setBackground(Color.RED);
		btnRedTM.setBounds(370, 86, 40, 40);
		getContentPane().add(btnRedTM);
		
		btnRedTR = new JButton("");
		btnRedTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedTR.setBackground(col);
			}
		});
		btnRedTR.setBackground(Color.RED);
		btnRedTR.setBounds(420, 86, 40, 40);
		getContentPane().add(btnRedTR);
		
		btnRedML = new JButton("");
		btnRedML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedML.setBackground(col);
			}
		});
		btnRedML.setBackground(Color.RED);
		btnRedML.setBounds(320, 131, 40, 40);
		getContentPane().add(btnRedML);
		
		btnRedMM = new JButton("");
		btnRedMM.setBackground(Color.RED);
		btnRedMM.setBounds(370, 131, 40, 40);
		getContentPane().add(btnRedMM);
		
		btnRedMR = new JButton("");
		btnRedMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedMR.setBackground(col);
			}
		});
		btnRedMR.setBackground(Color.RED);
		btnRedMR.setBounds(420, 131, 40, 40);
		getContentPane().add(btnRedMR);
		
		btnRedBL = new JButton("");
		btnRedBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedBL.setBackground(col);
			}
		});
		btnRedBL.setBackground(Color.RED);
		btnRedBL.setBounds(320, 176, 40, 40);
		getContentPane().add(btnRedBL);
		
		btnRedBM = new JButton("");
		btnRedBM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedBM.setBackground(col);
			}
		});
		btnRedBM.setBackground(Color.RED);
		btnRedBM.setBounds(370, 176, 40, 40);
		getContentPane().add(btnRedBM);
		
		btnRedBR = new JButton("");
		btnRedBR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnRedBR.setBackground(col);
			}
		});
		btnRedBR.setBackground(Color.RED);
		btnRedBR.setBounds(420, 176, 40, 40);
		getContentPane().add(btnRedBR);
		
		lblRedFacekeep = new JLabel("Red Face (keep yellow as top)");
		lblRedFacekeep.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblRedFacekeep.setBounds(320, 51, 170, 40);
		getContentPane().add(lblRedFacekeep);
		
		lblPrahalikarubiksCubeSolver = new JLabel("Prahalika");
		lblPrahalikarubiksCubeSolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrahalikarubiksCubeSolver.setFont(new Font("Serif", Font.BOLD, 35));
		lblPrahalikarubiksCubeSolver.setBounds(250, 11, 176, 40);
		getContentPane().add(lblPrahalikarubiksCubeSolver);
		
		lblGreenFacekeep = new JLabel("Green Face (keep yellow as top)");
		lblGreenFacekeep.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblGreenFacekeep.setBounds(150, 219, 160, 40);
		getContentPane().add(lblGreenFacekeep);
		
		btnGreenTM = new JButton("");
		btnGreenTM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenTM.setBackground(col);
			}
		});
		btnGreenTM.setBackground(Color.GREEN);
		btnGreenTM.setBounds(200, 257, 40, 40);
		getContentPane().add(btnGreenTM);
		
		btnGreenTR = new JButton("");
		btnGreenTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenTR.setBackground(col);
			}
		});
		btnGreenTR.setBackground(Color.GREEN);
		btnGreenTR.setBounds(250, 257, 40, 40);
		getContentPane().add(btnGreenTR);
		
		btnGreenMR = new JButton("");
		btnGreenMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenMR.setBackground(col);
			}
		});
		btnGreenMR.setBackground(Color.GREEN);
		btnGreenMR.setBounds(250, 302, 40, 40);
		getContentPane().add(btnGreenMR);
		
		btnGreenMM = new JButton("");
		btnGreenMM.setBackground(Color.GREEN);
		btnGreenMM.setBounds(200, 302, 40, 40);
		getContentPane().add(btnGreenMM);
		
		btnGreenML = new JButton("");
		btnGreenML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenML.setBackground(col);
			}
		});
		btnGreenML.setBackground(Color.GREEN);
		btnGreenML.setBounds(150, 302, 40, 40);
		getContentPane().add(btnGreenML);
		
		btnGreenTL = new JButton("");
		btnGreenTL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenTL.setBackground(col);
			}
		});
		btnGreenTL.setBackground(Color.GREEN);
		btnGreenTL.setBounds(150, 257, 40, 40);
		getContentPane().add(btnGreenTL);
		
		btnGreenBL = new JButton("");
		btnGreenBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenBL.setBackground(col);
			}
		});
		btnGreenBL.setBackground(Color.GREEN);
		btnGreenBL.setBounds(150, 347, 40, 40);
		getContentPane().add(btnGreenBL);
		
		btnGreenBM = new JButton("");
		btnGreenBM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenBM.setBackground(col);
			}
		});
		btnGreenBM.setBackground(Color.GREEN);
		btnGreenBM.setBounds(200, 347, 40, 40);
		getContentPane().add(btnGreenBM);
		
		btnGreenBR = new JButton("");
		btnGreenBR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnGreenBR.setBackground(col);
			}
		});
		btnGreenBR.setBackground(Color.GREEN);
		btnGreenBR.setBounds(250, 347, 40, 40);
		getContentPane().add(btnGreenBR);
		
		lblOrangeFacekeep = new JLabel("Orange Face (keep yellow as top)");
		lblOrangeFacekeep.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblOrangeFacekeep.setBounds(320, 219, 170, 40);
		getContentPane().add(lblOrangeFacekeep);
		
		btnOrangeTL = new JButton("");
		btnOrangeTL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeTL.setBackground(col);
			}
		});
		btnOrangeTL.setBackground(Color.ORANGE);
		btnOrangeTL.setBounds(320, 257, 40, 40);
		getContentPane().add(btnOrangeTL);
		
		btnOrangeTM = new JButton("");
		btnOrangeTM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeTM.setBackground(col);
			}
		});
		btnOrangeTM.setBackground(Color.ORANGE);
		btnOrangeTM.setBounds(370, 257, 40, 40);
		getContentPane().add(btnOrangeTM);
		
		btnOrangeTR = new JButton("");
		btnOrangeTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeTR.setBackground(col);
			}
		});
		btnOrangeTR.setBackground(Color.ORANGE);
		btnOrangeTR.setBounds(420, 257, 40, 40);
		getContentPane().add(btnOrangeTR);
		
		btnOrangeMR = new JButton("");
		btnOrangeMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeMR.setBackground(col);
			}
		});
		btnOrangeMR.setBackground(Color.ORANGE);
		btnOrangeMR.setBounds(420, 302, 40, 40);
		getContentPane().add(btnOrangeMR);
		
		btnOrangeBR = new JButton("");
		btnOrangeBR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeBR.setBackground(col);
			}
		});
		btnOrangeBR.setBackground(Color.ORANGE);
		btnOrangeBR.setBounds(420, 347, 40, 40);
		getContentPane().add(btnOrangeBR);
		
		btnOrangeBM = new JButton("");
		btnOrangeBM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeBM.setBackground(col);
			}
		});
		btnOrangeBM.setBackground(Color.ORANGE);
		btnOrangeBM.setBounds(370, 347, 40, 40);
		getContentPane().add(btnOrangeBM);
		
		btnOrangeBL = new JButton("");
		btnOrangeBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeBL.setBackground(col);
			}
		});
		btnOrangeBL.setBackground(Color.ORANGE);
		btnOrangeBL.setBounds(320, 347, 40, 40);
		getContentPane().add(btnOrangeBL);
		
		btnOrangeML = new JButton("");
		btnOrangeML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnOrangeML.setBackground(col);
			}
		});
		btnOrangeML.setBackground(Color.ORANGE); 
		btnOrangeML.setBounds(320, 302, 40, 40);
		getContentPane().add(btnOrangeML);
		
		btnOrangeMM = new JButton("");
		btnOrangeMM.setBackground(Color.ORANGE);
		btnOrangeMM.setBounds(370, 302, 40, 40);
		getContentPane().add(btnOrangeMM);
		
		JLabel lblYellowFacekeep = new JLabel("Yellow Face (keep green as top)");
		lblYellowFacekeep.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblYellowFacekeep.setBounds(490, 51, 170, 40);
		getContentPane().add(lblYellowFacekeep);
		
		btnYellowTL = new JButton("");
		btnYellowTL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowTL.setBackground(col);
			}
		});
		btnYellowTL.setBackground(Color.YELLOW);
		btnYellowTL.setBounds(490, 86, 40, 40);
		getContentPane().add(btnYellowTL);
		
		btnYellowTM = new JButton("");
		btnYellowTM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowTM.setBackground(col);
			}
		});
		btnYellowTM.setBackground(Color.YELLOW);
		btnYellowTM.setBounds(540, 86, 40, 40);
		getContentPane().add(btnYellowTM);
		
		btnYellowTR = new JButton("");
		btnYellowTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowTR.setBackground(col);
			}
		});
		btnYellowTR.setBackground(Color.YELLOW);
		btnYellowTR.setBounds(590, 86, 40, 40);
		getContentPane().add(btnYellowTR);
		
		btnYellowML = new JButton("");
		btnYellowML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowML.setBackground(col);
			}
		});
		btnYellowML.setBackground(Color.YELLOW);
		btnYellowML.setBounds(490, 131, 40, 40);
		getContentPane().add(btnYellowML);
		
		btnYellowMM = new JButton("");
		btnYellowMM.setBackground(Color.YELLOW);
		btnYellowMM.setBounds(540, 131, 40, 40);
		getContentPane().add(btnYellowMM);
		
		btnYellowMR = new JButton("");
		btnYellowMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowMR.setBackground(col);
			}
		});
		btnYellowMR.setBackground(Color.YELLOW);
		btnYellowMR.setBounds(590, 131, 40, 40);
		getContentPane().add(btnYellowMR);
		
		btnYellowBL = new JButton("");
		btnYellowBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowBL.setBackground(col);
			}
		});
		btnYellowBL.setBackground(Color.YELLOW);
		btnYellowBL.setBounds(490, 176, 40, 40);
		getContentPane().add(btnYellowBL);
		
		btnYellowBM = new JButton("");
		btnYellowBM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowBM.setBackground(col);
			}
		});
		btnYellowBM.setBackground(Color.YELLOW);
		btnYellowBM.setBounds(540, 176, 40, 40);
		getContentPane().add(btnYellowBM);
		
		btnYellowBR = new JButton("");
		btnYellowBR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnYellowBR.setBackground(col);
			}
		});
		btnYellowBR.setBackground(Color.YELLOW);
		btnYellowBR.setBounds(590, 176, 40, 40);
		getContentPane().add(btnYellowBR);
		
		lblWhiteFacekeep = new JLabel("White Face (keep blue as top)");
		lblWhiteFacekeep.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblWhiteFacekeep.setBounds(490, 219, 170, 40);
		getContentPane().add(lblWhiteFacekeep);
		
		btnWhiteTL = new JButton("");
		btnWhiteTL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteTL.setBackground(col);
			}
		});
		btnWhiteTL.setBackground(Color.WHITE);
		btnWhiteTL.setBounds(490, 257, 40, 40);
		getContentPane().add(btnWhiteTL);
		
		btnWhiteTM = new JButton("");
		btnWhiteTM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteTM.setBackground(col);
			}
		});
		btnWhiteTM.setBackground(Color.WHITE);
		btnWhiteTM.setBounds(540, 257, 40, 40);
		getContentPane().add(btnWhiteTM);
		
		btnWhiteTR = new JButton("");
		btnWhiteTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteTR.setBackground(col);
			}
		});
		btnWhiteTR.setBackground(Color.WHITE);
		btnWhiteTR.setBounds(590, 257, 40, 40);
		getContentPane().add(btnWhiteTR);
		
		btnWhiteML = new JButton("");
		btnWhiteML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteML.setBackground(col);
			}
		});
		btnWhiteML.setBackground(Color.WHITE);
		btnWhiteML.setBounds(490, 302, 40, 40);
		getContentPane().add(btnWhiteML);
		
		btnWhiteMM = new JButton("");
		btnWhiteMM.setBackground(Color.WHITE);
		btnWhiteMM.setBounds(540, 302, 40, 40);
		getContentPane().add(btnWhiteMM);
		
		btnWhiteMR = new JButton("");
		btnWhiteMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteMR.setBackground(col);
			}
		});
		btnWhiteMR.setBackground(Color.WHITE);
		btnWhiteMR.setBounds(590, 302, 40, 40);
		getContentPane().add(btnWhiteMR);
		
		btnWhiteBL = new JButton("");
		btnWhiteBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteBL.setBackground(col);
			}
		});
		btnWhiteBL.setBackground(Color.WHITE);
		btnWhiteBL.setBounds(490, 347, 40, 40);
		getContentPane().add(btnWhiteBL);
		
		btnWhiteBM = new JButton("");
		btnWhiteBM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteBM.setBackground(col);
			}
		});
		btnWhiteBM.setBackground(Color.WHITE);
		btnWhiteBM.setBounds(540, 347, 40, 40);
		getContentPane().add(btnWhiteBM);
		
		btnWhiteBR = new JButton("");
		btnWhiteBR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnWhiteBR.setBackground(col);
			}
		});
		btnWhiteBR.setBackground(Color.WHITE);
		btnWhiteBR.setBounds(590, 347, 40, 40);
		getContentPane().add(btnWhiteBR);
		
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				btnBlueTL.setBackground(Color.BLUE);
				btnBlueTM.setBackground(Color.BLUE);
				btnBlueTR.setBackground(Color.BLUE);
				btnBlueBL.setBackground(Color.BLUE);
				btnBlueBM.setBackground(Color.BLUE);
				btnBlueBR.setBackground(Color.BLUE);
				btnBlueML.setBackground(Color.BLUE);
				btnBlueMR.setBackground(Color.BLUE);
				
				btnRedTL.setBackground(Color.RED);
				btnRedTM.setBackground(Color.RED);
				btnRedTR.setBackground(Color.RED);
				btnRedBL.setBackground(Color.RED);
				btnRedBM.setBackground(Color.RED);
				btnRedBR.setBackground(Color.RED);
				btnRedML.setBackground(Color.RED);
				btnRedMR.setBackground(Color.RED);
				
				btnGreenTL.setBackground(Color.GREEN);
				btnGreenTM.setBackground(Color.GREEN);
				btnGreenTR.setBackground(Color.GREEN);
				btnGreenBL.setBackground(Color.GREEN);
				btnGreenBM.setBackground(Color.GREEN);
				btnGreenBR.setBackground(Color.GREEN);
				btnGreenML.setBackground(Color.GREEN);
				btnGreenMR.setBackground(Color.GREEN);
				
				btnOrangeTL.setBackground(Color.ORANGE);
				btnOrangeTM.setBackground(Color.ORANGE);
				btnOrangeTR.setBackground(Color.ORANGE);
				btnOrangeBL.setBackground(Color.ORANGE);
				btnOrangeBM.setBackground(Color.ORANGE);
				btnOrangeBR.setBackground(Color.ORANGE);
				btnOrangeML.setBackground(Color.ORANGE);
				btnOrangeMR.setBackground(Color.ORANGE);
				
				btnYellowTL.setBackground(Color.YELLOW);
				btnYellowTM.setBackground(Color.YELLOW);
				btnYellowTR.setBackground(Color.YELLOW);
				btnYellowBL.setBackground(Color.YELLOW);
				btnYellowBM.setBackground(Color.YELLOW);
				btnYellowBR.setBackground(Color.YELLOW);
				btnYellowML.setBackground(Color.YELLOW);
				btnYellowMR.setBackground(Color.YELLOW);
				
				btnWhiteTL.setBackground(Color.WHITE);
				btnWhiteTM.setBackground(Color.WHITE);
				btnWhiteTR.setBackground(Color.WHITE);
				btnWhiteBL.setBackground(Color.WHITE);
				btnWhiteBM.setBackground(Color.WHITE);
				btnWhiteBR.setBackground(Color.WHITE);
				btnWhiteML.setBackground(Color.WHITE);
				btnWhiteMR.setBackground(Color.WHITE);
				
				listOfPhases.setEnabled(false);
				listRotation.setEnabled(false);
				listRotation.setListData((String[]) new Object[0]);
				listOfPhases.clearSelection();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(10, 257, 100, 40);
		getContentPane().add(btnReset);
		
		btnSolve = new JButton("SOLVE");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Cube c=new Cube();
				c.blue.mm=1;
				c.red.mm=2;
				c.green.mm=3;
				c.orange.mm=4;
				c.yellow.mm=5;
				c.white.mm=6;
				
				c.blue.tl=colorToNum(btnBlueTL.getBackground());
				c.blue.tm=colorToNum(btnBlueTM.getBackground());
				c.blue.tr=colorToNum(btnBlueTR.getBackground());
				c.blue.bl=colorToNum(btnBlueBL.getBackground());
				c.blue.bm=colorToNum(btnBlueBM.getBackground());
				c.blue.br=colorToNum(btnBlueBR.getBackground());
				c.blue.ml=colorToNum(btnBlueML.getBackground());
				c.blue.mr=colorToNum(btnBlueMR.getBackground());
				
				c.red.tl=colorToNum(btnRedTL.getBackground());
				c.red.tm=colorToNum(btnRedTM.getBackground());
				c.red.tr=colorToNum(btnRedTR.getBackground());
				c.red.bl=colorToNum(btnRedBL.getBackground());
				c.red.bm=colorToNum(btnRedBM.getBackground());
				c.red.br=colorToNum(btnRedBR.getBackground());
				c.red.ml=colorToNum(btnRedML.getBackground());
				c.red.mr=colorToNum(btnRedMR.getBackground());
				
				c.green.tl=colorToNum(btnGreenTL.getBackground());
				c.green.tm=colorToNum(btnGreenTM.getBackground());
				c.green.tr=colorToNum(btnGreenTR.getBackground());
				c.green.bl=colorToNum(btnGreenBL.getBackground());
				c.green.bm=colorToNum(btnGreenBM.getBackground());
				c.green.br=colorToNum(btnGreenBR.getBackground());
				c.green.ml=colorToNum(btnGreenML.getBackground());
				c.green.mr=colorToNum(btnGreenMR.getBackground());
				
				c.orange.tl=colorToNum(btnOrangeTL.getBackground());
				c.orange.tm=colorToNum(btnOrangeTM.getBackground());
				c.orange.tr=colorToNum(btnOrangeTR.getBackground());
				c.orange.bl=colorToNum(btnOrangeBL.getBackground());
				c.orange.bm=colorToNum(btnOrangeBM.getBackground());
				c.orange.br=colorToNum(btnOrangeBR.getBackground());
				c.orange.ml=colorToNum(btnOrangeML.getBackground());
				c.orange.mr=colorToNum(btnOrangeMR.getBackground());
				
				c.yellow.tl=colorToNum(btnYellowTL.getBackground());
				c.yellow.tm=colorToNum(btnYellowTM.getBackground());
				c.yellow.tr=colorToNum(btnYellowTR.getBackground());
				c.yellow.bl=colorToNum(btnYellowBL.getBackground());
				c.yellow.bm=colorToNum(btnYellowBM.getBackground());
				c.yellow.br=colorToNum(btnYellowBR.getBackground());
				c.yellow.ml=colorToNum(btnYellowML.getBackground());
				c.yellow.mr=colorToNum(btnYellowMR.getBackground());
				
				c.white.tl=colorToNum(btnWhiteTL.getBackground());
				c.white.tm=colorToNum(btnWhiteTM.getBackground());
				c.white.tr=colorToNum(btnWhiteTR.getBackground());
				c.white.bl=colorToNum(btnWhiteBL.getBackground());
				c.white.bm=colorToNum(btnWhiteBM.getBackground());
				c.white.br=colorToNum(btnWhiteBR.getBackground());
				c.white.ml=colorToNum(btnWhiteML.getBackground());
				c.white.mr=colorToNum(btnWhiteMR.getBackground());
				
				if(c.validation()){
						listOfPhases.setEnabled(true);
						listRotation.setEnabled(true);
						c.index=0;
						c.phase1();
						state1=new Cube();
						state1.saveCubeState(c);
						ph1r=null;
						ph1r=new String[100];
						for(int i=0;i<c.index;i++)
							ph1r[i]=c.rotation[i];
						
						c.index=0;
						c.phase2();
						state2=new Cube();
						state2.saveCubeState(c);
						ph2r=null;
						ph2r=new String[100];
						for(int i=0;i<c.index;i++)
							ph2r[i]=c.rotation[i];
						
						c.index=0;
						c.phase3();
						state3=new Cube();
						state3.saveCubeState(c);
						ph3r=null;
						ph3r=new String[100];
						for(int i=0;i<c.index;i++)
							ph3r[i]=c.rotation[i];
						
						c.index=0;
						c.phase4();
						state4=new Cube();
						state4.saveCubeState(c);
						ph4r=null;
						ph4r=new String[100];
						for(int i=0;i<c.index;i++)
							ph4r[i]=c.rotation[i];
						
						c.index=0;
						c.phase5();
						state5=new Cube();
						state5.saveCubeState(c);
						ph5r=null;
						ph5r=new String[100];
						for(int i=0;i<c.index;i++)
							ph5r[i]=c.rotation[i];
						
						c.index=0;
						c.phase6();
						state6=new Cube();
						state6.saveCubeState(c);
						ph6r=null;
						ph6r=new String[100];
						for(int i=0;i<c.index;i++)
							ph6r[i]=c.rotation[i];
						
						c.index=0;
						c.phase7();
						state7=new Cube();
						state7.saveCubeState(c);
						ph7r=null;
						ph7r=new String[100];
						for(int i=0;i<c.index;i++)
							ph7r[i]=c.rotation[i];
						
						lblCount.setText(new Integer(c.moves).toString());
						listOfPhases.setSelectedIndex(0);
						listRotation.setSelectedIndex(0);
				}
				else{
					JOptionPane.showMessageDialog(null, "Cube entered is not valid. Please enter a valid cube state.");
					listOfPhases.setEnabled(false);
					listRotation.setEnabled(false);
					}
			}
		});
		btnSolve.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSolve.setBounds(10, 302, 100, 40);
		getContentPane().add(btnSolve);
		
		lblPhases = new JLabel("State of Cube After  :");
		lblPhases.setFont(new Font("Serif", Font.BOLD, 16));
		lblPhases.setBounds(10, 409, 160, 40);
		getContentPane().add(lblPhases);
		
		listOfPhases=new JList<Object>(phase);
		listOfPhases.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				int si=listOfPhases.getSelectedIndex();
				if(si==0 && ph1r[0]!=null){
					DefaultListModel<String> model = new DefaultListModel<String>();
					for(int i=0;i<ph1r.length;i++){
					    if(ph1r[i]==null) break;
					    model.addElement(ph1r[i]);
					}
					listRotation.setModel(model);
					userDisplayCube(state1);
					if(!model.isEmpty())
					listRotation.setSelectedIndex(0);
				}
				else if(si==1 && ph2r[0]!=null){
					DefaultListModel<String> model = new DefaultListModel<String>();
					for(int i=0;i<ph2r.length;i++){
					    if(ph2r[i]==null) break;
					    model.addElement(ph2r[i]);
					}
					listRotation.setModel(model);
					userDisplayCube(state2);
					if(!model.isEmpty())
					listRotation.setSelectedIndex(0);
				}
				else if(si==2 && ph3r[0]!=null){
					DefaultListModel<String> model = new DefaultListModel<String>();
					for(int i=0;i<ph3r.length;i++){
					    if(ph3r[i]==null) break;
					    model.addElement(ph3r[i]);
					}
					listRotation.setModel(model);
					userDisplayCube(state3);
					if(!model.isEmpty())
					listRotation.setSelectedIndex(0);
				}
				else if(si==3 && ph4r[0]!=null){
					DefaultListModel<String> model = new DefaultListModel<String>();
					for(int i=0;i<ph4r.length;i++){
					    if(ph4r[i]==null) break;
					    model.addElement(ph4r[i]);
					}
					listRotation.setModel(model);
					userDisplayCube(state4);
					if(!model.isEmpty())
					listRotation.setSelectedIndex(0);
				}
				else if(si==4 && ph5r[0]!=null){
					DefaultListModel<String> model = new DefaultListModel<String>();
					for(int i=0;i<ph5r.length;i++){
					    if(ph5r[i]==null) break;
					    model.addElement(ph5r[i]);
					}
					listRotation.setModel(model);
					userDisplayCube(state5);
					if(!model.isEmpty())
					listRotation.setSelectedIndex(0);
				}
				else if(si==5 && ph6r[0]!=null){
					DefaultListModel<String> model = new DefaultListModel<String>();
					for(int i=0;i<ph6r.length;i++){
					    if(ph6r[i]==null) break;
					    model.addElement(ph6r[i]);
					}
					listRotation.setModel(model);
					userDisplayCube(state6);
					if(!model.isEmpty())
					listRotation.setSelectedIndex(0);
				}
				else if(si==6 && ph7r[0]!=null){
					DefaultListModel<String> model = new DefaultListModel<String>();
					for(int i=0;i<ph7r.length;i++){
					    if(ph7r[i]==null) break;
					    model.addElement(ph7r[i]);
					}
					listRotation.setModel(model);
					userDisplayCube(state7);
					if(!model.isEmpty())
					listRotation.setSelectedIndex(0);
				}
				else{
					DefaultListModel<String> model = new DefaultListModel<String>();
					model.addElement("No Moves Here.");
					listRotation.setModel(model);
					listRotation.setSelectedIndex(0);
				}
			}
		});
		listOfPhases.setEnabled(false);
		listOfPhases.setBounds(10, 447, 170, 130);
		getContentPane().add(listOfPhases);
		listOfPhases.setVisibleRowCount(7);
		listOfPhases.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblRotations = new JLabel("Rotations  :");
		lblRotations.setFont(new Font("Serif", Font.BOLD, 16));
		lblRotations.setBounds(235, 409, 100, 40);
		getContentPane().add(lblRotations);
		
		scrollPaneRotation = new JScrollPane();
		scrollPaneRotation.setBounds(235, 447, 170, 125);
		getContentPane().add(scrollPaneRotation);
		
		listRotation = new JList<String>();
		listRotation.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				 String si=(String) listRotation.getSelectedValue();
				 if(si.contains("Anti")){
					 if(si.contains("Left"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[5])));
					 else if(si.contains("Right"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[6])));
					 else if(si.contains("Up"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[7])));
					 else if(si.contains("Front"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[8])));
					 else
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[9])));
					  }
				 else{
					 if(si.contains("Left"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[0])));
					 else if(si.contains("Right"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[1])));
					 else if(si.contains("Up"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[2])));
					 else if(si.contains("Front"))
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[3])));
					 else
						 thumb.setIcon(new ImageIcon(getClass().getResource(fname[4])));
				 }
			}
		});
		listRotation.setEnabled(false);
		listRotation.setVisibleRowCount(7);
		listRotation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPaneRotation.setViewportView(listRotation);
		
		lblInstructions = new JLabel("Rotation Guide :");
		lblInstructions.setFont(new Font("Serif", Font.BOLD, 16));
		lblInstructions.setBounds(490, 409, 120, 40);
		getContentPane().add(lblInstructions);
		
		thumb = new JLabel("");
		thumb.setBounds(500, 447, 80, 130);
		thumb.setIcon(new ImageIcon(getClass().getResource(fname[picIndex])));
		getContentPane().add(thumb);
		
		lblLblnote = new JLabel("Note : Keep blue face as front and yellow face as top while performing rotations.");
		lblLblnote.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLblnote.setBounds(40, 588, 620, 21);
		getContentPane().add(lblLblnote);
		
		lblMoves = new JLabel("Moves :");
		lblMoves.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMoves.setBounds(10, 347, 75, 40);
		getContentPane().add(lblMoves);
		
		lblCount = new JLabel("000");
		lblCount.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCount.setBounds(80, 347, 50, 40);
		getContentPane().add(lblCount);
		
		lblCopyright = new JLabel("Developed By : Amit Kothiyal | Copyright (C), All rights reserved");
		lblCopyright.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCopyright.setBounds(1, 1, 300, 23);
		getContentPane().add(lblCopyright);
	}
    int colorToNum(Color cl){
    	if(cl==Color.BLUE)
    		return 1;
    	else if(cl==Color.RED)
    		return 2;
    	else if(cl==Color.GREEN)
    		return 3;
    	else if(cl==Color.ORANGE)
    		return 4;
    	else if(cl==Color.YELLOW)
    		return 5;
    	else if(cl==Color.WHITE)
    		return 6;
    	else
    		return 0;
    		
    }
    
    Color numToColor(int n){
    	if(n==1)
    		return  Color.BLUE;
    	else if(n==2)
    		return Color.RED;
    	else if(n==3)
    		return Color.GREEN;
    	else if(n==4)
    		return Color.ORANGE;
    	else if(n==5)
    		return Color.YELLOW;
    	else if(n==6)
    		return Color.WHITE;
    	else
    		return Color.BLUE;
    }
    
    void userDisplayCube(Cube c){
    	btnBlueTL.setBackground(numToColor(c.blue.tl));
		btnBlueTM.setBackground(numToColor(c.blue.tm));
		btnBlueTR.setBackground(numToColor(c.blue.tr));
		btnBlueBL.setBackground(numToColor(c.blue.bl));
		btnBlueBM.setBackground(numToColor(c.blue.bm));
		btnBlueBR.setBackground(numToColor(c.blue.br));
		btnBlueML.setBackground(numToColor(c.blue.ml));
		btnBlueMR.setBackground(numToColor(c.blue.mr));
		
		btnRedTL.setBackground(numToColor(c.red.tl));
		btnRedTM.setBackground(numToColor(c.red.tm));
		btnRedTR.setBackground(numToColor(c.red.tr));
		btnRedBL.setBackground(numToColor(c.red.bl));
		btnRedBM.setBackground(numToColor(c.red.bm));
		btnRedBR.setBackground(numToColor(c.red.br));
		btnRedML.setBackground(numToColor(c.red.ml));
		btnRedMR.setBackground(numToColor(c.red.mr));
		
		btnGreenTL.setBackground(numToColor(c.green.tl));
		btnGreenTM.setBackground(numToColor(c.green.tm));
		btnGreenTR.setBackground(numToColor(c.green.tr));
		btnGreenBL.setBackground(numToColor(c.green.bl));
		btnGreenBM.setBackground(numToColor(c.green.bm));
		btnGreenBR.setBackground(numToColor(c.green.br));
		btnGreenML.setBackground(numToColor(c.green.ml));
		btnGreenMR.setBackground(numToColor(c.green.mr));
		
		btnOrangeTL.setBackground(numToColor(c.orange.tl));
		btnOrangeTM.setBackground(numToColor(c.orange.tm));
		btnOrangeTR.setBackground(numToColor(c.orange.tr));
		btnOrangeBL.setBackground(numToColor(c.orange.bl));
		btnOrangeBM.setBackground(numToColor(c.orange.bm));
		btnOrangeBR.setBackground(numToColor(c.orange.br));
		btnOrangeML.setBackground(numToColor(c.orange.ml));
		btnOrangeMR.setBackground(numToColor(c.orange.mr));
		
		btnYellowTL.setBackground(numToColor(c.yellow.tl));
		btnYellowTM.setBackground(numToColor(c.yellow.tm));
		btnYellowTR.setBackground(numToColor(c.yellow.tr));
		btnYellowBL.setBackground(numToColor(c.yellow.bl));
		btnYellowBM.setBackground(numToColor(c.yellow.bm));
		btnYellowBR.setBackground(numToColor(c.yellow.br));
		btnYellowML.setBackground(numToColor(c.yellow.ml));
		btnYellowMR.setBackground(numToColor(c.yellow.mr));
		
		btnWhiteTL.setBackground(numToColor(c.white.tl));
		btnWhiteTM.setBackground(numToColor(c.white.tm));
		btnWhiteTR.setBackground(numToColor(c.white.tr));
		btnWhiteBL.setBackground(numToColor(c.white.bl));
		btnWhiteBM.setBackground(numToColor(c.white.bm));
		btnWhiteBR.setBackground(numToColor(c.white.br));
		btnWhiteML.setBackground(numToColor(c.white.ml));
		btnWhiteMR.setBackground(numToColor(c.white.mr));
    	
    }
}
