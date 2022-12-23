package x00;

import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

/* renamed from: x00.a */
public final class C20440a {

    /* renamed from: d */
    public static final C20441a f51780d = new C20441a();

    /* renamed from: a */
    public final Image f51781a;

    /* renamed from: b */
    public final CharSequence f51782b;

    /* renamed from: c */
    public final String f51783c;

    /* renamed from: x00.a$a */
    public class C20441a extends C19619s<C20440a> {
        public C20441a() {
            super(1, C20440a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            String t = pVar.mo51948t();
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            return new C20440a(image, t, str);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            String str;
            C20440a aVar = (C20440a) obj;
            qVar.mo51967q(aVar.f51781a, C16019d.m40803a().f41718d);
            CharSequence charSequence = aVar.f51782b;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            qVar.mo51955t(str);
            qVar.mo51955t(aVar.f51783c);
        }
    }

    public C20440a() {
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20440a(Image image, String str) {
        this(image, (CharSequence) null, str);
        C21100e.m49373x(image, "image");
    }

    /* renamed from: a */
    public final boolean mo52636a() {
        return this.f51782b != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20440a)) {
            return false;
        }
        C20440a aVar = (C20440a) obj;
        if (!C20975x0.m49118e(this.f51781a, aVar.f51781a) || !C20975x0.m49118e(this.f51782b, aVar.f51782b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f51781a), C17884p.m44335F(this.f51782b));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20440a(String str, String str2) {
        this((Image) null, str == null ? "" : str, str2);
    }

    public C20440a(Image image, CharSequence charSequence, String str) {
        this.f51781a = image;
        this.f51782b = charSequence;
        this.f51783c = str;
    }
}
