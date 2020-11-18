package mmmcp.feature.features.screen;

import mmmcp.feature.Feature;

public abstract class Screen extends Feature {

    protected final int colorTextDefault;
    protected final int colorTextDefaultTransparent;

    protected final int colorBackgroundDefault;
    protected final String tagBD; // tag for backgroundDefault
    protected final int colorBackgroundDefaultTransparent;
    protected final String tagBDT; // tag for backgroundDefaultTransparent
    protected final int colorBackgroundRed;
    protected final String tagBR; // tag for backgroundRed

    public Screen(int keybind, boolean enabled) {

        super(keybind, enabled);

        colorTextDefault = 0xFFFFFF;
        colorTextDefaultTransparent = 0x666666;

        colorBackgroundDefault = 0xFF202020;
        tagBD = "BD::";
        colorBackgroundDefaultTransparent = 0x60202020;
        tagBDT = "BDT::";
        colorBackgroundRed = 0xFFA94444;
        tagBR = "BR::";

    }

    protected final String getTagFromText(String text) {
        return text.split("::")[0] + "::";
    }

    protected final String getTextWithoutTag(String text) {
        return text.split("::")[1];
    }

}