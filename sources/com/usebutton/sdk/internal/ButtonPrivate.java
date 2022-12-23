package com.usebutton.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.usebutton.sdk.Button;
import com.usebutton.sdk.action.ActionListener;
import com.usebutton.sdk.action.ActionQuery;
import com.usebutton.sdk.action.ActionRequest;
import com.usebutton.sdk.action.ButtonAction;
import com.usebutton.sdk.action.ButtonActionsInterface;
import com.usebutton.sdk.internal.api.ActionCache;
import com.usebutton.sdk.internal.api.AppActionCache;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.api.HostInformation;
import com.usebutton.sdk.internal.commands.CheckLoggedInCommand;
import com.usebutton.sdk.internal.commands.CreateSessionCommand;
import com.usebutton.sdk.internal.commands.GetLinksCommand;
import com.usebutton.sdk.internal.commands.GetPromotionsCommand;
import com.usebutton.sdk.internal.commands.UpdateCustomerCommand;
import com.usebutton.sdk.internal.core.ApplicationHooks;
import com.usebutton.sdk.internal.core.Command;
import com.usebutton.sdk.internal.core.CommandExecutor;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.NoOpReceiver;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.ReportPolicy;
import com.usebutton.sdk.internal.events.SyncManager;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.Autofill;
import com.usebutton.sdk.internal.models.Browser;
import com.usebutton.sdk.internal.models.BrowserCardMap;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.InstallSheet;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.models.UrlMatcher;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.notifications.NotificationDispatcher;
import com.usebutton.sdk.internal.purchasepath.CheckoutManager;
import com.usebutton.sdk.internal.purchasepath.PurchasePathPrivate;
import com.usebutton.sdk.internal.purchasepath.PurchasePathRequestPrivate;
import com.usebutton.sdk.internal.secure.SecureStore;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.PackageObserver;
import com.usebutton.sdk.internal.util.TimeProvider;
import com.usebutton.sdk.models.Link;
import com.usebutton.sdk.purchasepath.PurchasePath;
import com.usebutton.sdk.purchasepath.PurchasePathExtension;
import com.usebutton.sdk.purchasepath.PurchasePathInterface;
import com.usebutton.sdk.purchasepath.PurchasePathListener;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import org.json.JSONObject;

public class ButtonPrivate implements PurchasePathInterface, ButtonActionsInterface {
    private static final String TAG = "ButtonPrivate";
    public static ButtonPrivate button;
    private Context context;
    private final ActionCache mActionCache;
    private ApplicationHooks mApplicationHooks;
    /* access modifiers changed from: private */
    public final ButtonApi mButtonApi;
    /* access modifiers changed from: private */
    public final ButtonRepository mButtonRepository;
    private final CommandExecutor mCommandExecutor;
    public TimeProvider mConfigurationTimeProvider = new TimeProvider() {
        public long getTimeInMs() {
            return System.currentTimeMillis();
        }
    };
    /* access modifiers changed from: private */
    public ConfigurationUpdatePolicy mConfigurationUpdatePolicy;
    /* access modifiers changed from: private */
    public final EventTracker mEventTracker;
    private ImageLoader mImageLoader;
    /* access modifiers changed from: private */
    public boolean mIsInitialized = false;
    private final NotificationDispatcher mNotificationDispatcher;
    private ApplicationHooks.OnApplicationEvent mOnApplicationEvents = new ApplicationHooks.OnApplicationEvent() {
        public void onForegrounded() {
            if (ButtonPrivate.this.mIsInitialized) {
                ButtonPrivate.this.mButtonRepository.fetchConfiguration(ButtonPrivate.this.getConfigurationUpdatePolicy());
            } else {
                ButtonPrivate.this.onFirstActivityForegrounded();
            }
        }

        public void onIntent(Intent intent) {
        }
    };
    public FailableReceiver<Configuration> mOnConfigurationUpdated = new FailableReceiver<Configuration>() {
        public void onError() {
        }

        public void onResult(Configuration configuration) {
            if (configuration != null) {
                ButtonPrivate.this.mEventTracker.setConfiguration(configuration);
                ButtonPrivate.this.mButtonRepository.getWebViewJs(new NoOpReceiver());
                if (configuration.getParameters().isButtonDisabled()) {
                    ButtonLog.info(ButtonPrivate.TAG, "Requested to stop SDK from remote configuration.");
                    ButtonPrivate.this.stop();
                }
            }
        }
    };
    private ReportPolicy.Listener mOnShouldSyncEvents = new ReportPolicy.Listener() {
        public void onShouldReport() {
            ButtonPrivate.this.mSyncManager.syncEventsSoon();
        }
    };
    private final PackageObserver mPackageObserver;
    private final SecureStore mSecureStore;
    private boolean mStarted = false;
    public final Storage mStorage;
    private final Handler mSyncEventsHandler;
    /* access modifiers changed from: private */
    public final SyncManager mSyncManager;
    private final UrlMatcher mUrlMatcher;

