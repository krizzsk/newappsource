package com.veriff.sdk.views.camera;

import android.graphics.Rect;
import android.media.Image;
import com.veriff.sdk.camera.core.ImageInfo;
import com.veriff.sdk.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/YuvImage420;", "Lcom/veriff/sdk/camera/core/ImageProxy;", "", "getWidth", "getHeight", "getFormat", "", "Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "getPlanes", "()[Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "Lbf0/d;", "close", "Lcom/veriff/sdk/camera/core/ImageInfo;", "getImageInfo", "Landroid/graphics/Rect;", "rect", "setCropRect", "Landroid/media/Image;", "getImage", "getCropRect", "height", "I", "planes", "[Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "width", "<init>", "(II[Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", "Companion", "Plane", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ap */
public final class C22851ap implements ImageProxy {

    /* renamed from: a */
    public static final C22852a f58023a = new C22852a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final int f58024b;

    /* renamed from: c */
    private final int f58025c;

    /* renamed from: d */
    private final ImageProxy.PlaneProxy[] f58026d;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/YuvImage420$Companion;", "", "()V", "create", "Lcom/veriff/sdk/views/camera/YuvImage420;", "buffer", "Ljava/nio/ByteBuffer;", "width", "", "height", "colorFormat", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ap$a */
    public static final class C22852a {
        private C22852a() {
        }

        public /* synthetic */ C22852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22851ap mo57680a(ByteBuffer byteBuffer, int i, int i2, int i3) {
            int i4 = i;
            int i5 = i2;
            C24362h.m61211f(byteBuffer, "buffer");
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            switch (i3) {
                case 19:
                case 20:
                    ImageProxy.PlaneProxy[] planeProxyArr = new ImageProxy.PlaneProxy[3];
                    int i8 = i4 * i5;
                    planeProxyArr[0] = new C22853b(byteBuffer, 0, i8, i, 1);
                    int i9 = i6 * i7;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    int i11 = i9;
                    ImageProxy.PlaneProxy[] planeProxyArr2 = planeProxyArr;
                    int i12 = i6;
                    planeProxyArr2[1] = new C22853b(byteBuffer2, i8, i11, i12, 1);
                    planeProxyArr2[2] = new C22853b(byteBuffer2, i8 + i9, i11, i12, 1);
                    return new C22851ap(i4, i5, planeProxyArr2);
                case 21:
                    int i13 = i4 * i5;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    int i14 = i;
                    int i15 = i6 * i5;
                    return new C22851ap(i4, i5, new ImageProxy.PlaneProxy[]{new C22853b(byteBuffer3, 0, i13, i14, 1), new C22853b(byteBuffer3, i13, i15, i14, 2), new C22853b(byteBuffer3, i13 + 1, i15 - 1, i14, 2)});
                default:
                    return null;
            }
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tB\u001d\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006!"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/YuvImage420$Plane;", "Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "buffer", "Ljava/nio/ByteBuffer;", "offset", "", "length", "rowStride", "pixelStride", "(Ljava/nio/ByteBuffer;IIII)V", "buf", "rowStr", "pxStr", "(Ljava/nio/ByteBuffer;II)V", "getBuf", "()Ljava/nio/ByteBuffer;", "getPxStr", "()I", "getRowStr", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getBuffer", "getPixelStride", "getRowStride", "hashCode", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ap$b */
    public static final class C22853b implements ImageProxy.PlaneProxy {

        /* renamed from: a */
        private final ByteBuffer f58027a;

        /* renamed from: b */
        private final int f58028b;

        /* renamed from: c */
        private final int f58029c;

        public C22853b(ByteBuffer byteBuffer, int i, int i2) {
            C24362h.m61211f(byteBuffer, "buf");
            this.f58027a = byteBuffer;
            this.f58028b = i;
            this.f58029c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22853b)) {
                return false;
            }
            C22853b bVar = (C22853b) obj;
            return C24362h.m61206a(this.f58027a, bVar.f58027a) && this.f58028b == bVar.f58028b && this.f58029c == bVar.f58029c;
        }

        public ByteBuffer getBuffer() {
            return this.f58027a;
        }

        public int getPixelStride() {
            return this.f58029c;
        }

        public int getRowStride() {
            return this.f58028b;
        }

        public int hashCode() {
            ByteBuffer byteBuffer = this.f58027a;
            return ((((byteBuffer != null ? byteBuffer.hashCode() : 0) * 31) + this.f58028b) * 31) + this.f58029c;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Plane(buf=");
            k.append(this.f58027a);
            k.append(", rowStr=");
            k.append(this.f58028b);
            k.append(", pxStr=");
            return C13437d.m33707l(k, this.f58029c, ")");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C22853b(java.nio.ByteBuffer r2, int r3, int r4, int r5, int r6) {
            /*
                r1 = this;
                java.lang.String r0 = "buffer"
                mf0.C24362h.m61211f(r2, r0)
                java.nio.ByteBuffer r2 = com.veriff.sdk.views.camera.C22854aq.m56259b(r2, r3, r4)
                java.lang.String r3 = "buffer.slice(offset, length)"
                mf0.C24362h.m61210e(r2, r3)
                r1.<init>(r2, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22851ap.C22853b.<init>(java.nio.ByteBuffer, int, int, int, int):void");
        }
    }

    public C22851ap(int i, int i2, ImageProxy.PlaneProxy[] planeProxyArr) {
        C24362h.m61211f(planeProxyArr, "planes");
        this.f58024b = i;
        this.f58025c = i2;
        this.f58026d = planeProxyArr;
    }

    public void close() {
    }

    public Rect getCropRect() {
        throw new UnsupportedOperationException();
    }

    public int getFormat() {
        return 35;
    }

    public int getHeight() {
        return this.f58025c;
    }

    public Image getImage() {
        throw new UnsupportedOperationException();
    }

    public ImageInfo getImageInfo() {
        throw new UnsupportedOperationException();
    }

    public ImageProxy.PlaneProxy[] getPlanes() {
        return this.f58026d;
    }

    public int getWidth() {
        return this.f58024b;
    }

    public void setCropRect(Rect rect) {
        throw new UnsupportedOperationException();
    }
}
