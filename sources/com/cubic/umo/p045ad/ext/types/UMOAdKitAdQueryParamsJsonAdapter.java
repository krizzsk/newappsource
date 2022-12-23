package com.cubic.umo.p045ad.ext.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import p358af.C13437d;
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/types/UMOAdKitAdQueryParamsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/ext/types/UMOAdKitAdQueryParams;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParamsJsonAdapter */
public final class UMOAdKitAdQueryParamsJsonAdapter extends C8011k<UMOAdKitAdQueryParams> {

    /* renamed from: a */
    public final JsonReader.C7986a f7306a = JsonReader.C7986a.m18216a("extraQSParams", "appDomain", "appStoreUrl", "appCat", "appSectioncat", "appPagecat", "appPrivacypolicy", "appPaid", "appKeywords", "appPublisherName", "appPublisherCat", "appContentId", "appContentEpisode", "appContentTitle", "appContentSeries", "appContentSeason", "appContentArtist", "appContentGenre", "appContentAlbum", "appContentIsrc", "appContentUrl", "appContentCat", "appContentProdq", "appContentContext", "appContentContentrating", "appContentUserrating", "appContentQagmediarating", "appContentKeywords", "appContentLivestream", "appContentSourcerelationship", "appContentLen", "appContentLanguage", "appContentEmbeddable", "appContentProducerId", "appContentProducerName", "appContentProducerCat", "appContentProducerDomain", "deviceGeoLat", "deviceGeoLon", "deviceGeoCountry", "deviceGeoRegion", "deviceGeoCity", "deviceGeoZip", "userYob", "userGender", "userKeywords", "userCustomdata", "userGeoLat", "userGeoLon", "userGeoCountry", "userGeoRegion", "userGeoCity", "userGeoZip", "gdprCompliant");

    /* renamed from: b */
    public final C8011k<String> f7307b;

    /* renamed from: c */
    public final C8011k<List<String>> f7308c;

    /* renamed from: d */
    public final C8011k<Integer> f7309d;

    /* renamed from: e */
    public volatile Constructor<UMOAdKitAdQueryParams> f7310e;

    public UMOAdKitAdQueryParamsJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7307b = C18201b.m44910D(oVar2, cls, "extraQSParams");
        this.f7308c = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, cls), "appCat");
        this.f7309d = C18201b.m44910D(oVar2, Integer.class, "appPrivacypolicy");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01e8, code lost:
        r6 = r6 & r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x03a7, code lost:
        r5 = r5 & r62;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r85) {
        /*
            r84 = this;
            r0 = r84
            r1 = r85
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "reader"
            mf0.C24362h.m61211f(r1, r4)
            r85.mo24995i()
            r4 = 0
            r5 = -1
            r8 = r4
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r6 = -1
        L_0x0077:
            boolean r7 = r85.mo24999v()
            if (r7 == 0) goto L_0x03b3
            com.squareup.moshi.JsonReader$a r7 = r0.f7306a
            int r7 = r1.mo24989O(r7)
            r62 = -131073(0xfffffffffffdffff, float:NaN)
            r63 = -2097153(0xffffffffffdfffff, float:NaN)
            r64 = -1048577(0xffffffffffefffff, float:NaN)
            r65 = -524289(0xfffffffffff7ffff, float:NaN)
            r66 = -262145(0xfffffffffffbffff, float:NaN)
            r67 = -65537(0xfffffffffffeffff, float:NaN)
            r68 = -32769(0xffffffffffff7fff, float:NaN)
            r69 = -16385(0xffffffffffffbfff, float:NaN)
            r70 = -8193(0xffffffffffffdfff, float:NaN)
            r71 = -4097(0xffffffffffffefff, float:NaN)
            r72 = -2049(0xfffffffffffff7ff, float:NaN)
            r73 = -1025(0xfffffffffffffbff, float:NaN)
            r74 = -513(0xfffffffffffffdff, float:NaN)
            r75 = -257(0xfffffffffffffeff, float:NaN)
            r76 = -129(0xffffffffffffff7f, float:NaN)
            r77 = -65
            r78 = -33
            r79 = -17
            r80 = -9
            r81 = -5
            r82 = -3
            r83 = -2
            switch(r7) {
                case -1: goto L_0x03ab;
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0384;
                case 3: goto L_0x0378;
                case 4: goto L_0x036c;
                case 5: goto L_0x0360;
                case 6: goto L_0x0354;
                case 7: goto L_0x0348;
                case 8: goto L_0x033b;
                case 9: goto L_0x032e;
                case 10: goto L_0x0320;
                case 11: goto L_0x0312;
                case 12: goto L_0x0304;
                case 13: goto L_0x02f6;
                case 14: goto L_0x02e8;
                case 15: goto L_0x02d9;
                case 16: goto L_0x02ca;
                case 17: goto L_0x02be;
                case 18: goto L_0x02af;
                case 19: goto L_0x02a0;
                case 20: goto L_0x0291;
                case 21: goto L_0x0282;
                case 22: goto L_0x0273;
                case 23: goto L_0x0264;
                case 24: goto L_0x0255;
                case 25: goto L_0x0246;
                case 26: goto L_0x0237;
                case 27: goto L_0x0228;
                case 28: goto L_0x0219;
                case 29: goto L_0x020a;
                case 30: goto L_0x01fb;
                case 31: goto L_0x01ec;
                case 32: goto L_0x01dc;
                case 33: goto L_0x01cf;
                case 34: goto L_0x01c2;
                case 35: goto L_0x01b5;
                case 36: goto L_0x01a8;
                case 37: goto L_0x019b;
                case 38: goto L_0x018e;
                case 39: goto L_0x0181;
                case 40: goto L_0x0174;
                case 41: goto L_0x0166;
                case 42: goto L_0x0158;
                case 43: goto L_0x014a;
                case 44: goto L_0x013c;
                case 45: goto L_0x012e;
                case 46: goto L_0x0120;
                case 47: goto L_0x0111;
                case 48: goto L_0x0102;
                case 49: goto L_0x00f6;
                case 50: goto L_0x00e7;
                case 51: goto L_0x00d8;
                case 52: goto L_0x00c9;
                case 53: goto L_0x00ba;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x0077
        L_0x00ba:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r61 = r7
            java.lang.Integer r61 = (java.lang.Integer) r61
            r62 = -2097153(0xffffffffffdfffff, float:NaN)
            goto L_0x01e8
        L_0x00c9:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r60 = r7
            java.lang.String r60 = (java.lang.String) r60
            r62 = -1048577(0xffffffffffefffff, float:NaN)
            goto L_0x01e8
        L_0x00d8:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r59 = r7
            java.lang.String r59 = (java.lang.String) r59
            r62 = -524289(0xfffffffffff7ffff, float:NaN)
            goto L_0x01e8
        L_0x00e7:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r58 = r7
            java.lang.String r58 = (java.lang.String) r58
            r62 = -262145(0xfffffffffffbffff, float:NaN)
            goto L_0x01e8
        L_0x00f6:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r57 = r7
            java.lang.String r57 = (java.lang.String) r57
            goto L_0x01e8
        L_0x0102:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r56 = r7
            java.lang.String r56 = (java.lang.String) r56
            r62 = -65537(0xfffffffffffeffff, float:NaN)
            goto L_0x01e8
        L_0x0111:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r55 = r7
            java.lang.String r55 = (java.lang.String) r55
            r62 = -32769(0xffffffffffff7fff, float:NaN)
            goto L_0x01e8
        L_0x0120:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r54 = r7
            java.lang.String r54 = (java.lang.String) r54
            r62 = -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x01e8
        L_0x012e:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r53 = r7
            java.lang.String r53 = (java.lang.String) r53
            r62 = -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x01e8
        L_0x013c:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r52 = r7
            java.lang.String r52 = (java.lang.String) r52
            r62 = -4097(0xffffffffffffefff, float:NaN)
            goto L_0x01e8
        L_0x014a:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r51 = r7
            java.lang.Integer r51 = (java.lang.Integer) r51
            r62 = -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x01e8
        L_0x0158:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r50 = r7
            java.lang.String r50 = (java.lang.String) r50
            r62 = -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x01e8
        L_0x0166:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r49 = r7
            java.lang.String r49 = (java.lang.String) r49
            r62 = -513(0xfffffffffffffdff, float:NaN)
            goto L_0x01e8
        L_0x0174:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r48 = r7
            java.lang.String r48 = (java.lang.String) r48
            r62 = -257(0xfffffffffffffeff, float:NaN)
            goto L_0x01e8
        L_0x0181:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r47 = r7
            java.lang.String r47 = (java.lang.String) r47
            r62 = -129(0xffffffffffffff7f, float:NaN)
            goto L_0x01e8
        L_0x018e:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r46 = r7
            java.lang.String r46 = (java.lang.String) r46
            r62 = -65
            goto L_0x01e8
        L_0x019b:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r45 = r7
            java.lang.String r45 = (java.lang.String) r45
            r62 = -33
            goto L_0x01e8
        L_0x01a8:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r44 = r7
            java.lang.String r44 = (java.lang.String) r44
            r62 = -17
            goto L_0x01e8
        L_0x01b5:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r7 = r0.f7308c
            java.lang.Object r7 = r7.mo11093a(r1)
            r43 = r7
            java.util.List r43 = (java.util.List) r43
            r62 = -9
            goto L_0x01e8
        L_0x01c2:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r42 = r7
            java.lang.String r42 = (java.lang.String) r42
            r62 = -5
            goto L_0x01e8
        L_0x01cf:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r41 = r7
            java.lang.String r41 = (java.lang.String) r41
            r62 = -3
            goto L_0x01e8
        L_0x01dc:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r40 = r7
            java.lang.Integer r40 = (java.lang.Integer) r40
            r62 = -2
        L_0x01e8:
            r6 = r6 & r62
            goto L_0x0077
        L_0x01ec:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r39 = r7
            java.lang.String r39 = (java.lang.String) r39
            r62 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x03a7
        L_0x01fb:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r38 = r7
            java.lang.Integer r38 = (java.lang.Integer) r38
            r62 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            goto L_0x03a7
        L_0x020a:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r37 = r7
            java.lang.Integer r37 = (java.lang.Integer) r37
            r62 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            goto L_0x03a7
        L_0x0219:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r36 = r7
            java.lang.Integer r36 = (java.lang.Integer) r36
            r62 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            goto L_0x03a7
        L_0x0228:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r35 = r7
            java.lang.String r35 = (java.lang.String) r35
            r62 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            goto L_0x03a7
        L_0x0237:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r34 = r7
            java.lang.Integer r34 = (java.lang.Integer) r34
            r62 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            goto L_0x03a7
        L_0x0246:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r33 = r7
            java.lang.String r33 = (java.lang.String) r33
            r62 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            goto L_0x03a7
        L_0x0255:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r32 = r7
            java.lang.String r32 = (java.lang.String) r32
            r62 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            goto L_0x03a7
        L_0x0264:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r31 = r7
            java.lang.Integer r31 = (java.lang.Integer) r31
            r62 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x03a7
        L_0x0273:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r30 = r7
            java.lang.Integer r30 = (java.lang.Integer) r30
            r62 = -4194305(0xffffffffffbfffff, float:NaN)
            goto L_0x03a7
        L_0x0282:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r7 = r0.f7308c
            java.lang.Object r7 = r7.mo11093a(r1)
            r29 = r7
            java.util.List r29 = (java.util.List) r29
            r62 = -2097153(0xffffffffffdfffff, float:NaN)
            goto L_0x03a7
        L_0x0291:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r28 = r7
            java.lang.String r28 = (java.lang.String) r28
            r62 = -1048577(0xffffffffffefffff, float:NaN)
            goto L_0x03a7
        L_0x02a0:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r27 = r7
            java.lang.String r27 = (java.lang.String) r27
            r62 = -524289(0xfffffffffff7ffff, float:NaN)
            goto L_0x03a7
        L_0x02af:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r26 = r7
            java.lang.String r26 = (java.lang.String) r26
            r62 = -262145(0xfffffffffffbffff, float:NaN)
            goto L_0x03a7
        L_0x02be:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r25 = r7
            java.lang.String r25 = (java.lang.String) r25
            goto L_0x03a7
        L_0x02ca:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r24 = r7
            java.lang.String r24 = (java.lang.String) r24
            r62 = -65537(0xfffffffffffeffff, float:NaN)
            goto L_0x03a7
        L_0x02d9:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r23 = r7
            java.lang.String r23 = (java.lang.String) r23
            r62 = -32769(0xffffffffffff7fff, float:NaN)
            goto L_0x03a7
        L_0x02e8:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r22 = r7
            java.lang.String r22 = (java.lang.String) r22
            r62 = -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x03a7
        L_0x02f6:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r21 = r7
            java.lang.String r21 = (java.lang.String) r21
            r62 = -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x03a7
        L_0x0304:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r20 = r7
            java.lang.Integer r20 = (java.lang.Integer) r20
            r62 = -4097(0xffffffffffffefff, float:NaN)
            goto L_0x03a7
        L_0x0312:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r19 = r7
            java.lang.String r19 = (java.lang.String) r19
            r62 = -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x03a7
        L_0x0320:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r7 = r0.f7308c
            java.lang.Object r7 = r7.mo11093a(r1)
            r18 = r7
            java.util.List r18 = (java.util.List) r18
            r62 = -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x03a7
        L_0x032e:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r17 = r7
            java.lang.String r17 = (java.lang.String) r17
            r62 = -513(0xfffffffffffffdff, float:NaN)
            goto L_0x03a7
        L_0x033b:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r16 = r7
            java.lang.String r16 = (java.lang.String) r16
            r62 = -257(0xfffffffffffffeff, float:NaN)
            goto L_0x03a7
        L_0x0348:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r15 = r7
            java.lang.Integer r15 = (java.lang.Integer) r15
            r62 = -129(0xffffffffffffff7f, float:NaN)
            goto L_0x03a7
        L_0x0354:
            com.squareup.moshi.k<java.lang.Integer> r7 = r0.f7309d
            java.lang.Object r7 = r7.mo11093a(r1)
            r14 = r7
            java.lang.Integer r14 = (java.lang.Integer) r14
            r62 = -65
            goto L_0x03a7
        L_0x0360:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r7 = r0.f7308c
            java.lang.Object r7 = r7.mo11093a(r1)
            r13 = r7
            java.util.List r13 = (java.util.List) r13
            r62 = -33
            goto L_0x03a7
        L_0x036c:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r7 = r0.f7308c
            java.lang.Object r7 = r7.mo11093a(r1)
            r12 = r7
            java.util.List r12 = (java.util.List) r12
            r62 = -17
            goto L_0x03a7
        L_0x0378:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r7 = r0.f7308c
            java.lang.Object r7 = r7.mo11093a(r1)
            r11 = r7
            java.util.List r11 = (java.util.List) r11
            r62 = -9
            goto L_0x03a7
        L_0x0384:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r10 = r7
            java.lang.String r10 = (java.lang.String) r10
            r62 = -5
            goto L_0x03a7
        L_0x0390:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            r62 = -3
            goto L_0x03a7
        L_0x039c:
            com.squareup.moshi.k<java.lang.String> r7 = r0.f7307b
            java.lang.Object r7 = r7.mo11093a(r1)
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r62 = -2
        L_0x03a7:
            r5 = r5 & r62
            goto L_0x0077
        L_0x03ab:
            r85.mo24991S()
            r85.mo24992T()
            goto L_0x0077
        L_0x03b3:
            r85.mo24997r()
            if (r5 != 0) goto L_0x03c4
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            if (r6 != r1) goto L_0x03c4
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = new com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            goto L_0x05ba
        L_0x03c4:
            java.lang.reflect.Constructor<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f7310e
            if (r1 != 0) goto L_0x04c7
            r1 = 57
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r7 = 0
            r1[r7] = r3
            r7 = 1
            r1[r7] = r3
            r7 = 2
            r1[r7] = r3
            r7 = 3
            java.lang.Class<java.util.List> r62 = java.util.List.class
            r1[r7] = r62
            r7 = 4
            java.lang.Class<java.util.List> r62 = java.util.List.class
            r1[r7] = r62
            r7 = 5
            java.lang.Class<java.util.List> r62 = java.util.List.class
            r1[r7] = r62
            r7 = 6
            r1[r7] = r2
            r7 = 7
            r1[r7] = r2
            r7 = 8
            r1[r7] = r3
            r7 = 9
            r1[r7] = r3
            r7 = 10
            java.lang.Class<java.util.List> r62 = java.util.List.class
            r1[r7] = r62
            r7 = 11
            r1[r7] = r3
            r7 = 12
            r1[r7] = r2
            r7 = 13
            r1[r7] = r3
            r7 = 14
            r1[r7] = r3
            r7 = 15
            r1[r7] = r3
            r7 = 16
            r1[r7] = r3
            r7 = 17
            r1[r7] = r3
            r7 = 18
            r1[r7] = r3
            r7 = 19
            r1[r7] = r3
            r7 = 20
            r1[r7] = r3
            r7 = 21
            java.lang.Class<java.util.List> r62 = java.util.List.class
            r1[r7] = r62
            r7 = 22
            r1[r7] = r2
            r7 = 23
            r1[r7] = r2
            r7 = 24
            r1[r7] = r3
            r7 = 25
            r1[r7] = r3
            r7 = 26
            r1[r7] = r2
            r7 = 27
            r1[r7] = r3
            r7 = 28
            r1[r7] = r2
            r7 = 29
            r1[r7] = r2
            r7 = 30
            r1[r7] = r2
            r7 = 31
            r1[r7] = r3
            r7 = 32
            r1[r7] = r2
            r7 = 33
            r1[r7] = r3
            r7 = 34
            r1[r7] = r3
            r7 = 35
            java.lang.Class<java.util.List> r62 = java.util.List.class
            r1[r7] = r62
            r7 = 36
            r1[r7] = r3
            r7 = 37
            r1[r7] = r3
            r7 = 38
            r1[r7] = r3
            r7 = 39
            r1[r7] = r3
            r7 = 40
            r1[r7] = r3
            r7 = 41
            r1[r7] = r3
            r7 = 42
            r1[r7] = r3
            r7 = 43
            r1[r7] = r2
            r7 = 44
            r1[r7] = r3
            r7 = 45
            r1[r7] = r3
            r7 = 46
            r1[r7] = r3
            r7 = 47
            r1[r7] = r3
            r7 = 48
            r1[r7] = r3
            r7 = 49
            r1[r7] = r3
            r7 = 50
            r1[r7] = r3
            r7 = 51
            r1[r7] = r3
            r7 = 52
            r1[r7] = r3
            r3 = 53
            r1[r3] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 54
            r1[r3] = r2
            r3 = 55
            r1[r3] = r2
            java.lang.Class<?> r2 = ob0.C12977b.f32133c
            r3 = 56
            r1[r3] = r2
            java.lang.Class<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams.class
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r1)
            r0.f7310e = r1
            bf0.d r2 = bf0.C21050d.f52856a
            java.lang.String r2 = "UMOAdKitAdQueryParams::c…his.constructorRef = it }"
            mf0.C24362h.m61210e(r1, r2)
        L_0x04c7:
            r2 = 57
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            r3 = 1
            r2[r3] = r9
            r3 = 2
            r2[r3] = r10
            r3 = 3
            r2[r3] = r11
            r3 = 4
            r2[r3] = r12
            r3 = 5
            r2[r3] = r13
            r3 = 6
            r2[r3] = r14
            r3 = 7
            r2[r3] = r15
            r3 = 8
            r2[r3] = r16
            r3 = 9
            r2[r3] = r17
            r3 = 10
            r2[r3] = r18
            r3 = 11
            r2[r3] = r19
            r3 = 12
            r2[r3] = r20
            r3 = 13
            r2[r3] = r21
            r3 = 14
            r2[r3] = r22
            r3 = 15
            r2[r3] = r23
            r3 = 16
            r2[r3] = r24
            r3 = 17
            r2[r3] = r25
            r3 = 18
            r2[r3] = r26
            r3 = 19
            r2[r3] = r27
            r3 = 20
            r2[r3] = r28
            r3 = 21
            r2[r3] = r29
            r3 = 22
            r2[r3] = r30
            r3 = 23
            r2[r3] = r31
            r3 = 24
            r2[r3] = r32
            r3 = 25
            r2[r3] = r33
            r3 = 26
            r2[r3] = r34
            r3 = 27
            r2[r3] = r35
            r3 = 28
            r2[r3] = r36
            r3 = 29
            r2[r3] = r37
            r3 = 30
            r2[r3] = r38
            r3 = 31
            r2[r3] = r39
            r3 = 32
            r2[r3] = r40
            r3 = 33
            r2[r3] = r41
            r3 = 34
            r2[r3] = r42
            r3 = 35
            r2[r3] = r43
            r3 = 36
            r2[r3] = r44
            r3 = 37
            r2[r3] = r45
            r3 = 38
            r2[r3] = r46
            r3 = 39
            r2[r3] = r47
            r3 = 40
            r2[r3] = r48
            r3 = 41
            r2[r3] = r49
            r3 = 42
            r2[r3] = r50
            r3 = 43
            r2[r3] = r51
            r3 = 44
            r2[r3] = r52
            r3 = 45
            r2[r3] = r53
            r3 = 46
            r2[r3] = r54
            r3 = 47
            r2[r3] = r55
            r3 = 48
            r2[r3] = r56
            r3 = 49
            r2[r3] = r57
            r3 = 50
            r2[r3] = r58
            r3 = 51
            r2[r3] = r59
            r3 = 52
            r2[r3] = r60
            r3 = 53
            r2[r3] = r61
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r5 = 54
            r2[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5 = 55
            r2[r5] = r3
            r3 = 56
            r2[r3] = r4
            java.lang.Object r1 = r1.newInstance(r2)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            mf0.C24362h.m61210e(r1, r2)
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
        L_0x05ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParamsJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        UMOAdKitAdQueryParams uMOAdKitAdQueryParams = (UMOAdKitAdQueryParams) obj;
        C24362h.m61211f(kVar, "writer");
        if (uMOAdKitAdQueryParams != null) {
            kVar.mo25074i();
            kVar.mo25077w("extraQSParams");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7278a);
            kVar.mo25077w("appDomain");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7280b);
            kVar.mo25077w("appStoreUrl");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7282c);
            kVar.mo25077w("appCat");
            this.f7308c.mo11094e(kVar, uMOAdKitAdQueryParams.f7283d);
            kVar.mo25077w("appSectioncat");
            this.f7308c.mo11094e(kVar, uMOAdKitAdQueryParams.f7284e);
            kVar.mo25077w("appPagecat");
            this.f7308c.mo11094e(kVar, uMOAdKitAdQueryParams.f7285f);
            kVar.mo25077w("appPrivacypolicy");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7286g);
            kVar.mo25077w("appPaid");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7287h);
            kVar.mo25077w("appKeywords");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7288i);
            kVar.mo25077w("appPublisherName");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7289j);
            kVar.mo25077w("appPublisherCat");
            this.f7308c.mo11094e(kVar, uMOAdKitAdQueryParams.f7290k);
            kVar.mo25077w("appContentId");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7291l);
            kVar.mo25077w("appContentEpisode");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7292m);
            kVar.mo25077w("appContentTitle");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7293n);
            kVar.mo25077w("appContentSeries");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7294o);
            kVar.mo25077w("appContentSeason");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7295p);
            kVar.mo25077w("appContentArtist");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7296q);
            kVar.mo25077w("appContentGenre");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7297r);
            kVar.mo25077w("appContentAlbum");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7298s);
            kVar.mo25077w("appContentIsrc");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7299t);
            kVar.mo25077w("appContentUrl");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7300u);
            kVar.mo25077w("appContentCat");
            this.f7308c.mo11094e(kVar, uMOAdKitAdQueryParams.f7301v);
            kVar.mo25077w("appContentProdq");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7302w);
            kVar.mo25077w("appContentContext");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7303x);
            kVar.mo25077w("appContentContentrating");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7304y);
            kVar.mo25077w("appContentUserrating");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7305z);
            kVar.mo25077w("appContentQagmediarating");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7252A);
            kVar.mo25077w("appContentKeywords");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7253B);
            kVar.mo25077w("appContentLivestream");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7254C);
            kVar.mo25077w("appContentSourcerelationship");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7255D);
            kVar.mo25077w("appContentLen");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7256E);
            kVar.mo25077w("appContentLanguage");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7257F);
            kVar.mo25077w("appContentEmbeddable");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7258G);
            kVar.mo25077w("appContentProducerId");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7259H);
            kVar.mo25077w("appContentProducerName");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7260I);
            kVar.mo25077w("appContentProducerCat");
            this.f7308c.mo11094e(kVar, uMOAdKitAdQueryParams.f7261J);
            kVar.mo25077w("appContentProducerDomain");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7262K);
            kVar.mo25077w("deviceGeoLat");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7263L);
            kVar.mo25077w("deviceGeoLon");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7264M);
            kVar.mo25077w("deviceGeoCountry");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7265N);
            kVar.mo25077w("deviceGeoRegion");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7266O);
            kVar.mo25077w("deviceGeoCity");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7267P);
            kVar.mo25077w("deviceGeoZip");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7268Q);
            kVar.mo25077w("userYob");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7269R);
            kVar.mo25077w("userGender");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7270S);
            kVar.mo25077w("userKeywords");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7271T);
            kVar.mo25077w("userCustomdata");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7272U);
            kVar.mo25077w("userGeoLat");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7273V);
            kVar.mo25077w("userGeoLon");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7274W);
            kVar.mo25077w("userGeoCountry");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7275X);
            kVar.mo25077w("userGeoRegion");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7276Y);
            kVar.mo25077w("userGeoCity");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7277Z);
            kVar.mo25077w("userGeoZip");
            this.f7307b.mo11094e(kVar, uMOAdKitAdQueryParams.f7279a0);
            kVar.mo25077w("gdprCompliant");
            this.f7309d.mo11094e(kVar, uMOAdKitAdQueryParams.f7281b0);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(43, "UMOAdKitAdQueryParams");
    }
}
