package example.fastec.hulk.com.pot_core.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import example.fastec.hulk.com.pot_core.app.Pot;

/**
 * Created by fuzhi on 2019/3/25
 */
public class DimenUtil {
    public static int getScreenWidth() {
        final Resources resources = Pot.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Pot.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
