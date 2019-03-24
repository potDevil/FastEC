package example.fastec.hulk.com.pot_core.delegates;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * Created by fuzhi on 2019/3/21
 */
public abstract class BaseDelegate extends SwipeBackFragment{
    public abstract Object setLayout();
    public abstract void onBindView();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = null;
        if(setLayout() instanceof Integer) {
            rootView = inflater.inflate((Integer) setLayout(), container, false);
        }  else if(setLayout() instanceof View) {
            rootView = (View) setLayout();
        }
        if(rootView != null) {
            // 绑定资源
        }
        onBindView();
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
