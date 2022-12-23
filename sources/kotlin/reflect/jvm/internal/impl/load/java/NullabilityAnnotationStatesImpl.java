package kotlin.reflect.jvm.internal.impl.load.java;

import hg0.C23482r;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import ug0.C25066c;

public final class NullabilityAnnotationStatesImpl<T> implements C23482r<T> {

    /* renamed from: b */
    public final Map<C25066c, T> f60557b;

    /* renamed from: c */
    public final LockBasedStorageManager.C24147j f60558c = new LockBasedStorageManager("Java nullability annotation states").mo59016a(new NullabilityAnnotationStatesImpl$cache$1(this));

    public NullabilityAnnotationStatesImpl(Map<C25066c, ? extends T> map) {
        this.f60557b = map;
    }
}
