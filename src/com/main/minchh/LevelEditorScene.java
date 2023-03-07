package com.main.minchh;

import com.main.components.BoxBonds;
import com.main.dataStructures.AssetPool;
import com.main.dataStructures.Transform;
import com.main.dataStructures.Vector2;
import com.main.util.Constants;

import java.awt.Color;
import java.awt.Graphics2D;

public class LevelEditorScene extends Scene
{
    GameObject testObj;
    public LevelEditorScene(String name)
    {
        super.Scene(name);
    }

    @Override
    public void init()
    {
        testObj = new GameObject("Some game object", new Transform(new Vector2(100.0f, 300.0f)));
        testObj.addComponent(new BoxBonds("Box"));
        testObj.addComponent(AssetPool.getSprite("res/image.png"));
    }

    @Override
    public void update(double deltaTime)
    {
        System.out.println(testObj.getComponent(BoxBonds.class).name);

        testObj.update(deltaTime);
    }

    @Override
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, Constants.screenWidth, Constants.screenHeight);

        testObj.draw(g2);
    }
}
