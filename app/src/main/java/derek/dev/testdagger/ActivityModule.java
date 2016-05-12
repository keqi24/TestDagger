package derek.dev.testdagger;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import derek.dev.testdagger.dependency.ActivityManager;

/**
 * ActivityModule
 * Created by qux on 12/5/16.
 */
@Module
public class ActivityModule {

    @Provides
    ActivityManager provideAcivityManager(Application application) {
        return new ActivityManager(application);
    }
}
