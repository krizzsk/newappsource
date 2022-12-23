package com.moovit.image.glide.data;

import android.graphics.PointF;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public final class ImageData implements C5384a {

    /* renamed from: f */
    public static final C16030a f41738f = new C16030a();

    /* renamed from: b */
    public final ServerId f41739b;

    /* renamed from: c */
    public final Format f41740c;

    /* renamed from: d */
    public final byte[] f41741d;

    /* renamed from: e */
    public final PointF f41742e;

    public enum Format {
        BUILT_IN,
        MVF,
        NINE_PATCH;
        
        public static final C19577c<Format> CODER = null;

        /* access modifiers changed from: public */
        static {
            Format format;
            Format format2;
            Format format3;
            CODER = new C19577c<>(Format.class, format, format2, format3);
        }
    }

    /* renamed from: com.moovit.image.glide.data.ImageData$a */
    public class C16030a extends C19619s<ImageData> {
        public C16030a() {
            super(0, ImageData.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new ImageData(new ServerId(pVar.mo51924l()), (Format) C13555b.m33968g(Format.CODER, pVar), pVar.mo51944d(), (PointF) pVar.mo51962q(C19794a.f50324b));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ImageData imageData = (ImageData) obj;
            ServerId serverId = imageData.f41739b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            Format.CODER.write(imageData.f41740c, qVar);
            qVar.mo51951e(imageData.f41741d);
            qVar.mo51967q(imageData.f41742e, C19794a.f50324b);
        }
    }

    public ImageData(ServerId serverId, Format format, byte[] bArr, PointF pointF) {
        C21100e.m49373x(serverId, "id");
        this.f41739b = serverId;
        C21100e.m49373x(format, "format");
        this.f41740c = format;
        C21100e.m49373x(bArr, "data");
        this.f41741d = bArr;
        this.f41742e = pointF;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ImageData)) {
            return false;
        }
        return this.f41739b.equals(((ImageData) obj).f41739b);
    }

    public final ServerId getServerId() {
        return this.f41739b;
    }

    public final int hashCode() {
        return this.f41739b.f15142b;
    }

    public final String toString() {
        return this.f41739b.mo19751c();
    }
}
