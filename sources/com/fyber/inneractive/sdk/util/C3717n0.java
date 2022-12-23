package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.util.n0 */
public class C3717n0 extends Handler {

    /* renamed from: a */
    public final WeakReference<C3719o0> f12904a;

    public C3717n0(Looper looper, C3719o0 o0Var) {
        super(looper);
        this.f12904a = new WeakReference<>(o0Var);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        C3719o0 o0Var = (C3719o0) C3727s.m9987a(this.f12904a);
        if (o0Var != null) {
            o0Var.handleMessage(message);
        }
    }
}
