package p167m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p081f3.C4656h;
import p218q3.C6165a;

/* renamed from: m3.f */
public final class C5676f extends C5669c<Boolean> {
    static {
        C4656h.m11961e("StorageNotLowTracker");
    }

    public C5676f(Context context, C6165a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final Object mo21514a() {
        Intent registerReceiver = this.f18440b.registerReceiver((BroadcastReceiver) null, mo21515e());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: e */
    public final IntentFilter mo21515e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: f */
    public final void mo21516f(Intent intent) {
        if (intent.getAction() != null) {
            C4656h c = C4656h.m11960c();
            String.format("Received %s", new Object[]{intent.getAction()});
            c.mo20176a(new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo21520b(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo21520b(Boolean.TRUE);
            }
        }
    }
}
