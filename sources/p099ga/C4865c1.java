package p099ga;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import bh0.C21060a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C3876a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3994a;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableListMultimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p001a0.C0016g;
import p099ga.C4858b;
import p099ga.C4869d;
import p099ga.C4874d1;
import p099ga.C4910k0;
import p099ga.C4914m;
import p099ga.C4936u0;
import p099ga.C4943v0;
import p100gb.C4973f;
import p100gb.C4998v;
import p112ha.C5196m0;
import p112ha.C5199n0;
import p112ha.C5209w;
import p125ia.C5316d;
import p125ia.C5319f;
import p126ib.C5332a;
import p126ib.C5342i;
import p137ja.C5413d;
import p137ja.C5414e;
import p150ka.C5533a;
import p150ka.C5534b;
import p173ma.C5733f;
import p252sb.C6505e;
import p252sb.C6506f;
import p265tb.C6647c;
import p265tb.C6660l;
import p277ub.C6773a;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6780f;
import p277ub.C6786k;
import p277ub.C6808v;
import p277ub.C6809w;
import p290vb.C6940f;
import p290vb.C6941g;
import p290vb.C6948i;
import p290vb.C6953n;
import p290vb.C6955o;
import p303wb.C7012a;
import p326ya.C7358d;
import p583jk.C17875h;

/* renamed from: ga.c1 */
public final class C4865c1 extends C4877e implements C4914m {

    /* renamed from: A */
    public int f16304A;

    /* renamed from: B */
    public int f16305B;

    /* renamed from: C */
    public int f16306C;

    /* renamed from: D */
    public C5316d f16307D;

    /* renamed from: E */
    public float f16308E;

    /* renamed from: F */
    public boolean f16309F;

    /* renamed from: G */
    public List<C5332a> f16310G;

    /* renamed from: H */
    public boolean f16311H;

    /* renamed from: I */
    public boolean f16312I;

    /* renamed from: J */
    public C5533a f16313J;

    /* renamed from: b */
    public final C4949x0[] f16314b;

    /* renamed from: c */
    public final C21060a f16315c;

    /* renamed from: d */
    public final C4872d0 f16316d;

    /* renamed from: e */
    public final C4867b f16317e;

    /* renamed from: f */
    public final C4868c f16318f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<C6948i> f16319g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<C5319f> f16320h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<C5342i> f16321i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<C7358d> f16322j;

    /* renamed from: k */
    public final CopyOnWriteArraySet<C5534b> f16323k;

    /* renamed from: l */
    public final C5196m0 f16324l;

    /* renamed from: m */
    public final C4858b f16325m;

    /* renamed from: n */
    public final C4869d f16326n;

    /* renamed from: o */
    public final C4874d1 f16327o;

    /* renamed from: p */
    public final C4885f1 f16328p;

    /* renamed from: q */
    public final C4895g1 f16329q;

    /* renamed from: r */
    public final long f16330r;

    /* renamed from: s */
    public AudioTrack f16331s;

    /* renamed from: t */
    public Object f16332t;

    /* renamed from: u */
    public Surface f16333u;

    /* renamed from: v */
    public SurfaceHolder f16334v;

    /* renamed from: w */
    public SphericalGLSurfaceView f16335w;

    /* renamed from: x */
    public boolean f16336x;

    /* renamed from: y */
    public TextureView f16337y;

    /* renamed from: z */
    public int f16338z;

    /* renamed from: ga.c1$a */
    public static final class C4866a {

        /* renamed from: a */
        public final Context f16339a;

        /* renamed from: b */
        public final C4857a1 f16340b;

        /* renamed from: c */
        public C6808v f16341c;

        /* renamed from: d */
        public C6506f f16342d;

        /* renamed from: e */
        public C4998v f16343e;

        /* renamed from: f */
        public C4900j f16344f;

        /* renamed from: g */
        public C6647c f16345g;

        /* renamed from: h */
        public C5196m0 f16346h;

        /* renamed from: i */
        public Looper f16347i;

        /* renamed from: j */
        public C5316d f16348j;

        /* renamed from: k */
        public int f16349k;

        /* renamed from: l */
        public boolean f16350l;

        /* renamed from: m */
        public C4862b1 f16351m;

        /* renamed from: n */
        public C4898i f16352n;

        /* renamed from: o */
        public long f16353o;

        /* renamed from: p */
        public long f16354p;

        /* renamed from: q */
        public boolean f16355q;

