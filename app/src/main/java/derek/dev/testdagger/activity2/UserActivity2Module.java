package derek.dev.testdagger.activity2;

import dagger.Module;
import dagger.Provides;
import derek.dev.testdagger.ActivityScope;
import derek.dev.testdagger.app.Presenter;

/**
 * UserActivity1Module
 * Created by qux on 12/5/16.
 */
@Module
public class UserActivity2Module {

    @Provides
    @ActivityScope
    Presenter providePresenter() {
        return new Presenter();
    }
}
