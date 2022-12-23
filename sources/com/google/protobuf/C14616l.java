package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.protobuf.l */
public final class C14616l extends C14619m {

    /* renamed from: com.google.protobuf.l$a */
    public static class C14617a<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, C14616l> f36863b;

        public C14617a() {
            throw null;
        }

        public C14617a(Map.Entry entry) {
            this.f36863b = entry;
        }

        public final K getKey() {
            return this.f36863b.getKey();
        }

        public final Object getValue() {
            C14616l value = this.f36863b.getValue();
            if (value == null) {
                return null;
            }
            return value.mo44103a((C14629t) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof C14629t) {
                C14616l value = this.f36863b.getValue();
                C14629t tVar = value.f36865a;
                value.f36866b = null;
                value.f36865a = (C14629t) obj;
                return tVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.protobuf.l$b */
    public static class C14618b<K> implements Iterator<Map.Entry<K, Object>>, p988j$.util.Iterator {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f36864b;

        public C14618b(Iterator<Map.Entry<K, Object>> it) {
            this.f36864b = it;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f36864b.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f36864b.next();
            if (next.getValue() instanceof C14616l) {
                return new C14617a(next);
            }
            return next;
        }

        public final void remove() {
            this.f36864b.remove();
        }
    }

    public final boolean equals(Object obj) {
        return mo44103a((C14629t) null).equals(obj);
    }

    public final int hashCode() {
        return mo44103a((C14629t) null).hashCode();
    }

    public final String toString() {
        return mo44103a((C14629t) null).toString();
    }
}