        public C4866a(Context context) {
            C6660l lVar;
            C4912l lVar2 = new C4912l(context);
            C5733f fVar = new C5733f();
            C3994a.C3996b bVar = new C3994a.C3996b();
            DefaultTrackSelector.Parameters parameters = DefaultTrackSelector.Parameters.f14034K;
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(new DefaultTrackSelector.C3989c(context).mo16320a(), bVar);
            C4973f fVar2 = new C4973f(context, fVar);
            C4900j jVar = new C4900j();
            ImmutableListMultimap<String, Integer> immutableListMultimap = C6660l.f20686n;
            synchronized (C6660l.class) {
                if (C6660l.f20693u == null) {
                    C6660l.C6661a aVar = new C6660l.C6661a(context);
                    C6660l.f20693u = new C6660l(aVar.f20707a, aVar.f20708b, aVar.f20709c, aVar.f20710d, aVar.f20711e);
                }
                lVar = C6660l.f20693u;
            }
            C6808v vVar = C6773a.f20958a;
            C5196m0 m0Var = new C5196m0();
            this.f16339a = context;
            this.f16340b = lVar2;
            this.f16342d = defaultTrackSelector;
            this.f16343e = fVar2;
            this.f16344f = jVar;
            this.f16345g = lVar;
            this.f16346h = m0Var;
            Looper myLooper = Looper.myLooper();
            this.f16347i = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.f16348j = C5316d.f17511f;
            this.f16349k = 1;
            this.f16350l = true;
            this.f16351m = C4862b1.f16296c;
            this.f16352n = new C4898i(C4883f.m12376a(20), C4883f.m12376a(500), 0.999f);
            this.f16341c = vVar;
            this.f16353o = 500;
            this.f16354p = 2000;
        }
    }

    /* renamed from: ga.c1$b */
    public final class C4867b implements C6953n, C3876a, C5342i, C7358d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.C4081b, C4869d.C4871b, C4858b.C4860b, C4874d1.C4875a, C4936u0.C4938b, C4914m.C4915a {
        public C4867b() {
        }

        /* renamed from: A */
        public final void mo15869A(Exception exc) {
            C4865c1.this.f16324l.mo15869A(exc);
        }

        /* renamed from: B */
        public final void mo16508B(List<C5332a> list) {
            C4865c1 c1Var = C4865c1.this;
            c1Var.f16310G = list;
            Iterator<C5342i> it = c1Var.f16321i.iterator();
            while (it.hasNext()) {
                it.next().mo16508B(list);
            }
        }

        /* renamed from: C */
        public final void mo20408C(Format format, C5414e eVar) {
            C4865c1.this.getClass();
            C4865c1.this.f16324l.mo20408C(format, eVar);
        }

        /* renamed from: D */
        public final void mo15870D(long j) {
            C4865c1.this.f16324l.mo15870D(j);
        }

        /* renamed from: F */
        public final void mo20409F(Exception exc) {
            C4865c1.this.f16324l.mo20409F(exc);
        }

        /* renamed from: H */
        public final void mo20410H(long j, Object obj) {
            C4865c1.this.f16324l.mo20410H(j, obj);
            C4865c1 c1Var = C4865c1.this;
            if (c1Var.f16332t == obj) {
                Iterator<C6948i> it = c1Var.f16319g.iterator();
                while (it.hasNext()) {
                    it.next().mo16513c();
                }
            }
        }

        /* renamed from: J */
        public final void mo20411J(int i, long j) {
            C4865c1.this.f16324l.mo20411J(i, j);
        }

        /* renamed from: K */
        public final /* synthetic */ void mo16423K(ExoPlaybackException exoPlaybackException) {
        }

        /* renamed from: L */
        public final void mo16424L(boolean z) {
            C4865c1.this.getClass();
        }

        /* renamed from: M */
        public final void mo16425M(int i, boolean z) {
            C4865c1.m12187P(C4865c1.this);
        }

        /* renamed from: O */
        public final void mo15871O(C5413d dVar) {
            C4865c1.this.getClass();
            C4865c1.this.f16324l.mo15871O(dVar);
        }

        /* renamed from: P */
        public final /* synthetic */ void mo16426P(C4901j0 j0Var, int i) {
        }

        /* renamed from: Q */
        public final /* synthetic */ void mo16427Q(TrackGroupArray trackGroupArray, C6505e eVar) {
        }

        /* renamed from: S */
        public final /* synthetic */ void mo16428S(int i, C4936u0.C4941e eVar, C4936u0.C4941e eVar2) {
        }

        /* renamed from: V */
        public final /* synthetic */ void mo16429V(int i) {
        }

        /* renamed from: W */
        public final void mo15872W(Format format, C5414e eVar) {
            C4865c1.this.getClass();
            C4865c1.this.f16324l.mo15872W(format, eVar);
        }

        /* renamed from: X */
        public final /* synthetic */ void mo16430X() {
        }

        /* renamed from: Z */
        public final /* synthetic */ void mo16431Z(int i, boolean z) {
        }

        /* renamed from: a */
        public final void mo20412a(String str) {
            C4865c1.this.f16324l.mo20412a(str);
        }

        /* renamed from: a0 */
        public final void mo15873a0(Exception exc) {
            C4865c1.this.f16324l.mo15873a0(exc);
        }

        /* renamed from: b */
        public final /* synthetic */ void mo16433b() {
        }

        /* renamed from: b0 */
        public final /* synthetic */ void mo16434b0(C4932s0 s0Var) {
        }

        /* renamed from: c */
        public final void mo16741c(Surface surface) {
            C4865c1.this.mo20377X(surface);
        }

        /* renamed from: d */
        public final void mo15874d(boolean z) {
            C4865c1 c1Var = C4865c1.this;
            if (c1Var.f16309F != z) {
                c1Var.f16309F = z;
                c1Var.f16324l.mo16514d(z);
                Iterator<C5319f> it = c1Var.f16320h.iterator();
                while (it.hasNext()) {
                    it.next().mo16514d(c1Var.f16309F);
                }
            }
        }

