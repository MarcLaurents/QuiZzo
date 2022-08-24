package QuiZzoInc;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Partida implements ActionListener {
	String[] questions = { // QUESTIONS
			"Wich company created JAVA?", // QUESTION 1
			"Wich year was JAVA created?", // QUESTION 2
			"What was JAVA originally called?", // QUESTION 3
			"Who is credited with creating JAVA?" // QUESTION 4
	};

	String[][] options = { // OPTIONS TO CHOSE
			{ "Sun Microsystems", "Starbucks", "Microsoft", "Alphabet" }, // OPTIONS OF QUESTION 1
			{ "1989", "1996", "1972", "1492" }, // OPTIONS OF QUESTION 2
			{ "Apple", "Latte", "Oak", "Koffing" }, // OPTIONS OF QUESTION 3
			{ "Steve Jobs", "Bill Gates", "James Gosling", "Mark Zuckburg" } // OPTIONS OF QUESTION 4
	};

	char[] answers = { // CORRECT ANSWERS
			'A', // ANSWER OF QUESTION 1
			'B', // ANSWER OF QUESTION 2
			'C', // ANSWER OF QUESTION 3
			'C' // ANSWER OF QUESTION 4
	};
	/*--------------------------------------------------DECLARATION----------------------------------------------------*/

	char guess; // GUESS
	char answer; // ANSWER?
	int index; // INDEX
	int correct_guesses = 0; // CORRECT NUMBER OF GUESSES
	int total_questions = questions.length; // CHANGES SIZE OF QUESTIONS AUTOMATICALLY
	int result; // RESULT
	int seconds = 10; // CURRIENT AMOUNT OF TIME TO ANSWER QUESTION

	/*--------------------------------------------INITIALIZING GUI COMPONENTS------------------------------------------*/
	/*-------------------------------------FRAMES---------------------------------------------*/
	JFrame frame = new JFrame(); // FRAME TO HOLD EVERYTHING
	JTextField textfield = new JTextField(); // TEXT FIELD TO HOLD CURRIENT QUESTION
	JTextArea textarea = new JTextArea(); // TEXT AREA TO HOLD CURRIENT QUESTION
	/*-------------------------------------BUTTONS--------------------------------------------*/
	JButton buttonA = new JButton(); // A BUTTON
	JButton buttonB = new JButton(); // B BUTTON
	JButton buttonC = new JButton(); // C BUTTON
	JButton buttonD = new JButton(); // D BUTTON
	/*--------------------------LABELS TO HOLD DIFERENT ANSWERS--------------------------------*/
	JLabel answer_labelA = new JLabel(); // A ANSWER
	JLabel answer_labelB = new JLabel(); // B ANSWER
	JLabel answer_labelC = new JLabel(); // C ANSWER
	JLabel answer_labelD = new JLabel(); // D ANSWER
	/*-------------------------------LABELS TO HOLD TIMERS-------------------------------------*/
	JLabel time_label = new JLabel(); // DISPLAY WORD "TIME"
	JLabel seconds_left = new JLabel(); // DISPLAY COUNT DOWN TIME
	/*----------------------------APPEAR AFTER CALCULATE RESULT--------------------------------*/
	JTextField number_right = new JTextField(); // DISPLAY NUMBER OF QUESTIOS GUESSED RIGHT
	JTextField percentage = new JTextField(); // DISPLAY PERCENTAGE OF SCORE

	/*
	 * EVERYTHING DECLARED BEFORE CONSTRUCTOR METHOD MORE OR LESS ACTING LIKE GLOBAL
	 * VARIABLES, ABBLE ALTERATION
	 */

	/*----------------------------MAKE SURE TO DO THIS UPPER PART BEFORE CONSTRUCTOR METHOD----------------------------*/

	Timer timer = new Timer(1000, new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if (seconds <= 0) {
				displayAnswer();
			}
		}

	});

	/*-------------------------------DESIGNING SOME OF GUI COMPONENTS IN QUIZ CLASS -----------------------------------*/
