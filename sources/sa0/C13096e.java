package sa0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import androidx.activity.C0199g;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.view.GLTextureView;
import com.nutiteq.cache.TextureInfoCache;
import com.nutiteq.components.MapPos;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ma0.C12902c;
import na0.C12923b;
import na0.C12925d;
import na0.C12927e;
import na0.C12930h;
import na0.C12931i;
import na0.C12932j;
import na0.C12934k;
import na0.C12935l;
import na0.C12936m;
import oa0.C12974i;
import p845um.C19958a;
import pa0.C12998a;
import pa0.C12999b;
import ra0.C13054a;
import sa0.C13089a;
import ta0.C13125b;
import ta0.C13131g;
import ua0.C13144b;
import wa0.C13230b;
import xa0.C13243a;
import xa0.C13244b;
import xa0.C13247c;
import xa0.C13248d;
import xa0.C13250f;
import ya0.C13275b;
import ya0.C13277d;
import ya0.C13279f;
import ya0.C13281g;
import ya0.C13283h;
import ya0.C13288j;
import za0.C13354a;
import za0.C13361f;

/* renamed from: sa0.e */
public final class C13096e implements C13097f {

    /* renamed from: A */
    public C12923b f32401A;

    /* renamed from: A0 */
    public final C13100i f32402A0;

    /* renamed from: B */
    public final C12931i f32403B;

    /* renamed from: B0 */
    public final C12999b f32404B0;

    /* renamed from: C */
    public final C12931i f32405C;

    /* renamed from: C0 */
    public final C12927e f32406C0;

    /* renamed from: D */
    public final C12931i f32407D;

    /* renamed from: D0 */
    public final C12932j f32408D0;

    /* renamed from: E */
    public volatile boolean f32409E;

    /* renamed from: E0 */
    public ReentrantLock f32410E0;

    /* renamed from: F */
    public C12931i f32411F;

    /* renamed from: F0 */
    public C13230b f32412F0;

    /* renamed from: G */
    public volatile boolean f32413G;

    /* renamed from: G0 */
    public C13104m f32414G0;

    /* renamed from: H */
    public float f32415H;

    /* renamed from: H0 */
    public C13102k f32416H0;

    /* renamed from: I */
    public C13089a f32417I;

    /* renamed from: I0 */
    public C13092c f32418I0;

    /* renamed from: J */
    public volatile boolean f32419J;

    /* renamed from: J0 */
    public boolean f32420J0;

    /* renamed from: K */
    public volatile boolean f32421K;

    /* renamed from: K0 */
    public volatile boolean f32422K0;

    /* renamed from: L */
    public volatile boolean f32423L;

    /* renamed from: L0 */
    public boolean f32424L0;

    /* renamed from: M */
    public volatile boolean f32425M;

    /* renamed from: N */
    public volatile boolean f32426N;

    /* renamed from: O */
    public final C12930h f32427O;

    /* renamed from: P */
    public MapPos f32428P;

    /* renamed from: Q */
    public float f32429Q;

    /* renamed from: R */
    public float f32430R;

    /* renamed from: S */
    public float f32431S;

    /* renamed from: T */
    public float f32432T;

    /* renamed from: U */
    public float f32433U;

    /* renamed from: X */
    public double f32434X;

    /* renamed from: Y */
    public double f32435Y;

    /* renamed from: Z */
    public volatile boolean f32436Z;

    /* renamed from: b */
    public float f32437b;

    /* renamed from: c */
    public final C13103l f32438c;

    /* renamed from: d */
    public final float[] f32439d = {-0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f};

    /* renamed from: e */
    public FloatBuffer f32440e;