        /* renamed from: d0 */
        public final /* synthetic */ void mo16437d0(C4936u0.C4939c cVar) {
        }

        /* renamed from: e */
        public final /* synthetic */ void mo15875e() {
        }

        /* renamed from: f */
        public final /* synthetic */ void mo20413f() {
        }

        /* renamed from: f0 */
        public final void mo15876f0(int i, long j, long j2) {
            C4865c1.this.f16324l.mo15876f0(i, j, j2);
        }

        /* renamed from: g */
        public final /* synthetic */ void mo16438g() {
        }

        /* renamed from: h */
        public final /* synthetic */ void mo16439h() {
        }

        /* renamed from: h0 */
        public final /* synthetic */ void mo16440h0(boolean z) {
        }

        /* renamed from: i */
        public final /* synthetic */ void mo16441i() {
        }

        /* renamed from: j */
        public final void mo20414j(C6955o oVar) {
            C4865c1.this.getClass();
            C4865c1.this.f16324l.mo16515j(oVar);
            Iterator<C6948i> it = C4865c1.this.f16319g.iterator();
            while (it.hasNext()) {
                C6948i next = it.next();
                next.mo16515j(oVar);
                next.onVideoSizeChanged(oVar.f21704a, oVar.f21705b, oVar.f21706c, oVar.f21707d);
            }
        }

        /* renamed from: k */
        public final /* synthetic */ void mo20415k() {
        }

        /* renamed from: l */
        public final /* synthetic */ void mo16442l(int i) {
        }

        /* renamed from: m */
        public final void mo20416m(C5413d dVar) {
            C4865c1.this.f16324l.mo20416m(dVar);
            C4865c1.this.getClass();
            C4865c1.this.getClass();
        }

        /* renamed from: n */
        public final void mo16742n() {
            C4865c1.this.mo20377X((Object) null);
        }

        /* renamed from: o */
        public final void mo20417o() {
            C4865c1.m12187P(C4865c1.this);
        }

        public final void onAudioDecoderInitialized(String str, long j, long j2) {
            C4865c1.this.f16324l.onAudioDecoderInitialized(str, j, j2);
        }

        public final void onDroppedFrames(int i, long j) {
            C4865c1.this.f16324l.onDroppedFrames(i, j);
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C4865c1 c1Var = C4865c1.this;
            c1Var.getClass();
            Surface surface = new Surface(surfaceTexture);
            c1Var.mo20377X(surface);
            c1Var.f16333u = surface;
            C4865c1.this.mo20372S(i, i2);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C4865c1.this.mo20377X((Object) null);
            C4865c1.this.mo20372S(0, 0);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C4865c1.this.mo20372S(i, i2);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final void onVideoDecoderInitialized(String str, long j, long j2) {
            C4865c1.this.f16324l.onVideoDecoderInitialized(str, j, j2);
        }

        /* renamed from: p */
        public final /* synthetic */ void mo16444p(List list) {
        }

        /* renamed from: q */
        public final void mo20424q(C5413d dVar) {
            C4865c1.this.getClass();
            C4865c1.this.f16324l.mo20424q(dVar);
        }

        /* renamed from: s */
        public final /* synthetic */ void mo16445s(C4910k0 k0Var) {
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C4865c1.this.mo20372S(i2, i3);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C4865c1 c1Var = C4865c1.this;
            if (c1Var.f16336x) {
                c1Var.mo20377X(surfaceHolder.getSurface());
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C4865c1 c1Var = C4865c1.this;
            if (c1Var.f16336x) {
                c1Var.mo20377X((Object) null);
            }
            C4865c1.this.mo20372S(0, 0);
        }

        /* renamed from: t */
        public final void mo15878t(C5413d dVar) {
            C4865c1.this.f16324l.mo15878t(dVar);
            C4865c1.this.getClass();
            C4865c1.this.getClass();
        }

        /* renamed from: u */
        public final void mo16446u(int i) {
            C4865c1.m12187P(C4865c1.this);
        }

        /* renamed from: v */
        public final void mo15879v(String str) {
            C4865c1.this.f16324l.mo15879v(str);
        }

        /* renamed from: w */
        public final /* synthetic */ void mo16447w(boolean z) {
        }

        /* renamed from: x */
        public final void mo16519x(Metadata metadata) {
            C4865c1.this.f16324l.mo16519x(metadata);
            C4872d0 d0Var = C4865c1.this.f16316d;
            C4910k0 k0Var = d0Var.f16371A;
            k0Var.getClass();
            C4910k0.C4911a aVar = new C4910k0.C4911a(k0Var);
            int i = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f13864b;
                if (i >= entryArr.length) {
                    break;
                }
                entryArr[i].mo16091c2(aVar);
                i++;
            }
            C4910k0 k0Var2 = new C4910k0(aVar);
            if (!k0Var2.equals(d0Var.f16371A)) {
                d0Var.f16371A = k0Var2;
                C6786k<C4936u0.C4938b> kVar = d0Var.f16382i;
                kVar.mo22959b(15, new C4933t(d0Var));
                kVar.mo22958a();
            }
            Iterator<C7358d> it = C4865c1.this.f16322j.iterator();
            while (it.hasNext()) {
                it.next().mo16519x(metadata);
            }
        }

        /* renamed from: y */
        public final /* synthetic */ void mo16448y(int i) {
        }
    }

