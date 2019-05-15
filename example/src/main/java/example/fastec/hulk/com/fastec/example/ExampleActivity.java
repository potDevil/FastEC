package example.fastec.hulk.com.fastec.example;

import example.fastec.hulk.com.pot.ec.launcher.LauncherDelegate;
import example.fastec.hulk.com.pot.ec.launcher.LauncherScrollDelegate;
import example.fastec.hulk.com.pot_core.activities.ProxyActivity;
import example.fastec.hulk.com.pot_core.delegates.PotDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public PotDelegate setRootDelegate() {
        return new LauncherScrollDelegate();
    }
}
