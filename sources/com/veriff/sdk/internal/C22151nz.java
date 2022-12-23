package com.veriff.sdk.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import bf0.C21050d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.detector.Face;
import com.veriff.sdk.detector.Point;
import com.veriff.sdk.detector.Rectangle;
import com.veriff.sdk.internal.oc$a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.util.C24469n;
import p583jk.C17875h;
import p584jl.C17885a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u001e\u0010\n\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J4\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0002R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R*\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010%\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0014\u0010&\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0015¨\u0006/"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureDebugView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lbf0/d;", "onDraw", "Lcom/veriff/sdk/detector/Point;", "point", "Landroid/graphics/Paint;", "paint", "drawCrosshair", "Lcom/veriff/sdk/detector/Rectangle;", "rect", "", "crosshair", "", "label", "drawRect", "", "toPx", "debugPaint", "Landroid/graphics/Paint;", "Lcom/veriff/sdk/views/autocapture/SelfieAutoCaptureConstraints;", "faceConstraints", "Lcom/veriff/sdk/views/autocapture/SelfieAutoCaptureConstraints;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$Faces;", "value", "faces", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$Faces;", "getFaces", "()Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$Faces;", "setFaces", "(Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$Faces;)V", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "green", "red", "textPaint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nz */
public final class C22151nz extends View {

    /* renamed from: a */
    private oc$a.C22171b f55845a;

    /* renamed from: b */
    private final C21789ix f55846b;

    /* renamed from: c */
    private final C22215on f55847c;

    /* renamed from: d */
    private final Paint f55848d;

    /* renamed from: e */
    private final Paint f55849e;

    /* renamed from: f */
    private final Paint f55850f;

    /* renamed from: g */
    private final Paint f55851g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22151nz(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m53959a(C22151nz nzVar, Canvas canvas, Rectangle rectangle, Paint paint, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            paint = nzVar.f55848d;
        }
        Paint paint2 = paint;
        boolean z2 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            str = null;
        }
        nzVar.m53958a(canvas, rectangle, paint2, z2, str);
    }

    public final oc$a.C22171b getFaces() {
        return this.f55845a;
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        C24362h.m61211f(canvas, "canvas");
        super.onDraw(canvas);
        String format = String.format(Locale.US, "fps: %.1f", Arrays.copyOf(new Object[]{Float.valueOf(this.f55845a.mo56081b())}, 1));
        C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
        canvas.drawText(format, BitmapDescriptorFactory.HUE_RED, m53956a(16.0f), this.f55851g);
        int i = 0;
        for (T next : this.f55845a.mo56080a()) {
            int i2 = i + 1;
            if (i >= 0) {
                Face face = (Face) next;
                float f = (float) 100;
                String format2 = String.format(Locale.US, "#%d size=(%d%% %d%%) angle=(%.1f %.1f %.1f)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(C17885a.m44459r0(face.getBoundingBox().getWidth() * f)), Integer.valueOf(C17885a.m44459r0(face.getBoundingBox().getHeight() * f)), Float.valueOf(face.getOrientation().getX()), Float.valueOf(face.getOrientation().getY()), Float.valueOf(face.getOrientation().getZ())}, 6));
                C24362h.m61210e(format2, "java.lang.String.format(locale, format, *args)");
                boolean a = this.f55847c.mo56110a(face, this.f55845a.mo56082c());
                Rectangle boundingBox = face.getBoundingBox();
                if (a) {
                    paint = this.f55849e;
                } else {
                    paint = this.f55850f;
                }
                m53958a(canvas, boundingBox, paint, true, format2);
                i = i2;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        m53959a(this, canvas, this.f55845a.mo56082c().getCenter().grow(this.f55846b.mo55439P()), (Paint) null, false, "target", 6, (Object) null);
    }

    public final void setFaces(oc$a.C22171b bVar) {
        C24362h.m61211f(bVar, "value");
        this.f55845a = bVar;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22151nz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f55845a = new oc$a.C22171b(EmptyList.f60173b, BitmapDescriptorFactory.HUE_RED, new Rectangle(new Point(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), new Point(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)));
        C21789ix c = C24469n.f61931a.mo60717c();
        c = c == null ? new C21789ix(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (C21886js) null, 0.0d, (C21903ka) null, (C21787iw) null, (List) null, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, false, false, 0, -1, 32767, (DefaultConstructorMarker) null) : c;
        this.f55846b = c;
        this.f55847c = new C22215on(c);
        Paint paint = new Paint();
        int i2 = (int) 4294902015L;
        paint.setColor(i2);
        paint.setStrokeWidth(m53956a(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        C21050d dVar = C21050d.f52856a;
        this.f55848d = paint;
        Paint paint2 = new Paint(paint);
        paint2.setColor((int) 4278255360L);
        this.f55849e = paint2;
        Paint paint3 = new Paint(paint);
        paint3.setColor((int) 4294901760L);
        this.f55850f = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(i2);
        paint4.setTypeface(Typeface.MONOSPACE);
        paint4.setTextSize(m53956a(8.0f));
        this.f55851g = paint4;
    }

    /* renamed from: a */
    private final void m53958a(Canvas canvas, Rectangle rectangle, Paint paint, boolean z, String str) {
        RectF a = C22153oa.m53963b(canvas, rectangle);
        canvas.drawRect(a, paint);
        if (str != null) {
            canvas.drawText(str, a.left, a.top - m53956a(8.0f), this.f55851g);
        }
        if (z) {
            m53957a(canvas, rectangle.getCenter(), paint);
        }
    }

    /* renamed from: a */
    private final void m53957a(Canvas canvas, Point point, Paint paint) {
        float x = point.getX() * ((float) canvas.getWidth());
        float y = point.getY() * ((float) canvas.getHeight());
        float a = m53956a(4.0f);
        canvas.drawLine(x - a, y, x + a, y, paint);
        canvas.drawLine(x, y - a, x, y + a, paint);
    }

    /* renamed from: a */
    private final float m53956a(float f) {
        Context context = getContext();
        C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
        Resources resources = context.getResources();
        C24362h.m61210e(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
