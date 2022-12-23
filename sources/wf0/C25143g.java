package wf0;

import cg0.C21177j;
import cg0.C21180k0;
import cg0.C21187p;
import cg0.C21201z;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24264f;
import lh0.C24289p;
import p583jk.C17875h;
import ug0.C25069e;
import zf0.C25430b;
import zf0.C25455m;

/* renamed from: wf0.g */
public final class C25143g {

    /* renamed from: a */
    public static final C21201z f63418a;

    static {
        C21187p pVar = new C21187p(C24289p.f61585a, C23872e.f60324c);
        ClassKind classKind = ClassKind.INTERFACE;
        C25069e f = C23872e.f60325d.mo61585f();
        LockBasedStorageManager.C24137a aVar = LockBasedStorageManager.f61310e;
        C21201z zVar = new C21201z(pVar, classKind, f, aVar);
        Modality modality = Modality.ABSTRACT;
        if (modality != null) {
            zVar.f53129k = modality;
            C25455m.C25463h hVar = C25455m.f63744e;
            if (hVar != null) {
                zVar.f53130l = hVar;
                List D = C17875h.m44280D(C21180k0.m49655R0(zVar, Variance.IN_VARIANCE, C25069e.m62820i(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, aVar));
                if (zVar.f53132n == null) {
                    ArrayList arrayList = new ArrayList(D);
                    zVar.f53132n = arrayList;
                    zVar.f53131m = new C24264f(zVar, arrayList, zVar.f53133o, zVar.f53134p);
                    Set<C25430b> emptySet = Collections.emptySet();
                    if (emptySet != null) {
                        for (C25430b bVar : emptySet) {
                            ((C21177j) bVar).mo59453V0(zVar.mo53412q());
                        }
                        f63418a = zVar;
                        return;
                    }
                    C21201z.m49784W(13);
                    throw null;
                }
                StringBuilder k = C13555b.m33972k("Type parameters are already set for ");
                k.append(zVar.getName());
                throw new IllegalStateException(k.toString());
            }
            C21201z.m49784W(9);
            throw null;
        }
        C21201z.m49784W(6);
        throw null;
    }
}
