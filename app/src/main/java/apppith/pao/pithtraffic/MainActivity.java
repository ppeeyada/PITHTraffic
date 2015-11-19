package apppith.pao.pithtraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private Button aboutMeButton;
    private ListView trafficListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWiddget();


        //Button Controller
        buttonController();



    } // Main Class

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sound Effect
                MediaPlayer buttomMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                buttomMediaPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/q9_Pm1jj_BU"));
                startActivity(objIntent);

                // event

            }
        });
    }

    private void bindWiddget() {

        aboutMeButton = (Button) findViewById(R.id.button);

        trafficListView = (ListView) findViewById(R.id.listView);
    }

} // Main Class  นี่คือ คลาสหลัก
