package derek.dev.testdagger.user;

import dagger.Component;
import derek.dev.testdagger.app.AppComponent;
import derek.dev.testdagger.dependency.User;

/**
 * UserComponent
 * Created by qux on 12/5/16.
 */
@UserScope
@Component(dependencies = AppComponent.class, modules = UserModule.class)
public interface UserComponent {
    User user();
}
