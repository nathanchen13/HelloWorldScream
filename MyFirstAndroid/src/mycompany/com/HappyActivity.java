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
public class HappyActivity extends Activity {
	MediaPlayer mediaPlayer;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
    }

    public void ns_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_super_happy);
    	mediaPlayer.start();
    }

    public void robert_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_super_happy);
    	mediaPlayer.start();
    }

    public void ryan_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_super_happy);
    	mediaPlayer.start();
    }

    public void n_happy(View view) {
    	mediaPlayer = MediaPlayer.create(this, R.raw.nathan_super_happy);
    	mediaPlayer.start();
    }
}
