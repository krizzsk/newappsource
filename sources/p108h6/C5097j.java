package p108h6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.File;
import java.io.FileNotFoundException;
import mf0.C24361g;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;

/* renamed from: h6.j */
public final class C5097j implements C5104n<Uri, File> {

    /* renamed from: a */
    public final Context f17094a;

    /* renamed from: h6.j$a */
    public static final class C5098a implements C5106o<Uri, File> {

        /* renamed from: a */
        public final Context f17095a;

        public C5098a(Context context) {
            this.f17095a = context;
        }

        /* renamed from: b */
        public final C5104n<Uri, File> mo20818b(C5112r rVar) {
            return new C5097j(this.f17095a);
        }
    }

    /* renamed from: h6.j$b */
    public static class C5099b implements C2142d<File> {

        /* renamed from: d */
        public static final String[] f17096d = {"_data"};

        /* renamed from: b */
        public final Context f17097b;

        /* renamed from: c */
        public final Uri f17098c;

        public C5099b(Context context, Uri uri) {
            this.f17097b = context;
            this.f17098c = uri;
        }

        /* renamed from: a */
        public final Class<File> mo6607a() {
            return File.class;
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
        public final void mo6611e(Priority priority, C2142d.C2143a<? super File> aVar) {
            Cursor query = this.f17097b.getContentResolver().query(this.f17098c, f17096d, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder k = C13555b.m33972k("Failed to find file path for: ");
                k.append(this.f17098c);
                aVar.mo10913c(new FileNotFoundException(k.toString()));
                return;
            }
            aVar.mo10914f(new File(str));
        }
    }

    public C5097j(Context context) {
        this.f17094a = context;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        return C24361g.m61153W((Uri) obj);
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        Uri uri = (Uri) obj;
        return new C5104n.C5105a(new C7000d(uri), new C5099b(this.f17094a, uri));
    }
}
