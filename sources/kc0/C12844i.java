package kc0;

import ac0.C7557a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.C0436m1;
import bf0.C21050d;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity;
import com.umo.ads.p347l.zza;
import com.umo.ads.p347l.zzb;
import com.umo.ads.p347l.zze;
import com.umo.ads.p350u.zzc;
import com.umo.ads.p350u.zzk;
import com.umo.ads.p350u.zzm;
import com.umo.ads.p350u.zzp;
import com.umo.ads.p350u.zzu;
import com.usebutton.sdk.internal.api.AppActionRequest;
import fc0.C12669a;
import fc0.C12672b;
import fc0.C12674d;
import fc0.C12675e;
import hc0.C12753b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Timer;
import jc0.C12804b;
import kotlin.Pair;
import mc0.C12912d;
import mf0.C24362h;
import n60.C18531b;
import nc0.C12952c;
import nc0.C12954d;
import p001a0.C0016g;
import p026b7.C1499d;
import p026b7.C1500e;
import p026b7.C1501f;
import p026b7.C1502g;
import p043ch.qos.logback.classic.Logger;
import p304x.C7041e;
import p304x.C7103t;
import p572iw.C17662e;
import p583jk.C17875h;
import p584jl.C17885a;
import vb0.C13197a;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;
import wb0.C13233c;

@SuppressLint({"ViewConstructor"})
/* renamed from: kc0.i */
public final class C12844i extends FrameLayout implements zze.C12092a, C12804b.C12805a, C13200d, zza.C12090a {

    /* renamed from: I */
    public static final /* synthetic */ int f31735I = 0;

    /* renamed from: A */
    public C12675e f31736A;

    /* renamed from: B */
    public DownloadManager f31737B;

    /* renamed from: C */
    public Map<Long, C12669a> f31738C;

    /* renamed from: D */
    public zza f31739D;

    /* renamed from: E */
    public final FrameLayout.LayoutParams f31740E = new FrameLayout.LayoutParams(-2, -2, 17);

    /* renamed from: F */
    public final FrameLayout.LayoutParams f31741F = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: G */
    public ViewGroup f31742G;

    /* renamed from: H */
    public String f31743H;

    /* renamed from: b */
    public final String f31744b;

    /* renamed from: c */
    public final C12846b f31745c;

    /* renamed from: d */
    public String f31746d;

    /* renamed from: e */
    public boolean f31747e = true;

    /* renamed from: f */
    public zzc f31748f = zzc.INLINE;

    /* renamed from: g */
    public String f31749g;

    /* renamed from: h */
    public int f31750h = -1;

    /* renamed from: i */
    public int f31751i = -1;

    /* renamed from: j */
    public boolean f31752j;

    /* renamed from: k */
    public boolean f31753k;

    /* renamed from: l */
    public ImageView f31754l;

    /* renamed from: m */
    public C12669a f31755m;

    /* renamed from: n */
    public boolean f31756n;

    /* renamed from: o */
    public C12845a f31757o;

    /* renamed from: p */
    public C12846b f31758p;

    /* renamed from: q */
    public C12804b f31759q;

    /* renamed from: r */
    public FrameLayout f31760r;

    /* renamed from: s */
    public View f31761s;

    /* renamed from: t */
    public boolean f31762t;

    /* renamed from: u */
    public C12669a f31763u;

    /* renamed from: v */
    public boolean f31764v;

    /* renamed from: w */
    public C12675e f31765w;

    /* renamed from: x */
    public final int f31766x = -32768;

    /* renamed from: y */
    public int f31767y = -32768;

    /* renamed from: z */
    public zze f31768z;

    /* renamed from: kc0.i$a */
    public final class C12845a implements C12675e.C12679d {

        /* renamed from: a */
        public final /* synthetic */ C12844i f31769a;

        public C12845a(C12844i iVar) {
            C24362h.m61211f(iVar, "this$0");
            this.f31769a = iVar;
        }
    }

    /* renamed from: kc0.i$b */
    public interface C12846b extends C12669a.C12670a, C13201e, C13197a, C13199c, C13200d {
    }

    /* renamed from: kc0.i$c */
    public /* synthetic */ class C12847c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31770a;

