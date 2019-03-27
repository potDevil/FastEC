package example.fastec.hulk.com.fastec.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import example.fastec.hulk.com.fastec.R;
import example.fastec.hulk.com.pot.ec.icon.FontEcModule;
import example.fastec.hulk.com.pot_core.app.Pot;
import example.fastec.hulk.com.pot_core.net.intercept.DebugInterceptor;

/**
 * Created by fuzhi on 2019/3/20
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Pot.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .configure();
    }
}
