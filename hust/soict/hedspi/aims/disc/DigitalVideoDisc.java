package hust.soict.hedspi.aims.disc;

import java.util.Locale;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title)
    {
        this.title = title;
    }

    public DigitalVideoDisc(String title,String category,float cost)
    {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director,String category,String title,float cost)
    {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title,String category,String director,int length,float cost)
    {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public void showDigitalVideoDisc()
    {
        System.out.println("DVD - "+ this.title +" - "+this.category+" - "+this.director+" - "+this.length +" - "+this.cost+"$");
    }

    public boolean search(String title)
    {
        for (String a:title.split("\\s+"))
        {
            if (!this.title.toLowerCase().contains(a.toLowerCase()))
                return false;
        }
        return true;
    }



}

