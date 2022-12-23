package kotlin.reflect.jvm.internal.impl.types;

import kh0.C23789e;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24225a;
import lh0.C24307v;
import lh0.C24308v0;
import mf0.C24362h;
import mh0.C24378d;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.a */
public final class C24162a extends C24308v0 {

    /* renamed from: c */
    public final C23792h f61356c;

    /* renamed from: d */
    public final C24225a<C24307v> f61357d;

    /* renamed from: e */
    public final C23789e<C24307v> f61358e;

    public C24162a(C23792h hVar, C24225a<? extends C24307v> aVar) {
        C24362h.m61211f(hVar, "storageManager");
        this.f61356c = hVar;
        this.f61357d = aVar;
        this.f61358e = hVar.mo59019d(aVar);
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new C24162a(this.f61356c, new LazyWrappedType$refine$1(dVar, this));
    }

    /* renamed from: S0 */
    public final C24307v mo60256S0() {
        return (C24307v) this.f61358e.invoke();
    }

    /* renamed from: T0 */
    public final boolean mo60257T0() {
        return ((LockBasedStorageManager.C24143f) this.f61358e).mo60225b();
    }
}
