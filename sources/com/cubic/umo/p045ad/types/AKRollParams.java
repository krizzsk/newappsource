package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b(\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u0001\u00102\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\f2\b\b\u0003\u0010\u0011\u001a\u00020\f2\b\b\u0003\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0007HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00067"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKRollParams;", "", "rollPlaylist", "", "serverUrl", "qsParams", "connectionTimeoutSeconds", "", "requestTimeoutSeconds", "videoTimeoutSeconds", "slot", "pickHighBitrateCreative", "", "pickCreativeByNetwork", "videoMimesListByPriority", "", "enableAdPrefetch", "autoPrefetchOnExpiry", "prefetchedAdExpiryMinutes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ZZLjava/util/List;ZZI)V", "getAutoPrefetchOnExpiry", "()Z", "getConnectionTimeoutSeconds", "()I", "getEnableAdPrefetch", "getPickCreativeByNetwork", "getPickHighBitrateCreative", "getPrefetchedAdExpiryMinutes", "getQsParams", "()Ljava/lang/String;", "getRequestTimeoutSeconds", "getRollPlaylist", "getServerUrl", "getSlot", "getVideoMimesListByPriority", "()Ljava/util/List;", "getVideoTimeoutSeconds", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKRollParams */
public final class AKRollParams {
    private final boolean autoPrefetchOnExpiry;
    private final int connectionTimeoutSeconds;
    private final boolean enableAdPrefetch;
    private final boolean pickCreativeByNetwork;
    private final boolean pickHighBitrateCreative;
    private final int prefetchedAdExpiryMinutes;
    private final String qsParams;
    private final int requestTimeoutSeconds;
    private final String rollPlaylist;
    private final String serverUrl;
    private final String slot;
    private final List<String> videoMimesListByPriority;
    private final int videoTimeoutSeconds;

    public AKRollParams(@C12943g(name = "roll_playlist") String str, @C12943g(name = "server_url") String str2, @C12943g(name = "qs_params") String str3, @C12943g(name = "connection_timeout_seconds") int i, @C12943g(name = "request_timeout_seconds") int i2, @C12943g(name = "video_timeout_seconds") int i3, @C12943g(name = "slot") String str4, @C12943g(name = "pick_high_bitrate_creative") boolean z, @C12943g(name = "pick_creative_by_network") boolean z2, @C12943g(name = "video_mimes_list_by_priority_android") List<String> list, @C12943g(name = "enable_ad_prefetch") boolean z3, @C12943g(name = "auto_prefetch_on_expiry") boolean z4, @C12943g(name = "prefetched_ad_expiry_minutes") int i4) {
        C24362h.m61211f(str, "rollPlaylist");
        C24362h.m61211f(str2, "serverUrl");
        C24362h.m61211f(str3, "qsParams");
        C24362h.m61211f(str4, "slot");
        C24362h.m61211f(list, "videoMimesListByPriority");
        this.rollPlaylist = str;
        this.serverUrl = str2;
        this.qsParams = str3;
        this.connectionTimeoutSeconds = i;
        this.requestTimeoutSeconds = i2;
        this.videoTimeoutSeconds = i3;
        this.slot = str4;
        this.pickHighBitrateCreative = z;
        this.pickCreativeByNetwork = z2;
        this.videoMimesListByPriority = list;
        this.enableAdPrefetch = z3;
        this.autoPrefetchOnExpiry = z4;
        this.prefetchedAdExpiryMinutes = i4;
    }

    public static /* synthetic */ AKRollParams copy$default(AKRollParams aKRollParams, String str, String str2, String str3, int i, int i2, int i3, String str4, boolean z, boolean z2, List list, boolean z3, boolean z4, int i4, int i5, Object obj) {
        AKRollParams aKRollParams2 = aKRollParams;
        int i6 = i5;
        return aKRollParams.copy((i6 & 1) != 0 ? aKRollParams2.rollPlaylist : str, (i6 & 2) != 0 ? aKRollParams2.serverUrl : str2, (i6 & 4) != 0 ? aKRollParams2.qsParams : str3, (i6 & 8) != 0 ? aKRollParams2.connectionTimeoutSeconds : i, (i6 & 16) != 0 ? aKRollParams2.requestTimeoutSeconds : i2, (i6 & 32) != 0 ? aKRollParams2.videoTimeoutSeconds : i3, (i6 & 64) != 0 ? aKRollParams2.slot : str4, (i6 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? aKRollParams2.pickHighBitrateCreative : z, (i6 & 256) != 0 ? aKRollParams2.pickCreativeByNetwork : z2, (i6 & 512) != 0 ? aKRollParams2.videoMimesListByPriority : list, (i6 & 1024) != 0 ? aKRollParams2.enableAdPrefetch : z3, (i6 & 2048) != 0 ? aKRollParams2.autoPrefetchOnExpiry : z4, (i6 & 4096) != 0 ? aKRollParams2.prefetchedAdExpiryMinutes : i4);
    }

    public final String component1() {
        return this.rollPlaylist;
    }

    public final List<String> component10() {
        return this.videoMimesListByPriority;
    }

    public final boolean component11() {
        return this.enableAdPrefetch;
    }

    public final boolean component12() {
        return this.autoPrefetchOnExpiry;
    }

    public final int component13() {
        return this.prefetchedAdExpiryMinutes;
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

    public final int component6() {
        return this.videoTimeoutSeconds;
    }

    public final String component7() {
        return this.slot;
    }

    public final boolean component8() {
        return this.pickHighBitrateCreative;
    }

    public final boolean component9() {
        return this.pickCreativeByNetwork;
    }

    public final AKRollParams copy(@C12943g(name = "roll_playlist") String str, @C12943g(name = "server_url") String str2, @C12943g(name = "qs_params") String str3, @C12943g(name = "connection_timeout_seconds") int i, @C12943g(name = "request_timeout_seconds") int i2, @C12943g(name = "video_timeout_seconds") int i3, @C12943g(name = "slot") String str4, @C12943g(name = "pick_high_bitrate_creative") boolean z, @C12943g(name = "pick_creative_by_network") boolean z2, @C12943g(name = "video_mimes_list_by_priority_android") List<String> list, @C12943g(name = "enable_ad_prefetch") boolean z3, @C12943g(name = "auto_prefetch_on_expiry") boolean z4, @C12943g(name = "prefetched_ad_expiry_minutes") int i4) {
        String str5 = str;
        C24362h.m61211f(str5, "rollPlaylist");
        String str6 = str2;
        C24362h.m61211f(str6, "serverUrl");
        String str7 = str3;
        C24362h.m61211f(str7, "qsParams");
        String str8 = str4;
        C24362h.m61211f(str8, "slot");
        List<String> list2 = list;
        C24362h.m61211f(list2, "videoMimesListByPriority");
        return new AKRollParams(str5, str6, str7, i, i2, i3, str8, z, z2, list2, z3, z4, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKRollParams)) {
            return false;
        }
        AKRollParams aKRollParams = (AKRollParams) obj;
        return C24362h.m61206a(this.rollPlaylist, aKRollParams.rollPlaylist) && C24362h.m61206a(this.serverUrl, aKRollParams.serverUrl) && C24362h.m61206a(this.qsParams, aKRollParams.qsParams) && this.connectionTimeoutSeconds == aKRollParams.connectionTimeoutSeconds && this.requestTimeoutSeconds == aKRollParams.requestTimeoutSeconds && this.videoTimeoutSeconds == aKRollParams.videoTimeoutSeconds && C24362h.m61206a(this.slot, aKRollParams.slot) && this.pickHighBitrateCreative == aKRollParams.pickHighBitrateCreative && this.pickCreativeByNetwork == aKRollParams.pickCreativeByNetwork && C24362h.m61206a(this.videoMimesListByPriority, aKRollParams.videoMimesListByPriority) && this.enableAdPrefetch == aKRollParams.enableAdPrefetch && this.autoPrefetchOnExpiry == aKRollParams.autoPrefetchOnExpiry && this.prefetchedAdExpiryMinutes == aKRollParams.prefetchedAdExpiryMinutes;
    }

    public final boolean getAutoPrefetchOnExpiry() {
        return this.autoPrefetchOnExpiry;
    }

    public final int getConnectionTimeoutSeconds() {
        return this.connectionTimeoutSeconds;
    }

    public final boolean getEnableAdPrefetch() {
        return this.enableAdPrefetch;
    }

    public final boolean getPickCreativeByNetwork() {
        return this.pickCreativeByNetwork;
    }

    public final boolean getPickHighBitrateCreative() {
        return this.pickHighBitrateCreative;
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

    public final String getRollPlaylist() {
        return this.rollPlaylist;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    public final String getSlot() {
        return this.slot;
    }

    public final List<String> getVideoMimesListByPriority() {
        return this.videoMimesListByPriority;
    }

    public final int getVideoTimeoutSeconds() {
        return this.videoTimeoutSeconds;
    }

    public int hashCode() {
        int I0 = C21100e.m49313I0(C21100e.m49313I0(this.rollPlaylist.hashCode() * 31, this.serverUrl), this.qsParams);
        int i = this.requestTimeoutSeconds;
        int I02 = C21100e.m49313I0((this.videoTimeoutSeconds + ((i + ((this.connectionTimeoutSeconds + I0) * 31)) * 31)) * 31, this.slot);
        boolean z = this.pickHighBitrateCreative;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (I02 + (z ? 1 : 0)) * 31;
        boolean z3 = this.pickCreativeByNetwork;
        if (z3) {
            z3 = true;
        }
        int hashCode = (this.videoMimesListByPriority.hashCode() + ((i2 + (z3 ? 1 : 0)) * 31)) * 31;
        boolean z4 = this.enableAdPrefetch;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.autoPrefetchOnExpiry;
        if (!z5) {
            z2 = z5;
        }
        return this.prefetchedAdExpiryMinutes + ((i3 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AKRollParams(rollPlaylist=");
        k.append(this.rollPlaylist);
        k.append(", serverUrl=");
        k.append(this.serverUrl);
        k.append(", qsParams=");
        k.append(this.qsParams);
        k.append(", connectionTimeoutSeconds=");
        k.append(this.connectionTimeoutSeconds);
        k.append(", requestTimeoutSeconds=");
        k.append(this.requestTimeoutSeconds);
        k.append(", videoTimeoutSeconds=");
        k.append(this.videoTimeoutSeconds);
        k.append(", slot=");
        k.append(this.slot);
        k.append(", pickHighBitrateCreative=");
        k.append(this.pickHighBitrateCreative);
        k.append(", pickCreativeByNetwork=");
        k.append(this.pickCreativeByNetwork);
        k.append(", videoMimesListByPriority=");
        k.append(this.videoMimesListByPriority);
        k.append(", enableAdPrefetch=");
        k.append(this.enableAdPrefetch);
        k.append(", autoPrefetchOnExpiry=");
        k.append(this.autoPrefetchOnExpiry);
        k.append(", prefetchedAdExpiryMinutes=");
        return C16530d.m42014g(k, this.prefetchedAdExpiryMinutes, ')');
    }
}
