package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p358af.C13437d;

@Metadata(mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003Jj\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006,"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKBannerParams;", "", "bannerPlaylist", "", "serverUrl", "qsParams", "connectionTimeoutSeconds", "", "requestTimeoutSeconds", "autoRefreshIntervalSeconds", "enableAdPrefetch", "", "autoPrefetchOnExpiry", "prefetchedAdExpiryMinutes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;ZZI)V", "getAutoPrefetchOnExpiry", "()Z", "getAutoRefreshIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBannerPlaylist", "()Ljava/lang/String;", "getConnectionTimeoutSeconds", "()I", "getEnableAdPrefetch", "getPrefetchedAdExpiryMinutes", "getQsParams", "getRequestTimeoutSeconds", "getServerUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;ZZI)Lcom/cubic/umo/ad/types/AKBannerParams;", "equals", "other", "hashCode", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKBannerParams */
public final class AKBannerParams {
    private final boolean autoPrefetchOnExpiry;
    private final Integer autoRefreshIntervalSeconds;
    private final String bannerPlaylist;
    private final int connectionTimeoutSeconds;
    private final boolean enableAdPrefetch;
    private final int prefetchedAdExpiryMinutes;
    private final String qsParams;
    private final int requestTimeoutSeconds;
    private final String serverUrl;

    public AKBannerParams(@C12943g(name = "banner_playlist") String str, @C12943g(name = "server_url") String str2, @C12943g(name = "qs_params") String str3, @C12943g(name = "connection_timeout_seconds") int i, @C12943g(name = "request_timeout_seconds") int i2, @C12943g(name = "auto_refresh_interval_seconds") Integer num, @C12943g(name = "enable_ad_prefetch") boolean z, @C12943g(name = "auto_prefetch_on_expiry") boolean z2, @C12943g(name = "prefetched_ad_expiry_minutes") int i3) {
        C13437d.m33711q(str, "bannerPlaylist", str2, "serverUrl", str3, "qsParams");
        this.bannerPlaylist = str;
        this.serverUrl = str2;
        this.qsParams = str3;
        this.connectionTimeoutSeconds = i;
        this.requestTimeoutSeconds = i2;
        this.autoRefreshIntervalSeconds = num;
        this.enableAdPrefetch = z;
        this.autoPrefetchOnExpiry = z2;
        this.prefetchedAdExpiryMinutes = i3;
    }

    public static /* synthetic */ AKBannerParams copy$default(AKBannerParams aKBannerParams, String str, String str2, String str3, int i, int i2, Integer num, boolean z, boolean z2, int i3, int i4, Object obj) {
        AKBannerParams aKBannerParams2 = aKBannerParams;
        int i5 = i4;
        return aKBannerParams.copy((i5 & 1) != 0 ? aKBannerParams2.bannerPlaylist : str, (i5 & 2) != 0 ? aKBannerParams2.serverUrl : str2, (i5 & 4) != 0 ? aKBannerParams2.qsParams : str3, (i5 & 8) != 0 ? aKBannerParams2.connectionTimeoutSeconds : i, (i5 & 16) != 0 ? aKBannerParams2.requestTimeoutSeconds : i2, (i5 & 32) != 0 ? aKBannerParams2.autoRefreshIntervalSeconds : num, (i5 & 64) != 0 ? aKBannerParams2.enableAdPrefetch : z, (i5 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? aKBannerParams2.autoPrefetchOnExpiry : z2, (i5 & 256) != 0 ? aKBannerParams2.prefetchedAdExpiryMinutes : i3);
    }

    public final String component1() {
        return this.bannerPlaylist;
    }

    public final String component2() {
        return this.serverUrl;
    }

    public final String component3() {
        return this.qsParams;
    }

    public final int component4() {
        return this.connectionTimeoutSeconds;
    }

    public final int component5() {
        return this.requestTimeoutSeconds;
    }

    public final Integer component6() {
        return this.autoRefreshIntervalSeconds;
    }

    public final boolean component7() {
        return this.enableAdPrefetch;
    }

    public final boolean component8() {
        return this.autoPrefetchOnExpiry;
    }

    public final int component9() {
        return this.prefetchedAdExpiryMinutes;
    }

    public final AKBannerParams copy(@C12943g(name = "banner_playlist") String str, @C12943g(name = "server_url") String str2, @C12943g(name = "qs_params") String str3, @C12943g(name = "connection_timeout_seconds") int i, @C12943g(name = "request_timeout_seconds") int i2, @C12943g(name = "auto_refresh_interval_seconds") Integer num, @C12943g(name = "enable_ad_prefetch") boolean z, @C12943g(name = "auto_prefetch_on_expiry") boolean z2, @C12943g(name = "prefetched_ad_expiry_minutes") int i3) {
        C24362h.m61211f(str, "bannerPlaylist");
        C24362h.m61211f(str2, "serverUrl");
        C24362h.m61211f(str3, "qsParams");
        return new AKBannerParams(str, str2, str3, i, i2, num, z, z2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKBannerParams)) {
            return false;
        }
        AKBannerParams aKBannerParams = (AKBannerParams) obj;
        return C24362h.m61206a(this.bannerPlaylist, aKBannerParams.bannerPlaylist) && C24362h.m61206a(this.serverUrl, aKBannerParams.serverUrl) && C24362h.m61206a(this.qsParams, aKBannerParams.qsParams) && this.connectionTimeoutSeconds == aKBannerParams.connectionTimeoutSeconds && this.requestTimeoutSeconds == aKBannerParams.requestTimeoutSeconds && C24362h.m61206a(this.autoRefreshIntervalSeconds, aKBannerParams.autoRefreshIntervalSeconds) && this.enableAdPrefetch == aKBannerParams.enableAdPrefetch && this.autoPrefetchOnExpiry == aKBannerParams.autoPrefetchOnExpiry && this.prefetchedAdExpiryMinutes == aKBannerParams.prefetchedAdExpiryMinutes;
    }

    public final boolean getAutoPrefetchOnExpiry() {
        return this.autoPrefetchOnExpiry;
    }

    public final Integer getAutoRefreshIntervalSeconds() {
        return this.autoRefreshIntervalSeconds;
    }

    public final String getBannerPlaylist() {
        return this.bannerPlaylist;
    }

    public final int getConnectionTimeoutSeconds() {
        return this.connectionTimeoutSeconds;
    }

    public final boolean getEnableAdPrefetch() {
        return this.enableAdPrefetch;
    }

    public final int getPrefetchedAdExpiryMinutes() {
        return this.prefetchedAdExpiryMinutes;
    }

    public final String getQsParams() {
        return this.qsParams;
    }

    public final int getRequestTimeoutSeconds() {
        return this.requestTimeoutSeconds;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    public int hashCode() {
        int i;
        int I0 = C21100e.m49313I0(C21100e.m49313I0(this.bannerPlaylist.hashCode() * 31, this.serverUrl), this.qsParams);
        int i2 = (this.requestTimeoutSeconds + ((this.connectionTimeoutSeconds + I0) * 31)) * 31;
        Integer num = this.autoRefreshIntervalSeconds;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.enableAdPrefetch;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i4 = (i3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.autoPrefetchOnExpiry;
        if (!z3) {
            z2 = z3;
        }
        return this.prefetchedAdExpiryMinutes + ((i4 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKBannerParams(bannerPlaylist=");
        J0.append(this.bannerPlaylist);
        J0.append(", serverUrl=");
        J0.append(this.serverUrl);
        J0.append(", qsParams=");
        J0.append(this.qsParams);
        J0.append(", connectionTimeoutSeconds=");
        J0.append(this.connectionTimeoutSeconds);
        J0.append(", requestTimeoutSeconds=");
        J0.append(this.requestTimeoutSeconds);
        J0.append(", autoRefreshIntervalSeconds=");
        J0.append(this.autoRefreshIntervalSeconds);
        J0.append(", enableAdPrefetch=");
        J0.append(this.enableAdPrefetch);
        J0.append(", autoPrefetchOnExpiry=");
        J0.append(this.autoPrefetchOnExpiry);
        J0.append(", prefetchedAdExpiryMinutes=");
        return C16530d.m42014g(J0, this.prefetchedAdExpiryMinutes, ')');
    }
}
