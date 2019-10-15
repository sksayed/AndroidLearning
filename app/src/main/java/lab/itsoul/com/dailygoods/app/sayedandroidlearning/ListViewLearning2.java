package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListViewLearning2 extends AppCompatActivity {

    private ListView secondListView ;
    private  String [] countryNames ;
    private int flagID ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_learning2);
        this.secondListView = findViewById(R.id.ListviewSecondId);

       this.countryNames  =  getResources().getStringArray(R.array.country_names);
        this.flagID = R.drawable.bangladesh;

        CustomAdapter customAdapter = new CustomAdapter ( this , this.countryNames , this.flagID);

        secondListView.setAdapter(customAdapter);




    }
}
