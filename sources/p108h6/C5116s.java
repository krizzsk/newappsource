package p108h6;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p025b6.C1492e;
import p108h6.C5104n;

/* renamed from: h6.s */
public final class C5116s<Data> implements C5104n<Integer, Data> {

    /* renamed from: a */
    public final C5104n<Uri, Data> f17129a;

    /* renamed from: b */
    public final Resources f17130b;

    /* renamed from: h6.s$a */
    public static final class C5117a implements C5106o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f17131a;

        public C5117a(Resources resources) {
            this.f17131a = resources;
        }

        /* renamed from: b */
        public final C5104n<Integer, AssetFileDescriptor> mo20818b(C5112r rVar) {
            return new C5116s(this.f17131a, rVar.mo20844b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: h6.s$b */
    public static class C5118b implements C5106o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f17132a;

        public C5118b(Resources resources) {
            this.f17132a = resources;
        }

        /* renamed from: b */
        public final C5104n<Integer, ParcelFileDescriptor> mo20818b(C5112r rVar) {
            return new C5116s(this.f17132a, rVar.mo20844b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: h6.s$c */
    public static class C5119c implements C5106o<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f17133a;

        public C5119c(Resources resources) {
            this.f17133a = resources;
        }

        /* renamed from: b */
        public final C5104n<Integer, InputStream> mo20818b(C5112r rVar) {
            return new C5116s(this.f17133a, rVar.mo20844b(Uri.class, InputStream.class));
        }
    }

    /* renamed from: h6.s$d */
    public static class C5120d implements C5106o<Integer, Uri> {

        /* renamed from: a */
        public final Resources f17134a;

        public C5120d(Resources resources) {
            this.f17134a = resources;
        }

        /* renamed from: b */
        public final C5104n<Integer, Uri> mo20818b(C5112r rVar) {
            return new C5116s(this.f17134a, C5125u.f17136a);
        }
    }

    public C5116s(Resources resources, C5104n<Uri, Data> nVar) {
        this.f17130b = resources;
        this.f17129a = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f17130b.getResourcePackageName(num.intValue()) + '/' + this.f17130b.getResourceTypeName(num.intValue()) + '/' + this.f17130b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f17129a.mo20816b(uri, i, i2, eVar);
    }
}
