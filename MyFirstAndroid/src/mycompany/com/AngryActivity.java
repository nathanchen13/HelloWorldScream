/**
 * 
 */
package mycompany.com;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

/**
 * @author N8ted
 *
 */
public class AngryActivity extends Activity {

		MediaPlayer mediaPlayer;
	 	@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_angry);
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
}
