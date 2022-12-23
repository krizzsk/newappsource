package com.usebutton.sdk.internal;

import com.usebutton.sdk.internal.base.BaseViewController;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.InstallSheet;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.purchasepath.CallToAction;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout;
import org.json.JSONObject;

interface WebViewController extends BaseViewController {
    void animateFinishBrowserTransition(BrowserTransitionStyle browserTransitionStyle);

    void animateStartBrowserTransition(BrowserTransitionStyle browserTransitionStyle);

    void disableSystemAutofillService();

    void dismissWebView();

    void fillFields(JSONObject jSONObject);

    void hideAutofillAccessoryView();

    void hideKeyboard();

    void loadBtnSdkJs(String str);

    void loadUrl(String str);

    void loadUrlExternal(String str);

    void observeFields(JSONObject jSONObject);

    void onConfigureDismissAllCards(BottomSheetLayout.State state);

    void onHideCta();

    void onHideTopCard();

    void onShowAllCard(boolean z);

    void onShowCta(CallToAction callToAction);

    void onShowTopCard();

    void setAutofillAccessoryViewParam(String str);

    void setProgressVisible(boolean z);

    void showAutofillAccessoryView();

    void showFullScreenWidget(Widget widget);

    void startAppInstallFlow();

    void startInstallSheetActivity(InstallSheet installSheet, int i, Asset asset, String str);
}
