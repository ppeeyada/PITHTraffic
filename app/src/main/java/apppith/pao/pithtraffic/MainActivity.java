package apppith.pao.pithtraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


    } // Main Class

    private void bindWiddget() {

        aboutMeButton = (Button) findViewById(R.id.button);

        trafficListView = (ListView) findViewById(R.id.listView);
    }

} // Main Class  นี่คือ คลาสหลัก
