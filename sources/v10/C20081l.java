package v10;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2212c;
import com.moovit.image.glide.utils.GlideDataHelper;
import java.io.IOException;
import java.io.InputStream;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import z10.C20796a;

/* renamed from: v10.l */
public final class C20081l implements C1493f<InputStream, C20065a> {

    /* renamed from: a */
    public final C1493f<InputStream, Bitmap> f50941a;

    public C20081l(C2212c cVar) {
        this.f50941a = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        return GlideDataHelper.m40838a(new C20796a(this.f50941a, i, i2, eVar), (InputStream) obj);
    }
}
