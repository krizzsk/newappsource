package hc0;

import ac0.C7557a;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.activity.C0199g;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p347l.zzd;
import com.umo.ads.p350u.zzc;
import com.umo.ads.p350u.zzk;
import fc0.C12669a;
import gc0.C12724b;
import kc0.C12836b;
import kc0.C12840e;
import kc0.C12844i;
import mc0.C12909a;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p304x.C7029b1;
import p584jl.C17885a;
import vb0.C13197a;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;
import wb0.C13233c;

/* renamed from: hc0.b */
public final class C12753b implements C12844i.C12846b {

    /* renamed from: b */
    public final String f31507b;

    /* renamed from: c */
    public final C12754a f31508c;

    /* renamed from: d */
    public C13201e f31509d;

    /* renamed from: e */
    public C13197a f31510e;

    /* renamed from: f */
    public C13199c f31511f;

    /* renamed from: g */
    public C13200d f31512g;

    /* renamed from: h */
    public C12844i f31513h;

    /* renamed from: hc0.b$a */
    public interface C12754a {
    }

    public C12753b(String str, C12754a aVar) {
        C24362h.m61211f(str, "spotId");
        this.f31507b = str;
        this.f31508c = aVar;
    }

    /* renamed from: A */
    public final void mo39549A(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: B */
    public final void mo39550B(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39551C(fc0.C12669a r14, java.lang.String r15) {
        /*
            r13 = this;
            if (r14 != 0) goto L_0x0003
            return
        L_0x0003:
            kc0.i r0 = r13.f31513h
            if (r0 != 0) goto L_0x0009
            goto L_0x017a
        L_0x0009:
            java.lang.String r1 = " ("
            java.lang.String r2 = ": "
            fc0.a r3 = r0.f31755m
            if (r14 == r3) goto L_0x0017
            fc0.a r3 = r0.f31763u
            if (r14 == r3) goto L_0x0017
            goto L_0x017a
        L_0x0017:
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r4 = "Attempting MRAID Store Picture Operation: "
            java.lang.String r4 = mf0.C24362h.m61216k(r15, r4)
            r3.mo6672i(r4)
            boolean r3 = android.text.TextUtils.isEmpty(r15)
            if (r3 == 0) goto L_0x002f
            java.lang.String r15 = "Missing picture url."
            r0.mo39690i(r14, r15)
            goto L_0x017a
        L_0x002f:
            kc0.i$b r3 = r0.f31745c
            if (r3 != 0) goto L_0x0034
            goto L_0x003b
        L_0x0034:
            java.lang.String r3 = r0.f31744b
            java.lang.String r4 = "spotId"
            mf0.C24362h.m61211f(r3, r4)
        L_0x003b:
            mf0.C24362h.m61208c(r15)
            r3 = 1
            char[] r4 = new char[r3]
            r5 = 63
            r6 = 0
            r4[r6] = r5
            java.util.List r4 = kotlin.text.C24179b.m60576X(r15, r4)
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            char[] r5 = new char[r3]
            r7 = 46
            r5[r6] = r7
            java.util.List r4 = kotlin.text.C24179b.m60576X(r4, r5)
            int r5 = r4.size()
            int r5 = r5 - r3
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = "jpg"
            java.lang.String r8 = "jpeg"
            java.lang.String r9 = "tiff"
            java.lang.String r10 = "png"
            java.lang.String r11 = "gif"
            java.lang.String r12 = "bmp"
            java.lang.String[] r5 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}
            java.util.List r5 = p583jk.C17875h.m44281E(r5)
            int r4 = r5.indexOf(r4)
            r5 = -1
            if (r4 == r5) goto L_0x0082
            r4 = 1
            goto L_0x0083
        L_0x0082:
            r4 = 0
        L_0x0083:
            if (r4 != 0) goto L_0x008c
            java.lang.String r15 = "Not an Image Url."
            r0.mo39690i(r14, r15)
            goto L_0x017a
        L_0x008c:
            r4 = 41
            android.app.DownloadManager r5 = r0.f31737B     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            if (r5 != 0) goto L_0x00af
            android.view.ViewGroup r5 = r0.f31742G     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r7 = 0
            if (r5 != 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            android.content.Context r5 = r5.getContext()     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            if (r5 != 0) goto L_0x00a0
        L_0x009e:
            r5 = r7
            goto L_0x00a6
        L_0x00a0:
            java.lang.String r8 = "download"
            java.lang.Object r5 = r5.getSystemService(r8)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
        L_0x00a6:
            boolean r8 = r5 instanceof android.app.DownloadManager     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            if (r8 == 0) goto L_0x00ad
            r7 = r5
            android.app.DownloadManager r7 = (android.app.DownloadManager) r7     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
        L_0x00ad:
            r0.f31737B = r7     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
        L_0x00af:
            android.app.DownloadManager r5 = r0.f31737B     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            if (r5 != 0) goto L_0x00b5
            goto L_0x016e
        L_0x00b5:
            android.net.Uri r7 = android.net.Uri.parse(r15)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r8 = "umoak_mraid_"
            java.lang.String r9 = r7.getLastPathSegment()     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r8 = mf0.C24362h.m61216k(r9, r8)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            android.app.DownloadManager$Request r9 = new android.app.DownloadManager$Request     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r9.<init>(r7)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r7 = 3
            android.app.DownloadManager$Request r7 = r9.setAllowedNetworkTypes(r7)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            android.app.DownloadManager$Request r6 = r7.setAllowedOverRoaming(r6)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            android.app.DownloadManager$Request r6 = r6.setTitle(r8)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            android.app.DownloadManager$Request r6 = r6.setNotificationVisibility(r3)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r7 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r10 = java.io.File.separator     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r8 = mf0.C24362h.m61216k(r8, r10)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r6.setDestinationInExternalPublicDir(r7, r8)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            long r5 = r5.enqueue(r9)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.util.Map<java.lang.Long, fc0.a> r7 = r0.f31738C     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            if (r7 != 0) goto L_0x00f3
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r7.<init>()     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r0.f31738C = r7     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
        L_0x00f3:
            java.util.Map<java.lang.Long, fc0.a> r7 = r0.f31738C     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            if (r7 != 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.Object r7 = r7.put(r8, r14)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            fc0.a r7 = (fc0.C12669a) r7     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
        L_0x0102:
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r8.<init>()     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r9 = "MRAID Image download started"
            r8.append(r9)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r9 = r0.f31743H     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r8.append(r9)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r8.append(r2)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r8.append(r15)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r9 = " (Download Id: "
            r8.append(r9)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r8.append(r5)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r8.append(r4)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            java.lang.String r5 = r8.toString()     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r7.mo6672i(r5)     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            r0.mo39697r()     // Catch:{ SecurityException -> 0x014f, IllegalArgumentException -> 0x012f }
            goto L_0x016f
        L_0x012f:
            r3 = move-exception
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.String r6 = "IllegalArgumentException while downloading MRAID Image"
            java.lang.StringBuilder r6 = ce0.C21100e.m49315J0(r6)
            java.lang.String r7 = r0.f31743H
            p001a0.C0017h.m61R(r6, r7, r2, r15, r1)
            java.lang.String r1 = r3.getLocalizedMessage()
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            r5.mo6667d(r1)
            goto L_0x016e
        L_0x014f:
            r3 = move-exception
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.String r6 = "SecurityException while downloading MRAID Image"
            java.lang.StringBuilder r6 = ce0.C21100e.m49315J0(r6)
            java.lang.String r7 = r0.f31743H
            p001a0.C0017h.m61R(r6, r7, r2, r15, r1)
            java.lang.String r1 = r3.getLocalizedMessage()
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            r5.mo6667d(r1)
        L_0x016e:
            r3 = 0
        L_0x016f:
            if (r3 != 0) goto L_0x017a
            java.lang.String r1 = "Unable to download MRAID Image: "
            java.lang.String r15 = mf0.C24362h.m61216k(r15, r1)
            r0.mo39690i(r14, r15)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc0.C12753b.mo39551C(fc0.a, java.lang.String):void");
    }

    /* renamed from: D */
    public final void mo39552D(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: E */
    public final void mo39553E(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: F */
    public final boolean mo39554F() {
        C12844i iVar = this.f31513h;
        if (iVar == null || iVar.f31748f == zzc.INLINE) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final void mo39555G(C12669a aVar) {
        C12844i iVar;
        if (aVar != null && (iVar = this.f31513h) != null) {
            if (aVar == iVar.f31755m || aVar == iVar.f31763u) {
                C13233c.f32843b.post(new C0199g(iVar, 21));
            }
        }
    }

    /* renamed from: H */
    public final void mo39556H(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "ACTIVITY_LISTENER: onLeavingApplication"));
    }

    /* renamed from: a */
    public final void mo39557a(zzk zzk, String str) {
        Context context;
        Context context2 = C13233c.f32842a;
        ViewGroup c = C13233c.m33334c(this.f31507b);
        if (c == null) {
            context = null;
        } else {
            context = c.getContext();
        }
        if (context != null) {
            int i = com.umo.ads.p347l.zzd.f30827d;
            zzd.C12091a.m32061a(context, this.f31507b, zzk.zza, str);
        }
    }

    /* renamed from: b */
    public final void mo39558b(String str) {
        boolean z;
        C12844i iVar = this.f31513h;
        if (iVar != null) {
            iVar.setRichMediaAdContent(str);
        }
        C12844i iVar2 = this.f31513h;
        if (iVar2 != null) {
            if (iVar2.getAdPlacement() == zzc.INTERSTITIAL) {
                z = true;
            } else {
                z = false;
            }
            iVar2.setShowCloseButton(z);
        }
        C12844i iVar3 = this.f31513h;
        if (iVar3 != null) {
            Context context = C13233c.f32842a;
            ViewGroup c = C13233c.m33334c(iVar3.f31744b);
            iVar3.f31742G = c;
            if (c != null) {
                iVar3.setBackgroundColor(iVar3.getResources().getColor(17170445));
                iVar3.setLayoutParams(iVar3.f31741F);
                C13233c.f32843b.post(new C7029b1(iVar3, 14));
            }
        }
    }

    /* renamed from: c */
    public final void mo39559c(String str, UMOAdKitError uMOAdKitError, com.umo.ads.p342c.zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
    }

    /* renamed from: d */
    public final void mo39560d(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: e */
    public final void mo39561e(C12669a aVar) {
        C12844i iVar;
        if (aVar != null && (iVar = this.f31513h) != null) {
            if (aVar == iVar.f31755m || aVar == iVar.f31763u) {
                C13233c.f32843b.post(new C12840e(iVar, 0));
            }
        }
    }

    /* renamed from: f */
    public final void mo39562f(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: g */
    public final void mo39563g(String str) {
    }

    /* renamed from: h */
    public final void mo39564h(String str, com.umo.ads.p348o.zzc zzc) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: i */
    public final void mo39565i(String str, int i) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: j */
    public final void mo39566j(String str, boolean z) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: k */
    public final void mo39567k(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: l */
    public final C12909a mo39568l(String str) {
        C17885a.m44407J0(this, str, this, str);
        return null;
    }

    /* renamed from: m */
    public final void mo39569m(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: n */
    public final void mo39570n(ViewGroup viewGroup, String str) {
        C24362h.m61211f(str, "spotId");
        if (mo39554F()) {
            if (viewGroup != null) {
                C13197a aVar = this.f31510e;
                if (aVar != null) {
                    aVar.mo39560d(str);
                }
                C12912d q = C13233c.m33348q(str);
                if (q != null) {
                    q.f31973i = viewGroup;
                }
            }
            C13197a aVar2 = this.f31510e;
            if (aVar2 != null) {
                aVar2.mo39570n((ViewGroup) null, str);
                return;
            }
            return;
        }
        mo39557a(zzk.BROADCAST_ACTION_INTERSTITIAL_SHOW, (String) null);
    }

    /* renamed from: o */
    public final void mo39571o(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: p */
    public final void mo39572p(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: q */
    public final void mo39573q(String str, C12724b bVar) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: r */
    public final void mo39574r(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: s */
    public final void mo39575s(String str, Rect rect) {
        C24362h.m61211f(str, "spotId");
        C13201e eVar = this.f31509d;
        if (eVar != null) {
            eVar.mo39575s(str, rect);
        }
    }

    /* renamed from: t */
    public final void mo39576t(String str, com.umo.ads.p342c.zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
    }

    /* renamed from: u */
    public final void mo39577u(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: v */
    public final void mo39578v(String str, UMOAdKitError uMOAdKitError) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        if (mo39554F()) {
            C13197a aVar = this.f31510e;
            if (aVar != null) {
                aVar.mo39578v(str, uMOAdKitError);
                return;
            }
            return;
        }
        mo39557a(zzk.BROADCAST_ACTION_INTERSTITIAL_FAIL, uMOAdKitError.name());
        C12754a aVar2 = this.f31508c;
        if (aVar2 != null) {
            ((AKInterstitialAdActivity) aVar2).mo11140b1(str);
        }
    }

    /* renamed from: w */
    public final void mo39579w(String str, com.umo.ads.p342c.zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
    }

    /* renamed from: x */
    public final void mo39580x(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: y */
    public final void mo39581y(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    /* renamed from: z */
    public final void mo39582z(C12836b bVar, String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zza(String str, boolean z) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzb(String str, String str2) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzc(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzd(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zze(String str) {
        C24362h.m61211f(str, "spotId");
        C13199c cVar = this.f31511f;
        if (cVar != null) {
            cVar.mo39567k(str);
        }
    }

    public final void zzg(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzh(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzi(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzl(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzn(String str) {
        C24362h.m61211f(str, "spotId");
        C13199c cVar = this.f31511f;
        if (cVar != null) {
            cVar.zzi(str);
        }
    }

    public final void zzp(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzq(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzr(String str) {
    }

    public final void zzt(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzu(String str) {
        C24362h.m61211f(str, "spotId");
        if (mo39554F()) {
            C13199c cVar = this.f31511f;
            if (cVar != null) {
                cVar.zzu(str);
                return;
            }
            return;
        }
        mo39557a(zzk.BROADCAST_ACTION_INTERSTITIAL_DISMISS, (String) null);
        C12754a aVar = this.f31508c;
        if (aVar != null) {
            ((AKInterstitialAdActivity) aVar).mo11140b1(str);
        }
    }

    public final void zzw(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzy(String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zza(int i, String str) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final void zzb(String str) {
        C24362h.m61211f(str, "spotId");
        C13200d dVar = this.f31512g;
        if (dVar != null) {
            dVar.zzb(str);
        }
    }

    public final void zzc(String str, String str2) {
        C17885a.m44407J0(this, str, this, str);
    }

    public final boolean zze(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        C13201e eVar = this.f31509d;
        if (eVar == null) {
            return false;
        }
        return eVar.zze(str, str2);
    }

    public final void zzc(String str, boolean z) {
        C17885a.m44407J0(this, str, this, str);
    }
}
