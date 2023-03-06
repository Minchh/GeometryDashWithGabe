package com.main.minchh;

import com.main.util.Constants;
import com.main.util.Time;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.event.KeyEvent;

public class Window extends JFrame implements Runnable
{
    public ML mouseListener = null;
    public KL keyListener = null;

    private static Window window = null;
    private Scene currentScene = null;
    private boolean isRunning = true;

    private Window()
    {
        Dimension screenSize = new Dimension(Constants.screenWidth, Constants.screenHeight);

        mouseListener = new ML();
        keyListener = new KL();

        this.setResizable(false);
        this.setTitle(Constants.screenTitle);
        this.setSize(screenSize);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addMouseListener(mouseListener);
        this.addMouseMotionListener(mouseListener);
        this.addKeyListener(keyListener);

        this.setLocationRelativeTo(null);
    }

    public void init()
    {
        changeScene(0);
    }

    public void changeScene(int sceneID)
    {
        switch (sceneID)
        {
            case 0:
                currentScene = new LevelEditorScene("Level Editor");
                break;
            default:
                System.out.println("Do not know what this scene is.");
                currentScene = null;
                break;
        }
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
        double lastFrameTime = 0.0D;
        try
        {
            while (isRunning)
            {
                double time = Time.getTime();
                double delta = time - lastFrameTime;
                lastFrameTime = time;
                update(delta);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void update(double deltaTime)
    {
        currentScene.update(deltaTime);
    }
}
