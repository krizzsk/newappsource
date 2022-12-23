package p066e0;

import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0574c;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.Config;
import java.util.Set;
import p032c0.C1754d;
import p358af.C13437d;

/* renamed from: e0.j */
public final class C4434j {

    /* renamed from: a */
    public static final C4435a f15499a = new C4435a();

    /* renamed from: e0.j$a */
    public static final class C4435a implements C0574c {

        /* renamed from: x */
        public final C4416b f15500x = new C4416b(new Object());

        /* renamed from: a */
        public final Object mo2422a(Config.C0564a aVar) {
            return ((C0590n) getConfig()).mo2422a(aVar);
        }

        /* renamed from: b */
        public final Object mo2423b(Config.C0564a aVar, Object obj) {
            return ((C0590n) getConfig()).mo2423b(aVar, obj);
        }

        /* renamed from: c */
        public final Config.OptionPriority mo2424c(Config.C0564a aVar) {
            return ((C0590n) getConfig()).mo2424c(aVar);
        }

        /* renamed from: e */
        public final /* synthetic */ boolean mo2425e(Config.C0564a aVar) {
            return C13437d.m33696a(this, (C0572a) aVar);
        }

        /* renamed from: f */
        public final Object mo2426f(Config.C0564a aVar, Config.OptionPriority optionPriority) {
            return ((C0590n) getConfig()).mo2426f(aVar, optionPriority);
        }

        public final Config getConfig() {
            return C0590n.f2014z;
        }

        /* renamed from: h */
        public final Set mo2429h(Config.C0564a aVar) {
            return ((C0590n) getConfig()).mo2429h(aVar);
        }

        /* renamed from: l */
        public final /* synthetic */ void mo2430l(C1754d dVar) {
            C13437d.m33697b(this, dVar);
        }

        public final Set listOptions() {
            return ((C0590n) getConfig()).listOptions();
        }
    }
}
