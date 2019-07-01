package igc.rsquareapps.team.recycleview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<list_item_model_class> recycleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleList = new ArrayList<>();
        list_item_model_class listModel = new list_item_model_class();
        recycleList.add(new list_item_model_class(R.drawable.ic_android_black_24dp,"Android"));
        recycleList.add(new list_item_model_class(R.drawable.ic_apps_black_24dp,"Apps"));

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(new List_Adapter(recycleList));
    }
}
