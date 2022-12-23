package com.facebook.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.appboy.models.InAppMessageBase;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: com.facebook.internal.a0 */
public final class C2375a0 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C2380b0 f8603a;

    public C2375a0(C2380b0 b0Var) {
        this.f8603a = b0Var;
    }

    public final void handleMessage(Message message) {
        if (!C6606a.m15601b(this)) {
            try {
                if (!C6606a.m15601b(this)) {
                    C24362h.m61211f(message, InAppMessageBase.MESSAGE);
                    C2380b0 b0Var = this.f8603a;
                    b0Var.getClass();
                    if (message.what == b0Var.f8619h) {
                        Bundle data = message.getData();
                        if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            b0Var.mo12548a((Bundle) null);
                        } else {
                            b0Var.mo12548a(data);
                        }
                        try {
                            b0Var.f8613b.unbindService(b0Var);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
