package qg0;

import com.google.android.play.core.assetpacks.C14256d1;
import eg0.C23295e;
import hh0.C23489d;
import hh0.C23490e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C23978a;
import mf0.C24362h;
import ug0.C25065b;

/* renamed from: qg0.f */
public final class C24745f implements C23490e {

    /* renamed from: a */
    public final C24753j f62642a;

    /* renamed from: b */
    public final C23978a f62643b;

    public C24745f(C23295e eVar, C23978a aVar) {
        this.f62642a = eVar;
        this.f62643b = aVar;
    }

    /* renamed from: a */
    public final C23489d mo58605a(C25065b bVar) {
        C24362h.m61211f(bVar, "classId");
        C24757k b = C14256d1.m35484b(this.f62642a, bVar);
        if (b == null) {
            return null;
        }
        C24362h.m61206a(b.mo58421d(), bVar);
        return this.f62643b.mo59588f(b);
    }
}
