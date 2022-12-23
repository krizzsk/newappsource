package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKPlaceholders;", "", "version", "", "packagePath", "clickUrl", "mappings", "", "Lcom/cubic/umo/ad/types/AKPlaceholderMapping;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getClickUrl", "()Ljava/lang/String;", "getMappings", "()Ljava/util/List;", "getPackagePath", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKPlaceholders */
public final class AKPlaceholders {
    private final String clickUrl;
    private final List<AKPlaceholderMapping> mappings;
    private final String packagePath;
    private final String version;

    public AKPlaceholders() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public AKPlaceholders(@C12943g(name = "version") String str, @C12943g(name = "package_path") String str2, @C12943g(name = "click_url") String str3, @C12943g(name = "mappings") List<AKPlaceholderMapping> list) {
        this.version = str;
        this.packagePath = str2;
        this.clickUrl = str3;
        this.mappings = list;
    }

    public static /* synthetic */ AKPlaceholders copy$default(AKPlaceholders aKPlaceholders, String str, String str2, String str3, List<AKPlaceholderMapping> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aKPlaceholders.version;
        }
        if ((i & 2) != 0) {
            str2 = aKPlaceholders.packagePath;
        }
        if ((i & 4) != 0) {
            str3 = aKPlaceholders.clickUrl;
        }
        if ((i & 8) != 0) {
            list = aKPlaceholders.mappings;
        }
        return aKPlaceholders.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.packagePath;
    }

    public final String component3() {
        return this.clickUrl;
    }

    public final List<AKPlaceholderMapping> component4() {
        return this.mappings;
    }

    public final AKPlaceholders copy(@C12943g(name = "version") String str, @C12943g(name = "package_path") String str2, @C12943g(name = "click_url") String str3, @C12943g(name = "mappings") List<AKPlaceholderMapping> list) {
        return new AKPlaceholders(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKPlaceholders)) {
            return false;
        }
        AKPlaceholders aKPlaceholders = (AKPlaceholders) obj;
        return C24362h.m61206a(this.version, aKPlaceholders.version) && C24362h.m61206a(this.packagePath, aKPlaceholders.packagePath) && C24362h.m61206a(this.clickUrl, aKPlaceholders.clickUrl) && C24362h.m61206a(this.mappings, aKPlaceholders.mappings);
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final List<AKPlaceholderMapping> getMappings() {
        return this.mappings;
    }

    public final String getPackagePath() {
        return this.packagePath;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packagePath;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clickUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AKPlaceholderMapping> list = this.mappings;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKPlaceholders(version=");
        J0.append(this.version);
        J0.append(", packagePath=");
        J0.append(this.packagePath);
        J0.append(", clickUrl=");
        J0.append(this.clickUrl);
        J0.append(", mappings=");
        return C13555b.m33970i(J0, this.mappings, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AKPlaceholders(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : list);
    }
}
