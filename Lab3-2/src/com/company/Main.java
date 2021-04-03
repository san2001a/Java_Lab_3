package com.company;

/**
 * a class to run the program.
 *
 * @author Sana
 */

public class Main {
    public static void main(String[] args) {
	MusicCollection jazzCollection = new MusicCollection();
	MusicCollection countryCollection = new MusicCollection();
	MusicCollection rockCollection = new MusicCollection();
	MusicCollection popCollection = new MusicCollection();
	countryCollection.addFile("add1","music1" , 2020);
	countryCollection.addFile("add2","music2" , 2021);
	jazzCollection.listAllFiles();
	jazzCollection.listFile(2);
	jazzCollection.removeFile(1);
	jazzCollection.search("c2");
	jazzCollection.search("c5");
    }
}
