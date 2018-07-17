package test;

import com.service.*;

public class start {

	private static Player audio_player;
	
	public static void main(String[] args) {
		audio_player = new Player();
		
		Music music = new Music();
		music.setId("0");
		music.setName("test");
		music.setPath("D:/2.wav");
		
		audio_player.setMusic(music);
		audio_player.start();
		
		System.out.println("start playing");
		
		try {
			Thread.sleep(3000);
			
			audio_player.PausePlayer();
			Thread.sleep(1000);
			audio_player.ResumePlayer();
			Thread.sleep(2000);
			
			
			audio_player.SeekPlayer(60 * 1000);
			Thread.sleep(2000);
			
			audio_player.SeekPlayer(120 * 1000);
			Thread.sleep(2000);
			
			audio_player.SeekPlayer(180 * 1000);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		audio_player.StopPlayer();
		
		System.out.println("stop playing");
	}
}