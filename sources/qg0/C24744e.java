package qg0;

import ag0.C20986c;
import eg0.C23295e;
import hh0.C23487c;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mf0.C24362h;
import ug0.C25065b;
import zf0.C25435d0;
import zf0.C25485t;
import zg0.C25498g;

/* renamed from: qg0.e */
public final class C24744e extends AbstractBinaryClassAnnotationAndConstantLoader<C20986c, C25498g<?>> {

    /* renamed from: c */
    public final C25485t f62639c;

    /* renamed from: d */
    public final NotFoundClasses f62640d;

    /* renamed from: e */
    public final C23487c f62641e;

    public C24744e(C23909c cVar, NotFoundClasses notFoundClasses, LockBasedStorageManager lockBasedStorageManager, C23295e eVar) {
        super(lockBasedStorageManager, eVar);
        this.f62639c = cVar;
        this.f62640d = notFoundClasses;
        this.f62641e = new C23487c(cVar, notFoundClasses);
    }

    /* renamed from: r */
    public final C24741d mo59581r(C25065b bVar, C25435d0 d0Var, List list) {
        C24362h.m61211f(list, "result");
        return new C24741d(this, FindClassInModuleKt.m58737c(this.f62639c, bVar, this.f62640d), d0Var, list);
    }
}
