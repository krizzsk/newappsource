package v10;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
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

/* renamed from: v10.k */
public final class C20079k implements C1493f<ResourceImage, Bitmap> {

    /* renamed from: a */
    public final Context f50936a;

    /* renamed from: b */
    public final C4566d f50937b;

    /* renamed from: c */
    public final C20798c f50938c;

    /* renamed from: d */
    public final C20080a f50939d = new C20080a();

    /* renamed from: v10.k$a */
    public class C20080a extends C16035l.C16039d {
        public C20080a() {
        }

        /* renamed from: a */
        public final Bitmap mo48208a(int i, int i2) {
            return C20079k.this.f50937b.mo20087e(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    public C20079k(Context context, C4566d dVar, C20798c cVar) {
        this.f50936a = context;
        this.f50937b = dVar;
        this.f50938c = cVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        Resources resources = this.f50936a.getResources();
        int c = ((ResourceImage) obj).mo48250c();
        C18659h hVar = C16035l.f41753a;
        return "raw".equals(resources.getResourceTypeName(c));
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        ResourceImage resourceImage = (ResourceImage) obj;
        int c = resourceImage.mo48250c();
        if (c != 0) {
            Bitmap d = C16035l.m40846d(this.f50936a, c, resourceImage.mo48223b(), this.f50939d);
            if (d == null) {
                return null;
            }
            return this.f50938c.mo52922a(this.f50937b, d, i, i2, eVar);
        }
        throw new ImageDataException("Failed to get resource id from Uri: " + resourceImage);
    }
}
