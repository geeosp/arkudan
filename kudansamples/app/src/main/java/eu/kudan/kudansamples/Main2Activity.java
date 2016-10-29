package eu.kudan.kudansamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eu.kudan.kudan.ARActivity;
import eu.kudan.kudan.ARImageNode;
import eu.kudan.kudan.ARImageTrackable;
import eu.kudan.kudan.ARImageTrackableListener;
import eu.kudan.kudan.ARImageTracker;
import eu.kudan.kudan.ARTrackableSet;
import eu.kudan.kudan.ARVideoNode;
import eu.kudan.kudan.ARVideoTexture;
import eu.kudan.kudan.ARView;

public class Main2Activity extends ARActivity implements ARImageTrackableListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




    }


    @Override
    public void didDetect(ARImageTrackable arImageTrackable) {

    }

    @Override
    public void didTrack(ARImageTrackable arImageTrackable) {

    }

    @Override
    public void didLose(ARImageTrackable arImageTrackable) {

    }
}
