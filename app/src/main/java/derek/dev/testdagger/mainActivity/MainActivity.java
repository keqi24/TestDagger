package derek.dev.testdagger.mainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import javax.inject.Inject;

import derek.dev.testdagger.R;
import derek.dev.testdagger.activity1.UserActivity1;
import derek.dev.testdagger.app.DApplication;
import derek.dev.testdagger.dependency.ActivityManager;
import derek.dev.testdagger.dependency.NetworkManager;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkManager mNetworkManager;

    @Inject
    ActivityManager mActivityManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNetworkManager.sendRequest();
                mActivityManager.navigate();
                DApplication.getInstance().createUserComponent();
                Intent intent = new Intent(MainActivity.this, UserActivity1.class);
                MainActivity.this.startActivity(intent);
            }
        });
        buildComponent();
    }

    private void buildComponent() {
        DaggerMainActivityComponent.builder().appComponent(DApplication.getInstance().getAppComponent()).build().inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
