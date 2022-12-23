package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import p583jk.C17884p;
import p988j$.util.Map;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {

    /* renamed from: c */
    public static final /* synthetic */ int f36214c = 0;
    /* access modifiers changed from: private */
    public final ImmutableMap<K, V> map;

    /* renamed from: com.google.common.collect.ImmutableMapValues$a */
    public class C14372a extends C14439w0<V> {

        /* renamed from: b */
        public final C14439w0<Map.Entry<K, V>> f36215b;

        public C14372a(ImmutableMapValues immutableMapValues) {
            this.f36215b = immutableMapValues.map.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.f36215b.hasNext();
        }

        public final V next() {
            return this.f36215b.next().getValue();
        }
    }

    public ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public final boolean contains(Object obj) {
        boolean z;
        if (obj != null) {
            C14372a aVar = new C14372a(this);
            while (true) {
                if (aVar.hasNext()) {
                    if (obj.equals(aVar.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final ImmutableList<V> mo43098e() {
        final ImmutableList<Map.Entry<K, V>> e = this.map.entrySet().mo43098e();
        return new ImmutableAsList<V>() {
            /* renamed from: I */
            public final ImmutableCollection<V> mo43084I() {
                return ImmutableMapValues.this;
            }

            public final V get(int i) {
                return ((Map.Entry) e.get(i)).getValue();
            }
        };
    }

    public final void forEach(Consumer<? super V> consumer) {
        C17884p.m44373l(consumer);
        Map.EL.forEach(this.map, new C14436v(consumer));
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final Iterator iterator() {
        return new C14372a(this);
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        return true;
    }

    public final int size() {
        return this.map.size();
    }

    public final Spliterator<V> spliterator() {
        return C14415o.m35877c(this.map.entrySet().spliterator(), new C14432u());
    }

    /* renamed from: u */
    public final C14439w0<V> mo43108u() {
        return new C14372a(this);
    }
}
