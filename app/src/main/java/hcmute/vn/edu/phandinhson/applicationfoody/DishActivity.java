package hcmute.vn.edu.phandinhson.applicationfoody;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DishActivity extends AppCompatActivity {
    private TextView txtTitle,txtDesc,txtCategory;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);
        txtTitle= (TextView)findViewById(R.id.txtName);
        txtDesc= (TextView)findViewById(R.id.txtDesc);
        txtCategory= (TextView)findViewById(R.id.txtCategory);
        img=(ImageView)findViewById(R.id.bookthumbnail);
        //Recieve data
        Intent intent = getIntent();
        String Name =intent.getExtras().getString("DishName");
        String Description =intent.getExtras().getString("Description");
        int image =intent.getExtras().getInt("Thumbnail");
        //Setting value
        txtTitle.setText(Name);
        txtDesc.setText(Description);
        img.setImageResource(image);


    }
}
