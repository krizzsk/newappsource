package androidx.camera.core.impl;

import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p054d0.C4289j0;

/* renamed from: androidx.camera.core.impl.q */
public final class C0593q {

    /* renamed from: a */
    public final LinkedHashMap f2020a = new LinkedHashMap();

    /* renamed from: androidx.camera.core.impl.q$a */
    public static final class C0594a {

        /* renamed from: a */
        public final SessionConfig f2021a;

        /* renamed from: b */
        public boolean f2022b = false;

        /* renamed from: c */
        public boolean f2023c = false;

        public C0594a(SessionConfig sessionConfig) {
            this.f2021a = sessionConfig;
        }
    }

    public C0593q(String str) {
    }

    /* renamed from: a */
    public final SessionConfig.C0569e mo2504a() {
        SessionConfig.C0569e eVar = new SessionConfig.C0569e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2020a.entrySet()) {
            C0594a aVar = (C0594a) entry.getValue();
            if (aVar.f2022b) {
                eVar.mo2463a(aVar.f2021a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        C4289j0.m11435b("UseCaseAttachState");
        return eVar;
    }

    /* renamed from: b */
    public final Collection<SessionConfig> mo2505b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2020a.entrySet()) {
            if (((C0594a) entry.getValue()).f2022b) {
                arrayList.add(((C0594a) entry.getValue()).f2021a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: c */
    public final void mo2506c(String str) {
        if (this.f2020a.containsKey(str)) {
            C0594a aVar = (C0594a) this.f2020a.get(str);
            aVar.f2023c = false;
            if (!aVar.f2022b) {
                this.f2020a.remove(str);
            }
        }
    }

    /* renamed from: d */
    public final void mo2507d(String str, SessionConfig sessionConfig) {
        if (this.f2020a.containsKey(str)) {
            C0594a aVar = new C0594a(sessionConfig);
            C0594a aVar2 = (C0594a) this.f2020a.get(str);
            aVar.f2022b = aVar2.f2022b;
            aVar.f2023c = aVar2.f2023c;
            this.f2020a.put(str, aVar);
        }
    }
}
