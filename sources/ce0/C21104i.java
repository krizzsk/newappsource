package ce0;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import java.net.URISyntaxException;
import xd0.C25247e;

/* renamed from: ce0.i */
public final class C21104i {
    /* renamed from: a */
    public static Intent m49394a(String str, boolean z) {
        Intent intent = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                intent = Intent.parseUri(str, 0);
            }
            if (intent != null && z) {
                intent.setFlags(268435456);
            }
        } catch (URISyntaxException e) {
            e.getLocalizedMessage();
        }
        return intent;
    }

    /* renamed from: b */
    public static void m49395b(String str, String str2, Context context, C25247e eVar, boolean z, PresenterAdOpenCallback presenterAdOpenCallback) {
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && context != null) {
            try {
                C21087a.m49280d(context, m49394a(str, z), m49394a(str2, z), eVar, presenterAdOpenCallback);
            } catch (Exception e) {
                e.getLocalizedMessage();
            }
        }
    }
}
