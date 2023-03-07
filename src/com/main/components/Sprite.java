package com.main.components;

import com.main.dataStructures.AssetPool;
import com.main.minchh.Component;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics2D;

public class Sprite extends Component
{
    public BufferedImage image;
    public String pictureFile;
    public int width, height;

    public Sprite(String pictureFile)
    {
        this.pictureFile = pictureFile;

        try
        {
            File file = new File(pictureFile);

            if (AssetPool.hasSprite(pictureFile))
            {
                throw new Exception("Asset already exists: " + pictureFile);
            }

            this.image = ImageIO.read(file);
            this.width = image.getWidth();
            this.height = image.getHeight();

        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            System.exit(-1);
        }
    }

    public void draw(Graphics2D g2)
    {
        g2.drawImage(image, (int)gameObject.transform.position.x,
                (int)gameObject.transform.position.y, width, height, null);
    }
}
