package p378az;

import android.net.Uri;
import com.moovit.MoovitApplication;
import java.io.IOException;
import java.net.HttpURLConnection;
import p906wz.C20431c;

/* renamed from: az.b */
public final class C13553b extends C20431c<C13553b, C13554c> {

    /* renamed from: r */
    public static final Uri f33498r = Uri.parse("https://tvm.moovitapp.com/");

    /* renamed from: q */
    public final boolean f33499q;

    public C13553b(MoovitApplication moovitApplication, boolean z) {
        super(moovitApplication, f33498r, false, C13554c.class);
        this.f33499q = z;
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setUseCaches(!this.f33499q);
    }
}
