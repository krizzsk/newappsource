package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p145k5.C5488g;
import p177n1.C5815m;
import p838uf.C19906g;
import p909xe.C20465b;
import p909xe.C20466c;
import p909xe.C20467d;
import p909xe.C20468e;
import p909xe.C20469f;
import p909xe.C20470g;
import p956ze.C20839b;

/* renamed from: com.google.firebase.heartbeatinfo.a */
public final class C14458a implements C20469f, HeartBeatInfo {

    /* renamed from: f */
    public static final C20465b f36524f = new C20465b();

    /* renamed from: a */
    public final C20839b<C20470g> f36525a;

    /* renamed from: b */
    public final Context f36526b;

    /* renamed from: c */
    public final C20839b<C19906g> f36527c;

    /* renamed from: d */
    public final Set<C20468e> f36528d;

    /* renamed from: e */
    public final Executor f36529e;

    public C14458a() {
        throw null;
    }

    public C14458a(Context context, String str, Set<C20468e> set, C20839b<C19906g> bVar) {
        C20467d dVar = new C20467d(context, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f36524f);
        this.f36525a = dVar;
        this.f36528d = set;
        this.f36529e = threadPoolExecutor;
        this.f36527c = bVar;
        this.f36526b = context;
    }

    /* renamed from: a */
    public final Task<String> mo43361a() {
        boolean z;
        Context context = this.f36526b;
        if (Build.VERSION.SDK_INT >= 24) {
            z = C5815m.m14248a(context);
        } else {
            z = true;
        }
        if (!z) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f36529e, new C5488g(this, 1));
    }

    /* renamed from: b */
    public final synchronized HeartBeatInfo.HeartBeat mo43359b() {
        boolean g;
        long currentTimeMillis = System.currentTimeMillis();
        C20470g gVar = this.f36525a.get();
        synchronized (gVar) {
            g = gVar.mo52666g(currentTimeMillis);
        }
        if (g) {
            synchronized (gVar) {
                String d = gVar.mo52663d(System.currentTimeMillis());
                gVar.f51839a.edit().putString("last-used-date", d).commit();
                gVar.mo52665f(d);
            }
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    /* renamed from: c */
    public final void mo43362c() {
        boolean z;
        if (this.f36528d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        Context context = this.f36526b;
        if (Build.VERSION.SDK_INT >= 24) {
            z = C5815m.m14248a(context);
        } else {
            z = true;
        }
        if (!z) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f36529e, new C20466c(this, 0));
        }
    }
}
