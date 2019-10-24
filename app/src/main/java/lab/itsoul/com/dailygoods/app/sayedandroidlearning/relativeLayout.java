package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class relativeLayout extends AppCompatActivity {

    private List<Item> itemList = new ArrayList<>();
    private RecyclerView recyclerView ;
    private ItemAdapter itemAdapter ;
    String [ ] titles  = {"Cloth" , "Food" , "Liquid" , "Medicine"};
    int [ ] imgSrc = {R.drawable.cloth,  R.drawable.food,
            R.drawable.liquid, R.drawable.medicine};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        init();
        this.prepareItemData(this.imgSrc , this.titles);
    }

    private void init() {
        this.recyclerView = findViewById(R.id.recycler_view);
        itemAdapter = new ItemAdapter(itemList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.HORIZONTAL, false);
        this.recyclerView.setLayoutManager(layoutManager);
        this.recyclerView.setItemAnimator( new DefaultItemAnimator());
        this.recyclerView.addItemDecoration(new ItemOffsetDecoration(20));
        this.recyclerView.setAdapter(itemAdapter);

    }


    private void prepareItemData ( int [] imgSrcs, String [] titles )
    {
      for ( int i = 0 ; i<titles.length ; i++)
      {
          Item item = new Item( imgSrcs[i] , titles[i] );
          this.itemList.add(item);
      }
      this.itemAdapter.notifyDataSetChanged();
    }
}
