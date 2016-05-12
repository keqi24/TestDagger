package derek.dev.testdagger.mainActivity;

import dagger.Component;
import derek.dev.testdagger.ActivityScope;
import derek.dev.testdagger.app.AppComponent;

/**
 * MainActivityComponent
 * Created by qux on 12/5/16.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
