package derek.dev.testdagger.activity1;

import dagger.Component;
import derek.dev.testdagger.ActivityScope;
import derek.dev.testdagger.user.UserComponent;

/**
 * UserActiivty1Component
 * Created by qux on 12/5/16.
 */
@ActivityScope
@Component(dependencies = UserComponent.class, modules = UserActivity1Module.class)
public interface UserActiivty1Component  {
    void inject(UserActivity1 actiivty1);
}
