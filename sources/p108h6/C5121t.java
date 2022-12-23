package p108h6;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p025b6.C1492e;
import p108h6.C5104n;

/* renamed from: h6.t */
public final class C5121t<Data> implements C5104n<String, Data> {

    /* renamed from: a */
    public final C5104n<Uri, Data> f17135a;

    /* renamed from: h6.t$a */
    public static final class C5122a implements C5106o<String, AssetFileDescriptor> {
        /* renamed from: b */
        public final C5104n<String, AssetFileDescriptor> mo20818b(C5112r rVar) {
            return new C5121t(rVar.mo20844b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: h6.t$b */
    public static class C5123b implements C5106o<String, ParcelFileDescriptor> {
        /* renamed from: b */
        public final C5104n<String, ParcelFileDescriptor> mo20818b(C5112r rVar) {
            return new C5121t(rVar.mo20844b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: h6.t$c */
    public static class C5124c implements C5106o<String, InputStream> {
        /* renamed from: b */
        public final C5104n<String, InputStream> mo20818b(C5112r rVar) {
            return new C5121t(rVar.mo20844b(Uri.class, InputStream.class));
        }
    }

    public C5121t(C5104n<Uri, Data> nVar) {
        this.f17135a = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        String str = (String) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null) {
                uri = Uri.fromFile(new File(str));
            } else {
                uri = parse;
            }
        }
        if (uri == null || !this.f17135a.mo20815a(uri)) {
            return null;
        }
        return this.f17135a.mo20816b(uri, i, i2, eVar);
    }
}
