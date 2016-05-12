package derek.dev.testdagger.user;

import dagger.Module;
import dagger.Provides;
import derek.dev.testdagger.dependency.User;

/**
 * UserModule
 * Created by qux on 12/5/16.
 */
@Module
public class UserModule {

    @Provides
    @UserScope //this notation is important, without it new user will be created every time when inject
    User provideUser() {
        return new User();
    }

}