    /* renamed from: ga.c1$c */
    public static final class C4868c implements C6941g, C7012a, C4943v0.C4945b {

        /* renamed from: b */
        public C6941g f16357b;

        /* renamed from: c */
        public C7012a f16358c;

        /* renamed from: d */
        public C6941g f16359d;

        /* renamed from: e */
        public C7012a f16360e;

        /* renamed from: a */
        public final void mo20428a(long j, long j2, Format format, MediaFormat mediaFormat) {
            C6941g gVar = this.f16359d;
            if (gVar != null) {
                gVar.mo20428a(j, j2, format, mediaFormat);
            }
            C6941g gVar2 = this.f16357b;
            if (gVar2 != null) {
                gVar2.mo20428a(j, j2, format, mediaFormat);
            }
        }

        /* renamed from: b */
        public final void mo20429b(long j, float[] fArr) {
            C7012a aVar = this.f16360e;
            if (aVar != null) {
                aVar.mo20429b(j, fArr);
            }
            C7012a aVar2 = this.f16358c;
            if (aVar2 != null) {
                aVar2.mo20429b(j, fArr);
            }
        }

        /* renamed from: c */
        public final void mo20430c() {
            C7012a aVar = this.f16360e;
            if (aVar != null) {
                aVar.mo20430c();
            }
            C7012a aVar2 = this.f16358c;
            if (aVar2 != null) {
                aVar2.mo20430c();
            }
        }

