package derek.dev.testdagger.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import derek.dev.testdagger.dependency.NetworkManager;

/**
 * AppComponent
 * Created by qux on 12/5/16.
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {

    Application application();
    NetworkManager networkManager();

}