        static {
            int[] iArr = new int[zzu.values().length];
            iArr[2] = 1;
            iArr[3] = 2;
            iArr[0] = 3;
            iArr[1] = 4;
            iArr[4] = 5;
            f31770a = iArr;
            int[] iArr2 = new int[zzm.values().length];
            iArr2[2] = 1;
            iArr2[1] = 2;
            iArr2[0] = 3;
            iArr2[4] = 4;
            iArr2[5] = 5;
            iArr2[6] = 6;
            iArr2[3] = 7;
            int[] iArr3 = new int[zzc.values().length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            int[] iArr4 = new int[zzp.values().length];
            iArr4[0] = 1;
            iArr4[1] = 2;
            iArr4[2] = 3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12844i(String str, Context context, C12753b bVar) {
        super(context);
        String str2;
        C24362h.m61211f(str, "spotId");
        this.f31744b = str;
        this.f31745c = bVar;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f31743H = str2;
    }

    private final C12675e getAdWebView() {
        if (this.f31736A == null) {
            String str = this.f31744b;
            Context context = getContext();
            C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
            C12675e eVar = new C12675e(context, str);
            this.f31736A = eVar;
            eVar.setLayoutParams(this.f31740E);
            if (this.f31757o == null) {
                this.f31757o = new C12845a(this);
            }
            if (this.f31758p == null) {
                this.f31758p = this.f31745c;
            }
            C12675e eVar2 = this.f31736A;
            if (eVar2 != null) {
                eVar2.setHandler(this.f31757o);
            }
            if (this.f31768z == null) {
                Context context2 = getContext();
                if (context2 == null || !(context2 instanceof Activity)) {
                    context2 = null;
                }
                Activity activity = (Activity) context2;
                if (activity != null) {
                    Logger logger = C7557a.f23040a;
                    StringBuilder J0 = C21100e.m49315J0("Registering MRAID Orientation Broadcast Receiver");
                    J0.append(this.f31743H);
                    J0.append("...");
                    logger.mo6666c(J0.toString());
                    this.f31768z = new zze(activity, this);
                }
            }
        }
        return this.f31736A;
    }

    /* renamed from: l */
    public static final void m32629l(C12844i iVar) {
        boolean z;
        boolean z2;
        int i;
        C12844i iVar2;
        String str;
        WebSettings settings;
        C24362h.m61211f(iVar, "this$0");
        ViewGroup viewGroup = iVar.f31742G;
        if (viewGroup != null) {
            viewGroup.addView(iVar);
        }
        zzc zzc = iVar.f31748f;
        zzc zzc2 = zzc.INLINE;
        boolean z3 = false;
        if (zzc == zzc2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iVar.setVisibility(8);
        } else {
            Context context = C13233c.f32842a;
            C12912d q = C13233c.m33348q(iVar.f31744b);
            if (q != null) {
                q.f31973i = iVar;
            }
        }
        if (TextUtils.isEmpty(iVar.f31746d)) {
            C12675e adWebView = iVar.getAdWebView();
            if (adWebView == null || (settings = adWebView.getSettings()) == null) {
                str = null;
            } else {
                str = settings.getUserAgentString();
            }
            iVar.f31746d = str;
            if (!C12954d.m32800c(str)) {
                iVar.f31746d = "AKAdView/2.2.2 (Android)";
            }
        }
        if (AKBrowserActivity.f7313G != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C12669a aVar = iVar.f31755m;
            if (!(aVar == null || iVar.f31758p == null)) {
                zzu zzu = aVar.f31314h;
                if (zzu == null) {
                    i = -1;
                } else {
                    i = C12847c.f31770a[zzu.ordinal()];
                }
                if (i == 1 || i == 2) {
                    C12846b bVar = iVar.f31758p;
                    if (bVar != null) {
                        C12669a aVar2 = iVar.f31755m;
                        C12753b bVar2 = (C12753b) bVar;
                        if (!(aVar2 == null || (iVar2 = bVar2.f31513h) == null)) {
                            iVar2.mo39679b(aVar2);
                        }
                    }
                }
            }
            if (iVar.f31749g != null) {
                new Timer().schedule(new C12848j(iVar), 100);
            }
        }
        if (iVar.f31748f == zzc2) {
            z3 = true;
        }
        if (z3) {
            iVar.mo39692k();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m32630n(kc0.C12844i r12) {
        /*
            java.lang.String r0 = "this$0"
            mf0.C24362h.m61211f(r12, r0)
            fc0.e r0 = r12.getAdWebView()
            if (r0 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0.stopLoading()
        L_0x000f:
            fc0.e r0 = r12.f31736A
            android.widget.FrameLayout$LayoutParams r1 = r12.f31740E
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r3 = r2
            goto L_0x001c
        L_0x0018:
            android.view.ViewParent r3 = r0.getParent()
        L_0x001c:
            if (r3 == r12) goto L_0x003f
            if (r0 != 0) goto L_0x0022
            r3 = r2
            goto L_0x0026
        L_0x0022:
            android.view.ViewParent r3 = r0.getParent()
        L_0x0026:
            if (r3 == 0) goto L_0x003c
            android.view.ViewParent r3 = r0.getParent()
            if (r3 == 0) goto L_0x0034
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeView(r0)
            goto L_0x003c
        L_0x0034:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            r12.<init>(r0)
            throw r12
        L_0x003c:
            r12.addView(r0, r1)
        L_0x003f:
            r0 = 0
            r12.f31756n = r0
            fc0.a r1 = new fc0.a
            java.lang.String r3 = r12.f31744b
            fc0.e r4 = r12.f31736A
            mf0.C24362h.m61208c(r4)
            kc0.i$b r5 = r12.f31758p
            mf0.C24362h.m61208c(r5)
            r1.<init>(r3, r4, r5)
            r12.f31755m = r1
            fc0.e r3 = r12.f31736A
            r4 = 1
            if (r3 != 0) goto L_0x005c
            goto L_0x00f8
        L_0x005c:
            java.lang.String r5 = r12.f31749g
            java.lang.String r6 = r3.f31330f
            r3.addJavascriptInterface(r1, r6)
            com.umo.ads.u.zzd r1 = com.umo.ads.p350u.zzd.MRAID_AD_TEMPLATE
            java.lang.String r6 = "templateName"
            mf0.C24362h.m61211f(r1, r6)
            j$.util.concurrent.ConcurrentHashMap r1 = p389bl.C13637c.f33649p
            if (r1 != 0) goto L_0x006f
            goto L_0x0078
        L_0x006f:
            java.lang.String r2 = "MRAID_AD_TEMPLATE"
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x0078:
            boolean r1 = nc0.C12954d.m32800c(r2)
            if (r1 == 0) goto L_0x0082
            mf0.C24362h.m61208c(r2)
            goto L_0x0084
        L_0x0082:
            java.lang.String r2 = ""
        L_0x0084:
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x00ce }
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r8 = r3.f31331g     // Catch:{ IllegalFormatException -> 0x00ce }
            r7[r0] = r8     // Catch:{ IllegalFormatException -> 0x00ce }
            r7[r4] = r5     // Catch:{ IllegalFormatException -> 0x00ce }
            r5 = 2
            java.lang.String r8 = r3.f31332h     // Catch:{ IllegalFormatException -> 0x00ce }
            r7[r5] = r8     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r6)     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r8 = java.lang.String.format(r1, r2, r5)     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r1 = "format(locale, this, *args)"
            mf0.C24362h.m61210e(r8, r1)     // Catch:{ IllegalFormatException -> 0x00ce }
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalFormatException -> 0x00ce }
            r2.<init>()     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r5 = "Loading MRAID Content"
            r2.append(r5)     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r5 = r3.f31333i     // Catch:{ IllegalFormatException -> 0x00ce }
            r2.append(r5)     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r5 = ": "
            r2.append(r5)     // Catch:{ IllegalFormatException -> 0x00ce }
            r2.append(r8)     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r2 = r2.toString()     // Catch:{ IllegalFormatException -> 0x00ce }
            r1.mo6666c(r2)     // Catch:{ IllegalFormatException -> 0x00ce }
            java.lang.String r7 = ""
            java.lang.String r9 = "text/html"
            java.lang.String r10 = "UTF-8"
            r11 = 0
            r6 = r3
            r6.loadDataWithBaseURL(r7, r8, r9, r10, r11)     // Catch:{ IllegalFormatException -> 0x00ce }
            r1 = 1
            goto L_0x00f5
        L_0x00ce:
            r1 = move-exception
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r5 = "IllegalFormatException while templatizing the MRAID Ad Content"
            java.lang.StringBuilder r5 = ce0.C21100e.m49315J0(r5)
            java.lang.String r3 = r3.f31333i
            r5.append(r3)
            java.lang.String r3 = " (Exception: "
            r5.append(r3)
            java.lang.String r1 = r1.getLocalizedMessage()
            r5.append(r1)
            r1 = 41
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.mo6667d(r1)
            r1 = 0
        L_0x00f5:
            if (r1 != 0) goto L_0x00f8
            r0 = 1
        L_0x00f8:
            if (r0 == 0) goto L_0x00fe
            r12.mo39693m()
            goto L_0x010e
        L_0x00fe:
            boolean r0 = r12.mo39694o()
            if (r0 == 0) goto L_0x010e
            android.os.Handler r0 = wb0.C13233c.f32843b
            kc0.f r1 = new kc0.f
            r1.<init>(r12, r4)
            r0.post(r1)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kc0.C12844i.m32630n(kc0.i):void");
    }

    private final void setCloseIconDrawable(Drawable drawable) {
        ImageView imageView = this.f31754l;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    private final void setMRaidSupportedFeatures(C12669a aVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        boolean z;
        boolean z2;
        boolean z3;
        if (aVar != null) {
            Boolean bool4 = null;
            if (this.f31745c == null) {
                bool = null;
            } else {
                C24362h.m61211f(this.f31744b, "spotId");
                bool = Boolean.TRUE;
            }
            if (this.f31745c == null) {
                bool2 = null;
            } else {
                C24362h.m61211f(this.f31744b, "spotId");
                bool2 = Boolean.TRUE;
            }
            if (this.f31745c == null) {
                bool3 = null;
            } else {
                C24362h.m61211f(this.f31744b, "spotId");
                bool3 = Boolean.TRUE;
            }
            if (this.f31745c != null) {
                C24362h.m61211f(this.f31744b, "spotId");
                bool4 = Boolean.TRUE;
            }
            boolean z4 = false;
            if (bool == null) {
                if (getContext().checkCallingOrSelfPermission("android.permission.SEND_SMS") == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bool = Boolean.valueOf(z3);
            }
            if (bool2 == null) {
                if (getContext().checkCallingOrSelfPermission("android.permission.CALL_PHONE") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bool2 = Boolean.valueOf(z2);
            }
            if (bool3 == null) {
                if (getContext().checkCallingOrSelfPermission("android.permission.WRITE_CALENDAR") == 0 && getContext().checkCallingOrSelfPermission("android.permission.READ_CALENDAR") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bool3 = Boolean.valueOf(z);
            }
            if (bool4 == null) {
                if (getContext().checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    z4 = true;
                }
                bool4 = Boolean.valueOf(z4);
            }
            aVar.mo39454a(1, bool.booleanValue());
            aVar.mo39454a(2, bool2.booleanValue());
            aVar.mo39454a(3, bool3.booleanValue());
            aVar.mo39454a(4, bool4.booleanValue());
            aVar.mo39454a(5, true);
            C12672b bVar = new C12672b();
            int i = this.f31750h;
            if (i == -1) {
                i = getWidth();
            }
            bVar.f31316a = i;
            int i2 = this.f31751i;
            if (i2 == -1) {
                i2 = getHeight();
            }
            bVar.f31317b = i2;
            aVar.mo39456c("mraid.setExpandProperties(" + bVar + ");");
            setResizeProperties(aVar);
        }
    }

    private final void setResizeProperties(C12669a aVar) {
        if (aVar != null) {
            C12674d dVar = new C12674d();
            int i = this.f31750h;
            if (i == -1) {
                i = getWidth();
            }
            dVar.f31321a = i;
            int i2 = this.f31751i;
            if (i2 == -1) {
                i2 = getHeight();
            }
            dVar.f31322b = i2;
            zzm zzm = zzm.TOPRIGHT;
            C24362h.m61211f(zzm, "<set-?>");
            dVar.f31323c = zzm;
            aVar.mo39456c("mraid.setResizeProperties(" + dVar + ");");
        }
    }

    /* renamed from: a */
    public final void mo35805a() {
    }

    /* renamed from: b */
    public final void mo39679b(C12669a aVar) {
        zzu zzu;
        int i;
        String str;
        if (aVar != this.f31755m && aVar != this.f31763u) {
            return;
        }
        if (!mo39694o()) {
            if (aVar == null) {
                zzu = null;
            } else {
                zzu = aVar.f31314h;
            }
            if (zzu == null) {
                i = -1;
            } else {
                i = C12847c.f31770a[zzu.ordinal()];
            }
            if (i == 1) {
                C12804b bVar = this.f31759q;
                if (bVar != null) {
                    bVar.dismiss();
                    C13233c.f32843b.post(new C0436m1(this, 16));
                }
            } else if (i == 2 && this.f31760r != null) {
                C13233c.f32843b.post(new C7103t(10, this, aVar));
            }
        } else if (this.f31745c != null) {
            String str2 = this.f31744b;
            C24362h.m61211f(str2, "spotId");
            Logger logger = C7557a.f23040a;
            if (C12954d.m32800c(str2)) {
                str = C17885a.m44403H0(str2);
            } else {
                str = "";
            }
            logger.mo6666c(C24362h.m61216k(str, "ACTIVITY_LISTENER: onCloseButtonClick"));
        }
    }

    /* renamed from: c */
    public final void mo35806c(C12804b bVar) {
        if (mo39694o()) {
            mo39691j();
        } else {
            bVar.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo39680d(C12669a aVar, zzu zzu) {
        Boolean bool;
        Float f;
        Float f2;
        Integer num;
        Integer num2;
        int i;
        int i2;
        int i3;
        Boolean bool2;
        ViewGroup.LayoutParams layoutParams;
        C12669a aVar2 = aVar;
        C12675e eVar = this.f31736A;
        if (aVar2 == this.f31763u) {
            eVar = this.f31765w;
        }
        if (eVar == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(eVar.isShown());
        }
        DisplayMetrics c = C12952c.m32793c(getContext());
        View rootView = getRootView();
        int f3 = C12952c.m32796f((int) ((float) getWidth()));
        int f4 = C12952c.m32796f((int) ((float) getHeight()));
        if (eVar == null) {
            f = null;
        } else {
            f = Float.valueOf((float) eVar.getWidth());
        }
        if (eVar == null) {
            f2 = null;
        } else {
            f2 = Float.valueOf((float) eVar.getHeight());
        }
        if (f == null) {
            num = null;
        } else {
            num = Integer.valueOf(C12952c.m32796f((int) f.floatValue()));
        }
        if (f2 == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(C12952c.m32796f((int) f2.floatValue()));
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int f5 = C12952c.m32796f(iArr[0]);
        int f6 = C12952c.m32796f(iArr[1]);
        int[] iArr2 = new int[2];
        if (zzu == zzu.RESIZED && this.f31760r != null) {
            if (eVar == null) {
                layoutParams = null;
            } else {
                layoutParams = eVar.getLayoutParams();
            }
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                iArr2[0] = layoutParams2.leftMargin;
                iArr2[1] = layoutParams2.topMargin;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        } else if (eVar != null) {
            eVar.getLocationOnScreen(iArr2);
        }
        int f7 = C12952c.m32796f(iArr2[0]);
        int f8 = C12952c.m32796f(iArr2[1]);
        int f9 = C12952c.m32796f(c.widthPixels);
        int f11 = C12952c.m32796f(c.heightPixels);
        int f12 = C12952c.m32796f(rootView.getWidth());
        int f13 = C12952c.m32796f(rootView.getHeight());
        int ordinal = zzu.ordinal();
        int i4 = f7;
        if (ordinal == 1) {
            num = Integer.valueOf(f3);
            num2 = Integer.valueOf(f4);
            f8 = f6;
            i = f5;
        } else if (ordinal != 2) {
            i = i4;
        } else {
            num = Integer.valueOf(f9);
            num2 = Integer.valueOf(f11);
            C12804b bVar = this.f31759q;
            if (bVar != null) {
                int i5 = c.widthPixels;
                int i6 = c.heightPixels;
                ViewGroup.LayoutParams layoutParams3 = bVar.f31668c.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = i5;
                }
                ViewGroup.LayoutParams layoutParams4 = bVar.f31668c.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = i6;
                }
                bVar.mo39644a(i5, i6);
            }
            i = 0;
            f8 = 0;
        }
        if (mo39694o()) {
            num = Integer.valueOf(f9);
            num2 = Integer.valueOf(f11);
            f6 = 0;
            f5 = 0;
            i2 = f9;
            f3 = i2;
            f13 = f11;
            f4 = f13;
        } else {
            i2 = f12;
        }
        if (aVar2 == null) {
            i3 = i;
            bool2 = bool;
        } else {
            bool2 = bool;
            StringBuilder sb = new StringBuilder();
            i3 = i;
            sb.append("mraid.setScreenSize({ width: ");
            sb.append(f9);
            sb.append(", height: ");
            sb.append(f11);
            sb.append(" });");
            aVar2.mo39456c(sb.toString());
        }
        if (aVar2 != null) {
            aVar2.mo39456c("mraid.setMaxSize({ width: " + i2 + ", height: " + f13 + " });");
        }
        if (aVar2 != null) {
            StringBuilder s = C0016g.m35s("mraid.setDefaultPosition({ x: ", f5, ", y: ", f6, ", width: ");
            s.append(f3);
            s.append(", height: ");
            s.append(f4);
            s.append(" });");
            aVar2.mo39456c(s.toString());
        }
        if (aVar2 != null) {
            C24362h.m61208c(num);
            int intValue = num.intValue();
            C24362h.m61208c(num2);
            int intValue2 = num2.intValue();
            StringBuilder s2 = C0016g.m35s("mraid.setCurrentPosition({ x: ", i3, ", y: ", f8, ", width: ");
            s2.append(intValue);
            s2.append(", height: ");
            s2.append(intValue2);
            s2.append(" });");
            aVar2.mo39456c(s2.toString());
        }
        if (aVar2 != null) {
            C24362h.m61208c(bool2);
            boolean booleanValue = bool2.booleanValue();
            aVar2.mo39456c("mraid.setViewable('" + booleanValue + "');");
        }
    }

    /* renamed from: e */
    public final void mo39681e(String str, boolean z) {
        C7557a.f23040a.mo6672i(C13715c.m34246l(C21100e.m49315J0("Handling MRAID Ad Open Url"), this.f31743H, ": ", str, "..."));
        Context context = getContext();
        C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
        new zzb(context, this.f31744b, C17875h.m44281E(zzk.BROADCAST_ACTION_BROWSER_OPEN, zzk.BROADCAST_ACTION_BROWSER_DISMISS)).f30822g = this;
        WeakReference<AKBrowserActivity> weakReference = AKBrowserActivity.f7313G;
        if (!AKBrowserActivity.C2225b.m5861a(this.f31744b, str, z)) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("Handling MRAID Ad Open Url failed");
            J0.append(this.f31743H);
            J0.append(": ");
            J0.append(str);
            logger.mo6667d(J0.toString());
        }
    }

    /* renamed from: f */
    public final void mo39682f(String str, boolean z, boolean z2) {
        String str2;
        if (z2 && this.f31745c != null) {
            String str3 = this.f31744b;
            C24362h.m61211f(str3, "spotId");
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("ACTIVITY_LISTENER: onOpenUrl");
            if (C12954d.m32800c(str3)) {
                str2 = C17885a.m44403H0(str3);
            } else {
                str2 = "";
            }
            J0.append(str2);
            J0.append(": ");
            J0.append(str);
            logger.mo6666c(J0.toString());
        }
        C13233c.f32843b.post(new C12843h(z, this, str));
    }

    /* renamed from: g */
    public final void mo39683g(boolean z) {
    }

    public final zzc getAdPlacement() {
        return this.f31748f;
    }

    public final int getMaxHeight() {
        return this.f31751i;
    }

    public final int getMaxWidth() {
        return this.f31750h;
    }

    public final String getRichMediaAdContent() {
        return this.f31749g;
    }

    public final boolean getShowCloseButton() {
        return this.f31753k;
    }

    /* renamed from: h */
    public final void mo39689h(C12669a aVar) {
        String str;
        if (aVar != null) {
            synchronized (aVar) {
                if (aVar == this.f31755m && !this.f31756n) {
                    return;
                }
                if (aVar == this.f31763u && !this.f31764v) {
                    return;
                }
                if (aVar.f31308b.f31329e) {
                    if (aVar.f31314h == zzu.LOADING) {
                        zzc adPlacement = getAdPlacement();
                        C24362h.m61211f(adPlacement, "placementType");
                        if (adPlacement == zzc.INTERSTITIAL) {
                            str = "interstitial";
                        } else {
                            str = "inline";
                        }
                        aVar.mo39456c("mraid.setPlacementType('" + str + "');");
                        setMRaidSupportedFeatures(aVar);
                        if (aVar == this.f31755m) {
                            int ordinal = getAdPlacement().ordinal();
                            boolean z = true;
                            if (ordinal == 0) {
                                mo39680d(aVar, zzu.DEFAULT);
                            } else if (ordinal == 1) {
                                mo39680d(aVar, zzu.EXPANDED);
                            }
                            aVar.mo39455b(zzu.DEFAULT);
                            C12846b bVar = this.f31745c;
                            if (bVar != null) {
                                ((C12753b) bVar).mo39570n(this, this.f31744b);
                            }
                            if (this.f31748f != zzc.INLINE) {
                                z = false;
                            }
                            if (z) {
                                setVisibility(0);
                            }
                        } else {
                            zzu zzu = zzu.EXPANDED;
                            mo39680d(aVar, zzu);
                            aVar.mo39455b(zzu);
                        }
                        aVar.mo39456c("mraid.fireEvent('ready');");
                        C21050d dVar = C21050d.f52856a;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo39690i(C12669a aVar, String str) {
        Logger logger = C7557a.f23040a;
        logger.mo6667d(C13233c.m33333b().getString(C1502g.umoak_mraid_store_picture_failure) + this.f31743H + ": " + str);
        if (aVar != null) {
            aVar.mo39457d(str, "storepicture");
        }
        mo39707x();
    }

    /* renamed from: j */
    public final void mo39691j() {
        C13233c.f32843b.post(new C12841f(this, 0));
        C12846b bVar = this.f31745c;
        if (bVar != null) {
            ((C12753b) bVar).zzu(this.f31744b);
        }
    }

    /* renamed from: k */
    public final void mo39692k() {
        C12675e eVar;
        int i;
        Integer num;
        Integer num2;
        C12675e eVar2;
        Integer num3;
        Integer num4;
        C12675e eVar3 = this.f31736A;
        if (eVar3 != null) {
            eVar3.layout(0, 0, getWidth(), getHeight());
            C12669a aVar = this.f31755m;
            if (aVar != null) {
                zzu zzu = null;
                if (this.f31748f == zzc.INLINE) {
                    zzu zzu2 = aVar.f31314h;
                    if (zzu2 == null) {
                        i = -1;
                    } else {
                        i = C12847c.f31770a[zzu2.ordinal()];
                    }
                    if (i == 1) {
                        C12675e eVar4 = this.f31736A;
                        if (eVar4 != null) {
                            C12669a aVar2 = this.f31755m;
                            if (aVar2 == null) {
                                num = null;
                            } else {
                                C12672b bVar = aVar2.f31310d;
                                if (bVar != null) {
                                    num = Integer.valueOf(bVar.f31316a);
                                } else {
                                    C24362h.m61217l("expandProps");
                                    throw null;
                                }
                            }
                            C24362h.m61208c(num);
                            int intValue = num.intValue();
                            C12669a aVar3 = this.f31755m;
                            if (aVar3 == null) {
                                num2 = null;
                            } else {
                                C12672b bVar2 = aVar3.f31310d;
                                if (bVar2 != null) {
                                    num2 = Integer.valueOf(bVar2.f31317b);
                                } else {
                                    C24362h.m61217l("expandProps");
                                    throw null;
                                }
                            }
                            C24362h.m61208c(num2);
                            eVar4.layout(0, 0, intValue, num2.intValue());
                        }
                    } else if (i == 2 && (eVar2 = this.f31736A) != null) {
                        C12669a aVar4 = this.f31755m;
                        if (aVar4 == null) {
                            num3 = null;
                        } else {
                            C12674d dVar = aVar4.f31311e;
                            if (dVar != null) {
                                num3 = Integer.valueOf(dVar.f31321a);
                            } else {
                                C24362h.m61217l("resizeProps");
                                throw null;
                            }
                        }
                        C24362h.m61208c(num3);
                        int intValue2 = num3.intValue();
                        C12669a aVar5 = this.f31755m;
                        if (aVar5 == null) {
                            num4 = null;
                        } else {
                            C12674d dVar2 = aVar5.f31311e;
                            if (dVar2 != null) {
                                num4 = Integer.valueOf(dVar2.f31322b);
                            } else {
                                C24362h.m61217l("resizeProps");
                                throw null;
                            }
                        }
                        C24362h.m61208c(num4);
                        eVar2.layout(0, 0, intValue2, num4.intValue());
                    }
                } else if (mo39694o() && (eVar = this.f31736A) != null) {
                    eVar.setLayoutParams(this.f31740E);
                }
                C12669a aVar6 = this.f31755m;
                if (aVar6 != null) {
                    zzu = aVar6.f31314h;
                }
                C24362h.m61208c(zzu);
                mo39680d(aVar6, zzu);
            }
        }
    }

    /* renamed from: m */
    public final void mo39693m() {
        if (this.f31755m != null) {
            mo39705v();
            UMOAdKitError uMOAdKitError = UMOAdKitError.AD_PLAY_FAILED;
            C12846b bVar = this.f31745c;
            if (bVar != null) {
                ((C12753b) bVar).mo39578v(this.f31744b, uMOAdKitError);
            }
            mo39698s();
        }
    }

    /* renamed from: o */
    public final boolean mo39694o() {
        return this.f31748f == zzc.INTERSTITIAL;
    }

    /* renamed from: p */
    public final void mo39695p() {
        int i;
        ImageView imageView;
        Boolean bool;
        ViewGroup viewGroup;
        ImageView imageView2;
        C12804b bVar = this.f31759q;
        Boolean bool2 = null;
        if (!(bVar == null || (imageView2 = bVar.f31669d) == null)) {
            imageView2.setImageDrawable((Drawable) null);
        }
        C12669a aVar = this.f31755m;
        if (aVar != null) {
            zzu zzu = aVar.f31314h;
            if (zzu == null) {
                i = -1;
            } else {
                i = C12847c.f31770a[zzu.ordinal()];
            }
            if (i == 1) {
                C12669a aVar2 = this.f31755m;
                if (aVar2 != null) {
                    C12672b bVar2 = aVar2.f31310d;
                    if (bVar2 != null) {
                        bool2 = Boolean.valueOf(bVar2.f31318c);
                    } else {
                        C24362h.m61217l("expandProps");
                        throw null;
                    }
                }
                if (C24362h.m61206a(bool2, Boolean.FALSE)) {
                    C12804b bVar3 = this.f31759q;
                    if (bVar3 != null) {
                        ImageView imageView3 = bVar3.f31669d;
                        if (imageView3 == null) {
                            ImageView imageView4 = new ImageView(bVar3.getContext());
                            bVar3.f31669d = imageView4;
                            bVar3.f31668c.addView(imageView4, C12804b.m32606b());
                            ImageView imageView5 = bVar3.f31669d;
                            if (imageView5 != null) {
                                imageView5.setOnClickListener(new C18531b(bVar3, 9));
                            }
                        } else {
                            bVar3.f31668c.removeView(imageView3);
                            bVar3.f31668c.addView(bVar3.f31669d);
                        }
                    }
                    mo39706w();
                    return;
                }
                C12804b bVar4 = this.f31759q;
                if (bVar4 != null && (imageView = bVar4.f31669d) != null) {
                    bVar4.f31668c.removeView(imageView);
                    return;
                }
                return;
            } else if (i == 4) {
                if (mo39694o()) {
                    C12669a aVar3 = this.f31755m;
                    if (aVar3 == null) {
                        bool = null;
                    } else {
                        C12672b bVar5 = aVar3.f31310d;
                        if (bVar5 != null) {
                            bool = Boolean.valueOf(bVar5.f31318c);
                        } else {
                            C24362h.m61217l("expandProps");
                            throw null;
                        }
                    }
                    if (C24362h.m61206a(bool, Boolean.FALSE)) {
                        ImageView imageView6 = this.f31754l;
                        if (imageView6 == null) {
                            View inflate = LayoutInflater.from(getContext()).inflate(C1501f.umoak_layout_interstitial_close_control, (ViewGroup) null);
                            View findViewById = inflate.findViewById(C1500e.iv_close);
                            if (findViewById != null) {
                                this.f31754l = (ImageView) findViewById;
                                ViewGroup viewGroup2 = this.f31742G;
                                if (viewGroup2 != null) {
                                    viewGroup2.addView(inflate);
                                }
                                ImageView imageView7 = this.f31754l;
                                if (imageView7 != null) {
                                    imageView7.setOnClickListener(new C17662e(this, 19));
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                            }
                        } else {
                            ViewGroup viewGroup3 = this.f31742G;
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(imageView6);
                            }
                            ViewGroup viewGroup4 = this.f31742G;
                            if (viewGroup4 != null) {
                                viewGroup4.addView(this.f31754l);
                            }
                        }
                        mo39706w();
                        return;
                    }
                    ImageView imageView8 = this.f31754l;
                    if (imageView8 != null && (viewGroup = this.f31742G) != null) {
                        viewGroup.removeView(imageView8);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        mo39706w();
    }

    /* renamed from: q */
    public final void mo39696q() {
        ViewGroup viewGroup;
        if (this.f31755m != null && (viewGroup = this.f31742G) != null) {
            viewGroup.post(new C7041e(17, viewGroup, this));
        }
    }

    /* renamed from: r */
    public final void mo39697r() {
        if (this.f31739D == null) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("Registering MRAID Download Status Broadcast Receiver");
            J0.append(this.f31743H);
            J0.append("...");
            logger.mo6672i(J0.toString());
            this.f31739D = new zza(C13233c.m33333b(), this);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, fc0.a>] */
    /* renamed from: s */
    public final void mo39698s() {
        mo39705v();
        mo39683g(false);
        ? r1 = this.f31738C;
        if (r1 != 0) {
            for (Map.Entry key : r1.entrySet()) {
                long longValue = ((Number) key.getKey()).longValue();
                DownloadManager downloadManager = this.f31737B;
                if (downloadManager != null) {
                    downloadManager.remove(new long[]{longValue});
                }
            }
        }
        this.f31738C = null;
        int ordinal = this.f31748f.ordinal();
        if (ordinal == 0) {
            removeAllViews();
        } else if (ordinal == 1) {
            removeAllViews();
        }
    }

    public final void setAdPlacement(zzc zzc) {
        C24362h.m61211f(zzc, "<set-?>");
        this.f31748f = zzc;
    }

    public final void setMaxHeight(int i) {
        this.f31751i = i;
    }

    public final void setMaxWidth(int i) {
        this.f31750h = i;
    }

    public final void setRichMediaAdContent(String str) {
        this.f31749g = str;
    }

    public final void setShowCloseButton(boolean z) {
        this.f31753k = z;
    }

    /* renamed from: t */
    public final void mo39704t() {
        AKBrowserActivity aKBrowserActivity;
        mo39698s();
        WeakReference<AKBrowserActivity> weakReference = AKBrowserActivity.f7313G;
        if (weakReference != null && (aKBrowserActivity = weakReference.get()) != null) {
            aKBrowserActivity.finish();
        }
    }

    /* renamed from: u */
    public final void mo39577u(String str) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6672i("onInternalBrowserPresented (MRAID)...");
    }

    /* renamed from: v */
    public final void mo39705v() {
        C12844i iVar;
        C12669a aVar = this.f31755m;
        if (aVar != null) {
            C12846b bVar = this.f31758p;
            if (!(bVar == null || (iVar = ((C12753b) bVar).f31513h) == null)) {
                iVar.mo39679b(aVar);
            }
            C12804b bVar2 = this.f31759q;
            if (bVar2 != null) {
                bVar2.dismiss();
                this.f31759q = null;
            }
            FrameLayout frameLayout = this.f31760r;
            if (frameLayout != null) {
                ViewParent parent = frameLayout.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f31760r);
                    this.f31760r = null;
                    this.f31761s = null;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            this.f31755m = null;
        }
        C12675e eVar = this.f31736A;
        if (eVar != null) {
            eVar.stopLoading();
            eVar.loadUrl("");
            zze zze = this.f31768z;
            if (zze != null) {
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("Unregistering MRAID Orientation Broadcast Receiver");
                J0.append(this.f31743H);
                J0.append("...");
                logger.mo6666c(J0.toString());
                zze.f30826a.unregisterReceiver(zze);
            }
            this.f31768z = null;
            mo39707x();
            eVar.clearHistory();
            eVar.destroy();
        }
        this.f31757o = null;
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: w */
    public final void mo39706w() {
        int i;
        ImageView imageView;
        ImageView imageView2;
        Drawable drawable = getContext().getResources().getDrawable(C1499d.umoak_ic_close_circular_grey);
        if (drawable != null) {
            C12669a aVar = this.f31755m;
            if (aVar != null) {
                zzu zzu = aVar.f31314h;
                if (zzu == null) {
                    i = -1;
                } else {
                    i = C12847c.f31770a[zzu.ordinal()];
                }
                if (i == 1) {
                    C12804b bVar = this.f31759q;
                    if (bVar != null && (imageView = bVar.f31669d) != null) {
                        imageView.setImageDrawable(drawable);
                        return;
                    }
                    return;
                } else if (i == 2) {
                    View view = this.f31761s;
                    if (view != null) {
                        view.setBackground(drawable);
                        return;
                    }
                    return;
                } else if ((i == 3 || i == 4) && mo39694o()) {
                    C12804b bVar2 = this.f31759q;
                    if (!(bVar2 == null || (imageView2 = bVar2.f31669d) == null)) {
                        imageView2.setImageDrawable(drawable);
                    }
                    setCloseIconDrawable(drawable);
                    return;
                }
            }
            if (this.f31748f.ordinal() == 1) {
                setCloseIconDrawable(drawable);
            }
        }
    }

    /* renamed from: x */
    public final void mo39707x() {
        zza zza = this.f31739D;
        if (zza != null) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("Unregistering MRAID Download Status Broadcast Receiver");
            J0.append(this.f31743H);
            J0.append("...");
            logger.mo6672i(J0.toString());
            zza.f30826a.unregisterReceiver(zza);
        }
        this.f31739D = null;
    }

    public final void zza() {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("onLayoutMRaidAd called on Orientation Change");
        J0.append(this.f31743H);
        J0.append("...");
        logger.mo6666c(J0.toString());
        mo39692k();
    }

    public final void zzb(String str) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6672i("onInternalBrowserDismissed (MRAID)...");
        AKBrowserActivity.f7313G = null;
        if (mo39694o() && this.f31752j) {
            mo39691j();
        }
        C12846b bVar = this.f31745c;
        if (bVar != null) {
            ((C12753b) bVar).zzb(str);
        }
        C12675e eVar = this.f31736A;
        if (eVar != null) {
            eVar.setFocusable(false);
        }
    }

    public final void zzc() {
        C12846b bVar;
        C12669a aVar;
        if (this.f31748f.ordinal() == 0 && (aVar = this.f31755m) != null && !this.f31762t) {
            zzu zzu = zzu.EXPANDED;
            mo39680d(aVar, zzu);
            C12669a aVar2 = this.f31755m;
            if (aVar2 != null) {
                aVar2.mo39455b(zzu);
            }
        }
        C12669a aVar3 = this.f31755m;
        if (!(aVar3 == null || aVar3.f31314h != zzu.EXPANDED || (bVar = this.f31745c) == null)) {
            ((C12753b) bVar).zzn(this.f31744b);
        }
        mo39695p();
    }

    public final Pair zzd() {
        return null;
    }

    public final void zze() {
        int i;
        zzu zzu;
        C12846b bVar;
        C12844i iVar;
        C12669a aVar;
        Activity activity = null;
        if (this.f31755m != null) {
            int ordinal = this.f31748f.ordinal();
            if (ordinal == 0) {
                C12669a aVar2 = this.f31755m;
                if (aVar2 == null) {
                    zzu = null;
                } else {
                    zzu = aVar2.f31314h;
                }
                if (zzu == zzu.EXPANDED && (bVar = this.f31758p) != null) {
                    C12753b bVar2 = (C12753b) bVar;
                    if (!(aVar2 == null || (iVar = bVar2.f31513h) == null)) {
                        iVar.mo39679b(aVar2);
                    }
                }
            } else if (ordinal == 1 && (aVar = this.f31755m) != null) {
                aVar.mo39455b(zzu.HIDDEN);
            }
        }
        Context context = getContext();
        if (context != null && (context instanceof Activity)) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null && (i = this.f31767y) != this.f31766x) {
            activity2.setRequestedOrientation(i);
        }
    }
}
