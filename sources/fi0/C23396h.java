package fi0;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ei0.C23314a;
import java.util.ArrayList;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: fi0.h */
public final class C23396h implements C23314a {
    /* renamed from: a */
    public final List<String> mo58444a() {
        return new ArrayList(0);
    }

    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
    }
}
