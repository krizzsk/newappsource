package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKHostedAdTemplatesData;", "", "version", "", "description", "templates", "", "Lcom/cubic/umo/ad/types/AKHostedAdTemplate;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getTemplates", "()Ljava/util/List;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKHostedAdTemplatesData */
public final class AKHostedAdTemplatesData {
    private final String description;
    private final List<AKHostedAdTemplate> templates;
    private final String version;

    public AKHostedAdTemplatesData(String str, String str2, List<AKHostedAdTemplate> list) {
        this.version = str;
        this.description = str2;
        this.templates = list;
    }

    public static /* synthetic */ AKHostedAdTemplatesData copy$default(AKHostedAdTemplatesData aKHostedAdTemplatesData, String str, String str2, List<AKHostedAdTemplate> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aKHostedAdTemplatesData.version;
        }
        if ((i & 2) != 0) {
            str2 = aKHostedAdTemplatesData.description;
        }
        if ((i & 4) != 0) {
            list = aKHostedAdTemplatesData.templates;
        }
        return aKHostedAdTemplatesData.copy(str, str2, list);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.description;
    }

    public final List<AKHostedAdTemplate> component3() {
        return this.templates;
    }

    public final AKHostedAdTemplatesData copy(String str, String str2, List<AKHostedAdTemplate> list) {
        return new AKHostedAdTemplatesData(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKHostedAdTemplatesData)) {
            return false;
        }
        AKHostedAdTemplatesData aKHostedAdTemplatesData = (AKHostedAdTemplatesData) obj;
        return C24362h.m61206a(this.version, aKHostedAdTemplatesData.version) && C24362h.m61206a(this.description, aKHostedAdTemplatesData.description) && C24362h.m61206a(this.templates, aKHostedAdTemplatesData.templates);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<AKHostedAdTemplate> getTemplates() {
        return this.templates;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AKHostedAdTemplate> list = this.templates;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKHostedAdTemplatesData(version=");
        J0.append(this.version);
        J0.append(", description=");
        J0.append(this.description);
        J0.append(", templates=");
        return C13555b.m33970i(J0, this.templates, ')');
    }
}
