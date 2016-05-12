package derek.dev.testdagger.activity1;

import dagger.Module;
import dagger.Provides;
import derek.dev.testdagger.ActivityScope;
import derek.dev.testdagger.app.Presenter;

/**
 * UserActivity1Module
 * Created by qux on 12/5/16.
 */
@Module
public class UserActivity1Module {

    @Provides
    @ActivityScope
    Presenter providePresenter() {
        return new Presenter();
    }
}
