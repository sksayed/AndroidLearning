package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import lab.itsoul.com.dailygoods.app.sayedandroidlearning.ui.send.SendFragment;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout myDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        //toolbar ke khuje pawa gese
        Toolbar toolbar = findViewById(R.id.toolbar_sayed_dashboard);
        setSupportActionBar(toolbar);

        //drawer ke khuje pawa hoise
        this.myDrawer = findViewById(R.id.drawer_layout_sayed_main_dashboard);
        //ekta toggle add kora hoise which is hamberger icon
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, myDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        myDrawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view_mainDashboard_sayed);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard_sayed,
                    new MessageFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_sayedMessage);
        }

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
            case R.id.nav_sayedMessage:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard_sayed,
                        new MessageFragment()).commit();
                break;

            case R.id.nav_sayedShare:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard_sayed,
                        new SendFragment()).commit();
                break;

            default:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard_sayed,
                        new FragmentDefault()).commit();
        }

        this.myDrawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
