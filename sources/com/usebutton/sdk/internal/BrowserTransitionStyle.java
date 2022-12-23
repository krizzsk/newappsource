package com.usebutton.sdk.internal;

import com.usebutton.sdk.C12238R;

public enum BrowserTransitionStyle {
    DEFAULT("default", 0, 0, 0, 0),
    RIGHT("right", C12238R.anim.btn_browser_transition_style_right_enter_start, C12238R.anim.btn_browser_transition_style_right_exit_start, C12238R.anim.btn_browser_transition_style_right_enter_finish, C12238R.anim.btn_browser_transition_style_right_exit_finish);
    
    private final String apiValue;
    private final int finishEnterAnimation;
    private final int finishExitAnimation;
    private final int startEnterAnimation;
    private final int startExitAnimation;

    private BrowserTransitionStyle(String str, int i, int i2, int i3, int i4) {
        this.apiValue = str;
        this.startEnterAnimation = i;
        this.startExitAnimation = i2;
        this.finishEnterAnimation = i3;
        this.finishExitAnimation = i4;
    }

    public static BrowserTransitionStyle fromJson(String str) {
        for (BrowserTransitionStyle browserTransitionStyle : values()) {
            if (browserTransitionStyle.apiValue.equals(str)) {
                return browserTransitionStyle;
            }
        }
        return DEFAULT;
    }

    public int getFinishEnterAnimation() {
        return this.finishEnterAnimation;
    }

    public int getFinishExitAnimation() {
        return this.finishExitAnimation;
    }

    public int getStartEnterAnimation() {
        return this.startEnterAnimation;
    }

    public int getStartExitAnimation() {
        return this.startExitAnimation;
    }
}
