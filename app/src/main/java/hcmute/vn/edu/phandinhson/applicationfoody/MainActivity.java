package hcmute.vn.edu.phandinhson.applicationfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity implements SearchView.OnQueryTextListener {
    private ListView lv;
    SearchView editsearch;
    ListViewAdapter adapter;
    private ArrayList<ProvinceName> arrayList= new ArrayList<ProvinceName>();
    String[] provinceNameList;
    List<Dish> lstDish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        provinceNameList= new String[]{"Đồng Nai","Hồ Chí Minh","Vũng Tàu","Bình Dương","Hà Nội","Đà Nẵng"};
        // Locate the ListView in listview_main.xml
        lv =  findViewById(R.id.listview);
        for (int i = 0; i < provinceNameList.length; i++) {
            ProvinceName provinceNames = new ProvinceName(provinceNameList[i]);
            // Binds all strings into an array
            arrayList.add(provinceNames);
        }
        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter(this, arrayList);
        // Binds the Adapter to the ListView
        lv.setAdapter(adapter);
        // Locate the EditText in listview_main.xml
        editsearch = findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);


        lstDish=new ArrayList<>();
        lstDish.add(new Dish("Bánh Rán Thiên Quang","Categorie Book","Description book",R.drawable.banh_ran_thien_quang));
        lstDish.add(new Dish("Bánh Tráng Sài Gòn","Categorie Book","Description book",R.drawable.banh_trang_sai_gon));
        lstDish.add(new Dish("Bún Bò Huế","Categorie Book","Description book",R.drawable.bun_bo_hue));
        lstDish.add(new Dish("Chân Gà Bay Online","Categorie Book","Description book",R.drawable.chan_ga_bay_online));
        lstDish.add(new Dish("Chè Ngon Hà Nội","Categorie Book","Description book",R.drawable.che_ngon_ha_noi_mon_duong_pho));
        lstDish.add(new Dish("Cơm Văn Phòng","Categorie Book","Description book",R.drawable.com_van_phong));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this,lstDish);
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
