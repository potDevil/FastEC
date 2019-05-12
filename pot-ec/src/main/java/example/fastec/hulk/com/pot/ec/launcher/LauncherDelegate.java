package example.fastec.hulk.com.pot.ec.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import java.text.MessageFormat;
import java.util.Timer;

import example.fastec.hulk.com.pot.ec.R;
import example.fastec.hulk.com.pot_core.delegates.PotDelegate;
import example.fastec.hulk.com.pot_core.util.timer.BaseTimerTask;
import example.fastec.hulk.com.pot_core.util.timer.ITimerListener;

/**
 * Created by fuzhi on 2019/3/27
 */

public class LauncherDelegate extends PotDelegate implements ITimerListener {

    private AppCompatTextView tv_timer;

    private BaseTimerTask task;
    private Timer timer;

    private int count = 5;

    @Override
    public Object setLayout() {
        return R.layout.delegate_launcher;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        tv_timer = rootView.findViewById(R.id.tv_timer);
        initTimer();
    }

    private void initTimer() {
        task = new BaseTimerTask(this);
        timer = new Timer();
        // 第一个参数任务，第二个参数延迟的时间，第三个参数间隔时间(周期)
        timer.schedule(task, 0, 1000);
    }

    @Override
    public void onTimer() {
        getProxyActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (tv_timer != null) {
                    tv_timer.setText(MessageFormat.format("跳过\n{0}s", count));
                    count--;
                    if(count < 0) {
                        if(timer != null) {
                            timer.cancel();
                            timer = null;
                        }
                    }
                }
            }
        });
    }
}
