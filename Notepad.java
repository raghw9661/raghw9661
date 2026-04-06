/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author dell
 */
public class Notepad extends JFrame implements ActionListener{
     private JTextArea textArea = new JTextArea();
    private JFileChooser fileChooser = new JFileChooser();

    public Notepad() {
        // --- UI Setup ---
        this.setSize(800, 600);
        this.setTitle("Simple Notepad");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Add text area with a scroll pane
        this.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);

        // --- Menu Setup ---
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
        
        this.setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("New")) {
            textArea.setText("");
            setTitle("Simple Notepad");
        } else if (command.equals("Open")) {
            openFile();
        } else if (command.equals("Save")) {
            saveFile();
        } else if (command.equals("Exit")) {
            System.exit(0);
        }
    }

    private void openFile() {
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                textArea.setText(""); // Clear existing text
                String line;
                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }
                setTitle(file.getName() + " - Simple Notepad");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage());
            }
        }
    }

    private void saveFile() {
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(textArea.getText());
                setTitle(file.getName() + " - Simple Notepad");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Notepad());
    }
}
