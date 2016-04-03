package mycompany.com;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;


public class AngryActivity extends Activity {

		MediaPlayer mediaPlayer;
		MediaPlayer backgroundMusic;
	 	@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_angry);
	        backgroundMusic = MediaPlayer.create(this, R.raw.epic_music);
	        if(MyActivity.music == true){
	        	backgroundMusic.start();
	        }
	        Toast.makeText(this, "Tap a head!", Toast.LENGTH_LONG).show();
	        
	    }

	    public void ns_angry(View view) {
	    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_super_angry);
	    	mediaPlayer.start();
	    }

	    public void robert_angry(View view) {
	    	mediaPlayer = MediaPlayer.create(this, R.raw.rob_angry);
	    	mediaPlayer.start();
	    }

	    public void ryan_angry(View view) {
	    	mediaPlayer = MediaPlayer.create(this, R.raw.ryan_angry);
	    	mediaPlayer.start();
	    }

	    public void n_angry(View view) {
	    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_c_angry);
	    	mediaPlayer.start();
	    }
	    @Override
	    public void onBackPressed(){
//	    	backgroundMusic.reset();
//	    	backgroundMusic.release();
//	    	if(mediaPlayer != null){
//	        	mediaPlayer.release();
//	    	}	    	
	    	Intent goback = new Intent(this, MyActivity.class);
	    	startActivity(goback);
	    	finish();
	    }
	    @Override
	    public void onStop(){
	    	super.onStop();
	    	backgroundMusic.reset();
	    	backgroundMusic.release();
	    	if(mediaPlayer != null){
	        	mediaPlayer.release();
	    	}	 
	    	finish();
	    }
}
