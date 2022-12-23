package p284v5;

import com.appboy.p044ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener;
import com.facebook.internal.C2440z;
import p110h8.C5140d;
import p262t8.C6606a;

/* renamed from: v5.a */
public final /* synthetic */ class C6863a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21217b;

    public /* synthetic */ C6863a(int i) {
        this.f21217b = i;
    }

    public final void run() {
        switch (this.f21217b) {
            case 0:
                AppboyInAppMessageViewLifecycleListener.lambda$startClearHtmlInAppMessageAssetsThread$0();
                return;
            case 1:
                C5140d dVar = C5140d.f17156a;
                Class<C5140d> cls = C5140d.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C5140d.f17156a.mo20857a();
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                C2440z zVar = C2440z.f8743a;
                Class<C2440z> cls2 = C2440z.class;
                if (!C6606a.m15601b(cls2)) {
                    try {
                        for (C2440z.C2445e a : C2440z.f8744b) {
                            a.mo12606a(true);
                        }
                        C2440z.f8746d.set(false);
                        return;
                    } catch (Throwable th2) {
                        C6606a.m15600a(cls2, th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
