package s10;

import android.content.res.Resources;
import android.net.Uri;
import ce0.C21100e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.moovit.image.glide.ImageDataException;
import p977zz.C20969u0;

/* renamed from: s10.e */
public final class C19398e implements C2142d<Uri> {

    /* renamed from: b */
    public final Resources f49353b;

    /* renamed from: c */
    public final Integer f49354c;

    public C19398e(Resources resources, Integer num) {
        C21100e.m49373x(resources, "resources");
        this.f49353b = resources;
        C21100e.m49373x(num, "resourceId");
        this.f49354c = num;
    }

    /* renamed from: a */
    public final Class<Uri> mo6607a() {
        return Uri.class;
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
    public final void mo6611e(Priority priority, C2142d.C2143a<? super Uri> aVar) {
        Uri a = C20969u0.m49110a(this.f49353b, this.f49354c);
        if (a != null) {
            aVar.mo10914f(a);
            return;
        }
        StringBuilder k = C13555b.m33972k("Received invalid resource id: ");
        k.append(this.f49354c);
        aVar.mo10913c(new ImageDataException(k.toString()));
    }
}
