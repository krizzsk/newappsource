package p693nz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import p693nz.C18656g;
import p810sz.C19589j;
import p810sz.C19600l;

/* renamed from: nz.e */
public abstract class C18653e<K, V> extends C18656g<K, V, C18654a> {
    public C18653e(File file, long j, boolean z, C19589j<? extends V> jVar, C19600l<? super V> lVar) {
        super(file, j, z, jVar, lVar);
    }

    /* renamed from: a */
    public final void mo39744a(K k) {
        mo51038c();
        mo51038c();
        if (this.f47526g.containsKey(mo39749j(k))) {
            mo51036p(k);
        }
    }

    /* renamed from: b */
    public final V mo51033b(K k) {
        V b = super.mo51033b(k);
        if (b != null) {
            mo51036p(k);
        }
        return b;
    }

    /* renamed from: f */
    public final int compare(String str, String str2) {
        int compareTo = str.compareTo(str2);
        if (compareTo == 0) {
            return Long.compare(((C18654a) ((C18656g.C18657a) this.f47526g.get(str))).f47519c, ((C18654a) ((C18656g.C18657a) this.f47526g.get(str2))).f47519c);
        }
        return compareTo;
    }

    /* renamed from: g */
    public final C18656g.C18657a mo39746g(DataInputStream dataInputStream) throws IOException {
        return new C18654a(dataInputStream);
    }

    /* renamed from: h */
    public final C18656g.C18657a mo39748h(Object obj, String str, Object obj2) {
        return new C18654a(str, mo23807k(obj, obj2));
    }

    /* renamed from: m */
    public final boolean mo39750m(C18656g.C18657a aVar) {
        if (System.currentTimeMillis() > ((C18654a) aVar).f47518b) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void mo51036p(K k) {
        C18654a aVar = (C18654a) ((C18656g.C18657a) this.f47526g.get(mo39749j(k)));
        if (aVar != null) {
            this.f47526g.put(new C18654a(aVar.f47530a, aVar.f47518b), String.valueOf(k));
            mo51039d();
            return;
        }
        throw new IllegalArgumentException("No entry with key " + k + " found");
    }

    /* renamed from: nz.e$a */
    public static class C18654a extends C18656g.C18657a {

        /* renamed from: b */
        public final long f47518b;

        /* renamed from: c */
        public final long f47519c;

        public C18654a(DataInputStream dataInputStream) throws IOException {
            super(dataInputStream);
            this.f47518b = dataInputStream.readLong();
            this.f47519c = dataInputStream.readLong();
        }

        /* renamed from: a */
        public final void mo39757a(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeUTF(this.f47530a);
            dataOutputStream.writeLong(this.f47518b);
            dataOutputStream.writeLong(this.f47519c);
        }

        public C18654a(String str, long j) {
            super(str);
            this.f47518b = j;
            this.f47519c = System.currentTimeMillis();
        }
    }
}
