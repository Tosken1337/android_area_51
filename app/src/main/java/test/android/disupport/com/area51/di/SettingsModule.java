package test.android.disupport.com.area51.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sebastiangreif on 16.02.2016.
 */
@Module
public class SettingsModule {

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(Application app) {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }
}
