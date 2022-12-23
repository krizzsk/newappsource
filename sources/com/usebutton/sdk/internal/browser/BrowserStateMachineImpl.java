package com.usebutton.sdk.internal.browser;

import com.usebutton.sdk.internal.browser.BrowserPageViewClient;
import com.usebutton.sdk.internal.browser.BrowserStateMachine;
import com.usebutton.sdk.internal.purchasepath.PageView;
import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;

public class BrowserStateMachineImpl implements BrowserStateMachine, BrowserPageViewClient.Listener {
    private final BrowserPageViewClient client;
    private String committedUrl = "";
    private State currentState = State.COMMITTED;
    private ButtonJavascriptInterface javascriptInterface;
    private PageView lastResponse = null;
    private BrowserStateMachine.OnStateChangeListener listener;

    public enum State {
        STARTED,
        COMMITTED,
        VERIFIED,
        PURCHASED
    }

    public BrowserStateMachineImpl(BrowserPageViewClient browserPageViewClient, BrowserStateMachine.OnStateChangeListener onStateChangeListener) {
        this.client = browserPageViewClient;
        this.listener = onStateChangeListener;
        browserPageViewClient.setListener(this);
    }

    public void commit(String str) {
        this.currentState = State.COMMITTED;
        this.committedUrl = str;
        PageView pageView = this.lastResponse;
        if (pageView != null) {
            onReceiveResult(str, pageView);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReceiveResult(java.lang.String r5, com.usebutton.sdk.internal.purchasepath.PageView r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.usebutton.sdk.internal.purchasepath.PageView$MatchType r0 = r6.getType()     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.purchasepath.PageView$MatchType r1 = com.usebutton.sdk.internal.purchasepath.PageView.MatchType.ORDER_CHECKOUT     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x001d
            com.usebutton.sdk.internal.browser.BrowserStateMachineImpl$State r0 = r4.currentState     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.browser.BrowserStateMachineImpl$State r1 = com.usebutton.sdk.internal.browser.BrowserStateMachineImpl.State.PURCHASED     // Catch:{ all -> 0x0076 }
            if (r0 == r1) goto L_0x001d
            com.usebutton.sdk.internal.browser.BrowserStateMachine$OnStateChangeListener r0 = r4.listener     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.browser.PurchasePageImpl r2 = new com.usebutton.sdk.internal.browser.PurchasePageImpl     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.web.ButtonJavascriptInterface r3 = r4.javascriptInterface     // Catch:{ all -> 0x0076 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0076 }
            r0.onPurchaseViewed(r2)     // Catch:{ all -> 0x0076 }
            r4.currentState = r1     // Catch:{ all -> 0x0076 }
        L_0x001d:
            com.usebutton.sdk.internal.browser.BrowserStateMachineImpl$State r0 = r4.currentState     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.browser.BrowserStateMachineImpl$State r1 = com.usebutton.sdk.internal.browser.BrowserStateMachineImpl.State.PURCHASED     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x0025
            monitor-exit(r4)
            return
        L_0x0025:
            com.usebutton.sdk.internal.browser.BrowserStateMachineImpl$State r1 = com.usebutton.sdk.internal.browser.BrowserStateMachineImpl.State.COMMITTED     // Catch:{ all -> 0x0076 }
            if (r0 == r1) goto L_0x002d
            r4.lastResponse = r6     // Catch:{ all -> 0x0076 }
            monitor-exit(r4)
            return
        L_0x002d:
            java.lang.String r0 = r4.committedUrl     // Catch:{ all -> 0x0076 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0037
            monitor-exit(r4)
            return
        L_0x0037:
            com.usebutton.sdk.internal.browser.BrowserStateMachineImpl$State r0 = com.usebutton.sdk.internal.browser.BrowserStateMachineImpl.State.VERIFIED     // Catch:{ all -> 0x0076 }
            r4.currentState = r0     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.purchasepath.PageView$MatchType r0 = r6.getType()     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.purchasepath.PageView$MatchType r1 = com.usebutton.sdk.internal.purchasepath.PageView.MatchType.PRODUCT_VIEWED     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x0068
            com.usebutton.sdk.purchasepath.Product r0 = r6.getProduct()     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0066
            com.usebutton.sdk.purchasepath.Commission r0 = r6.getCommission()     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0050
            goto L_0x0066
        L_0x0050:
            com.usebutton.sdk.internal.browser.BrowserStateMachine$OnStateChangeListener r0 = r4.listener     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.browser.ProductPageImpl r1 = new com.usebutton.sdk.internal.browser.ProductPageImpl     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.purchasepath.Product r2 = r6.getProduct()     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.purchasepath.Commission r6 = r6.getCommission()     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.web.ButtonJavascriptInterface r3 = r4.javascriptInterface     // Catch:{ all -> 0x0076 }
            r1.<init>(r5, r2, r6, r3)     // Catch:{ all -> 0x0076 }
            r0.onProductViewed(r1)     // Catch:{ all -> 0x0076 }
            monitor-exit(r4)
            return
        L_0x0066:
            monitor-exit(r4)
            return
        L_0x0068:
            com.usebutton.sdk.internal.browser.BrowserStateMachine$OnStateChangeListener r6 = r4.listener     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.browser.BrowserPageImpl r0 = new com.usebutton.sdk.internal.browser.BrowserPageImpl     // Catch:{ all -> 0x0076 }
            com.usebutton.sdk.internal.web.ButtonJavascriptInterface r1 = r4.javascriptInterface     // Catch:{ all -> 0x0076 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0076 }
            r6.onBatchComplete(r0)     // Catch:{ all -> 0x0076 }
            monitor-exit(r4)
            return
        L_0x0076:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.browser.BrowserStateMachineImpl.onReceiveResult(java.lang.String, com.usebutton.sdk.internal.purchasepath.PageView):void");
    }

    public void setJavascriptInterface(ButtonJavascriptInterface buttonJavascriptInterface) {
        this.javascriptInterface = buttonJavascriptInterface;
    }

    public void start(String str) {
        this.committedUrl = "";
        this.lastResponse = null;
        this.client.executePageViewRequest(str);
        State state = this.currentState;
        State state2 = State.STARTED;
        if (state != state2) {
            this.currentState = state2;
            this.listener.onStart();
        }
    }
}
