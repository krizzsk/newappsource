package v10;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.moovit.image.C16019d;
import com.moovit.image.C16035l;
import com.moovit.image.glide.ImageDataException;
import com.moovit.image.model.ResourceImage;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4566d;
import p693nz.C18659h;
import z10.C20798c;

/* renamed from: v10.j */
public final class C20077j implements C1493f<ResourceImage, C20065a> {

    /* renamed from: a */
    public final Context f50931a;

    /* renamed from: b */
    public final C4566d f50932b;

    /* renamed from: c */
    public final C20798c f50933c;

    /* renamed from: d */
    public final C20078a f50934d = new C20078a();

    /* renamed from: v10.j$a */
    public class C20078a extends C16035l.C16039d {
        public C20078a() {
        }

        /* renamed from: a */
        public final Bitmap mo48208a(int i, int i2) {
            return C20077j.this.f50932b.mo20087e(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    public C20077j(Context context, C4566d dVar, C20798c cVar) {
        this.f50931a = context;
        this.f50932b = dVar;
        this.f50933c = cVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        Resources resources = this.f50931a.getResources();
        int c = ((ResourceImage) obj).mo48250c();
        C18659h hVar = C16035l.f41753a;
        return "raw".equals(resources.getResourceTypeName(c));
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        ResourceImage resourceImage = (ResourceImage) obj;
        int c = resourceImage.mo48250c();
        if (c != 0) {
            Bitmap d = C16035l.m40846d(this.f50931a, c, resourceImage.mo48223b(), this.f50934d);
            if (d == null) {
                return null;
            }
            return C20067c.m47570c(this.f50933c.mo52922a(this.f50932b, d, i, i2, eVar), C16019d.m40803a().f41716b.get(c));
        }
        throw new ImageDataException("Failed to get resource id from Uri: " + resourceImage);
    }
}