    /* renamed from: f */
    public final float[] f32441f = {BitmapDescriptorFactory.HUE_RED, 1.0f, 0.25f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.25f, BitmapDescriptorFactory.HUE_RED, 0.25f, 1.0f, 0.5f, 1.0f, 0.25f, BitmapDescriptorFactory.HUE_RED, 0.5f, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f, 0.75f, 1.0f, 0.5f, BitmapDescriptorFactory.HUE_RED, 0.75f, BitmapDescriptorFactory.HUE_RED, 0.75f, 1.0f, 1.0f, 1.0f, 0.75f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: g */
    public FloatBuffer f32442g;

    /* renamed from: h */
    public TextureInfoCache f32443h = new TextureInfoCache();

    /* renamed from: i */
    public HashMap f32444i = new HashMap();

    /* renamed from: j */
    public GLTextureView f32445j;

    /* renamed from: k */
    public final float[] f32446k;

    /* renamed from: l */
    public final float[] f32447l;

    /* renamed from: l0 */
    public ArrayList f32448l0;

    /* renamed from: m */
    public final float[] f32449m;

    /* renamed from: m0 */
    public List<C12974i> f32450m0;

    /* renamed from: n */
    public final double[] f32451n;

    /* renamed from: n0 */
    public volatile C12974i f32452n0;

    /* renamed from: o */
    public final float[] f32453o;

    /* renamed from: o0 */
    public C12974i f32454o0;

    /* renamed from: p */
    public final double[] f32455p;

    /* renamed from: p0 */
    public C13243a f32456p0;

    /* renamed from: q */
    public final double[] f32457q;

    /* renamed from: q0 */
    public volatile boolean f32458q0;

    /* renamed from: r */
    public final double[] f32459r;

    /* renamed from: r0 */
    public volatile boolean f32460r0;

    /* renamed from: s */
    public final int[] f32461s;

    /* renamed from: s0 */
    public C12935l f32462s0;

    /* renamed from: t */
    public final C12930h f32463t;

    /* renamed from: t0 */
    public float f32464t0;

    /* renamed from: u */
    public final C12930h f32465u;

    /* renamed from: u0 */
    public int f32466u0;

    /* renamed from: v */
    public final C12931i f32467v;

    /* renamed from: v0 */
    public MapPos f32468v0;

    /* renamed from: w */
    public float f32469w;

    /* renamed from: w0 */
    public int f32470w0;

    /* renamed from: x */
    public float f32471x;

    /* renamed from: x0 */
    public volatile boolean f32472x0;

    /* renamed from: y */
    public float f32473y;

    /* renamed from: y0 */
    public final C12925d f32474y0;

    /* renamed from: z */
    public float f32475z;

    /* renamed from: z0 */
    public final C12902c f32476z0;

    public C13096e(C12925d dVar) {
        C13103l lVar = new C13103l();
        this.f32438c = lVar;
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.f32446k = fArr;
        this.f32447l = new float[16];
        this.f32449m = new float[16];
        double[] dArr = new double[16];
        this.f32451n = dArr;
        this.f32453o = new float[16];
        this.f32455p = new double[16];
        this.f32457q = new double[4];
        this.f32459r = new double[4];
        this.f32461s = new int[4];
        C12930h hVar = new C12930h(0);
        this.f32463t = hVar;
        this.f32465u = new C12930h();
        C12931i iVar = new C12931i(0);
        this.f32467v = iVar;
        this.f32403B = new C12931i();
        this.f32405C = new C12931i();
        this.f32407D = new C12931i();
        this.f32411F = new C12931i();
        this.f32415H = BitmapDescriptorFactory.HUE_RED;
        this.f32427O = new C12930h();
        this.f32402A0 = new C13100i();
        this.f32410E0 = new ReentrantLock();
        this.f32420J0 = false;
        this.f32422K0 = false;
        this.f32424L0 = false;
        this.f32474y0 = dVar;
        this.f32445j = null;
        this.f32476z0 = dVar.f32004b;
        this.f32404B0 = dVar.f32009g;
        this.f32406C0 = dVar.f32010h;
        this.f32408D0 = dVar.f32011i;
        MapPos mapPos = new MapPos(hVar);
        C12936m mVar = new C12936m(iVar);
        this.f32401A = new C12923b(mapPos, mVar, dArr, fArr, this.f32469w, this.f32471x, this.f32473y);
        this.f32412F0 = new C13230b(this, dVar);
        this.f32417I = new C13089a(this);
        this.f32414G0 = new C13104m(this, dVar);
        this.f32416H0 = new C13102k(this, dVar, lVar);
        this.f32418I0 = new C13092c(this, dVar);
    }

    /* renamed from: u */
    public static void m33040u(GL10 gl10) {
        gl10.glGetError();
        gl10.glEnable(2884);
        gl10.glCullFace(Place.TYPE_SYNTHETIC_GEOCODE);
        gl10.glEnableClientState(32884);
        gl10.glEnableClientState(32888);
        gl10.glDisableClientState(32886);
        gl10.glEnable(3553);
        gl10.glTexEnvf(8960, 8704, 8448.0f);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glAlphaFunc(516, 0.01f);
        gl10.glEnable(3008);
        gl10.glDisable(3024);
        gl10.glDisable(2929);
        gl10.glDepthFunc(515);
    }

    /* renamed from: v */
    public static void m33041v(GL10 gl10) {
        gl10.glGetError();
        gl10.glBlendFunc(770, 771);
        gl10.glEnable(3553);
        gl10.glBindTexture(3553, 0);
        gl10.glEnableClientState(32884);
        gl10.glEnableClientState(32888);
        gl10.glDisableClientState(32886);
    }

    /* renamed from: A */
    public final void mo39959A(GL10 gl10) {
        MapPos mapPos;
        Matrix matrix;
        GL10 gl102 = gl10;
        C13243a aVar = this.f32456p0;
        C12974i iVar = this.f32454o0;
        if (iVar != null) {
            C13243a aVar2 = iVar.f32121a;
            this.f32456p0 = aVar2;
            if (aVar2 != null && (aVar2 != aVar || ((C13250f) aVar2).f32890n)) {
                this.f32460r0 = true;
                if (this.f32468v0 == null) {
                    this.f32458q0 = true;
                }
            }
        }
        MapPos mapPos2 = this.f32468v0;
        if (this.f32458q0) {
            this.f32458q0 = false;
            C12974i iVar2 = this.f32454o0;
            if (iVar2 == null) {
                this.f32468v0 = null;
            } else if (iVar2.mo39840c().f32128b == null) {
                this.f32468v0 = null;
            } else {
                C13125b bVar = (C13125b) this.f32444i.get(iVar2.f32123c);
                if (!(bVar instanceof C13131g)) {
                    this.f32468v0 = null;
                } else {
                    MapPos g = ((C13131g) bVar).mo40035g(iVar2, this.f32401A, this.f32428P);
                    MapPos E = mo39963E(g.f24175b, g.f24176c, g.f24177d);
                    this.f32468v0 = new MapPos(E.f24175b, ((double) this.f32431S) - E.f24176c, 0.0d);
                }
            }
        }
        if (this.f32460r0) {
            this.f32460r0 = false;
            C13243a aVar3 = this.f32456p0;
            if (aVar3 != null) {
                C13250f fVar = (C13250f) aVar3;
                int max = Math.max(fVar.f32881e, (fVar.f32880d.f32651a * 2) + fVar.f32883g);
                int i = fVar.f32882f + fVar.f32884h;
                C13144b bVar2 = fVar.f32880d;
                int i2 = (bVar2.f32651a * 2) + i + bVar2.f32652b;
                int max2 = Math.max(0, bVar2.f32655e - bVar2.f32654d) + i2;
                int c = C13288j.m33428c(max);
                int c2 = C13288j.m33428c(max2);
                float f = (float) max;
                float f2 = f / ((float) c);
                float f3 = (float) max2;
                float f4 = f3 / ((float) c2);
                Bitmap createBitmap = Bitmap.createBitmap(c, c2, Bitmap.Config.ARGB_8888);
                C12935l lVar = new C12935l(createBitmap, new float[]{0.0f, f4, f2, f4, 0.0f, 0.0f, f2, 0.0f}, f, f3);
                Canvas canvas = new Canvas(createBitmap);
                fVar.f32889m.setColor(fVar.f32880d.f32659i);
                RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, (float) i2);
                fVar.f32880d.getClass();
                float f5 = (float) 15;
                fVar.f32880d.getClass();
                canvas.drawRoundRect(rectF, f5, f5, fVar.f32889m);
                fVar.f32889m.setColor(fVar.f32880d.f32658h);
                int i3 = fVar.f32880d.f32654d;
                float f6 = (float) i3;
                RectF rectF2 = new RectF(f6, f6, (float) (max - i3), (float) (i2 - i3));
                float f7 = (float) fVar.f32880d.f32653c;
                canvas.drawRoundRect(rectF2, f7, f7, fVar.f32889m);
                Path path = new Path();
                path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                path.lineTo((float) fVar.f32880d.f32655e, BitmapDescriptorFactory.HUE_RED);
                int i4 = fVar.f32880d.f32655e;
                path.lineTo((float) (i4 / 2), (float) i4);
                path.lineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                float f8 = (float) ((int) (((double) fVar.f32880d.f32654d) * 1.4d));
                Path path2 = new Path();
                path2.moveTo(f8, BitmapDescriptorFactory.HUE_RED);
                path2.lineTo(((float) fVar.f32880d.f32655e) - f8, BitmapDescriptorFactory.HUE_RED);
                int i5 = fVar.f32880d.f32655e;
                path2.lineTo((float) (i5 / 2), ((float) i5) - (1.5f * f8));
                path2.lineTo(f8, BitmapDescriptorFactory.HUE_RED);
                int i6 = max / 2;
                C13144b bVar3 = fVar.f32880d;
                canvas.translate((float) (i6 - (bVar3.f32655e / 2)), (float) (i2 - bVar3.f32654d));
                fVar.f32889m.setColor(fVar.f32880d.f32659i);
                canvas.drawPath(path, fVar.f32889m);
                fVar.f32889m.setColor(fVar.f32880d.f32658h);
                canvas.drawPath(path2, fVar.f32889m);
                canvas.setMatrix((Matrix) null);
                if (fVar.f32877a != null) {
                    fVar.f32889m.setColor(fVar.f32880d.f32660j);
                    fVar.f32889m.setTypeface(fVar.f32880d.f32657g);
                    fVar.f32889m.setTextSize(fVar.f32880d.f32656f);
                    canvas.drawText(fVar.f32877a, (float) i6, (float) (fVar.f32880d.f32651a + fVar.f32882f), fVar.f32889m);
                }
                synchronized (fVar.f32888l) {
                    fVar.f32890n = false;
                    canvas.drawBitmap(fVar.f32888l, (float) ((max - fVar.f32883g) / 2), (float) (fVar.f32880d.f32651a + fVar.f32882f), (Paint) null);
                }
                this.f32462s0 = lVar;
                this.f32464t0 = ((C13250f) this.f32456p0).f32880d.f32661k;
                C13277d.m33406d(gl102, this.f32466u0);
                this.f32466u0 = C13277d.m33404b(gl102, createBitmap);
                gl102.glTexParameterx(3553, 10242, 33071);
                gl102.glTexParameterx(3553, 10243, 33071);
                int glGetError = gl10.glGetError();
                if (glGetError != 0) {
                    Integer.toHexString(glGetError);
                }
            }
        }
        GLTextureView gLTextureView = this.f32445j;
        if (this.f32456p0 != aVar || this.f32468v0 != mapPos2) {
            if (!(aVar == null || gLTextureView == null)) {
                C13250f fVar2 = (C13250f) aVar;
                C13247c cVar = fVar2.f32887k;
                if (cVar != null) {
                    fVar2.f32879c.removeCallbacks(cVar);
                    matrix = null;
                    fVar2.f32887k = null;
                } else {
                    matrix = null;
                }
                fVar2.f32892p = matrix;
                fVar2.f32879c.post(new C0199g(fVar2, 18));
            }
            C13243a aVar4 = this.f32456p0;
            if (aVar4 != null && (mapPos = this.f32468v0) != null && gLTextureView != null) {
                float f9 = (float) mapPos.f24175b;
                float f11 = (float) mapPos.f24176c;
                C13250f fVar3 = (C13250f) aVar4;
                if (fVar3.f32887k == null) {
                    C13247c cVar2 = new C13247c(fVar3, gLTextureView);
                    fVar3.f32887k = cVar2;
                    fVar3.f32879c.post(cVar2);
                }
                if (fVar3.f32891o) {
                    fVar3.f32879c.post(new C13248d(fVar3));
                }
                fVar3.f32892p = new Matrix();
                fVar3.f32892p.setTranslate(-(f9 - ((float) (fVar3.f32883g / 2))), -(((float) gLTextureView.getHeight()) - (((float) (fVar3.f32880d.f32651a + fVar3.f32884h)) + f11)));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: B */
    public final void mo39960B(float f) {
        float f2 = ((f % 360.0f) + 360.0f) % 360.0f;
        this.f32410E0.lock();
        try {
            this.f32469w = f2;
            C12931i iVar = this.f32403B;
            C12930h hVar = this.f32463t;
            double d = hVar.f32028a;
            C12930h hVar2 = this.f32465u;
            iVar.f32031a = d - hVar2.f32028a;
            iVar.f32032b = hVar.f32029b - hVar2.f32029b;
            double b = iVar.mo39805b();
            double d2 = (double) ((f2 - 90.0f) * 0.017453292f);
            double sin = Math.sin(d2);
            double cos = Math.cos(d2);
            C12930h hVar3 = this.f32463t;
            C12930h hVar4 = this.f32465u;
            hVar3.mo39798b(hVar4.f32028a + (cos * b), hVar4.f32029b + (b * sin), hVar3.f32030c);
            this.f32467v.mo39810f(-cos, -sin, 0.0d);
            this.f32410E0.unlock();
            this.f32436Z = true;
            mo39966c(2);
        } catch (Throwable th) {
            this.f32410E0.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C */
    public final void mo39961C(float f) {
        C12934k kVar = this.f32406C0.f32017b;
        float b = C13288j.m33427b(f, kVar.f32057a, kVar.f32058b);
        this.f32410E0.lock();
        try {
            this.f32471x = 90.0f - b;
            C12931i iVar = this.f32403B;
            C12930h hVar = this.f32463t;
            double d = hVar.f32028a;
            C12930h hVar2 = this.f32465u;
            iVar.mo39810f(d - hVar2.f32028a, hVar.f32029b - hVar2.f32029b, hVar.f32030c - hVar2.f32030c);
            double c = this.f32403B.mo39806c();
            double sin = Math.sin((double) (b * 0.017453292f)) * c;
            this.f32403B.f32033c = sin;
            double sqrt = Math.sqrt(Math.max(0.0d, (c * c) - (sin * sin)));
            C12930h hVar3 = this.f32463t;
            C12930h hVar4 = this.f32465u;
            double d2 = hVar4.f32028a;
            C12931i iVar2 = this.f32467v;
            hVar3.mo39798b(d2 - (iVar2.f32031a * sqrt), hVar4.f32029b - (iVar2.f32032b * sqrt), this.f32403B.f32033c);
            C12930h hVar5 = this.f32465u;
            double d3 = hVar5.f32028a;
            double d4 = hVar5.f32029b;
            hVar5.f32028a = d3;
            hVar5.f32029b = d4;
            this.f32410E0.unlock();
            this.f32436Z = true;
            mo39966c(8);
        } catch (Throwable th) {
            this.f32410E0.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: D */
    public final void mo39962D(float f) {
        C12934k kVar = this.f32406C0.f32016a;
        float b = C13288j.m33427b(f, kVar.f32057a, kVar.f32058b);
        this.f32473y = b;
        double d = (double) b;
        this.f32475z = (float) Math.pow(2.0d, d);
        if (this.f32429Q > BitmapDescriptorFactory.HUE_RED) {
            this.f32410E0.lock();
            try {
                C12931i iVar = this.f32403B;
                C12930h hVar = this.f32463t;
                double d2 = hVar.f32028a;
                C12930h hVar2 = this.f32465u;
                iVar.mo39810f(d2 - hVar2.f32028a, hVar.f32029b - hVar2.f32029b, hVar.f32030c - hVar2.f32030c);
                double pow = (((double) this.f32429Q) / Math.pow(2.0d, d)) / this.f32403B.mo39806c();
                C12930h hVar3 = this.f32463t;
                C12930h hVar4 = this.f32465u;
                double d3 = hVar4.f32028a;
                C12931i iVar2 = this.f32403B;
                hVar3.mo39798b((iVar2.f32031a * pow) + d3, (iVar2.f32032b * pow) + hVar4.f32029b, (iVar2.f32033c * pow) + hVar4.f32030c);
                this.f32410E0.unlock();
                this.f32436Z = true;
                mo39966c(4);
            } catch (Throwable th) {
                this.f32410E0.unlock();
                throw th;
            }
        }
    }

    /* renamed from: E */
    public final MapPos mo39963E(double d, double d2, double d3) {
        this.f32410E0.lock();
        try {
            double[] dArr = new double[3];
            C19958a.m47441q(d, d2, d3, this.f32451n, this.f32446k, this.f32461s, dArr);
            return new MapPos(dArr[0], ((double) this.f32431S) - dArr[1]);
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: a */
    public final void mo39964a(GL10 gl10) {
        List<C12998a> c = this.f32404B0.mo39886c();
        gl10.glDisable(3553);
        gl10.glBindTexture(3553, 0);
        gl10.glDisableClientState(32888);
        for (C12998a next : c) {
            C13125b bVar = (C13125b) this.f32444i.get(next);
            if (bVar != null && next.f32171b && !bVar.mo40030b() && (bVar instanceof C13131g)) {
                try {
                    ((C13131g) bVar).mo40034f(gl10, this.f32401A, this.f32402A0);
                } catch (Throwable th) {
                    th.getMessage();
                    this.f32444i.remove(bVar);
                }
            }
        }
        gl10.glEnable(2929);
        for (C12998a next2 : c) {
            C13125b bVar2 = (C13125b) this.f32444i.get(next2);
            if (bVar2 != null && next2.f32171b && bVar2.mo40030b() && (bVar2 instanceof C13131g)) {
                try {
                    ((C13131g) bVar2).mo40034f(gl10, this.f32401A, this.f32402A0);
                } catch (Throwable th2) {
                    th2.getMessage();
                    this.f32444i.remove(bVar2);
                }
            }
        }
        gl10.glDisable(2929);
    }

    /* renamed from: b */
    public final ArrayList mo39965b(GL10 gl10, int i, int i2) {
        C12974i iVar;
        GL10 gl102 = gl10;
        ArrayList arrayList = new ArrayList(2);
        this.f32402A0.mo39992b(gl102);
        mo39964a(gl10);
        while (true) {
            C13100i iVar2 = this.f32402A0;
            iVar2.getClass();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
            allocateDirect.order(ByteOrder.nativeOrder());
            gl10.glReadPixels(i, i2, 1, 1, 6408, 5121, allocateDirect);
            byte[] bArr = new byte[4];
            allocateDirect.get(bArr);
            int round = Math.round(((float) (bArr[2] & 255)) / 8.225806f) | ((((Math.round(((float) (bArr[0] & 255)) / 8.225806f) | 0) << 6) | Math.round(((float) (bArr[1] & 255)) / 4.047619f)) << 5);
            if (round >= iVar2.f32495b.size()) {
                iVar = null;
            } else {
                C13279f.C13280a<V>[] aVarArr = iVar2.f32496c.f32948a;
                C13279f.C13280a<V> aVar = aVarArr[(Integer.MAX_VALUE & round) % aVarArr.length];
                iVar = (C12974i) iVar2.f32495b.get(round);
            }
            if (iVar == null) {
                break;
            }
            arrayList.add(iVar);
            if (iVar.f32122b) {
                iVar.f32122b = false;
                iVar.mo39856f();
            }
            this.f32402A0.mo39992b(gl102);
            mo39964a(gl10);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12974i iVar3 = (C12974i) it.next();
            if (true != iVar3.f32122b) {
                iVar3.f32122b = true;
                iVar3.mo39856f();
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r0 = r9.f32408D0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39966c(int r10) {
        /*
            r9 = this;
            pa0.b r0 = r9.f32404B0
            java.util.List r0 = r0.mo39886c()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.next()
            pa0.a r1 = (pa0.C12998a) r1
            boolean r2 = r1 instanceof za0.C13361f
            r3 = 400(0x190, float:5.6E-43)
            if (r2 == 0) goto L_0x0032
            sa0.m r2 = r9.f32414G0
            r4 = r1
            za0.f r4 = (za0.C13361f) r4
            r2.mo40007a(r4, r3)
            boolean r2 = r1 instanceof za0.C13354a
            if (r2 == 0) goto L_0x000a
            sa0.c r2 = r9.f32418I0
            za0.a r1 = (za0.C13354a) r1
            r1 = 100
            r2.mo39956a(r1)
            goto L_0x000a
        L_0x0032:
            boolean r2 = r1 instanceof ra0.C13054a
            if (r2 == 0) goto L_0x000a
            sa0.k r2 = r9.f32416H0
            ra0.a r1 = (ra0.C13054a) r1
            r2.mo39994a(r3)
            goto L_0x000a
        L_0x003e:
            boolean r0 = r9.f32420J0
            if (r0 == 0) goto L_0x0044
            goto L_0x00c7
        L_0x0044:
            na0.j r0 = r9.f32408D0
            xa0.b r1 = r0.f32055v
            if (r1 != 0) goto L_0x004c
            goto L_0x00c7
        L_0x004c:
            wa0.b r2 = r9.f32412F0
            int r2 = r2.f32819a
            r3 = 6
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x0057
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            boolean r0 = r0.f32046m
            if (r0 == 0) goto L_0x0060
            boolean r0 = r9.f32409E
            if (r0 != 0) goto L_0x0068
        L_0x0060:
            sa0.a r0 = r9.f32417I
            boolean r0 = r0.mo39952b(r5)
            if (r0 == 0) goto L_0x006a
        L_0x0068:
            r0 = 1
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            na0.j r3 = r9.f32408D0
            boolean r3 = r3.f32047n
            if (r3 == 0) goto L_0x0075
            boolean r3 = r9.f32413G
            if (r3 != 0) goto L_0x007f
        L_0x0075:
            sa0.a r3 = r9.f32417I
            boolean r3 = r3.mo39952b(r4)
            if (r3 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r4 = 0
        L_0x007f:
            sa0.a r3 = r9.f32417I
            r6 = 2
            boolean r3 = r3.mo39952b(r6)
            sa0.a r7 = r9.f32417I
            r8 = 3
            boolean r7 = r7.mo39952b(r8)
            r8 = r10 & 1
            if (r8 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r6 = 0
        L_0x0093:
            r8 = r10 & 2
            if (r8 == 0) goto L_0x0099
            r6 = r6 | 8
        L_0x0099:
            r8 = r10 & 4
            if (r8 == 0) goto L_0x009f
            r6 = r6 | 32
        L_0x009f:
            r10 = r10 & 8
            if (r10 == 0) goto L_0x00a5
            r6 = r6 | 128(0x80, float:1.794E-43)
        L_0x00a5:
            if (r0 == 0) goto L_0x00a9
            r6 = r6 | 4
        L_0x00a9:
            if (r4 == 0) goto L_0x00ad
            r6 = r6 | 16
        L_0x00ad:
            if (r3 == 0) goto L_0x00b1
            r6 = r6 | 64
        L_0x00b1:
            if (r7 == 0) goto L_0x00b5
            r6 = r6 | 256(0x100, float:3.59E-43)
        L_0x00b5:
            if (r2 == 0) goto L_0x00b9
            r6 = r6 | 1
        L_0x00b9:
            android.os.Message r10 = new android.os.Message
            r10.<init>()
            r10.what = r5
            r10.arg1 = r6
            xa0.b$a r0 = r1.f32866b
            r0.sendMessage(r10)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13096e.mo39966c(int):void");
    }

    /* renamed from: d */
    public final MapPos mo39967d() {
        this.f32410E0.lock();
        try {
            return new MapPos(this.f32463t);
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: e */
    public final C12923b mo39968e() {
        this.f32410E0.lock();
        try {
            return new C12923b(new MapPos(this.f32463t), new C12936m(this.f32467v), this.f32451n, this.f32446k, this.f32469w, this.f32471x, this.f32473y);
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: f */
    public final float mo39969f(double d) {
        double d2 = ((double) this.f32408D0.f32037d) * d;
        float f = this.f32471x;
        if (f + 35.0f < 90.0f) {
            d2 = Math.min(d2, ((Math.cos(0.6108652353286743d) * d) / Math.cos((double) ((f + 35.0f) * 0.017453292f))) * 1.1d);
        }
        return (float) d2;
    }

    /* renamed from: g */
    public final MapPos mo39970g() {
        this.f32410E0.lock();
        try {
            return new MapPos(this.f32465u);
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: h */
    public final float mo39971h(double d) {
        double min = Math.min(0.9d * d, Math.max(d - 600.2401123046875d, 0.25d));
        if (Math.abs(this.f32471x - 35.0f) < 90.0f) {
            min = (Math.cos(0.6108652353286743d) * min) / Math.cos((double) ((this.f32471x - 35.0f) * 0.017453292f));
        }
        return (float) Math.min(min, 100.0d);
    }

    /* renamed from: i */
    public final C12936m mo39972i() {
        this.f32410E0.lock();
        try {
            return new C12936m(this.f32467v);
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: j */
    public final void mo39973j(boolean z) {
        this.f32410E0.lock();
        this.f32410E0.unlock();
    }

    /* renamed from: k */
    public final void mo39974k(C12998a aVar) {
        if (aVar instanceof C13361f) {
            this.f32414G0.mo40007a((C13361f) aVar, 0);
            if (aVar instanceof C13354a) {
                C13354a aVar2 = (C13354a) aVar;
                this.f32418I0.mo39956a(0);
            }
        } else if (aVar instanceof C13054a) {
            C13054a aVar3 = (C13054a) aVar;
            this.f32416H0.mo39994a(0);
        }
    }

    /* renamed from: l */
    public final void mo39975l(boolean z, boolean z2, boolean z3) {
        float f;
        float f2;
        float f3;
        this.f32410E0.lock();
        try {
            C12931i iVar = this.f32403B;
            C12930h hVar = this.f32465u;
            double d = hVar.f32028a;
            C12930h hVar2 = this.f32463t;
            iVar.mo39810f(d - hVar2.f32028a, hVar.f32029b - hVar2.f32029b, hVar.f32030c - hVar2.f32030c);
            double c = this.f32403B.mo39806c();
            double d2 = -this.f32403B.f32033c;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                C12931i iVar2 = this.f32467v;
                f = ((float) Math.atan2(iVar2.f32032b, iVar2.f32031a)) * 57.29578f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (z2) {
                f2 = ((float) Math.asin(Math.max(-1.0d, Math.min(1.0d, d2 / c)))) * 57.29578f;
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (z3) {
                f4 = ((float) Math.log(c / ((double) this.f32429Q))) / C13275b.f32934a;
                f3 = (float) Math.pow(2.0d, (double) f4);
            } else {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            if (z) {
                this.f32469w = f - 90.0f;
            }
            if (z2) {
                this.f32471x = 90.0f - f2;
            }
            if (z3) {
                this.f32473y = f4;
                this.f32475z = f3;
            }
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: m */
    public final void mo39976m() {
        GLTextureView gLTextureView;
        C12974i iVar = this.f32452n0;
        if (iVar != null) {
            C13361f<?> fVar = iVar.f32123c;
            boolean z = false;
            if (fVar != null) {
                boolean z2 = fVar.f32171b;
                if (fVar.f32172c != this.f32474y0) {
                    z2 = false;
                }
                if (iVar.mo39840c().f32128b != null) {
                    z = z2;
                }
            }
            if (!z) {
                this.f32452n0 = null;
            }
        }
        if (!this.f32472x0 && (gLTextureView = this.f32445j) != null) {
            this.f32472x0 = true;
            gLTextureView.mo47071b();
        }
    }

    /* renamed from: n */
    public final MapPos mo39977n(double d, double d2) {
        MapPos mapPos;
        this.f32410E0.lock();
        try {
            C12931i iVar = this.f32403B;
            C12930h hVar = this.f32465u;
            double d3 = hVar.f32028a;
            C12930h hVar2 = this.f32463t;
            iVar.mo39810f(d3 - hVar2.f32028a, hVar.f32029b - hVar2.f32029b, hVar.f32030c - hVar2.f32030c);
            this.f32403B.mo39808e();
            this.f32405C.mo39804a(this.f32403B, this.f32467v);
            this.f32405C.mo39808e();
            this.f32407D.mo39804a(this.f32405C, this.f32403B);
            double d4 = this.f32435Y;
            double d5 = ((double) this.f32437b) * d4;
            double d6 = d4 * ((double) C13275b.f32936c);
            double d7 = ((d / ((double) this.f32430R)) - 1.0d) * d5;
            double d8 = (((((double) this.f32431S) - d2) / ((double) this.f32432T)) - 1.0d) * d6;
            C12931i iVar2 = this.f32405C;
            iVar2.mo39810f(iVar2.f32031a * d7, iVar2.f32032b * d7, iVar2.f32033c * d7);
            C12931i iVar3 = this.f32407D;
            iVar3.mo39810f(iVar3.f32031a * d8, iVar3.f32032b * d8, iVar3.f32033c * d8);
            C12931i iVar4 = this.f32403B;
            double d9 = iVar4.f32031a;
            double d11 = this.f32435Y;
            C12931i iVar5 = this.f32405C;
            double d12 = (d9 * d11) + iVar5.f32031a;
            C12931i iVar6 = this.f32407D;
            iVar4.mo39810f(d12 + iVar6.f32031a, (iVar4.f32032b * d11) + iVar5.f32032b + iVar6.f32032b, (iVar4.f32033c * d11) + iVar5.f32033c + iVar6.f32033c);
            C12931i iVar7 = this.f32403B;
            double d13 = iVar7.f32033c;
            if (d13 == 0.0d) {
                mapPos = new MapPos(this.f32463t);
            } else {
                C12930h hVar3 = this.f32463t;
                double d14 = hVar3.f32030c;
                double d15 = (0.0d - d14) / d13;
                mapPos = new MapPos((iVar7.f32031a * d15) + hVar3.f32028a, hVar3.f32029b + (iVar7.f32032b * d15), (d15 * d13) + d14);
            }
            return mapPos;
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: o */
    public final MapPos mo39978o(double d, double d2) {
        this.f32410E0.lock();
        try {
            C12931i iVar = this.f32403B;
            C12930h hVar = this.f32465u;
            double d3 = hVar.f32028a;
            C12930h hVar2 = this.f32463t;
            iVar.mo39810f(d3 - hVar2.f32028a, hVar.f32029b - hVar2.f32029b, hVar.f32030c - hVar2.f32030c);
            this.f32403B.mo39808e();
            this.f32405C.mo39804a(this.f32403B, this.f32467v);
            this.f32405C.mo39808e();
            this.f32407D.mo39804a(this.f32405C, this.f32403B);
            double d4 = this.f32435Y;
            double d5 = ((double) this.f32437b) * d4;
            double d6 = d4 * ((double) C13275b.f32936c);
            double d7 = ((d / ((double) this.f32430R)) - 1.0d) * d5;
            double d8 = (((((double) this.f32431S) - d2) / ((double) this.f32432T)) - 1.0d) * d6;
            C12931i iVar2 = this.f32405C;
            iVar2.mo39810f(iVar2.f32031a * d7, iVar2.f32032b * d7, iVar2.f32033c * d7);
            C12931i iVar3 = this.f32407D;
            iVar3.mo39810f(iVar3.f32031a * d8, iVar3.f32032b * d8, iVar3.f32033c * d8);
            C12931i iVar4 = this.f32403B;
            C12930h hVar3 = this.f32463t;
            double d9 = hVar3.f32028a;
            double d11 = iVar4.f32031a;
            double d12 = this.f32435Y;
            iVar4.mo39810f(d9 + (d11 * d12), hVar3.f32029b + (iVar4.f32032b * d12), (iVar4.f32033c * d12) + hVar3.f32030c);
            C12931i iVar5 = this.f32403B;
            double d13 = iVar5.f32031a;
            C12931i iVar6 = this.f32405C;
            double d14 = d13 + iVar6.f32031a;
            C12931i iVar7 = this.f32407D;
            double d15 = d14 + iVar7.f32031a;
            double d16 = iVar5.f32032b + iVar6.f32032b + iVar7.f32032b;
            C12930h hVar4 = this.f32463t;
            double d17 = hVar4.f32030c;
            double d18 = d17 - ((iVar5.f32033c + iVar6.f32033c) + iVar7.f32033c);
            double d19 = ((this.f32435Y - d18) * ((double) 0.45f)) + d18;
            double d21 = hVar4.f32028a;
            double d22 = (((d15 - d21) * d17) / d19) + d21;
            double d23 = hVar4.f32029b;
            return new MapPos(d22, (((d16 - d23) * d17) / d19) + d23);
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v64, resolved type: ta0.b} */
    /* JADX WARNING: type inference failed for: r0v74, types: [na0.l, java.util.List<oa0.i>, com.nutiteq.components.MapPos] */
    /* JADX WARNING: type inference failed for: r0v77 */
    /* JADX WARNING: type inference failed for: r0v79 */
    /* JADX WARNING: type inference failed for: r6v63, types: [ta0.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v66, types: [ta0.d] */
    /* JADX WARNING: type inference failed for: r6v67, types: [ta0.f] */
    /* JADX WARNING: type inference failed for: r6v68, types: [ta0.c] */
    /* JADX WARNING: type inference failed for: r6v69, types: [ta0.a] */
    /* JADX WARNING: type inference failed for: r6v70, types: [ta0.e] */
    /* JADX WARNING: type inference failed for: r6v71 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = 0
            r1.f32472x0 = r3
            android.os.SystemClock.elapsedRealtime()
            oa0.i r0 = r1.f32452n0
            r1.f32454o0 = r0
            pa0.b r0 = r1.f32404B0
            java.util.List r4 = r0.mo39886c()
            java.util.Iterator r5 = r4.iterator()
        L_0x0018:
            boolean r0 = r5.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r5.next()
            r7 = r0
            pa0.a r7 = (pa0.C12998a) r7
            java.util.HashMap r0 = r1.f32444i
            java.lang.Object r0 = r0.get(r7)
            ta0.b r0 = (ta0.C13125b) r0
            if (r0 != 0) goto L_0x0085
            boolean r0 = r7 instanceof ra0.C13054a
            if (r0 == 0) goto L_0x0041
            ta0.e r6 = new ta0.e
            r0 = r7
            ra0.a r0 = (ra0.C13054a) r0
            ma0.c r8 = r1.f32476z0
            na0.j r9 = r1.f32408D0
            r6.<init>(r0, r8, r9)
            goto L_0x007c
        L_0x0041:
            boolean r0 = r7 instanceof za0.C13355b
            if (r0 == 0) goto L_0x0050
            ta0.a r6 = new ta0.a
            r0 = r7
            za0.b r0 = (za0.C13355b) r0
            com.nutiteq.cache.TextureInfoCache r8 = r1.f32443h
            r6.<init>(r0, r8)
            goto L_0x007c
        L_0x0050:
            boolean r0 = r7 instanceof za0.C13356c
            if (r0 == 0) goto L_0x005f
            ta0.c r6 = new ta0.c
            r0 = r7
            za0.c r0 = (za0.C13356c) r0
            com.nutiteq.cache.TextureInfoCache r8 = r1.f32443h
            r6.<init>(r0, r8)
            goto L_0x007c
        L_0x005f:
            boolean r0 = r7 instanceof za0.C13359e
            if (r0 == 0) goto L_0x006c
            ta0.f r6 = new ta0.f
            r0 = r7
            za0.e r0 = (za0.C13359e) r0
            r6.<init>(r0)
            goto L_0x007c
        L_0x006c:
            boolean r0 = r7 instanceof za0.C13358d
            if (r0 == 0) goto L_0x0079
            ta0.d r6 = new ta0.d
            r0 = r7
            za0.d r0 = (za0.C13358d) r0
            r6.<init>(r0)
            goto L_0x007c
        L_0x0079:
            r7.getClass()
        L_0x007c:
            if (r6 != 0) goto L_0x007f
            goto L_0x0018
        L_0x007f:
            java.util.HashMap r0 = r1.f32444i
            r0.put(r7, r6)
            goto L_0x0086
        L_0x0085:
            r6 = r0
        L_0x0086:
            r6.mo40031c(r2)     // Catch:{ all -> 0x008a }
            goto L_0x0018
        L_0x008a:
            r0 = move-exception
            r8 = r0
            r7.getClass()
            r8.getMessage()
            java.util.HashMap r0 = r1.f32444i
            r0.remove(r6)
            goto L_0x0018
        L_0x0098:
            java.util.HashMap r0 = r1.f32444i
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00c3
            java.lang.Object r5 = r0.next()
            pa0.a r5 = (pa0.C12998a) r5
            boolean r7 = r4.contains(r5)
            if (r7 != 0) goto L_0x00a2
            java.util.HashMap r7 = r1.f32444i
            java.lang.Object r5 = r7.get(r5)
            ta0.b r5 = (ta0.C13125b) r5
            r5.mo40033e(r2)
            r0.remove()
            goto L_0x00a2
        L_0x00c3:
            java.util.HashMap r0 = r1.f32444i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00e2
            java.lang.Object r4 = r0.next()
            ta0.b r4 = (ta0.C13125b) r4
            boolean r4 = r4.mo40029a()
            if (r4 != 0) goto L_0x00cd
            r19.mo39976m()
        L_0x00e2:
            com.nutiteq.cache.TextureInfoCache r4 = r1.f32443h
            monitor-enter(r4)
            java.util.HashMap r0 = r4.f24169e     // Catch:{ all -> 0x0776 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0776 }
            if (r0 != 0) goto L_0x011c
            java.util.HashMap r0 = r4.f24169e     // Catch:{ all -> 0x0776 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0776 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0776 }
        L_0x00f7:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0776 }
            if (r5 == 0) goto L_0x011c
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0776 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0776 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0776 }
            com.nutiteq.cache.TextureInfoCache$a r5 = (com.nutiteq.cache.TextureInfoCache.C7976a) r5     // Catch:{ all -> 0x0776 }
            int r7 = r5.f24172c     // Catch:{ all -> 0x0776 }
            int r8 = r4.f24167c     // Catch:{ all -> 0x0776 }
            if (r7 == r8) goto L_0x00f7
            int r7 = r7 + 1
            if (r7 == r8) goto L_0x00f7
            int r5 = r5.f24171b     // Catch:{ all -> 0x0776 }
            ya0.C13277d.m33406d(r2, r5)     // Catch:{ all -> 0x0776 }
            r0.remove()     // Catch:{ all -> 0x0776 }
            goto L_0x00f7
        L_0x011c:
            int r0 = r4.f24167c     // Catch:{ all -> 0x0776 }
            int r0 = r0 + 1
            r4.f24167c = r0     // Catch:{ all -> 0x0776 }
            monitor-exit(r4)
            ma0.c r4 = r1.f32476z0
            monitor-enter(r4)
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0773 }
            java.util.LinkedList r0 = r4.f31929f     // Catch:{ all -> 0x0773 }
            int r0 = r0.size()     // Catch:{ all -> 0x0773 }
            r5 = 3553(0xde1, float:4.979E-42)
            if (r0 <= 0) goto L_0x01be
            java.util.LinkedList r0 = r4.f31929f     // Catch:{ all -> 0x0773 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0773 }
            r9 = 0
        L_0x013b:
            r10 = 10243(0x2803, float:1.4354E-41)
            r11 = 33071(0x812f, float:4.6342E-41)
            r12 = 10242(0x2802, float:1.4352E-41)
            boolean r13 = r0.hasNext()     // Catch:{ all -> 0x0773 }
            if (r13 == 0) goto L_0x01bf
            java.lang.Object r13 = r0.next()     // Catch:{ all -> 0x0773 }
            ma0.c$c r13 = (ma0.C12902c.C12905c) r13     // Catch:{ all -> 0x0773 }
            r0.remove()     // Catch:{ all -> 0x0773 }
            int r14 = r4.f31926c     // Catch:{ all -> 0x0773 }
            r13.f31936e = r14     // Catch:{ all -> 0x0773 }
            android.graphics.Bitmap r14 = r13.f31934c     // Catch:{ all -> 0x0773 }
            int r14 = ya0.C13277d.m33403a(r2, r14)     // Catch:{ all -> 0x0773 }
            r13.f31933b = r14     // Catch:{ all -> 0x0773 }
            r2.glTexParameterx(r5, r12, r11)     // Catch:{ all -> 0x0773 }
            r2.glTexParameterx(r5, r10, r11)     // Catch:{ all -> 0x0773 }
            ma0.d r10 = r4.f31930g     // Catch:{ all -> 0x0773 }
            android.graphics.Bitmap r11 = r13.f31934c     // Catch:{ all -> 0x0773 }
            r10.mo39775d(r11)     // Catch:{ all -> 0x0773 }
            r13.f31934c = r6     // Catch:{ all -> 0x0773 }
            ma0.c$a r6 = r4.f31927d     // Catch:{ all -> 0x0773 }
            long r10 = r13.f31932a     // Catch:{ all -> 0x0773 }
            java.lang.Object r6 = r6.mo40145a(r10)     // Catch:{ all -> 0x0773 }
            ma0.c$c r6 = (ma0.C12902c.C12905c) r6     // Catch:{ all -> 0x0773 }
            if (r6 == 0) goto L_0x019a
            int r10 = r4.f31925b     // Catch:{ all -> 0x0773 }
            int r11 = r6.f31935d     // Catch:{ all -> 0x0773 }
            int r10 = r10 - r11
            r4.f31925b = r10     // Catch:{ all -> 0x0773 }
            ma0.c$a r10 = r4.f31927d     // Catch:{ all -> 0x0773 }
            long r11 = r6.f31932a     // Catch:{ all -> 0x0773 }
            ya0.h<ya0.g<V>$a<V>> r14 = r10.f32949a     // Catch:{ all -> 0x0773 }
            java.lang.Object r14 = r14.mo40149a(r11)     // Catch:{ all -> 0x0773 }
            ya0.g$a r14 = (ya0.C13281g.C13282a) r14     // Catch:{ all -> 0x0773 }
            if (r14 == 0) goto L_0x0195
            ya0.h<ya0.g<V>$a<V>> r15 = r10.f32949a     // Catch:{ all -> 0x0773 }
            r15.mo40150d(r11)     // Catch:{ all -> 0x0773 }
            r10.mo40148g(r14)     // Catch:{ all -> 0x0773 }
        L_0x0195:
            int r6 = r6.f31933b     // Catch:{ all -> 0x0773 }
            ya0.C13277d.m33406d(r2, r6)     // Catch:{ all -> 0x0773 }
        L_0x019a:
            int r6 = r4.f31925b     // Catch:{ all -> 0x0773 }
            int r10 = r13.f31935d     // Catch:{ all -> 0x0773 }
            int r6 = r6 + r10
            r4.f31925b = r6     // Catch:{ all -> 0x0773 }
            ma0.c$a r6 = r4.f31927d     // Catch:{ all -> 0x0773 }
            long r10 = r13.f31932a     // Catch:{ all -> 0x0773 }
            r6.mo40146d(r10, r13)     // Catch:{ all -> 0x0773 }
            int r9 = r9 + 1
            r6 = 30
            if (r9 < r6) goto L_0x01af
            goto L_0x01bf
        L_0x01af:
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0773 }
            long r10 = r10 - r7
            r12 = 50
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x01bb
            goto L_0x01bf
        L_0x01bb:
            r6 = 0
            goto L_0x013b
        L_0x01be:
            r9 = 0
        L_0x01bf:
            ma0.c$b r0 = r4.f31928e     // Catch:{ all -> 0x0773 }
            int r5 = r0.f32958b     // Catch:{ all -> 0x0773 }
            if (r5 != 0) goto L_0x01c7
            r6 = 1
            goto L_0x01c8
        L_0x01c7:
            r6 = 0
        L_0x01c8:
            if (r6 != 0) goto L_0x0225
            if (r5 <= 0) goto L_0x01e2
            ya0.h$a<V>[] r5 = r0.f32957a     // Catch:{ all -> 0x0773 }
            r6 = 0
            r7 = 0
        L_0x01d0:
            int r8 = r5.length     // Catch:{ all -> 0x0773 }
            if (r6 >= r8) goto L_0x01e4
            int r7 = r6 + 1
            r6 = r5[r6]     // Catch:{ all -> 0x0773 }
            r18 = r7
            r7 = r6
            if (r6 != 0) goto L_0x01df
            r6 = r18
            goto L_0x01d0
        L_0x01df:
            r6 = r18
            goto L_0x01e4
        L_0x01e2:
            r6 = 0
            r7 = 0
        L_0x01e4:
            if (r7 == 0) goto L_0x01e8
            r5 = 1
            goto L_0x01e9
        L_0x01e8:
            r5 = 0
        L_0x01e9:
            if (r5 == 0) goto L_0x0225
            if (r7 == 0) goto L_0x021f
            ya0.h$a<V> r5 = r7.f32963c     // Catch:{ all -> 0x0773 }
            if (r5 != 0) goto L_0x0205
            ya0.h$a<V>[] r8 = r0.f32957a     // Catch:{ all -> 0x0773 }
        L_0x01f3:
            int r10 = r8.length     // Catch:{ all -> 0x0773 }
            if (r6 >= r10) goto L_0x0205
            int r5 = r6 + 1
            r6 = r8[r6]     // Catch:{ all -> 0x0773 }
            r18 = r6
            if (r6 != 0) goto L_0x0202
            r6 = r5
            r5 = r18
            goto L_0x01f3
        L_0x0202:
            r6 = r5
            r5 = r18
        L_0x0205:
            V r8 = r7.f32962b     // Catch:{ all -> 0x0773 }
            ma0.c$c r8 = (ma0.C12902c.C12905c) r8     // Catch:{ all -> 0x0773 }
            int r10 = r8.f31936e     // Catch:{ all -> 0x0773 }
            int r11 = r4.f31926c     // Catch:{ all -> 0x0773 }
            if (r10 == r11) goto L_0x021d
            int r10 = r10 + 1
            if (r10 == r11) goto L_0x021d
            int r8 = r8.f31933b     // Catch:{ all -> 0x0773 }
            ya0.C13277d.m33406d(r2, r8)     // Catch:{ all -> 0x0773 }
            long r7 = r7.f32961a     // Catch:{ all -> 0x0773 }
            r0.mo40150d(r7)     // Catch:{ all -> 0x0773 }
        L_0x021d:
            r7 = r5
            goto L_0x01e4
        L_0x021f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0773 }
            r0.<init>()     // Catch:{ all -> 0x0773 }
            throw r0     // Catch:{ all -> 0x0773 }
        L_0x0225:
            int r0 = r4.f31926c     // Catch:{ all -> 0x0773 }
            int r0 = r0 + 1
            r4.f31926c = r0     // Catch:{ all -> 0x0773 }
            monitor-exit(r4)
            if (r9 <= 0) goto L_0x0237
            int r0 = r1.f32470w0
            int r0 = r0 + r9
            r1.f32470w0 = r0
            r19.mo39976m()
            goto L_0x0244
        L_0x0237:
            int r0 = r1.f32470w0
            if (r0 <= 0) goto L_0x0244
            r1.f32470w0 = r3
            sa0.k r0 = r1.f32416H0
            r4 = 400(0x190, float:5.6E-43)
            r0.mo39994a(r4)
        L_0x0244:
            sa0.a r4 = r1.f32417I
            monitor-enter(r4)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0770 }
            java.util.LinkedList r0 = r4.f32376a     // Catch:{ all -> 0x0770 }
            java.util.ListIterator r0 = r0.listIterator()     // Catch:{ all -> 0x0770 }
        L_0x0251:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0770 }
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x0280
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0770 }
            sa0.a$a r7 = (sa0.C13089a.C13090a) r7     // Catch:{ all -> 0x0770 }
            long r9 = r7.f32380c     // Catch:{ all -> 0x0770 }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0268
            r0.remove()     // Catch:{ all -> 0x0770 }
        L_0x0268:
            long r9 = r7.f32379b     // Catch:{ all -> 0x0770 }
            long r11 = r5 - r9
            float r11 = (float) r11     // Catch:{ all -> 0x0770 }
            long r12 = r7.f32380c     // Catch:{ all -> 0x0770 }
            long r12 = r12 - r9
            float r9 = (float) r12     // Catch:{ all -> 0x0770 }
            float r11 = r11 / r9
            android.view.animation.Interpolator r9 = r7.f32385h     // Catch:{ all -> 0x0770 }
            float r8 = java.lang.Math.min(r8, r11)     // Catch:{ all -> 0x0770 }
            float r8 = r9.getInterpolation(r8)     // Catch:{ all -> 0x0770 }
            r7.mo39954a(r8)     // Catch:{ all -> 0x0770 }
            goto L_0x0251
        L_0x0280:
            java.util.LinkedList r0 = r4.f32376a     // Catch:{ all -> 0x0770 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x028f
            sa0.f r0 = r4.f32377b     // Catch:{ all -> 0x0770 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x0770 }
            r0.mo39976m()     // Catch:{ all -> 0x0770 }
        L_0x028f:
            monitor-exit(r4)
            na0.j r0 = r1.f32408D0
            boolean r0 = r0.f32046m
            if (r0 == 0) goto L_0x0355
            boolean r0 = r1.f32409E
            if (r0 == 0) goto L_0x0355
            java.util.concurrent.locks.ReentrantLock r0 = r1.f32410E0
            r0.lock()
            na0.i r0 = r1.f32411F     // Catch:{ all -> 0x034e }
            double r4 = r0.f32031a     // Catch:{ all -> 0x034e }
            double r4 = r4 * r4
            double r6 = r0.f32032b     // Catch:{ all -> 0x034e }
            double r6 = r6 * r6
            double r6 = r6 + r4
            r4 = 1258902592(0x4b095440, float:9000000.0)
            float r5 = r1.f32475z     // Catch:{ all -> 0x034e }
            float r5 = r5 * r5
            float r4 = r4 / r5
            double r4 = (double) r4     // Catch:{ all -> 0x034e }
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x02bc
            r19.mo39988x()     // Catch:{ all -> 0x034e }
            goto L_0x0342
        L_0x02bc:
            na0.i r4 = r1.f32403B     // Catch:{ all -> 0x034e }
            na0.h r5 = r1.f32463t     // Catch:{ all -> 0x034e }
            double r6 = r5.f32028a     // Catch:{ all -> 0x034e }
            na0.h r8 = r1.f32465u     // Catch:{ all -> 0x034e }
            double r9 = r8.f32028a     // Catch:{ all -> 0x034e }
            double r6 = r6 - r9
            double r11 = r5.f32029b     // Catch:{ all -> 0x034e }
            double r13 = r8.f32029b     // Catch:{ all -> 0x034e }
            double r11 = r11 - r13
            r4.f32031a = r6     // Catch:{ all -> 0x034e }
            r4.f32032b = r11     // Catch:{ all -> 0x034e }
            double r4 = r0.f32031a     // Catch:{ all -> 0x034e }
            double r9 = r9 + r4
            double r4 = r0.f32032b     // Catch:{ all -> 0x034e }
            double r13 = r13 + r4
            r8.f32028a = r9     // Catch:{ all -> 0x034e }
            r8.f32029b = r13     // Catch:{ all -> 0x034e }
            na0.j r0 = r1.f32408D0     // Catch:{ all -> 0x034e }
            boolean r0 = r0.f32039f     // Catch:{ all -> 0x034e }
            na0.e r4 = r1.f32406C0     // Catch:{ all -> 0x034e }
            r4.getClass()     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x02e6
            goto L_0x02f0
        L_0x02e6:
            na0.h r4 = r1.f32465u     // Catch:{ all -> 0x034e }
            double r5 = r4.f32028a     // Catch:{ all -> 0x034e }
            double r5 = ya0.C13288j.m33426a(r5)     // Catch:{ all -> 0x034e }
            r4.f32028a = r5     // Catch:{ all -> 0x034e }
        L_0x02f0:
            na0.h r4 = r1.f32465u     // Catch:{ all -> 0x034e }
            double r5 = r4.f32029b     // Catch:{ all -> 0x034e }
            double r5 = ya0.C13288j.m33426a(r5)     // Catch:{ all -> 0x034e }
            r4.f32029b = r5     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x031b
            na0.h r0 = r1.f32465u     // Catch:{ all -> 0x034e }
            double r4 = r0.f32028a     // Catch:{ all -> 0x034e }
            r6 = -4531038489797459968(0xc11e848000000000, double:-500000.0)
            r8 = 4692333547057315840(0x411e848000000000, double:500000.0)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0313
            double r4 = r4 - r8
            double r4 = r4 + r6
            r0.f32028a = r4     // Catch:{ all -> 0x034e }
            goto L_0x031b
        L_0x0313:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x031b
            double r4 = r4 + r8
            double r4 = r4 + r8
            r0.f32028a = r4     // Catch:{ all -> 0x034e }
        L_0x031b:
            na0.h r0 = r1.f32463t     // Catch:{ all -> 0x034e }
            na0.h r4 = r1.f32465u     // Catch:{ all -> 0x034e }
            double r5 = r4.f32028a     // Catch:{ all -> 0x034e }
            na0.i r7 = r1.f32403B     // Catch:{ all -> 0x034e }
            double r8 = r7.f32031a     // Catch:{ all -> 0x034e }
            double r5 = r5 + r8
            double r8 = r4.f32029b     // Catch:{ all -> 0x034e }
            double r10 = r7.f32032b     // Catch:{ all -> 0x034e }
            double r8 = r8 + r10
            r0.f32028a = r5     // Catch:{ all -> 0x034e }
            r0.f32029b = r8     // Catch:{ all -> 0x034e }
            na0.i r0 = r1.f32411F     // Catch:{ all -> 0x034e }
            double r4 = r0.f32031a     // Catch:{ all -> 0x034e }
            r6 = 4606281698659794944(0x3fecccccc0000000, double:0.8999999761581421)
            double r4 = r4 * r6
            double r8 = r0.f32032b     // Catch:{ all -> 0x034e }
            double r8 = r8 * r6
            r0.f32031a = r4     // Catch:{ all -> 0x034e }
            r0.f32032b = r8     // Catch:{ all -> 0x034e }
        L_0x0342:
            java.util.concurrent.locks.ReentrantLock r0 = r1.f32410E0
            r0.unlock()
            r0 = 1
            r1.f32436Z = r0
            r1.mo39966c(r0)
            goto L_0x0355
        L_0x034e:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r1.f32410E0
            r2.unlock()
            throw r0
        L_0x0355:
            na0.j r0 = r1.f32408D0
            boolean r0 = r0.f32047n
            r4 = 2
            if (r0 == 0) goto L_0x0386
            boolean r0 = r1.f32413G
            if (r0 == 0) goto L_0x0386
            float r0 = r1.f32415H
            float r5 = r0 * r0
            r6 = 1048576000(0x3e800000, float:0.25)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0371
            r19.mo39989y()
            r1.mo39966c(r4)
            goto L_0x0386
        L_0x0371:
            na0.e r4 = r1.f32406C0
            boolean r4 = r4.f32019d
            if (r4 == 0) goto L_0x037d
            float r4 = r1.f32469w
            float r4 = r4 + r0
            r1.mo39960B(r4)
        L_0x037d:
            float r0 = r1.f32415H
            r4 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r4
            r1.f32415H = r0
        L_0x0386:
            boolean r0 = r1.f32426N
            if (r0 != 0) goto L_0x0394
            boolean r0 = r1.f32423L
            if (r0 != 0) goto L_0x0394
            boolean r0 = r1.f32425M
            if (r0 != 0) goto L_0x0394
            goto L_0x047e
        L_0x0394:
            boolean r0 = r1.f32423L
            if (r0 == 0) goto L_0x03a8
            boolean r0 = r1.f32426N
            if (r0 == 0) goto L_0x03a8
            java.util.ArrayList r0 = r1.f32448l0
            if (r0 != 0) goto L_0x03a8
            java.util.List<oa0.i> r0 = r1.f32450m0
            if (r0 != 0) goto L_0x03a8
            r1.f32423L = r3
            r1.f32426N = r3
        L_0x03a8:
            boolean r0 = r1.f32425M
            if (r0 == 0) goto L_0x03b6
            boolean r0 = r1.f32426N
            if (r0 == 0) goto L_0x03b6
            java.util.ArrayList r0 = r1.f32448l0
            if (r0 == 0) goto L_0x03b6
            r1.f32425M = r3
        L_0x03b6:
            boolean r0 = r1.f32425M
            if (r0 != 0) goto L_0x03be
            boolean r0 = r1.f32423L
            if (r0 == 0) goto L_0x0454
        L_0x03be:
            boolean r0 = r1.f32423L
            r1.f32425M = r3
            r1.f32423L = r3
            na0.j r4 = r1.f32408D0
            xa0.b r4 = r4.f32055v
            if (r4 != 0) goto L_0x03cc
            goto L_0x0454
        L_0x03cc:
            java.util.concurrent.locks.ReentrantLock r5 = r1.f32410E0
            r5.lock()
            na0.h r5 = r1.f32427O     // Catch:{ all -> 0x0769 }
            double r6 = r5.f32028a     // Catch:{ all -> 0x0769 }
            int r6 = (int) r6     // Catch:{ all -> 0x0769 }
            double r7 = r5.f32029b     // Catch:{ all -> 0x0769 }
            int r5 = (int) r7     // Catch:{ all -> 0x0769 }
            java.util.ArrayList r8 = r1.mo39965b(r2, r6, r5)     // Catch:{ all -> 0x0769 }
            java.util.concurrent.locks.ReentrantLock r5 = r1.f32410E0
            r5.unlock()
            if (r0 == 0) goto L_0x03e9
            java.util.ArrayList r5 = r1.f32448l0
            if (r5 == 0) goto L_0x03e9
            goto L_0x0454
        L_0x03e9:
            if (r0 != 0) goto L_0x03f0
            java.util.ArrayList r5 = r1.f32448l0
            if (r5 != 0) goto L_0x03f0
            goto L_0x0454
        L_0x03f0:
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x03f7
            goto L_0x0454
        L_0x03f7:
            if (r0 == 0) goto L_0x03fc
            r1.f32448l0 = r8
            goto L_0x0403
        L_0x03fc:
            java.util.ArrayList r5 = r1.f32448l0
            r1.f32450m0 = r5
            r5 = 0
            r1.f32448l0 = r5
        L_0x0403:
            na0.h r5 = r1.f32427O
            double r6 = r5.f32028a
            float r9 = r1.f32431S
            double r9 = (double) r9
            double r11 = r5.f32029b
            double r9 = r9 - r11
            com.nutiteq.components.MapPos r5 = r1.mo39977n(r6, r9)
            pa0.b r6 = r1.f32404B0
            qa0.a r6 = r6.mo39887d()
            double r9 = r5.f24175b
            double r11 = r5.f24176c
            com.nutiteq.components.MapPos r5 = r6.mo39928a(r9, r11)
            if (r0 == 0) goto L_0x043b
            double r9 = r5.f24175b
            double r11 = r5.f24176c
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r5 = 6
            r0.what = r5
            xa0.b$b r5 = new xa0.b$b
            r7 = r5
            r7.<init>(r8, r9, r11)
            r0.obj = r5
            xa0.b$a r4 = r4.f32866b
            r4.sendMessage(r0)
            goto L_0x0454
        L_0x043b:
            double r9 = r5.f24175b
            double r11 = r5.f24176c
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r5 = 7
            r0.what = r5
            xa0.b$b r5 = new xa0.b$b
            r7 = r5
            r7.<init>(r8, r9, r11)
            r0.obj = r5
            xa0.b$a r4 = r4.f32866b
            r4.sendMessage(r0)
        L_0x0454:
            boolean r0 = r1.f32426N
            if (r0 == 0) goto L_0x047e
            r1.f32426N = r3
            java.util.ArrayList r0 = r1.f32448l0
            if (r0 != 0) goto L_0x0463
            java.util.List<oa0.i> r4 = r1.f32450m0
            if (r4 != 0) goto L_0x0463
            goto L_0x047e
        L_0x0463:
            na0.j r4 = r1.f32408D0
            xa0.b r4 = r4.f32055v
            if (r4 == 0) goto L_0x0479
            if (r0 == 0) goto L_0x046e
            r4.mo40123i(r0)
        L_0x046e:
            java.util.List<oa0.i> r0 = r1.f32450m0
            if (r0 == 0) goto L_0x0479
            java.util.ArrayList r5 = r1.f32448l0
            if (r0 == r5) goto L_0x0479
            r4.mo40123i(r0)
        L_0x0479:
            r0 = 0
            r1.f32450m0 = r0
            r1.f32448l0 = r0
        L_0x047e:
            boolean r0 = r1.f32419J
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x048c
            boolean r0 = r1.f32421K
            if (r0 == 0) goto L_0x0489
            goto L_0x048c
        L_0x0489:
            r3 = r2
            goto L_0x05d5
        L_0x048c:
            boolean r11 = r1.f32421K
            r1.f32419J = r3
            r1.f32421K = r3
            na0.j r0 = r1.f32408D0
            xa0.b r0 = r0.f32055v
            oa0.i r3 = r1.f32454o0
            if (r3 == 0) goto L_0x04e1
            com.nutiteq.components.MapPos r5 = r1.f32468v0
            if (r5 == 0) goto L_0x04e1
            na0.l r6 = r1.f32462s0
            if (r6 == 0) goto L_0x04e1
            na0.h r7 = r1.f32427O
            double r8 = r7.f32028a
            double r12 = r5.f24175b
            float r10 = r6.f32062d
            float r10 = r10 * r4
            double r14 = (double) r10
            double r16 = r12 - r14
            int r4 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r4 < 0) goto L_0x04e1
            double r1 = r7.f32029b
            double r4 = r5.f24176c
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x04e1
            double r12 = r12 + r14
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x04e1
            float r6 = r6.f32063e
            double r6 = (double) r6
            double r4 = r4 + r6
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x04e1
            if (r0 == 0) goto L_0x04db
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r2 = 3
            r1.what = r2
            r1.obj = r3
            r1.arg1 = r11
            xa0.b$a r0 = r0.f32866b
            r0.sendMessage(r1)
        L_0x04db:
            r1 = r19
            r3 = r20
            goto L_0x05d5
        L_0x04e1:
            r1 = r19
            sa0.i r2 = r1.f32402A0
            r3 = r20
            r2.mo39992b(r3)
            r19.mo39964a(r20)
            java.util.List<oa0.i> r2 = r1.f32450m0
            if (r2 == 0) goto L_0x0502
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x04f8
            goto L_0x0502
        L_0x04f8:
            java.util.List<oa0.i> r2 = r1.f32450m0
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            oa0.i r2 = (oa0.C12974i) r2
            goto L_0x0503
        L_0x0502:
            r2 = 0
        L_0x0503:
            r1.f32452n0 = r2
            oa0.i r2 = r1.f32452n0
            r1.f32454o0 = r2
            if (r2 != 0) goto L_0x0548
            if (r0 == 0) goto L_0x0543
            na0.h r2 = r1.f32427O
            double r4 = r2.f32028a
            float r6 = r1.f32431S
            double r6 = (double) r6
            double r8 = r2.f32029b
            double r6 = r6 - r8
            com.nutiteq.components.MapPos r2 = r1.mo39977n(r4, r6)
            pa0.b r4 = r1.f32404B0
            qa0.a r4 = r4.mo39887d()
            double r5 = r2.f24175b
            double r7 = r2.f24176c
            com.nutiteq.components.MapPos r2 = r4.mo39928a(r5, r7)
            double r4 = r2.f24175b
            double r6 = r2.f24176c
            android.os.Message r2 = new android.os.Message
            r2.<init>()
            r8 = 1
            r2.what = r8
            na0.h r8 = new na0.h
            r8.<init>(r4, r6)
            r2.obj = r8
            r2.arg1 = r11
            xa0.b$a r0 = r0.f32866b
            r0.sendMessage(r2)
        L_0x0543:
            r19.mo39976m()
            goto L_0x05d5
        L_0x0548:
            na0.h r4 = r1.f32427O
            double r5 = r4.f32028a
            float r7 = r1.f32431S
            double r7 = (double) r7
            double r9 = r4.f32029b
            double r7 = r7 - r9
            com.nutiteq.components.MapPos r4 = r1.mo39977n(r5, r7)
            com.nutiteq.components.MapPos r2 = r2.mo39839a(r4)
            r1.f32428P = r2
            oa0.i r4 = r1.f32454o0
            xa0.a r4 = r4.f32121a
            r12 = r11 ^ 1
            if (r0 == 0) goto L_0x05a2
            if (r2 != 0) goto L_0x0579
            com.nutiteq.components.MapPos r2 = new com.nutiteq.components.MapPos
            na0.h r5 = r1.f32427O
            double r6 = r5.f32028a
            float r8 = r1.f32431S
            double r8 = (double) r8
            double r13 = r5.f32029b
            double r8 = r8 - r13
            com.nutiteq.components.MapPos r5 = r1.mo39977n(r6, r8)
            r2.<init>((com.nutiteq.components.MapPos) r5)
        L_0x0579:
            pa0.b r5 = r1.f32404B0
            qa0.a r5 = r5.mo39887d()
            double r6 = r2.f24175b
            double r8 = r2.f24176c
            com.nutiteq.components.MapPos r2 = r5.mo39928a(r6, r8)
            java.util.List<oa0.i> r6 = r1.f32450m0
            double r7 = r2.f24175b
            double r9 = r2.f24176c
            android.os.Message r2 = new android.os.Message
            r2.<init>()
            r5 = 2
            r2.what = r5
            xa0.b$b r13 = new xa0.b$b
            r5 = r13
            r5.<init>(r6, r7, r9, r11)
            r2.obj = r13
            xa0.b$a r0 = r0.f32866b
            r0.sendMessage(r2)
        L_0x05a2:
            java.util.ArrayList r0 = r1.f32448l0
            if (r0 == 0) goto L_0x05b2
            oa0.i r2 = r1.f32454o0
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x05b2
            r0 = 0
            r1.f32448l0 = r0
            goto L_0x05b3
        L_0x05b2:
            r0 = 0
        L_0x05b3:
            java.util.List<oa0.i> r2 = r1.f32450m0
            if (r2 == 0) goto L_0x05c1
            oa0.i r5 = r1.f32454o0
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x05c1
            r1.f32450m0 = r0
        L_0x05c1:
            r1.f32468v0 = r0
            r1.f32462s0 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f32464t0 = r0
            if (r12 == 0) goto L_0x05d2
            if (r4 == 0) goto L_0x05d2
            r0 = 1
            r1.f32458q0 = r0
            r1.f32460r0 = r0
        L_0x05d2:
            r19.mo39976m()
        L_0x05d5:
            r19.mo39987w(r20)
            r19.mo39959A(r20)
            na0.j r0 = r1.f32408D0
            na0.c r0 = r0.f32036c
            float r2 = r0.f31998a
            float r4 = r0.f31999b
            float r5 = r0.f32000c
            float r0 = r0.f32001d
            r3.glClearColor(r2, r4, r5, r0)
            r0 = 16640(0x4100, float:2.3318E-41)
            r3.glClear(r0)
            m33040u(r20)
            na0.j r0 = r1.f32408D0
            r0.getClass()
            na0.j r0 = r1.f32408D0
            r0.getClass()
            na0.j r0 = r1.f32408D0
            r0.getClass()
            pa0.b r0 = r1.f32404B0
            java.util.List r2 = r0.mo39886c()
            r0 = 3553(0xde1, float:4.979E-42)
            r3.glDisable(r0)
            r4 = 0
            r3.glBindTexture(r0, r4)
            r4 = 32888(0x8078, float:4.6086E-41)
            r3.glDisableClientState(r4)
            java.util.Iterator r5 = r2.iterator()
        L_0x061a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x064d
            java.lang.Object r0 = r5.next()
            r6 = r0
            pa0.a r6 = (pa0.C12998a) r6
            java.util.HashMap r0 = r1.f32444i
            java.lang.Object r0 = r0.get(r6)
            ta0.b r0 = (ta0.C13125b) r0
            if (r0 == 0) goto L_0x061a
            boolean r7 = r6.f32171b
            if (r7 != 0) goto L_0x0636
            goto L_0x061a
        L_0x0636:
            boolean r7 = r0.mo40030b()
            if (r7 == 0) goto L_0x063d
            goto L_0x061a
        L_0x063d:
            na0.b r7 = r1.f32401A     // Catch:{ all -> 0x0643 }
            r0.mo40032d(r3, r7)     // Catch:{ all -> 0x0643 }
            goto L_0x061a
        L_0x0643:
            r0 = move-exception
            r0.getMessage()
            java.util.HashMap r0 = r1.f32444i
            r0.remove(r6)
            goto L_0x061a
        L_0x064d:
            na0.j r0 = r1.f32408D0
            xa0.b r5 = r0.f32055v
            if (r5 == 0) goto L_0x0669
            m33041v(r20)
            r20.glPushMatrix()
            float[] r0 = r1.f32449m
            r6 = 0
            r3.glLoadMatrixf(r0, r6)
            na0.b r0 = r1.f32401A
            float r0 = r0.f31997j
            r20.glPopMatrix()
            m33040u(r20)
        L_0x0669:
            r6 = 2929(0xb71, float:4.104E-42)
            r3.glEnable(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0672:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06a4
            java.lang.Object r0 = r2.next()
            pa0.a r0 = (pa0.C12998a) r0
            java.util.HashMap r7 = r1.f32444i
            java.lang.Object r7 = r7.get(r0)
            ta0.b r7 = (ta0.C13125b) r7
            if (r7 == 0) goto L_0x0672
            boolean r0 = r0.f32171b
            if (r0 != 0) goto L_0x068d
            goto L_0x0672
        L_0x068d:
            boolean r0 = r7.mo40030b()
            if (r0 != 0) goto L_0x0694
            goto L_0x0672
        L_0x0694:
            na0.b r0 = r1.f32401A     // Catch:{ all -> 0x069a }
            r7.mo40032d(r3, r0)     // Catch:{ all -> 0x069a }
            goto L_0x0672
        L_0x069a:
            r0 = move-exception
            r0.getMessage()
            java.util.HashMap r0 = r1.f32444i
            r0.remove(r7)
            goto L_0x0672
        L_0x06a4:
            if (r5 == 0) goto L_0x06bc
            m33041v(r20)
            r20.glPushMatrix()
            float[] r0 = r1.f32449m
            r2 = 0
            r3.glLoadMatrixf(r0, r2)
            na0.b r0 = r1.f32401A
            float r0 = r0.f31997j
            r20.glPopMatrix()
            m33040u(r20)
        L_0x06bc:
            r3.glDisable(r6)
            oa0.i r0 = r1.f32454o0
            if (r0 == 0) goto L_0x0754
            com.nutiteq.components.MapPos r0 = r1.f32468v0
            if (r0 == 0) goto L_0x0754
            na0.l r0 = r1.f32462s0
            if (r0 == 0) goto L_0x0754
            int r0 = r1.f32466u0
            if (r0 == 0) goto L_0x0754
            float r0 = r1.f32464t0
            r3.glColor4f(r0, r0, r0, r0)
            r0 = 771(0x303, float:1.08E-42)
            r2 = 1
            r3.glBlendFunc(r2, r0)
            r0 = 5889(0x1701, float:8.252E-42)
            r3.glMatrixMode(r0)
            r20.glPushMatrix()
            float[] r2 = r1.f32447l
            r5 = 0
            r3.glLoadMatrixf(r2, r5)
            r2 = 5888(0x1700, float:8.251E-42)
            r3.glMatrixMode(r2)
            r20.glPushMatrix()
            r20.glLoadIdentity()
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = 0
            r3.glTranslatef(r6, r6, r5)
            com.nutiteq.components.MapPos r5 = r1.f32468v0
            double r6 = r5.f24175b
            int r6 = (int) r6
            float r6 = (float) r6
            double r7 = r5.f24176c
            na0.l r5 = r1.f32462s0
            float r5 = r5.f32063e
            r9 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r9
            double r9 = (double) r5
            double r7 = r7 + r9
            int r5 = (int) r7
            float r5 = (float) r5
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.glTranslatef(r6, r5, r7)
            na0.l r5 = r1.f32462s0
            float r6 = r5.f32062d
            float r5 = r5.f32063e
            r7 = 1065353216(0x3f800000, float:1.0)
            r3.glScalef(r6, r5, r7)
            int r5 = r1.f32466u0
            na0.l r6 = r1.f32462s0
            java.nio.FloatBuffer r6 = r6.f32061c
            java.nio.FloatBuffer r7 = ya0.C13277d.f32942a
            r7 = 3553(0xde1, float:4.979E-42)
            r3.glEnable(r7)
            r3.glBindTexture(r7, r5)
            r5 = 32884(0x8074, float:4.608E-41)
            r3.glEnableClientState(r5)
            java.nio.FloatBuffer r5 = ya0.C13277d.f32942a
            r7 = 5126(0x1406, float:7.183E-42)
            r8 = 3
            r9 = 0
            r3.glVertexPointer(r8, r7, r9, r5)
            r3.glEnableClientState(r4)
            r4 = 2
            r3.glTexCoordPointer(r4, r7, r9, r6)
            r4 = 5
            r5 = 4
            r3.glDrawArrays(r4, r9, r5)
            r20.glPopMatrix()
            r3.glMatrixMode(r0)
            r20.glPopMatrix()
            r3.glMatrixMode(r2)
        L_0x0754:
            na0.j r0 = r1.f32408D0
            r0.getClass()
            int r0 = r20.glGetError()
            if (r0 == 0) goto L_0x0762
            java.lang.Integer.toHexString(r0)
        L_0x0762:
            android.os.SystemClock.elapsedRealtime()
            java.lang.Thread.yield()
            return
        L_0x0769:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r1.f32410E0
            r2.unlock()
            throw r0
        L_0x0770:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0773:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0776:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13096e.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    public final synchronized void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (!this.f32424L0) {
            this.f32420J0 = true;
            float f = (float) i;
            this.f32430R = f / 2.0f;
            float f2 = (float) i2;
            this.f32431S = f2;
            this.f32432T = f2 / 2.0f;
            this.f32433U = f / f2;
            C19958a.m47440p(this.f32447l, (double) i, (double) i2);
            float f3 = this.f32433U * C13275b.f32936c;
            this.f32437b = f3;
            Math.cos(Math.atan((double) f3));
            float f4 = C13275b.f32937d;
            gl10.glViewport(0, 0, i, i2);
            int[] iArr = this.f32461s;
            iArr[2] = i;
            iArr[3] = i2;
            C13089a aVar = this.f32417I;
            synchronized (aVar) {
                ListIterator listIterator = aVar.f32376a.listIterator();
                while (listIterator.hasNext()) {
                    ((C13089a.C13090a) listIterator.next()).mo39954a(1.0f);
                    listIterator.remove();
                }
            }
            this.f32410E0.lock();
            try {
                this.f32429Q = (this.f32431S * 500000.0f) / (((float) this.f32408D0.f32044k) * C13275b.f32936c);
                this.f32410E0.unlock();
                mo39986t(this.f32473y, 0, (Interpolator) null);
                this.f32419J = false;
                C12931i iVar = this.f32411F;
                iVar.f32031a = 0.0d;
                iVar.f32032b = 0.0d;
                this.f32436Z = true;
                C13244b bVar = this.f32408D0.f32055v;
                if (bVar != null) {
                    bVar.mo40119e();
                }
                mo39987w(gl10);
                if (!this.f32422K0) {
                    C13102k kVar = this.f32416H0;
                    synchronized (kVar) {
                        kVar.mo40001h();
                        kVar.mo39995b();
                        kVar.mo39997d();
                        kVar.mo39996c();
                        kVar.mo40003j();
                        ((C13096e) kVar.f32507j).mo39976m();
                    }
                }
                if (!this.f32414G0.isAlive()) {
                    this.f32414G0.start();
                    this.f32416H0.start();
                    this.f32418I0.start();
                }
                C13104m mVar = this.f32414G0;
                synchronized (mVar) {
                    mVar.f32551s = true;
                    mVar.notify();
                }
                C13102k kVar2 = this.f32416H0;
                synchronized (kVar2) {
                    kVar2.f32508k = true;
                    kVar2.notify();
                }
                C13092c cVar = this.f32418I0;
                synchronized (cVar) {
                    cVar.f32390d = true;
                    cVar.notify();
                }
                SystemClock.elapsedRealtime();
                this.f32420J0 = false;
                if (!this.f32422K0) {
                    this.f32422K0 = true;
                    if (bVar != null) {
                        bVar.mo40118d();
                    }
                }
                mo39966c(15);
            } catch (Throwable th) {
                this.f32410E0.unlock();
                throw th;
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        m33040u(gl10);
        this.f32438c.mo40006a();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((this.f32439d.length * 32) / 8);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f32440e = asFloatBuffer;
        asFloatBuffer.put(this.f32439d);
        this.f32440e.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect((this.f32441f.length * 32) / 8);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f32442g = asFloatBuffer2;
        asFloatBuffer2.put(this.f32441f);
        this.f32442g.position(0);
        C12902c cVar = this.f32474y0.f32004b;
        synchronized (cVar) {
            for (C12902c.C12905c cVar2 : cVar.f31929f) {
                cVar.f31930g.mo39775d(cVar2.f31934c);
            }
            C12902c.C12903a aVar = cVar.f31927d;
            C13283h<C13281g<V>.C25541a<V>> hVar = aVar.f32949a;
            synchronized (hVar) {
                C13283h.C13284a<V>[] aVarArr = hVar.f32957a;
                int length = aVarArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    aVarArr[length] = null;
                }
                hVar.f32958b = 0;
            }
            for (C13281g.C13282a aVar2 = aVar.f32950b; aVar2 != null; aVar2 = aVar2.f32953a) {
            }
            aVar.f32952d = 0;
            aVar.f32950b = null;
            aVar.f32951c = null;
            C12902c.C12904b bVar = cVar.f31928e;
            synchronized (bVar) {
                C13283h.C13284a<V>[] aVarArr2 = bVar.f32957a;
                int length2 = aVarArr2.length;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    aVarArr2[length2] = null;
                }
                bVar.f32958b = 0;
            }
            cVar.f31929f.clear();
            cVar.f31925b = 0;
            cVar.f31926c = 0;
        }
        TextureInfoCache textureInfoCache = this.f32443h;
        synchronized (textureInfoCache) {
            textureInfoCache.f24168d.clear();
            textureInfoCache.f24169e.clear();
            textureInfoCache.f24166b = 0;
            textureInfoCache.f24167c = 0;
        }
        this.f32444i.clear();
        new C13099h();
        this.f32466u0 = 0;
        this.f32456p0 = null;
        this.f32468v0 = null;
        this.f32458q0 = true;
        this.f32462s0 = null;
        this.f32464t0 = 1.0f;
        this.f32460r0 = true;
        this.f32470w0 = 0;
        C13244b bVar2 = this.f32408D0.f32055v;
        if (bVar2 != null) {
            bVar2.mo40120f();
        }
        Thread.currentThread().setPriority(10);
    }

    /* renamed from: p */
    public final void mo39982p(double d, double d2, int i, Interpolator interpolator) {
        mo39988x();
        mo39989y();
        if (i > 0) {
            C13089a aVar = this.f32417I;
            MapPos mapPos = new MapPos(d, d2);
            synchronized (aVar) {
                if (interpolator == null) {
                    interpolator = C13089a.f32375c;
                }
                C13089a.C13090a aVar2 = new C13089a.C13090a(i, mapPos, interpolator);
                ListIterator listIterator = aVar.f32376a.listIterator();
                while (listIterator.hasNext()) {
                    if (((C13089a.C13090a) listIterator.next()).f32378a == 0) {
                        aVar2 = new C13089a.C13090a(i, mapPos, interpolator);
                        listIterator.remove();
                    }
                }
                aVar.f32376a.add(aVar2);
                ((C13096e) aVar.f32377b).mo39976m();
            }
            return;
        }
        this.f32417I.mo39953c(0);
        mo39990z(d, d2);
    }

    /* renamed from: q */
    public final void mo39983q(boolean z) {
        if (z) {
            this.f32410E0.lock();
        } else {
            this.f32410E0.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39984r(double r20, double r22, double r24, double r26, double r28, double r30, double r32, boolean r34, boolean r35, boolean r36) {
        /*
            r19 = this;
            r1 = r19
            r2 = r26
            r4 = r28
            r0 = r34
            r6 = r35
            r7 = r36
            sa0.a r8 = r1.f32417I
            r9 = 0
            r8.mo39953c(r9)
            r8 = 1
            if (r0 == 0) goto L_0x001a
            sa0.a r10 = r1.f32417I
            r10.mo39953c(r8)
        L_0x001a:
            if (r6 == 0) goto L_0x0022
            sa0.a r10 = r1.f32417I
            r11 = 3
            r10.mo39953c(r11)
        L_0x0022:
            r10 = 2
            if (r7 == 0) goto L_0x002a
            sa0.a r11 = r1.f32417I
            r11.mo39953c(r10)
        L_0x002a:
            java.util.concurrent.locks.ReentrantLock r11 = r1.f32410E0
            r11.lock()
            na0.h r12 = r1.f32463t     // Catch:{ all -> 0x00c6 }
            r13 = r20
            r15 = r22
            r17 = r24
            r12.mo39798b(r13, r15, r17)     // Catch:{ all -> 0x00c6 }
            na0.h r11 = r1.f32465u     // Catch:{ all -> 0x00c6 }
            double r12 = r11.f32028a     // Catch:{ all -> 0x00c6 }
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004b
            double r12 = r11.f32029b     // Catch:{ all -> 0x00c6 }
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r2 = 0
            goto L_0x0050
        L_0x004b:
            r11.f32028a = r2     // Catch:{ all -> 0x00c6 }
            r11.f32029b = r4     // Catch:{ all -> 0x00c6 }
            r2 = 1
        L_0x0050:
            na0.i r3 = r1.f32467v     // Catch:{ all -> 0x00c6 }
            r4 = 0
            r20 = r3
            r21 = r30
            r23 = r32
            r25 = r4
            r20.mo39810f(r21, r23, r25)     // Catch:{ all -> 0x00c6 }
            na0.i r3 = r1.f32467v     // Catch:{ all -> 0x00c6 }
            r3.mo39808e()     // Catch:{ all -> 0x00c6 }
            float r3 = r1.f32469w     // Catch:{ all -> 0x00c6 }
            r1.mo39975l(r0, r6, r7)     // Catch:{ all -> 0x00c6 }
            float r4 = r1.f32469w     // Catch:{ all -> 0x00c6 }
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 % r5
            float r3 = r3 % r5
            float r4 = r4 - r3
            r3 = 1127481344(0x43340000, float:180.0)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0078
            float r4 = r4 - r5
            goto L_0x007f
        L_0x0078:
            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x007f
            float r4 = r4 + r5
        L_0x007f:
            r3 = 1060320051(0x3f333333, float:0.7)
            float r4 = r4 * r3
            float r3 = r1.f32415H     // Catch:{ all -> 0x00c6 }
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = r3 * r5
            r1.f32415H = r3     // Catch:{ all -> 0x00c6 }
            float r3 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x00c6 }
            float r5 = r1.f32415H     // Catch:{ all -> 0x00c6 }
            float r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x00c6 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x009d
            r1.f32415H = r4     // Catch:{ all -> 0x00c6 }
        L_0x009d:
            float r3 = r1.f32415H     // Catch:{ all -> 0x00c6 }
            float r3 = r3 * r3
            r4 = 1091567616(0x41100000, float:9.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00aa
            r19.mo39989y()     // Catch:{ all -> 0x00c6 }
        L_0x00aa:
            java.util.concurrent.locks.ReentrantLock r3 = r1.f32410E0
            r3.unlock()
            r1.f32436Z = r8
            if (r0 == 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r10 = 0
        L_0x00b5:
            r0 = r2 | r10
            if (r7 == 0) goto L_0x00bb
            r2 = 4
            goto L_0x00bc
        L_0x00bb:
            r2 = 0
        L_0x00bc:
            r0 = r0 | r2
            if (r6 == 0) goto L_0x00c1
            r9 = 8
        L_0x00c1:
            r0 = r0 | r9
            r1.mo39966c(r0)
            return
        L_0x00c6:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r1.f32410E0
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13096e.mo39984r(double, double, double, double, double, double, double, boolean, boolean, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39985s(double r18, double r20, double r22, double r24, double r26, boolean r28, boolean r29) {
        /*
            r17 = this;
            r1 = r17
            r2 = r24
            r4 = r26
            r0 = r28
            r6 = r29
            sa0.a r7 = r1.f32417I
            r8 = 0
            r7.mo39953c(r8)
            if (r0 == 0) goto L_0x0018
            sa0.a r7 = r1.f32417I
            r9 = 3
            r7.mo39953c(r9)
        L_0x0018:
            r7 = 2
            if (r6 == 0) goto L_0x0020
            sa0.a r9 = r1.f32417I
            r9.mo39953c(r7)
        L_0x0020:
            java.util.concurrent.locks.ReentrantLock r7 = r1.f32410E0
            r7.lock()
            na0.h r9 = r1.f32463t     // Catch:{ all -> 0x00d4 }
            r10 = r18
            r12 = r20
            r14 = r22
            r9.mo39798b(r10, r12, r14)     // Catch:{ all -> 0x00d4 }
            na0.h r7 = r1.f32465u     // Catch:{ all -> 0x00d4 }
            double r9 = r7.f32028a     // Catch:{ all -> 0x00d4 }
            double r9 = r2 - r9
            r11 = 4606281698659794944(0x3fecccccc0000000, double:0.8999999761581421)
            double r9 = r9 * r11
            double r13 = r7.f32029b     // Catch:{ all -> 0x00d4 }
            double r13 = r4 - r13
            double r13 = r13 * r11
            na0.i r7 = r1.f32411F     // Catch:{ all -> 0x00d4 }
            double r11 = r7.f32031a     // Catch:{ all -> 0x00d4 }
            r15 = 4605380979056443392(0x3fe99999a0000000, double:0.800000011920929)
            double r11 = r11 * r15
            r7.f32031a = r11     // Catch:{ all -> 0x00d4 }
            double r11 = r7.f32032b     // Catch:{ all -> 0x00d4 }
            double r11 = r11 * r15
            r7.f32032b = r11     // Catch:{ all -> 0x00d4 }
            double r11 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x00d4 }
            na0.i r7 = r1.f32411F     // Catch:{ all -> 0x00d4 }
            r18 = r9
            double r8 = r7.f32031a     // Catch:{ all -> 0x00d4 }
            double r7 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x00d4 }
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x006e
            na0.i r7 = r1.f32411F     // Catch:{ all -> 0x00d4 }
            r9 = r18
            r7.f32031a = r9     // Catch:{ all -> 0x00d4 }
        L_0x006e:
            double r7 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x00d4 }
            na0.i r9 = r1.f32411F     // Catch:{ all -> 0x00d4 }
            double r9 = r9.f32032b     // Catch:{ all -> 0x00d4 }
            double r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x00d4 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0082
            na0.i r7 = r1.f32411F     // Catch:{ all -> 0x00d4 }
            r7.f32032b = r13     // Catch:{ all -> 0x00d4 }
        L_0x0082:
            na0.i r7 = r1.f32411F     // Catch:{ all -> 0x00d4 }
            double r8 = r7.f32031a     // Catch:{ all -> 0x00d4 }
            double r8 = r8 * r8
            double r10 = r7.f32032b     // Catch:{ all -> 0x00d4 }
            double r10 = r10 * r10
            double r10 = r10 + r8
            r7 = 1301220632(0x4d8f0d18, float:3.0E8)
            float r8 = r1.f32475z     // Catch:{ all -> 0x00d4 }
            float r8 = r8 * r8
            float r7 = r7 / r8
            double r7 = (double) r7     // Catch:{ all -> 0x00d4 }
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x009d
            r17.mo39988x()     // Catch:{ all -> 0x00d4 }
        L_0x009d:
            na0.h r7 = r1.f32465u     // Catch:{ all -> 0x00d4 }
            double r8 = r7.f32028a     // Catch:{ all -> 0x00d4 }
            r10 = 1
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x00b0
            double r8 = r7.f32029b     // Catch:{ all -> 0x00d4 }
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x00ad
            goto L_0x00b0
        L_0x00ad:
            r2 = 0
            r15 = 0
            goto L_0x00b6
        L_0x00b0:
            r7.f32028a = r2     // Catch:{ all -> 0x00d4 }
            r7.f32029b = r4     // Catch:{ all -> 0x00d4 }
            r2 = 0
            r15 = 1
        L_0x00b6:
            r1.mo39975l(r2, r0, r6)     // Catch:{ all -> 0x00d4 }
            java.util.concurrent.locks.ReentrantLock r3 = r1.f32410E0
            r3.unlock()
            r1.f32436Z = r10
            r3 = r15 | 0
            if (r6 == 0) goto L_0x00c6
            r4 = 4
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            r3 = r3 | r4
            if (r0 == 0) goto L_0x00cd
            r8 = 8
            goto L_0x00ce
        L_0x00cd:
            r8 = 0
        L_0x00ce:
            r0 = r3 | r8
            r1.mo39966c(r0)
            return
        L_0x00d4:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r1.f32410E0
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13096e.mo39985s(double, double, double, double, double, boolean, boolean):void");
    }

    /* renamed from: t */
    public final void mo39986t(float f, int i, Interpolator interpolator) {
        mo39988x();
        mo39989y();
        if (i > 0) {
            this.f32417I.mo39951a(2, i, f, interpolator);
            return;
        }
        this.f32417I.mo39953c(2);
        mo39962D(f);
    }

    /* renamed from: w */
    public final void mo39987w(GL10 gl10) {
        C13096e eVar = this;
        GL10 gl102 = gl10;
        eVar.f32410E0.lock();
        try {
            if (eVar.f32436Z) {
                eVar.f32436Z = false;
                double[] dArr = eVar.f32451n;
                C12930h hVar = eVar.f32463t;
                double d = hVar.f32028a;
                double d2 = hVar.f32029b;
                double d3 = hVar.f32030c;
                C12930h hVar2 = eVar.f32465u;
                double d4 = hVar2.f32028a;
                double d5 = hVar2.f32029b;
                C12931i iVar = eVar.f32467v;
                double[] dArr2 = dArr;
                double d6 = iVar.f32031a;
                C19958a.m47442r(dArr2, d, d2, d3, d4, d5, d6, iVar.f32032b, iVar.f32033c);
                eVar = this;
                C19958a.m47432f(eVar.f32451n, eVar.f32449m);
                C19958a.m47430c(eVar.f32455p, eVar.f32451n, 0);
                double[] dArr3 = eVar.f32457q;
                C12930h hVar3 = eVar.f32463t;
                dArr3[0] = hVar3.f32028a;
                dArr3[1] = hVar3.f32029b;
                dArr3[2] = hVar3.f32030c;
                dArr3[3] = 0.0d;
                C19958a.m47439o(eVar.f32459r, 0, eVar.f32455p, dArr3, 0);
                double[] dArr4 = eVar.f32455p;
                double d7 = dArr4[12];
                double[] dArr5 = eVar.f32459r;
                dArr4[12] = d7 + dArr5[0];
                dArr4[13] = dArr4[13] + dArr5[1];
                dArr4[14] = dArr4[14] + dArr5[2];
                C19958a.m47432f(dArr4, eVar.f32453o);
                GL10 gl103 = gl10;
                gl103.glLoadMatrixf(eVar.f32453o, 0);
                eVar.f32434X = (double) eVar.mo39971h(eVar.f32463t.f32030c);
                eVar.f32435Y = (double) eVar.mo39969f(eVar.f32463t.f32030c);
                Math.sqrt(3.0d);
                double d8 = eVar.f32434X * ((double) C13275b.f32936c);
                double d9 = -d8;
                double d11 = (double) eVar.f32433U;
                gl103.glMatrixMode(5889);
                float[] fArr = eVar.f32446k;
                C19958a.m47434i(fArr, d9 * d11, d8 * d11, d9, d8, eVar.f32434X, eVar.f32435Y);
                gl103.glLoadMatrixf(eVar.f32446k, 0);
                gl103.glMatrixMode(5888);
                eVar.f32401A = new C12923b(new MapPos(eVar.f32463t), new C12936m(eVar.f32467v), eVar.f32451n, eVar.f32446k, eVar.f32469w, eVar.f32471x, eVar.f32473y);
                eVar.f32458q0 = true;
            }
            C13244b bVar = eVar.f32408D0.f32055v;
            eVar.f32410E0.unlock();
        } catch (Throwable th) {
            th = th;
            eVar.f32410E0.unlock();
            throw th;
        }
    }

    /* renamed from: x */
    public final void mo39988x() {
        this.f32409E = false;
        this.f32410E0.lock();
        try {
            C12931i iVar = this.f32411F;
            iVar.f32031a = 0.0d;
            iVar.f32032b = 0.0d;
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* renamed from: y */
    public final void mo39989y() {
        this.f32413G = false;
        this.f32410E0.lock();
        try {
            this.f32415H = BitmapDescriptorFactory.HUE_RED;
        } finally {
            this.f32410E0.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    public final void mo39990z(double d, double d2) {
        this.f32406C0.getClass();
        double a = C13288j.m33426a(d);
        double a2 = C13288j.m33426a(d2);
        this.f32410E0.lock();
        try {
            C12931i iVar = this.f32403B;
            C12930h hVar = this.f32463t;
            double d3 = hVar.f32028a;
            C12930h hVar2 = this.f32465u;
            double d4 = d3 - hVar2.f32028a;
            double d5 = hVar.f32029b - hVar2.f32029b;
            iVar.f32031a = d4;
            iVar.f32032b = d5;
            hVar2.f32028a = a;
            hVar2.f32029b = a2;
            hVar.f32028a = a + d4;
            hVar.f32029b = a2 + d5;
            this.f32410E0.unlock();
            this.f32436Z = true;
            mo39966c(1);
        } catch (Throwable th) {
            this.f32410E0.unlock();
            throw th;
        }
    }
}
