package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.zzbp;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import p908xd.C20461e;
import p955zd.C20817b;
import p955zd.C20818c;

@SafeParcelable.Class(creator = "ThingCreator")
public final class Thing extends AbstractSafeParcelable implements C20461e, ReflectedParcelable {
    public static final Parcelable.Creator<Thing> CREATOR = new C20818c();
    @SafeParcelable.Field(getter = "getVersionCode", mo65739id = 1000)

    /* renamed from: b */
    public final int f36334b;
    @SafeParcelable.Field(getter = "getPropertyBundle", mo65739id = 1)

    /* renamed from: c */
    public final Bundle f36335c;
    @SafeParcelable.Field(getter = "getMetadata", mo65739id = 2)

    /* renamed from: d */
    public final zzac f36336d;
    @SafeParcelable.Field(getter = "getUrl", mo65739id = 3)

    /* renamed from: e */
    public final String f36337e;
    @SafeParcelable.Field(getter = "getType", mo65739id = 4)

    /* renamed from: f */
    public final String f36338f;

    @SafeParcelable.Constructor
    public Thing(@SafeParcelable.Param(mo65742id = 1000) int i, @SafeParcelable.Param(mo65742id = 1) Bundle bundle, @SafeParcelable.Param(mo65742id = 2) zzac zzac, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2) {
        this.f36334b = i;
        this.f36335c = bundle;
        this.f36336d = zzac;
        this.f36337e = str;
        this.f36338f = str2;
        ClassLoader classLoader = Thing.class.getClassLoader();
        zzbp.zza(classLoader);
        bundle.setClassLoader(classLoader);
    }

    /* renamed from: i2 */
    public static void m35907i2(Bundle bundle, StringBuilder sb) {
        try {
            Set<String> keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, C20817b.f52543b);
            for (String str : strArr) {
                sb.append("{ key: '");
                sb.append(str);
                sb.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb.append("<null>");
                } else if (obj.getClass().isArray()) {
                    sb.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        sb.append("'");
                        sb.append(Array.get(obj, i));
                        sb.append("' ");
                    }
                    sb.append("]");
                } else {
                    sb.append(obj.toString());
                }
                sb.append(" } ");
            }
        } catch (RuntimeException unused) {
            sb.append("<error>");
        }
    }

    /* renamed from: j2 */
    public static boolean m35908j2(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            Object obj2 = bundle2.get(next);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m35908j2((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(next)) {
                    return false;
                }
                obj2 = null;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k2 */
    public static int m35909k2(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = bundle.get((String) arrayList.get(i));
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(Objects.hashCode(obj)));
            }
        }
        return Objects.hashCode(arrayList2.toArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        if (!Objects.equal(Integer.valueOf(this.f36334b), Integer.valueOf(thing.f36334b)) || !Objects.equal(this.f36337e, thing.f36337e) || !Objects.equal(this.f36338f, thing.f36338f) || !Objects.equal(this.f36336d, thing.f36336d) || !m35908j2(this.f36335c, thing.f36335c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f36334b), this.f36337e, this.f36338f, Integer.valueOf(this.f36336d.hashCode()), Integer.valueOf(m35909k2(this.f36335c)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f36338f.equals("Thing")) {
            str = "Indexable";
        } else {
            str = this.f36338f;
        }
        sb.append(str);
        sb.append(" { { id: ");
        if (this.f36337e == null) {
            sb.append("<null>");
        } else {
            sb.append("'");
            sb.append(this.f36337e);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        m35907i2(this.f36335c, sb);
        sb.append("} Metadata { ");
        sb.append(this.f36336d.toString());
        sb.append(" } }");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.f36335c, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f36336d, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36337e, false);
        SafeParcelWriter.writeString(parcel, 4, this.f36338f, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f36334b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public Thing(Bundle bundle, zzac zzac, String str, String str2) {
        this.f36334b = 10;
        this.f36335c = bundle;
        this.f36336d = zzac;
        this.f36337e = str;
        this.f36338f = str2;
    }
}
