package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.i */
public final class C14132i {

    /* renamed from: e */
    public static C14132i f35353e;

    /* renamed from: a */
    public final Object f35354a = new Object();

    /* renamed from: b */
    public final Handler f35355b = new Handler(Looper.getMainLooper(), new C14133a());

    /* renamed from: c */
    public C14135c f35356c;

    /* renamed from: d */
    public C14135c f35357d;

    /* renamed from: com.google.android.material.snackbar.i$a */
    public class C14133a implements Handler.Callback {
        public C14133a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C14132i iVar = C14132i.this;
            C14135c cVar = (C14135c) message.obj;
            synchronized (iVar.f35354a) {
                if (iVar.f35356c == cVar || iVar.f35357d == cVar) {
                    iVar.mo42275a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.i$b */
    public interface C14134b {
        /* renamed from: a */
        void mo42235a(int i);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.i$c */
    public static class C14135c {

        /* renamed from: a */
        public final WeakReference<C14134b> f35359a;

        /* renamed from: b */
        public int f35360b;

        /* renamed from: c */
        public boolean f35361c;

        public C14135c(int i, BaseTransientBottomBar.C14118c cVar) {
            this.f35359a = new WeakReference<>(cVar);
            this.f35360b = i;
        }
    }

    /* renamed from: b */
    public static C14132i m35170b() {
        if (f35353e == null) {
            f35353e = new C14132i();
        }
        return f35353e;
    }

    /* renamed from: a */
    public final boolean mo42275a(C14135c cVar, int i) {
        C14134b bVar = cVar.f35359a.get();
        if (bVar == null) {
            return false;
        }
        this.f35355b.removeCallbacksAndMessages(cVar);
        bVar.mo42235a(i);
        return true;
    }

    /* renamed from: c */
    public final boolean mo42276c(BaseTransientBottomBar.C14118c cVar) {
        boolean z;
        C14135c cVar2 = this.f35356c;
        if (cVar2 != null) {
            if (cVar == null || cVar2.f35359a.get() != cVar) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo42277d(C14135c cVar) {
        int i = cVar.f35360b;
        if (i != -2) {
            if (i <= 0) {
                if (i == -1) {
                    i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
                } else {
                    i = 2750;
                }
            }
            this.f35355b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f35355b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }
}
