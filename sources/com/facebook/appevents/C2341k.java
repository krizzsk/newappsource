package com.facebook.appevents;

import android.content.Context;
import android.net.Uri;
import com.facebook.appevents.p047ml.ModelManager;
import com.facebook.internal.C2397f0;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.firebase.FirebaseCommonRegistrar;
import com.moovit.app.linedetail.p416ui.C15101a;
import hi0.C23520b;
import java.util.Map;
import p009a8.C0115o;
import p173ma.C5735h;
import p173ma.C5739k;
import p262t8.C6606a;
import p276ua.C6763c;
import p277ub.C6777c;
import p838uf.C19904f;
import p977zz.C20949l;
import s60.C19440e;
import t60.C19634d;
import t60.C19636e;

/* renamed from: com.facebook.appevents.k */
public final /* synthetic */ class C2341k implements FeatureManager.C2369a, C6777c, C5739k, C19904f.C19905a, SuccessContinuation, C20949l, C23520b {

    /* renamed from: b */
    public final /* synthetic */ int f8544b;

    public /* synthetic */ C2341k(int i) {
        this.f8544b = i;
    }

    /* renamed from: a */
    public final C5735h[] mo12489a() {
        return new C5735h[]{new C6763c()};
    }

    public final void accept(Object obj) {
        ((C3912b.C3913a) obj).mo16002b();
    }

    /* renamed from: b */
    public final C5735h[] mo252b(Uri uri, Map map) {
        return mo12489a();
    }

    /* renamed from: c */
    public final String mo253c(Context context) {
        return FirebaseCommonRegistrar.m35902a(context);
    }

    /* renamed from: i */
    public final void mo246i(boolean z) {
        if (z) {
            ModelManager modelManager = ModelManager.f8546a;
            Class<ModelManager> cls = ModelManager.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    C2334f fVar = new C2334f(2);
                    C2397f0 f0Var = C2397f0.f8630a;
                    try {
                        C0115o.m212c().execute(fVar);
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
        }
    }

    public final boolean invoke(Object obj) {
        switch (this.f8544b) {
            case 7:
                int i = C15101a.f38810T;
                ((C15101a.C15108g) obj).mo45407B0();
                return false;
            case 9:
                int i2 = C19440e.f49452h;
                ((C19440e.C19441a) obj).mo51853f0();
                return true;
            default:
                int i3 = C19636e.f49821r;
                ((C19634d.C19635a) obj).mo51974S();
                return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.moovit.app.mot.model.MotActivation} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task then(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f8544b
            r1 = 0
            switch(r0) {
                case 5: goto L_0x0021;
                case 6: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x003e
        L_0x0007:
            java.util.List r4 = (java.util.List) r4
            zs.b r0 = new zs.b
            r0.<init>(r1)
            r1 = 0
            c00.C13723g.m34285f(r4, r1, r0)
            a8.l r0 = new a8.l
            r2 = 1
            r0.<init>(r2)
            java.util.ArrayList r4 = c00.C13720d.m34273c(r4, r1, r0)
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forResult(r4)
            return r4
        L_0x0021:
            java.util.List r4 = (java.util.List) r4
            int r0 = p684nq.C18584e.f47313w
            nq.d r0 = new nq.d
            r0.<init>(r1)
            java.lang.Object r0 = c00.C13723g.m34286g(r4, r0)
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
            if (r0 != 0) goto L_0x0039
            java.lang.Object r4 = c00.C13717b.m34256c(r4)
            r0 = r4
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
        L_0x0039:
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r4
        L_0x003e:
            b50.k r4 = (b50.C25554k) r4
            com.moovit.payment.account.deposit.DepositInstructions r4 = r4.f63814m
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forResult(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2341k.then(java.lang.Object):com.google.android.gms.tasks.Task");
    }
}
