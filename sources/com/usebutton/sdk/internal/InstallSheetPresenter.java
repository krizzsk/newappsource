package com.usebutton.sdk.internal;

import com.usebutton.sdk.internal.WebViewObserver;
import com.usebutton.sdk.internal.base.BasePresenter;
import com.usebutton.sdk.internal.models.InstallSheet;
import com.usebutton.sdk.internal.models.Text;

class InstallSheetPresenter extends BasePresenter<InstallSheetController> implements WebViewObserver.OnProgressChangedListener {
    public static final long LOADING_TIMER_DELAY_IN_MILLIS = 5000;
    private InstallSheet installSheet;
    private boolean isLoaded = false;
    private final WebViewObserver webViewObserver;

    public InstallSheetPresenter(InstallSheet installSheet2, WebViewObserver webViewObserver2) {
        this.installSheet = installSheet2;
        this.webViewObserver = webViewObserver2;
    }

    private void enableWebView() {
        if (!this.isLoaded) {
            this.isLoaded = true;
            Text webActionText = this.installSheet.getWebActionText();
            InstallSheetController installSheetController = (InstallSheetController) getViewController();
            if (installSheetController != null) {
                installSheetController.setWebAction(webActionText.getColor(), webActionText.getCopy());
                installSheetController.initBackground();
                installSheetController.initWebButton();
            }
        }
    }

    public void onClickAppButton() {
        InstallSheetController installSheetController = (InstallSheetController) getViewController();
        if (installSheetController != null) {
            installSheetController.startAttendedInstall();
        }
    }

    public void onClickBackground() {
        InstallSheetController installSheetController = (InstallSheetController) getViewController();
        if (installSheetController != null) {
            installSheetController.shutdown();
        }
    }

    public void onClickWebButton() {
        InstallSheetController installSheetController = (InstallSheetController) getViewController();
        if (installSheetController != null) {
            installSheetController.shutdown();
        }
    }

    public void onLoadingTimerComplete() {
        enableWebView();
    }

    public void onProgressChanged(int i) {
        InstallSheetController installSheetController = (InstallSheetController) getViewController();
        if (installSheetController != null) {
            installSheetController.setWebViewProgress(i);
        }
        if (i >= 100) {
            enableWebView();
            this.webViewObserver.removeListener(this);
        }
    }

    public void onStart() {
        this.webViewObserver.addListener(this);
    }

    public void onStop() {
        this.webViewObserver.removeListener(this);
    }

    public void onViewAttached() {
        InstallSheetController installSheetController = (InstallSheetController) getViewController();
        if (installSheetController != null) {
            Text titleText = this.installSheet.getTitleText();
            Text appTitleText = this.installSheet.getAppTitleText();
            Text appSubtitleText = this.installSheet.getAppSubtitleText();
            Text appActionText = this.installSheet.getAppActionText();
            Text webActionText = this.installSheet.getWebActionText();
            installSheetController.setTitle(titleText.getColor(), titleText.getCopy());
            installSheetController.setAppTitle(appTitleText.getColor(), appTitleText.getCopy());
            installSheetController.setAppSubtitle(appSubtitleText.getColor(), appSubtitleText.getCopy());
            installSheetController.setAppAction(appActionText.getColor(), appActionText.getCopy());
            installSheetController.setWebAction(webActionText.getCopy());
            installSheetController.initAppButton();
            installSheetController.initLoadingTimer(LOADING_TIMER_DELAY_IN_MILLIS);
        }
    }
}
