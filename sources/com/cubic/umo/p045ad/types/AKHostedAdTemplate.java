package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKHostedAdTemplate;", "", "name", "", "template", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTemplate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKHostedAdTemplate */
public final class AKHostedAdTemplate {
    private final String name;
    private final String template;

    public AKHostedAdTemplate(String str, String str2) {
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, "template");
        this.name = str;
        this.template = str2;
    }

    public static /* synthetic */ AKHostedAdTemplate copy$default(AKHostedAdTemplate aKHostedAdTemplate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aKHostedAdTemplate.name;
        }
        if ((i & 2) != 0) {
            str2 = aKHostedAdTemplate.template;
        }
        return aKHostedAdTemplate.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.template;
    }

    public final AKHostedAdTemplate copy(String str, String str2) {
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, "template");
        return new AKHostedAdTemplate(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKHostedAdTemplate)) {
            return false;
        }
        AKHostedAdTemplate aKHostedAdTemplate = (AKHostedAdTemplate) obj;
        return C24362h.m61206a(this.name, aKHostedAdTemplate.name) && C24362h.m61206a(this.template, aKHostedAdTemplate.template);
    }

    public final String getName() {
        return this.name;
    }

    public final String getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return this.template.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKHostedAdTemplate(name=");
        J0.append(this.name);
        J0.append(", template=");
        return C0017h.m57N(J0, this.template, ')');
    }
}
