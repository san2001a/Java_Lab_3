package com.company;

/**
 * this class will hold music's info
 * @author sana
 */
public class Musics
{
    private String address;
    private String singerName;
    private int date;

    /**
     * this Constructor will creat new music
     * @param address music file's address
     * @param name singer's name
     * @param date organized date
     */
    public Musics(String address, String name, int date){
        this.address = address;
        this.singerName = name;
        this.date = date;
    }

    /**
     * this will get the address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * this will set the address of the file
     * @param adrs address
     */
    public void setAddress(String adrs) {
        address = adrs;
    }

    /**
     * this will get the singer's name
     * @return name
     */
    public String getSingerName() {
        return singerName ;
    }

    /**
     * this will set the address of the file
     * @param nm name
     */
    public void setSingerName(String nm) {
        singerName = nm;
    }

    /**
     * this will get the date
     * @return date
     */
    public int getDate() {
        return date ;
    }

    /**
     * this will set the date
     * @param dt date
     */
    public void setDate(int dt) {
        date = dt;
    }

    public void print(){
        System.out.println("address : " + getAddress());
        System.out.println("singer's name : " + getSingerName());
        System.out.println("date : " + getDate());
    }


    public boolean check(String name){
        if (name.equals(singerName)) {
            System.out.println("Singer's name found :)");
        } else {
            System.out.println("Singer's name not found :(");
        }
        return false;
    }




}
