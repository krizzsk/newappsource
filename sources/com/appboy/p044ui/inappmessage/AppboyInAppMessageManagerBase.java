package com.appboy.p044ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import com.appboy.models.IInAppMessage;
import com.appboy.p044ui.inappmessage.factories.AppboyFullViewFactory;
import com.appboy.p044ui.inappmessage.factories.AppboyHtmlFullViewFactory;
import com.appboy.p044ui.inappmessage.factories.AppboyHtmlViewFactory;
import com.appboy.p044ui.inappmessage.factories.AppboyInAppMessageAnimationFactory;
import com.appboy.p044ui.inappmessage.factories.AppboyInAppMessageViewWrapperFactory;
import com.appboy.p044ui.inappmessage.factories.AppboyModalViewFactory;
import com.appboy.p044ui.inappmessage.factories.AppboySlideupViewFactory;
import com.appboy.p044ui.inappmessage.listeners.AppboyDefaultHtmlInAppMessageActionListener;
import com.appboy.p044ui.inappmessage.listeners.AppboyDefaultInAppMessageManagerListener;
import com.appboy.p044ui.inappmessage.listeners.AppboyInAppMessageWebViewClientListener;
import com.appboy.p044ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.appboy.support.AppboyLogger;

/* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageManagerBase */
public class AppboyInAppMessageManagerBase {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageManagerBase.class);
    public Activity mActivity;
    public Context mApplicationContext;
    private boolean mBackButtonDismissesInAppMessageView = true;
    private boolean mClickOutsideModalDismissesInAppMessageView = false;
    private IInAppMessageManagerListener mCustomInAppMessageManagerListener;
    private final IHtmlInAppMessageActionListener mDefaultHtmlInAppMessageActionListener;
    private final IInAppMessageManagerListener mDefaultInAppMessageManagerListener;
    private final IInAppMessageViewWrapperFactory mDefaultInAppMessageViewWrapperFactory;
    private final IInAppMessageAnimationFactory mInAppMessageAnimationFactory;
    private final IInAppMessageViewFactory mInAppMessageFullViewFactory;
    private final IInAppMessageViewFactory mInAppMessageHtmlFullViewFactory;
    private final IInAppMessageViewFactory mInAppMessageHtmlViewFactory;
    private final IInAppMessageViewFactory mInAppMessageModalViewFactory;
    private final IInAppMessageViewFactory mInAppMessageSlideupViewFactory;

    /* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageManagerBase$1 */
    public static /* synthetic */ class C19921 {
        public static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$inappmessage$MessageType;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.appboy.enums.inappmessage.MessageType[] r0 = com.appboy.enums.inappmessage.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$enums$inappmessage$MessageType = r0
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.SLIDEUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.FULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML_FULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p044ui.inappmessage.AppboyInAppMessageManagerBase.C19921.<clinit>():void");
        }
    }

    public AppboyInAppMessageManagerBase() {
        AppboyInAppMessageWebViewClientListener appboyInAppMessageWebViewClientListener = new AppboyInAppMessageWebViewClientListener();
        this.mDefaultHtmlInAppMessageActionListener = new AppboyDefaultHtmlInAppMessageActionListener();
        this.mInAppMessageSlideupViewFactory = new AppboySlideupViewFactory();
        this.mInAppMessageModalViewFactory = new AppboyModalViewFactory();
        this.mInAppMessageFullViewFactory = new AppboyFullViewFactory();
        this.mInAppMessageHtmlFullViewFactory = new AppboyHtmlFullViewFactory(appboyInAppMessageWebViewClientListener);
        this.mInAppMessageHtmlViewFactory = new AppboyHtmlViewFactory(appboyInAppMessageWebViewClientListener);
        this.mInAppMessageAnimationFactory = new AppboyInAppMessageAnimationFactory();
        this.mDefaultInAppMessageManagerListener = new AppboyDefaultInAppMessageManagerListener();
        this.mDefaultInAppMessageViewWrapperFactory = new AppboyInAppMessageViewWrapperFactory();
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        return this.mDefaultInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(IInAppMessage iInAppMessage) {
        int i = C19921.$SwitchMap$com$appboy$enums$inappmessage$MessageType[iInAppMessage.getMessageType().ordinal()];
        if (i == 1) {
            return this.mInAppMessageSlideupViewFactory;
        }
        if (i == 2) {
            return this.mInAppMessageModalViewFactory;
        }
        if (i == 3) {
            return this.mInAppMessageFullViewFactory;
        }
        if (i == 4) {
            return this.mInAppMessageHtmlFullViewFactory;
        }
        if (i == 5) {
            return this.mInAppMessageHtmlViewFactory;
        }
        String str = TAG;
        StringBuilder k = C13555b.m33972k("Failed to find view factory for in-app message with type: ");
        k.append(iInAppMessage.getMessageType());
        AppboyLogger.m5459w(str, k.toString());
        return null;
    }

    public boolean getDoesBackButtonDismissInAppMessageView() {
        return this.mBackButtonDismissesInAppMessageView;
    }

    public boolean getDoesClickOutsideModalViewDismissInAppMessageView() {
        return this.mClickOutsideModalDismissesInAppMessageView;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        return this.mDefaultHtmlInAppMessageActionListener;
    }

    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        return this.mInAppMessageAnimationFactory;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.mCustomInAppMessageManagerListener;
        return iInAppMessageManagerListener != null ? iInAppMessageManagerListener : this.mDefaultInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage iInAppMessage) {
        return getDefaultInAppMessageViewFactory(iInAppMessage);
    }

    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        return this.mDefaultInAppMessageViewWrapperFactory;
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        AppboyLogger.m5448d(TAG, "Custom InAppMessageManagerListener set");
        this.mCustomInAppMessageManagerListener = iInAppMessageManagerListener;
    }
}
