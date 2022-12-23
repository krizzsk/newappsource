package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kh0.C23785a;
import kh0.C23786b;
import kh0.C23787c;
import kh0.C23788d;
import kh0.C23789e;
import kh0.C23790f;
import kh0.C23791g;
import kh0.C23792h;
import kotlin.collections.EmptyList;
import kotlin.text.C24179b;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24361g;
import p001a0.C0016g;
import p431cy.C16525b;
import p988j$.util.concurrent.ConcurrentHashMap;
import rh0.C24826e;
import wf0.C25142f;

public class LockBasedStorageManager implements C23792h {

    /* renamed from: d */
    public static final String f61309d = C24179b.m60584f0(LockBasedStorageManager.class.getCanonicalName(), "");

    /* renamed from: e */
    public static final C24137a f61310e = new C24137a();

    /* renamed from: a */
    public final C23791g f61311a;

    /* renamed from: b */
    public final C24140d f61312b;

    /* renamed from: c */
    public final String f61313c;

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a */
    public static class C24137a extends LockBasedStorageManager {
        public C24137a() {
            super("NO_LOCKS", C24361g.f61686o);
        }

        /* renamed from: k */
        public final C24149l mo60220k(Object obj, String str) {
            return new C24149l(null, true);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$b */
    public static class C24138b<K, V> extends C24139c<K, V> implements C23785a<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24138b(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap);
            if (lockBasedStorageManager != null) {
            } else {
                m60438a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m60438a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: d */
        public final V mo60222d(K k, C24225a<? extends V> aVar) {
            V invoke = invoke(new C24142e(k, aVar));
            if (invoke != null) {
                return invoke;
            }
            m60438a(3);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$c */
    public static class C24139c<K, V> extends C24147j<C24142e<K, V>, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24139c(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new C24152c());
            if (lockBasedStorageManager != null) {
            } else {
                m60440a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m60440a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d */
    public interface C24140d {

        /* renamed from: a */
        public static final C24141a f61314a = new C24141a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d$a */
        public static class C24141a implements C24140d {
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e */
    public static class C24142e<K, V> {

        /* renamed from: a */
        public final K f61315a;

        /* renamed from: b */
        public final C24225a<? extends V> f61316b;

        public C24142e(K k, C24225a<? extends V> aVar) {
            this.f61315a = k;
            this.f61316b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C24142e.class != obj.getClass() || !this.f61315a.equals(((C24142e) obj).f61315a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f61315a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f */
    public static class C24143f<T> implements C23790f<T> {

        /* renamed from: b */
        public final LockBasedStorageManager f61317b;

        /* renamed from: c */
        public final C24225a<? extends T> f61318c;

        /* renamed from: d */
        public volatile Object f61319d;

        public C24143f(LockBasedStorageManager lockBasedStorageManager, C24225a<? extends T> aVar) {
            if (lockBasedStorageManager == null) {
                m60441a(0);
                throw null;
            } else if (aVar != null) {
                this.f61319d = NotValue.NOT_COMPUTED;
                this.f61317b = lockBasedStorageManager;
                this.f61318c = aVar;
            } else {
                m60441a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m60441a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public final boolean mo60225b() {
            return (this.f61319d == NotValue.NOT_COMPUTED || this.f61319d == NotValue.COMPUTING) ? false : true;
        }

        /* renamed from: c */
        public void mo60226c(T t) {
        }

        /* renamed from: d */
        public C24149l<T> mo60227d(boolean z) {
            C24149l<T> k = this.f61317b.mo60220k((Object) null, "in a lazy value");
            if (k != null) {
                return k;
            }
            m60441a(2);
            throw null;
        }

        public T invoke() {
            T t = this.f61319d;
            if (!(t instanceof NotValue)) {
                C24826e.m62358a(t);
                return t;
            }
            this.f61317b.f61311a.lock();
            try {
                T t2 = this.f61319d;
                if (!(t2 instanceof NotValue)) {
                    C24826e.m62358a(t2);
                } else {
                    T t3 = NotValue.COMPUTING;
                    if (t2 == t3) {
                        this.f61319d = NotValue.RECURSION_WAS_DETECTED;
                        C24149l d = mo60227d(true);
                        if (!d.f61325b) {
                            t2 = d.f61324a;
                        }
                    }
                    if (t2 == NotValue.RECURSION_WAS_DETECTED) {
                        C24149l d2 = mo60227d(false);
                        if (!d2.f61325b) {
                            t2 = d2.f61324a;
                        }
                    }
                    this.f61319d = t3;
                    t2 = this.f61318c.invoke();
                    mo60226c(t2);
                    this.f61319d = t2;
                }
                this.f61317b.f61311a.unlock();
                return t2;
            } catch (Throwable th) {
                this.f61317b.f61311a.unlock();
                throw th;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$g */
    public static abstract class C24144g<T> extends C24143f<T> {

        /* renamed from: e */
        public volatile C16525b f61320e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24144g(LockBasedStorageManager lockBasedStorageManager, C24225a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager != null) {
                this.f61320e = null;
                return;
            }
            m60445a(0);
            throw null;
        }

        /* renamed from: a */
        public static /* synthetic */ void m60445a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final void mo60226c(T t) {
            this.f61320e = new C16525b((Object) t);
            try {
                C24151b bVar = (C24151b) this;
                if (t != null) {
                    bVar.f61328g.invoke(t);
                } else {
                    C24151b.m60454a(2);
                    throw null;
                }
            } finally {
                this.f61320e = null;
            }
        }

        public T invoke() {
            boolean z;
            C16525b bVar = this.f61320e;
            if (bVar != null) {
                boolean z2 = true;
                if (((Thread) bVar.f43144b) == Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((Thread) bVar.f43144b) != Thread.currentThread()) {
                        z2 = false;
                    }
                    if (z2) {
                        return bVar.f43143a;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return super.invoke();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h */
    public static class C24145h<T> extends C24143f<T> implements C23789e<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24145h(LockBasedStorageManager lockBasedStorageManager, C24225a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                m60447a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                m60447a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m60447a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public final T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            m60447a(2);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$i */
    public static abstract class C24146i<T> extends C24144g<T> implements C23789e<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24146i(LockBasedStorageManager lockBasedStorageManager, C24225a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager != null) {
            } else {
                m60448a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m60448a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public final T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            m60448a(2);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$j */
    public static class C24147j<K, V> implements C23788d<K, V> {

        /* renamed from: b */
        public final LockBasedStorageManager f61321b;

        /* renamed from: c */
        public final ConcurrentMap<K, Object> f61322c;

        /* renamed from: d */
        public final C24236l<? super K, ? extends V> f61323d;

        public C24147j(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, C24236l lVar) {
            if (lockBasedStorageManager != null) {
                this.f61321b = lockBasedStorageManager;
                this.f61322c = concurrentHashMap;
                this.f61323d = lVar;
                return;
            }
            m60449a(0);
            throw null;
        }

        /* renamed from: a */
        public static /* synthetic */ void m60449a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public final boolean mo60228b(K k) {
            Object obj = this.f61322c.get(k);
            if (obj == null || obj == NotValue.COMPUTING) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final AssertionError mo60229c(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f61321b);
            LockBasedStorageManager.m60426l(assertionError);
            return assertionError;
        }

        public V invoke(K k) {
            Object obj;
            V v;
            V v2 = this.f61322c.get(k);
            Object obj2 = null;
            if (v2 == null || v2 == NotValue.COMPUTING) {
                this.f61321b.f61311a.lock();
                try {
                    Object obj3 = this.f61322c.get(k);
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj3 == notValue) {
                        obj3 = NotValue.RECURSION_WAS_DETECTED;
                        C24149l k2 = this.f61321b.mo60220k(k, "");
                        if (k2 == null) {
                            m60449a(3);
                            throw null;
                        } else if (!k2.f61325b) {
                            obj = k2.f61324a;
                            this.f61321b.f61311a.unlock();
                            return obj;
                        }
                    }
                    if (obj3 == NotValue.RECURSION_WAS_DETECTED) {
                        C24149l k3 = this.f61321b.mo60220k(k, "");
                        if (k3 == null) {
                            m60449a(3);
                            throw null;
                        } else if (!k3.f61325b) {
                            obj = k3.f61324a;
                            this.f61321b.f61311a.unlock();
                            return obj;
                        }
                    }
                    if (obj3 != null) {
                        C24826e.m62358a(obj3);
                        if (obj3 != C24826e.f62771a) {
                            obj2 = obj3;
                        }
                        obj = obj2;
                        this.f61321b.f61311a.unlock();
                        return obj;
                    }
                    this.f61322c.put(k, notValue);
                    V invoke = this.f61323d.invoke(k);
                    ConcurrentMap<K, Object> concurrentMap = this.f61322c;
                    if (invoke == null) {
                        v = C24826e.f62771a;
                    } else {
                        v = invoke;
                    }
                    Object put = concurrentMap.put(k, v);
                    if (put == notValue) {
                        this.f61321b.f61311a.unlock();
                        return invoke;
                    }
                    throw mo60229c(k, put);
                } catch (Throwable th) {
                    this.f61321b.f61311a.unlock();
                    throw th;
                }
            } else {
                C24826e.m62358a(v2);
                if (v2 == C24826e.f62771a) {
                    return null;
                }
                return v2;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$k */
    public static class C24148k<K, V> extends C24147j<K, V> implements C23787c<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24148k(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, C24236l lVar) {
            super(lockBasedStorageManager, concurrentHashMap, lVar);
            if (lockBasedStorageManager != null) {
            } else {
                m60452a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m60452a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public final V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke != null) {
                return invoke;
            }
            m60452a(3);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$l */
    public static class C24149l<T> {

        /* renamed from: a */
        public final T f61324a;

        /* renamed from: b */
        public final boolean f61325b;

        public C24149l(T t, boolean z) {
            this.f61324a = t;
            this.f61325b = z;
        }

        public final String toString() {
            if (this.f61325b) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f61324a);
        }
    }

    public LockBasedStorageManager() {
        throw null;
    }

    public LockBasedStorageManager(String str, C23791g gVar) {
        C24140d.C24141a aVar = C24140d.f61314a;
        this.f61311a = gVar;
        this.f61312b = aVar;
        this.f61313c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m60425i(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = 3
            goto L_0x0022
        L_0x0021:
            r7 = 2
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            java.lang.String r9 = "compute"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r8
            goto L_0x0069
        L_0x005d:
            r7[r11] = r9
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "sanitizeStackTrace"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "createMemoizedFunction"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r8
            goto L_0x0082
        L_0x007a:
            r7[r10] = r5
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r12
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r5
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r9
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r12
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m60425i(int):void");
    }

    /* renamed from: l */
    public static void m60426l(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (!stackTrace[i2].getClassName().startsWith(f61309d)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    /* renamed from: a */
    public final C24147j mo59016a(C24236l lVar) {
        return new C24147j(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    /* renamed from: b */
    public final C24138b mo59017b() {
        return new C24138b(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    /* renamed from: c */
    public final C24139c mo59018c() {
        return new C24139c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    /* renamed from: d */
    public final C24145h mo59019d(C24225a aVar) {
        if (aVar != null) {
            return new C24145h(this, aVar);
        }
        m60425i(23);
        throw null;
    }

    /* renamed from: e */
    public final C24148k mo59020e(C24236l lVar) {
        return new C24148k(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    /* renamed from: f */
    public final C24150a mo59021f(EmptyList emptyList, C24225a aVar) {
        if (emptyList != null) {
            return new C24150a(this, aVar, emptyList);
        }
        m60425i(27);
        throw null;
    }

    /* renamed from: g */
    public final C24143f mo59022g(C24225a aVar) {
        return new C24143f(this, aVar);
    }

    /* renamed from: h */
    public final C24151b mo59023h(C24225a aVar, C24236l lVar, C24236l lVar2) {
        return new C24151b(this, aVar, lVar, lVar2);
    }

    /* renamed from: j */
    public final Object mo60219j(C25142f fVar) {
        this.f61311a.lock();
        try {
            fVar.invoke();
            this.f61311a.unlock();
            return null;
        } catch (Throwable th) {
            this.f61311a.unlock();
            throw th;
        }
    }

    /* renamed from: k */
    public C24149l mo60220k(Object obj, String str) {
        String str2;
        StringBuilder t = C0016g.m36t("Recursion detected ", str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        t.append(str2);
        t.append(" under ");
        t.append(this);
        AssertionError assertionError = new AssertionError(t.toString());
        m60426l(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return C0016g.m31o(sb, this.f61313c, ")");
    }

    public LockBasedStorageManager(String str) {
        this(str, new C23786b(0));
    }
}
