package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1896b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import p006a5.C0080a;
import p006a5.C0081b;
import p024b5.C1482d;
import p090g1.C4732a;
import p107h5.C5055c;
import p107h5.C5056d;
import p107h5.C5059g;
import p120i5.C5282c;
import p584jl.C17885a;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: u */
    public static final C1858a f6414u = new C1858a();

    /* renamed from: b */
    public final C1859b f6415b = new C1859b();

    /* renamed from: c */
    public final C1860c f6416c = new C1860c();

    /* renamed from: d */
    public C1899o<Throwable> f6417d;

    /* renamed from: e */
    public int f6418e = 0;

    /* renamed from: f */
    public final C1876l f6419f = new C1876l();

    /* renamed from: g */
    public boolean f6420g;

    /* renamed from: h */
    public String f6421h;

    /* renamed from: i */
    public int f6422i;

    /* renamed from: j */
    public boolean f6423j = false;

    /* renamed from: k */
    public boolean f6424k = false;

    /* renamed from: l */
    public boolean f6425l = false;

    /* renamed from: m */
    public boolean f6426m = false;

    /* renamed from: n */
    public boolean f6427n = false;

    /* renamed from: o */
    public boolean f6428o = true;

    /* renamed from: p */
    public RenderMode f6429p = RenderMode.AUTOMATIC;

    /* renamed from: q */
    public final HashSet f6430q = new HashSet();

    /* renamed from: r */
    public int f6431r = 0;

    /* renamed from: s */
    public C1906t<C1867f> f6432s;

    /* renamed from: t */
    public C1867f f6433t;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1857a();

        /* renamed from: b */
        public String f6434b;

        /* renamed from: c */
        public int f6435c;

        /* renamed from: d */
        public float f6436d;

        /* renamed from: e */
        public boolean f6437e;

        /* renamed from: f */
        public String f6438f;

        /* renamed from: g */
        public int f6439g;

        /* renamed from: h */
        public int f6440h;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        public class C1857a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6434b);
            parcel.writeFloat(this.f6436d);
            parcel.writeInt(this.f6437e ? 1 : 0);
            parcel.writeString(this.f6438f);
            parcel.writeInt(this.f6439g);
            parcel.writeInt(this.f6440h);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6434b = parcel.readString();
            this.f6436d = parcel.readFloat();
            this.f6437e = parcel.readInt() != 1 ? false : true;
            this.f6438f = parcel.readString();
            this.f6439g = parcel.readInt();
            this.f6440h = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C1858a implements C1899o<Throwable> {
        public final void onResult(Object obj) {
            boolean z;
            Throwable th = (Throwable) obj;
            C5059g.C5060a aVar = C5059g.f17057a;
            if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C5055c.m12897c("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public class C1859b implements C1899o<C1867f> {
        public C1859b() {
        }

        public final void onResult(Object obj) {
            LottieAnimationView.this.setComposition((C1867f) obj);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public class C1860c implements C1899o<Throwable> {
        public C1860c() {
        }

        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i = lottieAnimationView.f6418e;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            C1899o oVar = LottieAnimationView.this.f6417d;
            if (oVar == null) {
                oVar = LottieAnimationView.f6414u;
            }
            oVar.onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    public static /* synthetic */ class C1861d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6443a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.RenderMode[] r0 = com.airbnb.lottie.RenderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6443a = r0
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6443a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6443a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C1861d.<clinit>():void");
        }
    }

    static {
        Class<LottieAnimationView> cls = LottieAnimationView.class;
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6696e(attributeSet, C1910v.lottieAnimationViewStyle);
    }

    private void setCompositionTask(C1906t<C1867f> tVar) {
        this.f6433t = null;
        this.f6419f.mo6767d();
        mo6694c();
        C1859b bVar = this.f6415b;
        synchronized (tVar) {
            if (!(tVar.f6710d == null || tVar.f6710d.f6703a == null)) {
                bVar.onResult(tVar.f6710d.f6703a);
            }
            tVar.f6707a.add(bVar);
        }
        C1860c cVar = this.f6416c;
        synchronized (tVar) {
            if (!(tVar.f6710d == null || tVar.f6710d.f6704b == null)) {
                cVar.onResult(tVar.f6710d.f6704b);
            }
            tVar.f6708b.add(cVar);
        }
        this.f6432s = tVar;
    }

    public final void buildDrawingCache(boolean z) {
        this.f6431r++;
        super.buildDrawingCache(z);
        if (this.f6431r == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f6431r--;
        C17885a.m44412M();
    }

    /* renamed from: c */
    public final void mo6694c() {
        C1906t<C1867f> tVar = this.f6432s;
        if (tVar != null) {
            C1859b bVar = this.f6415b;
            synchronized (tVar) {
                tVar.f6707a.remove(bVar);
            }
            C1906t<C1867f> tVar2 = this.f6432s;
            C1860c cVar = this.f6416c;
            synchronized (tVar2) {
                tVar2.f6708b.remove(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3 != false) goto L_0x003b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6695d() {
        /*
            r6 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C1861d.f6443a
            com.airbnb.lottie.RenderMode r1 = r6.f6429p
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x003b
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = 1
            goto L_0x003b
        L_0x0015:
            com.airbnb.lottie.f r0 = r6.f6433t
            r3 = 0
            if (r0 == 0) goto L_0x0025
            boolean r4 = r0.f6462n
            if (r4 == 0) goto L_0x0025
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L_0x0025
            goto L_0x0039
        L_0x0025:
            if (r0 == 0) goto L_0x002d
            int r0 = r0.f6463o
            r4 = 4
            if (r0 <= r4) goto L_0x002d
            goto L_0x0039
        L_0x002d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 == r4) goto L_0x0039
            r4 = 25
            if (r0 != r4) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = 1
        L_0x0039:
            if (r3 == 0) goto L_0x0013
        L_0x003b:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L_0x0045
            r0 = 0
            r6.setLayerType(r1, r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.mo6695d():void");
    }

    /* renamed from: e */
    public final void mo6696e(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1911w.LottieAnimationView, i, 0);
        this.f6428o = obtainStyledAttributes.getBoolean(C1911w.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = C1911w.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C1911w.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C1911w.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(C1911w.LottieAnimationView_lottie_fallbackRes, 0));
            if (obtainStyledAttributes.getBoolean(C1911w.LottieAnimationView_lottie_autoPlay, false)) {
                this.f6425l = true;
                this.f6427n = true;
            }
            if (obtainStyledAttributes.getBoolean(C1911w.LottieAnimationView_lottie_loop, false)) {
                this.f6419f.f6483d.setRepeatCount(-1);
            }
            int i5 = C1911w.LottieAnimationView_lottie_repeatMode;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = C1911w.LottieAnimationView_lottie_repeatCount;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = C1911w.LottieAnimationView_lottie_speed;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(C1911w.LottieAnimationView_lottie_imageAssetsFolder));
            setProgress(obtainStyledAttributes.getFloat(C1911w.LottieAnimationView_lottie_progress, BitmapDescriptorFactory.HUE_RED));
            boolean z2 = obtainStyledAttributes.getBoolean(C1911w.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
            C1876l lVar = this.f6419f;
            if (lVar.f6492m != z2) {
                lVar.f6492m = z2;
                if (lVar.f6482c != null) {
                    lVar.mo6766c();
                }
            }
            int i8 = C1911w.LottieAnimationView_lottie_colorFilter;
            if (obtainStyledAttributes.hasValue(i8)) {
                C1912x xVar = new C1912x(C4732a.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor());
                C1482d dVar = new C1482d("**");
                C5282c cVar = new C5282c(xVar);
                this.f6419f.mo6764a(dVar, C1903q.f6673K, cVar);
            }
            int i9 = C1911w.LottieAnimationView_lottie_scale;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.f6419f.f6484e = obtainStyledAttributes.getFloat(i9, 1.0f);
            }
            int i11 = C1911w.LottieAnimationView_lottie_renderMode;
            if (obtainStyledAttributes.hasValue(i11)) {
                RenderMode renderMode = RenderMode.AUTOMATIC;
                int i12 = obtainStyledAttributes.getInt(i11, renderMode.ordinal());
                if (i12 >= RenderMode.values().length) {
                    i12 = renderMode.ordinal();
                }
                setRenderMode(RenderMode.values()[i12]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C1911w.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
            obtainStyledAttributes.recycle();
            C1876l lVar2 = this.f6419f;
            Context context = getContext();
            C5059g.C5060a aVar = C5059g.f17057a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != BitmapDescriptorFactory.HUE_RED) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            lVar2.getClass();
            lVar2.f6485f = valueOf.booleanValue();
            mo6695d();
            this.f6420g = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    /* renamed from: f */
    public final void mo6697f() {
        if (isShown()) {
            this.f6419f.mo6770f();
            mo6695d();
            return;
        }
        this.f6423j = true;
    }

    public C1867f getComposition() {
        return this.f6433t;
    }

    public long getDuration() {
        C1867f fVar = this.f6433t;
        if (fVar != null) {
            return (long) fVar.mo6756b();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.f6419f.f6483d.f17049g;
    }

    public String getImageAssetsFolder() {
        return this.f6419f.f6490k;
    }

    public float getMaxFrame() {
        return this.f6419f.f6483d.mo20800g();
    }

    public float getMinFrame() {
        return this.f6419f.f6483d.mo20804h();
    }

    public C1908u getPerformanceTracker() {
        C1867f fVar = this.f6419f.f6482c;
        if (fVar != null) {
            return fVar.f6449a;
        }
        return null;
    }

    public float getProgress() {
        C5056d dVar = this.f6419f.f6483d;
        C1867f fVar = dVar.f17053k;
        if (fVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = dVar.f17049g;
        float f2 = fVar.f6459k;
        return (f - f2) / (fVar.f6460l - f2);
    }

    public int getRepeatCount() {
        return this.f6419f.f6483d.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f6419f.f6483d.getRepeatMode();
    }

    public float getScale() {
        return this.f6419f.f6484e;
    }

    public float getSpeed() {
        return this.f6419f.f6483d.f17046d;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C1876l lVar = this.f6419f;
        if (drawable2 == lVar) {
            super.invalidateDrawable(lVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f6427n || this.f6425l)) {
            mo6697f();
            this.f6427n = false;
            this.f6425l = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public final void onDetachedFromWindow() {
        boolean z;
        C1876l lVar = this.f6419f;
        C5056d dVar = lVar.f6483d;
        if (dVar == null) {
            z = false;
        } else {
            z = dVar.f17054l;
        }
        if (z) {
            this.f6425l = false;
            this.f6424k = false;
            this.f6423j = false;
            lVar.f6488i.clear();
            lVar.f6483d.cancel();
            mo6695d();
            this.f6425l = true;
        }
        super.onDetachedFromWindow();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f6434b;
        this.f6421h = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f6421h);
        }
        int i = savedState.f6435c;
        this.f6422i = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f6436d);
        if (savedState.f6437e) {
            mo6697f();
        }
        this.f6419f.f6490k = savedState.f6438f;
        setRepeatMode(savedState.f6439g);
        setRepeatCount(savedState.f6440h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r5.f6425l != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r5 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.airbnb.lottie.LottieAnimationView$SavedState r1 = new com.airbnb.lottie.LottieAnimationView$SavedState
            r1.<init>((android.os.Parcelable) r0)
            java.lang.String r0 = r5.f6421h
            r1.f6434b = r0
            int r0 = r5.f6422i
            r1.f6435c = r0
            com.airbnb.lottie.l r0 = r5.f6419f
            h5.d r0 = r0.f6483d
            com.airbnb.lottie.f r2 = r0.f17053k
            if (r2 != 0) goto L_0x001b
            r2 = 0
            goto L_0x0025
        L_0x001b:
            float r3 = r0.f17049g
            float r4 = r2.f6459k
            float r3 = r3 - r4
            float r2 = r2.f6460l
            float r2 = r2 - r4
            float r2 = r3 / r2
        L_0x0025:
            r1.f6436d = r2
            r2 = 0
            if (r0 != 0) goto L_0x002c
            r0 = 0
            goto L_0x002e
        L_0x002c:
            boolean r0 = r0.f17054l
        L_0x002e:
            if (r0 != 0) goto L_0x003c
            java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
            boolean r0 = p242s1.C6333d0.C6340g.m15075b(r5)
            if (r0 != 0) goto L_0x003d
            boolean r0 = r5.f6425l
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r2 = 1
        L_0x003d:
            r1.f6437e = r2
            com.airbnb.lottie.l r0 = r5.f6419f
            java.lang.String r2 = r0.f6490k
            r1.f6438f = r2
            h5.d r0 = r0.f6483d
            int r0 = r0.getRepeatMode()
            r1.f6439g = r0
            com.airbnb.lottie.l r0 = r5.f6419f
            h5.d r0 = r0.f6483d
            int r0 = r0.getRepeatCount()
            r1.f6440h = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.onSaveInstanceState():android.os.Parcelable");
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        if (this.f6420g) {
            if (isShown()) {
                if (this.f6424k) {
                    if (isShown()) {
                        this.f6419f.mo6771g();
                        mo6695d();
                    } else {
                        this.f6423j = false;
                        this.f6424k = true;
                    }
                } else if (this.f6423j) {
                    mo6697f();
                }
                this.f6424k = false;
                this.f6423j = false;
                return;
            }
            C1876l lVar = this.f6419f;
            C5056d dVar = lVar.f6483d;
            if (dVar == null) {
                z = false;
            } else {
                z = dVar.f17054l;
            }
            if (z) {
                this.f6427n = false;
                this.f6425l = false;
                this.f6424k = false;
                this.f6423j = false;
                lVar.f6488i.clear();
                lVar.f6483d.mo20807j(true);
                mo6695d();
                this.f6424k = true;
            }
        }
    }

    public void setAnimation(int i) {
        C1906t<C1867f> tVar;
        C1906t<C1867f> tVar2;
        this.f6422i = i;
        this.f6421h = null;
        if (isInEditMode()) {
            tVar = new C1906t<>(new C1865d(this, i), true);
        } else {
            if (this.f6428o) {
                Context context = getContext();
                String i2 = C1868g.m5251i(i, context);
                tVar2 = C1868g.m5243a(i2, new C1874j(new WeakReference(context), context.getApplicationContext(), i, i2));
            } else {
                Context context2 = getContext();
                HashMap hashMap = C1868g.f6464a;
                tVar2 = C1868g.m5243a((String) null, new C1874j(new WeakReference(context2), context2.getApplicationContext(), i, (String) null));
            }
            tVar = tVar2;
        }
        setCompositionTask(tVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(C1868g.m5243a((String) null, new C1875k(new ByteArrayInputStream(str.getBytes()))));
    }

    public void setAnimationFromUrl(String str) {
        C1906t<C1867f> tVar;
        if (this.f6428o) {
            tVar = C1868g.m5248f(getContext(), str);
        } else {
            tVar = C1868g.m5243a((String) null, new C1872h(getContext(), str, (String) null));
        }
        setCompositionTask(tVar);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f6419f.f6497r = z;
    }

    public void setCacheComposition(boolean z) {
        this.f6428o = z;
    }

    public void setComposition(C1867f fVar) {
        boolean z;
        this.f6419f.setCallback(this);
        this.f6433t = fVar;
        boolean z2 = true;
        this.f6426m = true;
        C1876l lVar = this.f6419f;
        boolean z3 = false;
        if (lVar.f6482c == fVar) {
            z2 = false;
        } else {
            lVar.f6499t = false;
            lVar.mo6767d();
            lVar.f6482c = fVar;
            lVar.mo6766c();
            C5056d dVar = lVar.f6483d;
            if (dVar.f17053k == null) {
                z = true;
            } else {
                z = false;
            }
            dVar.f17053k = fVar;
            if (z) {
                dVar.mo20809l((float) ((int) Math.max(dVar.f17051i, fVar.f6459k)), (float) ((int) Math.min(dVar.f17052j, fVar.f6460l)));
            } else {
                dVar.mo20809l((float) ((int) fVar.f6459k), (float) ((int) fVar.f6460l));
            }
            float f = dVar.f17049g;
            dVar.f17049g = BitmapDescriptorFactory.HUE_RED;
            dVar.mo20808k((float) ((int) f));
            dVar.mo20789f();
            lVar.mo6787p(lVar.f6483d.getAnimatedFraction());
            lVar.f6484e = lVar.f6484e;
            Iterator it = new ArrayList(lVar.f6488i).iterator();
            while (it.hasNext()) {
                C1876l.C1890n nVar = (C1876l.C1890n) it.next();
                if (nVar != null) {
                    nVar.run();
                }
                it.remove();
            }
            lVar.f6488i.clear();
            fVar.f6449a.f6712a = lVar.f6495p;
            Drawable.Callback callback = lVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(lVar);
            }
        }
        this.f6426m = false;
        mo6695d();
        Drawable drawable = getDrawable();
        C1876l lVar2 = this.f6419f;
        if (drawable != lVar2 || z2) {
            if (!z2) {
                C5056d dVar2 = lVar2.f6483d;
                if (dVar2 != null) {
                    z3 = dVar2.f17054l;
                }
                setImageDrawable((Drawable) null);
                setImageDrawable(this.f6419f);
                if (z3) {
                    this.f6419f.mo6771g();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f6430q.iterator();
            while (it2.hasNext()) {
                ((C1900p) it2.next()).mo6822a();
            }
        }
    }

    public void setFailureListener(C1899o<Throwable> oVar) {
        this.f6417d = oVar;
    }

    public void setFallbackResource(int i) {
        this.f6418e = i;
    }

    public void setFontAssetDelegate(C1862a aVar) {
        C0080a aVar2 = this.f6419f.f6491l;
    }

    public void setFrame(int i) {
        this.f6419f.mo6776h(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f6419f.f6486g = z;
    }

    public void setImageAssetDelegate(C1863b bVar) {
        C1876l lVar = this.f6419f;
        lVar.getClass();
        C0081b bVar2 = lVar.f6489j;
        if (bVar2 != null) {
            bVar2.getClass();
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f6419f.f6490k = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        mo6694c();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        mo6694c();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        mo6694c();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f6419f.mo6777i(i);
    }

    public void setMaxProgress(float f) {
        this.f6419f.mo6782k(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f6419f.mo6783l(str);
    }

    public void setMinFrame(int i) {
        this.f6419f.mo6784m(i);
    }

    public void setMinProgress(float f) {
        this.f6419f.mo6786o(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        C1876l lVar = this.f6419f;
        if (lVar.f6496q != z) {
            lVar.f6496q = z;
            C1896b bVar = lVar.f6493n;
            if (bVar != null) {
                bVar.mo6818r(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C1876l lVar = this.f6419f;
        lVar.f6495p = z;
        C1867f fVar = lVar.f6482c;
        if (fVar != null) {
            fVar.f6449a.f6712a = z;
        }
    }

    public void setProgress(float f) {
        this.f6419f.mo6787p(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f6429p = renderMode;
        mo6695d();
    }

    public void setRepeatCount(int i) {
        this.f6419f.f6483d.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f6419f.f6483d.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f6419f.f6487h = z;
    }

    public void setScale(float f) {
        boolean z;
        this.f6419f.f6484e = f;
        Drawable drawable = getDrawable();
        C1876l lVar = this.f6419f;
        if (drawable == lVar) {
            C5056d dVar = lVar.f6483d;
            if (dVar == null) {
                z = false;
            } else {
                z = dVar.f17054l;
            }
            setImageDrawable((Drawable) null);
            setImageDrawable(this.f6419f);
            if (z) {
                this.f6419f.mo6771g();
            }
        }
    }

    public void setSpeed(float f) {
        this.f6419f.f6483d.f17046d = f;
    }

    public void setTextDelegate(C1913y yVar) {
        this.f6419f.getClass();
    }

    public final void unscheduleDrawable(Drawable drawable) {
        C1876l lVar;
        boolean z;
        boolean z2 = this.f6426m;
        boolean z3 = false;
        if (!z2 && drawable == (lVar = this.f6419f)) {
            C5056d dVar = lVar.f6483d;
            if (dVar == null) {
                z = false;
            } else {
                z = dVar.f17054l;
            }
            if (z) {
                this.f6427n = false;
                this.f6425l = false;
                this.f6424k = false;
                this.f6423j = false;
                lVar.f6488i.clear();
                lVar.f6483d.mo20807j(true);
                mo6695d();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z2 && (drawable instanceof C1876l)) {
            C1876l lVar2 = (C1876l) drawable;
            C5056d dVar2 = lVar2.f6483d;
            if (dVar2 != null) {
                z3 = dVar2.f17054l;
            }
            if (z3) {
                lVar2.f6488i.clear();
                lVar2.f6483d.mo20807j(true);
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f6419f.mo6781j(str);
    }

    public void setMinFrame(String str) {
        this.f6419f.mo6785n(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo6696e(attributeSet, i);
    }

    public void setAnimation(String str) {
        C1906t<C1867f> tVar;
        C1906t<C1867f> tVar2;
        this.f6421h = str;
        this.f6422i = 0;
        if (isInEditMode()) {
            tVar = new C1906t<>(new C1866e(this, str), true);
        } else {
            if (this.f6428o) {
                Context context = getContext();
                HashMap hashMap = C1868g.f6464a;
                String k = C25541a.m63881k("asset_", str);
                tVar2 = C1868g.m5243a(k, new C1873i(context.getApplicationContext(), str, k));
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = C1868g.f6464a;
                tVar2 = C1868g.m5243a((String) null, new C1873i(context2.getApplicationContext(), str, (String) null));
            }
            tVar = tVar2;
        }
        setCompositionTask(tVar);
    }
}
