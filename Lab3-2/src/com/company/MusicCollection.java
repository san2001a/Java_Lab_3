package com.company;

import java.util.ArrayList;
import java.util.Iterator;


    /**
     * A class to hold details of audio files.
     *
     * @author David J. Barnes and Michael K�lling
     * @version 2011.07.31
     */
    public class MusicCollection
    {
        // An ArrayList for storing the file names of music files.
        private ArrayList<Musics> files;
        // A player for the music files.
        private MusicPlayer  player;

        /**
         * Create a MusicCollection
         */
        public MusicCollection()
        {
            files = new ArrayList<Musics>();
        }

        /**
         * Add a file to the collection.
         * @param address address
         * @param name name
         * @param date date
         */
        public void addFile(String address, String name, int date)
        {
            Musics music = new Musics(address, name, date );
            files.add(music);
        }

        /**
         * Return the number of files in the collection.
         * @return The number of files in the collection.
         */
        public int getNumberOfFiles()
        {
            return files.size();
        }

        /**
         * List a file from the collection.
         * @param index The index of the file to be listed.
         */
        public void listFile(int index)
        {
            if(validIndex(index)){
                files.get(index).print();
            } else {
                System.out.println("invalid choice");
            }
        }

        /**
         * Show a list of all the files in the collection.
         */
        public void listAllFiles()
        {
            Iterator<Musics> it = files.iterator();
            int flag=1;
            while (it.hasNext()){
                Musics musics = it.next();
                System.out.println(musics.getSingerName());
                flag++;
            }

        }

        /**
         * Remove a file from the collection.
         * @param index The index of the file to be removed.
         */
        public void removeFile(int index)
        {
            if(validIndex(index)){
                files.remove(index);
            } else {
                System.out.println("invalid choice");
            }

        }

        /**
         * Start playing a file in the collection.
         * Use stopPlaying() to stop it playing.
         * @param index The index of the file to be played.
         */
        public void startPlaying(int index)
        {
            if(index>files.size()){
                System.out.println("ERROR");
            }
            player.startPlaying(files.get(index));
        }

        /**
         * Stop the player.
         */
        public void stopPlaying()
        {
            player.stop();
        }


        /**
         * Determine whether the given index is valid for the collection.
         * Print an error message if it is not.
         * @param index The index to be checked.
         * @return true if the index is valid, false otherwise.
         */
        private boolean validIndex(int index)
        {
            if ( index>=0 && index<=files.size()){
                return true;
            }
            else {
                return false;
            }

        }

        public void search(String name){
            Iterator<Musics> it = files.iterator();
            int flag=0;
            while(it.hasNext()){
                Musics music = it.next();
                if(music.check(name)){
                    music.print();
                    System.out.println("------------------");
                    flag++;
                }
            }
        }
    }

