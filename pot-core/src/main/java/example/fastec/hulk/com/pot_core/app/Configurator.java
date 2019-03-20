package example.fastec.hulk.com.pot_core.app;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Created by fuzhi on 2019/3/20
 */
public class Configurator {
    private static final HashMap<String, Object> POT_CONFIGS = new HashMap<>();
    private static final ArrayList<IconFontDescriptor> ICONS = new ArrayList<>();

    /**
     * 构造函数
     */
    private Configurator() {
        POT_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * 静态内部类模式单例
     */
    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    /**
     * 获取配置信息configs
     *
     * @return
     */
    final HashMap<String, Object> getPotConfigs() {
        return POT_CONFIGS;
    }

    /**
     * 完成配置
     */
    public final void configure() {
        initIcons();
        POT_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    /**
     * 配置host地址
     *
     * @param host
     * @return
     */
    public final Configurator withApiHost(String host) {
        POT_CONFIGS.put(ConfigType.API_HOST.name(), host);
        return this;
    }

    /**
     * 初始化icons
     */
    private void initIcons() {
        if (ICONS.size() > 0) {
            final Iconify.IconifyInitializer initializer = Iconify.with(ICONS.get(0));
            for (int i = 1; i < ICONS.size(); i++) {
                initializer.with(ICONS.get(i));
            }
        }
    }

    /**
     * 配置icon
     */
    public final Configurator withIcon(IconFontDescriptor descriptor) {
        ICONS.add(descriptor);
        return this;
    }

    /**
     * 检查配置是否完成
     */
    private void checkConfiguration() {
        final boolean isReady = (boolean) POT_CONFIGS.get(ConfigType.CONFIG_READY);
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready, Call Configure");
        }
    }

    /**
     * 获取单个的配置信息，给项目调用
     *
     * @param key
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguration();
        return (T) POT_CONFIGS.get(key.name());
    }
}
