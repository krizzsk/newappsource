package com.usebutton.sdk.internal;

import com.usebutton.sdk.internal.base.BaseViewController;

interface InstallSheetController extends BaseViewController {
    void initAppButton();

    void initBackground();

    void initLoadingTimer(long j);

    void initWebButton();

    void setAppAction(int i, String str);

    void setAppSubtitle(int i, String str);

    void setAppTitle(int i, String str);

    void setTitle(int i, String str);

    void setWebAction(int i, String str);

    void setWebAction(String str);

    void setWebViewProgress(int i);

    void shutdown();

    void startAttendedInstall();
}
