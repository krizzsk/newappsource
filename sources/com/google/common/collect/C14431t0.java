package com.google.common.collect;

import com.google.common.collect.C14433u0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p988j$.util.Collection;
import p988j$.util.stream.Stream;

/* renamed from: com.google.common.collect.t0 */
public final class C14431t0 extends C14433u0.C14435b<Object> {

    /* renamed from: b */
    public final /* synthetic */ Set f36322b;

    /* renamed from: c */
    public final /* synthetic */ Set f36323c;

    public C14431t0(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.f36322b = immutableSet;
        this.f36323c = immutableSet2;
    }

    public final boolean contains(Object obj) {
        return this.f36322b.contains(obj) && this.f36323c.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f36322b.containsAll(collection) && this.f36323c.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.f36323c, this.f36322b);
    }

    public final Iterator iterator() {
        return new C14429s0(this);
    }

    public final Stream<Object> parallelStream() {
        Stream parallelStream = Collection.EL.parallelStream(this.f36322b);
        Set set = this.f36323c;
        Objects.requireNonNull(set);
        return parallelStream.filter(new C14427r0(set));
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f36322b) {
            if (this.f36323c.contains(contains)) {
                i++;
            }
        }
        return i;
    }

    public final Stream<Object> stream() {
        Stream stream = Collection.EL.stream(this.f36322b);
        Set set = this.f36323c;
        Objects.requireNonNull(set);
        return stream.filter(new C14427r0(set));
    }
}
