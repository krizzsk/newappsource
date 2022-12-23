package p404ce;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p011aa.C0141e;
import p885we.C20293c;
import p956ze.C20837a;
import p956ze.C20839b;

/* renamed from: ce.s */
public final class C13806s extends C0141e {

    /* renamed from: b */
    public final Set<Class<?>> f33983b;

    /* renamed from: c */
    public final Set<Class<?>> f33984c;

    /* renamed from: d */
    public final Set<Class<?>> f33985d;

    /* renamed from: e */
    public final Set<Class<?>> f33986e;

    /* renamed from: f */
    public final Set<Class<?>> f33987f;

    /* renamed from: g */
    public final C13786c f33988g;

    /* renamed from: ce.s$a */
    public static class C13807a implements C20293c {

        /* renamed from: a */
        public final C20293c f33989a;

        public C13807a(C20293c cVar) {
            this.f33989a = cVar;
        }
    }

    public C13806s(C13784b bVar, C13796k kVar) {
        boolean z;
        boolean z2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C13800m next : bVar.f33935c) {
            int i = next.f33969c;
            boolean z3 = true;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (next.f33968b != 2 ? false : z3) {
                    hashSet4.add(next.f33967a);
                } else {
                    hashSet.add(next.f33967a);
                }
            } else {
                if (i == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    hashSet3.add(next.f33967a);
                } else {
                    if (next.f33968b != 2 ? false : z3) {
                        hashSet5.add(next.f33967a);
                    } else {
                        hashSet2.add(next.f33967a);
                    }
                }
            }
        }
        if (!bVar.f33939g.isEmpty()) {
            hashSet.add(C20293c.class);
        }
        this.f33983b = Collections.unmodifiableSet(hashSet);
        this.f33984c = Collections.unmodifiableSet(hashSet2);
        this.f33985d = Collections.unmodifiableSet(hashSet3);
        this.f33986e = Collections.unmodifiableSet(hashSet4);
        this.f33987f = Collections.unmodifiableSet(hashSet5);
        Set<Class<?>> set = bVar.f33939g;
        this.f33988g = kVar;
    }

    /* renamed from: b */
    public final <T> T mo314b(Class<T> cls) {
        if (this.f33983b.contains(cls)) {
            T b = this.f33988g.mo314b(cls);
            if (!cls.equals(C20293c.class)) {
                return b;
            }
            return new C13807a((C20293c) b);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: e */
    public final <T> C20839b<Set<T>> mo40718e(Class<T> cls) {
        if (this.f33987f.contains(cls)) {
            return this.f33988g.mo40718e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: f */
    public final <T> Set<T> mo317f(Class<T> cls) {
        if (this.f33986e.contains(cls)) {
            return this.f33988g.mo317f(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: h */
    public final <T> C20839b<T> mo40719h(Class<T> cls) {
        if (this.f33984c.contains(cls)) {
            return this.f33988g.mo40719h(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: j */
    public final <T> C20837a<T> mo40720j(Class<T> cls) {
        if (this.f33985d.contains(cls)) {
            return this.f33988g.mo40720j(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}
