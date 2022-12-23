package com.google.android.gms.internal.nearby;

import android.nfc.NfcAdapter;
import android.nfc.Tag;

public final /* synthetic */ class zzkn implements NfcAdapter.ReaderCallback {
    public final /* synthetic */ zzkp zza;

    public /* synthetic */ zzkn(zzkp zzkp) {
        this.zza = zzkp;
    }

    public final void onTagDiscovered(Tag tag) {
        zzkp.zzb(this.zza, tag);
    }
}
