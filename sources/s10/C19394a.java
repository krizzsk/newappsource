package s10;

import ce0.C21100e;
import com.appboy.support.AppboyFileUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.moovit.image.glide.data.ImageData;
import com.moovit.image.glide.utils.GlideDataHelper;
import java.io.File;
import java.io.IOException;

/* renamed from: s10.a */
public final class C19394a implements C2142d<ImageData> {

    /* renamed from: b */
    public final File f49343b;

    public C19394a(File file) {
        C21100e.m49373x(file, AppboyFileUtils.FILE_SCHEME);
        this.f49343b = file;
    }

    /* renamed from: a */
    public final Class<ImageData> mo6607a() {
        return ImageData.class;
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
    public final void mo6611e(Priority priority, C2142d.C2143a<? super ImageData> aVar) {
        try {
            aVar.mo10914f(GlideDataHelper.m40839b(this.f49343b));
        } catch (IOException e) {
            aVar.mo10913c(e);
        }
    }
}
