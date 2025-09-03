/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementsystem;

/**
 *
 * @author adity
 */
import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame 
{
	JButton b1,b2,b3,b4,b5,b6;
	FDemo()
	{
		GridLayout g=new GridLayout(2,3);
		setLayout(g);
		b1=new JButton("click__1");
		add(b1);
		
		b2=new JButton("click__2");
		add(b2);
		// JPDemo jp=new JPDemo();
		// add(jp);
		
		b3=new JButton("click__3");
		add(b3);
		
		b4=new JButton("click__4");
		add(b4);
		
		b5=new JButton("click__5");
		add(b5);
		
		b6=new JButton("click__6");
		add(b6);
		
	}
}
class StudentManagementSystem
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
