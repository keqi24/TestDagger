package derek.dev.testdagger.app;


import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import derek.dev.testdagger.dependency.NetworkManager;

/**
 * NetworkModule
 * Created by qux on 12/5/16.
 */
@Module
public class NetworkModule {

    @Provides
    @Singleton
    NetworkManager provideNetworkManager(Application application) {
        return new NetworkManager(application);
    }
}
