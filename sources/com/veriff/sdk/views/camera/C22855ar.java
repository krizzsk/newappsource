package com.veriff.sdk.views.camera;

import bf0.C21050d;
import com.veriff.sdk.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lf0.C24243s;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a0\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f\u001a0\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a0\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, mo59060d2 = {"", "imageWidth", "imageHeight", "subSampling", "Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "input", "output", "Lbf0/d;", "clockwiseRotateYuvPlane", "copyYuvPlane", "Lcom/veriff/sdk/views/camera/Rotation;", "rotation", "Lcom/veriff/sdk/camera/core/ImageProxy;", "copyYuvWithRotation", "counterClockwiseRotateYuvPlane", "rotate180YuvPlane", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ar */
public final class C22855ar {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, mo59060d2 = {"", "p1", "p2", "p3", "Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "p4", "p5", "Lbf0/d;", "invoke", "(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ar$a */
    public static final /* synthetic */ class C22856a extends FunctionReferenceImpl implements C24243s<Integer, Integer, Integer, ImageProxy.PlaneProxy, ImageProxy.PlaneProxy, C21050d> {

        /* renamed from: a */
        public static final C22856a f58030a = new C22856a();

        public C22856a() {
            super(5, C22855ar.class, "copyYuvPlane", "copyYuvPlane(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", 1);
        }

        /* renamed from: a */
        public final void mo57684a(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
            C24362h.m61211f(planeProxy, "p4");
            C24362h.m61211f(planeProxy2, "p5");
            C22855ar.m56265e(i, i2, i3, planeProxy, planeProxy2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            mo57684a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (ImageProxy.PlaneProxy) obj4, (ImageProxy.PlaneProxy) obj5);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, mo59060d2 = {"", "p1", "p2", "p3", "Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "p4", "p5", "Lbf0/d;", "invoke", "(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ar$b */
    public static final /* synthetic */ class C22857b extends FunctionReferenceImpl implements C24243s<Integer, Integer, Integer, ImageProxy.PlaneProxy, ImageProxy.PlaneProxy, C21050d> {

        /* renamed from: a */
        public static final C22857b f58031a = new C22857b();

        public C22857b() {
            super(5, C22855ar.class, "clockwiseRotateYuvPlane", "clockwiseRotateYuvPlane(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", 1);
        }

        /* renamed from: a */
        public final void mo57686a(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
            C24362h.m61211f(planeProxy, "p4");
            C24362h.m61211f(planeProxy2, "p5");
            C22855ar.m56266f(i, i2, i3, planeProxy, planeProxy2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            mo57686a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (ImageProxy.PlaneProxy) obj4, (ImageProxy.PlaneProxy) obj5);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, mo59060d2 = {"", "p1", "p2", "p3", "Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "p4", "p5", "Lbf0/d;", "invoke", "(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ar$c */
    public static final /* synthetic */ class C22858c extends FunctionReferenceImpl implements C24243s<Integer, Integer, Integer, ImageProxy.PlaneProxy, ImageProxy.PlaneProxy, C21050d> {

        /* renamed from: a */
        public static final C22858c f58032a = new C22858c();

        public C22858c() {
            super(5, C22855ar.class, "rotate180YuvPlane", "rotate180YuvPlane(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", 1);
        }

        /* renamed from: a */
        public final void mo57687a(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
            C24362h.m61211f(planeProxy, "p4");
            C24362h.m61211f(planeProxy2, "p5");
            C22855ar.m56267g(i, i2, i3, planeProxy, planeProxy2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            mo57687a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (ImageProxy.PlaneProxy) obj4, (ImageProxy.PlaneProxy) obj5);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, mo59060d2 = {"", "p1", "p2", "p3", "Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;", "p4", "p5", "Lbf0/d;", "invoke", "(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ar$d */
    public static final /* synthetic */ class C22859d extends FunctionReferenceImpl implements C24243s<Integer, Integer, Integer, ImageProxy.PlaneProxy, ImageProxy.PlaneProxy, C21050d> {

        /* renamed from: a */
        public static final C22859d f58033a = new C22859d();

        public C22859d() {
            super(5, C22855ar.class, "counterClockwiseRotateYuvPlane", "counterClockwiseRotateYuvPlane(IIILcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;Lcom/veriff/sdk/camera/core/ImageProxy$PlaneProxy;)V", 1);
        }

        /* renamed from: a */
        public final void mo57688a(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
            C24362h.m61211f(planeProxy, "p4");
            C24362h.m61211f(planeProxy2, "p5");
            C22855ar.m56268h(i, i2, i3, planeProxy, planeProxy2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            mo57688a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (ImageProxy.PlaneProxy) obj4, (ImageProxy.PlaneProxy) obj5);
            return C21050d.f52856a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m56265e(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
        if (planeProxy.getPixelStride() == planeProxy2.getPixelStride() && planeProxy.getRowStride() == planeProxy2.getRowStride()) {
            planeProxy2.getBuffer().put(planeProxy.getBuffer());
            return;
        }
        int i4 = i2 / i3;
        int i5 = i / i3;
        ByteBuffer buffer = planeProxy.getBuffer();
        C24362h.m61210e(buffer, "input.buffer");
        int rowStride = planeProxy.getRowStride();
        int pixelStride = planeProxy.getPixelStride();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        C24362h.m61210e(buffer2, "output.buffer");
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = i7 * pixelStride2;
                buffer2.put(i8 + (i6 * rowStride2), buffer.get((i7 * pixelStride) + (i6 * rowStride)));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m56266f(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
        int i4 = i2 / i3;
        int i5 = i / i3;
        ByteBuffer buffer = planeProxy.getBuffer();
        C24362h.m61210e(buffer, "input.buffer");
        int rowStride = planeProxy.getRowStride();
        int pixelStride = planeProxy.getPixelStride();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        C24362h.m61210e(buffer2, "output.buffer");
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((i4 - i6) - 1) * pixelStride2;
                buffer2.put(i8 + (i7 * rowStride2), buffer.get((i7 * pixelStride) + (i6 * rowStride)));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m56267g(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
        int i4 = i2 / i3;
        int i5 = i / i3;
        ByteBuffer buffer = planeProxy.getBuffer();
        C24362h.m61210e(buffer, "input.buffer");
        int rowStride = planeProxy.getRowStride();
        int pixelStride = planeProxy.getPixelStride();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        C24362h.m61210e(buffer2, "output.buffer");
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((i5 - i7) - 1) * pixelStride2;
                buffer2.put(i8 + (((i4 - i6) - 1) * rowStride2), buffer.get((i7 * pixelStride) + (i6 * rowStride)));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m56268h(int i, int i2, int i3, ImageProxy.PlaneProxy planeProxy, ImageProxy.PlaneProxy planeProxy2) {
        int i4 = i2 / i3;
        int i5 = i / i3;
        ByteBuffer buffer = planeProxy.getBuffer();
        C24362h.m61210e(buffer, "input.buffer");
        int rowStride = planeProxy.getRowStride();
        int pixelStride = planeProxy.getPixelStride();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        C24362h.m61210e(buffer2, "output.buffer");
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = i6 * pixelStride2;
                buffer2.put(i8 + (((i5 - i7) - 1) * rowStride2), buffer.get((i7 * pixelStride) + (i6 * rowStride)));
            }
        }
    }

    /* renamed from: a */
    public static final void m56261a(C22830ae aeVar, ImageProxy imageProxy, ImageProxy imageProxy2) {
        C24243s sVar;
        Pair pair;
        C24362h.m61211f(aeVar, "rotation");
        C24362h.m61211f(imageProxy, "input");
        C24362h.m61211f(imageProxy2, "output");
        int i = C22860as.f58034a[aeVar.ordinal()];
        if (i == 1) {
            sVar = C22856a.f58030a;
        } else if (i == 2) {
            sVar = C22857b.f58031a;
        } else if (i == 3) {
            sVar = C22858c.f58032a;
        } else if (i == 4) {
            sVar = C22859d.f58033a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (EnumSet.of(C22830ae.NONE, C22830ae.HALF_TURN).contains(aeVar)) {
            int width = imageProxy.getWidth();
            int width2 = imageProxy2.getWidth();
            if (width > width2) {
                width = width2;
            }
            Integer valueOf = Integer.valueOf(width);
            int height = imageProxy.getHeight();
            int height2 = imageProxy2.getHeight();
            if (height > height2) {
                height = height2;
            }
            pair = new Pair(valueOf, Integer.valueOf(height));
        } else {
            int width3 = imageProxy.getWidth();
            int height3 = imageProxy2.getHeight();
            if (width3 > height3) {
                width3 = height3;
            }
            Integer valueOf2 = Integer.valueOf(width3);
            int height4 = imageProxy.getHeight();
            int width4 = imageProxy2.getWidth();
            if (height4 > width4) {
                height4 = width4;
            }
            pair = new Pair(valueOf2, Integer.valueOf(height4));
        }
        int intValue = ((Number) pair.mo59066a()).intValue();
        int intValue2 = ((Number) pair.mo59067b()).intValue();
        Integer valueOf3 = Integer.valueOf(intValue);
        Integer valueOf4 = Integer.valueOf(intValue2);
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        C24362h.m61210e(planeProxy, "input.planes[0]");
        ImageProxy.PlaneProxy planeProxy2 = imageProxy2.getPlanes()[0];
        C24362h.m61210e(planeProxy2, "output.planes[0]");
        sVar.invoke(valueOf3, valueOf4, 1, planeProxy, planeProxy2);
        Integer valueOf5 = Integer.valueOf(intValue);
        Integer valueOf6 = Integer.valueOf(intValue2);
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[1];
        C24362h.m61210e(planeProxy3, "input.planes[1]");
        ImageProxy.PlaneProxy planeProxy4 = imageProxy2.getPlanes()[1];
        C24362h.m61210e(planeProxy4, "output.planes[1]");
        C24243s sVar2 = sVar;
        sVar2.invoke(valueOf5, valueOf6, 2, planeProxy3, planeProxy4);
        Integer valueOf7 = Integer.valueOf(intValue);
        Integer valueOf8 = Integer.valueOf(intValue2);
        ImageProxy.PlaneProxy planeProxy5 = imageProxy.getPlanes()[2];
        C24362h.m61210e(planeProxy5, "input.planes[2]");
        ImageProxy.PlaneProxy planeProxy6 = imageProxy2.getPlanes()[2];
        C24362h.m61210e(planeProxy6, "output.planes[2]");
        sVar2.invoke(valueOf7, valueOf8, 2, planeProxy5, planeProxy6);
    }
}
