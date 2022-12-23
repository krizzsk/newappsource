package p032c0;

import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0588l;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0592p;
import androidx.camera.core.impl.Config;
import java.util.Set;
import p054d0.C4307s;

/* renamed from: c0.e */
public class C1755e implements C0592p {

    /* renamed from: x */
    public final Config f6156x;

    /* renamed from: c0.e$a */
    public static final class C1756a implements C4307s<C1755e> {

        /* renamed from: a */
        public final C0589m f6157a = C0589m.m1674t();

        /* renamed from: b */
        public static C1756a m5005b(Config config) {
            C1756a aVar = new C1756a();
            config.mo2430l(new C1754d(0, aVar, config));
            return aVar;
        }

        /* renamed from: a */
        public final C1755e mo6514a() {
            return new C1755e(C0590n.m1678s(this.f6157a));
        }

        public final C0588l getMutableConfig() {
            throw null;
        }
    }

    public C1755e(Config config) {
        this.f6156x = config;
    }

    /* renamed from: a */
    public final Object mo2422a(Config.C0564a aVar) {
        return getConfig().mo2422a(aVar);
    }

    /* renamed from: b */
    public final Object mo2423b(Config.C0564a aVar, Object obj) {
        return getConfig().mo2423b(aVar, obj);
    }

    /* renamed from: c */
    public final Config.OptionPriority mo2424c(Config.C0564a aVar) {
        return getConfig().mo2424c(aVar);
    }

    /* renamed from: e */
    public final boolean mo2425e(Config.C0564a aVar) {
        return getConfig().mo2425e((C0572a) aVar);
    }

    /* renamed from: f */
    public final Object mo2426f(Config.C0564a aVar, Config.OptionPriority optionPriority) {
        return getConfig().mo2426f(aVar, optionPriority);
    }

    public final Config getConfig() {
        return this.f6156x;
    }

    /* renamed from: h */
    public final Set mo2429h(Config.C0564a aVar) {
        return getConfig().mo2429h(aVar);
    }

    /* renamed from: l */
    public final void mo2430l(C1754d dVar) {
        getConfig().mo2430l(dVar);
    }

    public final Set listOptions() {
        return getConfig().listOptions();
    }
}
