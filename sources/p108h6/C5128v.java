package p108h6;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.appboy.support.AppboyFileUtils;
import com.bumptech.glide.load.data.C2139a;
import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.data.C2151i;
import com.bumptech.glide.load.data.C2158n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;

/* renamed from: h6.v */
public final class C5128v<Data> implements C5104n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f17139b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{AppboyFileUtils.FILE_SCHEME, "android.resource", "content"})));

    /* renamed from: a */
    public final C5131c<Data> f17140a;

    /* renamed from: h6.v$a */
    public static final class C5129a implements C5106o<Uri, AssetFileDescriptor>, C5131c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f17141a;

        public C5129a(ContentResolver contentResolver) {
            this.f17141a = contentResolver;
        }

        /* renamed from: a */
        public final C2142d<AssetFileDescriptor> mo20847a(Uri uri) {
            return new C2139a(this.f17141a, uri);
        }

        /* renamed from: b */
        public final C5104n<Uri, AssetFileDescriptor> mo20818b(C5112r rVar) {
            return new C5128v(this);
        }
    }

    /* renamed from: h6.v$b */
    public static class C5130b implements C5106o<Uri, ParcelFileDescriptor>, C5131c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f17142a;

        public C5130b(ContentResolver contentResolver) {
            this.f17142a = contentResolver;
        }

        /* renamed from: a */
        public final C2142d<ParcelFileDescriptor> mo20847a(Uri uri) {
            return new C2151i(this.f17142a, uri);
        }

        /* renamed from: b */
        public final C5104n<Uri, ParcelFileDescriptor> mo20818b(C5112r rVar) {
            return new C5128v(this);
        }
    }

    /* renamed from: h6.v$c */
    public interface C5131c<Data> {
        /* renamed from: a */
        C2142d<Data> mo20847a(Uri uri);
    }

    /* renamed from: h6.v$d */
    public static class C5132d implements C5106o<Uri, InputStream>, C5131c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f17143a;

        public C5132d(ContentResolver contentResolver) {
            this.f17143a = contentResolver;
        }

        /* renamed from: a */
        public final C2142d<InputStream> mo20847a(Uri uri) {
            return new C2158n(this.f17143a, uri);
        }

        /* renamed from: b */
        public final C5104n<Uri, InputStream> mo20818b(C5112r rVar) {
            return new C5128v(this);
        }
    }

    public C5128v(C5131c<Data> cVar) {
        this.f17140a = cVar;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        return f17139b.contains(((Uri) obj).getScheme());
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        Uri uri = (Uri) obj;
        return new C5104n.C5105a(new C7000d(uri), this.f17140a.mo20847a(uri));
    }
}
