package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c0 */
public class C3483c0 extends C3488d0 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.c0$a */
    public static class C3484a<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C3483c0> f12406a;

        public C3484a(Map.Entry<K, C3483c0> entry) {
            this.f12406a = entry;
        }

        public K getKey() {
            return this.f12406a.getKey();
        }

        public Object getValue() {
            C3483c0 value = this.f12406a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo14815a((C3564q0) null);
        }

        public Object setValue(Object obj) {
            if (obj instanceof C3564q0) {
                C3483c0 value = this.f12406a.getValue();
                C3564q0 q0Var = value.f12413a;
                value.f12414b = null;
                value.f12413a = (C3564q0) obj;
                return q0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.c0$b */
    public static class C3485b<K> implements Iterator<Map.Entry<K, Object>>, p988j$.util.Iterator {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f12407a;

        public C3485b(Iterator<Map.Entry<K, Object>> it) {
            this.f12407a = it;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public boolean hasNext() {
            return this.f12407a.hasNext();
        }

        public Object next() {
            Map.Entry next = this.f12407a.next();
            if (next.getValue() instanceof C3483c0) {
                return new C3484a(next);
            }
            return next;
        }

        public void remove() {
            this.f12407a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo14815a((C3564q0) null).equals(obj);
    }

    public int hashCode() {
        return mo14815a((C3564q0) null).hashCode();
    }

    public String toString() {
        return mo14815a((C3564q0) null).toString();
    }
}