        /* renamed from: j */
        public final void mo15819j(int i, Object obj) {
            if (i == 6) {
                this.f16357b = (C6941g) obj;
            } else if (i == 7) {
                this.f16358c = (C7012a) obj;
            } else if (i == 10000) {
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                if (sphericalGLSurfaceView == null) {
                    this.f16359d = null;
                    this.f16360e = null;
                    return;
                }
                this.f16359d = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f16360e = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public C4865c1(C4866a aVar) {
        C4865c1 c1Var;
        C4868c cVar;
        C4867b bVar;
        C4872d0 d0Var;
        Handler handler;
        int i;
        C4866a aVar2 = aVar;
        C21060a aVar3 = new C21060a();
        this.f16315c = aVar3;
        try {
            Context applicationContext = aVar2.f16339a.getApplicationContext();
            C5196m0 m0Var = aVar2.f16346h;
            this.f16324l = m0Var;
            this.f16307D = aVar2.f16348j;
            this.f16338z = aVar2.f16349k;
            this.f16309F = false;
            this.f16330r = aVar2.f16354p;
            C4867b bVar2 = new C4867b();
            this.f16317e = bVar2;
            C4868c cVar2 = new C4868c();
            this.f16318f = cVar2;
            this.f16319g = new CopyOnWriteArraySet<>();
            this.f16320h = new CopyOnWriteArraySet<>();
            this.f16321i = new CopyOnWriteArraySet<>();
            this.f16322j = new CopyOnWriteArraySet<>();
            this.f16323k = new CopyOnWriteArraySet<>();
            Handler handler2 = new Handler(aVar2.f16347i);
            C4949x0[] a = ((C4912l) aVar2.f16340b).mo20552a(handler2, bVar2, bVar2, bVar2, bVar2);
            this.f16314b = a;
            this.f16308E = 1.0f;
            if (C6774a0.f20959a < 21) {
                AudioTrack audioTrack = this.f16331s;
                if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                    this.f16331s.release();
                    this.f16331s = null;
                }
                if (this.f16331s == null) {
                    this.f16331s = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f16306C = this.f16331s.getAudioSessionId();
            } else {
                UUID uuid = C4883f.f16441a;
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager == null) {
                    i = -1;
                } else {
                    i = audioManager.generateAudioSessionId();
                }
                this.f16306C = i;
            }
            this.f16310G = Collections.emptyList();
            this.f16311H = true;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {15, 16, 17, 18, 19, 20, 21, 22};
            int i2 = 0;
            for (int i3 = 8; i2 < i3; i3 = 8) {
                int i4 = iArr[i2];
                C17875h.m44304o(!false);
                sparseBooleanArray.append(i4, true);
                i2++;
            }
            C17875h.m44304o(!false);
            C4936u0.C4937a aVar4 = new C4936u0.C4937a(new C6780f(sparseBooleanArray));
            C6506f fVar = aVar2.f16342d;
            C4998v vVar = aVar2.f16343e;
            C4900j jVar = aVar2.f16344f;
            C6647c cVar3 = aVar2.f16345g;
            boolean z = aVar2.f16350l;
            C4862b1 b1Var = aVar2.f16351m;
            C4936u0.C4937a aVar5 = aVar4;
            C4898i iVar = aVar2.f16352n;
            C21060a aVar6 = aVar3;
            try {
                long j = aVar2.f16353o;
                C6808v vVar2 = aVar2.f16341c;
                Looper looper = aVar2.f16347i;
                boolean z2 = z;
                C4949x0[] x0VarArr = a;
                C6506f fVar2 = fVar;
                Handler handler3 = handler2;
                C4998v vVar3 = vVar;
                C4868c cVar4 = cVar2;
                C4900j jVar2 = jVar;
                C4867b bVar3 = bVar2;
                C6647c cVar5 = cVar3;
                cVar = cVar4;
                C4867b bVar4 = bVar3;
                bVar = bVar4;
                d0Var = r1;
                handler = handler3;
                C4872d0 d0Var2 = new C4872d0(x0VarArr, fVar2, vVar3, jVar2, cVar5, m0Var, z2, b1Var, iVar, j, vVar2, looper, this, aVar5);
                c1Var = this;
            } catch (Throwable th) {
                th = th;
                c1Var = this;
                c1Var.f16315c.mo53185a();
                throw th;
            }
            try {
                c1Var.f16316d = d0Var;
                C4867b bVar5 = bVar;
                d0Var.mo20388g(bVar5);
                d0Var.f16383j.add(bVar5);
                C4867b bVar6 = bVar5;
                C4866a aVar7 = aVar;
                Handler handler4 = handler;
                C4858b bVar7 = new C4858b(aVar7.f16339a, handler4, bVar6);
                c1Var.f16325m = bVar7;
                bVar7.mo20352a();
                C4869d dVar = new C4869d(aVar7.f16339a, handler4, bVar6);
                c1Var.f16326n = dVar;
                if (!C6774a0.m15941a(dVar.f16364d, (Object) null)) {
                    dVar.f16364d = null;
                    dVar.f16366f = 0;
                }
                C4874d1 d1Var = new C4874d1(aVar7.f16339a, handler4, bVar6);
                c1Var.f16327o = d1Var;
                d1Var.mo20447b(C6774a0.m15957q(c1Var.f16307D.f17514c));
                c1Var.f16328p = new C4885f1(aVar7.f16339a);
                c1Var.f16329q = new C4895g1(aVar7.f16339a);
                c1Var.f16313J = m12188R(d1Var);
                c1Var.mo20375V(1, 102, Integer.valueOf(c1Var.f16306C));
                c1Var.mo20375V(2, 102, Integer.valueOf(c1Var.f16306C));
                c1Var.mo20375V(1, 3, c1Var.f16307D);
                c1Var.mo20375V(2, 4, Integer.valueOf(c1Var.f16338z));
                c1Var.mo20375V(1, 101, Boolean.valueOf(c1Var.f16309F));
                C4868c cVar6 = cVar;
                c1Var.mo20375V(2, 6, cVar6);
                c1Var.mo20375V(6, 7, cVar6);
                aVar6.mo53185a();
            } catch (Throwable th2) {
                th = th2;
                c1Var.f16315c.mo53185a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c1Var = this;
            c1Var.f16315c.mo53185a();
            throw th;
        }
    }

    /* renamed from: P */
    public static void m12187P(C4865c1 c1Var) {
        int H = c1Var.mo20364H();
        if (H != 1) {
            if (H == 2 || H == 3) {
                c1Var.mo20383b0();
                boolean z = c1Var.f16316d.f16372B.f16690p;
                C4885f1 f1Var = c1Var.f16328p;
                boolean z2 = c1Var.mo20407z();
                f1Var.getClass();
                C4895g1 g1Var = c1Var.f16329q;
                c1Var.mo20407z();
                g1Var.getClass();
                return;
            } else if (H != 4) {
                throw new IllegalStateException();
            }
        }
        c1Var.f16328p.getClass();
        c1Var.f16329q.getClass();
    }

    /* renamed from: R */
    public static C5533a m12188R(C4874d1 d1Var) {
        int i;
        d1Var.getClass();
        if (C6774a0.f20959a >= 28) {
            i = d1Var.f16405d.getStreamMinVolume(d1Var.f16407f);
        } else {
            i = 0;
        }
        return new C5533a(i, d1Var.f16405d.getStreamMaxVolume(d1Var.f16407f));
    }

    /* renamed from: A */
    public final void mo20358A(boolean z) {
        mo20383b0();
        this.f16316d.mo20358A(z);
    }

    /* renamed from: B */
    public final int mo20359B() {
        mo20383b0();
        return this.f16316d.mo20359B();
    }

    /* renamed from: C */
    public final void mo20360C(TextureView textureView) {
        mo20383b0();
        if (textureView != null && textureView == this.f16337y) {
            mo20371Q();
        }
    }

    /* renamed from: D */
    public final int mo20361D() {
        mo20383b0();
        return this.f16316d.mo20361D();
    }

    /* renamed from: E */
    public final long mo20362E() {
        mo20383b0();
        return this.f16316d.mo20362E();
    }

    /* renamed from: G */
    public final void mo20363G(C4936u0.C4940d dVar) {
        dVar.getClass();
        this.f16320h.add(dVar);
        this.f16319g.add(dVar);
        this.f16321i.add(dVar);
        this.f16322j.add(dVar);
        this.f16323k.add(dVar);
        this.f16316d.mo20388g(dVar);
    }

    /* renamed from: H */
    public final int mo20364H() {
        mo20383b0();
        return this.f16316d.f16372B.f16679e;
    }

    /* renamed from: I */
    public final C4936u0.C4937a mo20365I() {
        mo20383b0();
        return this.f16316d.f16399z;
    }

    /* renamed from: J */
    public final void mo20366J(int i) {
        mo20383b0();
        this.f16316d.mo20366J(i);
    }

    /* renamed from: L */
    public final void mo20367L(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        mo20383b0();
        if (surfaceView == null) {
            surfaceHolder = null;
        } else {
            surfaceHolder = surfaceView.getHolder();
        }
        mo20383b0();
        if (surfaceHolder != null && surfaceHolder == this.f16334v) {
            mo20371Q();
        }
    }

    /* renamed from: M */
    public final int mo20368M() {
        mo20383b0();
        return this.f16316d.f16392s;
    }

    /* renamed from: N */
    public final boolean mo20369N() {
        mo20383b0();
        return this.f16316d.f16393t;
    }

    /* renamed from: O */
    public final long mo20370O() {
        mo20383b0();
        return this.f16316d.mo20370O();
    }

    /* renamed from: Q */
    public final void mo20371Q() {
        mo20383b0();
        mo20374U();
        mo20377X((Object) null);
        mo20372S(0, 0);
    }

    /* renamed from: S */
    public final void mo20372S(int i, int i2) {
        if (i != this.f16304A || i2 != this.f16305B) {
            this.f16304A = i;
            this.f16305B = i2;
            this.f16324l.mo16509I(i, i2);
            Iterator<C6948i> it = this.f16319g.iterator();
            while (it.hasNext()) {
                it.next().mo16509I(i, i2);
            }
        }
    }

    /* renamed from: T */
    public final void mo20373T() {
        String str;
        boolean z;
        AudioTrack audioTrack;
        mo20383b0();
        if (C6774a0.f20959a < 21 && (audioTrack = this.f16331s) != null) {
            audioTrack.release();
            this.f16331s = null;
        }
        this.f16325m.mo20352a();
        C4874d1 d1Var = this.f16327o;
        C4874d1.C4876b bVar = d1Var.f16406e;
        if (bVar != null) {
            try {
                d1Var.f16402a.unregisterReceiver(bVar);
            } catch (RuntimeException e) {
                C6776b0.m15968a("Error unregistering stream volume receiver", e);
            }
            d1Var.f16406e = null;
        }
        this.f16328p.getClass();
        this.f16329q.getClass();
        C4869d dVar = this.f16326n;
        dVar.f16363c = null;
        dVar.mo20431a();
        C4872d0 d0Var = this.f16316d;
        d0Var.getClass();
        String hexString = Integer.toHexString(System.identityHashCode(d0Var));
        String str2 = C6774a0.f20963e;
        HashSet<String> hashSet = C4897h0.f16510a;
        synchronized (C4897h0.class) {
            str = C4897h0.f16511b;
        }
        new StringBuilder(C0016g.m25h(str, C0016g.m25h(str2, C0016g.m25h(hexString, 36))));
        C4887g0 g0Var = d0Var.f16381h;
        synchronized (g0Var) {
            if (!g0Var.f16486z) {
                if (g0Var.f16469i.isAlive()) {
                    ((C6809w) g0Var.f16468h).mo23022c(7);
                    g0Var.mo20511g0(new C4878e0(g0Var), g0Var.f16482v);
                    z = g0Var.f16486z;
                }
            }
            z = true;
        }
        if (!z) {
            C6786k<C4936u0.C4938b> kVar = d0Var.f16382i;
            kVar.mo22959b(11, new C4929r());
            kVar.mo22958a();
        }
        d0Var.f16382i.mo22960c();
        ((C6809w) d0Var.f16379f).f21063a.removeCallbacksAndMessages((Object) null);
        C5196m0 m0Var = d0Var.f16388o;
        if (m0Var != null) {
            d0Var.f16390q.mo22817a(m0Var);
        }
        C4930r0 g = d0Var.f16372B.mo20599g(1);
        d0Var.f16372B = g;
        C4930r0 a = g.mo20593a(g.f16676b);
        d0Var.f16372B = a;
        a.f16691q = a.f16693s;
        d0Var.f16372B.f16692r = 0;
        C5196m0 m0Var2 = this.f16324l;
        C5199n0.C5200a i0 = m0Var2.mo20913i0();
        m0Var2.f17274e.put(1036, i0);
        C6786k<C5199n0> kVar2 = m0Var2.f17275f;
        C4921p pVar = new C4921p(i0, 1);
        C6809w wVar = (C6809w) kVar2.f20991b;
        wVar.getClass();
        C6809w.C6810a b = C6809w.m16064b();
        b.f21064a = wVar.f21063a.obtainMessage(1, 1036, 0, pVar);
        b.mo23023a();
        mo20374U();
        Surface surface = this.f16333u;
        if (surface != null) {
            surface.release();
            this.f16333u = null;
        }
        this.f16310G = Collections.emptyList();
    }

    /* renamed from: U */
    public final void mo20374U() {
        if (this.f16335w != null) {
            C4943v0 P = this.f16316d.mo20436P(this.f16318f);
            C17875h.m44304o(!P.f16720g);
            P.f16717d = 10000;
            C17875h.m44304o(!P.f16720g);
            P.f16718e = null;
            P.mo20613c();
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f16335w;
            sphericalGLSurfaceView.f14643b.remove(this.f16317e);
            this.f16335w = null;
        }
        TextureView textureView = this.f16337y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() == this.f16317e) {
                this.f16337y.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f16337y = null;
        }
        SurfaceHolder surfaceHolder = this.f16334v;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f16317e);
            this.f16334v = null;
        }
    }

