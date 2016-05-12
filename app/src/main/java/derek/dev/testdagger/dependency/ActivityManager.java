package derek.dev.testdagger.dependency;

import android.app.Application;
import android.util.Log;

/**
 * ActivityManager
 * Created by qux on 12/5/16.
 */
public class ActivityManager {

    Application app;

    public ActivityManager(Application application) {
        app = application;
    }

    public void navigate() {
        Log.d("Derek", "navigate form:" + this);
    }
}
