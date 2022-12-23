package hi0;

import ii0.C23610d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p358af.C13437d;

/* renamed from: hi0.q */
public final class C23556q {

    /* renamed from: a */
    public final String[] f59531a;

    /* renamed from: hi0.q$a */
    public static final class C23557a {

        /* renamed from: a */
        public final ArrayList f59532a = new ArrayList(20);

        /* renamed from: a */
        public final void mo58690a(String str, String str2) {
            C23556q.m57707a(str);
            C23556q.m57708b(str2, str);
            mo58692c(str, str2);
        }

        /* renamed from: b */
        public final void mo58691b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                mo58692c(str.substring(0, indexOf), str.substring(indexOf + 1));
            } else if (str.startsWith(":")) {
                mo58692c("", str.substring(1));
            } else {
                mo58692c("", str);
            }
        }

        /* renamed from: c */
        public final void mo58692c(String str, String str2) {
            this.f59532a.add(str);
            this.f59532a.add(str2.trim());
        }

        /* renamed from: d */
        public final String mo58693d(String str) {
            int size = this.f59532a.size();
            do {
                size -= 2;
                if (size < 0) {
                    return null;
                }
            } while (!str.equalsIgnoreCase((String) this.f59532a.get(size)));
            return (String) this.f59532a.get(size + 1);
        }

        /* renamed from: e */
        public final void mo58694e(String str) {
            int i = 0;
            while (i < this.f59532a.size()) {
                if (str.equalsIgnoreCase((String) this.f59532a.get(i))) {
                    this.f59532a.remove(i);
                    this.f59532a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }

        /* renamed from: f */
        public final void mo58695f(String str, String str2) {
            C23556q.m57707a(str);
            C23556q.m57708b(str2, str);
            mo58694e(str);
            mo58692c(str, str2);
        }
    }

    public C23556q(C23557a aVar) {
        ArrayList arrayList = aVar.f59532a;
        this.f59531a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static void m57707a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C23610d.m57802j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: b */
    public static void m57708b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C23610d.m57802j("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(C13437d.m33706k("value for name ", str2, " == null"));
    }

    /* renamed from: f */
    public static C23556q m57709f(String... strArr) {
        if (strArr.length % 2 == 0) {
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
                m57707a(str2);
                m57708b(str3, str2);
            }
            return new C23556q(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    /* renamed from: c */
    public final String mo58682c(String str) {
        String[] strArr = this.f59531a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    /* renamed from: d */
    public final String mo58683d(int i) {
        return this.f59531a[i * 2];
    }

    /* renamed from: e */
    public final C23557a mo58684e() {
        C23557a aVar = new C23557a();
        Collections.addAll(aVar.f59532a, this.f59531a);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23556q) || !Arrays.equals(((C23556q) obj).f59531a, this.f59531a)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final String mo58686g(int i) {
        return this.f59531a[(i * 2) + 1];
    }

    /* renamed from: h */
    public final List<String> mo58687h(String str) {
        int length = this.f59531a.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(mo58683d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo58686g(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f59531a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f59531a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(mo58683d(i));
            sb.append(": ");
            sb.append(mo58686g(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public C23556q(String[] strArr) {
        this.f59531a = strArr;
    }
}
