package com.main.minchh;

import java.util.ArrayList;
import java.util.List;

import java.awt.Graphics2D;

import com.main.dataStructures.Transform;

public class GameObject
{
    private List<Component> components;
    private String name;
    public Transform transform;

    public GameObject(String name, Transform transform)
    {
        this.name = name;
        this.transform = transform;
        this.components = new ArrayList<>();
    }

    public <T extends Component> T getComponent(Class<T> componentClass)
    {
        for (Component c : components)
        {
            if (componentClass.isAssignableFrom(c.getClass()))
            {
                try
                {
                    return componentClass.cast(c);
                }
                catch (ClassCastException classCastException)
                {
                    classCastException.printStackTrace();
                    System.exit(-1);
                }
            }
        }
        return null;
    }

    public void addComponent(Component c)
    {
        components.add(c);
        c.gameObject = this;
    }

    public void update(double deltaTime)
    {
        for (Component c : components)
        {
            c.update(deltaTime);
        }
    }

    public void draw(Graphics2D g2)
    {
        for (Component c : components)
        {
            c.draw(g2);
        }
    }
}
