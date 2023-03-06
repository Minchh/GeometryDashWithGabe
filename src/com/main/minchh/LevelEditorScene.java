package com.main.minchh;

import com.main.util.Constants;

import java.awt.Color;
import java.awt.Graphics2D;

public class LevelEditorScene extends Scene
{
    public LevelEditorScene(String name)
    {
        super.Scene(name);
    }

    @Override
    public void init()
    {

    }

    @Override
    public void update(double deltaTime)
    {
    }

    @Override
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, Constants.screenWidth, Constants.screenHeight);
    }
}
