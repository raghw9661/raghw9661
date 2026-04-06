/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quixmcq;

/**
 *
 * @author dell
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuixMcq extends JFrame implements ActionListener {

    JLabel questionLabel;
    JRadioButton option1, option2, option3, option4;
    ButtonGroup bg;
    JButton nextBtn, prevBtn, submitBtn;

    int current = 0, score = 0;

    String questions[] = {
        "1. Which language is platform independent?",
        "2. Which keyword is used for inheritance in Java?",
        "3. Which of these is not a primitive data type?",
        "4. What is the size of int in Java?",
        "5. Which package is used for GUI in Java?"
    };

    String options[][] = {
        {"C", "C++", "Java", "Python"},
        {"this", "super", "extends", "implements"},
        {"int", "float", "String", "char"},
        {"2 bytes", "4 bytes", "8 bytes", "Depends"},
        {"java.io", "java.util", "java.swing", "java.awt"}
    };

    int answers[] = {2, 2, 2, 1, 3}; // correct answers index

    int userAnswers[] = new int[5];

    QuixMcq() {
        setTitle("MCQ Quiz Application");
        setSize(500, 400);
        setLayout(new BorderLayout());

        questionLabel = new JLabel();
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));

        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();

        bg = new ButtonGroup();
        bg.add(option1);
        bg.add(option2);
        bg.add(option3);
        bg.add(option4);

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);

        nextBtn = new JButton("Next");
        prevBtn = new JButton("Previous");
        submitBtn = new JButton("Submit");

        nextBtn.addActionListener(this);
        prevBtn.addActionListener(this);
        submitBtn.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevBtn);
        buttonPanel.add(nextBtn);
        buttonPanel.add(submitBtn);

        add(questionLabel, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        loadQuestion();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void loadQuestion() {
        bg.clearSelection();

        questionLabel.setText(questions[current]);

        option1.setText(options[current][0]);
        option2.setText(options[current][1]);
        option3.setText(options[current][2]);
        option4.setText(options[current][3]);

        // restore previous answer
        if (userAnswers[current] != -1) {
            switch (userAnswers[current]) {
                case 0: option1.setSelected(true); break;
                case 1: option2.setSelected(true); break;
                case 2: option3.setSelected(true); break;
                case 3: option4.setSelected(true); break;
            }
        }
    }

    void saveAnswer() {
        if (option1.isSelected()) userAnswers[current] = 0;
        else if (option2.isSelected()) userAnswers[current] = 1;
        else if (option3.isSelected()) userAnswers[current] = 2;
        else if (option4.isSelected()) userAnswers[current] = 3;
    }

    void calculateScore() {
        score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (userAnswers[i] == answers[i]) {
                score++;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        saveAnswer();

        if (e.getSource() == nextBtn) {
            if (current < questions.length - 1) {
                current++;
                loadQuestion();
            }
        }

        if (e.getSource() == prevBtn) {
            if (current > 0) {
                current--;
                loadQuestion();
            }
        }

        if (e.getSource() == submitBtn) {
            calculateScore();
            JOptionPane.showMessageDialog(this, "Your Score: " + score);
        }
    }

    public static void main(String[] args) {
        QuixMcq obj = new QuixMcq();

        // initialize answers with -1
        for (int i = 0; i < obj.userAnswers.length; i++) {
            obj.userAnswers[i] = -1;
        }
    }
}
