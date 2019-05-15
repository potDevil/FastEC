package example.fastec.hulk.com.pot_core.ui.launcher;

import android.support.v7.widget.AppCompatImageView;
import android.view.View;

import com.bigkoo.convenientbanner.holder.Holder;

import example.fastec.hulk.com.pot_core.R;

/**
 * Created by fuzhi on 2019/5/15
 */
public class LauncherHolder extends Holder<Integer> {

    private AppCompatImageView item_image;

    public LauncherHolder(View itemView) {
        super(itemView);
    }

    @Override
    protected void initView(View itemView) {
        item_image = itemView.findViewById(R.id.item_image);
    }

    @Override
    public void updateUI(Integer data) {
        item_image.setBackgroundResource(data);
    }
}
