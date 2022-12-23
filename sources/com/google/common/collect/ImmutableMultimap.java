package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class ImmutableMultimap<K, V> extends C14393f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f36216e;

    /* renamed from: f */
    public final transient int f36217f;

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        public final transient ImmutableMultimap<K, V> f36218c;

        public Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f36218c = immutableMultimap;
        }

        public final boolean contains(Object obj) {
            return this.f36218c.mo43159c(obj);
        }

        /* renamed from: i */
        public final int mo43100i(int i, Object[] objArr) {
            C14439w0<? extends ImmutableCollection<V>> u = this.f36218c.f36216e.values().iterator();
            while (u.hasNext()) {
                i = ((ImmutableCollection) u.next()).mo43100i(i, objArr);
            }
            return i;
        }

        /* renamed from: s */
        public final boolean mo43086s() {
            return true;
        }

        public final int size() {
            return this.f36218c.f36217f;
        }

        /* renamed from: u */
        public final C14439w0<V> iterator() {
            ImmutableMultimap<K, V> immutableMultimap = this.f36218c;
            immutableMultimap.getClass();
            return new C14438w(immutableMultimap);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$a */
    public static class C14373a<K, V> {

        /* renamed from: a */
        public final LinkedHashMap f36219a = new LinkedHashMap();

        public C14373a() {
            int i = C14419o0.f36309a;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$b */
    public static class C14374b {

        /* renamed from: a */
        public static final C14425q0<ImmutableMultimap> f36220a = new C14425q0<>(ImmutableMultimap.class.getDeclaredField("map"));

        /* renamed from: b */
        public static final C14425q0<ImmutableMultimap> f36221b = new C14425q0<>(ImmutableMultimap.class.getDeclaredField("size"));

        static {
            try {
                try {
                } catch (NoSuchFieldException e) {
                    throw new AssertionError(e);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.f36216e = immutableMap;
        this.f36217f = i;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo42963a(Double d, Integer num) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Map mo42964b() {
        return this.f36216e;
    }

    /* renamed from: c */
    public final boolean mo43159c(Object obj) {
        return obj != null && super.mo43159c(obj);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final Map<K, Collection<V>> mo43160d() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: e */
    public final Set<K> mo43161e() {
        throw new AssertionError("unreachable");
    }

    /* renamed from: f */
    public final Iterator mo42967f() {
        return new C14438w(this);
    }

    /* renamed from: h */
    public final Collection mo43162h() {
        return new Values(this);
    }

    public final int size() {
        return this.f36217f;
    }

    public final Collection values() {
        Collection<V> collection = this.f36271c;
        if (collection == null) {
            collection = mo43162h();
            this.f36271c = collection;
        }
        return (ImmutableCollection) collection;
    }
}
