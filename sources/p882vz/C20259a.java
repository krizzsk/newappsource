package p882vz;

import android.app.Activity;
import android.app.Application;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import com.google.android.gms.wallet.WalletConstants;
import p090g1.C4732a;
import p374av.C13537a;
import p977zz.C20926a;

/* renamed from: vz.a */
public abstract class C20259a extends C20926a implements NfcAdapter.ReaderCallback {

    /* renamed from: b */
    public final NfcAdapter f51366b;

    public C20259a(Application application) {
        boolean z;
        NfcAdapter nfcAdapter;
        if (!application.getPackageManager().hasSystemFeature("android.hardware.nfc") || C4732a.checkSelfPermission(application, "android.permission.NFC") != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            nfcAdapter = NfcAdapter.getDefaultAdapter(application);
        } else {
            nfcAdapter = null;
        }
        this.f51366b = nfcAdapter;
    }

    public final void onActivityStarted(Activity activity) {
        if (activity != null && this.f51366b != null) {
            if (C13537a.f33463c.contains(activity.getClass())) {
                this.f51366b.enableReaderMode(activity, this, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, (Bundle) null);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity != null && this.f51366b != null) {
            if (C13537a.f33463c.contains(activity.getClass())) {
                this.f51366b.disableReaderMode(activity);
            }
        }
    }

    public final void onTagDiscovered(Tag tag) {
    }
}
