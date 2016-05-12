package derek.dev.testdagger.dependency;

import android.app.Application;
import android.util.Log;

/**
 * NetworkManager
 * Created by qux on 12/5/16.
 */
public class NetworkManager {

    public Application app;

    public NetworkManager(Application application) {
        app = application;
    }

    public void sendRequest() {
        Log.d("Derek", "send request from:" + this);
    }
}
