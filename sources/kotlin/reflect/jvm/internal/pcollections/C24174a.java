package kotlin.reflect.jvm.internal.pcollections;

import java.util.NoSuchElementException;
import sh0.C24882a;
import sh0.C24884b;
import sh0.C24885c;

/* renamed from: kotlin.reflect.jvm.internal.pcollections.a */
public final class C24174a<K, V> {

    /* renamed from: c */
    public static final C24174a<Object, Object> f61400c = new C24174a<>(C24885c.f62928b, 0);

    /* renamed from: a */
    public final C24885c<C24882a<MapEntry<K, V>>> f61401a;

    /* renamed from: b */
    public final int f61402b;

    public C24174a(C24885c<C24882a<MapEntry<K, V>>> cVar, int i) {
        this.f61401a = cVar;
        this.f61402b = i;
    }

    /* renamed from: a */
    public final Object mo60280a(String str) {
        C24882a aVar = (C24882a) this.f61401a.f62929a.mo61358a((long) str.hashCode());
        if (aVar == null) {
            aVar = C24882a.f62917e;
        }
        while (aVar != null && aVar.f62920d > 0) {
            MapEntry mapEntry = (MapEntry) aVar.f62918b;
            if (mapEntry.key.equals(str)) {
                return mapEntry.value;
            }
            aVar = aVar.f62919c;
        }
        return null;
    }

    /* renamed from: b */
    public final C24174a mo60281b(String str, Object obj) {
        C24882a<Object> aVar = (C24882a) this.f61401a.f62929a.mo61358a((long) str.hashCode());
        if (aVar == null) {
            aVar = C24882a.f62917e;
        }
        int i = aVar.f62920d;
        int i2 = 0;
        C24882a aVar2 = aVar;
        while (true) {
            if (aVar2 == null || aVar2.f62920d <= 0) {
                i2 = -1;
            } else if (((MapEntry) aVar2.f62918b).key.equals(str)) {
                break;
            } else {
                aVar2 = aVar2.f62919c;
                i2++;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            if (i2 < 0 || i2 > aVar.f62920d) {
                throw new IndexOutOfBoundsException();
            }
            try {
                aVar = aVar.mo61354a(aVar.mo61355d(i2).f62918b);
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException(C16759e.m42349e("Index: ", i2));
            }
        }
        MapEntry mapEntry = new MapEntry(str, obj);
        aVar.getClass();
        C24882a aVar3 = new C24882a(mapEntry, aVar);
        C24885c<C24882a<MapEntry<K, V>>> cVar = this.f61401a;
        C24884b<V> b = cVar.f62929a.mo61359b((long) str.hashCode(), aVar3);
        if (b != cVar.f62929a) {
            cVar = new C24885c<>(b);
        }
        return new C24174a(cVar, (this.f61402b - i) + aVar3.f62920d);
    }
}
