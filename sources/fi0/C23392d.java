package fi0;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ei0.C23314a;
import java.util.Collections;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: fi0.d */
public final class C23392d implements C23314a {

    /* renamed from: a */
    public int f59168a = -1;

    /* renamed from: a */
    public final List<String> mo58444a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.f59168a != i) {
            this.f59168a = i;
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            } catch (Throwable unused) {
                throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
            }
        }
    }
}
