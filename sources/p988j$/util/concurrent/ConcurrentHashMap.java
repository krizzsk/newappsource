package p988j$.util.concurrent;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.Function;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.ConcurrentHashMap */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, C25907v {
    private static final long ABASE;
    private static final int ASHIFT;
    private static final long BASECOUNT;
    private static final long CELLSBUSY;
    private static final long CELLVALUE;
    private static final int DEFAULT_CAPACITY = 16;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 16;
    static final int HASH_BITS = Integer.MAX_VALUE;
    private static final float LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_ARRAY_SIZE = 2147483639;
    private static final int MAX_RESIZERS = ((1 << (32 - 16)) - 1);
    private static final int MIN_TRANSFER_STRIDE = 16;
    static final int MIN_TREEIFY_CAPACITY = 64;
    static final int MOVED = -1;
    static final int NCPU = Runtime.getRuntime().availableProcessors();
    static final int RESERVED = -3;
    private static int RESIZE_STAMP_BITS = 16;
    private static final int RESIZE_STAMP_SHIFT = (32 - 16);
    private static final long SIZECTL;
    private static final long TRANSFERINDEX;
    static final int TREEBIN = -2;
    static final int TREEIFY_THRESHOLD = 8;

    /* renamed from: U */
    private static final Unsafe f64537U;
    static final int UNTREEIFY_THRESHOLD = 6;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;
    private volatile transient C25889d[] counterCells;
    private transient C25891f entrySet;
    private transient C25895j keySet;
    private volatile transient C25898m[] nextTable;
    private volatile transient int sizeCtl;
    volatile transient C25898m[] table;
    private volatile transient int transferIndex;
    private transient C25905t values;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C25900o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c = C25908w.m64755c();
            f64537U = c;
            Class<ConcurrentHashMap> cls2 = ConcurrentHashMap.class;
            SIZECTL = c.objectFieldOffset(cls2.getDeclaredField("sizeCtl"));
            TRANSFERINDEX = c.objectFieldOffset(cls2.getDeclaredField("transferIndex"));
            BASECOUNT = c.objectFieldOffset(cls2.getDeclaredField("baseCount"));
            CELLSBUSY = c.objectFieldOffset(cls2.getDeclaredField("cellsBusy"));
            CELLVALUE = c.objectFieldOffset(C25889d.class.getDeclaredField("value"));
            Class<C25898m[]> cls3 = C25898m[].class;
            ABASE = (long) c.arrayBaseOffset(cls3);
            int arrayIndexScale = c.arrayIndexScale(cls3);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                ASHIFT = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        if (i >= 0) {
            this.sizeCtl = i >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i + (i >>> 1) + 1);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ConcurrentHashMap(int i, float f) {
        this(i, f, 1);
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= BitmapDescriptorFactory.HUE_RED || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((double) (((float) ((long) (i < i2 ? i2 : i))) / f)) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? MAXIMUM_CAPACITY : tableSizeFor((int) j);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addCount(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.d[] r0 = r11.counterCells
            if (r0 != 0) goto L_0x0014
            sun.misc.Unsafe r1 = f64537U
            long r3 = BASECOUNT
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L_0x003b
        L_0x0014:
            r1 = 1
            if (r0 == 0) goto L_0x0096
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x0096
            int r3 = p988j$.util.concurrent.ThreadLocalRandom.m64728b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L_0x0096
            sun.misc.Unsafe r3 = f64537U
            long r5 = CELLVALUE
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L_0x0034
            r1 = r0
            goto L_0x0096
        L_0x0034:
            if (r14 > r1) goto L_0x0037
            return
        L_0x0037:
            long r9 = r11.sumCount()
        L_0x003b:
            if (r14 < 0) goto L_0x0095
        L_0x003d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0095
            j$.util.concurrent.m[] r12 = r11.table
            if (r12 == 0) goto L_0x0095
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L_0x0095
            int r13 = resizeStamp(r13)
            if (r4 >= 0) goto L_0x007c
            int r14 = RESIZE_STAMP_SHIFT
            int r14 = r4 >>> r14
            if (r14 != r13) goto L_0x0095
            int r14 = r13 + 1
            if (r4 == r14) goto L_0x0095
            int r14 = MAX_RESIZERS
            int r13 = r13 + r14
            if (r4 == r13) goto L_0x0095
            j$.util.concurrent.m[] r13 = r11.nextTable
            if (r13 == 0) goto L_0x0095
            int r14 = r11.transferIndex
            if (r14 > 0) goto L_0x006b
            goto L_0x0095
        L_0x006b:
            sun.misc.Unsafe r0 = f64537U
            long r2 = SIZECTL
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L_0x0090
            r11.transfer(r12, r13)
            goto L_0x0090
        L_0x007c:
            sun.misc.Unsafe r0 = f64537U
            long r2 = SIZECTL
            int r14 = RESIZE_STAMP_SHIFT
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L_0x0090
            r13 = 0
            r11.transfer(r12, r13)
        L_0x0090:
            long r9 = r11.sumCount()
            goto L_0x003d
        L_0x0095:
            return
        L_0x0096:
            r11.fullAddCount(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.addCount(long, int):void");
    }

    static final <K, V> boolean casTabAt(C25898m[] mVarArr, int i, C25898m mVar, C25898m mVar2) {
        return C25886a.m64736a(f64537U, mVarArr, (((long) i) << ASHIFT) + ABASE, mVar, mVar2);
    }

    static Class<?> comparableClassFor(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static int compareComparables(Class<?> cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009d, code lost:
        if (r9.counterCells != r7) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009f, code lost:
        r1 = new p988j$.util.concurrent.C25889d[(r8 << 1)];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r2 >= r8) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r9.counterCells = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0102 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x001b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void fullAddCount(long r25, boolean r27) {
        /*
            r24 = this;
            r9 = r24
            r10 = r25
            int r0 = p988j$.util.concurrent.ThreadLocalRandom.m64728b()
            r12 = 1
            if (r0 != 0) goto L_0x0015
            p988j$.util.concurrent.ThreadLocalRandom.m64729f()
            int r0 = p988j$.util.concurrent.ThreadLocalRandom.m64728b()
            r1 = r0
            r0 = 1
            goto L_0x0018
        L_0x0015:
            r1 = r0
            r0 = r27
        L_0x0018:
            r13 = 0
            r14 = r1
        L_0x001a:
            r15 = 0
        L_0x001b:
            j$.util.concurrent.d[] r7 = r9.counterCells
            if (r7 == 0) goto L_0x00be
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00be
            int r1 = r8 + -1
            r1 = r1 & r14
            r1 = r7[r1]
            if (r1 != 0) goto L_0x0063
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0061
            j$.util.concurrent.d r7 = new j$.util.concurrent.d
            r7.<init>(r10)
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0061
            sun.misc.Unsafe r1 = f64537U
            long r3 = CELLSBUSY
            r5 = 0
            r6 = 1
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0061
            j$.util.concurrent.d[] r1 = r9.counterCells     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0056
            int r2 = r1.length     // Catch:{ all -> 0x005d }
            if (r2 <= 0) goto L_0x0056
            int r2 = r2 + -1
            r2 = r2 & r14
            r3 = r1[r2]     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x0056
            r1[r2] = r7     // Catch:{ all -> 0x005d }
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            r9.cellsBusy = r13
            if (r1 == 0) goto L_0x001b
            goto L_0x0102
        L_0x005d:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x0061:
            r15 = 0
            goto L_0x00b7
        L_0x0063:
            if (r0 != 0) goto L_0x0067
            r0 = 1
            goto L_0x00b7
        L_0x0067:
            sun.misc.Unsafe r2 = f64537U
            long r18 = CELLVALUE
            long r3 = r1.value
            long r22 = r3 + r10
            r16 = r2
            r17 = r1
            r20 = r3
            boolean r1 = r16.compareAndSwapLong(r17, r18, r20, r22)
            if (r1 == 0) goto L_0x007d
            goto L_0x0102
        L_0x007d:
            j$.util.concurrent.d[] r1 = r9.counterCells
            if (r1 != r7) goto L_0x0061
            int r1 = NCPU
            if (r8 < r1) goto L_0x0086
            goto L_0x0061
        L_0x0086:
            if (r15 != 0) goto L_0x008a
            r15 = 1
            goto L_0x00b7
        L_0x008a:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x00b7
            long r3 = CELLSBUSY
            r5 = 0
            r6 = 1
            r1 = r2
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00b7
            j$.util.concurrent.d[] r1 = r9.counterCells     // Catch:{ all -> 0x00b3 }
            if (r1 != r7) goto L_0x00af
            int r1 = r8 << 1
            j$.util.concurrent.d[] r1 = new p988j$.util.concurrent.C25889d[r1]     // Catch:{ all -> 0x00b3 }
            r2 = 0
        L_0x00a4:
            if (r2 >= r8) goto L_0x00ad
            r3 = r7[r2]     // Catch:{ all -> 0x00b3 }
            r1[r2] = r3     // Catch:{ all -> 0x00b3 }
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00ad:
            r9.counterCells = r1     // Catch:{ all -> 0x00b3 }
        L_0x00af:
            r9.cellsBusy = r13
            goto L_0x001a
        L_0x00b3:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x00b7:
            int r1 = p988j$.util.concurrent.ThreadLocalRandom.m64727a(r14)
            r14 = r1
            goto L_0x001b
        L_0x00be:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x00f2
            j$.util.concurrent.d[] r1 = r9.counterCells
            if (r1 != r7) goto L_0x00f2
            sun.misc.Unsafe r1 = f64537U
            long r3 = CELLSBUSY
            r5 = 0
            r6 = 1
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00f2
            j$.util.concurrent.d[] r1 = r9.counterCells     // Catch:{ all -> 0x00ee }
            if (r1 != r7) goto L_0x00e8
            r1 = 2
            j$.util.concurrent.d[] r1 = new p988j$.util.concurrent.C25889d[r1]     // Catch:{ all -> 0x00ee }
            r2 = r14 & 1
            j$.util.concurrent.d r3 = new j$.util.concurrent.d     // Catch:{ all -> 0x00ee }
            r3.<init>(r10)     // Catch:{ all -> 0x00ee }
            r1[r2] = r3     // Catch:{ all -> 0x00ee }
            r9.counterCells = r1     // Catch:{ all -> 0x00ee }
            r1 = 1
            goto L_0x00e9
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            r9.cellsBusy = r13
            if (r1 == 0) goto L_0x001b
            goto L_0x0102
        L_0x00ee:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x00f2:
            sun.misc.Unsafe r1 = f64537U
            long r3 = BASECOUNT
            long r5 = r9.baseCount
            long r7 = r5 + r10
            r2 = r24
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 == 0) goto L_0x001b
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.fullAddCount(long, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    private final C25898m[] initTable() {
        while (true) {
            C25898m[] mVarArr = this.table;
            if (mVarArr != null && mVarArr.length != 0) {
                return mVarArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else {
                if (f64537U.compareAndSwapInt(this, SIZECTL, i, -1)) {
                    try {
                        C25898m[] mVarArr2 = this.table;
                        if (mVarArr2 == null || mVarArr2.length == 0) {
                            int i2 = i > 0 ? i : 16;
                            C25898m[] mVarArr3 = new C25898m[i2];
                            this.table = mVarArr3;
                            i = i2 - (i2 >>> 2);
                            mVarArr2 = mVarArr3;
                        }
                        this.sizeCtl = i;
                        return mVarArr2;
                    } catch (Throwable th) {
                        this.sizeCtl = i;
                        throw th;
                    }
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        int i;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C25898m mVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject != null && readObject2 != null) {
                j3++;
                mVar = new C25898m(spread(readObject.hashCode()), readObject, readObject2, mVar);
            }
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        if (j3 >= 536870912) {
            i = MAXIMUM_CAPACITY;
        } else {
            int i2 = (int) j3;
            i = tableSizeFor(i2 + (i2 >>> 1) + 1);
        }
        C25898m[] mVarArr = new C25898m[i];
        int i3 = i - 1;
        while (mVar != null) {
            C25898m mVar2 = mVar.f64560d;
            int i4 = mVar.f64557a;
            int i5 = i4 & i3;
            C25898m tabAt = tabAt(mVarArr, i5);
            if (tabAt == null) {
                z = true;
            } else {
                Object obj2 = mVar.f64558b;
                if (tabAt.f64557a >= 0) {
                    C25898m mVar3 = tabAt;
                    int i6 = 0;
                    while (true) {
                        if (mVar3 == null) {
                            z = true;
                            break;
                        } else if (mVar3.f64557a != i4 || ((obj = mVar3.f64558b) != obj2 && (obj == null || !obj2.equals(obj)))) {
                            i6++;
                            mVar3 = mVar3.f64560d;
                        }
                    }
                    z = false;
                    if (z && i6 >= 8) {
                        j2++;
                        mVar.f64560d = tabAt;
                        C25898m mVar4 = mVar;
                        C25904s sVar = null;
                        C25904s sVar2 = null;
                        while (mVar4 != null) {
                            long j4 = j2;
                            C25904s sVar3 = new C25904s(mVar4.f64557a, mVar4.f64558b, mVar4.f64559c, (C25904s) null, (C25904s) null);
                            sVar3.f64581h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f64560d = sVar3;
                            }
                            mVar4 = mVar4.f64560d;
                            sVar2 = sVar3;
                            j2 = j4;
                        }
                        long j5 = j2;
                        setTabAt(mVarArr, i5, new C25903r(sVar));
                    }
                } else if (((C25903r) tabAt).mo83980f(i4, obj2, mVar.f64559c) == null) {
                    j2 += j;
                }
                z = false;
            }
            if (z) {
                j2++;
                mVar.f64560d = tabAt;
                setTabAt(mVarArr, i5, mVar);
            }
            j = 1;
            mVar = mVar2;
        }
        this.table = mVarArr;
        this.sizeCtl = i - (i >>> 2);
        this.baseCount = j2;
    }

    static final int resizeStamp(int i) {
        return Integer.numberOfLeadingZeros(i) | (1 << (RESIZE_STAMP_BITS - 1));
    }

    static final <K, V> void setTabAt(C25898m[] mVarArr, int i, C25898m mVar) {
        f64537U.putObjectVolatile(mVarArr, (((long) i) << ASHIFT) + ABASE, mVar);
    }

    static final int spread(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    static final <K, V> C25898m tabAt(C25898m[] mVarArr, int i) {
        return (C25898m) f64537U.getObjectVolatile(mVarArr, (((long) i) << ASHIFT) + ABASE);
    }

    private static final int tableSizeFor(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 0) {
            return 1;
        }
        return i7 >= MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : 1 + i7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: j$.util.concurrent.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: j$.util.concurrent.s} */
    /* JADX WARNING: type inference failed for: r6v12, types: [j$.util.concurrent.m] */
    /* JADX WARNING: type inference failed for: r15v16, types: [j$.util.concurrent.m] */
    /* JADX WARNING: type inference failed for: r6v17, types: [j$.util.concurrent.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void transfer(p988j$.util.concurrent.C25898m[] r30, p988j$.util.concurrent.C25898m[] r31) {
        /*
            r29 = this;
            r7 = r29
            r0 = r30
            int r8 = r0.length
            int r1 = NCPU
            r9 = 1
            if (r1 <= r9) goto L_0x000e
            int r2 = r8 >>> 3
            int r2 = r2 / r1
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            r1 = 16
            if (r2 >= r1) goto L_0x0016
            r10 = 16
            goto L_0x0017
        L_0x0016:
            r10 = r2
        L_0x0017:
            if (r31 != 0) goto L_0x0029
            int r1 = r8 << 1
            j$.util.concurrent.m[] r1 = new p988j$.util.concurrent.C25898m[r1]     // Catch:{ all -> 0x0023 }
            r7.nextTable = r1
            r7.transferIndex = r8
            r11 = r1
            goto L_0x002b
        L_0x0023:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.sizeCtl = r0
            return
        L_0x0029:
            r11 = r31
        L_0x002b:
            int r12 = r11.length
            j$.util.concurrent.h r13 = new j$.util.concurrent.h
            r13.<init>(r11)
            r4 = r0
            r3 = r7
            r5 = 0
            r6 = 0
            r15 = 1
            r16 = 0
        L_0x0038:
            r1 = -1
            if (r15 == 0) goto L_0x008b
            int r5 = r5 + -1
            if (r5 >= r6) goto L_0x007b
            if (r16 == 0) goto L_0x0042
            goto L_0x007b
        L_0x0042:
            int r2 = r3.transferIndex
            if (r2 > 0) goto L_0x004b
            r21 = r3
            r14 = r4
            r5 = -1
            goto L_0x0086
        L_0x004b:
            sun.misc.Unsafe r1 = f64537U
            long r17 = TRANSFERINDEX
            if (r2 <= r10) goto L_0x0054
            int r19 = r2 - r10
            goto L_0x0056
        L_0x0054:
            r19 = 0
        L_0x0056:
            r20 = r2
            r2 = r29
            r21 = r3
            r14 = r4
            r3 = r17
            r17 = r5
            r5 = r20
            r18 = r6
            r6 = r19
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0073
            int r2 = r20 + -1
            r5 = r2
            r6 = r19
            goto L_0x0086
        L_0x0073:
            r4 = r14
            r5 = r17
            r6 = r18
            r3 = r21
            goto L_0x0038
        L_0x007b:
            r21 = r3
            r14 = r4
            r17 = r5
            r18 = r6
            r5 = r17
            r6 = r18
        L_0x0086:
            r4 = r14
            r3 = r21
            r15 = 0
            goto L_0x0038
        L_0x008b:
            r21 = r3
            r14 = r4
            r18 = r6
            r2 = 0
            if (r5 < 0) goto L_0x01ba
            if (r5 >= r8) goto L_0x01ba
            int r3 = r5 + r8
            if (r3 < r12) goto L_0x009b
            goto L_0x01ba
        L_0x009b:
            j$.util.concurrent.m r4 = tabAt(r14, r5)
            if (r4 != 0) goto L_0x00b0
            boolean r1 = casTabAt(r14, r5, r2, r13)
            r15 = r1
            r19 = r10
            r20 = r12
            r7 = r13
            r4 = r14
            r3 = r21
            goto L_0x01b3
        L_0x00b0:
            int r6 = r4.f64557a
            if (r6 != r1) goto L_0x00c1
            r9 = r7
            r19 = r10
            r20 = r12
            r7 = r13
            r4 = r14
            r3 = r21
            r10 = 1
            r15 = 1
            goto L_0x01fd
        L_0x00c1:
            monitor-enter(r4)
            j$.util.concurrent.m r1 = tabAt(r14, r5)     // Catch:{ all -> 0x01b7 }
            if (r1 != r4) goto L_0x01aa
            if (r6 < 0) goto L_0x011d
            r1 = r6 & r8
            j$.util.concurrent.m r6 = r4.f64560d     // Catch:{ all -> 0x01b7 }
            r15 = r4
        L_0x00cf:
            if (r6 == 0) goto L_0x00dc
            int r9 = r6.f64557a     // Catch:{ all -> 0x01b7 }
            r9 = r9 & r8
            if (r9 == r1) goto L_0x00d8
            r15 = r6
            r1 = r9
        L_0x00d8:
            j$.util.concurrent.m r6 = r6.f64560d     // Catch:{ all -> 0x01b7 }
            r9 = 1
            goto L_0x00cf
        L_0x00dc:
            if (r1 != 0) goto L_0x00e0
            r1 = r15
            goto L_0x00e2
        L_0x00e0:
            r1 = r2
            r2 = r15
        L_0x00e2:
            r6 = r4
        L_0x00e3:
            if (r6 == r15) goto L_0x010d
            int r9 = r6.f64557a     // Catch:{ all -> 0x01b7 }
            r19 = r10
            java.lang.Object r10 = r6.f64558b     // Catch:{ all -> 0x01b7 }
            r20 = r12
            java.lang.Object r12 = r6.f64559c     // Catch:{ all -> 0x01b7 }
            r21 = r9 & r8
            if (r21 != 0) goto L_0x00fc
            r21 = r15
            j$.util.concurrent.m r15 = new j$.util.concurrent.m     // Catch:{ all -> 0x01b7 }
            r15.<init>(r9, r10, r12, r1)     // Catch:{ all -> 0x01b7 }
            r1 = r15
            goto L_0x0104
        L_0x00fc:
            r21 = r15
            j$.util.concurrent.m r15 = new j$.util.concurrent.m     // Catch:{ all -> 0x01b7 }
            r15.<init>(r9, r10, r12, r2)     // Catch:{ all -> 0x01b7 }
            r2 = r15
        L_0x0104:
            j$.util.concurrent.m r6 = r6.f64560d     // Catch:{ all -> 0x01b7 }
            r10 = r19
            r12 = r20
            r15 = r21
            goto L_0x00e3
        L_0x010d:
            r19 = r10
            r20 = r12
            setTabAt(r11, r5, r1)     // Catch:{ all -> 0x01b7 }
            setTabAt(r11, r3, r2)     // Catch:{ all -> 0x01b7 }
            setTabAt(r14, r5, r13)     // Catch:{ all -> 0x01b7 }
            r7 = r13
            goto L_0x01a8
        L_0x011d:
            r19 = r10
            r20 = r12
            boolean r1 = r4 instanceof p988j$.util.concurrent.C25903r     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x01ae
            r1 = r4
            j$.util.concurrent.r r1 = (p988j$.util.concurrent.C25903r) r1     // Catch:{ all -> 0x01b7 }
            j$.util.concurrent.s r6 = r1.f64576f     // Catch:{ all -> 0x01b7 }
            r9 = r2
            r10 = r9
            r12 = r6
            r14 = 0
            r15 = 0
            r6 = r10
        L_0x0130:
            if (r12 == 0) goto L_0x0173
            r27 = r1
            int r1 = r12.f64557a     // Catch:{ all -> 0x01b7 }
            j$.util.concurrent.s r7 = new j$.util.concurrent.s     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = r12.f64558b     // Catch:{ all -> 0x01b7 }
            r28 = r13
            java.lang.Object r13 = r12.f64559c     // Catch:{ all -> 0x01b7 }
            r25 = 0
            r26 = 0
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r13
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01b7 }
            r0 = r1 & r8
            if (r0 != 0) goto L_0x015d
            r7.f64581h = r10     // Catch:{ all -> 0x01b7 }
            if (r10 != 0) goto L_0x0157
            r2 = r7
            goto L_0x0159
        L_0x0157:
            r10.f64560d = r7     // Catch:{ all -> 0x01b7 }
        L_0x0159:
            int r14 = r14 + 1
            r10 = r7
            goto L_0x0168
        L_0x015d:
            r7.f64581h = r9     // Catch:{ all -> 0x01b7 }
            if (r9 != 0) goto L_0x0163
            r6 = r7
            goto L_0x0165
        L_0x0163:
            r9.f64560d = r7     // Catch:{ all -> 0x01b7 }
        L_0x0165:
            int r15 = r15 + 1
            r9 = r7
        L_0x0168:
            j$.util.concurrent.m r12 = r12.f64560d     // Catch:{ all -> 0x01b7 }
            r7 = r29
            r0 = r30
            r1 = r27
            r13 = r28
            goto L_0x0130
        L_0x0173:
            r27 = r1
            r28 = r13
            r0 = 6
            if (r14 > r0) goto L_0x017f
            j$.util.concurrent.m r1 = untreeify(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x0189
        L_0x017f:
            if (r15 == 0) goto L_0x0187
            j$.util.concurrent.r r1 = new j$.util.concurrent.r     // Catch:{ all -> 0x01b7 }
            r1.<init>(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x0189
        L_0x0187:
            r1 = r27
        L_0x0189:
            if (r15 > r0) goto L_0x0190
            j$.util.concurrent.m r0 = untreeify(r6)     // Catch:{ all -> 0x01b7 }
            goto L_0x019a
        L_0x0190:
            if (r14 == 0) goto L_0x0198
            j$.util.concurrent.r r0 = new j$.util.concurrent.r     // Catch:{ all -> 0x01b7 }
            r0.<init>(r6)     // Catch:{ all -> 0x01b7 }
            goto L_0x019a
        L_0x0198:
            r0 = r27
        L_0x019a:
            setTabAt(r11, r5, r1)     // Catch:{ all -> 0x01b7 }
            setTabAt(r11, r3, r0)     // Catch:{ all -> 0x01b7 }
            r0 = r30
            r7 = r28
            setTabAt(r0, r5, r7)     // Catch:{ all -> 0x01b7 }
            r14 = r0
        L_0x01a8:
            r15 = 1
            goto L_0x01af
        L_0x01aa:
            r19 = r10
            r20 = r12
        L_0x01ae:
            r7 = r13
        L_0x01af:
            monitor-exit(r4)     // Catch:{ all -> 0x01b7 }
            r3 = r29
            r4 = r14
        L_0x01b3:
            r10 = 1
            r9 = r29
            goto L_0x01fd
        L_0x01b7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b7 }
            throw r0
        L_0x01ba:
            r19 = r10
            r20 = r12
            r7 = r13
            if (r16 == 0) goto L_0x01d0
            r9 = r29
            r9.nextTable = r2
            r9.table = r11
            int r0 = r8 << 1
            r10 = 1
            int r1 = r8 >>> 1
            int r0 = r0 - r1
            r9.sizeCtl = r0
            return
        L_0x01d0:
            r10 = 1
            r9 = r29
            sun.misc.Unsafe r1 = f64537U
            long r3 = SIZECTL
            int r12 = r9.sizeCtl
            int r6 = r12 + -1
            r2 = r29
            r17 = r5
            r5 = r12
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x01f9
            int r12 = r12 + -2
            int r1 = resizeStamp(r8)
            int r2 = RESIZE_STAMP_SHIFT
            int r1 = r1 << r2
            if (r12 == r1) goto L_0x01f2
            return
        L_0x01f2:
            r5 = r8
            r3 = r9
            r4 = r14
            r15 = 1
            r16 = 1
            goto L_0x01fd
        L_0x01f9:
            r3 = r9
            r4 = r14
            r5 = r17
        L_0x01fd:
            r13 = r7
            r7 = r9
            r6 = r18
            r10 = r19
            r12 = r20
            r9 = 1
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.transfer(j$.util.concurrent.m[], j$.util.concurrent.m[]):void");
    }

    private final void treeifyBin(C25898m[] mVarArr, int i) {
        if (mVarArr != null) {
            int length = mVarArr.length;
            if (length < 64) {
                tryPresize(length << 1);
                return;
            }
            C25898m tabAt = tabAt(mVarArr, i);
            if (tabAt != null && tabAt.f64557a >= 0) {
                synchronized (tabAt) {
                    if (tabAt(mVarArr, i) == tabAt) {
                        C25904s sVar = null;
                        C25898m mVar = tabAt;
                        C25904s sVar2 = null;
                        while (mVar != null) {
                            C25904s sVar3 = new C25904s(mVar.f64557a, mVar.f64558b, mVar.f64559c, (C25904s) null, (C25904s) null);
                            sVar3.f64581h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f64560d = sVar3;
                            }
                            mVar = mVar.f64560d;
                            sVar2 = sVar3;
                        }
                        setTabAt(mVarArr, i, new C25903r(sVar));
                    }
                }
            }
        }
    }

    private final void tryPresize(int i) {
        int length;
        C25898m[] mVarArr;
        int tableSizeFor = i >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 >= 0) {
                C25898m[] mVarArr2 = this.table;
                if (mVarArr2 == null || (length = mVarArr2.length) == 0) {
                    int i3 = i2 > tableSizeFor ? i2 : tableSizeFor;
                    if (f64537U.compareAndSwapInt(this, SIZECTL, i2, -1)) {
                        try {
                            if (this.table == mVarArr2) {
                                this.table = new C25898m[i3];
                                i2 = i3 - (i3 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i2;
                        }
                    }
                } else if (tableSizeFor > i2 && length < MAXIMUM_CAPACITY) {
                    if (mVarArr2 == this.table) {
                        int resizeStamp = resizeStamp(length);
                        if (i2 >= 0) {
                            if (f64537U.compareAndSwapInt(this, SIZECTL, i2, (resizeStamp << RESIZE_STAMP_SHIFT) + 2)) {
                                transfer(mVarArr2, (C25898m[]) null);
                            }
                        } else if ((i2 >>> RESIZE_STAMP_SHIFT) == resizeStamp && i2 != resizeStamp + 1 && i2 != resizeStamp + MAX_RESIZERS && (mVarArr = this.nextTable) != null && this.transferIndex > 0) {
                            if (f64537U.compareAndSwapInt(this, SIZECTL, i2, i2 + 1)) {
                                transfer(mVarArr2, mVarArr);
                            }
                        } else {
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    static <K, V> C25898m untreeify(C25898m mVar) {
        C25898m mVar2 = null;
        C25898m mVar3 = null;
        while (mVar != null) {
            C25898m mVar4 = new C25898m(mVar.f64557a, mVar.f64558b, mVar.f64559c, (C25898m) null);
            if (mVar3 == null) {
                mVar2 = mVar4;
            } else {
                mVar3.f64560d = mVar4;
            }
            mVar = mVar.f64560d;
            mVar3 = mVar4;
        }
        return mVar2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 1;
        int i2 = 0;
        while (i < 16) {
            i2++;
            i <<= 1;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        C25900o[] oVarArr = new C25900o[16];
        for (int i5 = 0; i5 < 16; i5++) {
            oVarArr[i5] = new C25900o();
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i3);
        objectOutputStream.putFields().put("segmentMask", i4);
        objectOutputStream.writeFields();
        C25898m[] mVarArr = this.table;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d == null) {
                    break;
                }
                objectOutputStream.writeObject(d.f64558b);
                objectOutputStream.writeObject(d.f64559c);
            }
        }
        objectOutputStream.writeObject((Object) null);
        objectOutputStream.writeObject((Object) null);
    }

    public void clear() {
        C25898m[] mVarArr = this.table;
        long j = 0;
        loop0:
        while (true) {
            int i = 0;
            while (mVarArr != null && i < mVarArr.length) {
                C25898m tabAt = tabAt(mVarArr, i);
                if (tabAt == null) {
                    i++;
                } else {
                    int i2 = tabAt.f64557a;
                    if (i2 == -1) {
                        mVarArr = helpTransfer(mVarArr, tabAt);
                    } else {
                        synchronized (tabAt) {
                            if (tabAt(mVarArr, i) == tabAt) {
                                for (C25898m mVar = i2 >= 0 ? tabAt : tabAt instanceof C25903r ? ((C25903r) tabAt).f64576f : null; mVar != null; mVar = mVar.f64560d) {
                                    j--;
                                }
                                setTabAt(mVarArr, i, (C25898m) null);
                                i++;
                            }
                        }
                    }
                }
            }
        }
        if (j != 0) {
            addCount(j, -1);
        }
    }

    /* JADX INFO: finally extract failed */
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        V v;
        K k2;
        int i;
        C25898m mVar;
        if (k == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C25898m[] mVarArr = this.table;
        int i2 = 0;
        V v2 = null;
        int i3 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & spread;
                    C25898m tabAt = tabAt(mVarArr, i4);
                    if (tabAt == null) {
                        C25899n nVar = new C25899n();
                        synchronized (nVar) {
                            if (casTabAt(mVarArr, i4, (C25898m) null, nVar)) {
                                try {
                                    V apply = biFunction.apply(k, (Object) null);
                                    if (apply != null) {
                                        mVar = new C25898m(spread, k, apply, (C25898m) null);
                                        i = 1;
                                    } else {
                                        i = i3;
                                        mVar = null;
                                    }
                                    setTabAt(mVarArr, i4, mVar);
                                    i3 = i;
                                    v2 = apply;
                                    i2 = 1;
                                } catch (Throwable th) {
                                    setTabAt(mVarArr, i4, (C25898m) null);
                                    throw th;
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    } else {
                        int i5 = tabAt.f64557a;
                        if (i5 == -1) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr, i4) == tabAt) {
                                    if (i5 >= 0) {
                                        C25898m mVar2 = null;
                                        C25898m mVar3 = tabAt;
                                        i2 = 1;
                                        while (true) {
                                            if (mVar3.f64557a != spread || ((k2 = mVar3.f64558b) != k && (k2 == null || !k.equals(k2)))) {
                                                C25898m mVar4 = mVar3.f64560d;
                                                if (mVar4 == null) {
                                                    V apply2 = biFunction.apply(k, (Object) null);
                                                    if (apply2 != null) {
                                                        mVar3.f64560d = new C25898m(spread, k, apply2, (C25898m) null);
                                                        v = apply2;
                                                        i3 = 1;
                                                    } else {
                                                        v = apply2;
                                                    }
                                                } else {
                                                    i2++;
                                                    C25898m mVar5 = mVar4;
                                                    mVar2 = mVar3;
                                                    mVar3 = mVar5;
                                                }
                                            }
                                        }
                                        v = biFunction.apply(k, mVar3.f64559c);
                                        if (v != null) {
                                            mVar3.f64559c = v;
                                        } else {
                                            C25898m mVar6 = mVar3.f64560d;
                                            if (mVar2 != null) {
                                                mVar2.f64560d = mVar6;
                                            } else {
                                                setTabAt(mVarArr, i4, mVar6);
                                            }
                                            i3 = -1;
                                        }
                                        v2 = v;
                                    } else if (tabAt instanceof C25903r) {
                                        C25903r rVar = (C25903r) tabAt;
                                        C25904s sVar = rVar.f64575e;
                                        C25904s b = sVar != null ? sVar.mo83982b(spread, k, (Class) null) : null;
                                        V apply3 = biFunction.apply(k, b == null ? null : b.f64559c);
                                        if (apply3 != null) {
                                            if (b != null) {
                                                b.f64559c = apply3;
                                            } else {
                                                rVar.mo83980f(spread, k, apply3);
                                                v2 = apply3;
                                                i2 = 1;
                                                i3 = 1;
                                            }
                                        } else if (b != null) {
                                            if (rVar.mo83981g(b)) {
                                                setTabAt(mVarArr, i4, untreeify(rVar.f64576f));
                                            }
                                            v2 = apply3;
                                            i2 = 1;
                                            i3 = -1;
                                        }
                                        v2 = apply3;
                                        i2 = 1;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    treeifyBin(mVarArr, i4);
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = initTable();
        }
        if (i3 != 0) {
            addCount((long) i3, i2);
        }
        return v2;
    }

    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c3, code lost:
        if (r5 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c5, code lost:
        addCount(1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ca, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V computeIfAbsent(K r13, p988j$.util.function.Function<? super K, ? extends V> r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L_0x00d4
            if (r14 == 0) goto L_0x00d4
            int r1 = r13.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.m[] r2 = r12.table
            r3 = 0
            r5 = r0
            r4 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x00ce
            int r6 = r2.length
            if (r6 != 0) goto L_0x0019
            goto L_0x00ce
        L_0x0019:
            int r6 = r6 + -1
            r6 = r6 & r1
            j$.util.concurrent.m r7 = tabAt(r2, r6)
            r8 = 1
            if (r7 != 0) goto L_0x004f
            j$.util.concurrent.n r9 = new j$.util.concurrent.n
            r9.<init>()
            monitor-enter(r9)
            boolean r7 = casTabAt(r2, r6, r0, r9)     // Catch:{ all -> 0x004c }
            if (r7 == 0) goto L_0x0047
            java.lang.Object r4 = r14.apply(r13)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x003b
            j$.util.concurrent.m r5 = new j$.util.concurrent.m     // Catch:{ all -> 0x0042 }
            r5.<init>(r1, r13, r4, r0)     // Catch:{ all -> 0x0042 }
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            setTabAt(r2, r6, r5)     // Catch:{ all -> 0x004c }
            r5 = r4
            r4 = 1
            goto L_0x0047
        L_0x0042:
            r13 = move-exception
            setTabAt(r2, r6, r0)     // Catch:{ all -> 0x004c }
            throw r13     // Catch:{ all -> 0x004c }
        L_0x0047:
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0012
            goto L_0x00c3
        L_0x004c:
            r13 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            throw r13
        L_0x004f:
            int r9 = r7.f64557a
            r10 = -1
            if (r9 != r10) goto L_0x0059
            j$.util.concurrent.m[] r2 = r12.helpTransfer(r2, r7)
            goto L_0x0012
        L_0x0059:
            monitor-enter(r7)
            j$.util.concurrent.m r10 = tabAt(r2, r6)     // Catch:{ all -> 0x00cb }
            if (r10 != r7) goto L_0x00b5
            if (r9 < 0) goto L_0x0094
            r4 = r7
            r5 = 1
        L_0x0064:
            int r9 = r4.f64557a     // Catch:{ all -> 0x00cb }
            if (r9 != r1) goto L_0x0077
            java.lang.Object r9 = r4.f64558b     // Catch:{ all -> 0x00cb }
            if (r9 == r13) goto L_0x0074
            if (r9 == 0) goto L_0x0077
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x0077
        L_0x0074:
            java.lang.Object r4 = r4.f64559c     // Catch:{ all -> 0x00cb }
            goto L_0x008b
        L_0x0077:
            j$.util.concurrent.m r9 = r4.f64560d     // Catch:{ all -> 0x00cb }
            if (r9 != 0) goto L_0x0090
            java.lang.Object r9 = r14.apply(r13)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x008a
            j$.util.concurrent.m r10 = new j$.util.concurrent.m     // Catch:{ all -> 0x00cb }
            r10.<init>(r1, r13, r9, r0)     // Catch:{ all -> 0x00cb }
            r4.f64560d = r10     // Catch:{ all -> 0x00cb }
            r4 = r9
            goto L_0x008c
        L_0x008a:
            r4 = r9
        L_0x008b:
            r8 = 0
        L_0x008c:
            r11 = r5
            r5 = r4
            r4 = r11
            goto L_0x00b6
        L_0x0090:
            int r5 = r5 + 1
            r4 = r9
            goto L_0x0064
        L_0x0094:
            boolean r9 = r7 instanceof p988j$.util.concurrent.C25903r     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00b5
            r4 = 2
            r5 = r7
            j$.util.concurrent.r r5 = (p988j$.util.concurrent.C25903r) r5     // Catch:{ all -> 0x00cb }
            j$.util.concurrent.s r9 = r5.f64575e     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00a9
            j$.util.concurrent.s r9 = r9.mo83982b(r1, r13, r0)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00a9
            java.lang.Object r5 = r9.f64559c     // Catch:{ all -> 0x00cb }
            goto L_0x00b5
        L_0x00a9:
            java.lang.Object r9 = r14.apply(r13)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00b4
            r5.mo83980f(r1, r13, r9)     // Catch:{ all -> 0x00cb }
            r5 = r9
            goto L_0x00b6
        L_0x00b4:
            r5 = r9
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            monitor-exit(r7)     // Catch:{ all -> 0x00cb }
            if (r4 == 0) goto L_0x0012
            r13 = 8
            if (r4 < r13) goto L_0x00c0
            r12.treeifyBin(r2, r6)
        L_0x00c0:
            if (r8 != 0) goto L_0x00c3
            return r5
        L_0x00c3:
            if (r5 == 0) goto L_0x00ca
            r13 = 1
            r12.addCount(r13, r4)
        L_0x00ca:
            return r5
        L_0x00cb:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00cb }
            throw r13
        L_0x00ce:
            j$.util.concurrent.m[] r2 = r12.initTable()
            goto L_0x0012
        L_0x00d4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        r5 = r15.apply(r14, r8.f64559c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r5 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r8.f64559c = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        r3 = r8.f64560d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r10 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r10.f64560d = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0097, code lost:
        if (r3 == 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0099, code lost:
        addCount((long) r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V computeIfPresent(K r14, p988j$.util.function.BiFunction<? super K, ? super V, ? extends V> r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x00a7
            if (r15 == 0) goto L_0x00a7
            int r1 = r14.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.m[] r2 = r13.table
            r3 = 0
            r5 = r0
            r4 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x00a1
            int r6 = r2.length
            if (r6 != 0) goto L_0x0019
            goto L_0x00a1
        L_0x0019:
            int r6 = r6 + -1
            r6 = r6 & r1
            j$.util.concurrent.m r7 = tabAt(r2, r6)
            if (r7 != 0) goto L_0x0024
            goto L_0x0097
        L_0x0024:
            int r8 = r7.f64557a
            r9 = -1
            if (r8 != r9) goto L_0x002e
            j$.util.concurrent.m[] r2 = r13.helpTransfer(r2, r7)
            goto L_0x0012
        L_0x002e:
            monitor-enter(r7)
            j$.util.concurrent.m r10 = tabAt(r2, r6)     // Catch:{ all -> 0x009e }
            if (r10 != r7) goto L_0x0094
            if (r8 < 0) goto L_0x0067
            r4 = 1
            r10 = r0
            r8 = r7
        L_0x003a:
            int r11 = r8.f64557a     // Catch:{ all -> 0x009e }
            if (r11 != r1) goto L_0x005c
            java.lang.Object r11 = r8.f64558b     // Catch:{ all -> 0x009e }
            if (r11 == r14) goto L_0x004a
            if (r11 == 0) goto L_0x005c
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x009e }
            if (r11 == 0) goto L_0x005c
        L_0x004a:
            java.lang.Object r5 = r8.f64559c     // Catch:{ all -> 0x009e }
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x0055
            r8.f64559c = r5     // Catch:{ all -> 0x009e }
            goto L_0x0094
        L_0x0055:
            j$.util.concurrent.m r3 = r8.f64560d     // Catch:{ all -> 0x009e }
            if (r10 == 0) goto L_0x0090
            r10.f64560d = r3     // Catch:{ all -> 0x009e }
            goto L_0x0093
        L_0x005c:
            j$.util.concurrent.m r10 = r8.f64560d     // Catch:{ all -> 0x009e }
            if (r10 != 0) goto L_0x0061
            goto L_0x0094
        L_0x0061:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L_0x003a
        L_0x0067:
            boolean r8 = r7 instanceof p988j$.util.concurrent.C25903r     // Catch:{ all -> 0x009e }
            if (r8 == 0) goto L_0x0094
            r4 = 2
            r8 = r7
            j$.util.concurrent.r r8 = (p988j$.util.concurrent.C25903r) r8     // Catch:{ all -> 0x009e }
            j$.util.concurrent.s r10 = r8.f64575e     // Catch:{ all -> 0x009e }
            if (r10 == 0) goto L_0x0094
            j$.util.concurrent.s r10 = r10.mo83982b(r1, r14, r0)     // Catch:{ all -> 0x009e }
            if (r10 == 0) goto L_0x0094
            java.lang.Object r5 = r10.f64559c     // Catch:{ all -> 0x009e }
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x0084
            r10.f64559c = r5     // Catch:{ all -> 0x009e }
            goto L_0x0094
        L_0x0084:
            boolean r3 = r8.mo83981g(r10)     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x0093
            j$.util.concurrent.s r3 = r8.f64576f     // Catch:{ all -> 0x009e }
            j$.util.concurrent.m r3 = untreeify(r3)     // Catch:{ all -> 0x009e }
        L_0x0090:
            setTabAt(r2, r6, r3)     // Catch:{ all -> 0x009e }
        L_0x0093:
            r3 = -1
        L_0x0094:
            monitor-exit(r7)     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0012
        L_0x0097:
            if (r3 == 0) goto L_0x009d
            long r14 = (long) r3
            r13.addCount(r14, r4)
        L_0x009d:
            return r5
        L_0x009e:
            r14 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009e }
            throw r14
        L_0x00a1:
            j$.util.concurrent.m[] r2 = r13.initTable()
            goto L_0x0012
        L_0x00a7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        obj.getClass();
        C25898m[] mVarArr = this.table;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d == null) {
                    break;
                }
                Object obj2 = d.f64559c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Enumeration<V> elements() {
        C25898m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C25894i(mVarArr, length, length, this, 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C25891f fVar = this.entrySet;
        if (fVar != null) {
            return fVar;
        }
        C25891f fVar2 = new C25891f(this);
        this.entrySet = fVar2;
        return fVar2;
    }

    public boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C25898m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        C25902q qVar = new C25902q(mVarArr, length, 0, length);
        while (true) {
            C25898m d = qVar.mo83979d();
            if (d != null) {
                Object obj3 = d.f64559c;
                Object obj4 = map.get(d.f64558b);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    return false;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        biConsumer.getClass();
        C25898m[] mVarArr = this.table;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d != null) {
                    biConsumer.accept(d.f64558b, d.f64559c);
                } else {
                    return;
                }
            }
        }
    }

    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return r1.f64559c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.m[] r1 = r4.table
            r2 = 0
            if (r1 == 0) goto L_0x004e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004e
            int r3 = r3 + -1
            r3 = r3 & r0
            j$.util.concurrent.m r1 = tabAt(r1, r3)
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f64557a
            if (r3 != r0) goto L_0x002c
            java.lang.Object r3 = r1.f64558b
            if (r3 == r5) goto L_0x0029
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x0029:
            java.lang.Object r5 = r1.f64559c
            return r5
        L_0x002c:
            if (r3 >= 0) goto L_0x0037
            j$.util.concurrent.m r5 = r1.mo83961a(r0, r5)
            if (r5 == 0) goto L_0x0036
            java.lang.Object r2 = r5.f64559c
        L_0x0036:
            return r2
        L_0x0037:
            j$.util.concurrent.m r1 = r1.f64560d
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f64557a
            if (r3 != r0) goto L_0x0037
            java.lang.Object r3 = r1.f64558b
            if (r3 == r5) goto L_0x004b
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x004b:
            java.lang.Object r5 = r1.f64559c
            return r5
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 == null ? v : v2;
    }

    public int hashCode() {
        C25898m[] mVarArr = this.table;
        int i = 0;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d == null) {
                    break;
                }
                i += d.f64559c.hashCode() ^ d.f64558b.hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final C25898m[] helpTransfer(C25898m[] mVarArr, C25898m mVar) {
        C25898m[] mVarArr2;
        int i;
        if (mVarArr == null || !(mVar instanceof C25893h) || (mVarArr2 = ((C25893h) mVar).f64550e) == null) {
            return this.table;
        }
        int resizeStamp = resizeStamp(mVarArr.length);
        while (true) {
            if (mVarArr2 != this.nextTable || this.table != mVarArr || (i = this.sizeCtl) >= 0 || (i >>> RESIZE_STAMP_SHIFT) != resizeStamp || i == resizeStamp + 1 || i == MAX_RESIZERS + resizeStamp || this.transferIndex <= 0) {
                break;
            }
            if (f64537U.compareAndSwapInt(this, SIZECTL, i, i + 1)) {
                transfer(mVarArr, mVarArr2);
                break;
            }
        }
        return mVarArr2;
    }

    public boolean isEmpty() {
        return sumCount() <= 0;
    }

    public Set<K> keySet() {
        C25895j jVar = this.keySet;
        if (jVar != null) {
            return jVar;
        }
        C25895j jVar2 = new C25895j(this);
        this.keySet = jVar2;
        return jVar2;
    }

    public Enumeration<K> keys() {
        C25898m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C25894i(mVarArr, length, length, this, 0);
    }

    public long mappingCount() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        return sumCount;
    }

    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        int i;
        V v2;
        K k2;
        K k3 = k;
        V v3 = v;
        BiFunction<? super V, ? super V, ? extends V> biFunction2 = biFunction;
        if (k3 == null || v3 == null || biFunction2 == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C25898m[] mVarArr = this.table;
        int i2 = 0;
        V v4 = null;
        int i3 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & spread;
                    C25898m tabAt = tabAt(mVarArr, i4);
                    i = 1;
                    if (tabAt != null) {
                        int i5 = tabAt.f64557a;
                        if (i5 == -1) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr, i4) == tabAt) {
                                    if (i5 >= 0) {
                                        C25898m mVar = null;
                                        C25898m mVar2 = tabAt;
                                        int i6 = 1;
                                        while (true) {
                                            if (mVar2.f64557a != spread || ((k2 = mVar2.f64558b) != k3 && (k2 == null || !k3.equals(k2)))) {
                                                C25898m mVar3 = mVar2.f64560d;
                                                if (mVar3 == null) {
                                                    mVar2.f64560d = new C25898m(spread, k3, v3, (C25898m) null);
                                                    v2 = v3;
                                                    i3 = 1;
                                                    break;
                                                }
                                                i6++;
                                                C25898m mVar4 = mVar3;
                                                mVar = mVar2;
                                                mVar2 = mVar4;
                                            }
                                        }
                                        v2 = biFunction2.apply(mVar2.f64559c, v3);
                                        if (v2 != null) {
                                            mVar2.f64559c = v2;
                                        } else {
                                            C25898m mVar5 = mVar2.f64560d;
                                            if (mVar != null) {
                                                mVar.f64560d = mVar5;
                                            } else {
                                                setTabAt(mVarArr, i4, mVar5);
                                            }
                                            i3 = -1;
                                        }
                                        i2 = i6;
                                        v4 = v2;
                                    } else if (tabAt instanceof C25903r) {
                                        i2 = 2;
                                        C25903r rVar = (C25903r) tabAt;
                                        C25904s sVar = rVar.f64575e;
                                        C25904s b = sVar == null ? null : sVar.mo83982b(spread, k3, (Class) null);
                                        V apply = b == null ? v3 : biFunction2.apply(b.f64559c, v3);
                                        if (apply != null) {
                                            if (b != null) {
                                                b.f64559c = apply;
                                            } else {
                                                rVar.mo83980f(spread, k3, apply);
                                                v4 = apply;
                                                i3 = 1;
                                            }
                                        } else if (b != null) {
                                            if (rVar.mo83981g(b)) {
                                                setTabAt(mVarArr, i4, untreeify(rVar.f64576f));
                                            }
                                            v4 = apply;
                                            i3 = -1;
                                        }
                                        v4 = apply;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    treeifyBin(mVarArr, i4);
                                }
                                i = i3;
                                v3 = v4;
                            }
                        }
                    } else if (casTabAt(mVarArr, i4, (C25898m) null, new C25898m(spread, k3, v3, (C25898m) null))) {
                        break;
                    }
                }
            }
            mVarArr = initTable();
        }
        if (i != 0) {
            addCount((long) i, i2);
        }
        return v3;
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public V put(K k, V v) {
        return putVal(k, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        tryPresize(map.size());
        for (Map.Entry next : map.entrySet()) {
            putVal(next.getKey(), next.getValue(), false);
        }
    }

    public V putIfAbsent(K k, V v) {
        return putVal(k, v, true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r11 == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V putVal(K r9, V r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0098
            if (r10 == 0) goto L_0x0098
            int r1 = r9.hashCode()
            int r1 = spread(r1)
            r2 = 0
            j$.util.concurrent.m[] r3 = r8.table
        L_0x0010:
            if (r3 == 0) goto L_0x0092
            int r4 = r3.length
            if (r4 != 0) goto L_0x0017
            goto L_0x0092
        L_0x0017:
            int r4 = r4 + -1
            r4 = r4 & r1
            j$.util.concurrent.m r5 = tabAt(r3, r4)
            if (r5 != 0) goto L_0x002c
            j$.util.concurrent.m r5 = new j$.util.concurrent.m
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = casTabAt(r3, r4, r0, r5)
            if (r4 == 0) goto L_0x0010
            goto L_0x0089
        L_0x002c:
            int r6 = r5.f64557a
            r7 = -1
            if (r6 != r7) goto L_0x0036
            j$.util.concurrent.m[] r3 = r8.helpTransfer(r3, r5)
            goto L_0x0010
        L_0x0036:
            monitor-enter(r5)
            j$.util.concurrent.m r7 = tabAt(r3, r4)     // Catch:{ all -> 0x008f }
            if (r7 != r5) goto L_0x007b
            if (r6 < 0) goto L_0x0068
            r2 = 1
            r6 = r5
        L_0x0041:
            int r7 = r6.f64557a     // Catch:{ all -> 0x008f }
            if (r7 != r1) goto L_0x0058
            java.lang.Object r7 = r6.f64558b     // Catch:{ all -> 0x008f }
            if (r7 == r9) goto L_0x0051
            if (r7 == 0) goto L_0x0058
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x0058
        L_0x0051:
            java.lang.Object r7 = r6.f64559c     // Catch:{ all -> 0x008f }
            if (r11 != 0) goto L_0x007c
        L_0x0055:
            r6.f64559c = r10     // Catch:{ all -> 0x008f }
            goto L_0x007c
        L_0x0058:
            j$.util.concurrent.m r7 = r6.f64560d     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x0064
            j$.util.concurrent.m r7 = new j$.util.concurrent.m     // Catch:{ all -> 0x008f }
            r7.<init>(r1, r9, r10, r0)     // Catch:{ all -> 0x008f }
            r6.f64560d = r7     // Catch:{ all -> 0x008f }
            goto L_0x007b
        L_0x0064:
            int r2 = r2 + 1
            r6 = r7
            goto L_0x0041
        L_0x0068:
            boolean r6 = r5 instanceof p988j$.util.concurrent.C25903r     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x007b
            r2 = 2
            r6 = r5
            j$.util.concurrent.r r6 = (p988j$.util.concurrent.C25903r) r6     // Catch:{ all -> 0x008f }
            j$.util.concurrent.s r6 = r6.mo83980f(r1, r9, r10)     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x007b
            java.lang.Object r7 = r6.f64559c     // Catch:{ all -> 0x008f }
            if (r11 != 0) goto L_0x007c
            goto L_0x0055
        L_0x007b:
            r7 = r0
        L_0x007c:
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0010
            r9 = 8
            if (r2 < r9) goto L_0x0086
            r8.treeifyBin(r3, r4)
        L_0x0086:
            if (r7 == 0) goto L_0x0089
            return r7
        L_0x0089:
            r9 = 1
            r8.addCount(r9, r2)
            return r0
        L_0x008f:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            throw r9
        L_0x0092:
            j$.util.concurrent.m[] r3 = r8.initTable()
            goto L_0x0010
        L_0x0098:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.putVal(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public V remove(Object obj) {
        return replaceNode(obj, (Object) null, (Object) null);
    }

    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || replaceNode(obj, (Object) null, obj2) == null) ? false : true;
    }

    public V replace(K k, V v) {
        if (k != null && v != null) {
            return replaceNode(k, v, (Object) null);
        }
        throw null;
    }

    public boolean replace(K k, V v, V v2) {
        if (k != null && v != null && v2 != null) {
            return replaceNode(k, v2, v) != null;
        }
        throw null;
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        biFunction.getClass();
        C25898m[] mVarArr = this.table;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d != null) {
                    Object obj = d.f64559c;
                    Object obj2 = d.f64558b;
                    do {
                        Object apply = biFunction.apply(obj2, obj);
                        apply.getClass();
                        if (replaceNode(obj2, apply, obj) != null || (obj = get(obj2)) == null) {
                        }
                        Object apply2 = biFunction.apply(obj2, obj);
                        apply2.getClass();
                        break;
                    } while ((obj = get(obj2)) == null);
                } else {
                    return;
                }
            }
        }
    }

    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b0, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V replaceNode(java.lang.Object r13, V r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.m[] r1 = r12.table
        L_0x000a:
            r2 = 0
            if (r1 == 0) goto L_0x00b0
            int r3 = r1.length
            if (r3 == 0) goto L_0x00b0
            int r3 = r3 + -1
            r3 = r3 & r0
            j$.util.concurrent.m r4 = tabAt(r1, r3)
            if (r4 != 0) goto L_0x001b
            goto L_0x00b0
        L_0x001b:
            int r5 = r4.f64557a
            r6 = -1
            if (r5 != r6) goto L_0x0025
            j$.util.concurrent.m[] r1 = r12.helpTransfer(r1, r4)
            goto L_0x000a
        L_0x0025:
            r7 = 0
            monitor-enter(r4)
            j$.util.concurrent.m r8 = tabAt(r1, r3)     // Catch:{ all -> 0x00ad }
            r9 = 1
            if (r8 != r4) goto L_0x009f
            if (r5 < 0) goto L_0x006b
            r7 = r2
            r5 = r4
        L_0x0032:
            int r8 = r5.f64557a     // Catch:{ all -> 0x00ad }
            if (r8 != r0) goto L_0x0062
            java.lang.Object r8 = r5.f64558b     // Catch:{ all -> 0x00ad }
            if (r8 == r13) goto L_0x0042
            if (r8 == 0) goto L_0x0062
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x0062
        L_0x0042:
            java.lang.Object r8 = r5.f64559c     // Catch:{ all -> 0x00ad }
            if (r15 == 0) goto L_0x0050
            if (r15 == r8) goto L_0x0050
            if (r8 == 0) goto L_0x009c
            boolean r10 = r15.equals(r8)     // Catch:{ all -> 0x00ad }
            if (r10 == 0) goto L_0x009c
        L_0x0050:
            if (r14 == 0) goto L_0x0055
            r5.f64559c = r14     // Catch:{ all -> 0x00ad }
            goto L_0x009d
        L_0x0055:
            if (r7 == 0) goto L_0x005c
            j$.util.concurrent.m r3 = r5.f64560d     // Catch:{ all -> 0x00ad }
            r7.f64560d = r3     // Catch:{ all -> 0x00ad }
            goto L_0x009d
        L_0x005c:
            j$.util.concurrent.m r5 = r5.f64560d     // Catch:{ all -> 0x00ad }
        L_0x005e:
            setTabAt(r1, r3, r5)     // Catch:{ all -> 0x00ad }
            goto L_0x009d
        L_0x0062:
            j$.util.concurrent.m r7 = r5.f64560d     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x0067
            goto L_0x009c
        L_0x0067:
            r11 = r7
            r7 = r5
            r5 = r11
            goto L_0x0032
        L_0x006b:
            boolean r5 = r4 instanceof p988j$.util.concurrent.C25903r     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x009f
            r5 = r4
            j$.util.concurrent.r r5 = (p988j$.util.concurrent.C25903r) r5     // Catch:{ all -> 0x00ad }
            j$.util.concurrent.s r7 = r5.f64575e     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x009c
            j$.util.concurrent.s r7 = r7.mo83982b(r0, r13, r2)     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x009c
            java.lang.Object r8 = r7.f64559c     // Catch:{ all -> 0x00ad }
            if (r15 == 0) goto L_0x008a
            if (r15 == r8) goto L_0x008a
            if (r8 == 0) goto L_0x009c
            boolean r10 = r15.equals(r8)     // Catch:{ all -> 0x00ad }
            if (r10 == 0) goto L_0x009c
        L_0x008a:
            if (r14 == 0) goto L_0x008f
            r7.f64559c = r14     // Catch:{ all -> 0x00ad }
            goto L_0x009d
        L_0x008f:
            boolean r7 = r5.mo83981g(r7)     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x009d
            j$.util.concurrent.s r5 = r5.f64576f     // Catch:{ all -> 0x00ad }
            j$.util.concurrent.m r5 = untreeify(r5)     // Catch:{ all -> 0x00ad }
            goto L_0x005e
        L_0x009c:
            r8 = r2
        L_0x009d:
            r7 = 1
            goto L_0x00a0
        L_0x009f:
            r8 = r2
        L_0x00a0:
            monitor-exit(r4)     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x000a
            if (r8 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x00ac
            r13 = -1
            r12.addCount(r13, r6)
        L_0x00ac:
            return r8
        L_0x00ad:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ad }
            throw r13
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.ConcurrentHashMap.replaceNode(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int size() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        if (sumCount > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) sumCount;
    }

    /* access modifiers changed from: package-private */
    public final long sumCount() {
        C25889d[] dVarArr = this.counterCells;
        long j = this.baseCount;
        if (dVarArr != null) {
            for (C25889d dVar : dVarArr) {
                if (dVar != null) {
                    j += dVar.value;
                }
            }
        }
        return j;
    }

    public String toString() {
        C25898m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        C25902q qVar = new C25902q(mVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        C25898m d = qVar.mo83979d();
        if (d != null) {
            while (true) {
                Object obj = d.f64558b;
                Object obj2 = d.f64559c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                d = qVar.mo83979d();
                if (d == null) {
                    break;
                }
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Collection<V> values() {
        C25905t tVar = this.values;
        if (tVar != null) {
            return tVar;
        }
        C25905t tVar2 = new C25905t(this);
        this.values = tVar2;
        return tVar2;
    }
}
