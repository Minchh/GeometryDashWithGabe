package com.main;

import com.main.minchh.Window;

public class Main
{
    public static void main(String[] args)
    {
        Window window = Window.get();

        window.init();

        Thread mainThread = new Thread(window);

        mainThread.start();
    }
}
