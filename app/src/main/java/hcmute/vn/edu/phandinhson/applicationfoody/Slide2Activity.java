package hcmute.vn.edu.phandinhson.applicationfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Slide2Activity extends AppCompatActivity {
    List<Dish> lstFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);
        lstFood=new ArrayList<>();
        lstFood.add(new Dish("Bún Bò","624/10A xa lộ hà nội,P.Phước Long B, quận 9","6.3km","Quán ăn" ,R.drawable.bundau2));
        lstFood.add(new Dish("Bún ốc","102 đường 339,P.Phước Long B, quận 9","4.7km","Nhà Hàng" ,R.drawable.bunbo));
        lstFood.add(new Dish("Bún riêu ","624 xa lộ hà nội,P.Phước Long B, quận 9","6.3km","Quán ăn" ,R.drawable.bunreu));
        lstFood.add(new Dish("Bún bò","624/10A xa lộ hà nội,P.Phước Long B, quận 9","6.3km","Quán ăn" ,R.drawable.bundau2));
        lstFood.add(new Dish("Bún đậu đỏ","Số 1 đường Hai Bà Trưng,P.Phước Long B, quận 9","6.0km","Quán ăn" ,R.drawable.bundau2));
        RecyclerView myrv=(RecyclerView) findViewById(R.id.reclycleView_id);
        RecycleViewAdapter myAdapter= new RecycleViewAdapter(this,lstFood);
        myrv.setLayoutManager(new GridLayoutManager(this,1));
        myrv.setAdapter(myAdapter);
    }

}
