package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.theartofdev.edmodo.cropper.CropOverlayView;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.UUID;
import pb0.C13000a;

public class CropImageView extends FrameLayout {

    /* renamed from: K */
    public static final /* synthetic */ int f24365K = 0;

    /* renamed from: A */
    public int f24366A = 1;

    /* renamed from: B */
    public float f24367B = 1.0f;

    /* renamed from: C */
    public float f24368C;

    /* renamed from: D */
    public float f24369D;

    /* renamed from: E */
    public RectF f24370E;

    /* renamed from: F */
    public int f24371F;

    /* renamed from: G */
    public boolean f24372G;

    /* renamed from: H */
    public Uri f24373H;

    /* renamed from: I */
    public WeakReference<C8051b> f24374I;

    /* renamed from: J */
    public WeakReference<C8049a> f24375J;

    /* renamed from: b */
    public final ImageView f24376b;

    /* renamed from: c */
    public final CropOverlayView f24377c;

    /* renamed from: d */
    public final Matrix f24378d = new Matrix();

    /* renamed from: e */
    public final Matrix f24379e = new Matrix();

    /* renamed from: f */
    public final ProgressBar f24380f;

    /* renamed from: g */
    public final float[] f24381g = new float[8];

    /* renamed from: h */
    public final float[] f24382h = new float[8];

    /* renamed from: i */
    public C13000a f24383i;

    /* renamed from: j */
    public Bitmap f24384j;

    /* renamed from: k */
    public int f24385k;

    /* renamed from: l */
    public int f24386l;

    /* renamed from: m */
    public boolean f24387m;

    /* renamed from: n */
    public boolean f24388n;

    /* renamed from: o */
    public int f24389o;

    /* renamed from: p */
    public int f24390p;

    /* renamed from: q */
    public int f24391q;

    /* renamed from: r */
    public ScaleType f24392r;

    /* renamed from: s */
    public boolean f24393s = false;

    /* renamed from: t */
    public boolean f24394t = true;

    /* renamed from: u */
    public boolean f24395u = true;

    /* renamed from: v */
    public boolean f24396v = true;

    /* renamed from: w */
    public int f24397w;

    /* renamed from: x */
    public C8045g f24398x;

    /* renamed from: y */
    public C8041c f24399y;

    /* renamed from: z */
    public Uri f24400z;

    public enum CropShape {
        RECTANGLE,
        OVAL
    }

    public enum Guidelines {
        OFF,
        ON_TOUCH,
        ON
    }

