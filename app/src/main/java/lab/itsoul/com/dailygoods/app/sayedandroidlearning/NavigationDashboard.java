package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

public class NavigationDashboard extends AppCompatActivity {

   private DrawerLayout myDrawer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_dashboard);
        this.myDrawer = findViewById(R.id.navbar_drawlayout_id);
    }
}
