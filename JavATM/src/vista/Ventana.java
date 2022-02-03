package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import modelo.*;
import controlador.*;

public class Ventana extends JFrame implements ActionListener, KeyListener, FocusListener {

	Modelo modelo;

	private static ArrayList<JPanel> panels = new ArrayList();
	private static ArrayList<JPanel> subPanels = new ArrayList();
	private static ArrayList<JLabel> labels = new ArrayList();
	private static ArrayList<JTextField> inputs = new ArrayList();
	private static ArrayList<JButton> botons = new ArrayList();

	private static int contPanels = -1;
	private static int contSubPanels = -1;
	private static int contLabels = -1;
	private static int contInputs = -1;
	private static int contButtons = -1;

	public Ventana(Modelo xmodelo) {
		super(xmodelo.getTitles().get(2));
		modelo = xmodelo;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		crearPanelArriba();
		crearPanelCentral();
		crearPanelAbajo();
		anadirPaneles();
		activarListener();
	}

	private void activarListener() {
		inputs.get(0).addFocusListener(this);
	}

	private void crearPanelArriba() {
		panels.add(new JPanel(new FlowLayout(FlowLayout.CENTER)));
		contPanels++;
		
		crearLabel();
	}

	private void crearLabel() {
		labels.add(new JLabel(modelo.getTexts().get(2), JLabel.CENTER));
		contLabels++;
		
		panels.get(contPanels).add(labels.get(contLabels));
	}

	public void anadirPaneles() {
		setLayout(new BorderLayout());
		add(panels.get(0), BorderLayout.PAGE_START);
		add(panels.get(1), BorderLayout.CENTER);
		add(panels.get(2), BorderLayout.PAGE_END);
	}

	public void crearPanelAbajo() {
		panels.add(new JPanel(new FlowLayout(FlowLayout.CENTER)));
		contPanels++;

		crearBotones();
	}

	private void crearBotones() {
		for (int f = 0; f < 1; f++) {
			botons.add(new JButton(modelo.getTextsButtons().get(f)));
			panels.get(1).add(botons.get(f));
		}
	}

	public void crearPanelCentral() {
		panels.add(new JPanel(new FlowLayout(FlowLayout.CENTER)));
		contPanels++;

		crearInputs();
		anadirSubPaneles();
	}

	private void anadirSubPaneles() {
		for (int f = 0; f < subPanels.size(); f++) {
			panels.get(contPanels).add(subPanels.get(f));
		}

	}

	private void crearInputs() {

		for (int f = 0; f < 2; f++) {
			subPanels.add(new JPanel(new FlowLayout(FlowLayout.CENTER)));
			contSubPanels++;
			labels.add(new JLabel(modelo.getTexts().get(f), JLabel.LEFT));
			contLabels++;
			labels.get(f).setAlignmentX(Component.CENTER_ALIGNMENT);
			
		}
		inputs.add(new JTextField(9));
		contInputs++;
		inputs.get(0).setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPasswordField pass = new JPasswordField(9);
		
		subPanels.get(0).add(labels.get(1));
		subPanels.get(0).add(inputs.get(0));
		
		subPanels.get(1).add(labels.get(2));
		subPanels.get(1).add(pass);
	}

	@Override
	public void focusGained(FocusEvent e) {
	}

	@Override
	public void focusLost(FocusEvent e) {

		if (e.getSource() == inputs.get(0)) {
			inputs.get(0).setText(inputs.get(0).getText().toLowerCase());
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
