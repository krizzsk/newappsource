package p121i6;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import mf0.C24361g;
import p025b6.C1492e;
import p038c6.C1793a;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;
import p298w6.C7000d;

/* renamed from: i6.b */
public final class C5286b implements C5104n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f17457a;

    /* renamed from: i6.b$a */
    public static class C5287a implements C5106o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f17458a;

        public C5287a(Context context) {
            this.f17458a = context;
        }

        /* renamed from: b */
        public final C5104n<Uri, InputStream> mo20818b(C5112r rVar) {
            return new C5286b(this.f17458a);
        }
    }

    public C5286b(Context context) {
        this.f17457a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        Uri uri = (Uri) obj;
        if (!C24361g.m61153W(uri) || uri.getPathSegments().contains("video")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        boolean z;
        Uri uri = (Uri) obj;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        C7000d dVar = new C7000d(uri);
        Context context = this.f17457a;
        return new C5104n.C5105a(dVar, C1793a.m5102c(context, uri, new C1793a.C1794a(context.getContentResolver())));
    }
}
