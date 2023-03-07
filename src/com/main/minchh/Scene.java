package com.main.minchh;

import java.awt.Graphics2D;

public abstract class Scene
{
    String name;

    public void Scene(String name)
    {
        this.name = name;
        init();
    }

    public void init()
    {

    }

    public abstract void update(double deltaTime);
    public abstract void draw(Graphics2D g2);
}
