package android.example.ipssolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        beaconScan();
    }



    public void beaconScan(){
            final Intent scanIntent = new Intent(this,SecondActivity.class);
        Button scanBeacons = (Button) findViewById(R.id.proximity_button);
        scanBeacons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(scanIntent);
            }
        });
    }
}
