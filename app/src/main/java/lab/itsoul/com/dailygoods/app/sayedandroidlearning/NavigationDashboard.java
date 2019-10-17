package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class NavigationDashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

   private DrawerLayout myDrawer ;
   private Toolbar myToolbar ;
   private NavigationView myNavigation ;
   private ActionBarDrawerToggle toggle ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_dashboard);
        this.myDrawer = findViewById(R.id.navbar_drawlayout_id);
        this.myToolbar = findViewById(R.id.navbar_toolBarID);
        this.myNavigation = findViewById(R.id.navbar_navigationViewID);

        setSupportActionBar(myToolbar);
        toggle = new ActionBarDrawerToggle(this , myDrawer , myToolbar , R.string.navigation_drawer_open ,
            R.string.navigation_drawer_close);
        myDrawer.addDrawerListener(toggle);
        toggle.syncState();
        //myNavigation.setNavigationItemSelectedListener(this);
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {



        return true;
    }
}
