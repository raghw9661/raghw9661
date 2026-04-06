/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imageviewer;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author dell
 */
public class ImageViewer extends JFrame  {
public ImageViewer()
        {
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setSize(200,100);
         JButton openButton = new JButton("Open image");
         getContentPane().add(openButton);
         openButton.addActionListener(new ActionListener()
                 {
                     public void actionPerformed(ActionEvent e)
                            {
                            JFileChooser chooser = new JFileChooser(".");
                            int status = chooser.showOpenDialog(ImageViewer.this);
                            if(status == JFileChooser.APPROVE_OPTION)
                               {
                               try{
                               JFrame frame = new JFrame();
                               JLabel label = new JLabel(new ImageIcon(chooser.getSelectedFile().toURL()));
                               frame.add(label);
                               frame.setSize(500,500);
                               frame.setVisible(true);
                               }
                               catch(Exception e2)
                                   {
                                   System.err.println("Error : "+e2);
                                   }
                               } }
                 });
        }
       
    public static void main(String[] args) {
        ImageViewer tim = new ImageViewer();
        tim.setVisible(true);
        System.out.println("Hello World!");
    }
}
