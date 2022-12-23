package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import p076eb.C4621a;
import p087fb.C4717b;
import p583jk.C17875h;

public abstract class DownloadService extends Service {

    /* renamed from: e */
    public static final HashMap<Class<? extends DownloadService>, C3978a> f13999e = new HashMap<>();

    /* renamed from: b */
    public int f14000b;

    /* renamed from: c */
    public boolean f14001c;

    /* renamed from: d */
    public boolean f14002d;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadService$a */
    public static final class C3978a {

        /* renamed from: a */
        public DownloadService f14003a;

        public C3978a() {
            throw null;
        }
    }

    /* renamed from: a */
    public abstract C4621a mo16253a();

    /* renamed from: b */
    public abstract C4717b mo16254b();

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        C3978a aVar = f13999e.get(getClass());
        boolean z = false;
        if (aVar != null) {
            if (aVar.f14003a == null) {
                z = true;
            }
            C17875h.m44304o(z);
            aVar.f14003a = this;
            throw null;
        }
        mo16253a().mo20140a(false);
        getApplicationContext();
        throw null;
    }

    public final void onDestroy() {
        boolean z;
        C3978a aVar = f13999e.get(getClass());
        aVar.getClass();
        if (aVar.f14003a == this) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        aVar.f14003a = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        this.f14000b = i2;
        this.f14002d = false;
        if (intent != null) {
            String action = intent.getAction();
            intent.getStringExtra("content_id");
            boolean z2 = this.f14001c;
            if (intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action)) {
                z = true;
            } else {
                z = false;
            }
            this.f14001c = z | z2;
        }
        throw null;
    }

    public final void onTaskRemoved(Intent intent) {
        this.f14002d = true;
    }
}
