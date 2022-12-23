package com.usebutton.sdk.internal;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.usebutton.sdk.autofill.PaymentMethod;
import com.usebutton.sdk.autofill.PaymentMethodProvider;
import com.usebutton.sdk.internal.api.burly.Burly;
import com.usebutton.sdk.internal.base.BasePresenter;
import com.usebutton.sdk.internal.browser.BrowserHelpers;
import com.usebutton.sdk.internal.browser.BrowserPageViewClient;
import com.usebutton.sdk.internal.browser.BrowserStateMachine;
import com.usebutton.sdk.internal.browser.BrowserStateMachineImpl;
import com.usebutton.sdk.internal.browser.BrowserUriParser;
import com.usebutton.sdk.internal.browser.BrowserWebClient;
import com.usebutton.sdk.internal.configuration.ConfigurationModule;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.Autofill;
import com.usebutton.sdk.internal.models.Browser;
import com.usebutton.sdk.internal.models.BrowserCard;
import com.usebutton.sdk.internal.models.BrowserCardMap;
import com.usebutton.sdk.internal.models.BrowserCardType;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.InternalInstallCard;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.purchasepath.AppInstallExtension;
import com.usebutton.sdk.internal.purchasepath.CardListAdapter;
import com.usebutton.sdk.internal.purchasepath.CheckoutManager;
import com.usebutton.sdk.internal.purchasepath.autofill.AutofillModel;
import com.usebutton.sdk.internal.user.UserModule;
import com.usebutton.sdk.internal.user.UserProfile;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import com.usebutton.sdk.internal.views.WebViewScrollManager;
import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;
import com.usebutton.sdk.internal.widget.WidgetExtension;
import com.usebutton.sdk.models.Link;
import com.usebutton.sdk.purchasepath.BrowserChromeClient;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.BrowserPage;
import com.usebutton.sdk.purchasepath.Card;
import com.usebutton.sdk.purchasepath.ProductPage;
import com.usebutton.sdk.purchasepath.PurchasePage;
import com.usebutton.sdk.purchasepath.PurchasePathExtension;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebViewPresenter extends BasePresenter<WebViewController> implements CardListAdapter.Listener, WebViewScrollManager.WebScrollEventListener, AppInstallExtension.Listener, ButtonJavascriptInterface.Listener, BrowserWebClient.Listener, WidgetExtension.Listener {
    private static final String TAG = "WebViewPresenter";
    /* access modifiers changed from: private */
    public final BrowserProxy browserProxy;
    /* access modifiers changed from: private */
    public final ButtonRepository buttonRepository;
    private JSONObject cachedFillFields;
    private CardListAdapter cardListAdapter;
    /* access modifiers changed from: private */
    public CheckoutManager checkoutManager;
    private final Configuration.Parameters configParameters;
    private final ConfigurationModule configurationModule;
    public boolean displayingActiveCard = false;
    private final EventTracker eventTracker;
    private String focusedFieldParam;
    private final Link link;
    /* access modifiers changed from: private */
    public final MainThreadExecutor mainThreadExecutor;
    private final MetaInfo metaInfo;
    private final RestrictedDomainManager restrictedDomainManager;
    public BrowserStateMachine stateMachine;
    private final BrowserUriParser uriParser;
    public UrlPrivacyValidator urlPrivacyValidator;

    public class AutofillFailableReceiver implements FailableReceiver<JSONObject> {
        private AutofillFailableReceiver() {
        }

        public void onError() {
        }

        public void onResult(JSONObject jSONObject) {
            try {
                if (jSONObject.getJSONArray("fields").length() != 0) {
                    WebViewPresenter.this.cacheFillFields(jSONObject);
                    WebViewController webViewController = (WebViewController) WebViewPresenter.this.getViewController();
                    if (webViewController != null) {
                        webViewController.observeFields(jSONObject);
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public class BrowserStateChangeListener implements BrowserStateMachine.OnStateChangeListener {
        private BrowserStateChangeListener() {
        }

        public void onBatchComplete(final BrowserPage browserPage) {
            if (WebViewPresenter.this.browserProxy != null) {
                WebViewPresenter.this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        WebViewPresenter.this.checkoutManager.notifyOnPageNavigate(WebViewPresenter.this.browserProxy, browserPage, WebViewPresenter.this.buttonRepository.getBrowserSession());
                    }
                });
            }
        }

        public void onProductViewed(final ProductPage productPage) {
            if (WebViewPresenter.this.browserProxy != null) {
                WebViewPresenter.this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        WebViewPresenter.this.checkoutManager.notifyOnProductNavigate(WebViewPresenter.this.browserProxy, productPage, WebViewPresenter.this.buttonRepository.getBrowserSession());
                    }
                });
            }
        }

        public void onPurchaseViewed(final PurchasePage purchasePage) {
            if (WebViewPresenter.this.browserProxy != null) {
                WebViewPresenter.this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        WebViewPresenter.this.checkoutManager.notifyOnPurchaseNavigate(WebViewPresenter.this.browserProxy, purchasePage, WebViewPresenter.this.buttonRepository.getBrowserSession());
                    }
                });
            }
        }

        public void onStart() {
            if (WebViewPresenter.this.browserProxy != null) {
                WebViewPresenter.this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        WebViewPresenter.this.checkoutManager.notifyOnStartNavigate(WebViewPresenter.this.browserProxy);
                    }
                });
            }
        }
    }

    public WebViewPresenter(CardListAdapter cardListAdapter2, UrlPrivacyValidator urlPrivacyValidator2, BrowserUriParser browserUriParser, EventTracker eventTracker2, MetaInfo metaInfo2, Link link2, BrowserProxy browserProxy2, BrowserPageViewClient browserPageViewClient, CheckoutManager checkoutManager2, Configuration.Parameters parameters, MainThreadExecutor mainThreadExecutor2, ButtonRepository buttonRepository2, RestrictedDomainManager restrictedDomainManager2, ConfigurationModule configurationModule2) {
        this.cardListAdapter = cardListAdapter2;
        this.mainThreadExecutor = mainThreadExecutor2;
        cardListAdapter2.setListener(this);
        this.urlPrivacyValidator = urlPrivacyValidator2;
        this.uriParser = browserUriParser;
        this.eventTracker = eventTracker2;
        this.metaInfo = metaInfo2;
        this.link = link2;
        this.browserProxy = browserProxy2;
        this.checkoutManager = checkoutManager2;
        this.configParameters = parameters;
        this.buttonRepository = buttonRepository2;
        this.restrictedDomainManager = restrictedDomainManager2;
        this.configurationModule = configurationModule2;
        this.stateMachine = new BrowserStateMachineImpl(browserPageViewClient, new BrowserStateChangeListener());
    }

    private void clearRestrictedDomainsCookies() {
        this.restrictedDomainManager.clearCookies(this.configParameters.getRestrictedCookiesDomains());
    }

    private void fillFields() {
        String paymentMethodParamValue;
        try {
            WebViewController webViewController = (WebViewController) getViewController();
            if (webViewController != null && this.cachedFillFields != null) {
                UserProfile profile = this.buttonRepository.getUserModule().getProfile();
                JSONArray jSONArray = this.cachedFillFields.getJSONArray("fields");
                boolean z = false;
                boolean z2 = false;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("param");
                    if (profile != null) {
                        String paramValue = profile.getParamValue(optString);
                        if (paramValue != null) {
                            jSONObject.put("value", paramValue);
                            z = true;
                        }
                    }
                    Autofill autofill = getAutofill();
                    if (autofill != null) {
                        if (AutofillModel.isCreditCardParam(this.focusedFieldParam) && !autofill.shouldDisableCreditCardAutofill() && this.configParameters.isAutofillCreditCardEnabled() && (paymentMethodParamValue = getPaymentMethodParamValue(optString)) != null) {
                            jSONObject.put("value", paymentMethodParamValue);
                            z2 = true;
                        }
                    }
                }
                if (z || z2) {
                    webViewController.fillFields(this.cachedFillFields);
                    this.eventTracker.trackEventWithProperties(Events.AUTOFILL_FORM_ACCEPTED_DATA, Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken());
                }
            }
        } catch (JSONException unused) {
        }
    }

    private Autofill getAutofill() {
        Browser browser = this.metaInfo.getBrowser();
        if (browser != null) {
            return browser.getAutofill();
        }
        return null;
    }

    private BrowserCardMap getBrowserCardMap() {
        Browser browser = this.metaInfo.getBrowser();
        if (browser != null) {
            return browser.getCardsMap();
        }
        return null;
    }

    private String getPaymentMethodParamValue(String str) {
        PaymentMethod paymentMethod;
        PaymentMethodProvider paymentMethodProvider = this.buttonRepository.getUserModule().getPaymentMethodProvider();
        if (paymentMethodProvider != null) {
            paymentMethod = paymentMethodProvider.paymentMethod();
        } else {
            paymentMethod = null;
        }
        if (paymentMethod == null) {
            return null;
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1611295499:
                if (str.equals(AutofillModel.CREDIT_CARD_CVV)) {
                    c = 0;
                    break;
                }
                break;
            case -1424619973:
                if (str.equals(AutofillModel.CREDIT_CARD_NAME_ON_CARD)) {
                    c = 1;
                    break;
                }
                break;
            case -1187831286:
                if (str.equals(AutofillModel.CREDIT_CARD_NUMBER)) {
                    c = 2;
                    break;
                }
                break;
            case -609903642:
                if (str.equals(AutofillModel.CREDIT_CARD_EXPIRATION_MONTH)) {
                    c = 3;
                    break;
                }
                break;
            case 396315159:
                if (str.equals(AutofillModel.CREDIT_CARD_EXPIRATION_YEAR)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return paymentMethod.getCvv();
            case 1:
                return paymentMethod.getFullName();
            case 2:
                return paymentMethod.getCardNumber();
            case 3:
                return paymentMethod.getExpirationMonth();
            case 4:
                return paymentMethod.getExpirationYear();
            default:
                return null;
        }
    }

    private void initAppInstallExtension() {
        this.checkoutManager.setAppInstallExtension((AppInstallExtension) null);
        BrowserCardMap browserCardMap = getBrowserCardMap();
        if (browserCardMap != null) {
            Map<BrowserCardType, BrowserCard> map = browserCardMap.getMap();
            BrowserCardType browserCardType = BrowserCardType.INSTALL_CARD;
            if ((map.containsKey(browserCardType) || browserCardMap.getMap().containsKey(BrowserCardType.POST_PURCHASE_INSTALL_CARD)) && !this.metaInfo.isTargetWebviewOnly() && this.link.getAppLink() != null) {
                this.checkoutManager.setAppInstallExtension(new AppInstallExtension((InternalInstallCard) browserCardMap.getMap().get(browserCardType), (InternalInstallCard) browserCardMap.getMap().get(BrowserCardType.POST_PURCHASE_INSTALL_CARD), ButtonPrivate.getButton().getImageLoader(), new Handler(), this));
            }
        }
    }

    private void initAutofill() {
        Autofill autofill = getAutofill();
        if (autofill != null && this.configurationModule.isAutofillEnabled() && this.configParameters.isAutofillEnabled() && Build.VERSION.SDK_INT >= 26) {
            boolean shouldDisableSystemAutofill = autofill.shouldDisableSystemAutofill();
            WebViewController webViewController = (WebViewController) getViewController();
            if (webViewController != null && shouldDisableSystemAutofill) {
                webViewController.disableSystemAutofillService();
            }
        }
    }

    private void initInternalRewardsExtension() {
        BrowserCardMap browserCardMap = getBrowserCardMap();
        if (browserCardMap == null) {
            return;
        }
        if (this.configParameters.isInstantRewardsCardEnabled() || this.configParameters.isPredictableRewardsCardEnabled()) {
            this.checkoutManager.setExtension(new InternalRewardsExtension(this.configParameters, this.buttonRepository, new Handler(), browserCardMap));
        }
    }

    private void initWidgetExtension() {
        this.checkoutManager.setWidgetExtension((WidgetExtension) null);
        Browser browser = this.metaInfo.getBrowser();
        if (browser != null && !browser.getWidgets().isEmpty()) {
            this.checkoutManager.setWidgetExtension(new WidgetExtension(browser.getWidgets(), new Burly(), this.buttonRepository.getBrowserSession(), this));
        }
    }

    private boolean shouldReportToPageView(String str) {
        if (str.isEmpty() || !this.urlPrivacyValidator.isValidUrl(str)) {
            return false;
        }
        trackNavigation(str);
        if (!this.configParameters.isPageViewReportingEnabled() || this.metaInfo.isUnsupportedUrl()) {
            return false;
        }
        return true;
    }

    private void trackNavigation(String str) {
        EventTracker eventTracker2;
        JSONObject propertiesForUrl = BrowserHelpers.propertiesForUrl(this.uriParser.getUri(str), this.metaInfo);
        if (!this.configParameters.isWebNavigateEventsDisabled() && (eventTracker2 = this.eventTracker) != null && propertiesForUrl != null) {
            eventTracker2.trackEventWithProperties(Events.WEB_WEBVIEW_NAVIGATE, propertiesForUrl);
        }
    }

    public void cacheFillFields(JSONObject jSONObject) {
        this.cachedFillFields = jSONObject;
    }

    public void onAcceptClicked(String str) {
        String str2;
        BrowserProxy browserProxy2 = this.browserProxy;
        if (browserProxy2 != null) {
            browserProxy2.hideTopCard();
        }
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.startAppInstallFlow();
            str.getClass();
            if (str.equals(AppInstallExtension.APP_INSTALL_CARD_KEY)) {
                str2 = Events.APP_INSTALL_CARD_ACCEPTED;
            } else if (str.equals(AppInstallExtension.POST_PURCHASE_APP_INSTALL_CARD_KEY)) {
                str2 = Events.POST_PURCHASE_INSTALL_CARD_ACCEPTED;
            } else {
                return;
            }
            this.eventTracker.trackEventWithProperties(str2, Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken());
        }
    }

    public void onAutofillAccessoryCardClicked() {
        fillFields();
    }

    public void onAutofillAccessoryCloseClicked() {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.hideKeyboard();
            webViewController.hideAutofillAccessoryView();
        }
    }

    public void onAutofillAccessoryParamSet(String str) {
        boolean z;
        this.focusedFieldParam = str;
        WebViewController webViewController = (WebViewController) getViewController();
        Autofill autofill = getAutofill();
        if (webViewController != null && autofill != null) {
            if (!AutofillModel.isCreditCardParam(this.focusedFieldParam) || (!autofill.shouldDisableCreditCardAutofill() && this.configParameters.isAutofillCreditCardEnabled())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                webViewController.hideAutofillAccessoryView();
                return;
            }
            webViewController.showAutofillAccessoryView();
            this.eventTracker.trackEventWithProperties(Events.AUTOFILL_CARD_SHOWN, Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken());
        }
    }

    public void onAutofillAccessoryParamSetFailed() {
        this.focusedFieldParam = null;
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.hideAutofillAccessoryView();
        }
    }

    public void onAutofillFieldsDetected(JSONObject jSONObject) {
        this.buttonRepository.getAutofillMappings(jSONObject, new AutofillFailableReceiver());
    }

    public void onCardListEmpty() {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.onHideCta();
            webViewController.onShowAllCard(false);
        }
    }

    public void onCreateActivity(Bundle bundle) {
        WebViewController webViewController;
        Browser browser = this.metaInfo.getBrowser();
        if (browser != null) {
            if (!browser.isTargetWebViewOnly() && browser.getInstallSheet() != null && bundle == null && (webViewController = (WebViewController) getViewController()) != null) {
                webViewController.startInstallSheetActivity(browser.getInstallSheet(), browser.getPrimaryColor(), this.metaInfo.getIcon(), this.metaInfo.getSourceToken());
            }
            if (bundle == null) {
                onShowFullScreenWidget(browser.getLaunchWidget());
                this.buttonRepository.getBrowserSession().reset();
                if (this.browserProxy != null) {
                    if (this.metaInfo.isUnsupportedUrl()) {
                        BrowserInterface.Header header = this.browserProxy.getHeader();
                        if (header != null) {
                            header.setBackgroundColor(Color.parseColor("#EFF6FF"));
                            header.setTintColor(Color.parseColor("#0077FF"));
                        }
                        BrowserInterface.Footer footer = this.browserProxy.getFooter();
                        if (footer != null) {
                            footer.setTintColor(Color.parseColor("#0077FF"));
                        }
                    }
                    this.checkoutManager.notifyOnInitialized(this.browserProxy, this.buttonRepository.getBrowserSession());
                }
                WebViewController webViewController2 = (WebViewController) getViewController();
                if (webViewController2 != null) {
                    webViewController2.loadUrl(String.valueOf(this.link.getBrowserLink()));
                }
            }
        }
    }

    public void onCtaClicked(BottomSheetLayout.State state) {
        WebViewController webViewController;
        if (state != BottomSheetLayout.State.EXPANDED && (webViewController = (WebViewController) getViewController()) != null) {
            boolean z = !this.displayingActiveCard;
            this.displayingActiveCard = z;
            if (z) {
                webViewController.onShowTopCard();
            } else {
                webViewController.onHideTopCard();
            }
        }
    }

    public void onCustomActionClick(BrowserChromeClient browserChromeClient, View view) {
        if (browserChromeClient != null) {
            browserChromeClient.onCustomActionClick(this.browserProxy, view);
        }
    }

    public void onDeclineClicked(String str) {
        String str2;
        BrowserProxy browserProxy2 = this.browserProxy;
        if (browserProxy2 != null) {
            browserProxy2.hideTopCard();
        }
        str.getClass();
        if (str.equals(AppInstallExtension.APP_INSTALL_CARD_KEY)) {
            str2 = Events.APP_INSTALL_CARD_DECLINED;
        } else if (str.equals(AppInstallExtension.POST_PURCHASE_APP_INSTALL_CARD_KEY)) {
            str2 = Events.POST_PURCHASE_INSTALL_CARD_DECLINED;
        } else {
            return;
        }
        this.eventTracker.trackEventWithProperties(str2, Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken());
    }

    public void onFieldFocusEvent(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("field");
            final String string = jSONObject2.getString("param");
            String optString = jSONObject2.optString("value");
            UserModule userModule = this.buttonRepository.getUserModule();
            String string2 = jSONObject.getString("type");
            char c = 65535;
            int hashCode = string2.hashCode();
            if (hashCode != 3365) {
                if (hashCode == 110414) {
                    if (string2.equals("out")) {
                        c = 1;
                    }
                }
            } else if (string2.equals("in")) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    if (optString.trim().length() > 0) {
                        userModule.saveProfileData(Collections.singletonMap(string, optString));
                    }
                    this.focusedFieldParam = null;
                }
            } else if (this.configParameters.isAutofillKeyboardCtaEnabled()) {
                this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        WebViewController webViewController = (WebViewController) WebViewPresenter.this.getViewController();
                        if (webViewController != null) {
                            webViewController.setAutofillAccessoryViewParam(string);
                        }
                    }
                });
            }
        } catch (JSONException unused) {
        }
    }

    public void onFinishActivity() {
        WebViewController webViewController;
        BrowserTransitionStyle browserTransitionStyle = this.configParameters.getBrowserTransitionStyle();
        if (!browserTransitionStyle.equals(BrowserTransitionStyle.DEFAULT) && (webViewController = (WebViewController) getViewController()) != null) {
            webViewController.animateFinishBrowserTransition(browserTransitionStyle);
        }
    }

    public void onFooterReachedBottom() {
        onHideTopCard();
    }

    public void onHideTopCard() {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.onHideTopCard();
        }
    }

    public void onInstallApp(String str, String str2) {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.startAppInstallFlow();
        }
    }

    public void onInstallCardShown(String str) {
        String str2;
        str.getClass();
        if (str.equals(AppInstallExtension.APP_INSTALL_CARD_KEY)) {
            str2 = Events.APP_INSTALL_CARD_SHOWN;
        } else if (str.equals(AppInstallExtension.POST_PURCHASE_APP_INSTALL_CARD_KEY)) {
            str2 = Events.POST_PURCHASE_INSTALL_CARD_SHOWN;
        } else {
            return;
        }
        this.eventTracker.trackEventWithProperties(str2, Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken());
    }

    public void onKeyboardStateChanged(boolean z) {
        String str;
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController == null) {
            return;
        }
        if (z && (str = this.focusedFieldParam) != null) {
            webViewController.setAutofillAccessoryViewParam(str);
        } else if (!z) {
            webViewController.hideAutofillAccessoryView();
        }
    }

    public void onNavigateJs(String str) {
        onPageStarted(str, true);
        onPageCommitVisible(str);
    }

    public boolean onNotifyShouldClose() {
        return this.checkoutManager.notifyShouldClose(this.browserProxy, this.buttonRepository.getBrowserSession());
    }

    public void onOpenUrl(String str, String str2) {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            str2.getClass();
            if (str2.equals(Browser.TARGET_BROWSER)) {
                webViewController.loadUrlExternal(str);
            } else if (str2.equals(Browser.TARGET_WEBVIEW)) {
                webViewController.loadUrl(str);
            }
        }
    }

    public void onPageCommitVisible(String str) {
        Browser browser;
        if (str != null) {
            if (shouldReportToPageView(str)) {
                this.stateMachine.commit(str);
            }
            if (((WebViewController) getViewController()) != null && (browser = this.metaInfo.getBrowser()) != null && browser.getAutofill() != null && this.configParameters.isAutofillEnabled() && this.configurationModule.isAutofillEnabled()) {
                this.buttonRepository.getWebViewJs(new FailableReceiver<String>() {
                    public void onError() {
                    }

                    public void onResult(String str) {
                        WebViewController webViewController = (WebViewController) WebViewPresenter.this.getViewController();
                        if (webViewController != null) {
                            webViewController.loadBtnSdkJs(str);
                        }
                    }
                });
            }
        }
    }

    public void onPageFinished() {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.setProgressVisible(false);
        }
    }

    public void onPageFinishedJs(String str) {
        onPageCommitVisible(str);
    }

    public void onPageStarted(String str) {
        onPageStarted(str, false);
    }

    public void onShowFullScreenWidget(Widget widget) {
        WebViewController webViewController;
        if (widget != null && (webViewController = (WebViewController) getViewController()) != null) {
            webViewController.animateStartBrowserTransition(BrowserTransitionStyle.DEFAULT);
            webViewController.showFullScreenWidget(widget);
        }
    }

    public void onShowTopCard(EventTracker eventTracker2, String str, BottomSheetLayout.State state) {
        WebViewController webViewController;
        Card card;
        String str2;
        if (state != BottomSheetLayout.State.EXPANDED && (webViewController = (WebViewController) getViewController()) != null) {
            List<Card> uiCards = this.cardListAdapter.getUiCards();
            if (!uiCards.isEmpty()) {
                card = uiCards.get(0);
            } else {
                card = null;
            }
            if (card == null || card.getKey() == null) {
                str2 = "unknown";
            } else {
                String obj = card.getKey().toString();
                str2 = obj.substring(0, Math.min(obj.length(), 64));
            }
            String[] strArr = new String[4];
            strArr[0] = "card_key";
            strArr[1] = str2;
            strArr[2] = Events.PROPERTY_SOURCE_TOKEN;
            if (str == null) {
                str = "unknown";
            }
            strArr[3] = str;
            eventTracker2.trackEventWithProperties(Events.DEVELOPER_SHOWED_CARD, strArr);
            webViewController.onShowTopCard();
        }
    }

    public void onStateChanged(BottomSheetLayout.State state) {
        boolean z;
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.onConfigureDismissAllCards(state);
            if (state == BottomSheetLayout.State.EXPANDED || state == BottomSheetLayout.State.PEEKED) {
                z = true;
            } else {
                z = false;
            }
            this.displayingActiveCard = z;
        }
    }

    public void onStoreUrl(String str) {
        Browser browser;
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null && (browser = this.metaInfo.getBrowser()) != null) {
            if (browser.isTargetWebViewOnly()) {
                ButtonLog.verboseFormat(TAG, "ignore install attempt for webview-only %s", str);
                return;
            }
            ButtonLog.verboseFormat(TAG, "redirect to the store for %s", str);
            webViewController.startAppInstallFlow();
        }
    }

    public void onSubtitleClick(BrowserChromeClient browserChromeClient) {
        if (browserChromeClient != null) {
            browserChromeClient.onSubtitleClick(this.browserProxy);
        }
    }

    public void onTopCardChanged(Card card) {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.onShowCta(card.getCallToAction());
            if (this.cardListAdapter.getItemCount() <= 1) {
                webViewController.onShowAllCard(false);
            } else {
                webViewController.onShowAllCard(true);
            }
        }
    }

    public void onViewAttached() {
        WebViewController webViewController;
        super.onViewAttached();
        if (this.configParameters.isPurchasePathExtensionDisabled()) {
            this.checkoutManager.setExtension((PurchasePathExtension) null);
        }
        initAppInstallExtension();
        if (!this.checkoutManager.hasExtension()) {
            initInternalRewardsExtension();
        }
        initWidgetExtension();
        initAutofill();
        clearRestrictedDomainsCookies();
        BrowserTransitionStyle browserTransitionStyle = this.configParameters.getBrowserTransitionStyle();
        if (!browserTransitionStyle.equals(BrowserTransitionStyle.DEFAULT) && (webViewController = (WebViewController) getViewController()) != null) {
            webViewController.animateStartBrowserTransition(browserTransitionStyle);
        }
        this.buttonRepository.setMetaInfo(this.metaInfo);
    }

    public void onViewDetached() {
        this.checkoutManager.notifyOnClosed();
        if (this.checkoutManager.getExtension() instanceof InternalRewardsExtension) {
            this.checkoutManager.setExtension((PurchasePathExtension) null);
        }
    }

    public void onWebViewDismiss() {
        WebViewController webViewController = (WebViewController) getViewController();
        if (webViewController != null) {
            webViewController.dismissWebView();
        }
    }

    public void reloadCards() {
        this.cardListAdapter.reloadCards();
    }

    public void setJavaScriptInterface(ButtonJavascriptInterface buttonJavascriptInterface) {
        this.stateMachine.setJavascriptInterface(buttonJavascriptInterface);
    }

    private void onPageStarted(String str, boolean z) {
        WebViewController webViewController;
        if (str != null && (webViewController = (WebViewController) getViewController()) != null) {
            if (!z) {
                webViewController.setProgressVisible(true);
            }
            if (shouldReportToPageView(str)) {
                this.stateMachine.start(str);
            }
            webViewController.hideAutofillAccessoryView();
            webViewController.onHideTopCard();
        }
    }
}
