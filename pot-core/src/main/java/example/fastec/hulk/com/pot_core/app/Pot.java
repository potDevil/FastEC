package example.fastec.hulk.com.pot_core.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by fuzhi on 2019/3/18
 */
public final class Pot {
    /**
     * 初始化配置信息
     * @param context
     * @return
     */
    public static Configurator init(Context context) {
        Configurator.getInstance()
                .getPotConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT,
                        context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Context getApplicationContext() {
        return (Context) getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }
}
