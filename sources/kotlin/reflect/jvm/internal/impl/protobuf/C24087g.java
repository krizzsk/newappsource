package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;
import vg0.C25094b;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
public final class C24087g extends C25094b {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$a */
    public static class C24088a<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, C24087g> f61088b;

        public C24088a(Map.Entry entry) {
            this.f61088b = entry;
        }

        public final K getKey() {
            return this.f61088b.getKey();
        }

        public final Object getValue() {
            C24087g value = this.f61088b.getValue();
            if (value == null) {
                return null;
            }
            return value.mo60048a();
        }

        public final Object setValue(Object obj) {
            if (obj instanceof C24090h) {
                C24087g value = this.f61088b.getValue();
                C24090h hVar = value.f63306b;
                value.f63306b = (C24090h) obj;
                value.f63305a = true;
                return hVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    public static class C24089b<K> implements Iterator<Map.Entry<K, Object>>, p988j$.util.Iterator {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f61089b;

        public C24089b(Iterator<Map.Entry<K, Object>> it) {
            this.f61089b = it;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f61089b.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f61089b.next();
            if (next.getValue() instanceof C24087g) {
                return new C24088a(next);
            }
            return next;
        }

        public final void remove() {
            this.f61089b.remove();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.protobuf.C24090h mo60048a() {
        /*
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.h r0 = r1.f63306b
            if (r0 == 0) goto L_0x0005
            goto L_0x0010
        L_0x0005:
            monitor-enter(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.h r0 = r1.f63306b     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0010
        L_0x000c:
            r0 = 0
            r1.f63306b = r0     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
        L_0x0010:
            kotlin.reflect.jvm.internal.impl.protobuf.h r0 = r1.f63306b
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C24087g.mo60048a():kotlin.reflect.jvm.internal.impl.protobuf.h");
    }

    public final boolean equals(Object obj) {
        return mo60048a().equals(obj);
    }

    public final int hashCode() {
        return mo60048a().hashCode();
    }

    public final String toString() {
        return mo60048a().toString();
    }
}
