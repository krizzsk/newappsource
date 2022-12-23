package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.l */
public final class C14286l extends C14278j {
    public C14286l(C14310r rVar, C17573l lVar) {
        super(rVar, lVar);
    }

    /* renamed from: m */
    public final void mo42845m(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo42845m(bundle, bundle2);
        this.f35916b.mo50025b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
