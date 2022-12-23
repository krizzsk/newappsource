package p159l8;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23825c;
import mf0.C24362h;
import org.json.JSONArray;
import p009a8.C0115o;
import p097g8.C4845a;
import p262t8.C6606a;

/* renamed from: l8.b */
public final class C5640b {

    /* renamed from: a */
    public static final C5640b f18390a = new C5640b();

    /* renamed from: a */
    public static final Bundle m13921a(RemoteServiceWrapper.EventType eventType, String str, List<AppEvent> list) {
        Class<C5640b> cls = C5640b.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(eventType, "eventType");
            C24362h.m61211f(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b = f18390a.mo21499b(str, list);
                if (b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b.toString());
            }
            return bundle;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final JSONArray mo21499b(String str, List list) {
        JSONArray jSONArray;
        ArrayList L0;
        boolean z;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            jSONArray = new JSONArray();
            L0 = C23825c.m58500L0(list);
            C4845a.m12166b(L0);
            z = false;
            if (!C6606a.m15601b(this)) {
                C2429s f = FetchedAppSettingsManager.m6264f(str, false);
                if (f != null) {
                    z = f.f8708a;
                }
            }
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            AppEvent appEvent = (AppEvent) it.next();
            if (!appEvent.mo12455d()) {
                C2397f0 f0Var = C2397f0.f8630a;
                C24362h.m61216k(appEvent, "Event with invalid checksum: ");
                C0115o oVar = C0115o.f331a;
            } else if ((!appEvent.mo12456e()) || (appEvent.mo12456e() && z)) {
                jSONArray.put(appEvent.mo12453b());
            }
        }
        return jSONArray;
    }
}
