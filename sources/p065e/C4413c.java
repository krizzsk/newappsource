package p065e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;

/* renamed from: e.c */
public final class C4413c extends C4410a<Intent, ActivityResult> {
    /* renamed from: a */
    public final Intent mo3996a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        C24362h.m61211f(componentActivity, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(intent, "input");
        return intent;
    }

    /* renamed from: c */
    public final Object mo3997c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
