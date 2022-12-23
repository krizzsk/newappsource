package com.cubic.umo.p045ad.ext.interfaces;

import ac0.C7557a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C0441n1;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import bf0.C21050d;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKit;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineBannerCreativeType;
import com.cubic.umo.p045ad.lifecycle.AKAdViewLifecycleObserver;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity;
import com.cubic.umo.p045ad.playback.p046ui.views.AKImageView;
import com.cubic.umo.p045ad.types.AKHostedConfig;
import com.cubic.umo.p045ad.types.AKPlaceholders;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.play.core.appupdate.C14226d;
import com.umo.ads.p343d.zza;
import com.umo.ads.p350u.zzi;
import com.umo.ads.p350u.zzj;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.views.LoadingDots;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf0.C24236l;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12954d;
import p001a0.C0016g;
import p001a0.C0017h;
import p026b7.C1499d;
import p026b7.C1500e;
import p026b7.C1501f;
import p039c7.C1798a;
import p039c7.C1799b;
import p039c7.C1800c;
import p039c7.C1801d;
import p043ch.qos.logback.classic.Logger;
import p061d7.C4402a;
import p061d7.C4403b;
import p176n0.C5794m;
import p304x.C7041e;
import p304x.C7097r;
import p304x.C7109v;
import p316y.C7218m;
import p583jk.C17875h;
import p584jl.C17885a;
import p988j$.util.concurrent.ConcurrentHashMap;
import wb0.C13232b;
import wb0.C13233c;
import yb0.C13295d;
import yb0.C13301f;
import yb0.C13308i;
import zb0.C13364a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001TB\u001b\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010O\u001a\u0004\u0018\u00010N¢\u0006\u0004\bP\u0010QB#\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010O\u001a\u0004\u0018\u00010N\u0012\u0006\u0010R\u001a\u00020\u0016¢\u0006\u0004\bP\u0010SJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0002R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00105\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010?\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010D\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\r\"\u0004\bC\u0010\u0011R$\u0010K\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006U"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/interfaces/UMOAdKitBannerView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "", "isVisible", "Lbf0/d;", "setVisibility", "Ld7/b;", "getBannerCreativeSize", "Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerState;", "getBannerState", "Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerType;", "getPlaceholderBannerType$ads_release", "()Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerType;", "getPlaceholderBannerType", "bannerType", "setPlaceholder$ads_release", "(Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerType;)V", "setPlaceholder", "setStaticOrDefaultPlaceholder$ads_release", "setStaticOrDefaultPlaceholder", "Lkotlin/Pair;", "", "getNonStandardOrVideoBannerWidthAndHeight$ads_release", "()Lkotlin/Pair;", "getNonStandardOrVideoBannerWidthAndHeight", "", "getSpotIdForLog", "setPlaceholderImageViewStretchFlag", "phDrawableName", "setStaticAppPlaceholderImage", "Landroid/view/WindowInsets;", "updatedInsets", "setWindowsInsets", "getBannerSaveStateInfo", "Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerParams;", "b", "Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerParams;", "getBannerParams", "()Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerParams;", "setBannerParams", "(Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerParams;)V", "bannerParams", "Lc7/a;", "c", "Lc7/a;", "getBannerAdListener", "()Lc7/a;", "setBannerAdListener", "(Lc7/a;)V", "bannerAdListener", "d", "Z", "isRecycleModeEnabled", "()Z", "setRecycleModeEnabled", "(Z)V", "e", "Landroid/widget/FrameLayout;", "getPlaceholderLayout$ads_release", "()Landroid/widget/FrameLayout;", "setPlaceholderLayout$ads_release", "(Landroid/widget/FrameLayout;)V", "placeholderLayout", "g", "Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerType;", "getDefaultPHBannerType$ads_release", "setDefaultPHBannerType$ads_release", "defaultPHBannerType", "h", "Ljava/lang/String;", "getPlaceholderClickUrl$ads_release", "()Ljava/lang/String;", "setPlaceholderClickUrl$ads_release", "(Ljava/lang/String;)V", "placeholderClickUrl", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView */
public final class UMOAdKitBannerView extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: i */
    public static final Companion f7241i = new Companion();

    /* renamed from: b */
    public UMOAdKitBannerParams f7242b;

    /* renamed from: c */
    public C1798a f7243c;

    /* renamed from: d */
    public boolean f7244d;

    /* renamed from: e */
    public FrameLayout f7245e;

    /* renamed from: f */
    public AKImageView f7246f;

    /* renamed from: g */
    public UMOAdKitBannerType f7247g = UMOAdKitBannerType.NONE;

    /* renamed from: h */
    public String f7248h;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\f"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/interfaces/UMOAdKitBannerView$Companion;", "", "Lcom/cubic/umo/ad/ext/types/UMOAdKitBannerType;", "bannerType", "Ld7/b;", "getBannerSizeByBannerType", "Lcom/cubic/umo/ad/ext/types/UMOAdKitInlineBannerCreativeType;", "bannerCreativeType", "", "doesUMOAdKiteExpectAppToUpdateLayoutParams", "<init>", "()V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
    /* renamed from: com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$Companion */
    public static final class Companion {

        /* renamed from: com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$Companion$a */
        public /* synthetic */ class C2220a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f7249a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f7250b;

            static {
                int[] iArr = new int[UMOAdKitBannerType.values().length];
                iArr[UMOAdKitBannerType.MEDRECT_300x250_1x1.ordinal()] = 1;
                iArr[UMOAdKitBannerType.LEADERBOARD_300x50_6x1.ordinal()] = 2;
                iArr[UMOAdKitBannerType.LEADERBOARD_320x50_6x1.ordinal()] = 3;
                iArr[UMOAdKitBannerType.LARGE_320x100.ordinal()] = 4;
                iArr[UMOAdKitBannerType.SQUARE_250x250.ordinal()] = 5;
                iArr[UMOAdKitBannerType.SMALLSQUARE_200x200.ordinal()] = 6;
                iArr[UMOAdKitBannerType.FULLSIZE_468x60.ordinal()] = 7;
                iArr[UMOAdKitBannerType.LEADERBOARD_728x90_8x1.ordinal()] = 8;
                iArr[UMOAdKitBannerType.BILLBOARD_970x250.ordinal()] = 9;
                iArr[UMOAdKitBannerType.SUPERLEADERBOARD_970x90.ordinal()] = 10;
                iArr[UMOAdKitBannerType.PORTRAIT_300x1050.ordinal()] = 11;
                iArr[UMOAdKitBannerType.SKYSCRAPER_160x600.ordinal()] = 12;
                iArr[UMOAdKitBannerType.TWENTYxSIXTY_120x60.ordinal()] = 13;
                iArr[UMOAdKitBannerType.SMART_SWxH.ordinal()] = 14;
                iArr[UMOAdKitBannerType.ADAPTIVE_GWxAH.ordinal()] = 15;
                iArr[UMOAdKitBannerType.INTERSTITIAL_640x1136.ordinal()] = 16;
                iArr[UMOAdKitBannerType.INTERSTITIAL_750x1334.ordinal()] = 17;
                iArr[UMOAdKitBannerType.INTERSTITIAL_1080x1920.ordinal()] = 18;
                iArr[UMOAdKitBannerType.CUSTOM_GWxGH.ordinal()] = 19;
                f7249a = iArr;
                int[] iArr2 = new int[UMOAdKitInlineBannerCreativeType.values().length];
                iArr2[UMOAdKitInlineBannerCreativeType.IMAGE.ordinal()] = 1;
                iArr2[UMOAdKitInlineBannerCreativeType.VIDEO.ordinal()] = 2;
                f7250b = iArr2;
                int[] iArr3 = new int[C17885a.m44417O0(7).length];
                iArr3[3] = 1;
                iArr3[4] = 2;
                int[] iArr4 = new int[C17885a.m44417O0(3).length];
                iArr4[1] = 1;
                iArr4[2] = 2;
            }
        }

        /* renamed from: a */
        public static Pair m5821a(int i) {
            int i2;
            Pair pair;
            Pair a = C13364a.m33638a((Context) null);
            int intValue = ((Number) a.mo59068c()).intValue();
            int intValue2 = ((Number) a.mo59069d()).intValue();
            double d = ((double) intValue2) * 0.15d;
            if (i <= 0) {
                i2 = intValue;
            } else {
                i2 = i;
            }
            Pair<Integer, Integer> pair2 = C13232b.f32841b;
            double intValue3 = ((double) pair2.mo59068c().intValue()) / pair2.mo59069d().doubleValue();
            double d2 = ((double) i2) / intValue3;
            if (d2 <= ((double) 50)) {
                pair = new Pair(Integer.valueOf(i2), 50);
            } else if (d2 > d) {
                pair = new Pair(Integer.valueOf(i2), Integer.valueOf((int) d));
            } else {
                pair = new Pair(Integer.valueOf(i2), Integer.valueOf((int) d2));
            }
            Logger logger = C7557a.f23040a;
            logger.mo6672i("ADAPTIVE_BANNER: InWidth: " + i + ", BannerAspectRatio: " + intValue3 + ", ScreenWidth: " + intValue + ", ScreenHeight: " + intValue2 + ", MinRefHeight: " + 50 + ", MaxRefHeight: " + d + ", AdaptiveHeight: " + d2 + ", AdaptiveSize: " + pair);
            return pair;
        }

        /* renamed from: b */
        public static Pair m5822b() {
            int intValue = ((Number) C13364a.m33638a((Context) null).mo59068c()).intValue();
            int c = C13364a.m33640c();
            int M0 = C17885a.m44413M0(C13364a.f33164j);
            if (M0 == 3) {
                int M02 = C17885a.m44413M0(c);
                if (M02 == 1) {
                    return new Pair(Integer.valueOf(intValue), 50);
                }
                if (M02 != 2) {
                    return new Pair(Integer.valueOf(intValue), 0);
                }
                return new Pair(Integer.valueOf(intValue), 32);
            } else if (M0 != 4) {
                return new Pair(Integer.valueOf(intValue), 0);
            } else {
                return new Pair(Integer.valueOf(intValue), 90);
            }
        }

        /* renamed from: c */
        public static boolean m5823c(UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType, UMOAdKitBannerType uMOAdKitBannerType) {
            int i;
            if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
                return false;
            }
            if (uMOAdKitBannerType == null) {
                i = -1;
            } else {
                i = C2220a.f7249a[uMOAdKitBannerType.ordinal()];
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 16:
                case 17:
                case 18:
                    return true;
                default:
                    return false;
            }
        }

        @Keep
        public final boolean doesUMOAdKiteExpectAppToUpdateLayoutParams(UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType, UMOAdKitBannerType uMOAdKitBannerType) {
            C24362h.m61211f(uMOAdKitInlineBannerCreativeType, "bannerCreativeType");
            C24362h.m61211f(uMOAdKitBannerType, "bannerType");
            int i = C2220a.f7250b[uMOAdKitInlineBannerCreativeType.ordinal()];
            if (i == 1) {
                int i2 = C2220a.f7249a[uMOAdKitBannerType.ordinal()];
                if (i2 == 15 || i2 == 19) {
                    return true;
                }
                return false;
            } else if (i != 2) {
                return false;
            } else {
                return true;
            }
        }

        @Keep
        public final C4403b getBannerSizeByBannerType(UMOAdKitBannerType uMOAdKitBannerType) {
            C4403b bVar;
            C24362h.m61211f(uMOAdKitBannerType, "bannerType");
            switch (C2220a.f7249a[uMOAdKitBannerType.ordinal()]) {
                case 1:
                    return new C4403b(Strategy.TTL_SECONDS_DEFAULT, 250);
                case 2:
                    return new C4403b(Strategy.TTL_SECONDS_DEFAULT, 50);
                case 3:
                    return new C4403b(320, 50);
                case 4:
                    return new C4403b(320, 100);
                case 5:
                    return new C4403b(250, 250);
                case 6:
                    return new C4403b(200, 200);
                case 7:
                    return new C4403b(468, 60);
                case 8:
                    return new C4403b(728, 90);
                case 9:
                    return new C4403b(970, 250);
                case 10:
                    return new C4403b(970, 90);
                case 11:
                    return new C4403b(Strategy.TTL_SECONDS_DEFAULT, 1050);
                case 12:
                    return new C4403b(160, 600);
                case 13:
                    return new C4403b(120, 60);
                case 14:
                    Pair b = m5822b();
                    bVar = new C4403b(((Number) b.mo59068c()).intValue(), ((Number) b.mo59069d()).intValue());
                    break;
                case 15:
                    Pair a = m5821a(0);
                    bVar = new C4403b(((Number) a.mo59068c()).intValue(), ((Number) a.mo59069d()).intValue());
                    break;
                case 16:
                    return new C4403b(640, 1136);
                case 17:
                    return new C4403b(LoadingDots.PULSE_DURATION, 1334);
                case 18:
                    return new C4403b(1080, 1920);
                default:
                    return new C4403b(-2, -2);
            }
            return bVar;
        }
    }

    /* renamed from: com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$a */
    public /* synthetic */ class C2221a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7251a;

        static {
            int[] iArr = new int[UMOAdKitBannerType.values().length];
            iArr[UMOAdKitBannerType.INTERSTITIAL_640x1136.ordinal()] = 1;
            iArr[UMOAdKitBannerType.INTERSTITIAL_750x1334.ordinal()] = 2;
            iArr[UMOAdKitBannerType.INTERSTITIAL_1080x1920.ordinal()] = 3;
            int[] iArr2 = new int[UMOAdKitBannerState.values().length];
            iArr2[UMOAdKitBannerState.INITIALIZED.ordinal()] = 1;
            iArr2[UMOAdKitBannerState.NONE.ordinal()] = 2;
            iArr2[UMOAdKitBannerState.DISPLAYED.ordinal()] = 3;
            iArr2[UMOAdKitBannerState.PLACEHOLDER_DISPLAYED.ordinal()] = 4;
            f7251a = iArr2;
        }
    }

    public UMOAdKitBannerView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        mo11066o();
    }

    @Keep
    public static final boolean doesUMOAdKiteExpectAppToUpdateLayoutParams(UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType, UMOAdKitBannerType uMOAdKitBannerType) {
        return f7241i.doesUMOAdKiteExpectAppToUpdateLayoutParams(uMOAdKitInlineBannerCreativeType, uMOAdKitBannerType);
    }

    private final String getBannerSaveStateInfo() {
        String str;
        Context context = C13233c.f32842a;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        if (uMOAdKitBannerParams == null) {
            str = null;
        } else {
            str = uMOAdKitBannerParams.mo11107d();
        }
        C12912d q = C13233c.m33348q(str);
        if (q == null) {
            return null;
        }
        C13295d m = C13233c.m33344m(q.f31967c);
        if (m != null) {
            m.mo40159A0(q.f31965a);
        }
        return q.f31965a;
    }

    @Keep
    public static final C4403b getBannerSizeByBannerType(UMOAdKitBannerType uMOAdKitBannerType) {
        return f7241i.getBannerSizeByBannerType(uMOAdKitBannerType);
    }

    private final String getSpotIdForLog() {
        String str;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        if (uMOAdKitBannerParams == null) {
            str = null;
        } else {
            str = uMOAdKitBannerParams.mo11107d();
        }
        if (C12954d.m32800c(str)) {
            return C17885a.m44403H0(str);
        }
        return "";
    }

    /* renamed from: h */
    public static void m5802h(UMOAdKitBannerView uMOAdKitBannerView, boolean z) {
        FrameLayout frameLayout = uMOAdKitBannerView.f7245e;
        if (frameLayout != null) {
            C13233c.f32843b.post(new C1799b(frameLayout, z, false));
        }
    }

    /* renamed from: l */
    public static final void m5803l(UMOAdKitBannerView uMOAdKitBannerView) {
        String str;
        boolean z;
        String d;
        AKPlaceholders placeholders;
        String str2;
        String str3;
        C24362h.m61211f(uMOAdKitBannerView, "this$0");
        String str4 = "";
        String str5 = null;
        if (uMOAdKitBannerView.mo11075q()) {
            Context context = C13233c.f32842a;
            UMOAdKitBannerParams uMOAdKitBannerParams = uMOAdKitBannerView.f7242b;
            if (uMOAdKitBannerParams == null) {
                str2 = null;
            } else {
                str2 = uMOAdKitBannerParams.mo11107d();
            }
            C12912d q = C13233c.m33348q(str2);
            if (q != null) {
                UMOAdKitBannerState uMOAdKitBannerState = q.f31968d;
                C24362h.m61211f(uMOAdKitBannerState, "<set-?>");
                q.f31969e = uMOAdKitBannerState;
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("Notifying UMO Ad Kit Banner Ad Event to App");
                String str6 = q.f31965a;
                if (C12954d.m32800c(str6)) {
                    str3 = C17885a.m44403H0(str6);
                } else {
                    str3 = str4;
                }
                J0.append(str3);
                J0.append(": Event: ");
                J0.append(UMOAdKitBannerAdEvent.BANNER_PLACEHOLDER_CLICKED);
                J0.append(" (Error: NONE)...");
                logger.mo6672i(J0.toString());
                C13233c.f32843b.post(new C7041e(8, uMOAdKitBannerView, q));
            }
        }
        AKHostedConfig aKHostedConfig = C13233c.f32845d;
        if (aKHostedConfig == null || (placeholders = aKHostedConfig.getPlaceholders()) == null) {
            str = null;
        } else {
            str = placeholders.getClickUrl();
        }
        C4402a aVar = C13233c.f32844c;
        if (aVar != null) {
            str5 = aVar.f15461g;
        }
        if (str5 == null) {
            str5 = uMOAdKitBannerView.f7248h;
        }
        boolean z2 = false;
        if (C12954d.m32800c(str) && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C24362h.m61208c(str);
        } else {
            if (C12954d.m32800c(str5) && (URLUtil.isHttpUrl(str5) || URLUtil.isHttpsUrl(str5))) {
                z2 = true;
            }
            if (z2) {
                C24362h.m61208c(str5);
                str = str5;
            } else {
                str = "https://support.umomobility.com/hc/en-us/articles/1500001282341-Plan-a-Trip-with-the-Umo-App-/?utm_source=umo&utm_medium=display&utm_campaign=Umo%20App%20Promotion%20April%202021&utm_content=umo%20app%20next%20stop%20alert";
            }
        }
        C7557a.f23040a.mo6672i(C13715c.m34246l(C21100e.m49315J0("Opening Placeholder Click Url"), uMOAdKitBannerView.getSpotIdForLog(), ": ", str, "..."));
        WeakReference<AKBrowserActivity> weakReference = AKBrowserActivity.f7313G;
        UMOAdKitBannerParams uMOAdKitBannerParams2 = uMOAdKitBannerView.f7242b;
        if (!(uMOAdKitBannerParams2 == null || (d = uMOAdKitBannerParams2.mo11107d()) == null)) {
            str4 = d;
        }
        AKBrowserActivity.C2225b.m5861a(str4, str, true);
    }

    /* renamed from: m */
    public static void m5804m(UMOAdKitBannerParams uMOAdKitBannerParams) throws zza {
        C21050d dVar;
        if (uMOAdKitBannerParams == null) {
            dVar = null;
        } else if (C12954d.m32800c(uMOAdKitBannerParams.mo11107d())) {
            dVar = C21050d.f52856a;
        } else {
            throw new zza(UMOAdKitError.INVALID_SPOT_ID.getDesc());
        }
        if (dVar == null) {
            throw new zza(UMOAdKitError.INVALID_BANNER_PARAMS.getDesc());
        }
    }

    private final void setPlaceholderImageViewStretchFlag(UMOAdKitBannerType uMOAdKitBannerType) {
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        boolean z;
        boolean z2;
        Companion companion = f7241i;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        if (uMOAdKitBannerParams == null) {
            uMOAdKitInlineBannerCreativeType = null;
        } else {
            uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams.mo11114i();
        }
        companion.getClass();
        if (!Companion.m5823c(uMOAdKitInlineBannerCreativeType, uMOAdKitBannerType)) {
            boolean z3 = true;
            if (uMOAdKitBannerType == UMOAdKitBannerType.CUSTOM_GWxGH) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (uMOAdKitBannerType == UMOAdKitBannerType.NONE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (uMOAdKitBannerType != UMOAdKitBannerType.SMART_SWxH) {
                        z3 = false;
                    }
                    if (z3) {
                        AKImageView aKImageView = this.f7246f;
                        if (aKImageView != null) {
                            aKImageView.setStretchEnabled$ads_release(false);
                            return;
                        }
                        return;
                    }
                    AKImageView aKImageView2 = this.f7246f;
                    if (aKImageView2 != null) {
                        aKImageView2.setStretchEnabled$ads_release(false);
                        return;
                    }
                    return;
                }
            }
        }
        AKImageView aKImageView3 = this.f7246f;
        if (aKImageView3 != null) {
            aKImageView3.setStretchEnabled$ads_release(false);
        }
    }

    private final void setStaticAppPlaceholderImage(String str) {
        Logger logger = C7557a.f23040a;
        StringBuilder t = C0016g.m36t("PLACEHOLDER: Displaying Static App Placeholder with Id: ", str);
        t.append(getSpotIdForLog());
        logger.mo6666c(t.toString());
        C13233c.f32843b.post(new C7218m(3, this, str));
    }

    private final void setWindowsInsets(WindowInsets windowInsets) {
        String str;
        Context context = C13233c.f32842a;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        WindowInsets windowInsets2 = null;
        if (uMOAdKitBannerParams == null) {
            str = null;
        } else {
            str = uMOAdKitBannerParams.mo11107d();
        }
        C12912d q = C13233c.m33348q(str);
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("$$$$$ Updating Window Insets: ");
        if (q != null) {
            windowInsets2 = q.f31977m;
        }
        J0.append(windowInsets2);
        J0.append(" -> ");
        J0.append(windowInsets);
        J0.append(getSpotIdForLog());
        J0.append(" $$$$$");
        logger.mo6666c(J0.toString());
        if (q != null) {
            q.f31977m = windowInsets;
        }
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: a */
    public final void mo11046a(UMOAdKitBannerType uMOAdKitBannerType) {
        C24362h.m61211f(uMOAdKitBannerType, "bannerType");
        FrameLayout frameLayout = this.f7245e;
        if (frameLayout != null) {
            if (frameLayout.getParent() == null) {
                C13233c.f32843b.post(new C0441n1(this, 6));
            }
            setPlaceholderImageViewStretchFlag(uMOAdKitBannerType);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C1501f.umoak_layout_banner_placeholder, (ViewGroup) null);
        if (inflate != null) {
            FrameLayout frameLayout2 = (FrameLayout) inflate;
            this.f7245e = frameLayout2;
            this.f7246f = (AKImageView) frameLayout2.findViewById(C1500e.iv_placeholder);
            setPlaceholderImageViewStretchFlag(uMOAdKitBannerType);
            AKImageView aKImageView = this.f7246f;
            if (aKImageView != null) {
                aKImageView.setOnClickListener(new C1800c(this, 0));
            }
            C13233c.f32843b.post(new C0441n1(this, 6));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: b */
    public final void mo11047b() {
        String str;
        String str2;
        if (getLocalVisibleRect(new Rect())) {
            Context context = C13233c.f32842a;
            UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
            String str3 = null;
            if (uMOAdKitBannerParams == null) {
                str = null;
            } else {
                str = uMOAdKitBannerParams.mo11107d();
            }
            C12912d q = C13233c.m33348q(str);
            if (q == null) {
                str2 = null;
            } else {
                str2 = q.f31967c;
            }
            if (C13233c.m33344m(str2) != null) {
                if (q != null) {
                    str3 = q.f31965a;
                }
                if (C12954d.m32800c(str3)) {
                    C24362h.m61208c(str3);
                    C13295d.m33440W(str3);
                    return;
                }
            }
        }
        C7557a.f23040a.mo6672i(C24362h.m61216k(getSpotIdForLog(), "BANNER_VIEWABILITY: Banner not visible on the Device Screen"));
        if (getViewTreeObserver().isAlive()) {
            getViewTreeObserver().removeOnScrollChangedListener(this);
            getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    /* renamed from: c */
    public final boolean mo11048c() {
        String str;
        Context context = C13233c.f32842a;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        if (uMOAdKitBannerParams == null) {
            str = null;
        } else {
            str = uMOAdKitBannerParams.mo11107d();
        }
        C12912d q = C13233c.m33348q(str);
        boolean z = false;
        if (q == null) {
            return false;
        }
        if (q.f31976l == zzj.VISIBLE && getLocalVisibleRect(new Rect())) {
            z = true;
        }
        Logger logger = C7557a.f23040a;
        logger.mo6666c("$$$$$ BANNER_VISIBILITY: Is Banner Visible: " + z + getSpotIdForLog() + " $$$$$");
        return z;
    }

    /* renamed from: d */
    public final boolean mo11049d() {
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        if (uMOAdKitBannerParams != null && uMOAdKitBannerParams.mo11123r() > 0 && uMOAdKitBannerParams.mo11116k() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo11050e() {
        Object obj;
        String k = C24362h.m61216k(getSpotIdForLog(), "refreshBanner()");
        C24362h.m61211f(k, "funcName");
        C7557a.f23040a.mo6666c(C24362h.m61216k(" -> START", k));
        try {
            C13301f fVar = C13301f.f33010a;
            C13301f.m33526e();
            C13295d j = mo11063j(false);
            if (j != null) {
                j.mo40183e0(false);
                if (!j.mo40160B0()) {
                    j.mo40180b0(false);
                    obj = C21050d.f52856a;
                    Throwable a = Result.m58423a(obj);
                    if (a != null) {
                        mo11065n("refreshBanner", a);
                    }
                    String k2 = C24362h.m61216k(getSpotIdForLog(), "refreshBanner()");
                    C24362h.m61211f(k2, "funcName");
                    C7557a.f23040a.mo6666c(C24362h.m61216k(" -> END", k2));
                    return;
                }
                throw new zza(UMOAdKitError.API_NOT_ALLOWED_FOR_INTERSTITIAL_USECASE.getDesc());
            }
            throw new zza(UMOAdKitError.BANNER_OPERATION_NOT_ALLOWED_NOW.getDesc());
        } catch (Throwable th) {
            obj = C17885a.m44400G(th);
        }
    }

    /* renamed from: f */
    public final void mo11051f() {
        UMOAdKitBannerType uMOAdKitBannerType;
        Companion companion = f7241i;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType = null;
        if (uMOAdKitBannerParams == null) {
            uMOAdKitBannerType = null;
        } else {
            uMOAdKitBannerType = uMOAdKitBannerParams.mo11122q();
        }
        UMOAdKitBannerParams uMOAdKitBannerParams2 = this.f7242b;
        if (uMOAdKitBannerParams2 != null) {
            uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams2.mo11114i();
        }
        companion.getClass();
        if (Companion.m5823c(uMOAdKitInlineBannerCreativeType, uMOAdKitBannerType)) {
            mo11077s();
        } else if (!mo11049d()) {
            mo11064k(-2, -2);
        } else {
            mo11077s();
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [kotlin.Result$Failure] */
    /* JADX WARNING: type inference failed for: r0v9, types: [bf0.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11052g(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.getSpotIdForLog()
            java.lang.String r1 = "showBanner()"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r1)
            java.lang.String r2 = "funcName"
            mf0.C24362h.m61211f(r0, r2)
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r4 = " -> START"
            java.lang.String r0 = mf0.C24362h.m61216k(r4, r0)
            r3.mo6666c(r0)
            r0 = 0
            yb0.f r3 = yb0.C13301f.f33010a     // Catch:{ all -> 0x00b5 }
            yb0.C13301f.m33526e()     // Catch:{ all -> 0x00b5 }
            boolean r3 = nc0.C12954d.m32800c(r8)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x002b
            mf0.C24362h.m61208c(r8)     // Catch:{ all -> 0x00b5 }
            r3 = r8
            goto L_0x0041
        L_0x002b:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r7.getBannerParams()     // Catch:{ all -> 0x00b5 }
            m5804m(r3)     // Catch:{ all -> 0x00b5 }
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r7.getBannerParams()     // Catch:{ all -> 0x00b5 }
            if (r3 != 0) goto L_0x003a
            r3 = r0
            goto L_0x003e
        L_0x003a:
            java.lang.String r3 = r3.mo11107d()     // Catch:{ all -> 0x00b5 }
        L_0x003e:
            mf0.C24362h.m61208c(r3)     // Catch:{ all -> 0x00b5 }
        L_0x0041:
            android.content.Context r4 = wb0.C13233c.f32842a     // Catch:{ all -> 0x00b5 }
            boolean r4 = nc0.C12954d.m32800c(r3)     // Catch:{ all -> 0x00b5 }
            if (r4 != 0) goto L_0x004b
            r4 = r0
            goto L_0x004c
        L_0x004b:
            r4 = r3
        L_0x004c:
            yb0.d r4 = wb0.C13233c.m33344m(r4)     // Catch:{ all -> 0x00b5 }
            r5 = 1
            if (r4 != 0) goto L_0x005f
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r8 = r7.getBannerParams()     // Catch:{ all -> 0x00b5 }
            m5804m(r8)     // Catch:{ all -> 0x00b5 }
            yb0.d r4 = r7.mo11063j(r5)     // Catch:{ all -> 0x00b5 }
            goto L_0x009e
        L_0x005f:
            if (r8 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r5 = 0
        L_0x0063:
            mc0.d r8 = wb0.C13233c.m33348q(r3)     // Catch:{ all -> 0x00b5 }
            if (r8 != 0) goto L_0x006a
            goto L_0x009e
        L_0x006a:
            if (r5 == 0) goto L_0x007a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r8 = r8.f31966b     // Catch:{ all -> 0x00b5 }
            if (r8 != 0) goto L_0x0072
            r8 = r0
            goto L_0x0076
        L_0x0072:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams.m5826a(r8)     // Catch:{ all -> 0x00b5 }
        L_0x0076:
            r7.setBannerParams(r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x009e
        L_0x007a:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r5 = r7.getBannerParams()     // Catch:{ all -> 0x00b5 }
            if (r5 != 0) goto L_0x0081
            goto L_0x0092
        L_0x0081:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r8.f31966b     // Catch:{ all -> 0x00b5 }
            if (r6 != 0) goto L_0x0087
            r6 = r0
            goto L_0x008b
        L_0x0087:
            com.umo.ads.u.zzi r6 = r6.mo11118m()     // Catch:{ all -> 0x00b5 }
        L_0x008b:
            if (r6 != 0) goto L_0x008f
            com.umo.ads.u.zzi r6 = com.umo.ads.p350u.zzi.INLINE     // Catch:{ all -> 0x00b5 }
        L_0x008f:
            r5.mo11098C(r6)     // Catch:{ all -> 0x00b5 }
        L_0x0092:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r5 = r7.getBannerParams()     // Catch:{ all -> 0x00b5 }
            r8.f31966b = r5     // Catch:{ all -> 0x00b5 }
            c7.a r5 = r7.getBannerAdListener()     // Catch:{ all -> 0x00b5 }
            r8.f31970f = r5     // Catch:{ all -> 0x00b5 }
        L_0x009e:
            if (r4 != 0) goto L_0x00a1
            goto L_0x00ba
        L_0x00a1:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r8 = r7.f7242b     // Catch:{ all -> 0x00b5 }
            if (r8 != 0) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            java.lang.String r0 = r8.mo11107d()     // Catch:{ all -> 0x00b5 }
        L_0x00aa:
            wb0.C13233c.m33337f(r7, r0)     // Catch:{ all -> 0x00b5 }
            boolean r8 = r7.f7244d     // Catch:{ all -> 0x00b5 }
            r4.mo40196u0(r3, r8)     // Catch:{ all -> 0x00b5 }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00b5 }
            goto L_0x00ba
        L_0x00b5:
            r8 = move-exception
            kotlin.Result$Failure r0 = p584jl.C17885a.m44400G(r8)
        L_0x00ba:
            java.lang.Throwable r8 = kotlin.Result.m58423a(r0)
            if (r8 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            java.lang.String r0 = "showBanner"
            r7.mo11065n(r0, r8)
        L_0x00c6:
            java.lang.String r8 = r7.getSpotIdForLog()
            java.lang.String r8 = mf0.C24362h.m61216k(r8, r1)
            mf0.C24362h.m61211f(r8, r2)
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = " -> END"
            java.lang.String r8 = mf0.C24362h.m61216k(r1, r8)
            r0.mo6666c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.mo11052g(java.lang.String):void");
    }

    public final C1798a getBannerAdListener() {
        return this.f7243c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p061d7.C4403b getBannerCreativeSize() {
        /*
            r6 = this;
            java.lang.String r0 = r6.getSpotIdForLog()
            java.lang.String r1 = "getBannerCreativeSize()"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r1)
            java.lang.String r1 = "funcName"
            mf0.C24362h.m61211f(r0, r1)
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = " -> START"
            java.lang.String r0 = mf0.C24362h.m61216k(r3, r0)
            r2.mo6666c(r0)
            r0 = 0
            yb0.f r2 = yb0.C13301f.f33010a     // Catch:{ all -> 0x00a6 }
            yb0.C13301f.m33526e()     // Catch:{ all -> 0x00a6 }
            android.content.Context r2 = wb0.C13233c.f32842a     // Catch:{ all -> 0x00a6 }
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r2 = r6.getBannerParams()     // Catch:{ all -> 0x00a6 }
            r3 = 0
            if (r2 != 0) goto L_0x002b
            r2 = r3
            goto L_0x002f
        L_0x002b:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r2 = r2.mo11114i()     // Catch:{ all -> 0x00a6 }
        L_0x002f:
            boolean r2 = wb0.C13233c.m33339h(r2)     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x009a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r2 = r6.getBannerParams()     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x003d
            r2 = r3
            goto L_0x0041
        L_0x003d:
            java.lang.String r2 = r2.mo11107d()     // Catch:{ all -> 0x00a6 }
        L_0x0041:
            mc0.d r2 = wb0.C13233c.m33348q(r2)     // Catch:{ all -> 0x00a6 }
            kotlin.Pair r4 = new kotlin.Pair     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r5 = r2.f31966b     // Catch:{ all -> 0x00a6 }
            if (r5 != 0) goto L_0x0050
        L_0x004e:
            r5 = r3
            goto L_0x0058
        L_0x0050:
            int r5 = r5.mo11115j()     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a6 }
        L_0x0058:
            if (r5 != 0) goto L_0x0067
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r5 = r6.getBannerParams()     // Catch:{ all -> 0x00a6 }
            if (r5 != 0) goto L_0x0062
            r5 = 0
            goto L_0x006b
        L_0x0062:
            int r5 = r5.mo11115j()     // Catch:{ all -> 0x00a6 }
            goto L_0x006b
        L_0x0067:
            int r5 = r5.intValue()     // Catch:{ all -> 0x00a6 }
        L_0x006b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x0072
            goto L_0x007f
        L_0x0072:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r2 = r2.f31966b     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            int r2 = r2.mo11112h()     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a6 }
        L_0x007f:
            if (r3 != 0) goto L_0x008e
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r2 = r6.getBannerParams()     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x0089
            r2 = 0
            goto L_0x0092
        L_0x0089:
            int r2 = r2.mo11112h()     // Catch:{ all -> 0x00a6 }
            goto L_0x0092
        L_0x008e:
            int r2 = r3.intValue()     // Catch:{ all -> 0x00a6 }
        L_0x0092:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a6 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x00a6 }
            goto L_0x00ab
        L_0x009a:
            com.umo.ads.d.zza r2 = new com.umo.ads.d.zza     // Catch:{ all -> 0x00a6 }
            com.cubic.umo.ad.ext.types.UMOAdKitError r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.API_NOT_ALLOWED_FOR_VIDEO_SPOT     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = r3.getDesc()     // Catch:{ all -> 0x00a6 }
            r2.<init>(r3)     // Catch:{ all -> 0x00a6 }
            throw r2     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r2 = move-exception
            kotlin.Result$Failure r4 = p584jl.C17885a.m44400G(r2)
        L_0x00ab:
            java.lang.Throwable r2 = kotlin.Result.m58423a(r4)
            if (r2 != 0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r3 = "getBannerCreativeSize"
            r6.mo11065n(r3, r2)
        L_0x00b7:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r3, r0)
            boolean r0 = r4 instanceof kotlin.Result.Failure
            if (r0 == 0) goto L_0x00c9
            r4 = r2
        L_0x00c9:
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getBannerCreativeSize(): BannerCreativeSize: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = r6.getSpotIdForLog()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            mf0.C24362h.m61211f(r0, r1)
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r2 = " -> END"
            java.lang.String r0 = mf0.C24362h.m61216k(r2, r0)
            r1.mo6666c(r0)
            d7.b r0 = new d7.b
            java.lang.Object r1 = r4.mo59068c()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r4.mo59069d()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.getBannerCreativeSize():d7.b");
    }

    public final UMOAdKitBannerParams getBannerParams() {
        return this.f7242b;
    }

    public final UMOAdKitBannerState getBannerState() {
        Object obj;
        String str;
        String k = C24362h.m61216k(getSpotIdForLog(), "getBannerState()");
        C24362h.m61211f(k, "funcName");
        C7557a.f23040a.mo6666c(C24362h.m61216k(" -> START", k));
        UMOAdKitBannerState uMOAdKitBannerState = null;
        try {
            C13301f fVar = C13301f.f33010a;
            C13301f.m33526e();
            Context context = C13233c.f32842a;
            UMOAdKitBannerParams bannerParams = getBannerParams();
            if (bannerParams == null) {
                str = null;
            } else {
                str = bannerParams.mo11107d();
            }
            C12912d q = C13233c.m33348q(str);
            if (q == null) {
                obj = null;
            } else {
                obj = q.f31968d;
            }
        } catch (Throwable th) {
            obj = C17885a.m44400G(th);
        }
        Throwable a = Result.m58423a(obj);
        if (a != null) {
            mo11065n("getBannerState", a);
        }
        if (!(obj instanceof Result.Failure)) {
            uMOAdKitBannerState = obj;
        }
        UMOAdKitBannerState uMOAdKitBannerState2 = uMOAdKitBannerState;
        C7557a.f23040a.mo6672i("BANNER_STATE: " + uMOAdKitBannerState2 + getSpotIdForLog());
        String k2 = C24362h.m61216k(getSpotIdForLog(), "getBannerState()");
        C24362h.m61211f(k2, "funcName");
        C7557a.f23040a.mo6666c(C24362h.m61216k(" -> END", k2));
        if (uMOAdKitBannerState2 == null) {
            return UMOAdKitBannerState.NONE;
        }
        return uMOAdKitBannerState2;
    }

    public final UMOAdKitBannerType getDefaultPHBannerType$ads_release() {
        return this.f7247g;
    }

    public final Pair<Integer, Integer> getNonStandardOrVideoBannerWidthAndHeight$ads_release() {
        C21050d dVar;
        boolean z;
        int i;
        int i2;
        Integer num;
        Object obj = null;
        if (getLayoutParams() == null) {
            dVar = null;
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i3 = layoutParams.width;
            if (i3 <= 0 || layoutParams.height <= 0) {
                dVar = C21050d.f52856a;
            } else {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
                Integer valueOf = Integer.valueOf((int) ((((float) i3) / displayMetrics.density) + 0.5f));
                int i4 = layoutParams.height;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                C24362h.m61210e(displayMetrics2, "getSystem().displayMetrics");
                return new Pair<>(valueOf, Integer.valueOf((int) ((((float) i4) / displayMetrics2.density) + 0.5f)));
            }
        }
        int i5 = 0;
        if (dVar == null) {
            UMOAdKitBannerParams bannerParams = getBannerParams();
            if (bannerParams == null) {
                i = 0;
            } else {
                i = bannerParams.mo11123r();
            }
            if (i > 0) {
                UMOAdKitBannerParams bannerParams2 = getBannerParams();
                if (bannerParams2 == null) {
                    i2 = 0;
                } else {
                    i2 = bannerParams2.mo11116k();
                }
                if (i2 > 0) {
                    UMOAdKitBannerParams bannerParams3 = getBannerParams();
                    if (bannerParams3 == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(bannerParams3.mo11123r());
                    }
                    C24362h.m61208c(num);
                    UMOAdKitBannerParams bannerParams4 = getBannerParams();
                    if (bannerParams4 != null) {
                        obj = Integer.valueOf(bannerParams4.mo11116k());
                    }
                    C24362h.m61208c(obj);
                    return new Pair<>(num, obj);
                }
            }
        }
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        if (uMOAdKitBannerParams != null) {
            obj = uMOAdKitBannerParams.mo11122q();
        }
        if (obj == UMOAdKitBannerType.ADAPTIVE_GWxAH) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new Pair<>(-2, -2);
        }
        UMOAdKitBannerParams uMOAdKitBannerParams2 = this.f7242b;
        if (uMOAdKitBannerParams2 != null) {
            i5 = uMOAdKitBannerParams2.mo11123r();
        }
        f7241i.getClass();
        return Companion.m5821a(i5);
    }

    public final UMOAdKitBannerType getPlaceholderBannerType$ads_release() {
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        UMOAdKitBannerType q = uMOAdKitBannerParams == null ? null : uMOAdKitBannerParams.mo11122q();
        return q == null ? this.f7247g : q;
    }

    public final String getPlaceholderClickUrl$ads_release() {
        return this.f7248h;
    }

    public final FrameLayout getPlaceholderLayout$ads_release() {
        return this.f7245e;
    }

    /* renamed from: i */
    public final void mo11062i(int i) {
        String str;
        zzj zzj;
        UMOAdKit.f7238a.getClass();
        if (UMOAdKit.Companion.m5801a()) {
            Context context = C13233c.f32842a;
            UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
            if (uMOAdKitBannerParams == null) {
                str = null;
            } else {
                str = uMOAdKitBannerParams.mo11107d();
            }
            C12912d q = C13233c.m33348q(str);
            if (q != null) {
                if (i == 4) {
                    zzj = zzj.INVISIBLE;
                } else if (i != 8) {
                    zzj = zzj.VISIBLE;
                } else {
                    zzj = zzj.GONE;
                }
                if (q.f31976l != zzj) {
                    Logger logger = C7557a.f23040a;
                    StringBuilder J0 = C21100e.m49315J0("$$$$$ BANNER_VISIBILITY_UPDATE|LIFECYCLE_EVENT");
                    J0.append(getSpotIdForLog());
                    J0.append(": [");
                    J0.append(q.f31976l.name());
                    J0.append(" -> ");
                    J0.append(zzj.name());
                    J0.append("] $$$$$");
                    logger.mo6672i(J0.toString());
                    q.f31976l = zzj;
                    C13295d m = C13233c.m33344m(q.f31967c);
                    if (m != null) {
                        if (q.f31976l == zzj.VISIBLE) {
                            m.mo40166G0();
                            C13295d.m33440W(q.f31965a);
                            m.mo40170J0(q.f31965a);
                            return;
                        }
                        C13308i iVar = q.f31974j;
                        if (iVar != null) {
                            iVar.mo40216a(false);
                        }
                        m.mo40159A0(q.f31965a);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: j */
    public final C13295d mo11063j(boolean z) {
        String str;
        String str2;
        String str3;
        zzi zzi;
        Context context = C13233c.f32842a;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        String str4 = null;
        if (uMOAdKitBannerParams == null) {
            str = null;
        } else {
            str = uMOAdKitBannerParams.mo11107d();
        }
        if (!C12954d.m32800c(str)) {
            str = null;
        }
        if (!C12954d.m32800c(str)) {
            return null;
        }
        C13295d m = C13233c.m33344m(str);
        if (m != null || !z) {
            UMOAdKitBannerParams uMOAdKitBannerParams2 = this.f7242b;
            if (uMOAdKitBannerParams2 != null) {
                str4 = uMOAdKitBannerParams2.mo11107d();
            }
            C12912d q = C13233c.m33348q(str4);
            if (q == null) {
                return m;
            }
            UMOAdKitBannerParams bannerParams = getBannerParams();
            q.f31966b = bannerParams;
            if (bannerParams != null) {
                bannerParams.mo11098C(zzi.INLINE);
            }
            q.f31970f = getBannerAdListener();
            return m;
        }
        C12912d q2 = C13233c.m33348q(str);
        if (q2 == null) {
            q2 = null;
        } else {
            UMOAdKitBannerParams bannerParams2 = getBannerParams();
            if (bannerParams2 != null) {
                UMOAdKitBannerParams uMOAdKitBannerParams3 = q2.f31966b;
                if (uMOAdKitBannerParams3 == null) {
                    zzi = null;
                } else {
                    zzi = uMOAdKitBannerParams3.mo11118m();
                }
                if (zzi == null) {
                    zzi = zzi.INLINE;
                }
                bannerParams2.mo11098C(zzi);
            }
            q2.f31966b = getBannerParams();
            q2.f31970f = getBannerAdListener();
        }
        if (q2 == null) {
            UMOAdKitBannerParams uMOAdKitBannerParams4 = this.f7242b;
            if (uMOAdKitBannerParams4 == null) {
                str3 = null;
            } else {
                str3 = uMOAdKitBannerParams4.mo11107d();
            }
            if (!C12954d.m32800c(str3)) {
                str3 = null;
            }
            if (str3 == null) {
                q2 = null;
            } else {
                C12912d dVar = new C12912d(str3);
                dVar.f31966b = uMOAdKitBannerParams4;
                q2 = dVar;
            }
        }
        if (q2 == null) {
            return m;
        }
        C24362h.m61208c(str);
        q2.f31967c = str;
        UMOAdKitBannerParams uMOAdKitBannerParams5 = q2.f31966b;
        if (uMOAdKitBannerParams5 != null) {
            uMOAdKitBannerParams5.mo11098C(zzi.INLINE);
        }
        q2.f31970f = getBannerAdListener();
        String str5 = "";
        if (C12954d.m32800c(str)) {
            if (C13233c.f32850i == null) {
                C13233c.f32850i = new ConcurrentHashMap<>();
            }
            Logger logger = C7557a.f23040a;
            if (C12954d.m32800c(str)) {
                str2 = C17885a.m44403H0(str);
            } else {
                str2 = str5;
            }
            logger.mo6666c(C24362h.m61216k(str2, "AKMGR_BANNER_INFO: Adding BannerInfo"));
            ConcurrentHashMap<String, C12912d> concurrentHashMap = C13233c.f32850i;
            if (concurrentHashMap != null) {
                C12912d put = concurrentHashMap.put(str, q2);
            }
        }
        List D = C17875h.m44280D(str);
        Logger logger2 = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("BANNER_AD_HANDLER: Creating AKBannerAdHandler");
        boolean z2 = true;
        if (!D.isEmpty()) {
            str5 = C14226d.m35344K0(C13555b.m33972k(" (SpotId(s): ["), C23825c.m58520q0(D, ", ", (String) null, (String) null, (C24236l) null, 62));
        }
        J0.append(str5);
        J0.append(" (Key: ");
        J0.append(q2.f31967c);
        J0.append(")...");
        logger2.mo6666c(J0.toString());
        C13295d dVar2 = new C13295d();
        String str6 = " (Key: " + str + ')';
        if (!C12954d.m32800c(str)) {
            z2 = false;
        } else {
            if (C13233c.f32848g == null) {
                C13233c.f32848g = new ConcurrentHashMap<>();
            }
            C7557a.f23040a.mo6666c(C24362h.m61216k(str6, "AKMGR_BANNER_AD_HANDLER: Adding AKBannerAdHandler"));
            ConcurrentHashMap<String, C13295d> concurrentHashMap2 = C13233c.f32848g;
            if (concurrentHashMap2 != null) {
                C13295d put2 = concurrentHashMap2.put(str, dVar2);
            }
        }
        if (!z2) {
            return null;
        }
        dVar2.f32985b = str;
        ? r0 = dVar2.f32986c;
        if (r0 != 0) {
            r0.addAll(D);
        }
        return dVar2;
    }

    /* renamed from: k */
    public final void mo11064k(int i, int i2) {
        Logger logger = C7557a.f23040a;
        logger.mo6672i("LAYOUT_PARAMS_BANNER: Width: " + i + ", Height: " + i2);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T layoutParams = getLayoutParams();
        ref$ObjectRef.element = layoutParams;
        if (layoutParams == null) {
            ref$ObjectRef.element = new FrameLayout.LayoutParams(i, i2, 17);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        C13233c.f32843b.post(new C7097r(8, this, ref$ObjectRef));
    }

    /* renamed from: n */
    public final void mo11065n(String str, Throwable th) {
        String str2;
        Companion companion = f7241i;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        Boolean bool = null;
        if (uMOAdKitBannerParams == null) {
            str2 = null;
        } else {
            str2 = uMOAdKitBannerParams.mo11107d();
        }
        C1798a aVar = this.f7243c;
        companion.getClass();
        if (aVar == null) {
            C12912d q = C13233c.m33348q(str2);
            if (q == null) {
                aVar = null;
            } else {
                aVar = q.f31970f;
            }
        }
        String str3 = "";
        if (th instanceof zza) {
            if (str2 == null) {
                str2 = ((zza) th).zza;
            }
            UMOAdKitError.C2223a aVar2 = UMOAdKitError.Companion;
            String localizedMessage = th.getLocalizedMessage();
            aVar2.getClass();
            UMOAdKitError uMOAdKitError = (UMOAdKitError) UMOAdKitError.map.get(localizedMessage);
            if (uMOAdKitError == null) {
                uMOAdKitError = UMOAdKitError.UNKNOWN;
            }
            StringBuilder J0 = C21100e.m49315J0("UMO Ad Kit BANNER_ERROR to App (API Failure)");
            if (C12954d.m32800c(str2)) {
                str3 = C17885a.m44403H0(str2);
            }
            J0.append(str3);
            J0.append(" (Error: ");
            J0.append(uMOAdKitError);
            J0.append(')');
            String sb = J0.toString();
            if (aVar != null) {
                C7557a.f23040a.mo6667d(C0017h.m56M("BANNER_API_ERROR: ", str, "(): Notifying ", sb, "..."));
                bool = Boolean.valueOf(C13233c.f32843b.post(new C1801d(0, aVar, str2, uMOAdKitError)));
            }
            if (bool == null) {
                C7557a.f23040a.mo6667d(C0017h.m56M("BANNER_API_ERROR: ", str, "(): Unable to notify ", sb, "..."));
                return;
            }
            return;
        }
        Logger logger = C7557a.f23040a;
        StringBuilder t = C0016g.m36t(str, "() failed: ");
        t.append(th.getLocalizedMessage());
        if (C12954d.m32800c(str2)) {
            str3 = C17885a.m44403H0(str2);
        }
        t.append(str3);
        logger.mo6667d(t.toString());
    }

    /* renamed from: o */
    public final void mo11066o() {
        if (!isSaveEnabled()) {
            Logger logger = C7557a.f23040a;
            logger.mo6672i("BANNER_INSTANCE_STATE: " + true + getSpotIdForLog());
            setSaveEnabled(true);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 28) {
            setWindowsInsets(windowInsets);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            setWindowsInsets(getRootWindowInsets());
        }
        Context context = C13233c.f32842a;
        Context applicationContext = getContext().getApplicationContext();
        C24362h.m61210e(applicationContext, "this.context.applicationContext");
        C13233c.f32842a = applicationContext;
        if (this.f7245e == null) {
            setPlaceholder$ads_release(this.f7247g);
            return;
        }
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        String str = null;
        if (uMOAdKitBannerParams != null) {
            str = uMOAdKitBannerParams.mo11107d();
        }
        C12912d q = C13233c.m33348q(str);
        if (q != null && q.f31968d != UMOAdKitBannerState.DISPLAYED) {
            m5802h(this, true);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C12912d q;
        C13295d m;
        AKAdViewLifecycleObserver aKAdViewLifecycleObserver;
        if (!isAttachedToWindow()) {
            C7557a.f23040a.mo6666c(C24362h.m61216k(getSpotIdForLog(), "BANNER_INSTANCE_STATE (Restore): Banner not attached to Window"));
            return;
        }
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("BROADCAST_IDENTIFIER");
            parcelable = bundle.getParcelable("SUPER_STATE");
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("BANNER_INSTANCE_STATE (Restore)");
            J0.append(getSpotIdForLog());
            J0.append(": Restoring Instance State: BannerInstanceSpotId: ");
            J0.append(string);
            logger.mo6672i(J0.toString());
            if (!(!C12954d.m32800c(string) || (q = C13233c.m33348q(string)) == null || (m = C13233c.m33344m(q.f31967c)) == null)) {
                setBannerParams(q.f31966b);
                mo11051f();
                ViewGroup viewGroup = q.f31973i;
                if (viewGroup != null) {
                    String str = q.f31965a;
                    C24362h.m61211f(str, "spotId");
                    C12912d q2 = C13233c.m33348q(str);
                    if (!(q2 == null || q2.f31978n == null)) {
                        Lifecycle j = C13233c.m33341j(str);
                        if (!(j == null || (aKAdViewLifecycleObserver = q2.f31978n) == null)) {
                            j.mo4226c(aKAdViewLifecycleObserver);
                            C7557a.f23040a.mo6672i(C24362h.m61216k(aKAdViewLifecycleObserver.f7312c, "LIFECYCLE_EVENT: Lifecycle Observer REMOVED"));
                        }
                        q2.f31978n = null;
                    }
                    if (string == null) {
                        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
                        if (uMOAdKitBannerParams == null) {
                            string = null;
                        } else {
                            string = uMOAdKitBannerParams.mo11107d();
                        }
                    }
                    C13233c.m33337f(this, string);
                    m.mo40190n0(q.f31965a);
                    C13233c.f32843b.post(new C5794m(m, q, viewGroup, this, 1));
                    m.mo40170J0(q.f31965a);
                }
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r7 = this;
            super.onSaveInstanceState()
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto L_0x0018
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = r7.getSpotIdForLog()
            java.lang.String r2 = "BANNER_INSTANCE_STATE (Save): BannerView NOT ATTACHED to Window"
            java.lang.String r1 = mf0.C24362h.m61216k(r1, r2)
            r0.mo6666c(r1)
        L_0x0018:
            android.content.Context r0 = wb0.C13233c.f32842a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r0 = r7.f7242b
            r1 = 0
            if (r0 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0025
        L_0x0021:
            java.lang.String r0 = r0.mo11107d()
        L_0x0025:
            mc0.d r0 = wb0.C13233c.m33348q(r0)
            boolean r2 = r7.mo11075q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0033
            goto L_0x00bc
        L_0x0033:
            if (r0 != 0) goto L_0x0037
            r2 = r1
            goto L_0x0039
        L_0x0037:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r2 = r0.f31968d
        L_0x0039:
            if (r2 != 0) goto L_0x003d
            r2 = -1
            goto L_0x0045
        L_0x003d:
            int[] r5 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.C2221a.f7251a
            int r2 = r2.ordinal()
            r2 = r5[r2]
        L_0x0045:
            if (r2 != r4) goto L_0x005d
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r2 = r0.f31969e
            int[] r4 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.C2221a.f7251a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r4 = 2
            if (r2 == r4) goto L_0x005b
            r4 = 3
            if (r2 == r4) goto L_0x005b
            r4 = 4
            if (r2 == r4) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r2 = 0
            goto L_0x005e
        L_0x005d:
            r2 = 1
        L_0x005e:
            if (r2 != 0) goto L_0x006f
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.String r5 = r7.getSpotIdForLog()
            java.lang.String r6 = "BANNER_INSTANCE_STATE (Save: NOT_REQUIRED): BANNER State doesn't require Save / Restore"
            java.lang.String r5 = mf0.C24362h.m61216k(r5, r6)
            r4.mo6666c(r5)
        L_0x006f:
            if (r0 != 0) goto L_0x0073
            r0 = r1
            goto L_0x0075
        L_0x0073:
            java.lang.String r0 = r0.f31967c
        L_0x0075:
            yb0.d r0 = wb0.C13233c.m33344m(r0)
            if (r0 != 0) goto L_0x007d
            r3 = r2
            goto L_0x00bc
        L_0x007d:
            java.util.List<java.lang.String> r0 = r0.f32986c
            java.util.Iterator r0 = r0.iterator()
        L_0x0083:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x009d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            mc0.d r4 = wb0.C13233c.m33348q(r2)
            if (r4 != 0) goto L_0x0096
            goto L_0x0083
        L_0x0096:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r4 = r4.f31968d
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r5 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.CLICKED
            if (r4 != r5) goto L_0x0083
            goto L_0x009e
        L_0x009d:
            r2 = r1
        L_0x009e:
            if (r2 != 0) goto L_0x00a1
            goto L_0x00b9
        L_0x00a1:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            boolean r4 = nc0.C12954d.m32800c(r2)
            if (r4 == 0) goto L_0x00ae
            java.lang.String r4 = p584jl.C17885a.m44403H0(r2)
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r4 = ""
        L_0x00b0:
            java.lang.String r5 = "BANNER_INSTANCE_STATE (Save: NOT_REQUIRED): One of the Banner(s) is in CLICKED state"
            java.lang.String r4 = mf0.C24362h.m61216k(r4, r5)
            r0.mo6666c(r4)
        L_0x00b9:
            if (r2 != 0) goto L_0x00bc
            r3 = 1
        L_0x00bc:
            if (r3 != 0) goto L_0x00bf
            return r1
        L_0x00bf:
            java.lang.String r0 = r7.getBannerSaveStateInfo()
            if (r0 != 0) goto L_0x00c6
            return r1
        L_0x00c6:
            java.lang.String r1 = "BROADCAST_IDENTIFIER"
            android.os.Bundle r1 = p379.C25541a.m63872b(r1, r0)
            android.os.Parcelable r2 = super.onSaveInstanceState()
            java.lang.String r3 = "SUPER_STATE"
            r1.putParcelable(r3, r2)
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = "BANNER_INSTANCE_STATE (Save)"
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            java.lang.String r4 = r7.getSpotIdForLog()
            r3.append(r4)
            java.lang.String r4 = ": Saving Instance State: SpotIdToBeSaved: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.mo6672i(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.onSaveInstanceState():android.os.Parcelable");
    }

    public final void onScrollChanged() {
        String str;
        C13295d m;
        String str2;
        Context context = C13233c.f32842a;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        if (uMOAdKitBannerParams == null) {
            str = null;
        } else {
            str = uMOAdKitBannerParams.mo11107d();
        }
        C12912d q = C13233c.m33348q(str);
        if (q != null && (m = C13233c.m33344m(q.f31967c)) != null) {
            String str3 = q.f31965a;
            C24362h.m61211f(str3, "spotId");
            UMOAdKitBannerView s = C13233c.m33350s(str3);
            if (s != null) {
                Logger logger = C7557a.f23040a;
                if (C12954d.m32800c(str3)) {
                    str2 = C17885a.m44403H0(str3);
                } else {
                    str2 = "";
                }
                logger.mo6666c(C24362h.m61216k(str2, "BANNER_VISIBILITY: OnScrollChangedListener():"));
                if (s.mo11048c()) {
                    C13295d.m33440W(str3);
                    m.mo40166G0();
                }
            }
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        C24362h.m61211f(view, "changedView");
        Logger logger = C7557a.f23040a;
        logger.mo6666c("BANNER_VISIBILITY|LIFECYCLE_EVENT: UMOAdKitBannerView: onVisibilityChanged(): Visibility: " + i + getSpotIdForLog());
        super.onVisibilityChanged(view, i);
    }

    public final void onWindowVisibilityChanged(int i) {
        Logger logger = C7557a.f23040a;
        logger.mo6666c("BANNER_VISIBILITY|LIFECYCLE_EVENT: UMOAdKitBannerView: onWindowVisibilityChanged(): Visibility: " + i + getSpotIdForLog());
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final void mo11074p(int i, int i2) {
        T t;
        Logger logger = C7557a.f23040a;
        logger.mo6666c("LAYOUT_PARAMS_PLACEHOLDER: Width: " + i + ", Height: " + i2 + getSpotIdForLog());
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AKImageView aKImageView = this.f7246f;
        if (aKImageView == null) {
            t = null;
        } else {
            t = aKImageView.getLayoutParams();
        }
        ref$ObjectRef.element = t;
        if (t == null) {
            ref$ObjectRef.element = new FrameLayout.LayoutParams(i, i2, 17);
        } else {
            t.width = i;
            t.height = i2;
        }
        C13233c.f32843b.post(new C7109v(5, this, ref$ObjectRef));
    }

    /* renamed from: q */
    public final boolean mo11075q() {
        String str;
        Context context = C13233c.f32842a;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        String str2 = null;
        if (uMOAdKitBannerParams == null) {
            str = null;
        } else {
            str = uMOAdKitBannerParams.mo11107d();
        }
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            str2 = q.f31967c;
        }
        return !C24362h.m61206a(str2, "");
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: r */
    public final void mo11076r() {
        C7557a.f23040a.mo6666c(C24362h.m61216k(getSpotIdForLog(), "PLACEHOLDER: Displaying Static Ad Kit Placeholder"));
        C13233c.f32843b.post(new C0441n1(this, 6));
        AKImageView aKImageView = this.f7246f;
        if (aKImageView != null) {
            aKImageView.setImageDrawable((Drawable) null);
        }
        AKImageView aKImageView2 = this.f7246f;
        if (aKImageView2 != null) {
            aKImageView2.setImageDrawable(getContext().getResources().getDrawable(C1499d.umoak_banner_placeholder_320x50));
        }
        m5802h(this, true);
    }

    /* renamed from: s */
    public final void mo11077s() {
        boolean z;
        UMOAdKitBannerParams uMOAdKitBannerParams = this.f7242b;
        Object obj = null;
        if (uMOAdKitBannerParams != null) {
            if (uMOAdKitBannerParams.mo11123r() > 0 && uMOAdKitBannerParams.mo11116k() > 0) {
                if (uMOAdKitBannerParams.mo11122q() == UMOAdKitBannerType.ADAPTIVE_GWxAH) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                    C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
                    DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                    C24362h.m61210e(displayMetrics2, "getSystem().displayMetrics");
                    mo11064k((int) TypedValue.applyDimension(1, (float) uMOAdKitBannerParams.mo11123r(), displayMetrics), (int) TypedValue.applyDimension(1, (float) uMOAdKitBannerParams.mo11116k(), displayMetrics2));
                    obj = C21050d.f52856a;
                }
            }
            if (uMOAdKitBannerParams.mo11127u()) {
                Context context = C13233c.f32842a;
                C12912d q = C13233c.m33348q(uMOAdKitBannerParams.mo11107d());
                if (q != null) {
                    obj = q.f31969e;
                }
                if (obj == UMOAdKitBannerState.REMOVAL_IN_PROGRESS) {
                    mo11064k(-2, -2);
                } else {
                    DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                    C24362h.m61210e(displayMetrics3, "getSystem().displayMetrics");
                    DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                    C24362h.m61210e(displayMetrics4, "getSystem().displayMetrics");
                    mo11064k((int) TypedValue.applyDimension(1, (float) uMOAdKitBannerParams.mo11123r(), displayMetrics3), (int) TypedValue.applyDimension(1, (float) uMOAdKitBannerParams.mo11116k(), displayMetrics4));
                }
            } else {
                mo11064k(-2, -2);
            }
            obj = C21050d.f52856a;
        }
        if (obj == null) {
            mo11064k(-2, -2);
        }
    }

    public final void setBannerAdListener(C1798a aVar) {
        this.f7243c = aVar;
    }

    public final void setBannerParams(UMOAdKitBannerParams uMOAdKitBannerParams) {
        this.f7242b = uMOAdKitBannerParams;
    }

    public final void setDefaultPHBannerType$ads_release(UMOAdKitBannerType uMOAdKitBannerType) {
        C24362h.m61211f(uMOAdKitBannerType, "<set-?>");
        this.f7247g = uMOAdKitBannerType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0199  */
    @android.annotation.SuppressLint({"InflateParams"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPlaceholder$ads_release(com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType r13) {
        /*
            r12 = this;
            java.lang.String r0 = "bannerType"
            mf0.C24362h.m61211f(r13, r0)
            com.cubic.umo.ad.ext.interfaces.UMOAdKit$Companion r0 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKit.f7238a
            r0.getClass()
            boolean r0 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKit.Companion.m5801a()
            if (r0 != 0) goto L_0x0014
            r12.setStaticOrDefaultPlaceholder$ads_release(r13)
            return
        L_0x0014:
            android.content.Context r0 = wb0.C13233c.f32842a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r0 = r12.f7242b
            r1 = 0
            if (r0 != 0) goto L_0x001d
            r0 = r1
            goto L_0x0021
        L_0x001d:
            java.lang.String r0 = r0.mo11107d()
        L_0x0021:
            mc0.d r0 = wb0.C13233c.m33348q(r0)
            if (r0 != 0) goto L_0x0029
            r2 = r1
            goto L_0x002b
        L_0x0029:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r2 = r0.f31968d
        L_0x002b:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.DISPLAYED
            if (r2 != r3) goto L_0x0030
            return
        L_0x0030:
            boolean r0 = wb0.C13233c.m33345n(r0)
            if (r0 == 0) goto L_0x0037
            return
        L_0x0037:
            r12.mo11051f()
            r12.mo11046a(r13)
            com.umo.ads.g.zzl r0 = wb0.C13233c.f32847f
            if (r0 != 0) goto L_0x0043
            goto L_0x0230
        L_0x0043:
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$Companion r2 = f7241i
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r12.f7242b
            if (r3 != 0) goto L_0x004b
            r3 = r1
            goto L_0x004f
        L_0x004b:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerType r3 = r3.mo11122q()
        L_0x004f:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r4 = r12.f7242b
            if (r4 != 0) goto L_0x0055
            r4 = r1
            goto L_0x0059
        L_0x0055:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r4 = r4.mo11114i()
        L_0x0059:
            r2.getClass()
            boolean r2 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.Companion.m5823c(r4, r3)
            java.lang.String r3 = "PLACEHOLDER: Setting Generic Placeholder Layout Params"
            r4 = -2
            r5 = 1
            if (r2 == 0) goto L_0x00c0
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r2 = r12.f7242b
            if (r2 != 0) goto L_0x006c
            r2 = r1
            goto L_0x00ad
        L_0x006c:
            int r6 = r2.mo11123r()
            if (r6 <= 0) goto L_0x00a8
            int r6 = r2.mo11116k()
            if (r6 <= 0) goto L_0x00a8
            int r6 = r2.mo11123r()
            float r6 = (float) r6
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "getSystem().displayMetrics"
            mf0.C24362h.m61210e(r7, r8)
            float r6 = android.util.TypedValue.applyDimension(r5, r6, r7)
            int r6 = (int) r6
            int r2 = r2.mo11116k()
            float r2 = (float) r2
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            mf0.C24362h.m61210e(r7, r8)
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r7)
            int r2 = (int) r2
            r12.mo11074p(r6, r2)
            goto L_0x00ab
        L_0x00a8:
            r12.mo11074p(r4, r4)
        L_0x00ab:
            bf0.d r2 = bf0.C21050d.f52856a
        L_0x00ad:
            if (r2 != 0) goto L_0x00d0
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r6 = r12.getSpotIdForLog()
            java.lang.String r3 = mf0.C24362h.m61216k(r6, r3)
            r2.mo6666c(r3)
            r12.mo11074p(r4, r4)
            goto L_0x00d0
        L_0x00c0:
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r6 = r12.getSpotIdForLog()
            java.lang.String r3 = mf0.C24362h.m61216k(r6, r3)
            r2.mo6666c(r3)
            r12.mo11074p(r4, r4)
        L_0x00d0:
            java.lang.String r2 = com.umo.ads.p344g.zzl.m32037b(r13)
            java.lang.String r2 = r0.mo35781k(r2)
            java.lang.String r3 = r0.f30801k
            java.lang.String r3 = r0.mo35781k(r3)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r2, r3)
            kotlin.Pair r2 = r0.mo35780i(r13)
            java.lang.Object r3 = r4.mo59068c()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r0.mo35783m(r3)
            boolean r6 = nc0.C12954d.m32800c(r3)
            if (r6 == 0) goto L_0x00fd
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            goto L_0x0141
        L_0x00fd:
            java.lang.Object r3 = r2.mo59068c()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.umo.ads.p344g.zzl.m32042h(r3)
            if (r3 <= 0) goto L_0x0113
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Object r2 = r2.mo59068c()
            r0.<init>(r1, r2)
            goto L_0x0141
        L_0x0113:
            java.lang.Object r3 = r4.mo59069d()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r0.mo35783m(r3)
            boolean r3 = nc0.C12954d.m32800c(r0)
            if (r3 == 0) goto L_0x012a
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r1)
            r0 = r2
            goto L_0x0141
        L_0x012a:
            java.lang.Object r0 = r2.mo59069d()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.umo.ads.p344g.zzl.m32042h(r0)
            if (r0 <= 0) goto L_0x0140
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Object r2 = r2.mo59069d()
            r0.<init>(r1, r2)
            goto L_0x0141
        L_0x0140:
            r0 = r1
        L_0x0141:
            if (r0 != 0) goto L_0x0145
            goto L_0x022b
        L_0x0145:
            java.lang.Object r1 = r0.mo59068c()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = nc0.C12954d.m32800c(r1)
            if (r1 == 0) goto L_0x020d
            java.lang.Object r0 = r0.mo59068c()
            mf0.C24362h.m61208c(r0)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "PLACEHOLDER: Displaying Dynamic Placeholder: "
            java.lang.StringBuilder r1 = p001a0.C0016g.m36t(r1, r8)
            java.lang.String r2 = r12.getSpotIdForLog()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo6666c(r1)
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x0229
            android.content.Context r0 = r12.getContext()
            java.lang.String r1 = "context"
            mf0.C24362h.m61210e(r0, r1)
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0194
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L_0x0192
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x0194
        L_0x0192:
            r0 = 0
            goto L_0x0195
        L_0x0194:
            r0 = 1
        L_0x0195:
            if (r0 != 0) goto L_0x0199
            goto L_0x0229
        L_0x0199:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inJustDecodeBounds = r5
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            java.lang.String r1 = r1.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r1, r0)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            int r1 = r0.outWidth
            r9.element = r1
            kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
            r10.<init>()
            int r0 = r0.outHeight
            r10.element = r0
            int r0 = r9.element
            if (r0 > 0) goto L_0x01ed
            com.cubic.umo.ad.ext.types.UMOAdKitBannerType r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType.ADAPTIVE_GWxAH
            if (r13 != r0) goto L_0x01c7
            goto L_0x01c8
        L_0x01c7:
            r5 = 0
        L_0x01c8:
            if (r5 == 0) goto L_0x01df
            android.content.Context r13 = zb0.C13364a.f33155a
            android.content.Context r13 = r12.getContext()
            kotlin.Pair r13 = zb0.C13364a.m33638a(r13)
            java.lang.Object r13 = r13.mo59068c()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L_0x01eb
        L_0x01df:
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r13 = wb0.C13232b.f32841b
            java.lang.Object r13 = r13.mo59068c()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
        L_0x01eb:
            r9.element = r13
        L_0x01ed:
            int r13 = r10.element
            if (r13 > 0) goto L_0x01ff
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r13 = wb0.C13232b.f32841b
            java.lang.Object r13 = r13.mo59069d()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r10.element = r13
        L_0x01ff:
            android.os.Handler r13 = wb0.C13233c.f32843b
            y.k r0 = new y.k
            r11 = 1
            r6 = r0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r13.post(r0)
            goto L_0x0229
        L_0x020d:
            java.lang.Object r13 = r0.mo59069d()
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = nc0.C12954d.m32800c(r13)
            if (r13 == 0) goto L_0x0226
            java.lang.Object r13 = r0.mo59069d()
            mf0.C24362h.m61208c(r13)
            java.lang.String r13 = (java.lang.String) r13
            r12.setStaticAppPlaceholderImage(r13)
            goto L_0x0229
        L_0x0226:
            r12.mo11076r()
        L_0x0229:
            bf0.d r1 = bf0.C21050d.f52856a
        L_0x022b:
            if (r1 != 0) goto L_0x0230
            r12.mo11076r()
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.setPlaceholder$ads_release(com.cubic.umo.ad.ext.types.UMOAdKitBannerType):void");
    }

    public final void setPlaceholderClickUrl$ads_release(String str) {
        this.f7248h = str;
    }

    public final void setPlaceholderLayout$ads_release(FrameLayout frameLayout) {
        this.f7245e = frameLayout;
    }

    public final void setRecycleModeEnabled(boolean z) {
        this.f7244d = z;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [bf0.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStaticOrDefaultPlaceholder$ads_release(com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType r3) {
        /*
            r2 = this;
            java.lang.String r0 = "bannerType"
            mf0.C24362h.m61211f(r3, r0)
            r2.mo11046a(r3)
            com.umo.ads.g.zzl r0 = wb0.C13233c.f32847f
            r1 = 0
            if (r0 != 0) goto L_0x0014
            com.umo.ads.g.zzl r0 = new com.umo.ads.g.zzl
            r0.<init>(r1)
            wb0.C13233c.f32847f = r0
        L_0x0014:
            com.umo.ads.g.zzl r0 = wb0.C13233c.f32847f
            if (r0 != 0) goto L_0x0019
            goto L_0x0056
        L_0x0019:
            kotlin.Pair r3 = r0.mo35780i(r3)
            java.lang.Object r0 = r3.mo59068c()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.umo.ads.p344g.zzl.m32042h(r0)
            if (r0 <= 0) goto L_0x0031
            java.lang.Object r3 = r3.mo59068c()
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0044
        L_0x0031:
            java.lang.Object r0 = r3.mo59069d()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.umo.ads.p344g.zzl.m32042h(r0)
            if (r0 <= 0) goto L_0x0044
            java.lang.Object r3 = r3.mo59069d()
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
        L_0x0044:
            boolean r3 = nc0.C12954d.m32800c(r1)
            if (r3 == 0) goto L_0x0051
            mf0.C24362h.m61208c(r1)
            r2.setStaticAppPlaceholderImage(r1)
            goto L_0x0054
        L_0x0051:
            r2.mo11076r()
        L_0x0054:
            bf0.d r1 = bf0.C21050d.f52856a
        L_0x0056:
            if (r1 != 0) goto L_0x005b
            r2.mo11076r()
        L_0x005b:
            r3 = 1
            m5802h(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.setStaticOrDefaultPlaceholder$ads_release(com.cubic.umo.ad.ext.types.UMOAdKitBannerType):void");
    }

    public final void setVisibility(boolean z) {
        Object obj;
        int i;
        String k = C24362h.m61216k(getSpotIdForLog(), "setVisibility()");
        C24362h.m61211f(k, "funcName");
        C7557a.f23040a.mo6666c(C24362h.m61216k(" -> START", k));
        try {
            C13301f fVar = C13301f.f33010a;
            C13301f.m33526e();
            Logger logger = C7557a.f23040a;
            logger.mo6672i("BANNER_VISIBILITY: setVisibility(): " + z + getSpotIdForLog());
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            mo11062i(i);
            obj = C21050d.f52856a;
        } catch (Throwable th) {
            obj = C17885a.m44400G(th);
        }
        Throwable a = Result.m58423a(obj);
        if (a != null) {
            mo11065n("setVisibility", a);
        }
        String k2 = C24362h.m61216k(getSpotIdForLog(), "setVisibility()");
        C24362h.m61211f(k2, "funcName");
        C7557a.f23040a.mo6666c(C24362h.m61216k(" -> END", k2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UMOAdKitBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        mo11066o();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UMOAdKitBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        mo11066o();
    }
}
