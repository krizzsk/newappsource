package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bi0.C21079q;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p986firebaseauthapi.zzaaa;
import com.google.android.play.core.assetpacks.C14342z;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zze;
import com.iab.omid.library.fyber.adsession.Owner;
import com.p341rd.animation.type.AnimationType;
import com.p341rd.draw.data.Orientation;
import di0.C23274a;
import ib0.C12770a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k10.C17993a;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import lh0.C24272i;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24284n;
import lh0.C24285n0;
import lh0.C24298r;
import lh0.C24306u0;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24373a;
import mh0.C24375b;
import oh0.C24612a;
import oh0.C24613b;
import oh0.C24614c;
import oh0.C24615d;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24619h;
import oh0.C24620i;
import oh0.C24621j;
import oh0.C24622k;
import oh0.C24627o;
import p001a0.C0016g;
import p089g0.C4720a;
import p089g0.C4721b;
import p089g0.C4729d;
import p089g0.C4731e;
import p213pb.C6117f;
import p258t4.C6587a;
import p567iq.C17635b;
import p699oh.C18750c;
import p699oh.C18754g;
import p912xh.C20526b;
import yg0.C25301a;
import zf0.C25448i0;

/* renamed from: com.google.android.play.core.appupdate.d */
public final class C14226d implements C14342z, C24373a {

    /* renamed from: b */
    public static C14227e f35747b;

    /* renamed from: c */
    public static String[] f35748c;

    /* renamed from: d */
    public static final C6587a f35749d = new C6587a();

    /* renamed from: e */
    public static final /* synthetic */ C14226d f35750e = new C14226d();

    /* renamed from: f */
    public static final C21079q f35751f = new C21079q("UNLOCK_FAIL");

    /* renamed from: g */
    public static final C21079q f35752g;

    /* renamed from: h */
    public static final C21079q f35753h;

    /* renamed from: i */
    public static final C23274a f35754i;

    /* renamed from: j */
    public static final C23274a f35755j;

    /* renamed from: k */
    public static final C14226d f35756k = new C14226d();

