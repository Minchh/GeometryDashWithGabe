package com.main.minchh;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KL extends KeyAdapter implements KeyListener
{
    private boolean[] keyPressed = new boolean[KeyEvent.KEY_LAST + 1];

    @Override
    public void keyPressed(KeyEvent keyEvent)
    {
        keyPressed[keyEvent.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent)
    {
        keyPressed[keyEvent.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent)
    {

    }

    public boolean isKeyPressed(int keyCode)
    {
        return keyPressed[keyCode];
    }

}
