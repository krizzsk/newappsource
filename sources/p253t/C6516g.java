package p253t;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import p000a.C0003b;

/* renamed from: t.g */
public class C6516g {

    /* renamed from: a */
    public final C0003b f20315a;

    /* renamed from: b */
    public final ComponentName f20316b;

    public C6516g(C0003b bVar, ComponentName componentName) {
        this.f20315a = bVar;
        this.f20316b = componentName;
    }

    /* renamed from: a */
    public static boolean m15440a(Context context, String str, C6520j jVar) {
        jVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, jVar, 33);
    }
}
