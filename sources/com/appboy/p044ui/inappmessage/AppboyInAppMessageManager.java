package com.appboy.p044ui.inappmessage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.enums.inappmessage.Orientation;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageImmersiveBase;
import com.appboy.p044ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.p044ui.inappmessage.listeners.IWebViewClientStateListener;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageHtmlBaseView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p244s3.C6450y;
import p304x.C7070l;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageManager */
public final class AppboyInAppMessageManager extends AppboyInAppMessageManagerBase {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageManager.class);
    private static volatile AppboyInAppMessageManager sInstance = null;
    private IInAppMessage mCarryoverInAppMessage;
    private BrazeConfigurationProvider mConfigurationProvider;
    private final AtomicBoolean mDisplayingInAppMessage = new AtomicBoolean(false);
    private IEventSubscriber<InAppMessageEvent> mInAppMessageEventSubscriber;
    private final Stack<IInAppMessage> mInAppMessageStack = new Stack<>();
    private final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener = new AppboyInAppMessageViewLifecycleListener();
    private IInAppMessageViewWrapper mInAppMessageViewWrapper;
    private Integer mOriginalOrientation;
    private IInAppMessage mUnregisteredInAppMessage;

    /* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageManager$1 */
    public static /* synthetic */ class C19911 {
        public static final /* synthetic */ int[] $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.appboy.ui.inappmessage.InAppMessageOperation[] r0 = com.appboy.p044ui.inappmessage.InAppMessageOperation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation = r0
                com.appboy.ui.inappmessage.InAppMessageOperation r1 = com.appboy.p044ui.inappmessage.InAppMessageOperation.DISPLAY_NOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.ui.inappmessage.InAppMessageOperation r1 = com.appboy.p044ui.inappmessage.InAppMessageOperation.DISPLAY_LATER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.ui.inappmessage.InAppMessageOperation r1 = com.appboy.p044ui.inappmessage.InAppMessageOperation.DISCARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p044ui.inappmessage.AppboyInAppMessageManager.C19911.<clinit>():void");
        }
    }

    private IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new C6450y(this, 1);
    }

    public static AppboyInAppMessageManager getInstance() {
        if (sInstance == null) {
            synchronized (AppboyInAppMessageManager.class) {
                if (sInstance == null) {
                    sInstance = new AppboyInAppMessageManager();
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createInAppMessageEventSubscriber$1(InAppMessageEvent inAppMessageEvent) {
        if (!getInAppMessageManagerListener().onInAppMessageReceived(inAppMessageEvent.getInAppMessage())) {
            addInAppMessage(inAppMessageEvent.getInAppMessage());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$displayInAppMessage$0() {
        try {
            if (this.mInAppMessageViewWrapper != null && this.mActivity != null) {
                AppboyLogger.m5448d(TAG, "Page has finished loading. Opening in-app message view wrapper.");
                this.mInAppMessageViewWrapper.open(this.mActivity);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to open view wrapper in page finished listener", e);
        }
    }

    public void addInAppMessage(IInAppMessage iInAppMessage) {
        this.mInAppMessageStack.push(iInAppMessage);
        requestDisplayInAppMessage();
    }

    public void displayInAppMessage(IInAppMessage iInAppMessage, boolean z) {
        String str = TAG;
        StringBuilder k = C13555b.m33972k("Attempting to display in-app message with payload: ");
        k.append(JsonUtils.getPrettyPrintedString((JSONObject) iInAppMessage.forJsonPut()));
        AppboyLogger.m5457v(str, k.toString());
        if (!this.mDisplayingInAppMessage.compareAndSet(false, true)) {
            AppboyLogger.m5448d(str, "A in-app message is currently being displayed. Adding in-app message back on the stack.");
            this.mInAppMessageStack.push(iInAppMessage);
            return;
        }
        try {
            if (this.mActivity != null) {
                if (!z) {
                    long expirationTimestamp = iInAppMessage.getExpirationTimestamp();
                    if (expirationTimestamp > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis > expirationTimestamp) {
                            throw new Exception("In-app message is expired. Doing nothing. Expiration: $" + expirationTimestamp + ". Current time: " + currentTimeMillis);
                        }
                    } else {
                        AppboyLogger.m5448d(str, "Expiration timestamp not defined. Continuing.");
                    }
                } else {
                    AppboyLogger.m5448d(str, "Not checking expiration status for carry-over in-app message.");
                }
                if (!verifyOrientationStatus(iInAppMessage)) {
                    throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                } else if (iInAppMessage.isControl()) {
                    AppboyLogger.m5448d(str, "Not displaying control in-app message. Logging impression and ending display execution.");
                    iInAppMessage.logImpression();
                    resetAfterInAppMessageClose();
                } else {
                    IInAppMessageViewFactory inAppMessageViewFactory = getInAppMessageViewFactory(iInAppMessage);
                    if (inAppMessageViewFactory != null) {
                        View createInAppMessageView = inAppMessageViewFactory.createInAppMessageView(this.mActivity, iInAppMessage);
                        if (createInAppMessageView == null) {
                            iInAppMessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                        } else if (createInAppMessageView.getParent() == null) {
                            Animation openingAnimation = getInAppMessageAnimationFactory().getOpeningAnimation(iInAppMessage);
                            Animation closingAnimation = getInAppMessageAnimationFactory().getClosingAnimation(iInAppMessage);
                            IInAppMessageViewWrapperFactory inAppMessageViewWrapperFactory = getInAppMessageViewWrapperFactory();
                            if (createInAppMessageView instanceof IInAppMessageImmersiveView) {
                                AppboyLogger.m5448d(str, "Creating view wrapper for immersive in-app message.");
                                IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) createInAppMessageView;
                                View view = createInAppMessageView;
                                IInAppMessage iInAppMessage2 = iInAppMessage;
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(view, iInAppMessage2, this.mInAppMessageViewLifecycleListener, this.mConfigurationProvider, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(((InAppMessageImmersiveBase) iInAppMessage).getMessageButtons().size()), iInAppMessageImmersiveView.getMessageCloseButtonView());
                            } else if (createInAppMessageView instanceof IInAppMessageView) {
                                AppboyLogger.m5448d(str, "Creating view wrapper for base in-app message.");
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(createInAppMessageView, iInAppMessage, this.mInAppMessageViewLifecycleListener, this.mConfigurationProvider, openingAnimation, closingAnimation, ((IInAppMessageView) createInAppMessageView).getMessageClickableView());
                            } else {
                                AppboyLogger.m5448d(str, "Creating view wrapper for in-app message.");
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(createInAppMessageView, iInAppMessage, this.mInAppMessageViewLifecycleListener, this.mConfigurationProvider, openingAnimation, closingAnimation, createInAppMessageView);
                            }
                            if (createInAppMessageView instanceof AppboyInAppMessageHtmlBaseView) {
                                AppboyLogger.m5448d(str, "In-app message view includes HTML. Delaying display until the content has finished loading.");
                                ((AppboyInAppMessageHtmlBaseView) createInAppMessageView).setHtmlPageFinishedListener(new C7070l(this, 3));
                                return;
                            }
                            this.mInAppMessageViewWrapper.open(this.mActivity);
                        } else {
                            iInAppMessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                        }
                    } else {
                        iInAppMessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                        throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                    }
                }
            } else {
                this.mCarryoverInAppMessage = iInAppMessage;
                throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
            }
        } catch (Throwable th) {
            String str2 = TAG;
            StringBuilder k2 = C13555b.m33972k("Could not display in-app message with payload: ");
            k2.append(JsonUtils.getPrettyPrintedString((JSONObject) iInAppMessage.forJsonPut()));
            AppboyLogger.m5452e(str2, k2.toString(), th);
            resetAfterInAppMessageClose();
        }
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        if (this.mInAppMessageEventSubscriber != null) {
            AppboyLogger.m5448d(TAG, "Removing existing in-app message event subscriber before subscribing new one.");
            Braze.getInstance(context).removeSingleSubscription(this.mInAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        AppboyLogger.m5448d(TAG, "Subscribing in-app message event subscriber");
        this.mInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.getInstance(context).subscribeToNewInAppMessages(this.mInAppMessageEventSubscriber);
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean z) {
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.mInAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (z) {
                this.mInAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            iInAppMessageViewWrapper.close();
        }
    }

    public void registerInAppMessageManager(Activity activity) {
        if (activity == null) {
            AppboyLogger.m5459w(TAG, "Null Activity passed to registerInAppMessageManager. Doing nothing");
            return;
        }
        String str = TAG;
        StringBuilder k = C13555b.m33972k("Registering InAppMessageManager with activity: ");
        k.append(activity.getLocalClassName());
        AppboyLogger.m5457v(str, k.toString());
        this.mActivity = activity;
        if (this.mApplicationContext == null) {
            this.mApplicationContext = activity.getApplicationContext();
        }
        if (this.mConfigurationProvider == null) {
            this.mConfigurationProvider = new BrazeConfigurationProvider(this.mApplicationContext);
        }
        if (this.mCarryoverInAppMessage != null) {
            AppboyLogger.m5448d(str, "Requesting display of carryover in-app message.");
            this.mCarryoverInAppMessage.setAnimateIn(false);
            displayInAppMessage(this.mCarryoverInAppMessage, true);
            this.mCarryoverInAppMessage = null;
        } else if (this.mUnregisteredInAppMessage != null) {
            AppboyLogger.m5448d(str, "Adding previously unregistered in-app message.");
            addInAppMessage(this.mUnregisteredInAppMessage);
            this.mUnregisteredInAppMessage = null;
        }
        ensureSubscribedToInAppMessageEvents(this.mApplicationContext);
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation inAppMessageOperation;
        try {
            if (this.mActivity == null) {
                if (!this.mInAppMessageStack.empty()) {
                    AppboyLogger.m5459w(TAG, "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
                    this.mUnregisteredInAppMessage = this.mInAppMessageStack.pop();
                } else {
                    AppboyLogger.m5448d(TAG, "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.");
                }
                return false;
            } else if (this.mDisplayingInAppMessage.get()) {
                AppboyLogger.m5448d(TAG, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
                return false;
            } else if (this.mInAppMessageStack.isEmpty()) {
                AppboyLogger.m5448d(TAG, "The in-app message stack is empty. No in-app message will be displayed.");
                return false;
            } else {
                IInAppMessage pop = this.mInAppMessageStack.pop();
                if (!pop.isControl()) {
                    inAppMessageOperation = getInAppMessageManagerListener().beforeInAppMessageDisplayed(pop);
                } else {
                    AppboyLogger.m5448d(TAG, "Using the control in-app message manager listener.");
                    inAppMessageOperation = getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(pop);
                }
                int i = C19911.$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[inAppMessageOperation.ordinal()];
                if (i == 1) {
                    AppboyLogger.m5448d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
                    BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(new Handler(this.mActivity.getMainLooper()), pop);
                    return true;
                } else if (i == 2) {
                    AppboyLogger.m5448d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
                    this.mInAppMessageStack.push(pop);
                    return false;
                } else if (i != 3) {
                    AppboyLogger.m5459w(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
                    return false;
                } else {
                    AppboyLogger.m5448d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
                    return false;
                }
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Error running requestDisplayInAppMessage", e);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        String str = TAG;
        AppboyLogger.m5457v(str, "Resetting after in-app message close.");
        this.mInAppMessageViewWrapper = null;
        this.mDisplayingInAppMessage.set(false);
        if (this.mActivity != null && this.mOriginalOrientation != null) {
            StringBuilder k = C13555b.m33972k("Setting requested orientation to original orientation ");
            k.append(this.mOriginalOrientation);
            AppboyLogger.m5448d(str, k.toString());
            ViewUtils.setActivityRequestedOrientation(this.mActivity, this.mOriginalOrientation.intValue());
            this.mOriginalOrientation = null;
        }
    }

    public void unregisterInAppMessageManager(Activity activity) {
        if (activity == null) {
            AppboyLogger.m5459w(TAG, "Null Activity passed to unregisterInAppMessageManager.");
        } else {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("Unregistering InAppMessageManager from activity: ");
            k.append(activity.getLocalClassName());
            AppboyLogger.m5457v(str, k.toString());
        }
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.mInAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (inAppMessageView instanceof AppboyInAppMessageHtmlBaseView) {
                AppboyLogger.m5448d(TAG, "In-app message view includes HTML. Removing the page finished listener.");
                ((AppboyInAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener((IWebViewClientStateListener) null);
            }
            ViewUtils.removeViewFromParent(inAppMessageView);
            if (this.mInAppMessageViewWrapper.getIsAnimatingClose()) {
                this.mInAppMessageViewLifecycleListener.afterClosed(this.mInAppMessageViewWrapper.getInAppMessage());
                this.mCarryoverInAppMessage = null;
            } else {
                this.mCarryoverInAppMessage = this.mInAppMessageViewWrapper.getInAppMessage();
            }
            this.mInAppMessageViewWrapper = null;
        } else {
            this.mCarryoverInAppMessage = null;
        }
        this.mActivity = null;
        this.mDisplayingInAppMessage.set(false);
    }

    @SuppressLint({"InlinedApi"})
    public boolean verifyOrientationStatus(IInAppMessage iInAppMessage) {
        Activity activity = this.mActivity;
        if (activity == null) {
            AppboyLogger.m5459w(TAG, "Cannot verify orientation status with null Activity.");
            return true;
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            AppboyLogger.m5448d(TAG, "Running on tablet. In-app message can be displayed in any orientation.");
            return true;
        } else {
            Orientation orientation = iInAppMessage.getOrientation();
            if (orientation == null) {
                AppboyLogger.m5448d(TAG, "No orientation specified. In-app message can be displayed in any orientation.");
                return true;
            } else if (orientation == Orientation.ANY) {
                AppboyLogger.m5448d(TAG, "Any orientation specified. In-app message can be displayed in any orientation.");
                return true;
            } else if (!ViewUtils.isCurrentOrientationValid(this.mActivity.getResources().getConfiguration().orientation, orientation)) {
                return false;
            } else {
                if (this.mOriginalOrientation == null) {
                    AppboyLogger.m5448d(TAG, "Requesting orientation lock.");
                    this.mOriginalOrientation = Integer.valueOf(this.mActivity.getRequestedOrientation());
                    ViewUtils.setActivityRequestedOrientation(this.mActivity, 14);
                }
                return true;
            }
        }
    }
}
