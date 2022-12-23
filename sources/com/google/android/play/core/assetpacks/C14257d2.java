package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import p434dd.C16552f0;

/* renamed from: com.google.android.play.core.assetpacks.d2 */
public final class C14257d2 implements C16552f0 {

    /* renamed from: b */
    public final /* synthetic */ int f35823b;

    /* renamed from: c */
    public final C16552f0 f35824c;

    public /* synthetic */ C14257d2(C14337x2 x2Var, int i) {
        this.f35823b = i;
        this.f35824c = x2Var;
    }

    public final Object zza() {
        switch (this.f35823b) {
            case 0:
                return new C14253c2(((C14337x2) this.f35824c).mo42910a());
            default:
                Context a = ((C14337x2) this.f35824c).mo42910a();
                try {
                    Bundle bundle = a.getPackageManager().getApplicationInfo(a.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE).metaData;
                    if (bundle == null) {
                        return null;
                    }
                    return bundle.getString("local_testing_dir");
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
        }
    }
}
