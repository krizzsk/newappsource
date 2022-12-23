package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.app.C0262r;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.appupdate.o */
public final class C14237o extends C14235m {

    /* renamed from: e */
    public final /* synthetic */ C14238p f35775e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14237o(C14238p pVar, C17573l lVar, String str) {
        super(pVar, new C0262r("OnRequestInstallCallback"), lVar);
        this.f35775e = pVar;
    }

    /* renamed from: t */
    public final void mo42766t(Bundle bundle) throws RemoteException {
        Bundle bundle2 = bundle;
        super.mo42766t(bundle);
        if (bundle2.getInt("error.code", -2) != 0) {
            this.f35773c.mo50024a(new InstallException(bundle2.getInt("error.code", -2)));
            return;
        }
        C17573l lVar = this.f35773c;
        C14238p pVar = this.f35775e;
        bundle2.getInt("version.code", -1);
        int i = bundle2.getInt("update.availability");
        int i2 = bundle2.getInt("install.status", 0);
        if (bundle2.getInt("client.version.staleness", -1) != -1) {
            bundle2.getInt("client.version.staleness");
        }
        bundle2.getInt("in.app.update.priority", 0);
        bundle2.getLong("bytes.downloaded");
        bundle2.getLong("total.bytes.to.download");
        long j = bundle2.getLong("additional.size.required");
        C14239q qVar = pVar.f35781d;
        qVar.getClass();
        lVar.mo50025b(new C14223a(i, i2, j, C14239q.m35440a(new File(qVar.f35782a.getFilesDir(), "assetpacks")), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent")));
    }
}