    /* renamed from: V */
    public final void mo20375V(int i, int i2, Object obj) {
        for (C4949x0 x0Var : this.f16314b) {
            if (x0Var.mo15822m() == i) {
                C4943v0 P = this.f16316d.mo20436P(x0Var);
                C17875h.m44304o(!P.f16720g);
                P.f16717d = i2;
                C17875h.m44304o(!P.f16720g);
                P.f16718e = obj;
                P.mo20613c();
            }
        }
    }

    /* renamed from: W */
    public final void mo20376W(SurfaceHolder surfaceHolder) {
        this.f16336x = false;
        this.f16334v = surfaceHolder;
        surfaceHolder.addCallback(this.f16317e);
        Surface surface = this.f16334v.getSurface();
        if (surface == null || !surface.isValid()) {
            mo20372S(0, 0);
            return;
        }
        Rect surfaceFrame = this.f16334v.getSurfaceFrame();
        mo20372S(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: X */
    public final void mo20377X(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (C4949x0 x0Var : this.f16314b) {
            if (x0Var.mo15822m() == 2) {
                C4943v0 P = this.f16316d.mo20436P(x0Var);
                C17875h.m44304o(!P.f16720g);
                P.f16717d = 1;
                C17875h.m44304o(!P.f16720g);
                P.f16718e = obj;
                P.mo20613c();
                arrayList.add(P);
            }
        }
        Object obj2 = this.f16332t;
        if (!(obj2 == null || obj2 == obj)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C4943v0) it.next()).mo20611a(this.f16330r);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f16316d.mo20442X(new ExoPlaybackException(1, new ExoTimeoutException(3), (String) null, -1, (Format) null, 4, false));
            }
            Object obj3 = this.f16332t;
            Surface surface = this.f16333u;
            if (obj3 == surface) {
                surface.release();
                this.f16333u = null;
            }
        }
        this.f16332t = obj;
    }

