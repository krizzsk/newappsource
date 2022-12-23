package com.usebutton.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.WebViewObserver;
import com.usebutton.sdk.internal.api.HostInformation;
import com.usebutton.sdk.internal.autofill.AutofillAccessoryView;
import com.usebutton.sdk.internal.base.BaseActivity;
import com.usebutton.sdk.internal.browser.BrowserHelpers;
import com.usebutton.sdk.internal.browser.BrowserPageViewClient;
import com.usebutton.sdk.internal.browser.BrowserUriParser;
import com.usebutton.sdk.internal.browser.BrowserWebChromeClient;
import com.usebutton.sdk.internal.browser.BrowserWebClient;
import com.usebutton.sdk.internal.configuration.ConfigurationModule;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.App;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.Browser;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.InstallSheet;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.purchasepath.CardListAdapter;
import com.usebutton.sdk.internal.purchasepath.CardListGridLayoutManager;
import com.usebutton.sdk.internal.purchasepath.CheckoutManager;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import com.usebutton.sdk.internal.util.ViewUtils;
import com.usebutton.sdk.internal.views.AssetImageView;
import com.usebutton.sdk.internal.views.ColorProgressBar;
import com.usebutton.sdk.internal.views.PopupWebView;
import com.usebutton.sdk.internal.views.ViewCoordinator;
import com.usebutton.sdk.internal.views.WebControls;
import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;
import com.usebutton.sdk.internal.web.Navigator;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import com.usebutton.sdk.models.Link;
import com.usebutton.sdk.purchasepath.BrowserChromeClient;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.CallToAction;
import com.usebutton.sdk.purchasepath.CardList;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.ViewTransformer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class WebViewActivity extends BaseActivity<WebViewPresenter> implements WebViewObserver.OnProgressChangedListener, WebViewController, BrowserInterface {
    public static final int CARD_PADDING_DIFFERENCE = 8;
    public static final String EXTRA_APP = "app";
    public static final String EXTRA_LINK = "link";
    public static final String EXTRA_META = "meta";
    public static final int REQUEST_CODE_FULL_SCREEN_WIDGET = 103;
    public static final int REQUEST_CODE_INSTALL_CARD = 102;
    public static final int REQUEST_CODE_INSTALL_SHEET = 101;
    private static final String TAG = "ButtonWeb";
    private static final int TOP_CHROME_DEFAULT_COLOR = -1;
    private AutofillAccessoryView autofillAccessoryView;
    private AutofillAccessoryView.Listener autofillAccessoryViewListener = new AutofillAccessoryView.Listener() {
        public void onSetParamFailure() {
            WebViewActivity.this.presenter.onAutofillAccessoryParamSetFailed();
        }

        public void onSetParamSuccess(String str) {
            WebViewActivity.this.presenter.onAutofillAccessoryParamSet(str);
        }
    };
    /* access modifiers changed from: private */
    public BrowserChromeClient browserChromeClient;
    /* access modifiers changed from: private */
    public View contentView;
    public ButtonJavascriptInterface javascriptInterface;
    private ViewTreeObserver.OnGlobalLayoutListener keyboardLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            boolean z;
            if (WebViewActivity.this.contentView != null) {
                Rect rect = new Rect();
                WebViewActivity.this.contentView.getWindowVisibleDisplayFrame(rect);
                if (!rect.equals(WebViewActivity.this.lastRect)) {
                    Rect unused = WebViewActivity.this.lastRect = rect;
                    int height = WebViewActivity.this.contentView.getRootView().getHeight();
                    if (((double) (height - rect.bottom)) > ((double) height) * 0.15d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    WebViewActivity.this.presenter.onKeyboardStateChanged(z);
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public Rect lastRect;
    /* access modifiers changed from: private */
    public CardListAdapter mAdapter;
    private App mApp;
    public BottomSheetLayout mBottomSheetLayout;
    public BrowserProxy mBrowserProxy;
    /* access modifiers changed from: private */
    public ViewCoordinator mCoordinator;
    private Link mLink;
    private MetaInfo mMeta;
    private Navigator mNavigator;
    /* access modifiers changed from: private */
    public RecyclerView mRecyclerView;
    /* access modifiers changed from: private */
    public View mRecyclerViewContainer;
    private boolean mReportDismiss = false;
    private ViewGroup mWebChrome;
    private WebView mWebView;
    public WebViewPresenter presenter;
    private ColorProgressBar progressBar;
    /* access modifiers changed from: private */
    public ViewTransformer viewTransformer = new CardsViewTransformer();
    /* access modifiers changed from: private */
    public boolean wasSheetOpenedByTap = false;
    public BrowserWebChromeClient webChromeClient;
    public BrowserWebClient webClient;

    /* renamed from: com.usebutton.sdk.internal.WebViewActivity$16 */
    public static /* synthetic */ class C1228316 {

        /* renamed from: $SwitchMap$com$usebutton$thirdparty$com$flipboard$bottomsheet$BottomSheetLayout$State */
        public static final /* synthetic */ int[] f30924x5295ca96;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout$State[] r0 = com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30924x5295ca96 = r0
                com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout$State r1 = com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout.State.PEEKED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30924x5295ca96     // Catch:{ NoSuchFieldError -> 0x001d }
                com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout$State r1 = com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout.State.EXPANDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.WebViewActivity.C1228316.<clinit>():void");
        }
    }

    private boolean canInstallApp() {
        return this.mLink.getAppLink() != null && !TextUtils.isEmpty(this.mMeta.getStoreId());
    }

    private void configureAutofillAccessoryView() {
        this.autofillAccessoryView = (AutofillAccessoryView) findViewById(C12238R.C12240id.web_autofill_accessory_view);
        findViewById(C12238R.C12240id.autofill_accessory_close_image).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebViewPresenter webViewPresenter = WebViewActivity.this.presenter;
                if (webViewPresenter != null) {
                    webViewPresenter.onAutofillAccessoryCloseClicked();
                }
            }
        });
        findViewById(C12238R.C12240id.autofill_accessory_card_layout).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebViewPresenter webViewPresenter = WebViewActivity.this.presenter;
                if (webViewPresenter != null) {
                    webViewPresenter.onAutofillAccessoryCardClicked();
                }
            }
        });
    }

    private void configureChrome() {
        Browser browser = getBrowser();
        Text title = browser.getTitle();
        Text subtitle = browser.getSubtitle();
        ImageButton imageButton = (ImageButton) findViewById(C12238R.C12240id.web_close);
        FrameLayout frameLayout = (FrameLayout) findViewById(C12238R.C12240id.web_chrome);
        Text.applyTo((TextView) findViewById(C12238R.C12240id.web_chrome_title), title);
        Text.applyTo((TextView) findViewById(C12238R.C12240id.web_chrome_subtitle), subtitle);
        if (browser.getPrimaryColor() != -1) {
            findViewById(C12238R.C12240id.web_chrome_top).setBackgroundColor(browser.getPrimaryColor());
            imageButton.setImageDrawable(ViewUtils.colorDrawable(imageButton.getDrawable(), title.getColor()));
        } else {
            imageButton.setImageDrawable(getResources().getDrawable(C12238R.C12239drawable.btn_ic_web_close));
        }
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (WebViewActivity.this.presenter.onNotifyShouldClose()) {
                    WebViewActivity.this.dismissWebView();
                }
            }
        });
        frameLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void configureWebView() {
        this.mWebView.setWebChromeClient(this.webChromeClient);
        this.javascriptInterface = new ButtonJavascriptInterface(this.presenter, this.mWebView, this.mNavigator);
        BrowserWebClient browserWebClient = new BrowserWebClient(this.presenter, this.javascriptInterface, this.mNavigator, getParameters().getBlacklistedWebResources());
        this.webClient = browserWebClient;
        this.mWebView.setWebViewClient(browserWebClient);
        WebSettings settings = this.mWebView.getSettings();
        settings.setAppCacheEnabled(true);
        settings.setAppCachePath(getCacheDir().toString());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationDatabasePath(getCacheDir().toString());
        settings.setUserAgentString(updateUserAgent(new HostInformation(getContext(), ButtonPrivate.button.getStorage().getApplicationId()), settings.getUserAgentString()));
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.mWebView, true);
    }

    public static Intent createIntent(Context context, App app, MetaInfo metaInfo, Link link) {
        Intent intent = new Intent(context, WebViewActivity.class);
        if (app != null) {
            intent.putExtra("app", app);
        }
        intent.putExtra("meta", metaInfo);
        intent.putExtra(EXTRA_LINK, link);
        return intent;
    }

    private Browser getBrowser() {
        return this.mMeta.getBrowser();
    }

    private ButtonPrivate getButton() {
        return ButtonPrivate.getButton();
    }

    private Context getContext() {
        return this;
    }

    /* access modifiers changed from: private */
    public EventTracker getEventTracker() {
        return getButton().getEventTracker();
    }

    private Asset getIcon() {
        return this.mMeta.getIcon();
    }

    private Intent getInstallIntent() {
        return InstallCardActivity.intentForPromotion(this, this.mApp, this.mMeta, this.mLink.getAppLink(), 0);
    }

    private Configuration.Parameters getParameters() {
        Configuration configuration = getButton().getConfiguration();
        if (configuration == null || configuration.getParameters() == null) {
            return Configuration.emptyConfiguration().getParameters();
        }
        return configuration.getParameters();
    }

    private int getPrimaryColor() {
        return this.mMeta.getBrowser().getPrimaryColor();
    }

    private boolean isTargetWebViewOnly() {
        return getBrowser().isTargetWebViewOnly();
    }

    /* access modifiers changed from: private */
    public void onBottomSheetReady(final boolean z) {
        this.mRecyclerView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                WebViewActivity.this.mRecyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (WebViewActivity.this.mAdapter.getItemCount() <= 0) {
                    return false;
                }
                RecyclerView.C1119a0 F = WebViewActivity.this.mRecyclerView.mo4551F(0);
                if (F == null) {
                    WebViewActivity.this.onBottomSheetReady(z);
                    return true;
                }
                float height = (float) F.itemView.getHeight();
                float height2 = (float) WebViewActivity.this.findViewById(C12238R.C12240id.web_chrome).getHeight();
                float f = (-WebViewActivity.this.getResources().getDimension(C12238R.dimen.btn_card_vertical_margin)) * 8.0f;
                if (WebViewActivity.this.mAdapter.getItemCount() == 1) {
                    f += (float) (16 - WebViewActivity.this.getResources().getDimensionPixelOffset(C12238R.dimen.btn_card_recycler_view_vertical_margin));
                    WebViewActivity.this.mBottomSheetLayout.setAlwaysPeekSheet(true);
                } else {
                    WebViewActivity.this.mBottomSheetLayout.setAlwaysPeekSheet(false);
                }
                WebViewActivity.this.mBottomSheetLayout.setPeekSheetTranslation(height + height2 + f);
                WebViewActivity.this.mBottomSheetLayout.setMaxTranslationOffset(height2);
                if (z) {
                    WebViewActivity.this.mBottomSheetLayout.expandSheet();
                } else {
                    WebViewActivity.this.mBottomSheetLayout.peekSheet();
                }
                return true;
            }
        });
    }

    private void setStatusBarColor(int i) {
        getWindow().setStatusBarColor(ViewUtils.darken(i, 0.8f));
    }

    private void setupNavBar() {
        findViewById(C12238R.C12240id.web_chrome_subtitle).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebViewActivity webViewActivity = WebViewActivity.this;
                webViewActivity.presenter.onSubtitleClick(webViewActivity.browserChromeClient);
            }
        });
    }

    private void setupOpenInApp() {
        View findViewById = findViewById(C12238R.C12240id.web_open_app);
        if (shouldHideOpenInAppButton()) {
            findViewById.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebViewActivity.this.startAttendedInstall();
            }
        });
        ((AssetImageView) findViewById(C12238R.C12240id.web_open_app_icon)).loadAsset(getButton().getImageLoader(), getIcon());
        getBrowser().getAction().applyTo((TextView) findViewById(C12238R.C12240id.web_open_app_text));
    }

    private boolean shouldHideOpenInAppButton() {
        return isTargetWebViewOnly() || !canInstallApp() || getBrowser().getAction() == null;
    }

    /* access modifiers changed from: private */
    public void startAttendedInstall() {
        if (!canInstallApp()) {
            ButtonLog.warnFormat(TAG, "Can't install app link=%s, store ID=%s", this.mLink.getAppLink(), this.mMeta.getStoreId());
            return;
        }
        ButtonLog.info(TAG, "Starting attended install.");
        new ActionPerformer(this.mApp, new MetaInfo(this.mMeta.getMaxAgeSeconds(), this.mMeta.getId(), this.mMeta.getStoreId(), this.mMeta.getSourceToken(), this.mMeta.getCampaignId(), (Browser) null, this.mMeta.getAppName(), this.mMeta.getTarget(), this.mMeta.getIcon(), this.mMeta.getRequestTime(), this.mMeta.getTapSignal(), this.mMeta.isUnsupportedUrl()), this.mLink).execute(getContext());
    }

    private void styleBottomBar() {
        setFooterTintColor(getPrimaryColor());
    }

    public static String updateUserAgent(HostInformation hostInformation, String str) {
        if (str == null) {
            return str;
        }
        String replaceAll = str.replaceAll("((?=Version)(.*)(?=Chrome))|(wv)", "");
        if (!Pattern.compile(".*\\(.*\\).*").matcher(replaceAll).find()) {
            return replaceAll;
        }
        return String.format("%s ButtonSDK/%s", new Object[]{replaceAll, hostInformation.getSdkVersionName()});
    }

    public void animateFinishBrowserTransition(BrowserTransitionStyle browserTransitionStyle) {
        overridePendingTransition(browserTransitionStyle.getFinishEnterAnimation(), browserTransitionStyle.getFinishExitAnimation());
    }

    public void animateStartBrowserTransition(BrowserTransitionStyle browserTransitionStyle) {
        overridePendingTransition(browserTransitionStyle.getStartEnterAnimation(), browserTransitionStyle.getStartExitAnimation());
    }

    public boolean canShowCards() {
        return this.mBrowserProxy.canShowCards();
    }

    @SuppressLint({"WrongConstant"})
    public void disableSystemAutofillService() {
        getWindow().getDecorView().setImportantForAutofill(4);
    }

    public void dismissWebView() {
        this.mReportDismiss = true;
        finish();
    }

    public void fillFields(JSONObject jSONObject) {
        this.javascriptInterface.fillFields(jSONObject);
    }

    public void finish() {
        if (this.mReportDismiss) {
            getEventTracker().trackEventWithProperties(Events.WEB_WEBVIEW_DISMISS, BrowserHelpers.propertiesForUrl(this.mLink.getBrowserLink(), this.mMeta));
            this.mReportDismiss = false;
        }
        super.finish();
        WebViewPresenter webViewPresenter = this.presenter;
        if (webViewPresenter != null) {
            webViewPresenter.onFinishActivity();
        }
    }

    public List<String> getBlockedResources() {
        return new ArrayList(this.webClient.getBlockedResources());
    }

    public CardList getCardList() {
        return this.mAdapter.getPublicCardList();
    }

    public BrowserInterface.Footer getFooter() {
        return this.mBrowserProxy.getFooter();
    }

    public int getFooterBackgroundColor() {
        return ((ColorDrawable) findViewById(C12238R.C12240id.web_controls).getBackground()).getColor();
    }

    public int getFooterTintColor() {
        return ((TextView) findViewById(C12238R.C12240id.web_open_app_text)).getCurrentTextColor();
    }

    public BrowserInterface.Header getHeader() {
        return this.mBrowserProxy.getHeader();
    }

    public int getHeaderBackgroundColor() {
        return ((ColorDrawable) findViewById(C12238R.C12240id.web_chrome_top).getBackground()).getColor();
    }

    public int getHeaderTintColor() {
        return ((Integer) findViewById(C12238R.C12240id.web_close).getTag()).intValue();
    }

    public CardList getPersistentCardList() {
        return this.mAdapter.getPersistentCardList();
    }

    public PopupWebView getPopupWebView() {
        return this.webChromeClient.getPopupWebView();
    }

    public CardList getPrivateCardList() {
        return this.mAdapter.getPrivateCardList();
    }

    public RelativeLayout getViewContainer() {
        return (RelativeLayout) findViewById(C12238R.C12240id.web_view_container);
    }

    public void hideAutofillAccessoryView() {
        this.autofillAccessoryView.setVisibility(8);
        this.mWebChrome.setVisibility(0);
    }

    public void hideKeyboard() {
        InputMethodManager inputMethodManager;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public void hideTopCard() {
        this.presenter.onHideTopCard();
    }

    public void loadBtnSdkJs(String str) {
        this.javascriptInterface.loadBtnSdkJs(str);
    }

    public void loadUrl(String str) {
        this.mWebView.loadUrl(str);
    }

    public void loadUrlExternal(String str) {
        ButtonPrivate.safelyOpenIntent(this, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void observeFields(JSONObject jSONObject) {
        this.javascriptInterface.observeFields(jSONObject);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 101 && i2 == 0) {
            dismissWebView();
        }
        if (i == 102 && i2 == 0) {
            onHideTopCard();
        }
        if (i == 103 && i2 == 0) {
            if (intent != null && intent.getBooleanExtra(FullScreenWidgetActivity.EXTRA_DISMISS, false)) {
                dismissWebView();
            } else {
                return;
            }
        }
        if (i == 103 && i2 == -1) {
            this.presenter.onOpenUrl(intent.getStringExtra("url"), intent.getStringExtra("target"));
        }
    }

    public void onBackPressed() {
        PopupWebView popupWebView = getPopupWebView();
        if (this.mBottomSheetLayout.getState() == BottomSheetLayout.State.EXPANDED) {
            this.mBottomSheetLayout.dismissSheet();
        } else if (popupWebView != null) {
            popupWebView.close();
        } else if (this.mWebView.canGoBack()) {
            this.mWebView.goBack();
        } else if (this.presenter.onNotifyShouldClose()) {
            this.mReportDismiss = true;
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BottomSheetLayout bottomSheetLayout = this.mBottomSheetLayout;
        if (bottomSheetLayout != null && bottomSheetLayout.isSheetShowing()) {
            this.mBottomSheetLayout.dismissSheet();
            int i = C1228316.f30924x5295ca96[this.mBottomSheetLayout.getState().ordinal()];
            if (i == 1) {
                this.mBottomSheetLayout.peekSheet();
            } else if (i == 2) {
                this.mBottomSheetLayout.expandSheet();
            }
        }
    }

    public void onConfigureDismissAllCards(BottomSheetLayout.State state) {
        final ImageButton imageButton = (ImageButton) findViewById(C12238R.C12240id.web_dismiss_all_cards);
        final Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C12238R.anim.btn_fade_out);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                imageButton.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                imageButton.setOnClickListener((View.OnClickListener) null);
            }
        });
        if (state == BottomSheetLayout.State.EXPANDED) {
            if (imageButton.getVisibility() != 0) {
                imageButton.setVisibility(0);
                imageButton.startAnimation(AnimationUtils.loadAnimation(getContext(), C12238R.anim.btn_fade_in));
                imageButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        WebViewActivity.this.mBottomSheetLayout.dismissSheet();
                        imageButton.startAnimation(loadAnimation);
                    }
                });
            }
        } else if (state == BottomSheetLayout.State.HIDDEN) {
            if (imageButton.getVisibility() == 0) {
                imageButton.startAnimation(loadAnimation);
            }
            this.mRecyclerView.mo4589e0(0);
        }
    }

    public void onCreate(Bundle bundle) {
        MetaInfo metaInfo;
        super.onCreate(bundle);
        ButtonPrivate button = ButtonPrivate.getButton();
        if (button == null) {
            ButtonLog.warn(TAG, "Button SDK is not configured. Finishing activity.");
            finish();
            return;
        }
        ButtonRepository buttonRepository = button.getButtonRepository();
        if (buttonRepository == null) {
            ButtonLog.warn(TAG, "Button SDK is not configured. Finishing activity.");
            finish();
            return;
        }
        this.mApp = (App) getIntent().getParcelableExtra("app");
        this.mMeta = (MetaInfo) getIntent().getParcelableExtra("meta");
        Link link = (Link) getIntent().getParcelableExtra(EXTRA_LINK);
        this.mLink = link;
        if (link == null || link.getBrowserLink() == null || (metaInfo = this.mMeta) == null || metaInfo.getBrowser() == null) {
            ButtonLog.warn(TAG, String.format("Invalid parameters to WebViewActivity: link=%s, meta=%s", new Object[]{this.mLink, this.mMeta}));
            if (!ButtonUtil.isDebugBuild(getContext())) {
                finish();
            } else {
                throw new IllegalStateException("Missing valid parameters.");
            }
        }
        setStatusBarColor(getBrowser().getPrimaryColor());
        setContentView(C12238R.layout.btn_activity_web);
        BottomSheetLayout bottomSheetLayout = (BottomSheetLayout) findViewById(C12238R.C12240id.web_bottomsheet);
        this.mBottomSheetLayout = bottomSheetLayout;
        bottomSheetLayout.setPeekOnDismiss(false);
        this.mBottomSheetLayout.setInterceptContentTouch(false);
        this.mBottomSheetLayout.setUseHardwareLayerWhileAnimating(true);
        this.mBottomSheetLayout.addOnSheetStateChangeListener(new BottomSheetLayout.OnSheetStateChangeListener() {
            public void onSheetReady(boolean z) {
                WebViewActivity.this.onBottomSheetReady(z);
            }

            public void onSheetStateChanged(BottomSheetLayout.State state) {
                String str;
                WebViewActivity.this.presenter.onStateChanged(state);
                WebViewActivity.this.mCoordinator.animateMargins(state);
                if (state == BottomSheetLayout.State.EXPANDED) {
                    EventTracker access$400 = WebViewActivity.this.getEventTracker();
                    String[] strArr = new String[2];
                    strArr[0] = Events.PROPERTY_INTERACTION;
                    if (WebViewActivity.this.wasSheetOpenedByTap) {
                        str = "tap";
                    } else {
                        str = "swipe";
                    }
                    strArr[1] = str;
                    access$400.trackEventWithProperties(Events.WEV_WEBVIEW_CARDS_VIEWED, strArr);
                    boolean unused = WebViewActivity.this.wasSheetOpenedByTap = false;
                }
            }
        });
        this.mRecyclerViewContainer = LayoutInflater.from(this).inflate(C12238R.layout.btn_checkout_recycler_view, this.mBottomSheetLayout, false);
        this.mBrowserProxy = new BrowserProxy(new WeakReference(this));
        RecyclerView recyclerView = (RecyclerView) this.mRecyclerViewContainer.findViewById(C12238R.C12240id.checkout_recycler_view);
        this.mRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new CardListGridLayoutManager(this));
        CardListAdapter cardListAdapter = new CardListAdapter(this.mBrowserProxy);
        this.mAdapter = cardListAdapter;
        cardListAdapter.setHasStableIds(true);
        this.mRecyclerView.setAdapter(this.mAdapter);
        BrowserPageViewClient browserPageViewClient = new BrowserPageViewClient(buttonRepository, this.mMeta.getSourceToken(), this.mMeta.getCampaignId(), button.getConfiguration().getFlags());
        CardListAdapter cardListAdapter2 = this.mAdapter;
        UrlPrivacyValidator urlPrivacyValidator = new UrlPrivacyValidator();
        BrowserUriParser browserUriParser = new BrowserUriParser();
        EventTracker eventTracker = button.getEventTracker();
        MetaInfo metaInfo2 = this.mMeta;
        Link link2 = this.mLink;
        BrowserProxy browserProxy = this.mBrowserProxy;
        CheckoutManager instance = CheckoutManager.getInstance();
        Configuration.Parameters parameters = button.getConfiguration().getParameters();
        MainThreadExecutor mainThreadExecutor = new MainThreadExecutor();
        ButtonRepository buttonRepository2 = buttonRepository;
        this.presenter = new WebViewPresenter(cardListAdapter2, urlPrivacyValidator, browserUriParser, eventTracker, metaInfo2, link2, browserProxy, browserPageViewClient, instance, parameters, mainThreadExecutor, buttonRepository2, new RestrictedDomainManager(CookieManager.getInstance()), ConfigurationModule.getInstance());
        this.contentView = findViewById(16908290);
        this.mWebView = (WebView) findViewById(C12238R.C12240id.web_webview);
        this.mWebChrome = (ViewGroup) findViewById(C12238R.C12240id.web_chrome);
        this.mCoordinator = new ViewCoordinator(this.mWebView, findViewById(C12238R.C12240id.web_chrome_top), this.mWebChrome, this.presenter);
        this.progressBar = (ColorProgressBar) findViewById(C12238R.C12240id.web_loading);
        this.mNavigator = new Navigator(this.mWebView, this.presenter);
        this.webChromeClient = new BrowserWebChromeClient(this.presenter, (WebControls) findViewById(C12238R.C12240id.web_controls), this.mNavigator);
        setupOpenInApp();
        configureWebView();
        configureChrome();
        styleBottomBar();
        setupNavBar();
        configureAutofillAccessoryView();
        this.presenter.setJavaScriptInterface(this.javascriptInterface);
        attachPresenterToLifecycle(this.presenter, this);
        if (!ButtonUtil.isDebugBuild(this)) {
            getWindow().addFlags(8192);
        }
        this.presenter.onCreateActivity(bundle);
    }

    public void onDestroy() {
        BrowserProxy browserProxy = this.mBrowserProxy;
        if (browserProxy != null) {
            browserProxy.destroy();
        }
        super.onDestroy();
    }

    public void onHideCta() {
        findViewById(C12238R.C12240id.web_cta_layout).setVisibility(8);
        if (!shouldHideOpenInAppButton()) {
            findViewById(C12238R.C12240id.web_open_app).setVisibility(0);
        }
    }

    public void onHideTopCard() {
        if (this.mBottomSheetLayout.isSheetShowing()) {
            this.mBottomSheetLayout.dismissSheet();
        }
    }

    public void onProgressChanged(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.progressBar.setProgress(i, true);
        } else {
            this.progressBar.setProgress(i);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mWebView.restoreState(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mWebView.saveState(bundle);
    }

    public void onShowAllCard(boolean z) {
        View findViewById = findViewById(C12238R.C12240id.web_view_all_cards);
        if (z) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    boolean unused = WebViewActivity.this.wasSheetOpenedByTap = true;
                    if (WebViewActivity.this.mBottomSheetLayout.getState() == BottomSheetLayout.State.HIDDEN) {
                        WebViewActivity webViewActivity = WebViewActivity.this;
                        webViewActivity.mBottomSheetLayout.showWithSheetView(webViewActivity.mRecyclerViewContainer, WebViewActivity.this.viewTransformer, true);
                    } else if (WebViewActivity.this.mBottomSheetLayout.getState() == BottomSheetLayout.State.PEEKED) {
                        WebViewActivity.this.mBottomSheetLayout.expandSheet();
                    } else {
                        WebViewActivity.this.mBottomSheetLayout.dismissSheet();
                    }
                }
            });
            return;
        }
        findViewById.setVisibility(8);
    }

    public void onShowCta(CallToAction callToAction) {
        View findViewById = findViewById(C12238R.C12240id.web_cta_layout);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!WebViewActivity.this.mBottomSheetLayout.isSheetShowing()) {
                    WebViewActivity.this.getEventTracker().trackEvent(Events.WEB_WEBVIEW_CTA_TAPPED);
                }
                WebViewActivity webViewActivity = WebViewActivity.this;
                webViewActivity.presenter.onCtaClicked(webViewActivity.mBottomSheetLayout.getState());
            }
        });
        findViewById(C12238R.C12240id.web_open_app).setVisibility(8);
        ImageView imageView = (ImageView) findViewById(C12238R.C12240id.web_cta_icon);
        TextView textView = (TextView) findViewById(C12238R.C12240id.web_cta_text);
        textView.setText(callToAction.getText());
        textView.setTextColor(callToAction.getTextColor());
        imageView.setImageResource(callToAction.getIcon());
        if (callToAction instanceof InternalCallToAction) {
            getButton().getImageLoader().load(((InternalCallToAction) callToAction).getIconUrl(), imageView);
        }
    }

    public void onShowTopCard() {
        if (this.mBottomSheetLayout.isSheetShowing()) {
            onBottomSheetReady(false);
        } else {
            this.mBottomSheetLayout.showWithSheetView(this.mRecyclerViewContainer, this.viewTransformer, false);
        }
    }

    public void onStart() {
        super.onStart();
        WebViewObserver.getInstance().addListener(this);
        this.contentView.getViewTreeObserver().addOnGlobalLayoutListener(this.keyboardLayoutListener);
    }

    public void onStop() {
        super.onStop();
        WebViewObserver.getInstance().removeListener(this);
        this.contentView.getViewTreeObserver().removeOnGlobalLayoutListener(this.keyboardLayoutListener);
    }

    public void reloadCards() {
        this.presenter.reloadCards();
    }

    public void setAutofillAccessoryViewParam(String str) {
        this.autofillAccessoryView.setDisplayedParam(str, this.autofillAccessoryViewListener);
    }

    public void setBrowserChromeClient(BrowserChromeClient browserChromeClient2) {
        this.browserChromeClient = browserChromeClient2;
    }

    public void setCustomActionView(final View view) {
        FrameLayout frameLayout = (FrameLayout) findViewById(C12238R.C12240id.web_chrome_custom_view);
        frameLayout.removeAllViews();
        if (view != null) {
            frameLayout.addView(view);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    WebViewActivity webViewActivity = WebViewActivity.this;
                    webViewActivity.presenter.onCustomActionClick(webViewActivity.browserChromeClient, view);
                }
            });
        }
    }

    public void setFooterBackgroundColor(int i) {
        findViewById(C12238R.C12240id.web_controls).setBackgroundColor(i);
    }

    public void setFooterTintColor(int i) {
        ((TextView) findViewById(C12238R.C12240id.web_open_app_text)).setTextColor(i);
        this.progressBar.setColor(i);
        ((ImageButton) findViewById(C12238R.C12240id.web_forward)).setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        ((ImageButton) findViewById(C12238R.C12240id.web_back)).setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public void setHeaderBackgroundColor(int i) {
        findViewById(C12238R.C12240id.web_chrome_top).setBackgroundColor(i);
        setStatusBarColor(i);
    }

    public void setHeaderSubtitle(BrowserText browserText) {
        int i = C12238R.C12240id.web_chrome_subtitle;
        ((TextView) findViewById(i)).setText(browserText.getText());
        ((TextView) findViewById(i)).setTextColor(browserText.getColor());
    }

    public void setHeaderTintColor(int i) {
        int i2 = C12238R.C12240id.web_close;
        ((ImageView) findViewById(i2)).setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        findViewById(i2).setTag(Integer.valueOf(i));
    }

    public void setHeaderTitle(BrowserText browserText) {
        int i = C12238R.C12240id.web_chrome_title;
        ((TextView) findViewById(i)).setText(browserText.getText());
        ((TextView) findViewById(i)).setTextColor(browserText.getColor());
    }

    public void setProgressVisible(boolean z) {
        if (z) {
            this.mCoordinator.reset();
            ViewUtils.show(this.progressBar);
            return;
        }
        ViewUtils.hide(this.progressBar);
    }

    public void showAutofillAccessoryView() {
        this.autofillAccessoryView.setVisibility(0);
        this.mWebChrome.setVisibility(8);
    }

    public void showFullScreenWidget(Widget widget) {
        startActivityForResult(FullScreenWidgetActivity.createIntent(this, widget, getInstallIntent()), 103);
    }

    public void showTopCard() {
        this.presenter.onShowTopCard(getEventTracker(), this.mMeta.getSourceToken(), this.mBottomSheetLayout.getState());
    }

    public void startAppInstallFlow() {
        startActivityForResult(getInstallIntent(), 102);
    }

    public void startInstallSheetActivity(InstallSheet installSheet, int i, Asset asset, String str) {
        startActivityForResult(InstallSheetActivity.createIntent(this, installSheet, getInstallIntent(), i, asset, str), 101);
    }
}
