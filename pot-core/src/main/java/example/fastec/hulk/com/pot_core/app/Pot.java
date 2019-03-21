package example.fastec.hulk.com.pot_core.app;

import android.content.Context;

import java.util.HashMap;
import java.util.WeakHashMap;

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
        getConfiguration().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    /**
     * 获取配置信息
     * @return
     */
    private static HashMap<String , Object> getConfiguration() {
        return Configurator.getInstance().getPotConfigs();
    }

    public static Context getApplication() {
        return (Context) getConfiguration().get(ConfigType.APPLICATION_CONTEXT.name());
    }
}
