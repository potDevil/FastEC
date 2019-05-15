package example.fastec.hulk.com.pot.ec.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;

import java.util.ArrayList;

import example.fastec.hulk.com.pot.ec.R;
import example.fastec.hulk.com.pot_core.delegates.PotDelegate;
import example.fastec.hulk.com.pot_core.ui.launcher.LauncherHolderCreator;

/**
 * Created by fuzhi on 2019/5/15
 */
public class LauncherScrollDelegate extends PotDelegate {

    private static final ArrayList<Integer> INTEGERS = new ArrayList<>();

    private ConvenientBanner convenientBanner;

    private void initBanner() {
        INTEGERS.add(R.mipmap.app_launcher_01);
        INTEGERS.add(R.mipmap.app_launcher_04);
        INTEGERS.add(R.mipmap.app_launcher_03);
        convenientBanner
                .setPages(new LauncherHolderCreator(), INTEGERS)
                .setPageIndicator(new int[]{R.drawable.dot_normal, R.drawable.dot_focus})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setCanLoop(false);

    }

    @Override
    public Object setLayout() {
        convenientBanner = new ConvenientBanner(getContext());
        return convenientBanner;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        initBanner();
    }
}
