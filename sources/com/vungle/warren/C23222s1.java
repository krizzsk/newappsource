package com.vungle.warren;

import android.text.TextUtils;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.vungle.warren.persistence.DatabaseHelper;
import od0.C24559j;

/* renamed from: com.vungle.warren.s1 */
public final class C23222s1 implements OnSuccessListener<AppSetIdInfo> {

    /* renamed from: b */
    public final /* synthetic */ VungleApiClient f58931b;

    public C23222s1(VungleApiClient vungleApiClient) {
        this.f58931b = vungleApiClient;
    }

    public final void onSuccess(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo != null) {
            this.f58931b.f58563B = appSetIdInfo.getId();
            if (!TextUtils.isEmpty(this.f58931b.f58563B)) {
                C24559j jVar = new C24559j("appSetIdCookie");
                jVar.mo60827d(this.f58931b.f58563B, "appSetId");
                try {
                    this.f58931b.f58588y.mo58288w(jVar);
                } catch (DatabaseHelper.DBException e) {
                    String str = VungleApiClient.f58560C;
                    e.getLocalizedMessage();
                }
            }
        }
    }
}
