package test.android.disupport.com.area51;

import android.app.Application;

import test.android.disupport.com.area51.di.AppModule;
import test.android.disupport.com.area51.di.ApplicationComponent;
import test.android.disupport.com.area51.di.DaggerApplicationComponent;
import test.android.disupport.com.area51.di.SettingsModule;

/**
 * Created by sebastiangreif on 16.02.2016.
 */
public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Create di component which creates dependency graph for injection
        applicationComponent = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .settingsModule(new SettingsModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
