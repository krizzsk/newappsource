package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24225a;

/* renamed from: kotlin.reflect.jvm.internal.impl.storage.a */
public final class C24150a extends LockBasedStorageManager.C24145h<Object> {

    /* renamed from: e */
    public final /* synthetic */ Object f61326e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24150a(LockBasedStorageManager lockBasedStorageManager, C24225a aVar, EmptyList emptyList) {
        super(lockBasedStorageManager, aVar);
        this.f61326e = emptyList;
    }

    /* renamed from: d */
    public final LockBasedStorageManager.C24149l<Object> mo60227d(boolean z) {
        return new LockBasedStorageManager.C24149l<>(this.f61326e, false);
    }
}
