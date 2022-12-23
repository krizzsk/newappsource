package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0016g;
import p988j$.util.Spliterator;

@Metadata(mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jí\u0001\u0010>\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006E"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKUmoVideoAdUIConfig;", "", "playIconUrl", "", "adDetailsBorderWidth", "adDetailsBorderColor", "adDetailsBgColor", "titleFontSize", "titleFontWeight", "titleColor", "descFontSize", "descFontWeight", "descColor", "displayUrlFontSize", "displayUrlFontWeight", "displayUrlColor", "ctaButtonBorderWidth", "ctaButtonBorderColor", "ctaButtonBgColor", "ctaFontSize", "ctaFontWeight", "ctaColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdDetailsBgColor", "()Ljava/lang/String;", "getAdDetailsBorderColor", "getAdDetailsBorderWidth", "getCtaButtonBgColor", "getCtaButtonBorderColor", "getCtaButtonBorderWidth", "getCtaColor", "getCtaFontSize", "getCtaFontWeight", "getDescColor", "getDescFontSize", "getDescFontWeight", "getDisplayUrlColor", "getDisplayUrlFontSize", "getDisplayUrlFontWeight", "getPlayIconUrl", "getTitleColor", "getTitleFontSize", "getTitleFontWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKUmoVideoAdUIConfig */
public final class AKUmoVideoAdUIConfig {
    private final String adDetailsBgColor;
    private final String adDetailsBorderColor;
    private final String adDetailsBorderWidth;
    private final String ctaButtonBgColor;
    private final String ctaButtonBorderColor;
    private final String ctaButtonBorderWidth;
    private final String ctaColor;
    private final String ctaFontSize;
    private final String ctaFontWeight;
    private final String descColor;
    private final String descFontSize;
    private final String descFontWeight;
    private final String displayUrlColor;
    private final String displayUrlFontSize;
    private final String displayUrlFontWeight;
    private final String playIconUrl;
    private final String titleColor;
    private final String titleFontSize;
    private final String titleFontWeight;

    public AKUmoVideoAdUIConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    public AKUmoVideoAdUIConfig(@C12943g(name = "playicon_url") String str, @C12943g(name = "addetails_border_width") String str2, @C12943g(name = "addetails_border_color") String str3, @C12943g(name = "addetails_bg_color") String str4, @C12943g(name = "title_font_size") String str5, @C12943g(name = "title_font_weight") String str6, @C12943g(name = "title_color") String str7, @C12943g(name = "desc_font_size") String str8, @C12943g(name = "desc_font_weight") String str9, @C12943g(name = "desc_color") String str10, @C12943g(name = "displayurl_font_size") String str11, @C12943g(name = "displayurl_font_weight") String str12, @C12943g(name = "displayurl_color") String str13, @C12943g(name = "cta_button_border_width") String str14, @C12943g(name = "cta_button_border_color") String str15, @C12943g(name = "cta_button_bg_color") String str16, @C12943g(name = "cta_font_size") String str17, @C12943g(name = "cta_font_weight") String str18, @C12943g(name = "cta_color") String str19) {
        this.playIconUrl = str;
        this.adDetailsBorderWidth = str2;
        this.adDetailsBorderColor = str3;
        this.adDetailsBgColor = str4;
        this.titleFontSize = str5;
        this.titleFontWeight = str6;
        this.titleColor = str7;
        this.descFontSize = str8;
        this.descFontWeight = str9;
        this.descColor = str10;
        this.displayUrlFontSize = str11;
        this.displayUrlFontWeight = str12;
        this.displayUrlColor = str13;
        this.ctaButtonBorderWidth = str14;
        this.ctaButtonBorderColor = str15;
        this.ctaButtonBgColor = str16;
        this.ctaFontSize = str17;
        this.ctaFontWeight = str18;
        this.ctaColor = str19;
    }

    public static /* synthetic */ AKUmoVideoAdUIConfig copy$default(AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, Object obj) {
        AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig2 = aKUmoVideoAdUIConfig;
        int i2 = i;
        return aKUmoVideoAdUIConfig.copy((i2 & 1) != 0 ? aKUmoVideoAdUIConfig2.playIconUrl : str, (i2 & 2) != 0 ? aKUmoVideoAdUIConfig2.adDetailsBorderWidth : str2, (i2 & 4) != 0 ? aKUmoVideoAdUIConfig2.adDetailsBorderColor : str3, (i2 & 8) != 0 ? aKUmoVideoAdUIConfig2.adDetailsBgColor : str4, (i2 & 16) != 0 ? aKUmoVideoAdUIConfig2.titleFontSize : str5, (i2 & 32) != 0 ? aKUmoVideoAdUIConfig2.titleFontWeight : str6, (i2 & 64) != 0 ? aKUmoVideoAdUIConfig2.titleColor : str7, (i2 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? aKUmoVideoAdUIConfig2.descFontSize : str8, (i2 & 256) != 0 ? aKUmoVideoAdUIConfig2.descFontWeight : str9, (i2 & 512) != 0 ? aKUmoVideoAdUIConfig2.descColor : str10, (i2 & 1024) != 0 ? aKUmoVideoAdUIConfig2.displayUrlFontSize : str11, (i2 & 2048) != 0 ? aKUmoVideoAdUIConfig2.displayUrlFontWeight : str12, (i2 & 4096) != 0 ? aKUmoVideoAdUIConfig2.displayUrlColor : str13, (i2 & 8192) != 0 ? aKUmoVideoAdUIConfig2.ctaButtonBorderWidth : str14, (i2 & Spliterator.SUBSIZED) != 0 ? aKUmoVideoAdUIConfig2.ctaButtonBorderColor : str15, (i2 & 32768) != 0 ? aKUmoVideoAdUIConfig2.ctaButtonBgColor : str16, (i2 & SQLiteDatabase.OPEN_FULLMUTEX) != 0 ? aKUmoVideoAdUIConfig2.ctaFontSize : str17, (i2 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 ? aKUmoVideoAdUIConfig2.ctaFontWeight : str18, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? aKUmoVideoAdUIConfig2.ctaColor : str19);
    }

    public final String component1() {
        return this.playIconUrl;
    }

    public final String component10() {
        return this.descColor;
    }

    public final String component11() {
        return this.displayUrlFontSize;
    }

    public final String component12() {
        return this.displayUrlFontWeight;
    }

    public final String component13() {
        return this.displayUrlColor;
    }

    public final String component14() {
        return this.ctaButtonBorderWidth;
    }

    public final String component15() {
        return this.ctaButtonBorderColor;
    }

    public final String component16() {
        return this.ctaButtonBgColor;
    }

    public final String component17() {
        return this.ctaFontSize;
    }

    public final String component18() {
        return this.ctaFontWeight;
    }

    public final String component19() {
        return this.ctaColor;
    }

    public final String component2() {
        return this.adDetailsBorderWidth;
    }

    public final String component3() {
        return this.adDetailsBorderColor;
    }

    public final String component4() {
        return this.adDetailsBgColor;
    }

    public final String component5() {
        return this.titleFontSize;
    }

    public final String component6() {
        return this.titleFontWeight;
    }

    public final String component7() {
        return this.titleColor;
    }

    public final String component8() {
        return this.descFontSize;
    }

    public final String component9() {
        return this.descFontWeight;
    }

    public final AKUmoVideoAdUIConfig copy(@C12943g(name = "playicon_url") String str, @C12943g(name = "addetails_border_width") String str2, @C12943g(name = "addetails_border_color") String str3, @C12943g(name = "addetails_bg_color") String str4, @C12943g(name = "title_font_size") String str5, @C12943g(name = "title_font_weight") String str6, @C12943g(name = "title_color") String str7, @C12943g(name = "desc_font_size") String str8, @C12943g(name = "desc_font_weight") String str9, @C12943g(name = "desc_color") String str10, @C12943g(name = "displayurl_font_size") String str11, @C12943g(name = "displayurl_font_weight") String str12, @C12943g(name = "displayurl_color") String str13, @C12943g(name = "cta_button_border_width") String str14, @C12943g(name = "cta_button_border_color") String str15, @C12943g(name = "cta_button_bg_color") String str16, @C12943g(name = "cta_font_size") String str17, @C12943g(name = "cta_font_weight") String str18, @C12943g(name = "cta_color") String str19) {
        return new AKUmoVideoAdUIConfig(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKUmoVideoAdUIConfig)) {
            return false;
        }
        AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig = (AKUmoVideoAdUIConfig) obj;
        return C24362h.m61206a(this.playIconUrl, aKUmoVideoAdUIConfig.playIconUrl) && C24362h.m61206a(this.adDetailsBorderWidth, aKUmoVideoAdUIConfig.adDetailsBorderWidth) && C24362h.m61206a(this.adDetailsBorderColor, aKUmoVideoAdUIConfig.adDetailsBorderColor) && C24362h.m61206a(this.adDetailsBgColor, aKUmoVideoAdUIConfig.adDetailsBgColor) && C24362h.m61206a(this.titleFontSize, aKUmoVideoAdUIConfig.titleFontSize) && C24362h.m61206a(this.titleFontWeight, aKUmoVideoAdUIConfig.titleFontWeight) && C24362h.m61206a(this.titleColor, aKUmoVideoAdUIConfig.titleColor) && C24362h.m61206a(this.descFontSize, aKUmoVideoAdUIConfig.descFontSize) && C24362h.m61206a(this.descFontWeight, aKUmoVideoAdUIConfig.descFontWeight) && C24362h.m61206a(this.descColor, aKUmoVideoAdUIConfig.descColor) && C24362h.m61206a(this.displayUrlFontSize, aKUmoVideoAdUIConfig.displayUrlFontSize) && C24362h.m61206a(this.displayUrlFontWeight, aKUmoVideoAdUIConfig.displayUrlFontWeight) && C24362h.m61206a(this.displayUrlColor, aKUmoVideoAdUIConfig.displayUrlColor) && C24362h.m61206a(this.ctaButtonBorderWidth, aKUmoVideoAdUIConfig.ctaButtonBorderWidth) && C24362h.m61206a(this.ctaButtonBorderColor, aKUmoVideoAdUIConfig.ctaButtonBorderColor) && C24362h.m61206a(this.ctaButtonBgColor, aKUmoVideoAdUIConfig.ctaButtonBgColor) && C24362h.m61206a(this.ctaFontSize, aKUmoVideoAdUIConfig.ctaFontSize) && C24362h.m61206a(this.ctaFontWeight, aKUmoVideoAdUIConfig.ctaFontWeight) && C24362h.m61206a(this.ctaColor, aKUmoVideoAdUIConfig.ctaColor);
    }

    public final String getAdDetailsBgColor() {
        return this.adDetailsBgColor;
    }

    public final String getAdDetailsBorderColor() {
        return this.adDetailsBorderColor;
    }

    public final String getAdDetailsBorderWidth() {
        return this.adDetailsBorderWidth;
    }

    public final String getCtaButtonBgColor() {
        return this.ctaButtonBgColor;
    }

    public final String getCtaButtonBorderColor() {
        return this.ctaButtonBorderColor;
    }

    public final String getCtaButtonBorderWidth() {
        return this.ctaButtonBorderWidth;
    }

    public final String getCtaColor() {
        return this.ctaColor;
    }

    public final String getCtaFontSize() {
        return this.ctaFontSize;
    }

    public final String getCtaFontWeight() {
        return this.ctaFontWeight;
    }

    public final String getDescColor() {
        return this.descColor;
    }

    public final String getDescFontSize() {
        return this.descFontSize;
    }

    public final String getDescFontWeight() {
        return this.descFontWeight;
    }

    public final String getDisplayUrlColor() {
        return this.displayUrlColor;
    }

    public final String getDisplayUrlFontSize() {
        return this.displayUrlFontSize;
    }

    public final String getDisplayUrlFontWeight() {
        return this.displayUrlFontWeight;
    }

    public final String getPlayIconUrl() {
        return this.playIconUrl;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public final String getTitleFontSize() {
        return this.titleFontSize;
    }

    public final String getTitleFontWeight() {
        return this.titleFontWeight;
    }

    public int hashCode() {
        String str = this.playIconUrl;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adDetailsBorderWidth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adDetailsBorderColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adDetailsBgColor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleFontSize;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.titleFontWeight;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.titleColor;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.descFontSize;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.descFontWeight;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.descColor;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.displayUrlFontSize;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.displayUrlFontWeight;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.displayUrlColor;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ctaButtonBorderWidth;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.ctaButtonBorderColor;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.ctaButtonBgColor;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.ctaFontSize;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.ctaFontWeight;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.ctaColor;
        if (str19 != null) {
            i = str19.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AKUmoVideoAdUIConfig(playIconUrl=");
        k.append(this.playIconUrl);
        k.append(", adDetailsBorderWidth=");
        k.append(this.adDetailsBorderWidth);
        k.append(", adDetailsBorderColor=");
        k.append(this.adDetailsBorderColor);
        k.append(", adDetailsBgColor=");
        k.append(this.adDetailsBgColor);
        k.append(", titleFontSize=");
        k.append(this.titleFontSize);
        k.append(", titleFontWeight=");
        k.append(this.titleFontWeight);
        k.append(", titleColor=");
        k.append(this.titleColor);
        k.append(", descFontSize=");
        k.append(this.descFontSize);
        k.append(", descFontWeight=");
        k.append(this.descFontWeight);
        k.append(", descColor=");
        k.append(this.descColor);
        k.append(", displayUrlFontSize=");
        k.append(this.displayUrlFontSize);
        k.append(", displayUrlFontWeight=");
        k.append(this.displayUrlFontWeight);
        k.append(", displayUrlColor=");
        k.append(this.displayUrlColor);
        k.append(", ctaButtonBorderWidth=");
        k.append(this.ctaButtonBorderWidth);
        k.append(", ctaButtonBorderColor=");
        k.append(this.ctaButtonBorderColor);
        k.append(", ctaButtonBgColor=");
        k.append(this.ctaButtonBgColor);
        k.append(", ctaFontSize=");
        k.append(this.ctaFontSize);
        k.append(", ctaFontWeight=");
        k.append(this.ctaFontWeight);
        k.append(", ctaColor=");
        return C0016g.m30n(k, this.ctaColor, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AKUmoVideoAdUIConfig(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r21
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r22
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r23
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r25
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r2
            goto L_0x0034
        L_0x0032:
            r7 = r26
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r2
            goto L_0x003c
        L_0x003a:
            r8 = r27
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = r2
            goto L_0x0044
        L_0x0042:
            r9 = r28
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = r2
            goto L_0x004c
        L_0x004a:
            r10 = r29
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = r2
            goto L_0x0054
        L_0x0052:
            r11 = r30
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005a
            r12 = r2
            goto L_0x005c
        L_0x005a:
            r12 = r31
        L_0x005c:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0062
            r13 = r2
            goto L_0x0064
        L_0x0062:
            r13 = r32
        L_0x0064:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006a
            r14 = r2
            goto L_0x006c
        L_0x006a:
            r14 = r33
        L_0x006c:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0072
            r15 = r2
            goto L_0x0074
        L_0x0072:
            r15 = r34
        L_0x0074:
            r41 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007d
            r2 = r41
            goto L_0x007f
        L_0x007d:
            r2 = r35
        L_0x007f:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0089
            r16 = r41
            goto L_0x008b
        L_0x0089:
            r16 = r36
        L_0x008b:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0094
            r17 = r41
            goto L_0x0096
        L_0x0094:
            r17 = r37
        L_0x0096:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009f
            r18 = r41
            goto L_0x00a1
        L_0x009f:
            r18 = r38
        L_0x00a1:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00aa
            r0 = r41
            goto L_0x00ac
        L_0x00aa:
            r0 = r39
        L_0x00ac:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r2
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKUmoVideoAdUIConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
