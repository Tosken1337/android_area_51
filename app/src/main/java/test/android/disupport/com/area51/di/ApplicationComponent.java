package test.android.disupport.com.area51.di;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import test.android.disupport.com.area51.MainActivity;

/**
 * Created by sebastiangreif on 16.02.2016.
 */
@Singleton
@Component(modules={AppModule.class, SettingsModule.class})
public interface ApplicationComponent {
    void inject(MainActivity activity);

    SharedPreferences prefs();
}
