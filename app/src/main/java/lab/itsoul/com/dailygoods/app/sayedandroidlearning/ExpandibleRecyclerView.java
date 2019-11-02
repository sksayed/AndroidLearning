package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ExpandibleRecyclerView extends AppCompatActivity {

    private RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandible_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> googleProducts = new ArrayList<>();
        googleProducts.add( new Product( "Google adsense") );
        googleProducts.add( new Product( "Google Drive") );
        googleProducts.add( new Product( "Google task") );
        googleProducts.add( new Product( "Google Chrome") );
        googleProducts.add( new Product( "Google Doc") );
        googleProducts.add( new Product( "Google mail") );

        Company google = new Company("google" , googleProducts) ;
        companies.add(google);

        ArrayList<Product> microSoftProducts = new ArrayList<>();
        microSoftProducts.add( new Product( "Microsoft word"));
        microSoftProducts.add( new Product( "Microsoft task"));
        microSoftProducts.add( new Product( "Microsoft chrome"));
        microSoftProducts.add( new Product( "Microsoft doc"));
        microSoftProducts.add( new Product( "Microsoft mail"));

        Company microsoft = new Company("microsoft" , microSoftProducts);
        companies.add(microsoft);

        ProductAdapter productAdapter = new ProductAdapter(companies);
        recyclerView.setAdapter(productAdapter);
    }
}
