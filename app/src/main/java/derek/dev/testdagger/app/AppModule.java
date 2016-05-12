package derek.dev.testdagger.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * AppModule
 * Created by qux on 12/5/16.
 */
@Module
public class AppModule {
    private final DApplication app;

    public AppModule(DApplication app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return this.app;
    }
}
