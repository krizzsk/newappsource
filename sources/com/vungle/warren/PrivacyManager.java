package com.vungle.warren;

import ce0.C21102g;
import ce0.C21120u;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import od0.C24545c;
import od0.C24554e;
import od0.C24559j;

public final class PrivacyManager {

    /* renamed from: c */
    public static final AtomicReference<Boolean> f58508c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<Boolean> f58509d = new AtomicReference<>();

    /* renamed from: e */
    public static PrivacyManager f58510e;

    /* renamed from: a */
    public C23192a f58511a;

    /* renamed from: b */
    public ExecutorService f58512b;

    public enum COPPA {
        COPPA_ENABLED(Boolean.TRUE),
        COPPA_DISABLED(Boolean.FALSE),
        COPPA_NOTSET((String) null);
        
        private Boolean value;

        private COPPA(Boolean bool) {
            this.value = bool;
        }

        public boolean getValue() {
            Boolean bool = this.value;
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }
    }

    /* renamed from: a */
    public static COPPA m57003a() {
        AtomicReference<Boolean> atomicReference = f58508c;
        if (atomicReference == null || atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (atomicReference.get().booleanValue()) {
            return COPPA.COPPA_ENABLED;
        }
        if (!atomicReference.get().booleanValue()) {
            return COPPA.COPPA_DISABLED;
        }
        return COPPA.COPPA_NOTSET;
    }

    /* renamed from: b */
    public static synchronized PrivacyManager m57004b() {
        PrivacyManager privacyManager;
        synchronized (PrivacyManager.class) {
            if (f58510e == null) {
                f58510e = new PrivacyManager();
            }
            privacyManager = f58510e;
        }
        return privacyManager;
    }

    /* renamed from: d */
    public static boolean m57005d() {
        AtomicReference<Boolean> atomicReference = f58509d;
        if (atomicReference == null || atomicReference.get() == null) {
            return false;
        }
        return !atomicReference.get().booleanValue();
    }

    /* renamed from: c */
    public final synchronized void mo58051c(C21120u uVar, C23192a aVar) {
        Boolean bool;
        ExecutorService executorService;
        this.f58511a = aVar;
        this.f58512b = uVar;
        int i = C21102g.f52949a;
        C24559j jVar = (C24559j) aVar.mo58281p(C24559j.class, "coppa_cookie").get();
        if (jVar != null) {
            bool = jVar.f62246b.get("is_coppa");
        } else {
            bool = null;
        }
        AtomicReference<Boolean> atomicReference = f58508c;
        if (atomicReference.get() != null) {
            Boolean bool2 = atomicReference.get();
            if (bool2 != null) {
                atomicReference.set(bool2);
                if (!(this.f58511a == null || (executorService = this.f58512b) == null)) {
                    executorService.execute(new C23168j0(this, bool2));
                }
            }
        } else if (bool != null) {
            atomicReference.set(bool);
        }
    }

    /* renamed from: e */
    public final void mo58052e(boolean z) {
        Boolean bool;
        Class<C24559j> cls = C24559j.class;
        f58509d.set(Boolean.valueOf(z));
        C23192a aVar = this.f58511a;
        if (aVar != null) {
            int i = C21102g.f52949a;
            C24559j jVar = (C24559j) aVar.mo58281p(cls, "coppa_cookie").get();
            if (jVar != null) {
                bool = jVar.f62246b.get("disable_ad_id");
            } else {
                bool = null;
            }
            if ((bool == null || !bool.booleanValue()) && z) {
                this.f58511a.mo58273h(C24545c.class);
                this.f58511a.mo58273h(C24554e.class);
            }
            C23192a aVar2 = this.f58511a;
            Boolean valueOf = Boolean.valueOf(z);
            C24559j jVar2 = (C24559j) aVar2.mo58281p(cls, "coppa_cookie").get();
            if (jVar2 == null) {
                jVar2 = new C24559j("coppa_cookie");
            }
            jVar2.mo60827d(valueOf, "disable_ad_id");
            try {
                aVar2.mo58288w(jVar2);
            } catch (DatabaseHelper.DBException unused) {
            }
        }
    }
}
