package com.umo.ads.p348o;

import ac0.C7557a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.C0441n1;
import androidx.core.widget.C0794g;
import bf0.C21050d;
import ce0.C21100e;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.load.engine.GlideException;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineVideoPlayMode;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKVideoAdActivity;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.p052ui.PlayerView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.umo.ads.p347l.zze;
import com.umo.ads.p350u.zzk;
import com.umo.ads.p350u.zzt;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ff0.C23349c;
import gc0.C12728d;
import gc0.C12729e;
import gc0.C12730f;
import gf0.C23413c;
import hc0.C12757d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jc0.C12804b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.C24179b;
import lf0.C24240p;
import mf0.C24362h;
import nc0.C12950a;
import nc0.C12954d;
import p026b7.C1498c;
import p026b7.C1499d;
import p026b7.C1502g;
import p043ch.qos.logback.classic.Logger;
import p060d6.C4385f;
import p099ga.C4865c1;
import p099ga.C4901j0;
import p099ga.C4910k0;
import p099ga.C4932s0;
import p099ga.C4936u0;
import p145k5.C5490i;
import p252sb.C6505e;
import p260t6.C6595a;
import p260t6.C6601f;
import p260t6.C6602g;
import p304x.C7029b1;
import p389bl.C13637c;
import p584jl.C17885a;
import uh0.C25080g;
import vb0.C13197a;
import vb0.C13199c;
import wb0.C13233c;
import wh0.C25177g;
import wh0.C25184i0;
import wh0.C25203o1;
import wh0.C25235z;

/* renamed from: com.umo.ads.o.zzc */
public final class zzc implements C4936u0.C4938b, C12804b.C12805a, zze.C12092a {

    /* renamed from: A */
    public RelativeLayout f30833A;

    /* renamed from: B */
    public ImageView f30834B;

    /* renamed from: C */
    public LinearLayout f30835C;

    /* renamed from: D */
    public TextView f30836D;

    /* renamed from: E */
    public TextView f30837E;

    /* renamed from: F */
    public TextView f30838F;

    /* renamed from: G */
    public AppCompatButton f30839G;

    /* renamed from: H */
    public final int f30840H = 5;

    /* renamed from: I */
    public final String f30841I = "#000000";

    /* renamed from: J */
    public final String f30842J = "#000000";

    /* renamed from: K */
    public final String f30843K = "#FFFFFF";

    /* renamed from: L */
    public final String f30844L = "14";

    /* renamed from: M */
    public String f30845M = "";

    /* renamed from: b */
    public final zzt f30846b;

    /* renamed from: c */
    public final C12093a f30847c;

    /* renamed from: d */
    public Context f30848d;

    /* renamed from: e */
    public ViewGroup f30849e;

    /* renamed from: f */
    public final int f30850f = 1;

    /* renamed from: g */
    public int f30851g;

    /* renamed from: h */
    public volatile int f30852h;

    /* renamed from: i */
    public long f30853i;

    /* renamed from: j */
    public boolean f30854j;

    /* renamed from: k */
    public boolean f30855k;

    /* renamed from: l */
    public int f30856l;

    /* renamed from: m */
    public PlayerView f30857m;

    /* renamed from: n */
    public C4865c1 f30858n;

    /* renamed from: o */
    public C25203o1 f30859o;

    /* renamed from: p */
    public List<Integer> f30860p = new ArrayList();

    /* renamed from: q */
    public FrameLayout f30861q;

    /* renamed from: r */
    public RelativeLayout f30862r;

    /* renamed from: s */
    public ImageView f30863s;

    /* renamed from: t */
    public ImageView f30864t;

    /* renamed from: u */
    public ImageView f30865u;

    /* renamed from: v */
    public float f30866v;

    /* renamed from: w */
    public C12804b f30867w;

    /* renamed from: x */
    public com.umo.ads.p347l.zze f30868x;

    /* renamed from: y */
    public boolean f30869y;

    /* renamed from: z */
    public FrameLayout f30870z;

    /* renamed from: com.umo.ads.o.zzc$a */
    public interface C12093a {
    }

    /* renamed from: com.umo.ads.o.zzc$b */
    public /* synthetic */ class C12094b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30871a;

