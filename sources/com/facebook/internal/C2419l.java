package com.facebook.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.internal.C2410j0;
import mf0.C24362h;

/* renamed from: com.facebook.internal.l */
public final /* synthetic */ class C2419l implements C2410j0.C2413c {

    /* renamed from: a */
    public final /* synthetic */ C2420m f8688a;

    public /* synthetic */ C2419l(C2420m mVar) {
        this.f8688a = mVar;
    }

    /* renamed from: a */
    public final void mo12584a(Bundle bundle, FacebookException facebookException) {
        C2420m mVar = this.f8688a;
        int i = C2420m.f8689c;
        C24362h.m61211f(mVar, "this$0");
        FragmentActivity activity = mVar.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }
}
