package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class NavigationDashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout myDrawer;
    private Toolbar myToolbar;
    private NavigationView myNavigation;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_dashboard);
        this.myDrawer = findViewById(R.id.navbar_drawlayout_id);
        this.myToolbar = findViewById(R.id.navbar_toolBarID);
        this.myNavigation = findViewById(R.id.navbar_navigationViewID);

        toggle = new ActionBarDrawerToggle(this, myDrawer, myToolbar, R.string.navigation_drawer_open
                , R.string.navigation_drawer_close);
        myDrawer.addDrawerListener(toggle);
        toggle.syncState();
        myNavigation.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {

        if (myDrawer.isDrawerOpen(GravityCompat.START)) {
            myDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.menu_send:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_view_area_for_fragment,
                        new MessageFragment()).commit();
                Log.d("menu item", " send menu is clicked ");
                break;

            case R.id.menu_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_view_area_for_fragment,
                        new SendFragment()).commit();
                Log.d("menu item", " profile menu is clicked ");
                break;

            default:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_view_area_for_fragment,
                        new FragmentDefault()).commit();
                Log.d("menu item", " defauylt menu is clicked ");
        }


        this.myDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void editYourProfile(View view) {

        Log.d("edit profile" , " the button was clicked ");

    }
}
