package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.moovit.MoovitActivity;
import p495fq.C17062f;
import p554id.C17573l;
import p554id.C17576o;

/* renamed from: com.google.android.play.core.appupdate.g */
public final class C14229g implements C14224b {

    /* renamed from: a */
    public final C14238p f35759a;

    /* renamed from: b */
    public final C14228f f35760b;

    /* renamed from: c */
    public final Context f35761c;

    public C14229g(C14238p pVar, C14228f fVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f35759a = pVar;
        this.f35760b = fVar;
        this.f35761c = context;
    }

    /* renamed from: a */
    public final synchronized void mo42689a(C17062f fVar) {
        C14228f fVar2 = this.f35760b;
        synchronized (fVar2) {
            fVar2.f43762a.mo977d("registerListener", new Object[0]);
            if (fVar != null) {
                fVar2.f43765d.add(fVar);
                fVar2.mo49481b();
            } else {
                throw new NullPointerException("Registered Play Core listener should not be null.");
            }
        }
    }

    /* renamed from: b */
    public final C17576o mo42690b() {
        C14238p pVar = this.f35759a;
        String packageName = this.f35761c.getPackageName();
        if (pVar.f35778a == null) {
            return C14238p.m35439c();
        }
        C14238p.f35776e.mo977d("completeUpdate(%s)", packageName);
        C17573l lVar = new C17573l();
        pVar.f35778a.mo49336b(new C14234l(pVar, lVar, lVar, packageName), lVar);
        return lVar.f45196a;
    }

    /* renamed from: c */
    public final C17576o mo42691c() {
        C14238p pVar = this.f35759a;
        String packageName = this.f35761c.getPackageName();
        if (pVar.f35778a == null) {
            return C14238p.m35439c();
        }
        C14238p.f35776e.mo977d("requestUpdateInfo(%s)", packageName);
        C17573l lVar = new C17573l();
        pVar.f35778a.mo49336b(new C14233k(pVar, lVar, lVar, packageName), lVar);
        return lVar.f45196a;
    }

    /* renamed from: d */
    public final boolean mo42692d(C14223a aVar, MoovitActivity moovitActivity) throws IntentSender.SendIntentException {
        boolean z;
        C14241s c = C14225c.m35332c();
        if (moovitActivity == null || aVar == null) {
            return false;
        }
        if (aVar.mo42688a(c) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || aVar.f35746i) {
            return false;
        }
        aVar.f35746i = true;
        moovitActivity.startIntentSenderForResult(aVar.mo42688a(c).getIntentSender(), 1354, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    /* renamed from: e */
    public final synchronized void mo42693e(C17062f fVar) {
        C14228f fVar2 = this.f35760b;
        synchronized (fVar2) {
            fVar2.f43762a.mo977d("unregisterListener", new Object[0]);
            if (fVar != null) {
                fVar2.f43765d.remove(fVar);
                fVar2.mo49481b();
            } else {
                throw new NullPointerException("Unregistered Play Core listener should not be null.");
            }
        }
    }
}