    public enum RequestSizeOptions {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum ScaleType {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$a */
    public class C8039a implements CropOverlayView.C8046a {
        public C8039a() {
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$b */
    public static class C8040b {

        /* renamed from: b */
        public final Uri f24403b;

        /* renamed from: c */
        public final Uri f24404c;

        /* renamed from: d */
        public final Exception f24405d;

        /* renamed from: e */
        public final float[] f24406e;

        /* renamed from: f */
        public final Rect f24407f;

        /* renamed from: g */
        public final Rect f24408g;

        /* renamed from: h */
        public final int f24409h;

        /* renamed from: i */
        public final int f24410i;

        public C8040b(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f24403b = uri;
            this.f24404c = uri2;
            this.f24405d = exc;
            this.f24406e = fArr;
            this.f24407f = rect;
            this.f24408g = rect2;
            this.f24409h = i;
            this.f24410i = i2;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$c */
    public interface C8041c {
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$d */
    public interface C8042d {
        /* renamed from: a */
        void mo25163a();
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$e */
    public interface C8043e {
        /* renamed from: a */
        void mo25164a();
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$f */
    public interface C8044f {
        /* renamed from: a */
        void mo25165a();
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$g */
    public interface C8045g {
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropImageView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.f24378d = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.f24379e = r0
            r0 = 8
            float[] r1 = new float[r0]
            r7.f24381g = r1
            float[] r0 = new float[r0]
            r7.f24382h = r0
            r0 = 0
            r7.f24393s = r0
            r1 = 1
            r7.f24394t = r1
            r7.f24395u = r1
            r7.f24396v = r1
            r7.f24366A = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.f24367B = r2
            boolean r2 = r8 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0038
            r2 = r8
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            goto L_0x0039
        L_0x0038:
            r2 = r3
        L_0x0039:
            if (r2 == 0) goto L_0x004c
            java.lang.String r4 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r2 = r2.getBundleExtra(r4)
            if (r2 == 0) goto L_0x004c
            java.lang.String r3 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            r3 = r2
            com.theartofdev.edmodo.cropper.CropImageOptions r3 = (com.theartofdev.edmodo.cropper.CropImageOptions) r3
        L_0x004c:
            if (r3 != 0) goto L_0x01e8
            com.theartofdev.edmodo.cropper.CropImageOptions r3 = new com.theartofdev.edmodo.cropper.CropImageOptions
            r3.<init>()
            if (r9 == 0) goto L_0x01e8
            int[] r2 = pb0.C13005f.CropImageView
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r9, r2, r0, r0)
            int r0 = pb0.C13005f.CropImageView_cropFixAspectRatio     // Catch:{ all -> 0x01e3 }
            boolean r2 = r3.f24351m     // Catch:{ all -> 0x01e3 }
            boolean r2 = r9.getBoolean(r0, r2)     // Catch:{ all -> 0x01e3 }
            r3.f24351m = r2     // Catch:{ all -> 0x01e3 }
            int r2 = pb0.C13005f.CropImageView_cropAspectRatioX     // Catch:{ all -> 0x01e3 }
            int r4 = r3.f24352n     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r2, r4)     // Catch:{ all -> 0x01e3 }
            r3.f24352n = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropAspectRatioY     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24353o     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24353o = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$ScaleType[] r4 = com.theartofdev.edmodo.cropper.CropImageView.ScaleType.values()     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropScaleType     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$ScaleType r6 = r3.f24344f     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.f24344f = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropAutoZoomEnabled     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f24347i     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24347i = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMultiTouchEnabled     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f24348j     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24348j = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMaxZoom     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24349k     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24349k = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$CropShape[] r4 = com.theartofdev.edmodo.cropper.CropImageView.CropShape.values()     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropShape     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$CropShape r6 = r3.f24340b     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.f24340b = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$Guidelines[] r4 = com.theartofdev.edmodo.cropper.CropImageView.Guidelines.values()     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropGuidelines     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$Guidelines r6 = r3.f24343e     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.f24343e = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropSnapRadius     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f24341c     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24341c = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropTouchRadius     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f24342d     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24342d = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropInitialCropWindowPaddingRatio     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f24350l     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24350l = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropBorderLineThickness     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f24354p     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24354p = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropBorderLineColor     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24355q     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24355q = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropBorderCornerThickness     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f24356r     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24356r = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropBorderCornerOffset     // Catch:{ all -> 0x01e3 }
            float r6 = r3.f24357s     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24357s = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropBorderCornerLength     // Catch:{ all -> 0x01e3 }
            float r6 = r3.f24358t     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24358t = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropBorderCornerColor     // Catch:{ all -> 0x01e3 }
            int r6 = r3.f24359u     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24359u = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropGuidelinesThickness     // Catch:{ all -> 0x01e3 }
            float r6 = r3.f24360v     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24360v = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropGuidelinesColor     // Catch:{ all -> 0x01e3 }
            int r6 = r3.f24361w     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24361w = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropBackgroundColor     // Catch:{ all -> 0x01e3 }
            int r6 = r3.f24362x     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24362x = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropShowCropOverlay     // Catch:{ all -> 0x01e3 }
            boolean r6 = r7.f24394t     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24345g = r5     // Catch:{ all -> 0x01e3 }
            int r5 = pb0.C13005f.CropImageView_cropShowProgressBar     // Catch:{ all -> 0x01e3 }
            boolean r6 = r7.f24395u     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f24346h = r5     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f24356r     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24356r = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMinCropWindowWidth     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24363y     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f24363y = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMinCropWindowHeight     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24364z     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f24364z = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMinCropResultWidthPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24317A     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f24317A = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMinCropResultHeightPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24318B     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f24318B = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMaxCropResultWidthPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24319C     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f24319C = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropMaxCropResultHeightPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f24320D     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f24320D = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropFlipHorizontally     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f24336T     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24336T = r5     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f24337U     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f24337U = r4     // Catch:{ all -> 0x01e3 }
            int r4 = pb0.C13005f.CropImageView_cropSaveBitmapToInstanceState     // Catch:{ all -> 0x01e3 }
            boolean r5 = r7.f24393s     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r7.f24393s = r4     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.hasValue(r2)     // Catch:{ all -> 0x01e3 }
            if (r4 == 0) goto L_0x01df
            boolean r2 = r9.hasValue(r2)     // Catch:{ all -> 0x01e3 }
            if (r2 == 0) goto L_0x01df
            boolean r0 = r9.hasValue(r0)     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x01df
            r3.f24351m = r1     // Catch:{ all -> 0x01e3 }
        L_0x01df:
            r9.recycle()
            goto L_0x01e8
        L_0x01e3:
            r8 = move-exception
            r9.recycle()
            throw r8
        L_0x01e8:
            r3.mo25106b()
            com.theartofdev.edmodo.cropper.CropImageView$ScaleType r9 = r3.f24344f
            r7.f24392r = r9
            boolean r9 = r3.f24347i
            r7.f24396v = r9
            int r9 = r3.f24349k
            r7.f24397w = r9
            boolean r9 = r3.f24345g
            r7.f24394t = r9
            boolean r9 = r3.f24346h
            r7.f24395u = r9
            boolean r9 = r3.f24336T
            r7.f24387m = r9
            boolean r9 = r3.f24337U
            r7.f24388n = r9
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r9 = pb0.C13002c.crop_image_view
            android.view.View r8 = r8.inflate(r9, r7, r1)
            int r9 = pb0.C13001b.ImageView_image
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r7.f24376b = r9
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r9.setScaleType(r0)
            int r9 = pb0.C13001b.CropOverlayView
            android.view.View r9 = r8.findViewById(r9)
            com.theartofdev.edmodo.cropper.CropOverlayView r9 = (com.theartofdev.edmodo.cropper.CropOverlayView) r9
            r7.f24377c = r9
            com.theartofdev.edmodo.cropper.CropImageView$a r0 = new com.theartofdev.edmodo.cropper.CropImageView$a
            r0.<init>()
            r9.setCropWindowChangeListener(r0)
            r9.setInitialAttributeValues(r3)
            int r9 = pb0.C13001b.CropProgressBar
            android.view.View r8 = r8.findViewById(r9)
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r7.f24380f = r8
            r7.mo25132h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final void mo25111a(float f, float f2, boolean z, boolean z2) {
        float f3;
        float f4;
        float f5;
        if (this.f24384j != null) {
            float f6 = BitmapDescriptorFactory.HUE_RED;
            if (f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
                this.f24378d.invert(this.f24379e);
                RectF cropWindowRect = this.f24377c.getCropWindowRect();
                this.f24379e.mapRect(cropWindowRect);
                this.f24378d.reset();
                this.f24378d.postTranslate((f - ((float) this.f24384j.getWidth())) / 2.0f, (f2 - ((float) this.f24384j.getHeight())) / 2.0f);
                mo25114d();
                int i = this.f24386l;
                if (i > 0) {
                    float[] fArr = this.f24381g;
                    float p = C8053c.m18386p(fArr);
                    float[] fArr2 = this.f24381g;
                    this.f24378d.postRotate((float) i, (C8053c.m18385o(fArr) + p) / 2.0f, (C8053c.m18387q(fArr2) + C8053c.m18383m(fArr2)) / 2.0f);
                    mo25114d();
                }
                float[] fArr3 = this.f24381g;
                float p2 = f / (C8053c.m18386p(fArr3) - C8053c.m18385o(fArr3));
                float[] fArr4 = this.f24381g;
                float min = Math.min(p2, f2 / (C8053c.m18383m(fArr4) - C8053c.m18387q(fArr4)));
                ScaleType scaleType = this.f24392r;
                if (scaleType == ScaleType.FIT_CENTER || ((scaleType == ScaleType.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f24396v))) {
                    Matrix matrix = this.f24378d;
                    float[] fArr5 = this.f24381g;
                    float p3 = C8053c.m18386p(fArr5);
                    float[] fArr6 = this.f24381g;
                    matrix.postScale(min, min, (C8053c.m18385o(fArr5) + p3) / 2.0f, (C8053c.m18387q(fArr6) + C8053c.m18383m(fArr6)) / 2.0f);
                    mo25114d();
                }
                if (this.f24387m) {
                    f3 = -this.f24367B;
                } else {
                    f3 = this.f24367B;
                }
                if (this.f24388n) {
                    f4 = -this.f24367B;
                } else {
                    f4 = this.f24367B;
                }
                Matrix matrix2 = this.f24378d;
                float[] fArr7 = this.f24381g;
                float p4 = C8053c.m18386p(fArr7);
                float[] fArr8 = this.f24381g;
                matrix2.postScale(f3, f4, (C8053c.m18385o(fArr7) + p4) / 2.0f, (C8053c.m18387q(fArr8) + C8053c.m18383m(fArr8)) / 2.0f);
                mo25114d();
                this.f24378d.mapRect(cropWindowRect);
                if (z) {
                    float[] fArr9 = this.f24381g;
                    if (f > C8053c.m18386p(fArr9) - C8053c.m18385o(fArr9)) {
                        f5 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f5 = Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -C8053c.m18385o(this.f24381g)), ((float) getWidth()) - C8053c.m18386p(this.f24381g)) / f3;
                    }
                    this.f24368C = f5;
                    float[] fArr10 = this.f24381g;
                    if (f2 <= C8053c.m18383m(fArr10) - C8053c.m18387q(fArr10)) {
                        f6 = Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -C8053c.m18387q(this.f24381g)), ((float) getHeight()) - C8053c.m18383m(this.f24381g)) / f4;
                    }
                    this.f24369D = f6;
                } else {
                    this.f24368C = Math.min(Math.max(this.f24368C * f3, -cropWindowRect.left), (-cropWindowRect.right) + f) / f3;
                    this.f24369D = Math.min(Math.max(this.f24369D * f4, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / f4;
                }
                this.f24378d.postTranslate(this.f24368C * f3, this.f24369D * f4);
                cropWindowRect.offset(this.f24368C * f3, this.f24369D * f4);
                this.f24377c.setCropWindowRect(cropWindowRect);
                mo25114d();
                this.f24377c.invalidate();
                if (z2) {
                    C13000a aVar = this.f24383i;
                    float[] fArr11 = this.f24381g;
                    Matrix matrix3 = this.f24378d;
                    System.arraycopy(fArr11, 0, aVar.f32183e, 0, 8);
                    aVar.f32185g.set(aVar.f32181c.getCropWindowRect());
                    matrix3.getValues(aVar.f32187i);
                    this.f24376b.startAnimation(this.f24383i);
                } else {
                    this.f24376b.setImageMatrix(this.f24378d);
                }
                mo25134j(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo25112b() {
        Bitmap bitmap = this.f24384j;
        if (bitmap != null && (this.f24391q > 0 || this.f24400z != null)) {
            bitmap.recycle();
        }
        this.f24384j = null;
        this.f24391q = 0;
        this.f24400z = null;
        this.f24366A = 1;
        this.f24386l = 0;
        this.f24367B = 1.0f;
        this.f24368C = BitmapDescriptorFactory.HUE_RED;
        this.f24369D = BitmapDescriptorFactory.HUE_RED;
        this.f24378d.reset();
        this.f24373H = null;
        this.f24376b.setImageBitmap((Bitmap) null);
        mo25117g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25113c(boolean r12, boolean r13) {
        /*
            r11 = this;
            int r0 = r11.getWidth()
            int r1 = r11.getHeight()
            android.graphics.Bitmap r2 = r11.f24384j
            if (r2 == 0) goto L_0x0110
            if (r0 <= 0) goto L_0x0110
            if (r1 <= 0) goto L_0x0110
            com.theartofdev.edmodo.cropper.CropOverlayView r2 = r11.f24377c
            android.graphics.RectF r2 = r2.getCropWindowRect()
            r3 = 0
            r4 = 0
            if (r12 == 0) goto L_0x003b
            float r12 = r2.left
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 < 0) goto L_0x0034
            float r12 = r2.top
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 < 0) goto L_0x0034
            float r12 = r2.right
            float r13 = (float) r0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x0034
            float r12 = r2.bottom
            float r13 = (float) r1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0110
        L_0x0034:
            float r12 = (float) r0
            float r13 = (float) r1
            r11.mo25111a(r12, r13, r3, r3)
            goto L_0x0110
        L_0x003b:
            boolean r12 = r11.f24396v
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r12 != 0) goto L_0x0047
            float r12 = r11.f24367B
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x0110
        L_0x0047:
            float r12 = r11.f24367B
            int r6 = r11.f24397w
            float r6 = (float) r6
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x0089
            float r12 = r2.width()
            float r6 = (float) r0
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r6 * r7
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x0089
            float r12 = r2.height()
            float r8 = (float) r1
            float r7 = r7 * r8
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 >= 0) goto L_0x0089
            int r12 = r11.f24397w
            float r12 = (float) r12
            float r7 = r2.width()
            float r9 = r11.f24367B
            float r7 = r7 / r9
            r9 = 1059313418(0x3f23d70a, float:0.64)
            float r7 = r7 / r9
            float r6 = r6 / r7
            float r7 = r2.height()
            float r10 = r11.f24367B
            float r7 = r7 / r10
            float r7 = r7 / r9
            float r8 = r8 / r7
            float r6 = java.lang.Math.min(r6, r8)
            float r12 = java.lang.Math.min(r12, r6)
            goto L_0x008a
        L_0x0089:
            r12 = 0
        L_0x008a:
            float r6 = r11.f24367B
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c7
            float r6 = r2.width()
            float r7 = (float) r0
            r8 = 1059481190(0x3f266666, float:0.65)
            float r9 = r7 * r8
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x00a9
            float r6 = r2.height()
            float r9 = (float) r1
            float r9 = r9 * r8
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c7
        L_0x00a9:
            float r12 = r2.width()
            float r6 = r11.f24367B
            float r12 = r12 / r6
            r6 = 1057132380(0x3f028f5c, float:0.51)
            float r12 = r12 / r6
            float r7 = r7 / r12
            float r12 = (float) r1
            float r2 = r2.height()
            float r8 = r11.f24367B
            float r2 = r2 / r8
            float r2 = r2 / r6
            float r12 = r12 / r2
            float r12 = java.lang.Math.min(r7, r12)
            float r12 = java.lang.Math.max(r5, r12)
        L_0x00c7:
            boolean r2 = r11.f24396v
            if (r2 != 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r5 = r12
        L_0x00cd:
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0110
            float r12 = r11.f24367B
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0110
            if (r13 == 0) goto L_0x0108
            pb0.a r12 = r11.f24383i
            if (r12 != 0) goto L_0x00e8
            pb0.a r12 = new pb0.a
            android.widget.ImageView r2 = r11.f24376b
            com.theartofdev.edmodo.cropper.CropOverlayView r4 = r11.f24377c
            r12.<init>(r2, r4)
            r11.f24383i = r12
        L_0x00e8:
            pb0.a r12 = r11.f24383i
            float[] r2 = r11.f24381g
            android.graphics.Matrix r4 = r11.f24378d
            r12.reset()
            float[] r6 = r12.f32182d
            r7 = 8
            java.lang.System.arraycopy(r2, r3, r6, r3, r7)
            android.graphics.RectF r2 = r12.f32184f
            com.theartofdev.edmodo.cropper.CropOverlayView r3 = r12.f32181c
            android.graphics.RectF r3 = r3.getCropWindowRect()
            r2.set(r3)
            float[] r12 = r12.f32186h
            r4.getValues(r12)
        L_0x0108:
            r11.f24367B = r5
            float r12 = (float) r0
            float r0 = (float) r1
            r1 = 1
            r11.mo25111a(r12, r0, r1, r13)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.mo25113c(boolean, boolean):void");
    }

    /* renamed from: d */
    public final void mo25114d() {
        float[] fArr = this.f24381g;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = (float) this.f24384j.getWidth();
        float[] fArr2 = this.f24381g;
        fArr2[3] = 0.0f;
        fArr2[4] = (float) this.f24384j.getWidth();
        this.f24381g[5] = (float) this.f24384j.getHeight();
        float[] fArr3 = this.f24381g;
        fArr3[6] = 0.0f;
        fArr3[7] = (float) this.f24384j.getHeight();
        this.f24378d.mapPoints(this.f24381g);
        float[] fArr4 = this.f24382h;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f24378d.mapPoints(fArr4);
    }

    /* renamed from: e */
    public final void mo25115e(int i) {
        int i2;
        boolean z;
        float f;
        float f2;
        int i3 = i;
        if (this.f24384j != null) {
            if (i3 < 0) {
                i2 = (i3 % 360) + 360;
            } else {
                i2 = i3 % 360;
            }
            CropOverlayView cropOverlayView = this.f24377c;
            if (cropOverlayView.f24434v || ((i2 <= 45 || i2 >= 135) && (i2 <= 215 || i2 >= 305))) {
                z = false;
            } else {
                z = true;
            }
            RectF rectF = C8053c.f24482c;
            rectF.set(cropOverlayView.getCropWindowRect());
            if (z) {
                f = rectF.height();
            } else {
                f = rectF.width();
            }
            float f3 = f / 2.0f;
            if (z) {
                f2 = rectF.width();
            } else {
                f2 = rectF.height();
            }
            float f4 = f2 / 2.0f;
            if (z) {
                boolean z2 = this.f24387m;
                this.f24387m = this.f24388n;
                this.f24388n = z2;
            }
            this.f24378d.invert(this.f24379e);
            float[] fArr = C8053c.f24483d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f24379e.mapPoints(fArr);
            this.f24386l = (this.f24386l + i2) % 360;
            mo25111a((float) getWidth(), (float) getHeight(), true, false);
            Matrix matrix = this.f24378d;
            float[] fArr2 = C8053c.f24484e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (((double) this.f24367B) / Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d)));
            this.f24367B = sqrt;
            this.f24367B = Math.max(sqrt, 1.0f);
            mo25111a((float) getWidth(), (float) getHeight(), true, false);
            this.f24378d.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d));
            float f5 = (float) (((double) f3) * sqrt2);
            float f6 = (float) (((double) f4) * sqrt2);
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            rectF.set(f7 - f5, f8 - f6, f7 + f5, f8 + f6);
            CropOverlayView cropOverlayView2 = this.f24377c;
            if (cropOverlayView2.f24413C) {
                cropOverlayView2.setCropWindowRect(C8053c.f24481b);
                cropOverlayView2.mo25170f();
                cropOverlayView2.invalidate();
            }
            this.f24377c.setCropWindowRect(rectF);
            mo25111a((float) getWidth(), (float) getHeight(), true, false);
            mo25113c(false, false);
            CropOverlayView cropOverlayView3 = this.f24377c;
            RectF cropWindowRect = cropOverlayView3.getCropWindowRect();
            cropOverlayView3.mo25169d(cropWindowRect);
            cropOverlayView3.f24416d.f24491a.set(cropWindowRect);
        }
    }

    /* renamed from: f */
    public final void mo25116f(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f24384j;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f24376b.clearAnimation();
            mo25112b();
            this.f24384j = bitmap;
            this.f24376b.setImageBitmap(bitmap);
            this.f24400z = uri;
            this.f24391q = i;
            this.f24366A = i2;
            this.f24386l = i3;
            mo25111a((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f24377c;
            if (cropOverlayView != null) {
                if (cropOverlayView.f24413C) {
                    cropOverlayView.setCropWindowRect(C8053c.f24481b);
                    cropOverlayView.mo25170f();
                    cropOverlayView.invalidate();
                }
                mo25117g();
            }
        }
    }

    /* renamed from: g */
    public final void mo25117g() {
        int i;
        CropOverlayView cropOverlayView = this.f24377c;
        if (cropOverlayView != null) {
            if (!this.f24394t || this.f24384j == null) {
                i = 4;
            } else {
                i = 0;
            }
            cropOverlayView.setVisibility(i);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f24377c.getAspectRatioX()), Integer.valueOf(this.f24377c.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f24377c.getCropWindowRect();
        float f = cropWindowRect.left;
        float f2 = cropWindowRect.top;
        float f3 = cropWindowRect.right;
        float f4 = cropWindowRect.bottom;
        float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
        this.f24378d.invert(this.f24379e);
        this.f24379e.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * ((float) this.f24366A);
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i = this.f24366A;
        Bitmap bitmap = this.f24384j;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i;
        int height = i * bitmap.getHeight();
        CropOverlayView cropOverlayView = this.f24377c;
        return C8053c.m18384n(cropPoints, width, height, cropOverlayView.f24434v, cropOverlayView.getAspectRatioX(), this.f24377c.getAspectRatioY());
    }

    public CropShape getCropShape() {
        return this.f24377c.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f24377c;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap;
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.NONE;
        if (this.f24384j == null) {
            return null;
        }
        this.f24376b.clearAnimation();
        if (this.f24400z == null || (this.f24366A <= 1 && requestSizeOptions != RequestSizeOptions.SAMPLING)) {
            Bitmap bitmap2 = this.f24384j;
            float[] cropPoints = getCropPoints();
            int i = this.f24386l;
            CropOverlayView cropOverlayView = this.f24377c;
            bitmap = C8053c.m18376f(bitmap2, cropPoints, i, cropOverlayView.f24434v, cropOverlayView.getAspectRatioX(), this.f24377c.getAspectRatioY(), this.f24387m, this.f24388n).f24487a;
        } else {
            int width = this.f24384j.getWidth() * this.f24366A;
            int height = this.f24384j.getHeight() * this.f24366A;
            Context context = getContext();
            Uri uri = this.f24400z;
            float[] cropPoints2 = getCropPoints();
            int i2 = this.f24386l;
            CropOverlayView cropOverlayView2 = this.f24377c;
            boolean z = cropOverlayView2.f24434v;
            int aspectRatioX = cropOverlayView2.getAspectRatioX();
            bitmap = C8053c.m18374d(context, uri, cropPoints2, i2, width, height, z, aspectRatioX, this.f24377c.getAspectRatioY(), 0, 0, this.f24387m, this.f24388n).f24487a;
        }
        return C8053c.m18388r(bitmap, 0, 0, requestSizeOptions);
    }

    public void getCroppedImageAsync() {
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.NONE;
        if (this.f24399y != null) {
            mo25133i(0, 0, 0, (Bitmap.CompressFormat) null, (Uri) null, requestSizeOptions);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    public Guidelines getGuidelines() {
        return this.f24377c.getGuidelines();
    }

    public int getImageResource() {
        return this.f24391q;
    }

    public Uri getImageUri() {
        return this.f24400z;
    }

    public int getMaxZoom() {
        return this.f24397w;
    }

    public int getRotatedDegrees() {
        return this.f24386l;
    }

    public ScaleType getScaleType() {
        return this.f24392r;
    }

    public Rect getWholeImageRect() {
        int i = this.f24366A;
        Bitmap bitmap = this.f24384j;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    /* renamed from: h */
    public final void mo25132h() {
        boolean z;
        int i = 0;
        if (!this.f24395u || ((this.f24384j != null || this.f24374I == null) && this.f24375J == null)) {
            z = false;
        } else {
            z = true;
        }
        ProgressBar progressBar = this.f24380f;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: i */
    public final void mo25133i(int i, int i2, int i3, Bitmap.CompressFormat compressFormat, Uri uri, RequestSizeOptions requestSizeOptions) {
        C8049a aVar;
        int i4;
        int i5;
        CropImageView cropImageView;
        RequestSizeOptions requestSizeOptions2 = requestSizeOptions;
        Bitmap bitmap = this.f24384j;
        if (bitmap != null) {
            this.f24376b.clearAnimation();
            WeakReference<C8049a> weakReference = this.f24375J;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.cancel(true);
            }
            RequestSizeOptions requestSizeOptions3 = RequestSizeOptions.NONE;
            if (requestSizeOptions2 != requestSizeOptions3) {
                i4 = i;
            } else {
                i4 = 0;
            }
            if (requestSizeOptions2 != requestSizeOptions3) {
                i5 = i2;
            } else {
                i5 = 0;
            }
            int width = bitmap.getWidth() * this.f24366A;
            int height = bitmap.getHeight();
            int i6 = this.f24366A;
            int i7 = height * i6;
            if (this.f24400z == null || (i6 <= 1 && requestSizeOptions2 != RequestSizeOptions.SAMPLING)) {
                float[] cropPoints = getCropPoints();
                int i8 = this.f24386l;
                CropOverlayView cropOverlayView = this.f24377c;
                C8049a aVar2 = r0;
                C8049a aVar3 = new C8049a(this, bitmap, cropPoints, i8, cropOverlayView.f24434v, cropOverlayView.getAspectRatioX(), this.f24377c.getAspectRatioY(), i4, i5, this.f24387m, this.f24388n, requestSizeOptions, uri, compressFormat, i3);
                cropImageView = this;
                cropImageView.f24375J = new WeakReference<>(aVar2);
            } else {
                Uri uri2 = this.f24400z;
                float[] cropPoints2 = getCropPoints();
                int i9 = this.f24386l;
                CropOverlayView cropOverlayView2 = this.f24377c;
                int i11 = i9;
                C8049a aVar4 = r0;
                C8049a aVar5 = new C8049a(this, uri2, cropPoints2, i11, width, i7, cropOverlayView2.f24434v, cropOverlayView2.getAspectRatioX(), this.f24377c.getAspectRatioY(), i4, i5, this.f24387m, this.f24388n, requestSizeOptions, uri, compressFormat, i3);
                this.f24375J = new WeakReference<>(aVar4);
                cropImageView = this;
            }
            cropImageView.f24375J.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            mo25132h();
            return;
        }
    }

    /* renamed from: j */
    public final void mo25134j(boolean z) {
        float[] fArr;
        if (this.f24384j != null && !z) {
            float[] fArr2 = this.f24382h;
            float p = (((float) this.f24366A) * 100.0f) / (C8053c.m18386p(fArr2) - C8053c.m18385o(fArr2));
            float[] fArr3 = this.f24382h;
            float m = (((float) this.f24366A) * 100.0f) / (C8053c.m18383m(fArr3) - C8053c.m18387q(fArr3));
            C8056d dVar = this.f24377c.f24416d;
            dVar.f24495e = (float) getWidth();
            dVar.f24496f = (float) getHeight();
            dVar.f24501k = p;
            dVar.f24502l = m;
        }
        CropOverlayView cropOverlayView = this.f24377c;
        if (z) {
            fArr = null;
        } else {
            fArr = this.f24381g;
        }
        cropOverlayView.mo25171g(getWidth(), getHeight(), fArr);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f24389o <= 0 || this.f24390p <= 0) {
            mo25134j(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f24389o;
        layoutParams.height = this.f24390p;
        setLayoutParams(layoutParams);
        if (this.f24384j != null) {
            float f = (float) (i3 - i);
            float f2 = (float) (i4 - i2);
            mo25111a(f, f2, true, false);
            if (this.f24370E != null) {
                int i5 = this.f24371F;
                if (i5 != this.f24385k) {
                    this.f24386l = i5;
                    mo25111a(f, f2, true, false);
                }
                this.f24378d.mapRect(this.f24370E);
                this.f24377c.setCropWindowRect(this.f24370E);
                mo25113c(false, false);
                CropOverlayView cropOverlayView = this.f24377c;
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                cropOverlayView.mo25169d(cropWindowRect);
                cropOverlayView.f24416d.f24491a.set(cropWindowRect);
                this.f24370E = null;
            } else if (this.f24372G) {
                this.f24372G = false;
                mo25113c(false, false);
            }
        } else {
            mo25134j(true);
        }
    }

    public final void onMeasure(int i, int i2) {
        double d;
        double d2;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f24384j;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.f24384j.getWidth()) {
                d = ((double) size) / ((double) this.f24384j.getWidth());
            } else {
                d = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.f24384j.getHeight()) {
                d2 = ((double) size2) / ((double) this.f24384j.getHeight());
            } else {
                d2 = Double.POSITIVE_INFINITY;
            }
            if (d == Double.POSITIVE_INFINITY && d2 == Double.POSITIVE_INFINITY) {
                i4 = this.f24384j.getWidth();
                i3 = this.f24384j.getHeight();
            } else if (d <= d2) {
                i3 = (int) (((double) this.f24384j.getHeight()) * d);
                i4 = size;
            } else {
                i4 = (int) (((double) this.f24384j.getWidth()) * d2);
                i3 = size2;
            }
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(i4, size);
                } else {
                    size = i4;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(i3, size2);
                } else {
                    size2 = i3;
                }
            }
            this.f24389o = size;
            this.f24390p = size2;
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bitmap bitmap;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f24374I == null && this.f24400z == null && this.f24384j == null && this.f24391q == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = C8053c.f24486g;
                        if (pair == null || !((String) pair.first).equals(string)) {
                            bitmap = null;
                        } else {
                            bitmap = (Bitmap) ((WeakReference) C8053c.f24486g.second).get();
                        }
                        C8053c.f24486g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            mo25116f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.f24400z == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i2 = bundle.getInt("DEGREES_ROTATED");
                this.f24371F = i2;
                this.f24386l = i2;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    this.f24377c.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > BitmapDescriptorFactory.HUE_RED || rectF.height() > BitmapDescriptorFactory.HUE_RED)) {
                    this.f24370E = rectF;
                }
                this.f24377c.setCropShape(CropShape.valueOf(bundle.getString("CROP_SHAPE")));
                this.f24396v = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f24397w = bundle.getInt("CROP_MAX_ZOOM");
                this.f24387m = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.f24388n = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        C8051b bVar;
        OutputStream outputStream;
        boolean z = true;
        if (this.f24400z == null && this.f24384j == null && this.f24391q < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f24400z;
        if (this.f24393s && uri == null && this.f24391q < 1) {
            Context context = getContext();
            Bitmap bitmap = this.f24384j;
            Uri uri2 = this.f24373H;
            Rect rect = C8053c.f24480a;
            if (uri2 == null) {
                try {
                    uri2 = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                } catch (Exception unused) {
                    uri = null;
                }
            } else if (new File(uri2.getPath()).exists()) {
                z = false;
            }
            if (z) {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                try {
                    outputStream = context.getContentResolver().openOutputStream(uri2);
                    try {
                        bitmap.compress(compressFormat, 95, outputStream);
                        C8053c.m18373c(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        C8053c.m18373c(outputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    C8053c.m18373c(outputStream);
                    throw th;
                }
            }
            uri = uri2;
            this.f24373H = uri;
        }
        if (!(uri == null || this.f24384j == null)) {
            String uuid = UUID.randomUUID().toString();
            C8053c.f24486g = new Pair<>(uuid, new WeakReference(this.f24384j));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<C8051b> weakReference = this.f24374I;
        if (!(weakReference == null || (bVar = weakReference.get()) == null)) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.f24471b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f24391q);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f24366A);
        bundle.putInt("DEGREES_ROTATED", this.f24386l);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f24377c.getInitialCropWindowRect());
        RectF rectF = C8053c.f24482c;
        rectF.set(this.f24377c.getCropWindowRect());
        this.f24378d.invert(this.f24379e);
        this.f24379e.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.f24377c.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f24396v);
        bundle.putInt("CROP_MAX_ZOOM", this.f24397w);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f24387m);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f24388n);
        return bundle;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 <= 0 || i4 <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f24372G = z;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f24396v != z) {
            this.f24396v = z;
            mo25113c(false, false);
            this.f24377c.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f24377c.setInitialCropWindowRect(rect);
    }

    public void setCropShape(CropShape cropShape) {
        this.f24377c.setCropShape(cropShape);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f24377c.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f24387m != z) {
            this.f24387m = z;
            mo25111a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f24388n != z) {
            this.f24388n = z;
            mo25111a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setGuidelines(Guidelines guidelines) {
        this.f24377c.setGuidelines(guidelines);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f24377c.setInitialCropWindowRect((Rect) null);
        mo25116f(bitmap, 0, (Uri) null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f24377c.setInitialCropWindowRect((Rect) null);
            mo25116f(BitmapFactory.decodeResource(getResources(), i), i, (Uri) null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        C8051b bVar;
        if (uri != null) {
            WeakReference<C8051b> weakReference = this.f24374I;
            if (weakReference != null) {
                bVar = weakReference.get();
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.cancel(true);
            }
            mo25112b();
            this.f24370E = null;
            this.f24371F = 0;
            this.f24377c.setInitialCropWindowRect((Rect) null);
            WeakReference<C8051b> weakReference2 = new WeakReference<>(new C8051b(this, uri));
            this.f24374I = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            mo25132h();
        }
    }

    public void setMaxZoom(int i) {
        if (this.f24397w != i && i > 0) {
            this.f24397w = i;
            mo25113c(false, false);
            this.f24377c.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f24377c.mo25178h(z)) {
            mo25113c(false, false);
            this.f24377c.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(C8041c cVar) {
        this.f24399y = cVar;
    }

    public void setOnCropWindowChangedListener(C8044f fVar) {
    }

    public void setOnSetCropOverlayMovedListener(C8042d dVar) {
    }

    public void setOnSetCropOverlayReleasedListener(C8043e eVar) {
    }

    public void setOnSetImageUriCompleteListener(C8045g gVar) {
        this.f24398x = gVar;
    }

    public void setRotatedDegrees(int i) {
        int i2 = this.f24386l;
        if (i2 != i) {
            mo25115e(i - i2);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f24393s = z;
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != this.f24392r) {
            this.f24392r = scaleType;
            this.f24367B = 1.0f;
            this.f24369D = BitmapDescriptorFactory.HUE_RED;
            this.f24368C = BitmapDescriptorFactory.HUE_RED;
            CropOverlayView cropOverlayView = this.f24377c;
            if (cropOverlayView.f24413C) {
                cropOverlayView.setCropWindowRect(C8053c.f24481b);
                cropOverlayView.mo25170f();
                cropOverlayView.invalidate();
            }
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f24394t != z) {
            this.f24394t = z;
            mo25117g();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f24395u != z) {
            this.f24395u = z;
            mo25132h();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f24377c.setSnapRadius(f);
        }
    }
}
