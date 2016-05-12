package derek.dev.testdagger;

import dagger.Component;
import derek.dev.testdagger.app.AppComponent;
import derek.dev.testdagger.user.UserComponent;

/**
 * UserActiivty1Component
 * Created by qux on 12/5/16.
 */
@ActivityScope
@Component(dependencies = UserComponent.class, modules = UserActivity2Module.class)
public interface UserActiivty2Component {
    void inject(UserActivity2 actiivty2);
}
