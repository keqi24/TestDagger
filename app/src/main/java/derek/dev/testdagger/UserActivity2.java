package derek.dev.testdagger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import derek.dev.testdagger.app.DApplication;
import derek.dev.testdagger.dependency.User;

/**
 * UserActivity1
 * Created by qux on 12/5/16.
 */
public class UserActivity2 extends AppCompatActivity {

    @Inject
    User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUser.showUser();
            }
        });
        buildComponent();
    }

    private void buildComponent() {
        DaggerUserActiivty2Component.builder().userComponent(DApplication.getInstance().getUserComponent()).build().inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DApplication.getInstance().releaseUserComponent();
    }
}
