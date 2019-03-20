package example.fastec.hulk.com.fastec;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import example.fastec.hulk.com.pot.ec.icon.FontEcModule;
import example.fastec.hulk.com.pot_core.app.Pot;

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
                .configure();
    }
}
