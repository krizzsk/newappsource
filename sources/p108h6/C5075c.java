package p108h6;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;
import p311x6.C7160a;

/* renamed from: h6.c */
public final class C5075c implements C5104n<File, ByteBuffer> {

    /* renamed from: h6.c$a */
    public static final class C5076a implements C2142d<ByteBuffer> {

        /* renamed from: b */
        public final File f17070b;

        public C5076a(File file) {
            this.f17070b = file;
        }

        /* renamed from: a */
        public final Class<ByteBuffer> mo6607a() {
            return ByteBuffer.class;
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
        public final void mo6611e(Priority priority, C2142d.C2143a<? super ByteBuffer> aVar) {
            try {
                aVar.mo10914f(C7160a.m16767a(this.f17070b));
            } catch (IOException e) {
                aVar.mo10913c(e);
            }
        }
    }

    /* renamed from: h6.c$b */
    public static class C5077b implements C5106o<File, ByteBuffer> {
        /* renamed from: b */
        public final C5104n<File, ByteBuffer> mo20818b(C5112r rVar) {
            return new C5075c();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        File file = (File) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        File file = (File) obj;
        return new C5104n.C5105a(new C7000d(file), new C5076a(file));
    }
}
