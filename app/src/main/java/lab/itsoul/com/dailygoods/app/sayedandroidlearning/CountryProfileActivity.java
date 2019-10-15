package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CountryProfileActivity extends AppCompatActivity {


    private TextView countryTextview;
    private ImageView countryImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);
        this.countryImageView = findViewById(R.id.CountryProfileImageViewerID);
        this.countryTextview = findViewById(R.id.CountryProfileTextViewID);

        Bundle countryname = getIntent().getExtras();

        if (countryname != null) {
            String name = (String) countryname.get("name");
            showDetails(name);
        }

    }

    public void showDetails(String name) {
        if (name.equals("Bangladesh")) {
            loadUsingPicasso(this.countryImageView, R.drawable.bangladesh_info);
            this.countryTextview.setText(R.string.banglades_details);

        } else if (name.equals("India")) {
            loadUsingPicasso(this.countryImageView, R.drawable.india_background);
            this.countryTextview.setText(R.string.india_details);

        } else {
            loadUsingPicasso(this.countryImageView, R.drawable.pakistan_background);
            this.countryTextview.setText(R.string.pakistan_details);
        }
    }

    private void loadUsingPicasso(ImageView imageView, int resourceId) {
        Picasso.get()
                .load(resourceId)
                .resize(300, 300)
                .into(imageView);
    }


}
