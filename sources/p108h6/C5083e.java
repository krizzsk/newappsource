package p108h6;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;

/* renamed from: h6.e */
public final class C5083e<Data> implements C5104n<File, Data> {

    /* renamed from: a */
    public final C5088d<Data> f17076a;

    /* renamed from: h6.e$a */
    public static class C5084a<Data> implements C5106o<File, Data> {

        /* renamed from: a */
        public final C5088d<Data> f17077a;

        public C5084a(C5088d<Data> dVar) {
            this.f17077a = dVar;
        }

        /* renamed from: b */
        public final C5104n<File, Data> mo20818b(C5112r rVar) {
            return new C5083e(this.f17077a);
        }
    }

    /* renamed from: h6.e$b */
    public static class C5085b extends C5084a<ParcelFileDescriptor> {

        /* renamed from: h6.e$b$a */
        public class C5086a implements C5088d<ParcelFileDescriptor> {
            /* renamed from: a */
            public final Class<ParcelFileDescriptor> mo20822a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: b */
            public final Object mo20823b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* renamed from: c */
            public final void mo20824c(Object obj) throws IOException {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public C5085b() {
            super(new C5086a());
        }
    }

    /* renamed from: h6.e$c */
    public static final class C5087c<Data> implements C2142d<Data> {

        /* renamed from: b */
        public final File f17078b;

        /* renamed from: c */
        public final C5088d<Data> f17079c;

        /* renamed from: d */
        public Data f17080d;

        public C5087c(File file, C5088d<Data> dVar) {
            this.f17078b = file;
            this.f17079c = dVar;
        }

        /* renamed from: a */
        public final Class<Data> mo6607a() {
            return this.f17079c.mo20822a();
        }

        /* renamed from: b */
        public final void mo6608b() {
            Data data = this.f17080d;
            if (data != null) {
                try {
                    this.f17079c.mo20824c(data);
                } catch (IOException unused) {
                }
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
                Data b = this.f17079c.mo20823b(this.f17078b);
                this.f17080d = b;
                aVar.mo10914f(b);
            } catch (FileNotFoundException e) {
                aVar.mo10913c(e);
            }
        }
    }

    /* renamed from: h6.e$d */
    public interface C5088d<Data> {
        /* renamed from: a */
        Class<Data> mo20822a();

        /* renamed from: b */
        Data mo20823b(File file) throws FileNotFoundException;

        /* renamed from: c */
        void mo20824c(Data data) throws IOException;
    }

    /* renamed from: h6.e$e */
    public static class C5089e extends C5084a<InputStream> {

        /* renamed from: h6.e$e$a */
        public class C5090a implements C5088d<InputStream> {
            /* renamed from: a */
            public final Class<InputStream> mo20822a() {
                return InputStream.class;
            }

            /* renamed from: b */
            public final Object mo20823b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            /* renamed from: c */
            public final void mo20824c(Object obj) throws IOException {
                ((InputStream) obj).close();
            }
        }

        public C5089e() {
            super(new C5090a());
        }
    }

    public C5083e(C5088d<Data> dVar) {
        this.f17076a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        File file = (File) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        File file = (File) obj;
        return new C5104n.C5105a(new C7000d(file), new C5087c(file, this.f17076a));
    }
}
