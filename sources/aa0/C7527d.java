package aa0;

import c00.C13722f;
import c00.C13733n;
import ce0.C21100e;
import com.moovit.database.Tokenizer;
import com.moovit.transit.LocationDescriptor;
import java.util.IdentityHashMap;
import java.util.List;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: aa0.d */
public final class C7527d<I> implements C13722f<I> {

    /* renamed from: f */
    public static final C7528a f23004f = new C7528a();

    /* renamed from: b */
    public final C13733n<I, String> f23005b;

    /* renamed from: c */
    public final IdentityHashMap<I, String[]> f23006c;

    /* renamed from: d */
    public String f23007d;

    /* renamed from: e */
    public String[] f23008e;

    /* renamed from: aa0.d$a */
    public class C7528a implements C13733n<LocationDescriptor, String> {
        public final Object convert(Object obj) throws Exception {
            LocationDescriptor locationDescriptor = (LocationDescriptor) obj;
            StringBuilder sb = new StringBuilder();
            String str = locationDescriptor.f23651f;
            if (str != null) {
                sb.append(str);
                sb.append(' ');
            }
            List<C20440a> list = locationDescriptor.f23652g;
            if (list != null) {
                for (C20440a next : list) {
                    if (next.mo52636a()) {
                        sb.append(next.f51782b);
                        sb.append(' ');
                    }
                }
            }
            return sb.toString();
        }
    }

    public C7527d() {
        throw null;
    }

    public C7527d(C13733n<I, String> nVar) {
        C21100e.m49373x(nVar, "converter");
        this.f23005b = nVar;
        this.f23006c = new IdentityHashMap<>();
        mo23793a((String) null);
    }

    /* renamed from: a */
    public final void mo23793a(String str) {
        this.f23007d = str;
        this.f23008e = null;
    }

    /* renamed from: o */
    public final boolean mo19661o(I i) {
        boolean z;
        if (C20964s0.m49090h(this.f23007d)) {
            return true;
        }
        String str = this.f23007d;
        if (str != null && this.f23008e == null) {
            this.f23008e = Tokenizer.tokenizeQuery(str);
        }
        String[] strArr = this.f23008e;
        String[] strArr2 = this.f23006c.get(i);
        if (strArr2 == null) {
            strArr2 = Tokenizer.tokenizeQuery(this.f23005b.convert(i));
            this.f23006c.put(i, strArr2);
        }
        if (strArr2.length == 0) {
            return false;
        }
        for (String str2 : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (strArr2[i2].startsWith(str2)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
