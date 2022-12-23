package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.p1 */
public class C3559p1 extends AbstractList<String> implements C3497f0, RandomAccess {

    /* renamed from: a */
    public final C3497f0 f12531a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.p1$a */
    public class C3560a implements ListIterator<String>, Iterator {

        /* renamed from: a */
        public ListIterator<String> f12532a;

        public C3560a(C3559p1 p1Var, int i) {
            this.f12532a = p1Var.f12531a.listIterator(i);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public boolean hasNext() {
            return this.f12532a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f12532a.hasPrevious();
        }

        public Object next() {
            return this.f12532a.next();
        }

        public int nextIndex() {
            return this.f12532a.nextIndex();
        }

        public Object previous() {
            return this.f12532a.previous();
        }

        public int previousIndex() {
            return this.f12532a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.p1$b */
    public class C3561b implements java.util.Iterator<String>, Iterator {

        /* renamed from: a */
        public java.util.Iterator<String> f12533a;

        public C3561b(C3559p1 p1Var) {
            this.f12533a = p1Var.f12531a.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public boolean hasNext() {
            return this.f12533a.hasNext();
        }

        public Object next() {
            return this.f12533a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C3559p1(C3497f0 f0Var) {
        this.f12531a = f0Var;
    }

    /* renamed from: a */
    public C3497f0 mo14819a() {
        return this;
    }

    /* renamed from: c */
    public List<?> mo14823c() {
        return this.f12531a.mo14823c();
    }

    public Object get(int i) {
        return (String) this.f12531a.get(i);
    }

    public java.util.Iterator<String> iterator() {
        return new C3561b(this);
    }

    public ListIterator<String> listIterator(int i) {
        return new C3560a(this, i);
    }

    public int size() {
        return this.f12531a.size();
    }

    /* renamed from: a */
    public Object mo14820a(int i) {
        return this.f12531a.mo14820a(i);
    }

    /* renamed from: a */
    public void mo14821a(C3508i iVar) {
        throw new UnsupportedOperationException();
    }
}
