package example.fastec.hulk.com.pot.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by fuzhi on 2019/3/20
 */
public enum EcIcons implements Icon {
    icon_scan('\ue606'),
    icon_ali_pay('\ue602');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
