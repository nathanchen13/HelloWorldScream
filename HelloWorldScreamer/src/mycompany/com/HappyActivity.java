/**
 * 
 */
package mycompany.com;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;


public class HappyActivity extends Activity {
	MediaPlayer mediaPlayer;
	MediaPlayer backgroundMusic;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
        backgroundMusic = MediaPlayer.create(this, R.raw.happy_music);
        if(MyActivity.music == true){
            backgroundMusic.start();
        }
        Toast.makeText(this, "Tap a head!", Toast.LENGTH_LONG).show();
    }

    public void ns_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_super_happy);
    	mediaPlayer.start();
    }

    public void robert_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.rob_happy);
    	mediaPlayer.start();
    }

    public void ryan_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.ryan_happy);
    	mediaPlayer.start();
    }

    public void n_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_c_happy);
    	mediaPlayer.start();
    }
    public void onBackPressed(){
    	backgroundMusic.reset();
//    	backgroundMusic.release();
//    	if(mediaPlayer != null){
//        	mediaPlayer.release();
//    	}
    	Intent goback = new Intent(this, MyActivity.class);
    	startActivity(goback);
    	finish();
    }
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
