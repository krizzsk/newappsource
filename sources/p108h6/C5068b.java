package p108h6;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;

/* renamed from: h6.b */
public final class C5068b<Data> implements C5104n<byte[], Data> {

    /* renamed from: a */
    public final C5071b<Data> f17067a;

    /* renamed from: h6.b$a */
    public static class C5069a implements C5106o<byte[], ByteBuffer> {

        /* renamed from: h6.b$a$a */
        public class C5070a implements C5071b<ByteBuffer> {
            /* renamed from: a */
            public final Class<ByteBuffer> mo20819a() {
                return ByteBuffer.class;
            }

            /* renamed from: b */
            public final Object mo20820b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: b */
        public final C5104n<byte[], ByteBuffer> mo20818b(C5112r rVar) {
            return new C5068b(new C5070a());
        }
    }

    /* renamed from: h6.b$b */
    public interface C5071b<Data> {
        /* renamed from: a */
        Class<Data> mo20819a();

        /* renamed from: b */
        Data mo20820b(byte[] bArr);
    }

    /* renamed from: h6.b$c */
    public static class C5072c<Data> implements C2142d<Data> {

        /* renamed from: b */
        public final byte[] f17068b;

        /* renamed from: c */
        public final C5071b<Data> f17069c;

        public C5072c(byte[] bArr, C5071b<Data> bVar) {
            this.f17068b = bArr;
            this.f17069c = bVar;
        }

        /* renamed from: a */
        public final Class<Data> mo6607a() {
            return this.f17069c.mo20819a();
        }

        /* renamed from: b */
        public final void mo6608b() {
        }

        public final void cancel() {
        }

        /* renamed from: d */
        public final DataSource mo6610d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo6611e(Priority priority, C2142d.C2143a<? super Data> aVar) {
            aVar.mo10914f(this.f17069c.mo20820b(this.f17068b));
        }
    }

    /* renamed from: h6.b$d */
    public static class C5073d implements C5106o<byte[], InputStream> {

        /* renamed from: h6.b$d$a */
        public class C5074a implements C5071b<InputStream> {
            /* renamed from: a */
            public final Class<InputStream> mo20819a() {
                return InputStream.class;
            }

            /* renamed from: b */
            public final Object mo20820b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: b */
        public final C5104n<byte[], InputStream> mo20818b(C5112r rVar) {
            return new C5068b(new C5074a());
        }
    }

    public C5068b(C5071b<Data> bVar) {
        this.f17067a = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        byte[] bArr = (byte[]) obj;
        return new C5104n.C5105a(new C7000d(bArr), new C5072c(bArr, this.f17067a));
    }
}
