package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewLearning extends AppCompatActivity  {


    private ListView myListView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_learning);
        this.myListView = findViewById(R.id.ListviewFirstId);

        String [ ] CountryNames = getResources().getStringArray(R.array.country_names);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.sample_view , R.id.sampleTVid, CountryNames );
        this.myListView.setAdapter(arrayAdapter);


        this.myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(ListViewLearning.this,
                        position+" "+id, Toast.LENGTH_SHORT).show();

            }
        });

    }



}
