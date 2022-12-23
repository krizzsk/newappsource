package p108h6;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;

/* renamed from: h6.d */
public final class C5078d<Model, Data> implements C5104n<Model, Data> {

    /* renamed from: a */
    public final C5079a<Data> f17071a;

    /* renamed from: h6.d$a */
    public interface C5079a<Data> {
    }

    /* renamed from: h6.d$b */
    public static final class C5080b<Data> implements C2142d<Data> {

        /* renamed from: b */
        public final String f17072b;

        /* renamed from: c */
        public final C5079a<Data> f17073c;

        /* renamed from: d */
        public ByteArrayInputStream f17074d;

        public C5080b(String str, C5079a<Data> aVar) {
            this.f17072b = str;
            this.f17073c = aVar;
        }

        /* renamed from: a */
        public final Class<Data> mo6607a() {
            ((C5081c.C5082a) this.f17073c).getClass();
            return InputStream.class;
        }

        /* renamed from: b */
        public final void mo6608b() {
            try {
                C5079a<Data> aVar = this.f17073c;
                ByteArrayInputStream byteArrayInputStream = this.f17074d;
                ((C5081c.C5082a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        public final void cancel() {
        }

        /* renamed from: d */
        public final DataSource mo6610d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo6611e(Priority priority, C2142d.C2143a<? super Data> aVar) {
            try {
                ByteArrayInputStream a = ((C5081c.C5082a) this.f17073c).mo20821a(this.f17072b);
                this.f17074d = a;
                aVar.mo10914f(a);
            } catch (IllegalArgumentException e) {
                aVar.mo10913c(e);
            }
        }
    }

    /* renamed from: h6.d$c */
    public static final class C5081c<Model> implements C5106o<Model, InputStream> {

        /* renamed from: a */
        public final C5082a f17075a = new C5082a();

        /* renamed from: h6.d$c$a */
        public class C5082a implements C5079a<InputStream> {
            /* renamed from: a */
            public final ByteArrayInputStream mo20821a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: b */
        public final C5104n<Model, InputStream> mo20818b(C5112r rVar) {
            return new C5078d(this.f17075a);
        }
    }

    public C5078d(C5081c.C5082a aVar) {
        this.f17071a = aVar;
    }

    /* renamed from: a */
    public final boolean mo20815a(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: b */
    public final C5104n.C5105a<Data> mo20816b(Model model, int i, int i2, C1492e eVar) {
        return new C5104n.C5105a<>(new C7000d(model), new C5080b(model.toString(), this.f17071a));
    }
}
