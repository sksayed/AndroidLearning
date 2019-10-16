package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentLearning extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView myListView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_learning);

        String [] countryNames = getResources().getStringArray(R.array.country_names);
        this.myListView = findViewById(R.id.ListViewId);
        ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<String>(this, R.layout.sample_view ,
                R.id.sampleTVid , countryNames );
        this.myListView.setAdapter(myarrayAdapter);
        this.myListView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 8)
        {
            Fragment fragment = new pakistanFragment() ;
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager
                    .beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId , fragment) ;
            fragmentTransaction.commit();

        }

        else
        {

           Fragment fragment =  new bangladeshFragment() ;

           getSupportFragmentManager().beginTransaction().replace(R.id.fragmentId , fragment).commit();

        }

    }
}
