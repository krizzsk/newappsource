package ni0;

import ii0.C23610d;
import okio.ByteString;

/* renamed from: ni0.a */
public final class C24505a {

    /* renamed from: d */
    public static final ByteString f62011d = ByteString.C24633a.m61918a(":");

    /* renamed from: e */
    public static final ByteString f62012e = ByteString.C24633a.m61918a(":status");

    /* renamed from: f */
    public static final ByteString f62013f = ByteString.C24633a.m61918a(":method");

    /* renamed from: g */
    public static final ByteString f62014g = ByteString.C24633a.m61918a(":path");

    /* renamed from: h */
    public static final ByteString f62015h = ByteString.C24633a.m61918a(":scheme");

    /* renamed from: i */
    public static final ByteString f62016i = ByteString.C24633a.m61918a(":authority");

    /* renamed from: a */
    public final ByteString f62017a;

    /* renamed from: b */
    public final ByteString f62018b;

    /* renamed from: c */
    public final int f62019c;

    static {
        ByteString byteString = ByteString.f62330d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24505a(String str, String str2) {
        this(ByteString.C24633a.m61918a(str), ByteString.C24633a.m61918a(str2));
        ByteString byteString = ByteString.f62330d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24505a)) {
            return false;
        }
        C24505a aVar = (C24505a) obj;
        if (!this.f62017a.equals(aVar.f62017a) || !this.f62018b.equals(aVar.f62018b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f62018b.hashCode() + ((this.f62017a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return C23610d.m57802j("%s: %s", this.f62017a.mo60881t(), this.f62018b.mo60881t());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24505a(ByteString byteString, String str) {
        this(byteString, ByteString.C24633a.m61918a(str));
        ByteString byteString2 = ByteString.f62330d;
    }

    public C24505a(ByteString byteString, ByteString byteString2) {
        this.f62017a = byteString;
        this.f62018b = byteString2;
        this.f62019c = byteString2.mo60873k() + byteString.mo60873k() + 32;
    }
}
