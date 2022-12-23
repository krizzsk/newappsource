package com.usebutton.sdk.internal.impression;

import com.usebutton.sdk.internal.base.BaseViewController;

public interface BaseImpressionViewController extends BaseViewController {
    void addLayoutListener();

    void checkVisibility();

    void measureView();

    void postVisibilityCheck();

    void removeLayoutListener();
}
