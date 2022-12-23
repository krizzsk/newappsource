package com.veriff.sdk.views.camera;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import com.appsflyer.internal.referrer.Payload;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21886js;
import com.veriff.sdk.internal.C22549tg;
import com.veriff.sdk.internal.C22661wm;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.text.C24179b;
import lf0.C24225a;
import mf0.C24362h;
import p584jl.C17885a;
import rf0.C24805g;
import rf0.C24806h;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/VideoConfigurationProvider;", "", "Landroid/media/MediaCodecList;", "codecs", "Lcom/veriff/sdk/views/camera/AudioParameters;", "createAudioParameters", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "", "recordAudio", "Lcom/veriff/sdk/views/camera/VideoConfiguration;", "createRecordingConfiguration", "Lcom/veriff/sdk/views/camera/VideoParameters;", "createVideoParameters", "", "manufacturer", "", "sdkVersion", "codecName", "shouldAvoidImageApis$veriff_library_dist", "(Ljava/lang/String;ILjava/lang/String;)Z", "shouldAvoidImageApis", "Lkotlin/Function0;", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "contextProvider", "Llf0/a;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "<init>", "(Lcom/veriff/sdk/internal/data/FeatureFlags;Llf0/a;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ai */
public final class C22834ai {

    /* renamed from: a */
    private final C21789ix f57946a;

    /* renamed from: b */
    private final C24225a<C22549tg> f57947b;

    public C22834ai(C21789ix ixVar, C24225a<? extends C22549tg> aVar) {
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(aVar, "contextProvider");
        this.f57946a = ixVar;
        this.f57947b = aVar;
    }

    /* renamed from: b */
    private final C22825a m56189b(MediaCodecList mediaCodecList) {
        boolean z;
        Integer num;
        boolean z2;
        MediaCodecInfo a = C22835aj.m56192a(mediaCodecList, "audio/mp4a-latm");
        MediaCodecInfo.CodecCapabilities capabilitiesForType = a.getCapabilitiesForType("audio/mp4a-latm");
        C24362h.m61210e(capabilitiesForType, "audioCodec.getCapabilitiesForType(AUDIO_MIME)");
        MediaCodecInfo.AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
        C24362h.m61210e(audioCapabilities, AppActionRequest.KEY_CAPABILITIES);
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        C24362h.m61210e(supportedSampleRates, "capabilities.supportedSampleRates");
        if (supportedSampleRates.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            num = null;
        } else {
            int i = supportedSampleRates[0];
            C24805g p = new C24806h(1, supportedSampleRates.length - 1).iterator();
            while (p.f62733d) {
                int i2 = supportedSampleRates[p.nextInt()];
                if (i > i2) {
                    i = i2;
                }
            }
            num = Integer.valueOf(i);
        }
        C24362h.m61208c(num);
        int intValue = num.intValue();
        int[] supportedSampleRates2 = audioCapabilities.getSupportedSampleRates();
        C24362h.m61210e(supportedSampleRates2, "capabilities.supportedSampleRates");
        ArrayList arrayList = new ArrayList();
        for (int i3 : supportedSampleRates2) {
            if (i3 >= this.f57946a.mo55436M().mo55413b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        Integer num2 = (Integer) C23825c.m58524u0(arrayList);
        String name = a.getName();
        C24362h.m61210e(name, "audioCodec.name");
        if (num2 != null) {
            intValue = num2.intValue();
        }
        return new C22825a(name, "audio/mp4a-latm", intValue, this.f57946a.mo55436M().mo55411a(), this.f57946a.mo55436M().mo55414c());
    }

    /* renamed from: a */
    public final C22833ah mo57648a(C22661wm wmVar, boolean z) {
        C22825a aVar;
        C24362h.m61211f(wmVar, "session");
        String j = wmVar.mo57026j();
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        C22549tg invoke = this.f57947b.invoke();
        C24362h.m61210e(j, "fileName");
        C21886js a = this.f57946a.mo55435L().mo55674a();
        long e = this.f57946a.mo55435L().mo55680e();
        C22836ak a2 = m56188a(mediaCodecList);
        if (!z) {
            aVar = null;
        } else {
            aVar = m56189b(mediaCodecList);
        }
        return new C22833ah(invoke, j, a, e, a2, aVar);
    }

    /* renamed from: a */
    private final C22836ak m56188a(MediaCodecList mediaCodecList) {
        MediaCodecInfo b = C22835aj.m56194b(mediaCodecList, "video/avc");
        MediaCodecInfo.CodecCapabilities capabilitiesForType = b.getCapabilitiesForType("video/avc");
        C24362h.m61210e(capabilitiesForType, AppActionRequest.KEY_CAPABILITIES);
        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
        int width = C22835aj.f57948a.getWidth();
        C24362h.m61210e(videoCapabilities, "it");
        Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        C24362h.m61210e(supportedHeights, "it.supportedHeights");
        Integer lower = supportedHeights.getLower();
        C24362h.m61210e(lower, "it.supportedHeights.lower");
        int intValue = lower.intValue();
        Range<Integer> supportedHeights2 = videoCapabilities.getSupportedHeights();
        C24362h.m61210e(supportedHeights2, "it.supportedHeights");
        Integer upper = supportedHeights2.getUpper();
        C24362h.m61210e(upper, "it.supportedHeights.upper");
        int u = C17885a.m44464u(width, intValue, upper.intValue());
        int height = C22835aj.f57948a.getHeight();
        Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        C24362h.m61210e(supportedWidths, "it.supportedWidths");
        Integer lower2 = supportedWidths.getLower();
        C24362h.m61210e(lower2, "it.supportedWidths.lower");
        int intValue2 = lower2.intValue();
        Range<Integer> supportedWidths2 = videoCapabilities.getSupportedWidths();
        C24362h.m61210e(supportedWidths2, "it.supportedWidths");
        Integer upper2 = supportedWidths2.getUpper();
        C24362h.m61210e(upper2, "it.supportedWidths.upper");
        Size size = new Size(u, C17885a.m44464u(height, intValue2, upper2.intValue()));
        String name = b.getName();
        C24362h.m61210e(name, "videoCodec.name");
        int c = this.f57946a.mo55435L().mo55677c();
        int b2 = this.f57946a.mo55435L().mo55676b();
        int d = this.f57946a.mo55435L().mo55678d();
        String str = Build.MANUFACTURER;
        C24362h.m61210e(str, "Build.MANUFACTURER");
        int i = Build.VERSION.SDK_INT;
        String name2 = b.getName();
        C24362h.m61210e(name2, "videoCodec.name");
        return new C22836ak(0, name, "video/avc", c, b2, d, size, mo57649a(str, i, name2));
    }

    /* renamed from: a */
    public final boolean mo57649a(String str, int i, String str2) {
        C24362h.m61211f(str, "manufacturer");
        C24362h.m61211f(str2, "codecName");
        if (C25081h.m62830A(Payload.SOURCE_HUAWEI, str, true)) {
            if (i == 23) {
                Locale locale = Locale.US;
                C24362h.m61210e(locale, "Locale.US");
                String upperCase = str2.toUpperCase(locale);
                C24362h.m61210e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                if (C24179b.m60559G(upperCase, "TOPAZ", false)) {
                    return true;
                }
            }
            if (i < 23) {
                return true;
            }
        }
        return false;
    }
}
