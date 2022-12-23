package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.appcompat.app.C0262r;
import java.util.ArrayList;
import p434dd.C16564l0;
import p434dd.C16588x0;

/* renamed from: com.google.android.play.core.assetpacks.s0 */
public final class C14315s0 implements ServiceConnection {

    /* renamed from: b */
    public final C0262r f36026b = new C0262r("ExtractionForegroundServiceConnection");

    /* renamed from: c */
    public final ArrayList f36027c = new ArrayList();

    /* renamed from: d */
    public final Context f36028d;

    /* renamed from: e */
    public ExtractionForegroundService f36029e;

    /* renamed from: f */
    public Notification f36030f;

    public C14315s0(Context context) {
        this.f36028d = context;
    }

    /* renamed from: a */
    public final void mo42889a() {
        ArrayList arrayList;
        synchronized (this.f36027c) {
            arrayList = new ArrayList(this.f36027c);
            this.f36027c.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C16588x0 x0Var = (C16588x0) arrayList.get(i);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel G = x0Var.mo49332G();
                int i2 = C16564l0.f43221a;
                G.writeInt(1);
                bundle.writeToParcel(G, 0);
                G.writeInt(1);
                bundle2.writeToParcel(G, 0);
                x0Var.mo49333H(2, G);
            } catch (RemoteException unused) {
                this.f36026b.mo975b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f36026b.mo974a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((C14311r0) iBinder).f36015b;
        this.f36029e = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f36030f);
        mo42889a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
