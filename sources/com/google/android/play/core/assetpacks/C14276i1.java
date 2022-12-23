package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.appcompat.app.C0262r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import p434dd.C16546c0;

/* renamed from: com.google.android.play.core.assetpacks.i1 */
public final class C14276i1 {

    /* renamed from: g */
    public static final C0262r f35904g = new C0262r("ExtractorSessionStoreView");

    /* renamed from: a */
    public final C14243a0 f35905a;

    /* renamed from: b */
    public final C16546c0 f35906b;

    /* renamed from: c */
    public final C14335x0 f35907c;

    /* renamed from: d */
    public final C16546c0 f35908d;

    /* renamed from: e */
    public final HashMap f35909e = new HashMap();

    /* renamed from: f */
    public final ReentrantLock f35910f = new ReentrantLock();

    public C14276i1(C14243a0 a0Var, C16546c0 c0Var, C14335x0 x0Var, C16546c0 c0Var2) {
        this.f35905a = a0Var;
        this.f35906b = c0Var;
        this.f35907c = x0Var;
        this.f35908d = c0Var2;
    }

    /* renamed from: d */
    public static String m35524d(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new zzck("Session without pack received.");
    }

    /* renamed from: a */
    public final void mo42839a() {
        this.f35910f.unlock();
    }

    /* renamed from: b */
    public final C14264f1 mo42840b(int i) {
        HashMap hashMap = this.f35909e;
        Integer valueOf = Integer.valueOf(i);
        C14264f1 f1Var = (C14264f1) hashMap.get(valueOf);
        if (f1Var != null) {
            return f1Var;
        }
        throw new zzck(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: c */
    public final Object mo42841c(C14272h1 h1Var) {
        try {
            this.f35910f.lock();
            return h1Var.zza();
        } finally {
            this.f35910f.unlock();
        }
    }
}