    public ButtonPrivate(ButtonApi buttonApi, Storage storage, EventTracker eventTracker, CommandExecutor commandExecutor, PackageObserver packageObserver, ApplicationHooks applicationHooks, ActionCache actionCache, ImageLoader imageLoader, UrlMatcher urlMatcher, SecureStore secureStore, ButtonRepository buttonRepository, NotificationDispatcher notificationDispatcher) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.mSyncEventsHandler = handler;
        ButtonApi buttonApi2 = buttonApi;
        this.mButtonApi = buttonApi2;
        Storage storage2 = storage;
        this.mStorage = storage2;
        EventTracker eventTracker2 = eventTracker;
        this.mEventTracker = eventTracker2;
        CommandExecutor commandExecutor2 = commandExecutor;
        this.mCommandExecutor = commandExecutor2;
        this.mPackageObserver = packageObserver;
        this.mApplicationHooks = applicationHooks;
        this.mActionCache = actionCache;
        this.mImageLoader = imageLoader;
        this.mUrlMatcher = urlMatcher;
        this.mSyncManager = new SyncManager(buttonApi2, storage2, eventTracker2, commandExecutor2, handler);
        this.mSecureStore = secureStore;
        this.mButtonRepository = buttonRepository;
        this.mNotificationDispatcher = notificationDispatcher;
    }

    /* access modifiers changed from: private */
    public void doRegister() {
        doRegister((Button.OnConfigureListener) null);
    }

    public static ButtonPrivate getButton() {
        return button;
    }

    /* access modifiers changed from: private */
    public ConfigurationUpdatePolicy getConfigurationUpdatePolicy() {
        if (this.mConfigurationUpdatePolicy == null) {
            Configuration.Parameters parameters = getConfiguration().getParameters();
            this.mConfigurationUpdatePolicy = new ConfigurationUpdatePolicy(this.mConfigurationTimeProvider, parameters.getConfigLaunchUpdateMinimumInterval(), parameters.getConfigUpdateMinimumInterval(), this.mStorage.getConfigState());
        }
        return this.mConfigurationUpdatePolicy;
    }

    private void logStart() {
        String applicationId = getApplicationId();
        if (TextUtils.isEmpty(applicationId)) {
            ButtonLog.visible("Configuration failed (No App ID)");
            return;
        }
        ButtonLog.visibleFormat("Configured successfully (App ID: %s)", applicationId);
    }

    /* access modifiers changed from: private */
    public void onFirstActivityForegrounded() {
        if (!this.mIsInitialized) {
            this.mIsInitialized = true;
            this.mCommandExecutor.dispatch(new CheckLoggedInCommand(new FailableReceiver<Boolean>() {
                public void onError() {
                    ButtonPrivate.this.doRegister();
                }

                public void onResult(Boolean bool) {
                    if (bool.booleanValue()) {
                        String sessionId = ButtonPrivate.this.mStorage.getSessionId();
                        ButtonPrivate.this.mButtonApi.setSessionInfo(ButtonPrivate.this.mStorage);
                        ButtonLog.visibleFormat("Restored session (Session ID: %s)", sessionId);
                        ButtonPrivate.this.prepareSdkForSession();
                    } else {
                        ButtonLog.info(ButtonPrivate.TAG, "Not logged in, register.");
                        ButtonPrivate.this.doRegister();
                    }
                    ButtonPrivate.this.mEventTracker.onAppLaunch();
                }
            }, this.mStorage, this.mButtonApi));
        }
    }

    public static void safelyOpenIntent(Context context2, Intent intent) {
        if (context2.getPackageName().endsWith(".test")) {
            context2.startActivity(intent);
        } else if (context2.getPackageManager().resolveActivity(intent, 0) == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not find any components to handle: " + intent);
            ButtonLog.warn(TAG, "Could not find any app that can handle intent " + intent, illegalStateException);
        } else {
            Activity activity = null;
            ButtonPrivate buttonPrivate = button;
            if (buttonPrivate != null) {
                activity = buttonPrivate.getApplicationHooks().getLastForegroundedActivity();
            }
            if (context2 instanceof Activity) {
                ButtonLog.verbose(TAG, "Launching intent using an activity as context.");
            } else if (activity != null) {
                ButtonLog.verboseFormat(TAG, "Launching using former top activity: %s", activity.getClass().getName());
                context2 = activity;
            } else {
                ButtonLog.verboseFormat(TAG, "Got non-UI context, will launch as new task. %s", context2.getClass().getName());
                intent.setFlags(268435456);
            }
            context2.startActivity(intent);
        }
    }

    public static void setButton(ButtonPrivate buttonPrivate) {
        button = buttonPrivate;
    }

    public boolean canExchangeUrlForAction(URL url, boolean z) {
        return this.mUrlMatcher.canExchangeUrl(url, z);
    }

    public void clearAllData() {
        this.mSecureStore.clear();
        this.mButtonRepository.clear();
        doRegister();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void configure(com.usebutton.sdk.Button.OnConfigureListener r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mStarted     // Catch:{ all -> 0x004e }
            r1 = 0
            if (r0 != 0) goto L_0x003a
            r0 = 1
            r3.mStarted = r0     // Catch:{ all -> 0x004e }
            r3.logStart()     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.core.CommandExecutor r0 = r3.mCommandExecutor     // Catch:{ all -> 0x004e }
            r0.start()     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.core.ApplicationHooks r0 = r3.mApplicationHooks     // Catch:{ all -> 0x004e }
            r0.start()     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.events.EventTracker r0 = r3.mEventTracker     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.events.ReportPolicy$Listener r2 = r3.mOnShouldSyncEvents     // Catch:{ all -> 0x004e }
            r0.subscribeWeak(r2)     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.core.ApplicationHooks r0 = r3.mApplicationHooks     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.functional.Observable r0 = r0.getObservable()     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.core.ApplicationHooks$OnApplicationEvent r2 = r3.mOnApplicationEvents     // Catch:{ all -> 0x004e }
            r0.subscribeWeak(r2)     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.ButtonRepository r0 = r3.mButtonRepository     // Catch:{ all -> 0x004e }
            com.usebutton.sdk.internal.user.UserModule r0 = r0.getUserModule()     // Catch:{ all -> 0x004e }
            java.lang.String r2 = r0.getPreConfigurationUserIdentifier()     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x003a
            r3.setUserIdentifier(r2)     // Catch:{ all -> 0x004e }
            r0.setPreConfigurationUserIdentifier(r1)     // Catch:{ all -> 0x004e }
        L_0x003a:
            com.usebutton.sdk.internal.core.Storage r0 = r3.mStorage     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r0.getSessionId()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x0047
            r4.onComplete(r1)     // Catch:{ all -> 0x004e }
        L_0x0047:
            monitor-exit(r3)
            return
        L_0x0049:
            r3.doRegister(r4)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)
            return
        L_0x004e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.ButtonPrivate.configure(com.usebutton.sdk.Button$OnConfigureListener):void");
    }

    public void doGetAction(String str, ActionQuery actionQuery, String str2, final AppActionCallbacks appActionCallbacks) {
        if (appActionCallbacks == null) {
            ButtonLog.visible("Ignoring doGetAction request with null listener.");
        } else {
            getPromotions(str, str2, new FailableReceiver<AppAction>() {
                public void onError() {
                    appActionCallbacks.onNoAction();
                }

                public void onResult(AppAction appAction) {
                    if (appAction != null) {
                        ButtonPrivate.this.mEventTracker.trackActionAvailable(appAction.getMeta());
                        appActionCallbacks.onAction(appAction);
                        return;
                    }
                    appActionCallbacks.onNoAction();
                }
            }, actionQuery);
        }
    }

    public void doOnLocaleChanged(Context context2) {
        this.mButtonApi.getHttp().setUserAgent(new HostInformation(context2, this.mStorage.getApplicationId()).getUserAgent());
        if (this.mIsInitialized) {
            this.mButtonRepository.fetchConfiguration(getConfigurationUpdatePolicy(), this.mOnConfigurationUpdated);
        }
    }

    public void fetch(PurchasePathRequest purchasePathRequest, final PurchasePathListener purchasePathListener) {
        if (purchasePathListener == null) {
            ButtonLog.visible("Ignoring purchase path request with null listener.");
            return;
        }
        JSONObject jSONObject = null;
        try {
            URL url = new URL(purchasePathRequest.getUrl());
            if (purchasePathRequest instanceof PurchasePathRequestPrivate) {
                jSONObject = ((PurchasePathRequestPrivate) purchasePathRequest).getPassThrough();
            }
            doGetAction(url, purchasePathRequest.getPubRef(), purchasePathRequest.getPlacementId(), jSONObject, new AppActionCallbacks() {
                public void onAction(AppAction appAction) {
                    purchasePathListener.onComplete(new PurchasePathPrivate(appAction), (Throwable) null);
                }

                public void onNoAction() {
                    purchasePathListener.onComplete((PurchasePath) null, new Exception("Purchase Path request failed"));
                }
            });
        } catch (MalformedURLException e) {
            purchasePathListener.onComplete((PurchasePath) null, e);
        }
    }

    public AppActionCache getActionCache() {
        return this.mActionCache;
    }

    public ButtonApi getApi() {
        return this.mButtonApi;
    }

    public ApplicationHooks getApplicationHooks() {
        return this.mApplicationHooks;
    }

    public String getApplicationId() {
        return this.mButtonApi.getApplicationId();
    }

    public ButtonRepository getButtonRepository() {
        return this.mButtonRepository;
    }

    public CommandExecutor getCommandExecutor() {
        return this.mCommandExecutor;
    }

    public Configuration getConfiguration() {
        return this.mButtonRepository.getConfiguration();
    }

    public Context getContext() {
        return this.context;
    }

    public Configuration.Copy getCopy() {
        return getConfiguration().getCopy();
    }

    public EventTracker getEventTracker() {
        return this.mEventTracker;
    }

    public PurchasePathExtension getExtension() {
        return CheckoutManager.getInstance().getExtension();
    }

    public ImageLoader getImageLoader() {
        return this.mImageLoader;
    }

    public NotificationDispatcher getNotificationDispatcher() {
        return this.mNotificationDispatcher;
    }

    public PackageObserver getPackageObserver() {
        return this.mPackageObserver;
    }

    public Configuration.Parameters getParameters() {
        return getConfiguration().getParameters();
    }

    public Command getPromotions(String str, String str2, FailableReceiver<AppAction> failableReceiver, ActionQuery actionQuery) {
        GetPromotionsCommand getPromotionsCommand = new GetPromotionsCommand(this.mButtonApi, this.mStorage, this.mActionCache, this.mImageLoader, str, str2, actionQuery, failableReceiver);
        getCommandExecutor().dispatchFirst(getPromotionsCommand);
        return getPromotionsCommand;
    }

    public SecureStore getSecureStore() {
        return this.mSecureStore;
    }

    public Storage getStorage() {
        return this.mStorage;
    }

    public synchronized boolean internalIsStarted() {
        return this.mStarted;
    }

    public boolean isBrowserEnabled() {
        return this.mButtonRepository.getConfiguration().getParameters().isUnsupportedPurchasePathUrlsEnabled();
    }

    public boolean isRegistered() {
        return !TextUtils.isEmpty(this.mStorage.getSessionId());
    }

    public void prepareSdkForSession() {
        this.mButtonRepository.fetchConfiguration(getConfigurationUpdatePolicy(), this.mOnConfigurationUpdated);
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setExtension(PurchasePathExtension purchasePathExtension) {
        CheckoutManager.getInstance().setExtension(purchasePathExtension);
    }

    public void setUserIdentifier(String str) {
        if (str != null && !str.isEmpty()) {
            this.mStorage.setUserIdentifier(str);
            getCommandExecutor().dispatch(new UpdateCustomerCommand(this.mButtonApi, this.mStorage, str));
        }
    }

    public synchronized void stop() {
        if (this.mStarted) {
            this.mSyncManager.removeCallbacks();
            this.mEventTracker.unsubscribe(this.mOnShouldSyncEvents);
            this.mApplicationHooks.getObservable().unsubscribe(this.mOnApplicationEvents);
            this.mApplicationHooks.stop();
            this.mCommandExecutor.stop();
            this.mStarted = false;
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Button { appId: ");
        k.append(this.mButtonApi);
        if (k.toString() != null) {
            return this.mButtonApi.getApplicationId();
        }
        return "null}";
    }

    private void doRegister(final Button.OnConfigureListener onConfigureListener) {
        this.mCommandExecutor.dispatch(new CreateSessionCommand(this.mButtonApi, this.mStorage, new FailableReceiver<Void>() {
            public void onError() {
                ButtonLog.warn(ButtonPrivate.TAG, "Error: Button was unable to create a session.");
                Button.OnConfigureListener onConfigureListener = onConfigureListener;
                if (onConfigureListener != null) {
                    onConfigureListener.onComplete(new RuntimeException("Error: Button was unable to create a session."));
                }
            }

            public void onResult(Void voidR) {
                ConfigurationUpdatePolicy unused = ButtonPrivate.this.mConfigurationUpdatePolicy = null;
                ButtonPrivate.this.prepareSdkForSession();
                Button.OnConfigureListener onConfigureListener = onConfigureListener;
                if (onConfigureListener != null) {
                    onConfigureListener.onComplete((Throwable) null);
                }
            }
        }));
    }

    public void doGetAction(URL url, String str, String str2, JSONObject jSONObject, AppActionCallbacks appActionCallbacks) {
        URL url2 = url;
        AppActionCallbacks appActionCallbacks2 = appActionCallbacks;
        if (canExchangeUrlForAction(url2, false)) {
            this.mCommandExecutor.dispatchFirst(new GetLinksCommand(this.mButtonApi, this.mStorage, url, str, str2, jSONObject, new UrlActionResponseHandler(url2, this.mUrlMatcher, this.mEventTracker, appActionCallbacks2)));
        } else if (isBrowserEnabled()) {
            Browser browser = new Browser(-16776961, Browser.TARGET_WEBVIEW, Text.white(""), Text.white(""), (Text) null, (InstallSheet) null, (BrowserCardMap) null, (Autofill) null, (Widget) null, Collections.emptyList());
            appActionCallbacks2.onAction(new AppAction.Builder().withBrowser(browser).withTapSignal("").withTarget(Browser.TARGET_WEBVIEW).withAffiliatedLink(new Link((Uri) null, Uri.parse(url.toString()))).withUnsupportedUrl(true).build());
        } else {
            ButtonLog.warnFormat(TAG, "Failed to fetch app action for url: '%s'", url2);
            appActionCallbacks.onNoAction();
        }
    }

    public void fetch(ActionRequest actionRequest, final ActionListener actionListener) {
        if (actionListener == null) {
            ButtonLog.visible("Ignoring fetch request with null listener.");
        } else {
            doGetAction(actionRequest.getButtonId(), actionRequest.getQuery(), actionRequest.getPubRef(), new AppActionCallbacks() {
                public void onAction(AppAction appAction) {
                    actionListener.onComplete(new ButtonAction(appAction), (Throwable) null);
                }

                public void onNoAction() {
                    actionListener.onComplete((ButtonAction) null, new Exception("Button Actions request failed"));
                }
            });
        }
    }
}
