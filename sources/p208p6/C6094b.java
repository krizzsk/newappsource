package p208p6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import org.json.JSONObject;
import p025b6.C1492e;
import p060d6.C4397l;
import p072e6.C4566d;
import p146k6.C5498d;
import p195o6.C5998c;
import p229r1.C6235e;
import p406cg.C13815e;
import p531he.C17390b0;
import p609km.C18097c;
import p625le.C18199a;
import p696oe.C18737g;

/* renamed from: p6.b */
public final class C6094b implements C6095c {

    /* renamed from: b */
    public final Object f19354b;

    /* renamed from: c */
    public final Object f19355c;

    /* renamed from: d */
    public final Object f19356d;

    public /* synthetic */ C6094b(Object obj, Object obj2, Object obj3) {
        this.f19354b = obj;
        this.f19355c = obj2;
        this.f19356d = obj3;
    }

    /* renamed from: a */
    public static void m14627a(C18199a aVar, C18737g gVar) {
        m14628b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.f47650a);
        m14628b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        m14628b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.13");
        m14628b(aVar, HttpHeader.ACCEPT, "application/json");
        m14628b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f47651b);
        m14628b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.f47652c);
        m14628b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f47653d);
        m14628b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((C17390b0) gVar.f47654e).mo49864c());
    }

    /* renamed from: b */
    public static void m14628b(C18199a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f46449c.put(str, str2);
        }
    }

    /* renamed from: c */
    public static HashMap m14629c(C18737g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f47657h);
        hashMap.put("display_version", gVar.f47656g);
        hashMap.put("source", Integer.toString(gVar.f47658i));
        String str = gVar.f47655f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: d */
    public final JSONObject mo22064d(C6235e eVar) {
        boolean z;
        int i = eVar.f19681a;
        ((C18097c) this.f19356d).getClass();
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                return new JSONObject((String) eVar.f19682b);
            } catch (Exception unused) {
                ((C18097c) this.f19356d).getClass();
                ((C18097c) this.f19356d).getClass();
                return null;
            }
        } else {
            ((C18097c) this.f19356d).getClass();
            return null;
        }
    }

    /* renamed from: h */
    public final C4397l mo20049h(C4397l lVar, C1492e eVar) {
        Drawable drawable = (Drawable) lVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C6095c) this.f19355c).mo20049h(C5498d.m13681c(((BitmapDrawable) drawable).getBitmap(), (C4566d) this.f19354b), eVar);
        }
        if (drawable instanceof C5998c) {
            return ((C6095c) this.f19356d).mo20049h(lVar, eVar);
        }
        return null;
    }

    public /* synthetic */ C6094b(String str, C13815e eVar) {
        C18097c cVar = C18097c.f46262b;
        if (str != null) {
            this.f19356d = cVar;
            this.f19355c = eVar;
            this.f19354b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