    /* renamed from: Y */
    public final void mo20378Y(float f) {
        mo20383b0();
        float f2 = C6774a0.m15946f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.f16308E != f2) {
            this.f16308E = f2;
            mo20375V(1, 2, Float.valueOf(this.f16326n.f16367g * f2));
            this.f16324l.mo16510N(f2);
            Iterator<C5319f> it = this.f16320h.iterator();
            while (it.hasNext()) {
                it.next().mo16510N(f2);
            }
        }
    }

    @Deprecated
    /* renamed from: Z */
    public final void mo20379Z() {
        mo20383b0();
        this.f16326n.mo20434d(1, mo20407z());
        this.f16316d.mo20442X((ExoPlaybackException) null);
        this.f16310G = Collections.emptyList();
    }

    /* renamed from: a */
    public final void mo20380a(C4932s0 s0Var) {
        mo20383b0();
        this.f16316d.mo20380a(s0Var);
    }

    /* renamed from: a0 */
    public final void mo20381a0(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f16316d.mo20441W(i3, i2, z2);
    }

    /* renamed from: b */
    public final C4932s0 mo20382b() {
        mo20383b0();
        return this.f16316d.f16372B.f16688n;
    }

    /* renamed from: b0 */
    public final void mo20383b0() {
        IllegalStateException illegalStateException;
        C21060a aVar = this.f16315c;
        synchronized (aVar) {
            boolean z = false;
            while (!aVar.f52862b) {
                try {
                    aVar.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f16316d.f16389p.getThread()) {
            String j = C6774a0.m15950j("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f16316d.f16389p.getThread().getName());
            if (!this.f16311H) {
                if (this.f16312I) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                C6776b0.m15968a(j, illegalStateException);
                this.f16312I = true;
                return;
            }
            throw new IllegalStateException(j);
        }
    }

    /* renamed from: c */
    public final void mo20384c() {
        mo20383b0();
        boolean z = mo20407z();
        int i = 2;
        int d = this.f16326n.mo20434d(2, z);
        if (!z || d == 1) {
            i = 1;
        }
        mo20381a0(d, i, z);
        this.f16316d.mo20384c();
    }

    /* renamed from: d */
    public final boolean mo20385d() {
        mo20383b0();
        return this.f16316d.mo20385d();
    }

    /* renamed from: e */
    public final long mo20386e() {
        mo20383b0();
        return this.f16316d.mo20386e();
    }

    /* renamed from: f */
    public final C6506f mo20387f() {
        mo20383b0();
        return this.f16316d.f16378e;
    }

    @Deprecated
    /* renamed from: g */
    public final void mo20388g(C4936u0.C4938b bVar) {
        bVar.getClass();
        this.f16316d.mo20388g(bVar);
    }

    public final long getCurrentPosition() {
        mo20383b0();
        return this.f16316d.getCurrentPosition();
    }

    public final long getDuration() {
        mo20383b0();
        return this.f16316d.getDuration();
    }

    /* renamed from: h */
    public final List<Metadata> mo20391h() {
        mo20383b0();
        return this.f16316d.f16372B.f16684j;
    }

    /* renamed from: j */
    public final void mo20392j(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        mo20383b0();
        if (surfaceView instanceof C6940f) {
            mo20374U();
            mo20377X(surfaceView);
            mo20376W(surfaceView.getHolder());
        } else if (surfaceView instanceof SphericalGLSurfaceView) {
            mo20374U();
            this.f16335w = (SphericalGLSurfaceView) surfaceView;
            C4943v0 P = this.f16316d.mo20436P(this.f16318f);
            C17875h.m44304o(!P.f16720g);
            P.f16717d = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f16335w;
            C17875h.m44304o(true ^ P.f16720g);
            P.f16718e = sphericalGLSurfaceView;
            P.mo20613c();
            this.f16335w.f14643b.add(this.f16317e);
            mo20377X(this.f16335w.getVideoSurface());
            mo20376W(surfaceView.getHolder());
        } else {
            if (surfaceView == null) {
                surfaceHolder = null;
            } else {
                surfaceHolder = surfaceView.getHolder();
            }
            mo20383b0();
            if (surfaceHolder == null) {
                mo20371Q();
                return;
            }
            mo20374U();
            this.f16336x = true;
            this.f16334v = surfaceHolder;
            surfaceHolder.addCallback(this.f16317e);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                mo20377X((Object) null);
                mo20372S(0, 0);
                return;
            }
            mo20377X(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            mo20372S(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* renamed from: k */
    public final int mo20393k() {
        mo20383b0();
        return this.f16316d.mo20393k();
    }

    /* renamed from: l */
    public final ExoPlaybackException mo20394l() {
        mo20383b0();
        return this.f16316d.f16372B.f16680f;
    }

    /* renamed from: m */
    public final void mo20395m(boolean z) {
        mo20383b0();
        int d = this.f16326n.mo20434d(mo20364H(), z);
        int i = 1;
        if (z && d != 1) {
            i = 2;
        }
        mo20381a0(d, i, z);
    }

    /* renamed from: n */
    public final List<C5332a> mo20396n() {
        mo20383b0();
        return this.f16310G;
    }

    /* renamed from: o */
    public final int mo20397o() {
        mo20383b0();
        return this.f16316d.mo20397o();
    }

    /* renamed from: q */
    public final int mo20398q() {
        mo20383b0();
        return this.f16316d.f16372B.f16687m;
    }

    /* renamed from: r */
    public final TrackGroupArray mo20399r() {
        mo20383b0();
        return this.f16316d.f16372B.f16682h;
    }

    /* renamed from: s */
    public final C4879e1 mo20400s() {
        mo20383b0();
        return this.f16316d.f16372B.f16675a;
    }

    /* renamed from: t */
    public final Looper mo20401t() {
        return this.f16316d.f16389p;
    }

    /* renamed from: u */
    public final void mo20402u(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        mo20383b0();
        if (textureView == null) {
            mo20371Q();
            return;
        }
        mo20374U();
        this.f16337y = textureView;
        textureView.getSurfaceTextureListener();
        textureView.setSurfaceTextureListener(this.f16317e);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            mo20377X((Object) null);
            mo20372S(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        mo20377X(surface);
        this.f16333u = surface;
        mo20372S(textureView.getWidth(), textureView.getHeight());
    }

    /* renamed from: v */
    public final C6505e mo20403v() {
        mo20383b0();
        return this.f16316d.mo20403v();
    }

    @Deprecated
    /* renamed from: w */
    public final void mo20404w(C4936u0.C4938b bVar) {
        this.f16316d.mo20404w(bVar);
    }

    /* renamed from: x */
    public final void mo20405x(int i, long j) {
        mo20383b0();
        C5196m0 m0Var = this.f16324l;
        if (!m0Var.f17277h) {
            C5199n0.C5200a i0 = m0Var.mo20913i0();
            m0Var.f17277h = true;
            m0Var.mo20918n0(i0, -1, new C5209w(i0, 0));
        }
        this.f16316d.mo20405x(i, j);
    }

    /* renamed from: y */
    public final void mo20406y(C4936u0.C4940d dVar) {
        dVar.getClass();
        this.f16320h.remove(dVar);
        this.f16319g.remove(dVar);
        this.f16321i.remove(dVar);
        this.f16322j.remove(dVar);
        this.f16323k.remove(dVar);
        mo20404w(dVar);
    }

    /* renamed from: z */
    public final boolean mo20407z() {
        mo20383b0();
        return this.f16316d.f16372B.f16686l;
    }
}
