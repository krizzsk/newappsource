package com.moovit.app.taxi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.RemoteViews;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import p567iq.C17636c;

@RemoteViews.RemoteView
public class MVViewFlipper extends MVViewAnimator {

    /* renamed from: g */
    public int f39902g = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;

    /* renamed from: h */
    public boolean f39903h = false;

    /* renamed from: i */
    public boolean f39904i = false;

    /* renamed from: j */
    public boolean f39905j = false;

    /* renamed from: k */
    public boolean f39906k = false;

    /* renamed from: l */
    public boolean f39907l = true;

    /* renamed from: m */
    public final C15411a f39908m = new C15411a();

    /* renamed from: n */
    public final C15412b f39909n = new C15412b();

    /* renamed from: com.moovit.app.taxi.MVViewFlipper$a */
    public class C15411a extends BroadcastReceiver {
        public C15411a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                MVViewFlipper mVViewFlipper = MVViewFlipper.this;
                mVViewFlipper.f39907l = false;
                mVViewFlipper.mo46088b(true);
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                MVViewFlipper mVViewFlipper2 = MVViewFlipper.this;
                mVViewFlipper2.f39907l = true;
                mVViewFlipper2.mo46088b(false);
            }
        }
    }

    /* renamed from: com.moovit.app.taxi.MVViewFlipper$b */
    public class C15412b extends Handler {
        public C15412b() {
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                MVViewFlipper mVViewFlipper = MVViewFlipper.this;
                if (mVViewFlipper.f39904i) {
                    mVViewFlipper.setDisplayedChild(mVViewFlipper.f39897b + 1);
                    sendMessageDelayed(obtainMessage(1), (long) MVViewFlipper.this.f39902g);
                }
            }
        }
    }

    public MVViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17636c.MVViewFlipper);
        this.f39902g = obtainStyledAttributes.getInt(1, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        this.f39903h = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void mo46088b(boolean z) {
        boolean z2;
        if (!this.f39906k || !this.f39905j || !this.f39907l) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != this.f39904i) {
            if (z2) {
                mo46070a(this.f39897b, z);
                this.f39909n.sendMessageDelayed(this.f39909n.obtainMessage(1), (long) this.f39902g);
            } else {
                this.f39909n.removeMessages(1);
            }
            this.f39904i = z2;
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        getContext().registerReceiver(this.f39908m, intentFilter);
        if (this.f39903h) {
            this.f39905j = true;
            mo46088b(true);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39906k = false;
        getContext().unregisterReceiver(this.f39908m);
        mo46088b(true);
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f39906k = z;
        mo46088b(false);
    }

    public void setAutoStart(boolean z) {
        this.f39903h = z;
    }

    public void setFlipInterval(int i) {
        this.f39902g = i;
    }
}
