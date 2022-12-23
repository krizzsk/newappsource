package p404ce;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ce.b */
public final class C13784b<T> {

    /* renamed from: a */
    public final String f33933a;

    /* renamed from: b */
    public final Set<Class<? super T>> f33934b;

    /* renamed from: c */
    public final Set<C13800m> f33935c;

    /* renamed from: d */
    public final int f33936d;

    /* renamed from: e */
    public final int f33937e;

    /* renamed from: f */
    public final C13791f<T> f33938f;

    /* renamed from: g */
    public final Set<Class<?>> f33939g;

    /* renamed from: ce.b$a */
    public static class C13785a<T> {

        /* renamed from: a */
        public final HashSet f33940a;

        /* renamed from: b */
        public final HashSet f33941b = new HashSet();

        /* renamed from: c */
        public int f33942c;

        /* renamed from: d */
        public int f33943d;

        /* renamed from: e */
        public C13791f<T> f33944e;

        /* renamed from: f */
        public HashSet f33945f;

        public C13785a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f33940a = hashSet;
            int i = 0;
            this.f33942c = 0;
            this.f33943d = 0;
            this.f33945f = new HashSet();
            hashSet.add(cls);
            int length = clsArr.length;
            while (i < length) {
                if (clsArr[i] != null) {
                    i++;
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(this.f33940a, clsArr);
        }

        /* renamed from: a */
        public final void mo40715a(C13800m mVar) {
            if (!this.f33940a.contains(mVar.f33967a)) {
                this.f33941b.add(mVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public final C13784b<T> mo40716b() {
            boolean z;
            if (this.f33944e != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C13784b((String) null, new HashSet(this.f33940a), new HashSet(this.f33941b), this.f33942c, this.f33943d, this.f33944e, this.f33945f);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* renamed from: c */
        public final void mo40717c(int i) {
            boolean z;
            if (this.f33942c == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f33942c = i;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public C13784b(String str, Set<Class<? super T>> set, Set<C13800m> set2, int i, int i2, C13791f<T> fVar, Set<Class<?>> set3) {
        this.f33933a = str;
        this.f33934b = Collections.unmodifiableSet(set);
        this.f33935c = Collections.unmodifiableSet(set2);
        this.f33936d = i;
        this.f33937e = i2;
        this.f33938f = fVar;
        this.f33939g = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C13785a<T> m34444a(Class<T> cls) {
        return new C13785a<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C13784b<T> m34445b(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            if (clsArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, clsArr);
        return new C13784b((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C13783a(t), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f33934b.toArray()) + ">{" + this.f33936d + ", type=" + this.f33937e + ", deps=" + Arrays.toString(this.f33935c.toArray()) + "}";
    }
}
