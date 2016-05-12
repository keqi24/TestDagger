package derek.dev.testdagger.activity1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import javax.inject.Inject;

import derek.dev.testdagger.R;
import derek.dev.testdagger.activity2.UserActivity2;
import derek.dev.testdagger.app.DApplication;
import derek.dev.testdagger.dependency.User;

/**
 * UserActivity1
 * Created by qux on 12/5/16.
 */
public class UserActivity1 extends AppCompatActivity {

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
                Intent intent = new Intent(UserActivity1.this, UserActivity2.class);
                UserActivity1.this.startActivity(intent);
                finish();
            }
        });
        buildComponent();
    }

    private void buildComponent() {
        DaggerUserActiivty1Component.builder().userComponent(DApplication.getInstance().getUserComponent()).build().inject(this);
    }
}
