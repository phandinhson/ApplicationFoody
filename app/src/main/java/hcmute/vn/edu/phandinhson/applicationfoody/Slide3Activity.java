package hcmute.vn.edu.phandinhson.applicationfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Slide3Activity extends AppCompatActivity {
    TextView txtAddWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);
        txtAddWifi=findViewById(R.id.txtAddWifi);
        txtAddWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Slide3Activity.this, LoginWifiActivity.class);
                startActivity(intent);
            }
        });
    }
}
