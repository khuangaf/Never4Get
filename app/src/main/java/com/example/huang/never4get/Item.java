package com.example.huang.never4get;

/**
 * Created by huang on 2016/2/20.
 */
public class Item {
    private boolean inRoom;
    private String name;
    private String QRCode;
    private double x;
    private double y;
    private double z;

    public Item(String name,String QRCode)
    {
        this.name = name;
        this.QRCode = QRCode;
    }
    public boolean isInRoom()
    {
        return inRoom;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getZ()
    {
        return z;
    }

    public String getName() {return name;}
    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }
    public void setZ(double z)
    {
        this.z = z;
    }



}
