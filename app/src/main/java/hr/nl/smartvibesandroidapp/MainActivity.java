package hr.nl.smartvibesandroidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String uuid = "ec178bab-809e-4d5f-a432-0207fb812b7c";
    RestHandler h = new RestHandler(uuid);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    View.OnClickListener myOnlyhandler = new View.OnClickListener() {
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.button1:
                    h.coupleRequestDevice(uuid);
                    break;
                case R.id.on:
                    h.sendCommand("ON");
                    break;
                case R.id.off:
                    h.sendCommand("OFF");
                    break;
                case R.id.button2:
                    h.sendOnOffline();
                    break;
                case R.id.button3:
                    h.sendOffOffline();
                    break;
            }
        }
    };
}
