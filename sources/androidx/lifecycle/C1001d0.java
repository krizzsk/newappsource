package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23826d;
import mf0.C24362h;
import p177n1.C5800b;
import p177n1.C5801c;
import p256t2.C6552c;
import zh0.C25527h;

/* renamed from: androidx.lifecycle.d0 */
public final class C1001d0 {

    /* renamed from: f */
    public static final Class<? extends Object>[] f3923f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final LinkedHashMap f3924a;

    /* renamed from: b */
    public final LinkedHashMap f3925b;

    /* renamed from: c */
    public final LinkedHashMap f3926c;

    /* renamed from: d */
    public final LinkedHashMap f3927d;

    /* renamed from: e */
    public final C6552c.C6554b f3928e;

    /* renamed from: androidx.lifecycle.d0$a */
    public static final class C1002a {
        /* renamed from: a */
        public static C1001d0 m2870a(Bundle bundle, Bundle bundle2) {
            boolean z;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(LinksConfiguration.KEY_VALUES);
                int i = 0;
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    while (i < size) {
                        Object obj = parcelableArrayList.get(i);
                        if (obj != null) {
                            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    return new C1001d0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new C1001d0();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                    hashMap.put(next, bundle2.get(next));
                }
                return new C1001d0(hashMap);
            }
        }
    }

    public C1001d0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3924a = linkedHashMap;
        this.f3925b = new LinkedHashMap();
        this.f3926c = new LinkedHashMap();
        this.f3927d = new LinkedHashMap();
        this.f3928e = new C0999c0(this);
        linkedHashMap.putAll(hashMap);
    }

    /* renamed from: a */
    public static Bundle m2865a(C1001d0 d0Var) {
        C24362h.m61211f(d0Var, "this$0");
        for (Map.Entry entry : C23826d.m58535Z(d0Var.f3925b).entrySet()) {
            d0Var.mo4295e(((C6552c.C6554b) entry.getValue()).mo747a(), (String) entry.getKey());
        }
        Set<String> keySet = d0Var.f3924a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(d0Var.f3924a.get(str));
        }
        Pair pair = new Pair("keys", arrayList);
        Pair[] pairArr = {pair, new Pair(LinksConfiguration.KEY_VALUES, arrayList2)};
        Bundle bundle = new Bundle(2);
        for (int i = 0; i < 2; i++) {
            Pair pair2 = pairArr[i];
            String str2 = (String) pair2.mo59066a();
            Object b = pair2.mo59067b();
            if (b == null) {
                bundle.putString(str2, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str2, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str2, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str2, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str2, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str2, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str2, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str2, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str2, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str2, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str2, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str2, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str2, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str2, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str2, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str2, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str2, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str2, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str2, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str2, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                C24362h.m61208c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str2, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str2, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str2, (CharSequence[]) b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str2, (Serializable) b);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + str2 + '\"');
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(str2, (Serializable) b);
            } else if (b instanceof IBinder) {
                C5800b.m14230a(bundle, str2, (IBinder) b);
            } else if (b instanceof Size) {
                C5801c.m14231a(bundle, str2, (Size) b);
            } else if (b instanceof SizeF) {
                C5801c.m14232b(bundle, str2, (SizeF) b);
            } else {
                String canonicalName2 = b.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + str2 + '\"');
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final <T> T mo4292b(String str) {
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        return this.f3924a.get(str);
    }

    /* renamed from: c */
    public final <T> C1043v<T> mo4293c(String str) {
        return mo4294d(false, str, (Object) null);
    }

    /* renamed from: d */
    public final C1043v mo4294d(boolean z, String str, Object obj) {
        C1043v vVar;
        C1003b bVar;
        Object obj2 = this.f3926c.get(str);
        if (obj2 instanceof C1043v) {
            vVar = (C1043v) obj2;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar;
        }
        if (this.f3924a.containsKey(str)) {
            bVar = new C1003b(this, str, this.f3924a.get(str));
        } else if (z) {
            this.f3924a.put(str, obj);
            bVar = new C1003b(this, str, obj);
        } else {
            bVar = new C1003b(this, str);
        }
        this.f3926c.put(str, bVar);
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4295e(java.lang.Object r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            mf0.C24362h.m61211f(r7, r0)
            r0 = 0
            if (r6 != 0) goto L_0x0009
            goto L_0x001b
        L_0x0009:
            java.lang.Class<? extends java.lang.Object>[] r1 = f3923f
            r2 = 29
            r3 = 0
        L_0x000e:
            if (r3 >= r2) goto L_0x0020
            r4 = r1[r3]
            mf0.C24362h.m61208c(r4)
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L_0x001d
        L_0x001b:
            r0 = 1
            goto L_0x0020
        L_0x001d:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0020:
            if (r0 == 0) goto L_0x004a
            java.util.LinkedHashMap r0 = r5.f3926c
            java.lang.Object r0 = r0.get(r7)
            boolean r1 = r0 instanceof androidx.lifecycle.C1043v
            if (r1 == 0) goto L_0x002f
            androidx.lifecycle.v r0 = (androidx.lifecycle.C1043v) r0
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0036
            r0.setValue(r6)
            goto L_0x003b
        L_0x0036:
            java.util.LinkedHashMap r0 = r5.f3924a
            r0.put(r7, r6)
        L_0x003b:
            java.util.LinkedHashMap r0 = r5.f3927d
            java.lang.Object r7 = r0.get(r7)
            zh0.h r7 = (zh0.C25527h) r7
            if (r7 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r7.setValue(r6)
        L_0x0049:
            return
        L_0x004a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't put value with type "
            r0.append(r1)
            mf0.C24362h.m61208c(r6)
            java.lang.Class r6 = r6.getClass()
            r0.append(r6)
            java.lang.String r6 = " into saved state"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1001d0.mo4295e(java.lang.Object, java.lang.String):void");
    }

    /* renamed from: androidx.lifecycle.d0$b */
    public static final class C1003b<T> extends C1043v<T> {

        /* renamed from: a */
        public String f3929a;

        /* renamed from: b */
        public C1001d0 f3930b;

        public C1003b(C1001d0 d0Var, String str, T t) {
            super(t);
            this.f3929a = str;
            this.f3930b = d0Var;
        }

        public final void setValue(T t) {
            C1001d0 d0Var = this.f3930b;
            if (d0Var != null) {
                d0Var.f3924a.put(this.f3929a, t);
                C25527h hVar = (C25527h) d0Var.f3927d.get(this.f3929a);
                if (hVar != null) {
                    hVar.setValue(t);
                }
            }
            super.setValue(t);
        }

        public C1003b(C1001d0 d0Var, String str) {
            this.f3929a = str;
            this.f3930b = d0Var;
        }
    }

    public C1001d0() {
        this.f3924a = new LinkedHashMap();
        this.f3925b = new LinkedHashMap();
        this.f3926c = new LinkedHashMap();
        this.f3927d = new LinkedHashMap();
        this.f3928e = new C0999c0(this);
    }
}
