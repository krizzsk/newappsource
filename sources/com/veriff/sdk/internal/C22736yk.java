package com.veriff.sdk.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p358af.C13437d;

/* renamed from: com.veriff.sdk.internal.yk */
public final class C22736yk {

    /* renamed from: a */
    private final String[] f57520a;

    public C22736yk(C22737a aVar) {
        List<String> list = aVar.f57521a;
        this.f57520a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: c */
    public static void m55555c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C22766za.m55824a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: a */
    public String mo57267a(String str) {
        return m55553a(this.f57520a, str);
    }

    /* renamed from: b */
    public String mo57269b(int i) {
        return this.f57520a[(i * 2) + 1];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22736yk) || !Arrays.equals(((C22736yk) obj).f57520a, this.f57520a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f57520a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int a = mo57265a();
        for (int i = 0; i < a; i++) {
            sb.append(mo57266a(i));
            sb.append(": ");
            sb.append(mo57269b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: com.veriff.sdk.internal.yk$a */
    public static final class C22737a {

        /* renamed from: a */
        public final List<String> f57521a = new ArrayList(20);

        /* renamed from: a */
        public C22737a mo57275a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return mo57279b(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return mo57279b("", str.substring(1));
            }
            return mo57279b("", str);
        }

        /* renamed from: b */
        public C22737a mo57279b(String str, String str2) {
            this.f57521a.add(str);
            this.f57521a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C22737a mo57280c(String str, String str2) {
            C22736yk.m55555c(str);
            C22736yk.m55554a(str2, str);
            mo57278b(str);
            mo57279b(str, str2);
            return this;
        }

        /* renamed from: b */
        public C22737a mo57278b(String str) {
            int i = 0;
            while (i < this.f57521a.size()) {
                if (str.equalsIgnoreCase(this.f57521a.get(i))) {
                    this.f57521a.remove(i);
                    this.f57521a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public String mo57281c(String str) {
            for (int size = this.f57521a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f57521a.get(size))) {
                    return this.f57521a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: a */
        public C22737a mo57276a(String str, String str2) {
            C22736yk.m55555c(str);
            C22736yk.m55554a(str2, str);
            return mo57279b(str, str2);
        }

        /* renamed from: a */
        public C22737a mo57274a(C22736yk ykVar) {
            int a = ykVar.mo57265a();
            for (int i = 0; i < a; i++) {
                mo57279b(ykVar.mo57266a(i), ykVar.mo57269b(i));
            }
            return this;
        }

        /* renamed from: a */
        public C22736yk mo57277a() {
            return new C22736yk(this);
        }
    }

    /* renamed from: a */
    public int mo57265a() {
        return this.f57520a.length / 2;
    }

    /* renamed from: b */
    public List<String> mo57270b(String str) {
        int a = mo57265a();
        ArrayList arrayList = null;
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(mo57266a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo57269b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private C22736yk(String[] strArr) {
        this.f57520a = strArr;
    }

    /* renamed from: a */
    public String mo57266a(int i) {
        return this.f57520a[i * 2];
    }

    /* renamed from: a */
    private static String m55553a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C22736yk m55552a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                String str = strArr2[i];
                if (str != null) {
                    strArr2[i] = str.trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                m55555c(str2);
                m55554a(str3, str2);
            }
            return new C22736yk(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    /* renamed from: b */
    public C22737a mo57268b() {
        C22737a aVar = new C22737a();
        Collections.addAll(aVar.f57521a, this.f57520a);
        return aVar;
    }

    /* renamed from: a */
    public static void m55554a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C22766za.m55824a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(C13437d.m33706k("value for name ", str2, " == null"));
    }
}
