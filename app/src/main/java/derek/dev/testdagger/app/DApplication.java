package derek.dev.testdagger.app;

import android.app.Application;

import derek.dev.testdagger.user.DaggerUserComponent;
import derek.dev.testdagger.user.UserComponent;

/**
 * DApplication
 * Created by qux on 12/5/16.
 */
public class DApplication extends Application {

    AppComponent mAppComponent;
    UserComponent mUserComponent;

    private static DApplication INSTANCE;


    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        initAppComponent();
    }

    private void initAppComponent() {
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static DApplication getInstance() {
        return INSTANCE;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public UserComponent getUserComponent() {
        return mUserComponent;
    }

    public void createUserComponent() {
        mUserComponent = DaggerUserComponent.builder().appComponent(getAppComponent()).build();
    }

    public void releaseUserComponent() {
        mUserComponent = null;
    }
}
