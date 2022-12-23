package p193o4;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o4.d */
public class C5978d {

    /* renamed from: a */
    public ArrayList<String> f19124a = new ArrayList<>();

    public C5978d() {
    }

    public C5978d(String str) {
        String[] split;
        if (str != null && (split = str.split("/")) != null) {
            for (String str2 : split) {
                if (str2.length() > 0) {
                    this.f19124a.add(str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo21963a(int i) {
        return this.f19124a.get(i);
    }

    /* renamed from: b */
    public final String mo21964b() {
        if (this.f19124a.isEmpty()) {
            return null;
        }
        return this.f19124a.get(this.f19124a.size() - 1);
    }

    /* renamed from: c */
    public final int mo21965c() {
        return this.f19124a.size();
    }

    /* renamed from: d */
    public final String mo21966d() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f19124a.iterator();
        while (it.hasNext()) {
            C16530d.m42019l(sb, "[", it.next(), "]");
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5978d)) {
            return false;
        }
        C5978d dVar = (C5978d) obj;
        if (dVar.mo21965c() != mo21965c()) {
            return false;
        }
        int c = mo21965c();
        for (int i = 0; i < c; i++) {
            if (!mo21963a(i).equalsIgnoreCase(dVar.mo21963a(i))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return mo21966d();
    }
}
