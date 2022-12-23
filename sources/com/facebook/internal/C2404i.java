package com.facebook.internal;

import android.content.Intent;
import android.util.Pair;
import androidx.activity.ComponentActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p065e.C4410a;

/* renamed from: com.facebook.internal.i */
public final class C2404i extends C4410a<Intent, Pair<Integer, Intent>> {
    /* renamed from: a */
    public final Intent mo3996a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        C24362h.m61211f(componentActivity, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(intent, "input");
        return intent;
    }

    /* renamed from: c */
    public final Object mo3997c(int i, Intent intent) {
        Pair create = Pair.create(Integer.valueOf(i), intent);
        C24362h.m61210e(create, "create(resultCode, intent)");
        return create;
    }
}