        static {
            int[] iArr = new int[UMOAdKitInlineVideoPlayMode.values().length];
            iArr[UMOAdKitInlineVideoPlayMode.AUTOPLAY_AUDIO_ON.ordinal()] = 1;
            iArr[UMOAdKitInlineVideoPlayMode.AUTOPLAY_AUDIO_OFF.ordinal()] = 2;
            iArr[UMOAdKitInlineVideoPlayMode.NONE.ordinal()] = 3;
            iArr[UMOAdKitInlineVideoPlayMode.CLICKTOPLAY_AUDIO_ON.ordinal()] = 4;
            iArr[UMOAdKitInlineVideoPlayMode.CLICKTOPLAY_AUDIO_OFF.ordinal()] = 5;
            f30871a = iArr;
        }
    }

    /* renamed from: com.umo.ads.o.zzc$c */
    public static final class C12095c implements C6601f<Object> {

        /* renamed from: b */
        public final /* synthetic */ zzc f30872b;

        public C12095c(zzc zzc) {
            this.f30872b = zzc;
        }

        /* renamed from: f */
        public final boolean mo22747f(GlideException glideException, Object obj) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Loading Image Failed");
            J0.append(this.f30872b.f30845M);
            J0.append(": ");
            J0.append(obj);
            J0.append("...");
            logger.mo6667d(J0.toString());
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
            r3 = r2.f30872b;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo22748g(java.lang.Object r3, java.lang.Object r4, p273u6.C6720j r5) {
            /*
                r2 = this;
                ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
                java.lang.String r0 = "VIDEO_PLAYER: Loading Image Success"
                java.lang.StringBuilder r0 = ce0.C21100e.m49315J0(r0)
                com.umo.ads.o.zzc r1 = r2.f30872b
                java.lang.String r1 = r1.f30845M
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "..."
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.mo6666c(r4)
                com.umo.ads.o.zzc r3 = r2.f30872b
                android.widget.ImageView r3 = r3.f30834B
                boolean r3 = mf0.C24362h.m61206a(r5, r3)
                if (r3 == 0) goto L_0x0065
                com.umo.ads.o.zzc r3 = r2.f30872b
                com.umo.ads.o.zzc$a r4 = r3.f30847c
                if (r4 != 0) goto L_0x0034
                goto L_0x0065
            L_0x0034:
                com.umo.ads.u.zzt r3 = r3.f30846b
                java.lang.String r3 = r3.f30885b
                hc0.d r4 = (hc0.C12757d) r4
                java.lang.String r5 = "spotId"
                mf0.C24362h.m61211f(r3, r5)
                ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
                boolean r0 = nc0.C12954d.m32800c(r3)
                if (r0 == 0) goto L_0x004c
                java.lang.String r0 = p584jl.C17885a.m44403H0(r3)
                goto L_0x004e
            L_0x004c:
                java.lang.String r0 = ""
            L_0x004e:
                java.lang.String r1 = "VIDEO_PLAYER_CALLBACK: onVideoThumbnailLoaded"
                java.lang.String r0 = mf0.C24362h.m61216k(r0, r1)
                r5.mo6666c(r0)
                boolean r5 = r4.mo39612c()
                if (r5 == 0) goto L_0x0065
                vb0.a r4 = r4.f31522c
                if (r4 != 0) goto L_0x0062
                goto L_0x0065
            L_0x0062:
                r4.zzw(r3)
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p348o.zzc.C12095c.mo22748g(java.lang.Object, java.lang.Object, u6.j):void");
        }
    }

    @C23413c(mo58554c = "com.cubic.umo.ad.playback.players.AKVideoPlayer", mo58555f = "AKVideoPlayer.kt", mo58556l = {715, 725}, mo58557m = "handleVideoPlayProgress")
    /* renamed from: com.umo.ads.o.zzc$zzc  reason: collision with other inner class name */
    public static final class C26272zzc extends ContinuationImpl {
        public zzc zza;
        public Serializable zzb;
        public Ref$LongRef zzc;
        public /* synthetic */ Object zzd;
        public final /* synthetic */ zzc zze;
        public int zzf;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26272zzc(zzc zzc2, C23349c<? super C26272zzc> cVar) {
            super(cVar);
            this.zze = zzc2;
        }

        public final Object invokeSuspend(Object obj) {
            this.zzd = obj;
            this.zzf |= Integer.MIN_VALUE;
            return this.zze.mo35808e(this);
        }
    }

    @C23413c(mo58554c = "com.cubic.umo.ad.playback.players.AKVideoPlayer$handleVideoPlayProgress$2", mo58555f = "AKVideoPlayer.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    /* renamed from: com.umo.ads.o.zzc$zzd */
    public static final class zzd extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
        public final /* synthetic */ Ref$BooleanRef zza;
        public final /* synthetic */ zzc zzb;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zzd(Ref$BooleanRef ref$BooleanRef, zzc zzc, C23349c<? super zzd> cVar) {
            super(2, cVar);
            this.zza = ref$BooleanRef;
            this.zzb = zzc;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            return new zzd(this.zza, this.zzb, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((zzd) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C17885a.m44475z0(obj);
            this.zza.element = this.zzb.mo35798F();
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.cubic.umo.ad.playback.players.AKVideoPlayer$handleVideoPlayProgress$3", mo58555f = "AKVideoPlayer.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    /* renamed from: com.umo.ads.o.zzc$zze */
    public static final class zze extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
        public final /* synthetic */ Ref$LongRef zza;
        public final /* synthetic */ zzc zzb;
        public final /* synthetic */ Ref$LongRef zzc;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zze(Ref$LongRef ref$LongRef, zzc zzc2, Ref$LongRef ref$LongRef2, C23349c<? super zze> cVar) {
            super(2, cVar);
            this.zza = ref$LongRef;
            this.zzb = zzc2;
            this.zzc = ref$LongRef2;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            return new zze(this.zza, this.zzb, this.zzc, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((zze) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C17885a.m44475z0(obj);
            Ref$LongRef ref$LongRef = this.zza;
            C4865c1 c1Var = this.zzb.f30858n;
            long j2 = 0;
            if (c1Var == null) {
                j = 0;
            } else {
                j = c1Var.getDuration();
            }
            ref$LongRef.element = j;
            Ref$LongRef ref$LongRef2 = this.zzc;
            C4865c1 c1Var2 = this.zzb.f30858n;
            if (c1Var2 != null) {
                j2 = c1Var2.getCurrentPosition();
            }
            ref$LongRef2.element = j2;
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.cubic.umo.ad.playback.players.AKVideoPlayer$startPlayProgressTracker$1", mo58555f = "AKVideoPlayer.kt", mo58556l = {693, 695, 699}, mo58557m = "invokeSuspend")
    /* renamed from: com.umo.ads.o.zzc$zzg */
    public static final class zzg extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
        public Ref$BooleanRef zza;
        public int zzb;
        public final /* synthetic */ zzc zzc;
        public final /* synthetic */ long zzd;

        @C23413c(mo58554c = "com.cubic.umo.ad.playback.players.AKVideoPlayer$startPlayProgressTracker$1$1", mo58555f = "AKVideoPlayer.kt", mo58556l = {}, mo58557m = "invokeSuspend")
        /* renamed from: com.umo.ads.o.zzc$zzg$zza */
        public static final class zza extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
            public final /* synthetic */ Ref$BooleanRef zza;
            public final /* synthetic */ zzc zzb;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public zza(Ref$BooleanRef ref$BooleanRef, zzc zzc, C23349c<? super zza> cVar) {
                super(2, cVar);
                this.zza = ref$BooleanRef;
                this.zzb = zzc;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                return new zza(this.zza, this.zzb, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((zza) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C17885a.m44475z0(obj);
                this.zza.element = this.zzb.mo35798F();
                return C21050d.f52856a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zzg(zzc zzc2, long j, C23349c<? super zzg> cVar) {
            super(2, cVar);
            this.zzc = zzc2;
            this.zzd = j;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            return new zzg(this.zzc, this.zzd, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((zzg) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006d A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.zzb
                r2 = 1
                r3 = 2
                r4 = 3
                r5 = 0
                if (r1 == 0) goto L_0x0025
                if (r1 == r2) goto L_0x0020
                if (r1 == r3) goto L_0x0019
                if (r1 != r4) goto L_0x0011
                goto L_0x0025
            L_0x0011:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0019:
                kotlin.jvm.internal.Ref$BooleanRef r1 = r9.zza
                p584jl.C17885a.m44475z0(r10)
                r10 = r9
                goto L_0x0057
            L_0x0020:
                p584jl.C17885a.m44475z0(r10)
                r10 = r9
                goto L_0x0036
            L_0x0025:
                p584jl.C17885a.m44475z0(r10)
                r10 = r9
            L_0x0029:
                com.umo.ads.o.zzc r1 = r10.zzc
                r10.zza = r5
                r10.zzb = r2
                java.lang.Object r1 = r1.mo35808e(r10)
                if (r1 != r0) goto L_0x0036
                return r0
            L_0x0036:
                kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
                r1.<init>()
                ci0.b r6 = wh0.C25184i0.f63459a
                wh0.g1 r6 = bi0.C21073k.f52890a
                bi0.d r6 = p389bl.C13637c.m34064a(r6)
                kotlin.coroutines.CoroutineContext r6 = r6.f52870b
                com.umo.ads.o.zzc$zzg$zza r7 = new com.umo.ads.o.zzc$zzg$zza
                com.umo.ads.o.zzc r8 = r10.zzc
                r7.<init>(r1, r8, r5)
                r10.zza = r1
                r10.zzb = r3
                java.lang.Object r6 = wh0.C25177g.m63221e(r6, r7, r10)
                if (r6 != r0) goto L_0x0057
                return r0
            L_0x0057:
                com.umo.ads.o.zzc r6 = r10.zzc
                boolean r6 = r6.f30855k
                if (r6 != 0) goto L_0x0029
                boolean r1 = r1.element
                if (r1 == 0) goto L_0x0029
                long r6 = r10.zzd
                r10.zza = r5
                r10.zzb = r4
                java.lang.Object r1 = p845um.C19958a.m47431e(r6, r10)
                if (r1 != r0) goto L_0x0029
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p348o.zzc.zzg.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public zzc(zzt zzt, C12757d dVar) {
        this.f30846b = zzt;
        this.f30847c = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m32062t(android.widget.TextView r2, java.lang.String r3) {
        /*
            if (r3 != 0) goto L_0x0003
            goto L_0x0042
        L_0x0003:
            int r0 = r3.hashCode()
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            if (r0 == r1) goto L_0x002d
            r1 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r0 == r1) goto L_0x0022
            r1 = 1702544263(0x657ac387, float:7.4012404E22)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "bold|italic"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0020
            goto L_0x0035
        L_0x0020:
            r3 = 3
            goto L_0x0038
        L_0x0022:
            java.lang.String r0 = "bold"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x002b
            goto L_0x0035
        L_0x002b:
            r3 = 1
            goto L_0x0038
        L_0x002d:
            java.lang.String r0 = "italic"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 2
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            goto L_0x0042
        L_0x003b:
            android.graphics.Typeface r0 = r2.getTypeface()
            r2.setTypeface(r0, r3)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p348o.zzc.m32062t(android.widget.TextView, java.lang.String):void");
    }

    /* renamed from: A */
    public final void mo35793A(boolean z) {
        C12093a aVar;
        String str;
        C13233c.f32843b.post(new C0441n1(this, 15));
        mo35804O();
        if (z && (aVar = this.f30847c) != null) {
            String str2 = this.f30846b.f30885b;
            C12757d dVar = (C12757d) aVar;
            C24362h.m61211f(str2, "spotId");
            Logger logger = C7557a.f23040a;
            if (C12954d.m32800c(str2)) {
                str = C17885a.m44403H0(str2);
            } else {
                str = "";
            }
            logger.mo6666c(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoStopped"));
            if (dVar.mo39612c()) {
                C13197a aVar2 = dVar.f31522c;
                if (aVar2 != null) {
                    aVar2.mo39552D(str2);
                }
            } else {
                dVar.mo39610a(zzk.BROADCAST_ACTION_AD_PLAYBACK_STOPPED, (String) null);
                C12757d.C12758a aVar3 = dVar.f31521b;
                if (aVar3 != null) {
                    ((AKVideoAdActivity) aVar3).mo11143b1(str2);
                }
            }
        }
        mo35816r(true);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<java.lang.Integer>, java.util.ArrayList] */
    /* renamed from: B */
    public final void mo35794B() {
        ViewParent parent;
        Handler handler = C13233c.f32843b;
        handler.post(new C7029b1(this, 13));
        if (this.f30869y) {
            mo35802J();
            mo35818x(true);
            ImageView imageView = this.f30863s;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            handler.post(new C5490i(2, this, false));
            C4865c1 c1Var = this.f30858n;
            if (c1Var != null) {
                c1Var.mo20395m(false);
            }
            C4865c1 c1Var2 = this.f30858n;
            if (c1Var2 != null) {
                c1Var2.mo20405x(c1Var2.mo20393k(), 0);
            }
            C12093a aVar = this.f30847c;
            if (aVar != null) {
                ((C12757d) aVar).mo39611b(this.f30846b.f30885b);
            }
            this.f30852h = 0;
            this.f30853i = 0;
            this.f30854j = false;
            this.f30860p.clear();
            return;
        }
        RelativeLayout relativeLayout = this.f30862r;
        if (!(relativeLayout == null || (parent = relativeLayout.getParent()) == null)) {
            ((ViewGroup) parent).removeView(relativeLayout);
        }
        C12093a aVar2 = this.f30847c;
        if (aVar2 != null) {
            ((C12757d) aVar2).mo39611b(this.f30846b.f30885b);
        }
        mo35816r(true);
    }

    /* renamed from: C */
    public final boolean mo35795C() {
        int i = C12094b.f30871a[this.f30846b.f30888e.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
            if (i != 4) {
                if (i == 5) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    /* renamed from: D */
    public final boolean mo35796D() {
        int i = C12094b.f30871a[this.f30846b.f30888e.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: E */
    public final boolean mo35797E() {
        if (this.f30846b.f30889f == com.umo.ads.p350u.zzc.INLINE) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean mo35798F() {
        C4865c1 c1Var = this.f30858n;
        if (c1Var == null || c1Var.mo20364H() == 4 || c1Var.mo20364H() == 1 || !c1Var.mo20407z()) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final void mo35799G() {
        String str;
        RelativeLayout relativeLayout;
        this.f30867w = null;
        ImageView imageView = this.f30865u;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f30864t;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        PlayerView playerView = this.f30857m;
        if (!(playerView == null || (relativeLayout = this.f30833A) == null)) {
            relativeLayout.addView(playerView);
        }
        RelativeLayout relativeLayout2 = this.f30862r;
        if (relativeLayout2 != null) {
            relativeLayout2.bringToFront();
        }
        if (mo35795C()) {
            mo35800H();
        }
        C12093a aVar = this.f30847c;
        if (aVar != null) {
            String str2 = this.f30846b.f30885b;
            C12757d dVar = (C12757d) aVar;
            C24362h.m61211f(str2, "spotId");
            Logger logger = C7557a.f23040a;
            if (C12954d.m32800c(str2)) {
                str = C17885a.m44403H0(str2);
            } else {
                str = "";
            }
            logger.mo6666c(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoMinimized"));
            C13199c cVar = dVar.f31523d;
            if (cVar != null) {
                cVar.mo39571o(str2);
            }
        }
    }

    /* renamed from: H */
    public final void mo35800H() {
        float f;
        C4865c1 c1Var = this.f30858n;
        if (c1Var == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = c1Var.f16308E;
        }
        this.f30866v = f;
        if (c1Var != null) {
            c1Var.mo20378Y(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: I */
    public final boolean mo35801I() {
        String str;
        boolean z;
        String str2 = this.f30846b.f30885b;
        if (C12954d.m32800c(str2)) {
            str = C17885a.m44403H0(str2);
        } else {
            str = "";
        }
        this.f30845M = str;
        Context context = C13233c.f32842a;
        ViewGroup c = C13233c.m33334c(this.f30846b.f30885b);
        this.f30849e = c;
        if (c == null) {
            C7557a.f23040a.mo6667d(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER: Invalid Video Container"));
            return false;
        }
        Context context2 = c.getContext();
        C24362h.m61210e(context2, "containerView!!.context");
        this.f30848d = context2;
        zzt zzt = this.f30846b;
        this.f30851g = zzt.f30887d;
        if (zzt.f30890g != null) {
            z = true;
        } else {
            z = false;
        }
        this.f30869y = z;
        C13233c.f32843b.post(new C12728d(this, 0));
        return true;
    }

    /* renamed from: J */
    public final void mo35802J() {
        ViewParent parent;
        PlayerView playerView = this.f30857m;
        if (playerView != null && (parent = playerView.getParent()) != null) {
            ((ViewGroup) parent).removeView(playerView);
        }
    }

    /* renamed from: K */
    public final void mo16423K(ExoPlaybackException exoPlaybackException) {
        boolean z;
        C24362h.m61211f(exoPlaybackException, "error");
        this.f30855k = true;
        int i = exoPlaybackException.type;
        if (i == 0) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER_ERROR: TYPE_SOURCE: ");
            J0.append(exoPlaybackException.mo15795c().getMessage());
            J0.append(this.f30845M);
            logger.mo6667d(J0.toString());
            Context context = this.f30848d;
            Throwable th = null;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                if (systemService != null) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C7557a.f23040a.mo6667d(C13233c.m33333b().getString(C1502g.umoak_no_network_connection));
                        mo35811k(com.umo.ads.p342c.zzd.AD_CREATIVE_TIMED_OUT, true);
                        return;
                    }
                    Throwable cause = exoPlaybackException.getCause();
                    if (cause != null) {
                        th = cause.getCause();
                    }
                    if (C24179b.m60559G(String.valueOf(th), "UnknownHostException", false)) {
                        mo35811k(com.umo.ads.p342c.zzd.AD_CREATIVE_TIMED_OUT, true);
                        return;
                    } else if (C24362h.m61206a(exoPlaybackException.mo15795c().getMessage(), "Unable to connect")) {
                        mo35811k(com.umo.ads.p342c.zzd.AD_CREATIVE_NOT_FOUND, false);
                        return;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
                }
            } else {
                C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                throw null;
            }
        } else if (i == 1) {
            Logger logger2 = C7557a.f23040a;
            StringBuilder J02 = C21100e.m49315J0("VIDEO_PLAYER_ERROR: TYPE_RENDERER: ");
            J02.append(exoPlaybackException.mo15794b().getMessage());
            J02.append(this.f30845M);
            logger2.mo6667d(J02.toString());
        } else if (i == 2) {
            Logger logger3 = C7557a.f23040a;
            StringBuilder J03 = C21100e.m49315J0("VIDEO_PLAYER_ERROR: TYPE_UNEXPECTED: ");
            J03.append(exoPlaybackException.mo15796d().getMessage());
            J03.append(this.f30845M);
            logger3.mo6667d(J03.toString());
        } else if (i == 3) {
            Logger logger4 = C7557a.f23040a;
            StringBuilder J04 = C21100e.m49315J0("VIDEO_PLAYER_ERROR: TYPE_REMOTE: ");
            J04.append(exoPlaybackException.getMessage());
            J04.append(this.f30845M);
            logger4.mo6667d(J04.toString());
        }
        mo35811k(com.umo.ads.p342c.zzd.AD_CREATIVE_DISPLAY_ERROR, false);
    }

    /* renamed from: L */
    public final /* synthetic */ void mo16424L(boolean z) {
    }

    /* renamed from: M */
    public final /* synthetic */ void mo16425M(int i, boolean z) {
    }

    /* renamed from: N */
    public final void mo35803N() {
        if (this.f30859o != null) {
            C7557a.f23040a.mo6666c(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER: Play Progress Tracker already running"));
            return;
        }
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Starting Play Progress Tracker");
        J0.append(this.f30845M);
        J0.append("...");
        logger.mo6672i(J0.toString());
        this.f30859o = C25177g.m63218b(C13637c.m34064a(C25184i0.f63460b), (CoroutineContext) null, new zzg(this, ((long) this.f30850f) * 1000, (C23349c<? super zzg>) null), 3);
    }

    /* renamed from: O */
    public final void mo35804O() {
        if (this.f30859o != null) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Stopping Play Progress Tracker");
            J0.append(this.f30845M);
            J0.append("...");
            logger.mo6672i(J0.toString());
            C25203o1 o1Var = this.f30859o;
            if (o1Var != null) {
                o1Var.mo61776a((CancellationException) null);
            }
            this.f30859o = null;
        }
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

    /* renamed from: X */
    public final /* synthetic */ void mo16430X() {
    }

    /* renamed from: Z */
    public final /* synthetic */ void mo16431Z(int i, boolean z) {
    }

    /* renamed from: a */
    public final void mo35805a() {
        C7557a.f23040a.mo6666c(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER_FULLSCREEN_DIALOG: onBackPressed()"));
        mo35802J();
        mo35799G();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo16433b() {
    }

    /* renamed from: b0 */
    public final /* synthetic */ void mo16434b0(C4932s0 s0Var) {
    }

    /* renamed from: c */
    public final void mo35806c(C12804b bVar) {
        C7557a.f23040a.mo6666c(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER_FULLSCREEN_DIALOG: onCloseIconClicked()"));
        bVar.dismiss();
        mo35802J();
        mo35799G();
    }

    /* renamed from: d */
    public final GradientDrawable mo35807d(String str, String str2, String str3) {
        Integer num;
        int i;
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (str2 == null) {
            num = null;
        } else {
            int i2 = this.f30840H;
            Integer y = C25080g.m62829y(str2);
            if (y == null) {
                Float x = C25080g.m62828x(str2);
                if (x != null) {
                    i2 = (int) x.floatValue();
                }
            } else {
                i2 = y.intValue();
            }
            num = Integer.valueOf(i2);
        }
        if (num == null) {
            i = this.f30840H;
        } else {
            i = num.intValue();
        }
        String str4 = this.f30841I;
        C24362h.m61211f(str4, "defaultColor");
        int parseColor = Color.parseColor(str4);
        if (C12954d.m32800c(str)) {
            try {
                parseColor = Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                Logger logger = C7557a.f23040a;
                Logger logger2 = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("IllegalArgumentException while parsing Color Value (Exception: ");
                J0.append(e.getLocalizedMessage());
                J0.append(')');
                logger2.mo6667d(J0.toString());
            }
        }
        gradientDrawable.setStroke(i, parseColor);
        String str5 = this.f30843K;
        C24362h.m61211f(str5, "defaultColor");
        int parseColor2 = Color.parseColor(str5);
        if (C12954d.m32800c(str3)) {
            try {
                parseColor2 = Color.parseColor(str3);
            } catch (IllegalArgumentException e2) {
                Logger logger3 = C7557a.f23040a;
                Logger logger4 = C7557a.f23040a;
                StringBuilder J02 = C21100e.m49315J0("IllegalArgumentException while parsing Color Value (Exception: ");
                J02.append(e2.getLocalizedMessage());
                J02.append(')');
                logger4.mo6667d(J02.toString());
            }
        }
        gradientDrawable.setColor(parseColor2);
        return gradientDrawable;
    }

    /* renamed from: d0 */
    public final /* synthetic */ void mo16437d0(C4936u0.C4939c cVar) {
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<java.lang.Integer>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.List<java.lang.Integer>, java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35808e(ff0.C23349c<? super bf0.C21050d> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1 instanceof com.umo.ads.p348o.zzc.C26272zzc
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.umo.ads.o.zzc$zzc r2 = (com.umo.ads.p348o.zzc.C26272zzc) r2
            int r3 = r2.zzf
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.zzf = r3
            goto L_0x001c
        L_0x0017:
            com.umo.ads.o.zzc$zzc r2 = new com.umo.ads.o.zzc$zzc
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.zzd
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.zzf
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x004a
            if (r4 == r7) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            kotlin.jvm.internal.Ref$LongRef r3 = r2.zzc
            java.io.Serializable r4 = r2.zzb
            kotlin.jvm.internal.Ref$LongRef r4 = (kotlin.jvm.internal.Ref$LongRef) r4
            com.umo.ads.o.zzc r2 = r2.zza
            p584jl.C17885a.m44475z0(r1)
            goto L_0x00a8
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            java.io.Serializable r4 = r2.zzb
            kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref$BooleanRef) r4
            com.umo.ads.o.zzc r8 = r2.zza
            p584jl.C17885a.m44475z0(r1)
            goto L_0x006f
        L_0x004a:
            p584jl.C17885a.m44475z0(r1)
            kotlin.jvm.internal.Ref$BooleanRef r4 = new kotlin.jvm.internal.Ref$BooleanRef
            r4.<init>()
            ci0.b r1 = wh0.C25184i0.f63459a
            wh0.g1 r1 = bi0.C21073k.f52890a
            bi0.d r1 = p389bl.C13637c.m34064a(r1)
            kotlin.coroutines.CoroutineContext r1 = r1.f52870b
            com.umo.ads.o.zzc$zzd r8 = new com.umo.ads.o.zzc$zzd
            r8.<init>(r4, r0, r6)
            r2.zza = r0
            r2.zzb = r4
            r2.zzf = r7
            java.lang.Object r1 = wh0.C25177g.m63221e(r1, r8, r2)
            if (r1 != r3) goto L_0x006e
            return r3
        L_0x006e:
            r8 = r0
        L_0x006f:
            boolean r1 = r8.f30855k
            if (r1 != 0) goto L_0x02cb
            boolean r1 = r4.element
            if (r1 != 0) goto L_0x0079
            goto L_0x02cb
        L_0x0079:
            int r1 = r8.f30852h
            int r1 = r1 + r7
            r8.f30852h = r1
            kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
            r4.<init>()
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            ci0.b r9 = wh0.C25184i0.f63459a
            wh0.g1 r9 = bi0.C21073k.f52890a
            bi0.d r9 = p389bl.C13637c.m34064a(r9)
            kotlin.coroutines.CoroutineContext r9 = r9.f52870b
            com.umo.ads.o.zzc$zze r10 = new com.umo.ads.o.zzc$zze
            r10.<init>(r4, r8, r1, r6)
            r2.zza = r8
            r2.zzb = r4
            r2.zzc = r1
            r2.zzf = r5
            java.lang.Object r2 = wh0.C25177g.m63221e(r9, r10, r2)
            if (r2 != r3) goto L_0x00a6
            return r3
        L_0x00a6:
            r3 = r1
            r2 = r8
        L_0x00a8:
            long r8 = r2.f30853i
            java.lang.String r1 = ""
            java.lang.String r5 = "spotId"
            r10 = 0
            r11 = 0
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0120
            long r8 = r3.element
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0120
            r2.mo35817v(r10)
            int r8 = r2.f30856l
            if (r8 <= 0) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            boolean r9 = r2.mo35796D()
            if (r9 == 0) goto L_0x00ce
            r2.mo35818x(r10)
        L_0x00ce:
            com.umo.ads.o.zzc$a r9 = r2.f30847c
            if (r9 != 0) goto L_0x00d3
            goto L_0x0107
        L_0x00d3:
            com.umo.ads.u.zzt r13 = r2.f30846b
            java.lang.String r13 = r13.f30885b
            hc0.d r9 = (hc0.C12757d) r9
            mf0.C24362h.m61211f(r13, r5)
            ch.qos.logback.classic.Logger r14 = ac0.C7557a.f23040a
            boolean r15 = nc0.C12954d.m32800c(r13)
            if (r15 == 0) goto L_0x00e9
            java.lang.String r15 = p584jl.C17885a.m44403H0(r13)
            goto L_0x00ea
        L_0x00e9:
            r15 = r1
        L_0x00ea:
            java.lang.String r7 = "VIDEO_PLAYER_CALLBACK: onVideoStarted"
            java.lang.String r7 = mf0.C24362h.m61216k(r15, r7)
            r14.mo6666c(r7)
            boolean r7 = r9.mo39612c()
            if (r7 == 0) goto L_0x0102
            vb0.a r6 = r9.f31522c
            if (r6 != 0) goto L_0x00fe
            goto L_0x0107
        L_0x00fe:
            r6.zzc(r13, r8)
            goto L_0x0107
        L_0x0102:
            com.umo.ads.u.zzk r7 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_PLAYBACK_STARTED
            r9.mo39610a(r7, r6)
        L_0x0107:
            ch.qos.logback.classic.Logger r6 = ac0.C7557a.f23040a
            java.lang.String r7 = r2.f30845M
            java.lang.String r8 = "VIDEO_PLAYER: Ad Video Started"
            java.lang.String r7 = mf0.C24362h.m61216k(r7, r8)
            r6.mo6672i(r7)
            android.os.Handler r6 = wb0.C13233c.f32843b
            gc0.e r7 = new gc0.e
            r7.<init>(r2, r10)
            r6.post(r7)
            r2.f30852h = r10
        L_0x0120:
            long r6 = r2.f30853i
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0148
            long r6 = r3.element
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0148
            int r6 = r2.f30852h
            int r7 = r2.f30851g
            if (r6 < r7) goto L_0x0148
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r3 = r2.f30845M
            java.lang.String r4 = "VIDEO_PLAYER: Ad Video Timed Out before play start"
            java.lang.String r3 = mf0.C24362h.m61216k(r3, r4)
            r1.mo6667d(r3)
            com.umo.ads.c.zzd r1 = com.umo.ads.p342c.zzd.AD_DISPLAY_TIMED_OUT
            r3 = 1
            r2.mo35811k(r1, r3)
            bf0.d r1 = bf0.C21050d.f52856a
            return r1
        L_0x0148:
            long r6 = r3.element
            float r6 = (float) r6
            long r7 = r4.element
            float r7 = (float) r7
            float r6 = r6 / r7
            r7 = 100
            float r7 = (float) r7
            float r6 = r6 * r7
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 != 0) goto L_0x02c8
            int r6 = p584jl.C17885a.m44459r0(r6)
            float r6 = (float) r6
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a
            java.lang.String r8 = "VIDEO_PLAYER: Duration (MilliSeconds): "
            java.lang.StringBuilder r8 = ce0.C21100e.m49315J0(r8)
            long r13 = r4.element
            r8.append(r13)
            java.lang.String r9 = ", Current Position: "
            r8.append(r9)
            long r13 = r3.element
            r8.append(r13)
            java.lang.String r9 = ", Current Position (Secs): "
            r8.append(r9)
            long r13 = r3.element
            r9 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r9
            long r13 = r13 / r10
            r8.append(r13)
            java.lang.String r9 = ", videoCountdownCount: "
            r8.append(r9)
            int r9 = r2.f30852h
            r8.append(r9)
            java.lang.String r9 = r2.f30845M
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.mo6666c(r8)
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a
            java.lang.String r8 = "VIDEO_PLAYER: Percent Completed"
            java.lang.StringBuilder r8 = ce0.C21100e.m49315J0(r8)
            java.lang.String r9 = r2.f30845M
            r8.append(r9)
            java.lang.String r9 = ": "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r7.mo6672i(r8)
            int r7 = r2.f30852h
            long r7 = (long) r7
            long r12 = r3.element
            long r18 = r12 / r10
            long r7 = r7 - r18
            r16 = 0
            int r14 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x01f9
            int r14 = r2.f30851g
            r18 = r1
            long r0 = (long) r14
            int r14 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x01fb
            long r0 = r2.f30853i
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x01fb
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "VIDEO_PLAYER: Ad Video Timed Out after play start"
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            java.lang.String r3 = r2.f30845M
            r1.append(r3)
            java.lang.String r3 = ": Diff: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.mo6667d(r1)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.AD_DISPLAY_TIMED_OUT
            r1 = 1
            r2.mo35811k(r0, r1)
            bf0.d r0 = bf0.C21050d.f52856a
            return r0
        L_0x01f9:
            r18 = r1
        L_0x01fb:
            r0 = 1117126656(0x42960000, float:75.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0204
            r0 = 75
            goto L_0x0217
        L_0x0204:
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x020d
            r0 = 50
            goto L_0x0217
        L_0x020d:
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0216
            r0 = 25
            goto L_0x0217
        L_0x0216:
            r0 = 0
        L_0x0217:
            java.util.List<java.lang.Integer> r1 = r2.f30860p
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            boolean r1 = r1.contains(r6)
            if (r1 != 0) goto L_0x0279
            java.util.List<java.lang.Integer> r1 = r2.f30860p
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            r1.add(r6)
            com.umo.ads.o.zzc$a r1 = r2.f30847c
            if (r1 != 0) goto L_0x0233
            goto L_0x0279
        L_0x0233:
            com.umo.ads.u.zzt r6 = r2.f30846b
            java.lang.String r6 = r6.f30885b
            hc0.d r1 = (hc0.C12757d) r1
            mf0.C24362h.m61211f(r6, r5)
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.String r7 = "VIDEO_PLAYER_CALLBACK: onVideoPlayProgress"
            java.lang.StringBuilder r7 = ce0.C21100e.m49315J0(r7)
            boolean r8 = nc0.C12954d.m32800c(r6)
            if (r8 == 0) goto L_0x024f
            java.lang.String r8 = p584jl.C17885a.m44403H0(r6)
            goto L_0x0251
        L_0x024f:
            r8 = r18
        L_0x0251:
            r7.append(r8)
            r7.append(r9)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r5.mo6666c(r7)
            boolean r5 = r1.mo39612c()
            if (r5 == 0) goto L_0x0270
            vb0.a r1 = r1.f31522c
            if (r1 != 0) goto L_0x026c
            goto L_0x0279
        L_0x026c:
            r1.zza(r0, r6)
            goto L_0x0279
        L_0x0270:
            com.umo.ads.u.zzk r5 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_PLAYBACK_PERCENT_UPDATE
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.mo39610a(r5, r0)
        L_0x0279:
            long r0 = r3.element
            long r5 = r2.f30853i
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0283
            r2.f30853i = r0
        L_0x0283:
            long r5 = r2.f30853i
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02c5
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x02c5
            int r0 = r2.f30852h
            long r0 = (long) r0
            long r3 = r4.element
            long r5 = r3 / r10
            r7 = 5
            long r7 = (long) r7
            long r5 = r5 + r7
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02c5
            r0 = 1
            r2.f30855k = r0
            long r0 = r2.f30853i
            long r3 = r3 - r0
            r0 = 1
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x02c5
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "VIDEO_PLAYER: Ad Video considered as COMPLETE as COMPLETED event not received from Video Player"
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            java.lang.String r3 = r2.f30845M
            r1.append(r3)
            r3 = 46
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo6666c(r1)
            r2.mo35794B()
        L_0x02c5:
            bf0.d r0 = bf0.C21050d.f52856a
            return r0
        L_0x02c8:
            bf0.d r0 = bf0.C21050d.f52856a
            return r0
        L_0x02cb:
            bf0.d r0 = bf0.C21050d.f52856a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p348o.zzc.mo35808e(ff0.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo35809f(RelativeLayout relativeLayout) {
        ViewParent parent;
        PlayerView playerView = this.f30857m;
        if (!(playerView == null || (parent = playerView.getParent()) == null)) {
            ((ViewGroup) parent).removeView(playerView);
        }
        if (relativeLayout != null) {
            relativeLayout.addView(this.f30857m);
        }
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
    public final void mo35810j(TextView textView, String str) {
        if (textView != null) {
            String str2 = this.f30842J;
            C24362h.m61211f(str2, "defaultColor");
            int parseColor = Color.parseColor(str2);
            if (C12954d.m32800c(str)) {
                try {
                    parseColor = Color.parseColor(str);
                } catch (IllegalArgumentException e) {
                    Logger logger = C7557a.f23040a;
                    Logger logger2 = C7557a.f23040a;
                    StringBuilder J0 = C21100e.m49315J0("IllegalArgumentException while parsing Color Value (Exception: ");
                    J0.append(e.getLocalizedMessage());
                    J0.append(')');
                    logger2.mo6667d(J0.toString());
                }
            }
            textView.setTextColor(parseColor);
        }
    }

    /* renamed from: k */
    public final void mo35811k(com.umo.ads.p342c.zzd zzd2, boolean z) {
        String str;
        Handler handler = C13233c.f32843b;
        handler.post(new C7029b1(this, 13));
        handler.post(new C5490i(2, this, false));
        mo35818x(true);
        mo35817v(false);
        this.f30855k = true;
        mo35793A(false);
        if (z) {
            C12093a aVar = this.f30847c;
            if (aVar != null) {
                String str2 = this.f30846b.f30885b;
                C12757d dVar = (C12757d) aVar;
                C24362h.m61211f(str2, "spotId");
                C24362h.m61211f(zzd2, "vastError");
                Logger logger = C7557a.f23040a;
                if (C12954d.m32800c(str2)) {
                    str = C17885a.m44403H0(str2);
                } else {
                    str = "";
                }
                logger.mo6667d(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoTimedOut"));
                if (dVar.mo39612c()) {
                    C13197a aVar2 = dVar.f31522c;
                    if (aVar2 != null) {
                        aVar2.mo39576t(str2, zzd2);
                        return;
                    }
                    return;
                }
                dVar.mo39610a(zzk.BROADCAST_ACTION_AD_PLAYBACK_TIMED_OUT, zzd2.name());
                C12757d.C12758a aVar3 = dVar.f31521b;
                if (aVar3 != null) {
                    ((AKVideoAdActivity) aVar3).mo11143b1(str2);
                    return;
                }
                return;
            }
            return;
        }
        C12093a aVar4 = this.f30847c;
        if (aVar4 != null) {
            ((C12757d) aVar4).mo39613d(this.f30846b.f30885b, zzd2);
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo16442l(int i) {
    }

    /* renamed from: m */
    public final void mo35812m(String str, ImageView imageView, Integer num) {
        C6602g gVar;
        if (!C12954d.m32800c(str)) {
            C7557a.f23040a.mo6667d(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER: Invalid Image Url for loading into ImageView"));
            return;
        }
        C6595a i = new C6602g().mo22726i(C4385f.f15420a);
        C24362h.m61210e(i, "RequestOptions().diskCac…gy(DiskCacheStrategy.ALL)");
        C6602g gVar2 = (C6602g) i;
        if (num == null) {
            gVar = null;
        } else {
            gVar = (C6602g) gVar2.mo22738w(num.intValue());
        }
        if (gVar == null) {
            C6602g gVar3 = (C6602g) gVar2.mo22739x((ColorDrawable) null);
        }
        if (imageView != null) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Loading Image");
            J0.append(this.f30845M);
            J0.append(": ");
            J0.append(str);
            J0.append("...");
            logger.mo6666c(J0.toString());
            Context context = this.f30848d;
            if (context != null) {
                C2116c.m5521c(context).mo22193f(context).mo10867f(new C12095c(this)).mo10868g(gVar2).mo10880p(str).mo10850T(imageView);
            } else {
                C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                throw null;
            }
        }
    }

    /* renamed from: n */
    public final void mo35813n(boolean z) {
        Integer num;
        C12093a aVar;
        String str;
        if (!this.f30854j) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Pausing Ad Video Playback");
            J0.append(this.f30845M);
            J0.append("...");
            logger.mo6672i(J0.toString());
            C4865c1 c1Var = this.f30858n;
            if (c1Var != null) {
                c1Var.mo20395m(false);
            }
            this.f30854j = true;
            Logger logger2 = C7557a.f23040a;
            StringBuilder J02 = C21100e.m49315J0("VIDEO_PLAYER: Ad Video Playback State after Pausing");
            J02.append(this.f30845M);
            J02.append(": ");
            C4865c1 c1Var2 = this.f30858n;
            if (c1Var2 == null) {
                num = null;
            } else {
                num = Integer.valueOf(c1Var2.mo20364H());
            }
            J02.append(num);
            logger2.mo6666c(J02.toString());
            if (z && (aVar = this.f30847c) != null) {
                String str2 = this.f30846b.f30885b;
                C12757d dVar = (C12757d) aVar;
                C24362h.m61211f(str2, "spotId");
                Logger logger3 = C7557a.f23040a;
                if (C12954d.m32800c(str2)) {
                    str = C17885a.m44403H0(str2);
                } else {
                    str = "";
                }
                logger3.mo6666c(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoPaused"));
                C13197a aVar2 = dVar.f31522c;
                if (aVar2 != null) {
                    aVar2.mo39563g(str2);
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo35814o(boolean z, boolean z2) {
        boolean z3;
        Integer num;
        C12093a aVar;
        String str;
        ImageView imageView = this.f30863s;
        if (imageView != null && imageView.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            if (this.f30854j || z) {
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Resuming Ad Video Playback");
                J0.append(this.f30845M);
                J0.append("...");
                logger.mo6672i(J0.toString());
                C4865c1 c1Var = this.f30858n;
                if (c1Var != null) {
                    c1Var.mo20395m(true);
                }
                this.f30854j = false;
                mo35803N();
                Logger logger2 = C7557a.f23040a;
                StringBuilder J02 = C21100e.m49315J0("VIDEO_PLAYER: Ad Video Playback State after Resuming");
                J02.append(this.f30845M);
                J02.append(": ");
                C4865c1 c1Var2 = this.f30858n;
                if (c1Var2 == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(c1Var2.mo20364H());
                }
                J02.append(num);
                logger2.mo6666c(J02.toString());
                if (z2 && (aVar = this.f30847c) != null) {
                    String str2 = this.f30846b.f30885b;
                    C12757d dVar = (C12757d) aVar;
                    C24362h.m61211f(str2, "spotId");
                    Logger logger3 = C7557a.f23040a;
                    if (C12954d.m32800c(str2)) {
                        str = C17885a.m44403H0(str2);
                    } else {
                        str = "";
                    }
                    logger3.mo6666c(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoResumed"));
                    C13197a aVar2 = dVar.f31522c;
                    if (aVar2 != null) {
                        aVar2.zzr(str2);
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void mo16444p(List list) {
    }

    /* renamed from: q */
    public final void mo35815q(TextView textView, String str) {
        if (C12954d.m32800c(str)) {
            if (textView != null) {
                try {
                    C24362h.m61208c(str);
                    textView.setTextSize(Float.parseFloat(str));
                    return;
                } catch (NumberFormatException e) {
                    Logger logger = C7557a.f23040a;
                    StringBuilder J0 = C21100e.m49315J0("NumberFormatException while parsing Text Size Value");
                    J0.append(this.f30845M);
                    J0.append(" (Exception: ");
                    J0.append(e.getLocalizedMessage());
                    J0.append(')');
                    logger.mo6667d(J0.toString());
                }
            } else {
                return;
            }
        }
        if (textView != null) {
            textView.setTextSize(Float.parseFloat(this.f30844L));
        }
    }

    /* renamed from: r */
    public final void mo35816r(boolean z) {
        if (mo35797E()) {
            com.umo.ads.p347l.zze zze2 = this.f30868x;
            if (zze2 != null) {
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("Unregistering Video Orientation Broadcast Receiver");
                J0.append(this.f30845M);
                J0.append("...");
                logger.mo6666c(J0.toString());
                zze2.f30826a.unregisterReceiver(zze2);
            }
            this.f30868x = null;
        }
        mo35804O();
        C13233c.f32843b.post(new C12730f(this, 0));
    }

    /* renamed from: s */
    public final /* synthetic */ void mo16445s(C4910k0 k0Var) {
    }

    /* renamed from: u */
    public final void mo16446u(int i) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Playback State Change");
        J0.append(this.f30845M);
        J0.append(": ");
        J0.append(i);
        logger.mo6672i(J0.toString());
        boolean z = true;
        if (i == 3) {
            C13233c.f32843b.post(new C12729e(this, 1));
        } else if (i == 4) {
            C7557a.f23040a.mo6672i(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER: Ad Video Playback Completed"));
            this.f30856l++;
            this.f30855k = true;
            mo35794B();
        }
        if (i != 2 || this.f30855k) {
            z = false;
        }
        mo35817v(z);
    }

    /* renamed from: v */
    public final void mo35817v(boolean z) {
        C13233c.f32843b.post(new C12950a(this.f30861q, z));
    }

    /* renamed from: w */
    public final /* synthetic */ void mo16447w(boolean z) {
    }

    /* renamed from: x */
    public final void mo35818x(boolean z) {
        if (this.f30869y) {
            C13233c.f32843b.post(new C12950a(this.f30834B, z));
        }
    }

    /* renamed from: y */
    public final /* synthetic */ void mo16448y(int i) {
    }

    /* renamed from: z */
    public final void mo35819z(boolean z) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER: Stopping Ad Video Playback");
        J0.append(this.f30845M);
        J0.append("...");
        logger.mo6672i(J0.toString());
        mo35793A(z);
    }

    public final void zza() {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("ORIENTATION_RECEIVER: onOrientationChanged");
        J0.append(this.f30845M);
        J0.append("...");
        logger.mo6666c(J0.toString());
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
        C12804b bVar = this.f30867w;
        if (bVar != null) {
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            ViewGroup.LayoutParams layoutParams = bVar.f31668c.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
            }
            ViewGroup.LayoutParams layoutParams2 = bVar.f31668c.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i2;
            }
            bVar.mo39644a(i, i2);
        }
    }

    public final void zzc() {
        C7557a.f23040a.mo6666c(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER_FULLSCREEN_DIALOG: onStart()"));
    }

    public final Pair zzd() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
        layoutParams.rightMargin = (int) ((((float) 30) * displayMetrics.density) + 0.5f);
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        C24362h.m61210e(displayMetrics2, "getSystem().displayMetrics");
        layoutParams.bottomMargin = (int) ((((float) 10) * displayMetrics2.density) + 0.5f);
        Context context = this.f30848d;
        if (context != null) {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(C1499d.umoak_ic_minimize);
            Context context2 = this.f30848d;
            if (context2 != null) {
                C0794g.m2404a(imageView, ColorStateList.valueOf(context2.getResources().getColor(C1498c.iv_tint)));
                return new Pair(imageView, layoutParams);
            }
            C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
            throw null;
        }
        C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
        throw null;
    }

    public final void zze() {
        C7557a.f23040a.mo6666c(C24362h.m61216k(this.f30845M, "VIDEO_PLAYER_FULLSCREEN_DIALOG: onDismissed()"));
    }
}
