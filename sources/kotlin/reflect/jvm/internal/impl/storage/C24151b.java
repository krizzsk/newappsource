package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24225a;
import lf0.C24236l;

/* renamed from: kotlin.reflect.jvm.internal.impl.storage.b */
public final class C24151b extends LockBasedStorageManager.C24146i<Object> {

    /* renamed from: f */
    public final /* synthetic */ C24236l f61327f;

    /* renamed from: g */
    public final /* synthetic */ C24236l f61328g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24151b(LockBasedStorageManager lockBasedStorageManager, C24225a aVar, C24236l lVar, C24236l lVar2) {
        super(lockBasedStorageManager, aVar);
        this.f61327f = lVar;
        this.f61328g = lVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m60454a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 2 ? 2 : 3)];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: d */
    public final LockBasedStorageManager.C24149l<Object> mo60227d(boolean z) {
        C24236l lVar = this.f61327f;
        if (lVar != null) {
            return new LockBasedStorageManager.C24149l<>(lVar.invoke(Boolean.valueOf(z)), false);
        }
        LockBasedStorageManager.C24149l<Object> d = super.mo60227d(z);
        if (d != null) {
            return d;
        }
        m60454a(0);
        throw null;
    }
}
