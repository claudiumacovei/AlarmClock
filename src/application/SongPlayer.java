package application;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class SongPlayer implements Runnable {
    
    @Override
    public void run() {
    
        try {
            //            File file = new File("https://s.youtube.com/stream_204?fmt=134&cpn=p9pUIS1T-YsUhjuY&ei=4xzIU-hS06vyA5D2gcgD&ns=yt&el=detailpage&docid=fpPrZYo_J9c&vfs=0.000:134:134::i&event=streamingstats&scoville=1&view=0.000:640:390");
            File file = new File("C:\\Users\\pcm\\Desktop\\Maximilian - Pipa-Joint-Bong cu Mitza (Agresiv) si Junky.mp3");
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            try {
                Player player = new Player(bis);
                player.play();
            } catch (JavaLayerException e) {
                System.out.println("Eroare1!");
            }
        } catch (IOException ex) {
            System.out.println("Eroare2: " + ex.getMessage());
        }
        
    }
    
}
