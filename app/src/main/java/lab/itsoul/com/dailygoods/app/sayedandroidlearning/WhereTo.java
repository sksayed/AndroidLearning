package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WhereTo extends AppCompatActivity {

    private List<SavedLocations> savedLocationsList = new ArrayList<>();

    private RecyclerView recyclerView;
    SavedLocationsAdapter savedLocationsAdapter ;
    String[] titles = {"Cloth", "Food", "Liquid", "Medicine"};
    int[] imgSrc = {R.drawable.cloth, R.drawable.food,
            R.drawable.liquid, R.drawable.medicine};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to);
        init();
        this.prepareItemData(this.imgSrc , this.titles);
    }


    private void init() {
        this.recyclerView = findViewById(R.id.whereToRecyclerViewId);
        this.savedLocationsAdapter = new SavedLocationsAdapter(savedLocationsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.HORIZONTAL, false);
        this.recyclerView.setLayoutManager(layoutManager);
        this.recyclerView.setItemAnimator( new DefaultItemAnimator());
        this.recyclerView.addItemDecoration(new ItemOffsetDecoration(30));
        this.recyclerView.setAdapter(savedLocationsAdapter);

    }

    private void prepareItemData ( int [] imgSrcs, String [] titles )
    {
        for ( int i = 0 ; i<titles.length ; i++)
        {
            SavedLocations savedLocations = new SavedLocations( imgSrcs[i] , titles[i] );
            this.savedLocationsList.add(savedLocations);
        }
        this.savedLocationsAdapter.notifyDataSetChanged();
    }
}