// A CONSTRUCTOR IS A SPECIAL METHOD THAT IS CALLED EVERY TIME THAT YOU INICIALIZE OR MAKE A OBJECT OUT OF THIS CLASS
	public Partida() { // CONSTRUCTOR METHOD FOR QUIZ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT ON CLOSE (X) WINDOW BUTTON
		frame.setSize(650, 650); // SIZE OF WINDOW
		frame.getContentPane().setBackground(new Color(50, 50, 50)); // COLOR OF WINDOW
		frame.setLayout(null); // NULL LAYOUT
		frame.setResizable(false); // MAKE UNRESIZEBLE WINDOW

		textfield.setBounds(0, 0, 650, 50); // DEFINE A AREA DO TEXTO DO NUMERO DA QUESTÃO
		textfield.setBackground(new Color(25, 25, 25)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		textfield.setForeground(new Color(25, 255, 0)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		textfield.setFont(new Font("Ink Free", Font.BOLD, 30)); // SETTA TIPO DE FONTE E TAMANHO DO NUMERO DA QUESTAO
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER); // SETTA ALINHAMENTO DO TEXTO DO NUMERO DA QUESTAO
		textfield.setEditable(false); // SETTA COMO INALTERAVEL O TEXTO DO NUMERO DA QUESTAO

		textarea.setBounds(0, 50, 650, 50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25, 25, 25));
		textarea.setForeground(new Color(25, 255, 0));
		textarea.setFont(new Font("MV Boli", Font.BOLD, 25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);

		/*-------------------------------DESIGNING BUTTONS -----------------------------------*/
		buttonA.setBounds(0, 100, 100, 100); // SETTING SIZE-BOUNDS
		buttonA.setFont(new Font("MV Boli", Font.BOLD, 25)); // SETTING FONT TYPE
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A"); // SETTING TEXT DISPLAY

		buttonB.setBounds(0, 200, 100, 100);
		buttonB.setFont(new Font("MV Boli", Font.BOLD, 25));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");

		buttonC.setBounds(0, 300, 100, 100);
		buttonC.setFont(new Font("MV Boli", Font.BOLD, 25));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");

		buttonD.setBounds(0, 400, 100, 100);
		buttonD.setFont(new Font("MV Boli", Font.BOLD, 25));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");

		/*-------------------------------DESIGNING ANSWERS-----------------------------------*/
		answer_labelA.setBounds(125, 100, 500, 100); // SETING SIZE-BOUNDS
		answer_labelA.setBackground(new Color(50, 50, 50)); // SETTING BACKGROUND COLOR
		answer_labelA.setForeground(new Color(25, 255, 0)); // SETING FOREGROUND COLOR
		answer_labelA.setFont(new Font("MV Boli", Font.PLAIN, 35)); // SETTING FONT TYPE

		answer_labelB.setBounds(125, 200, 500, 100);
		answer_labelB.setBackground(new Color(50, 50, 50));
		answer_labelB.setForeground(new Color(25, 255, 0));
		answer_labelB.setFont(new Font("MV Boli", Font.PLAIN, 35));

		answer_labelC.setBounds(125, 300, 500, 100);
		answer_labelC.setBackground(new Color(50, 50, 50));
		answer_labelC.setForeground(new Color(25, 255, 0));
		answer_labelC.setFont(new Font("MV Boli", Font.PLAIN, 35));

		answer_labelD.setBounds(125, 400, 500, 100);
		answer_labelD.setBackground(new Color(50, 50, 50));
		answer_labelD.setForeground(new Color(25, 255, 0));
		answer_labelD.setFont(new Font("MV Boli", Font.PLAIN, 35));

		/*-------------------------------------TIMER--------------------------------------*/
		seconds_left.setBounds(535, 510, 100, 100);
		seconds_left.setBackground(new Color(25, 25, 25));
		seconds_left.setForeground(new Color(255, 0, 0));
		seconds_left.setFont(new Font("Inc Free", Font.BOLD, 60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds)); // CONVERTION OF VARIABLE SECONDS AND DISPLAYING AS STRING

		time_label.setBounds(535, 475, 100, 25);
		time_label.setBackground(new Color(20, 20, 20));
		time_label.setForeground(new Color(255, 0, 0));
		time_label.setFont(new Font("MV Boli", Font.PLAIN, 16));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("TIMER");

		/*-------------------------------------RESULTS-------------------------------------*/
		number_right.setBounds(225, 225, 200, 100);
		number_right.setBackground(new Color(25, 25, 25));
		number_right.setForeground(new Color(25, 255, 0));
		number_right.setFont(new Font("Inc Free", Font.BOLD, 50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);

		percentage.setBounds(225, 325, 200, 100);
		percentage.setBackground(new Color(25, 25, 25));
		percentage.setForeground(new Color(25, 255, 0));
		percentage.setFont(new Font("Inc Free", Font.BOLD, 20));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);

		/*-------------------------------ADDING FRAMES-----------------------------------*/

		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);

		nextQuestion();
	}

	/*-------------------------------NEXT QUESTION METHOD-----------------------------*/
	public void nextQuestion() {

		if (index >= total_questions) { // DETERMINATE IN WICH QUESTION WE ARE ON
			results(); // CALL RESULTS METHOD
		} else {
			textfield.setText("Question " + (index + 1)); // CHANGE TEXTFIELD TO QUESTION 1 AND INCREASE INDEX AFTER
															// EVERY QUESTION
			textarea.setText(questions[index]); // DISPLAY ARRAY OF QUESTIONS IN CERTAIN INDEX
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}

	}

	/*-----------------------------ACTION PERFORMED METHOD----------------------------*/
	@Override
	public void actionPerformed(ActionEvent e) { // THIS METHOD WILL TRIGGER WHEN SOME BUTTON IS CLICKED

		/*---DISABLING BUTTONS---*/
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);

		/*---DETERMINATE PRESSED BUTTON AND IF IS THE MATCHING ANSWER---*/
		if (e.getSource() == buttonA) { // BUTTON A
			answer = 'A';
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}

		if (e.getSource() == buttonB) { // BUTTON B
			answer = 'B';
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}

		if (e.getSource() == buttonC) { // BUTTON C
			answer = 'C';
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}

		if (e.getSource() == buttonD) { // BUTTON D
			answer = 'D';
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}
		displayAnswer();

	}

	/*-----------------------------DISPLAY ANSWER METHOD----------------------------*/
	public void displayAnswer() { // DISPLAY ANSWER METHOD

		timer.stop();
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);

		if (answers[index] != 'A')
			answer_labelA.setForeground(new Color(225, 0, 0));

		if (answers[index] != 'B')
			answer_labelB.setForeground(new Color(225, 0, 0));

		if (answers[index] != 'C')
			answer_labelC.setForeground(new Color(225, 0, 0));

		if (answers[index] != 'D')
			answer_labelD.setForeground(new Color(225, 0, 0));

		Timer pause = new Timer(2000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer_labelA.setForeground(new Color(25, 255, 0));
				answer_labelB.setForeground(new Color(25, 255, 0));
				answer_labelC.setForeground(new Color(25, 255, 0));
				answer_labelD.setForeground(new Color(25, 255, 0));

				answer = ' ';
				seconds = 10;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();

			}

		});

		pause.setRepeats(false); // UNABLE METHOD TO REPEAT
		pause.start();

	}

	public void results() { // RESULTS METHOD

		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);

		result = (int) ((correct_guesses / (double) total_questions) * 100);

		textfield.setText("RESULTS!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");

		number_right.setText("(" + correct_guesses + "/" + total_questions + ")");
		percentage.setText(result + "%");

		frame.add(number_right);
		frame.add(percentage);

	}
}
