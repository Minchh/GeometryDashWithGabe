package com.main.minchh;

import com.main.util.Constants;

import javax.swing.JFrame;

import java.awt.Dimension;

public class Window extends JFrame implements Runnable
{
    private static Window window = null;

    private Window()
    {
        Dimension screenSize = new Dimension(Constants.screenWidth, Constants.screenHeight);
        this.setResizable(false);
        this.setTitle(Constants.screenTitle);
        this.setSize(screenSize);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        this.setLocationRelativeTo(null);
    }

    public void init()
    {

    }

    public static Window get()
    {
        if (Window.window == null)
        {
            Window.window = new Window();
        }
        return Window.window;
    }

    @Override
    public void run()
    {

    }
}
