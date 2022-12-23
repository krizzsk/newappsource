package com.umo.ads.p347l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;

/* renamed from: com.umo.ads.l.zze */
public final class zze extends zzc {

    /* renamed from: b */
    public final C12092a f30831b;

    /* renamed from: c */
    public int f30832c = -1;

    /* renamed from: com.umo.ads.l.zze$a */
    public interface C12092a {
        void zza();
    }

    public zze(Activity activity, C12092a aVar) {
        super(activity, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        this.f30831b = aVar;
    }

    public final void onReceive(Context context, Intent intent) {
        int intValue;
        WindowManager windowManager;
        Display display;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(intent, "intent");
        if (C24362h.m61206a("android.intent.action.CONFIGURATION_CHANGED", intent.getAction())) {
            Integer num = null;
            if (Build.VERSION.SDK_INT >= 30) {
                Display c = context.getDisplay();
                if (c != null) {
                    num = Integer.valueOf(c.getRotation());
                }
            } else {
                Object systemService = context.getSystemService("window");
                if (systemService instanceof WindowManager) {
                    windowManager = (WindowManager) systemService;
                } else {
                    windowManager = null;
                }
                if (windowManager == null) {
                    display = null;
                } else {
                    display = windowManager.getDefaultDisplay();
                }
                if (display != null) {
                    num = Integer.valueOf(display.getRotation());
                }
            }
            if (num != null && (intValue = num.intValue()) != this.f30832c) {
                this.f30832c = intValue;
                C12092a aVar = this.f30831b;
                if (aVar != null) {
                    aVar.zza();
                }
            }
        }
    }
}
