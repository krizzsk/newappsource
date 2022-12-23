package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.app.C0262r;
import com.google.android.play.core.install.InstallException;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.appupdate.n */
public final class C14236n extends C14235m {
    public C14236n(C14238p pVar, C17573l lVar) {
        super(pVar, new C0262r("OnCompleteUpdateCallback"), lVar);
    }

    /* renamed from: x */
    public final void mo42767x(Bundle bundle) throws RemoteException {
        super.mo42767x(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f35773c.mo50024a(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f35773c.mo50025b((Object) null);
        }
    }
}
