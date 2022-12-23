package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import bf0.C21048b;
import com.facebook.appevents.C2341k;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.C14458a;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0112l;
import p009a8.C0114n;
import p394br.C13660f;
import p404ce.C13784b;
import p404ce.C13800m;
import p743qd.C19107d;
import p838uf.C19902d;
import p838uf.C19904f;
import p838uf.C19906g;
import p909xe.C20468e;
import p909xe.C20469f;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: a */
    public static /* synthetic */ String m35902a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        return String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: b */
    public static String m35903b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List<C13784b<?>> getComponents() {
        String str;
        Class<C19906g> cls = C19906g.class;
        ArrayList arrayList = new ArrayList();
        C13784b.C13785a<C19906g> a = C13784b.m34444a(cls);
        a.mo40715a(new C13800m(2, 0, C19902d.class));
        a.f33944e = new C13555b();
        arrayList.add(a.mo40716b());
        C13784b.C13785a aVar = new C13784b.C13785a(C14458a.class, new Class[]{C20469f.class, HeartBeatInfo.class});
        aVar.mo40715a(new C13800m(1, 0, Context.class));
        aVar.mo40715a(new C13800m(1, 0, C19107d.class));
        aVar.mo40715a(new C13800m(2, 0, C20468e.class));
        aVar.mo40715a(new C13800m(1, 1, cls));
        aVar.f33944e = new C25541a();
        arrayList.add(aVar.mo40716b());
        arrayList.add(C19904f.m47417a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C19904f.m47417a("fire-core", "20.1.2"));
        arrayList.add(C19904f.m47417a("device-name", m35903b(Build.PRODUCT)));
        arrayList.add(C19904f.m47417a("device-model", m35903b(Build.DEVICE)));
        arrayList.add(C19904f.m47417a("device-brand", m35903b(Build.BRAND)));
        arrayList.add(C19904f.m47418b("android-target-sdk", new C0112l(9)));
        arrayList.add(C19904f.m47418b("android-min-sdk", new C2341k(4)));
        arrayList.add(C19904f.m47418b("android-platform", new C0114n(9)));
        arrayList.add(C19904f.m47418b("android-installer", new C13660f(5)));
        try {
            str = C21048b.f52851f.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(C19904f.m47417a("kotlin", str));
        }
        return arrayList;
    }
}