    /* renamed from: l */
    public static final char[] f35757l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        C21079q qVar = new C21079q("LOCKED");
        f35752g = qVar;
        C21079q qVar2 = new C21079q("UNLOCKED");
        f35753h = qVar2;
        f35754i = new C23274a(qVar);
        f35755j = new C23274a(qVar2);
    }

    /* renamed from: A0 */
    public static Intent m35335A0(Context context) {
        return Intent.makeMainActivity(C17635b.m43779f(context).f50171a.f50151b);
    }

    /* renamed from: C0 */
    public static void m35336C0(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: D0 */
    public static C6117f m35337D0(C6117f fVar, String[] strArr, Map map) {
        int i = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C6117f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C6117f fVar2 = new C6117f();
                int length = strArr.length;
                while (i < length) {
                    fVar2.mo22078a((C6117f) map.get(strArr[i]));
                    i++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            fVar.mo22078a((C6117f) map.get(strArr[0]));
            return fVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                fVar.mo22078a((C6117f) map.get(strArr[i]));
                i++;
            }
        }
        return fVar;
    }

    /* renamed from: E0 */
    public static void m35338E0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C13715c.m34241g(15, "csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: F0 */
    public static void m35339F0(Intent intent) {
        intent.putExtra(C17993a.f46076b, "suppress_popups");
        intent.putExtra("SUPPRESS_ONBOARDING", true);
        intent.putExtra("suppress_genie_extra", true);
    }

    /* renamed from: G0 */
    public static void m35340G0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: H0 */
    public static String m35341H0(String str) {
        boolean z;
        boolean z2;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'A' || charAt > 'Z') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c < 'A' || c > 'Z') {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: I0 */
    public static String m35342I0(String str) {
        boolean z;
        boolean z2;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c < 'a' || c > 'z') {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: J0 */
    public static zzaaa m35343J0(AuthCredential authCredential, String str) {
        Preconditions.checkNotNull(authCredential);
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            GoogleAuthCredential googleAuthCredential = (GoogleAuthCredential) authCredential;
            Preconditions.checkNotNull(googleAuthCredential);
            return new zzaaa(googleAuthCredential.f36396b, googleAuthCredential.f36397c, "google.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        } else if (FacebookAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            FacebookAuthCredential facebookAuthCredential = (FacebookAuthCredential) authCredential;
            Preconditions.checkNotNull(facebookAuthCredential);
            return new zzaaa((String) null, facebookAuthCredential.f36380b, "facebook.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        } else if (TwitterAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            TwitterAuthCredential twitterAuthCredential = (TwitterAuthCredential) authCredential;
            Preconditions.checkNotNull(twitterAuthCredential);
            return new zzaaa((String) null, twitterAuthCredential.f36410b, "twitter.com", (String) null, twitterAuthCredential.f36411c, (String) null, str, (String) null, (String) null);
        } else if (GithubAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            GithubAuthCredential githubAuthCredential = (GithubAuthCredential) authCredential;
            Preconditions.checkNotNull(githubAuthCredential);
            return new zzaaa((String) null, githubAuthCredential.f36395b, "github.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        } else if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            PlayGamesAuthCredential playGamesAuthCredential = (PlayGamesAuthCredential) authCredential;
            Preconditions.checkNotNull(playGamesAuthCredential);
            return new zzaaa((String) null, (String) null, "playgames.google.com", (String) null, (String) null, playGamesAuthCredential.f36409b, str, (String) null, (String) null);
        } else if (zze.class.isAssignableFrom(authCredential.getClass())) {
            zze zze = (zze) authCredential;
            Preconditions.checkNotNull(zze);
            zzaaa zzaaa = zze.f36467e;
            if (zzaaa != null) {
                return zzaaa;
            }
            return new zzaaa(zze.f36465c, zze.f36466d, zze.f36464b, (String) null, zze.f36469g, (String) null, str, zze.f36468f, zze.f36470h);
        } else {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
    }

    /* renamed from: K0 */
    public static String m35344K0(StringBuilder sb, String str) {
        return C0016g.m31o(sb, str, "])");
    }

    /* renamed from: L0 */
    public static int m35345L0(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    /* renamed from: l0 */
    public static void m35346l0(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: m0 */
    public static void m35347m0(String str) {
        if (C20526b.f51916a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
    }

    /* renamed from: n0 */
    public static void m35348n0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: o0 */
    public static final int m35349o0(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException(C0016g.m28k("Unexpected hex digit: ", c));
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: q0 */
    public static void m35350q0(C18754g gVar) {
        if (gVar.f47716g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: r0 */
    public static void m35351r0(C18754g gVar) {
        if (gVar.f47715f) {
            m35350q0(gVar);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: s0 */
    public static C4720a m35352s0() {
        if (C4720a.f16013b != null) {
            return C4720a.f16013b;
        }
        synchronized (C4720a.class) {
            if (C4720a.f16013b == null) {
                C4720a.f16013b = new C4720a();
            }
        }
        return C4720a.f16013b;
    }

    /* renamed from: t0 */
    public static void m35353t0(LinkedList linkedList, Throwable th, StackTraceElement[] stackTraceElementArr) {
        int i;
        String str;
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTraceElementArr == null) {
            i = 0;
        } else {
            int length = stackTrace.length - 1;
            int length2 = stackTraceElementArr.length - 1;
            int i2 = 0;
            while (length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2])) {
                i2++;
                length--;
                length2--;
            }
            i = i2;
        }
        if (stackTraceElementArr != null) {
            str = "Caused by: ";
        } else {
            str = "";
        }
        StringBuilder k = C13555b.m33972k(str);
        k.append(th.getClass().getName());
        String sb = k.toString();
        if (th.getMessage() != null) {
            sb = C0016g.m32p(th, C0016g.m36t(sb, ": "));
        }
        linkedList.add(sb);
        for (int i3 = 0; i3 < stackTrace.length - i; i3++) {
            StringBuilder k2 = C13555b.m33972k("\tat ");
            k2.append(stackTrace[i3].toString());
            linkedList.add(k2.toString());
        }
        if (i != 0) {
            linkedList.add("\t... " + i + " common frames omitted");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m35353t0(linkedList, cause, stackTrace);
        }
    }

    /* renamed from: u0 */
    public static void m35354u0(C18754g gVar) {
        boolean z;
        C18750c cVar = gVar.f47711b;
        cVar.getClass();
        if (Owner.NATIVE == cVar.f47692a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: v0 */
    public static int m35355v0(C12770a aVar, int i) {
        int i2;
        int i3;
        if (aVar == null) {
            return 0;
        }
        Orientation b = aVar.mo39620b();
        Orientation orientation = Orientation.HORIZONTAL;
        if (b == orientation) {
            if (aVar.mo39620b() == orientation) {
                i3 = m35356w0(aVar, i);
            } else {
                i3 = aVar.f31540c;
                if (aVar.mo39619a() == AnimationType.DROP) {
                    i3 *= 3;
                }
            }
            return i3 + aVar.f31542e;
        }
        if (aVar.mo39620b() == orientation) {
            i2 = aVar.f31540c;
            if (aVar.mo39619a() == AnimationType.DROP) {
                i2 *= 3;
            }
        } else {
            i2 = m35356w0(aVar, i);
        }
        return i2 + aVar.f31543f;
    }

    /* renamed from: w0 */
    public static int m35356w0(C12770a aVar, int i) {
        int i2 = aVar.f31556s;
        int i3 = aVar.f31540c;
        int i4 = aVar.f31546i;
        int i5 = aVar.f31541d;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i4 / 2;
            int i9 = i3 + i8 + i6;
            if (i == i7) {
                return i9;
            }
            i6 = C16530d.m42011d(i3, i5, i8, i9);
        }
        if (aVar.mo39619a() == AnimationType.DROP) {
            return i6 + (i3 * 2);
        }
        return i6;
    }

    /* renamed from: x0 */
    public static C4729d m35357x0() {
        if (C4729d.f16026c != null) {
            return C4729d.f16026c;
        }
        synchronized (C4729d.class) {
            try {
                if (C4729d.f16026c == null) {
                    C4729d.f16026c = new C4729d();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return C4729d.f16026c;
    }

    /* renamed from: z0 */
    public static C4721b m35358z0() {
        if (C4731e.f16029a != null) {
            return C4731e.f16029a;
        }
        synchronized (C4731e.class) {
            try {
                if (C4731e.f16029a == null) {
                    C4731e.f16029a = new C4721b(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return C4731e.f16029a;
    }

    /* renamed from: A */
    public boolean mo42696A(C24618g gVar) {
        return C24373a.C24374a.m61268J(this, gVar);
    }

    /* renamed from: B */
    public C24375b mo42697B(C24618g gVar) {
        return C24373a.C24374a.m61298g0(this, gVar);
    }

    /* renamed from: B0 */
    public C24617f mo42698B0(C24617f fVar) {
        C24312z e = mo42731e(fVar);
        return e == null ? fVar : mo42723a(e, true);
    }

    /* renamed from: C */
    public int mo42699C(C24621j jVar) {
        return C24373a.C24374a.m61290c0(this, jVar);
    }

    /* renamed from: D */
    public boolean mo42700D(C24618g gVar) {
        C24362h.m61211f(gVar, "receiver");
        return mo42708L(mo42733f(gVar));
    }

    /* renamed from: E */
    public C24298r mo42701E(C24617f fVar) {
        return C24373a.C24374a.m61297g(this, fVar);
    }

    /* renamed from: F */
    public NewCapturedTypeConstructor mo42702F(C24613b bVar) {
        return C24373a.C24374a.m61302i0(this, bVar);
    }

    /* renamed from: G */
    public boolean mo42703G(C24613b bVar) {
        C24362h.m61211f(bVar, "receiver");
        return bVar instanceof C25301a;
    }

    /* renamed from: H */
    public Collection mo42704H(C24621j jVar) {
        return C24373a.C24374a.m61300h0(this, jVar);
    }

    /* renamed from: I */
    public boolean mo42705I(C24617f fVar) {
        C24272i iVar;
        C24362h.m61211f(fVar, "receiver");
        C24312z e = mo42731e(fVar);
        if (e == null) {
            iVar = null;
        } else {
            iVar = mo42716T(e);
        }
        if (iVar != null) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public C24620i mo42706J(C24617f fVar, int i) {
        return C24373a.C24374a.m61311n(this, fVar, i);
    }

    /* renamed from: K */
    public C24306u0 mo42707K(C24617f fVar) {
        return C24373a.C24374a.m61286a0(this, fVar);
    }

    /* renamed from: L */
    public boolean mo42708L(C24621j jVar) {
        return C24373a.C24374a.m61270L(this, jVar);
    }

    /* renamed from: M */
    public CaptureStatus mo42709M(C24613b bVar) {
        return C24373a.C24374a.m61305k(this, bVar);
    }

    /* renamed from: N */
    public C24281l0 mo42710N(C24612a aVar) {
        return C24373a.C24374a.m61294e0(this, aVar);
    }

    /* renamed from: O */
    public C24618g mo42711O(C24617f fVar) {
        return C24373a.C24374a.m61308l0(this, fVar);
    }

    /* renamed from: P */
    public boolean mo42712P(C24618g gVar) {
        return C24373a.C24374a.m61272N(this, gVar);
    }

    /* renamed from: Q */
    public boolean mo42713Q(C24617f fVar) {
        return C24373a.C24374a.m61273O(this, fVar);
    }

    /* renamed from: R */
    public boolean mo42714R(C24621j jVar) {
        return C24373a.C24374a.m61271M(this, jVar);
    }

    /* renamed from: S */
    public boolean mo42715S(C24618g gVar) {
        return C24373a.C24374a.m61279U(this, gVar);
    }

    /* renamed from: T */
    public C24272i mo42716T(C24618g gVar) {
        return C24373a.C24374a.m61293e(this, gVar);
    }

    /* renamed from: U */
    public boolean mo42717U(C24621j jVar) {
        return C24373a.C24374a.m61265G(this, jVar);
    }

    /* renamed from: V */
    public boolean mo42718V(C24622k kVar, C24621j jVar) {
        return C24373a.C24374a.m61261C(this, kVar, jVar);
    }

    /* renamed from: W */
    public C25448i0 mo42719W(C24627o oVar) {
        return C24373a.C24374a.m61321w(this, oVar);
    }

    /* renamed from: X */
    public C24622k mo42720X(C24621j jVar, int i) {
        return C24373a.C24374a.m61315q(this, jVar, i);
    }

    /* renamed from: Y */
    public boolean mo42721Y(C24618g gVar) {
        return C24373a.C24374a.m61280V(this, gVar);
    }

    /* renamed from: Z */
    public boolean mo42722Z(C24617f fVar) {
        return C24373a.C24374a.m61275Q(this, fVar);
    }

    /* renamed from: a */
    public C24312z mo42723a(C24618g gVar, boolean z) {
        return C24373a.C24374a.m61310m0(this, gVar, z);
    }

    /* renamed from: a0 */
    public C24306u0 mo42724a0(C24613b bVar) {
        return C24373a.C24374a.m61284Z(this, bVar);
    }

    /* renamed from: b */
    public C24312z mo42725b(C24615d dVar) {
        return C24373a.C24374a.m61282X(this, dVar);
    }

    /* renamed from: b0 */
    public C24306u0 mo42726b0(C24618g gVar, C24618g gVar2) {
        return C24373a.C24374a.m61307l(this, gVar, gVar2);
    }

    /* renamed from: c */
    public C24312z mo42727c(C24615d dVar) {
        return C24373a.C24374a.m61306k0(this, dVar);
    }

    /* renamed from: c0 */
    public int mo42728c0(C24617f fVar) {
        return C24373a.C24374a.m61287b(this, fVar);
    }

    /* renamed from: d */
    public C24613b mo42729d(C24618g gVar) {
        return C24373a.C24374a.m61291d(this, gVar);
    }

    /* renamed from: d0 */
    public C24619h mo42730d0(C24618g gVar) {
        return C24373a.C24374a.m61289c(this, gVar);
    }

    /* renamed from: e */
    public C24312z mo42731e(C24617f fVar) {
        return C24373a.C24374a.m61299h(this, fVar);
    }

    /* renamed from: e0 */
    public boolean mo42732e0(C24613b bVar) {
        return C24373a.C24374a.m61277S(this, bVar);
    }

    /* renamed from: f */
    public C24274i0 mo42733f(C24618g gVar) {
        return C24373a.C24374a.m61304j0(this, gVar);
    }

    /* renamed from: f0 */
    public boolean mo42734f0(C24620i iVar) {
        return C24373a.C24374a.m61278T(this, iVar);
    }

    /* renamed from: g */
    public boolean mo42735g(C24621j jVar) {
        return C24373a.C24374a.m61274P(this, jVar);
    }

    /* renamed from: g0 */
    public TypeVariance mo42736g0(C24620i iVar) {
        return C24373a.C24374a.m61323y(this, iVar);
    }

    /* renamed from: h */
    public boolean mo42737h(C24621j jVar) {
        return C24373a.C24374a.m61267I(this, jVar);
    }

    /* renamed from: h0 */
    public C24618g mo42738h0(C24617f fVar) {
        return C24373a.C24374a.m61283Y(this, fVar);
    }

    /* renamed from: i */
    public boolean mo42739i(C24618g gVar) {
        C24613b bVar;
        C24362h.m61211f(gVar, "receiver");
        C24312z e = mo42731e(gVar);
        if (e == null) {
            bVar = null;
        } else {
            bVar = mo42729d(e);
        }
        if (bVar != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public Set mo42740i0(C24618g gVar) {
        return C24373a.C24374a.m61292d0(this, gVar);
    }

    /* renamed from: j */
    public C24285n0 mo42741j(C24617f fVar) {
        return C24373a.C24374a.m61301i(this, fVar);
    }

    /* renamed from: j0 */
    public boolean mo42742j0(C24617f fVar) {
        return C24373a.C24374a.m61260B(this, fVar);
    }

    /* renamed from: k */
    public boolean mo42743k(C24621j jVar) {
        return C24373a.C24374a.m61266H(this, jVar);
    }

    /* renamed from: k0 */
    public C24306u0 mo42744k0(C24620i iVar) {
        return C24373a.C24374a.m61320v(this, iVar);
    }

    /* renamed from: l */
    public C24312z mo42745l(C24614c cVar) {
        return C24373a.C24374a.m61288b0(this, cVar);
    }

    /* renamed from: m */
    public C24620i mo42746m(C24618g gVar, int i) {
        return C24373a.C24374a.m61313o(this, gVar, i);
    }

    /* renamed from: n */
    public boolean mo42747n(C24621j jVar, C24621j jVar2) {
        return C24373a.C24374a.m61285a(this, jVar, jVar2);
    }

    /* renamed from: o */
    public C24621j mo42748o(C24617f fVar) {
        C24362h.m61211f(fVar, "receiver");
        C24618g e = mo42731e(fVar);
        if (e == null) {
            e = mo42738h0(fVar);
        }
        return mo42733f(e);
    }

    /* renamed from: p */
    public C24620i mo42749p(C24619h hVar, int i) {
        return C24373a.C24374a.m61309m(this, hVar, i);
    }

    /* renamed from: p0 */
    public C24284n mo42750p0(C24615d dVar) {
        return C24373a.C24374a.m61295f(this, dVar);
    }

    /* renamed from: q */
    public C24312z mo42751q(C24618g gVar, CaptureStatus captureStatus) {
        return C24373a.C24374a.m61303j(this, gVar, captureStatus);
    }

    /* renamed from: r */
    public void mo42752r(C24618g gVar, C24621j jVar) {
    }

    /* renamed from: s */
    public int mo42753s(C24619h hVar) {
        return C24373a.C24374a.m61296f0(this, hVar);
    }

    /* renamed from: t */
    public C24617f mo42754t(C24617f fVar) {
        return C24373a.C24374a.m61312n0(this, fVar);
    }

    /* renamed from: u */
    public TypeVariance mo42755u(C24622k kVar) {
        return C24373a.C24374a.m61324z(this, kVar);
    }

    /* renamed from: v */
    public boolean mo42756v(C24618g gVar) {
        C24362h.m61211f(gVar, "receiver");
        return mo42717U(mo42733f(gVar));
    }

    /* renamed from: w */
    public boolean mo42757w(C24621j jVar) {
        return C24373a.C24374a.m61264F(this, jVar);
    }

    /* renamed from: x */
    public boolean mo42758x(C24618g gVar, C24618g gVar2) {
        return C24373a.C24374a.m61262D(this, gVar, gVar2);
    }

    /* renamed from: y */
    public C24306u0 mo42759y(ArrayList arrayList) {
        return C24373a.C24374a.m61263E(this, arrayList);
    }

    /* renamed from: y0 */
    public boolean mo42760y0(C24617f fVar) {
        C24362h.m61211f(fVar, "receiver");
        if (!(fVar instanceof C24618g) || !mo42712P((C24618g) fVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public boolean mo42761z(C24617f fVar) {
        C24284n nVar;
        C24362h.m61211f(fVar, "receiver");
        C24298r E = mo42701E(fVar);
        if (E == null) {
            nVar = null;
        } else {
            nVar = mo42750p0(E);
        }
        if (nVar != null) {
            return true;
        }
        return false;
    }

    public int zza(int i) {
        return i;
    }
}
