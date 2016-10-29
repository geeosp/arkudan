package eu.kudan.kudansamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import eu.kudan.kudan.ARAPIKey;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ARAPIKey key = ARAPIKey.getInstance();
        key.setAPIKey("GAWAE-FBVCC-XA8ST-GQVZV-93PQB-X7SBD-P6V4W-6RS9C-CQRLH-78YEU-385XP-T6MCG-2CNWB-YK8SR-8UUQ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
openRACamera();



    }


    public void openRACamera(){
        Intent intent = new Intent(this,Main2Activity.class );
        startActivity(intent);

    }
















    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
