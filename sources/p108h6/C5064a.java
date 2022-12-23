package p108h6;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.data.C2150h;
import com.bumptech.glide.load.data.C2157m;
import java.io.InputStream;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;

/* renamed from: h6.a */
public final class C5064a<Data> implements C5104n<Uri, Data> {

    /* renamed from: a */
    public final AssetManager f17063a;

    /* renamed from: b */
    public final C5065a<Data> f17064b;

    /* renamed from: h6.a$a */
    public interface C5065a<Data> {
        /* renamed from: a */
        C2142d<Data> mo20817a(AssetManager assetManager, String str);
    }

    /* renamed from: h6.a$b */
    public static class C5066b implements C5106o<Uri, AssetFileDescriptor>, C5065a<AssetFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f17065a;

        public C5066b(AssetManager assetManager) {
            this.f17065a = assetManager;
        }

        /* renamed from: a */
        public final C2142d<AssetFileDescriptor> mo20817a(AssetManager assetManager, String str) {
            return new C2150h(assetManager, str);
        }

        /* renamed from: b */
        public final C5104n<Uri, AssetFileDescriptor> mo20818b(C5112r rVar) {
            return new C5064a(this.f17065a, this);
        }
    }

    /* renamed from: h6.a$c */
    public static class C5067c implements C5106o<Uri, InputStream>, C5065a<InputStream> {

        /* renamed from: a */
        public final AssetManager f17066a;

        public C5067c(AssetManager assetManager) {
            this.f17066a = assetManager;
        }

        /* renamed from: a */
        public final C2142d<InputStream> mo20817a(AssetManager assetManager, String str) {
            return new C2157m(assetManager, str);
        }

        /* renamed from: b */
        public final C5104n<Uri, InputStream> mo20818b(C5112r rVar) {
            return new C5064a(this.f17066a, this);
        }
    }

    public C5064a(AssetManager assetManager, C5065a<Data> aVar) {
        this.f17063a = assetManager;
        this.f17064b = aVar;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        Uri uri = (Uri) obj;
        if (!AppboyFileUtils.FILE_SCHEME.equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        Uri uri = (Uri) obj;
        return new C5104n.C5105a(new C7000d(uri), this.f17064b.mo20817a(this.f17063a, uri.toString().substring(22)));
    }
}
