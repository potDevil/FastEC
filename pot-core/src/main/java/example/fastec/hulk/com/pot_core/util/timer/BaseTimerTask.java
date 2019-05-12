package example.fastec.hulk.com.pot_core.util.timer;

import java.util.TimerTask;

/**
 * Created by fuzhi on 2019/3/27
 */
public class BaseTimerTask extends TimerTask {

    private ITimerListener mITimerListener = null;

    public BaseTimerTask(ITimerListener timerListener) {
        this.mITimerListener = timerListener;
    }

    @Override
    public void run() {
        if(mITimerListener != null) {
            mITimerListener.onTimer();
        }
    }
}
