package hcmute.vn.edu.phandinhson.applicationfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity implements SearchView.OnQueryTextListener {

    Button btnCity;
    SearchView editsearch;
    ListViewAdapter adapter;


    List<Dish> lstDish;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locate the EditText in listview_main.xml
        editsearch = findViewById(R.id.search);
        btnCity=findViewById(R.id.btn_City);
        editsearch.setOnQueryTextListener(this);
        btnCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CityActivity.class);

                startActivity(intent);
            }
        });



        lstDish=new ArrayList<>();
        lstDish.add(new Dish("Bánh Rán Thiên Quang","Categorie Book","Description book",R.drawable.banh_ran_thien_quang));
        lstDish.add(new Dish("Bánh Tráng Sài Gòn","Categorie Book","Description book",R.drawable.banh_trang_sai_gon));
        lstDish.add(new Dish("Bún Bò Huế","Categorie Book","Description book",R.drawable.bun_bo_hue));
        lstDish.add(new Dish("Chân Gà Bay Online","Categorie Book","Description book",R.drawable.chan_ga_bay_online));
        lstDish.add(new Dish("Chè Ngon Hà Nội","Categorie Book","Description book",R.drawable.che_ngon_ha_noi_mon_duong_pho));
        lstDish.add(new Dish("Cơm Văn Phòng","Categorie Book","Description book",R.drawable.com_van_phong));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecycleViewAdapterMain myAdapter = new RecycleViewAdapterMain(this,lstDish);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }

}
