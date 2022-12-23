package zb0;

import com.cubic.umo.p045ad.ext.types.UMOAdKitAdPosition;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdSlot;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAppUserType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.types.AKHostedConfig;
import com.cubic.umo.p045ad.types.AKImpVideoOrBannerExt;
import com.cubic.umo.p045ad.types.AKPayloadExt;
import com.cubic.umo.p045ad.types.AKVideo;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc0.C12912d;
import p061d7.C4402a;
import p583jk.C17875h;
import wb0.C13233c;

/* renamed from: zb0.c */
public final class C13368c {

    /* renamed from: a */
    public Pair<UMOAdKitAdQueryParams, UMOAdKitAdQueryParams> f33183a;

    /* renamed from: zb0.c$a */
    public /* synthetic */ class C13369a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33184a;

        static {
            int[] iArr = new int[UMOAdKitAdSlot.values().length];
            iArr[UMOAdKitAdSlot.MIDROLL.ordinal()] = 1;
            iArr[UMOAdKitAdSlot.POSTROLL.ordinal()] = 2;
            int[] iArr2 = new int[UMOAdKitAppUserType.values().length];
            iArr2[UMOAdKitAppUserType.LOGGED_IN_USER.ordinal()] = 1;
            iArr2[UMOAdKitAppUserType.ANONYMOUS_USER.ordinal()] = 2;
            f33184a = iArr2;
        }
    }

    /* renamed from: a */
    public static int m33642a(C12912d dVar, boolean z) {
        Integer num;
        UMOAdKitAdPosition o;
        if (z) {
            return UMOAdKitAdPosition.FULL_SCREEN.getValue();
        }
        UMOAdKitBannerParams uMOAdKitBannerParams = dVar.f31966b;
        if (uMOAdKitBannerParams == null || (o = uMOAdKitBannerParams.mo11120o()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(o.getValue());
        }
        if (num == null) {
            return UMOAdKitAdPosition.UNKNOWN.getValue();
        }
        return num.intValue();
    }

    /* renamed from: e */
    public static AKVideo m33643e(String str, Integer num, Integer num2, String str2) {
        int i;
        int i2;
        String str3;
        List v = C13233c.m33353v();
        List E = C17875h.m44281E(2, 3, 5, 6, 7, 8);
        if (num == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        if (num2 == null) {
            i2 = -1;
        } else {
            i2 = num2.intValue();
        }
        List list = E;
        int i3 = i;
        AKVideo aKVideo = r0;
        int i4 = i2;
        AKVideo aKVideo2 = new AKVideo(v, 0, 0, list, i3, i4, 0, 0, 0, 0, 0, 0, 0, (List) null, 0, 0, 0, 0, (List) null, 0, C17875h.m44281E(1, 2), 0, C17875h.m44280D(2), str, 3145606, (DefaultConstructorMarker) null);
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        AKVideo aKVideo3 = aKVideo;
        aKVideo3.f7713y = new AKImpVideoOrBannerExt(str3, (String) null, (Boolean) null, 6, (DefaultConstructorMarker) null);
        return aKVideo3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cubic.umo.p045ad.types.AKApp mo40247b() {
        /*
            r38 = this;
            r0 = r38
            com.cubic.umo.ad.types.AKApp r13 = new com.cubic.umo.ad.types.AKApp
            java.lang.String r2 = zb0.C13364a.f33156b
            java.lang.String r3 = zb0.C13364a.f33158d
            java.lang.String r4 = zb0.C13364a.f33157c
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            r14 = 0
            if (r1 != 0) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x001a
        L_0x0018:
            r1 = r14
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = r1.f7280b
        L_0x001c:
            if (r1 != 0) goto L_0x002f
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0023
            goto L_0x002b
        L_0x0023:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r5 = r14
            goto L_0x0030
        L_0x002d:
            java.lang.String r1 = r1.f7280b
        L_0x002f:
            r5 = r1
        L_0x0030:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x003f
        L_0x003d:
            r1 = r14
            goto L_0x0041
        L_0x003f:
            java.lang.String r1 = r1.f7282c
        L_0x0041:
            if (r1 != 0) goto L_0x0054
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0052
        L_0x0050:
            r6 = r14
            goto L_0x0055
        L_0x0052:
            java.lang.String r1 = r1.f7282c
        L_0x0054:
            r6 = r1
        L_0x0055:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0064
        L_0x0062:
            r1 = r14
            goto L_0x0066
        L_0x0064:
            java.util.List<java.lang.String> r1 = r1.f7283d
        L_0x0066:
            if (r1 != 0) goto L_0x0079
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0077
        L_0x0075:
            r7 = r14
            goto L_0x007a
        L_0x0077:
            java.util.List<java.lang.String> r1 = r1.f7283d
        L_0x0079:
            r7 = r1
        L_0x007a:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0089
        L_0x0087:
            r1 = r14
            goto L_0x008b
        L_0x0089:
            java.util.List<java.lang.String> r1 = r1.f7284e
        L_0x008b:
            if (r1 != 0) goto L_0x009e
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x009c
        L_0x009a:
            r8 = r14
            goto L_0x009f
        L_0x009c:
            java.util.List<java.lang.String> r1 = r1.f7284e
        L_0x009e:
            r8 = r1
        L_0x009f:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x00a4
            goto L_0x00ac
        L_0x00a4:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00ae
        L_0x00ac:
            r1 = r14
            goto L_0x00b0
        L_0x00ae:
            java.util.List<java.lang.String> r1 = r1.f7285f
        L_0x00b0:
            if (r1 != 0) goto L_0x00c3
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x00b7
            goto L_0x00bf
        L_0x00b7:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00c1
        L_0x00bf:
            r9 = r14
            goto L_0x00c4
        L_0x00c1:
            java.util.List<java.lang.String> r1 = r1.f7285f
        L_0x00c3:
            r9 = r1
        L_0x00c4:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00d3
        L_0x00d1:
            r1 = r14
            goto L_0x00d5
        L_0x00d3:
            java.lang.Integer r1 = r1.f7286g
        L_0x00d5:
            if (r1 != 0) goto L_0x00e8
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x00dc
            goto L_0x00e4
        L_0x00dc:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00e6
        L_0x00e4:
            r10 = r14
            goto L_0x00e9
        L_0x00e6:
            java.lang.Integer r1 = r1.f7286g
        L_0x00e8:
            r10 = r1
        L_0x00e9:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x00ee
            goto L_0x00f6
        L_0x00ee:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00f8
        L_0x00f6:
            r1 = r14
            goto L_0x00fa
        L_0x00f8:
            java.lang.Integer r1 = r1.f7287h
        L_0x00fa:
            if (r1 != 0) goto L_0x010d
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0101
            goto L_0x0109
        L_0x0101:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x010b
        L_0x0109:
            r11 = r14
            goto L_0x010e
        L_0x010b:
            java.lang.Integer r1 = r1.f7287h
        L_0x010d:
            r11 = r1
        L_0x010e:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0113
            goto L_0x011b
        L_0x0113:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x011d
        L_0x011b:
            r1 = r14
            goto L_0x011f
        L_0x011d:
            java.lang.String r1 = r1.f7288i
        L_0x011f:
            if (r1 != 0) goto L_0x0132
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0126
            goto L_0x012e
        L_0x0126:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0130
        L_0x012e:
            r12 = r14
            goto L_0x0133
        L_0x0130:
            java.lang.String r1 = r1.f7288i
        L_0x0132:
            r12 = r1
        L_0x0133:
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.cubic.umo.ad.types.AKAppPublisher r1 = new com.cubic.umo.ad.types.AKAppPublisher
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x013e
            goto L_0x0146
        L_0x013e:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0148
        L_0x0146:
            r2 = r14
            goto L_0x014a
        L_0x0148:
            java.lang.String r2 = r2.f7289j
        L_0x014a:
            if (r2 != 0) goto L_0x015d
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0151
            goto L_0x0159
        L_0x0151:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x015b
        L_0x0159:
            r2 = r14
            goto L_0x015d
        L_0x015b:
            java.lang.String r2 = r2.f7289j
        L_0x015d:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r3 = r0.f33183a
            if (r3 != 0) goto L_0x0162
            goto L_0x016a
        L_0x0162:
            java.lang.Object r3 = r3.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r3 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r3
            if (r3 != 0) goto L_0x016c
        L_0x016a:
            r3 = r14
            goto L_0x016e
        L_0x016c:
            java.util.List<java.lang.String> r3 = r3.f7290k
        L_0x016e:
            if (r3 != 0) goto L_0x0181
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r3 = r0.f33183a
            if (r3 != 0) goto L_0x0175
            goto L_0x017d
        L_0x0175:
            java.lang.Object r3 = r3.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r3 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r3
            if (r3 != 0) goto L_0x017f
        L_0x017d:
            r3 = r14
            goto L_0x0181
        L_0x017f:
            java.util.List<java.lang.String> r3 = r3.f7290k
        L_0x0181:
            r1.<init>(r2, r3)
            r13.f7354l = r1
            com.cubic.umo.ad.types.AKAppContent r1 = new com.cubic.umo.ad.types.AKAppContent
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x018d
            goto L_0x0195
        L_0x018d:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0197
        L_0x0195:
            r2 = r14
            goto L_0x0199
        L_0x0197:
            java.lang.String r2 = r2.f7291l
        L_0x0199:
            if (r2 != 0) goto L_0x01ad
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x01a0
            goto L_0x01a8
        L_0x01a0:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x01ab
        L_0x01a8:
            r16 = r14
            goto L_0x01af
        L_0x01ab:
            java.lang.String r2 = r2.f7291l
        L_0x01ad:
            r16 = r2
        L_0x01af:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x01b4
            goto L_0x01bc
        L_0x01b4:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x01be
        L_0x01bc:
            r2 = r14
            goto L_0x01c0
        L_0x01be:
            java.lang.Integer r2 = r2.f7292m
        L_0x01c0:
            if (r2 != 0) goto L_0x01d4
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x01c7
            goto L_0x01cf
        L_0x01c7:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x01d2
        L_0x01cf:
            r17 = r14
            goto L_0x01d6
        L_0x01d2:
            java.lang.Integer r2 = r2.f7292m
        L_0x01d4:
            r17 = r2
        L_0x01d6:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x01db
            goto L_0x01e3
        L_0x01db:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x01e5
        L_0x01e3:
            r2 = r14
            goto L_0x01e7
        L_0x01e5:
            java.lang.String r2 = r2.f7293n
        L_0x01e7:
            if (r2 != 0) goto L_0x01fb
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x01ee
            goto L_0x01f6
        L_0x01ee:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x01f9
        L_0x01f6:
            r18 = r14
            goto L_0x01fd
        L_0x01f9:
            java.lang.String r2 = r2.f7293n
        L_0x01fb:
            r18 = r2
        L_0x01fd:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0202
            goto L_0x020a
        L_0x0202:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x020c
        L_0x020a:
            r2 = r14
            goto L_0x020e
        L_0x020c:
            java.lang.String r2 = r2.f7294o
        L_0x020e:
            if (r2 != 0) goto L_0x0222
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0215
            goto L_0x021d
        L_0x0215:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0220
        L_0x021d:
            r19 = r14
            goto L_0x0224
        L_0x0220:
            java.lang.String r2 = r2.f7294o
        L_0x0222:
            r19 = r2
        L_0x0224:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0229
            goto L_0x0231
        L_0x0229:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0233
        L_0x0231:
            r2 = r14
            goto L_0x0235
        L_0x0233:
            java.lang.String r2 = r2.f7295p
        L_0x0235:
            if (r2 != 0) goto L_0x0249
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x023c
            goto L_0x0244
        L_0x023c:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0247
        L_0x0244:
            r20 = r14
            goto L_0x024b
        L_0x0247:
            java.lang.String r2 = r2.f7295p
        L_0x0249:
            r20 = r2
        L_0x024b:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0250
            goto L_0x0258
        L_0x0250:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x025a
        L_0x0258:
            r2 = r14
            goto L_0x025c
        L_0x025a:
            java.lang.String r2 = r2.f7296q
        L_0x025c:
            if (r2 != 0) goto L_0x0270
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0263
            goto L_0x026b
        L_0x0263:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x026e
        L_0x026b:
            r21 = r14
            goto L_0x0272
        L_0x026e:
            java.lang.String r2 = r2.f7296q
        L_0x0270:
            r21 = r2
        L_0x0272:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0277
            goto L_0x027f
        L_0x0277:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0281
        L_0x027f:
            r2 = r14
            goto L_0x0283
        L_0x0281:
            java.lang.String r2 = r2.f7297r
        L_0x0283:
            if (r2 != 0) goto L_0x0297
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x028a
            goto L_0x0292
        L_0x028a:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0295
        L_0x0292:
            r22 = r14
            goto L_0x0299
        L_0x0295:
            java.lang.String r2 = r2.f7297r
        L_0x0297:
            r22 = r2
        L_0x0299:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x029e
            goto L_0x02a6
        L_0x029e:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x02a8
        L_0x02a6:
            r2 = r14
            goto L_0x02aa
        L_0x02a8:
            java.lang.String r2 = r2.f7298s
        L_0x02aa:
            if (r2 != 0) goto L_0x02be
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x02b1
            goto L_0x02b9
        L_0x02b1:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x02bc
        L_0x02b9:
            r23 = r14
            goto L_0x02c0
        L_0x02bc:
            java.lang.String r2 = r2.f7298s
        L_0x02be:
            r23 = r2
        L_0x02c0:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x02c5
            goto L_0x02cd
        L_0x02c5:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x02cf
        L_0x02cd:
            r2 = r14
            goto L_0x02d1
        L_0x02cf:
            java.lang.String r2 = r2.f7299t
        L_0x02d1:
            if (r2 != 0) goto L_0x02e5
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x02d8
            goto L_0x02e0
        L_0x02d8:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x02e3
        L_0x02e0:
            r24 = r14
            goto L_0x02e7
        L_0x02e3:
            java.lang.String r2 = r2.f7299t
        L_0x02e5:
            r24 = r2
        L_0x02e7:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x02f6
        L_0x02f4:
            r2 = r14
            goto L_0x02f8
        L_0x02f6:
            java.lang.String r2 = r2.f7300u
        L_0x02f8:
            if (r2 != 0) goto L_0x030c
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x02ff
            goto L_0x0307
        L_0x02ff:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x030a
        L_0x0307:
            r25 = r14
            goto L_0x030e
        L_0x030a:
            java.lang.String r2 = r2.f7300u
        L_0x030c:
            r25 = r2
        L_0x030e:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0313
            goto L_0x031b
        L_0x0313:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x031d
        L_0x031b:
            r2 = r14
            goto L_0x031f
        L_0x031d:
            java.util.List<java.lang.String> r2 = r2.f7301v
        L_0x031f:
            if (r2 != 0) goto L_0x0333
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0326
            goto L_0x032e
        L_0x0326:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0331
        L_0x032e:
            r26 = r14
            goto L_0x0335
        L_0x0331:
            java.util.List<java.lang.String> r2 = r2.f7301v
        L_0x0333:
            r26 = r2
        L_0x0335:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x033a
            goto L_0x0342
        L_0x033a:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0344
        L_0x0342:
            r2 = r14
            goto L_0x0346
        L_0x0344:
            java.lang.Integer r2 = r2.f7302w
        L_0x0346:
            if (r2 != 0) goto L_0x035a
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x034d
            goto L_0x0355
        L_0x034d:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0358
        L_0x0355:
            r27 = r14
            goto L_0x035c
        L_0x0358:
            java.lang.Integer r2 = r2.f7302w
        L_0x035a:
            r27 = r2
        L_0x035c:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0361
            goto L_0x0369
        L_0x0361:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x036b
        L_0x0369:
            r2 = r14
            goto L_0x036d
        L_0x036b:
            java.lang.Integer r2 = r2.f7303x
        L_0x036d:
            if (r2 != 0) goto L_0x0381
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0374
            goto L_0x037c
        L_0x0374:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x037f
        L_0x037c:
            r28 = r14
            goto L_0x0383
        L_0x037f:
            java.lang.Integer r2 = r2.f7303x
        L_0x0381:
            r28 = r2
        L_0x0383:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0388
            goto L_0x0390
        L_0x0388:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0392
        L_0x0390:
            r2 = r14
            goto L_0x0394
        L_0x0392:
            java.lang.String r2 = r2.f7304y
        L_0x0394:
            if (r2 != 0) goto L_0x03a8
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x039b
            goto L_0x03a3
        L_0x039b:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x03a6
        L_0x03a3:
            r29 = r14
            goto L_0x03aa
        L_0x03a6:
            java.lang.String r2 = r2.f7304y
        L_0x03a8:
            r29 = r2
        L_0x03aa:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x03af
            goto L_0x03b7
        L_0x03af:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x03b9
        L_0x03b7:
            r2 = r14
            goto L_0x03bb
        L_0x03b9:
            java.lang.String r2 = r2.f7305z
        L_0x03bb:
            if (r2 != 0) goto L_0x03cf
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x03c2
            goto L_0x03ca
        L_0x03c2:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x03cd
        L_0x03ca:
            r30 = r14
            goto L_0x03d1
        L_0x03cd:
            java.lang.String r2 = r2.f7305z
        L_0x03cf:
            r30 = r2
        L_0x03d1:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x03d6
            goto L_0x03de
        L_0x03d6:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x03e0
        L_0x03de:
            r2 = r14
            goto L_0x03e2
        L_0x03e0:
            java.lang.Integer r2 = r2.f7252A
        L_0x03e2:
            if (r2 != 0) goto L_0x03f6
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x03e9
            goto L_0x03f1
        L_0x03e9:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x03f4
        L_0x03f1:
            r31 = r14
            goto L_0x03f8
        L_0x03f4:
            java.lang.Integer r2 = r2.f7252A
        L_0x03f6:
            r31 = r2
        L_0x03f8:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x03fd
            goto L_0x0405
        L_0x03fd:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0407
        L_0x0405:
            r2 = r14
            goto L_0x0409
        L_0x0407:
            java.lang.String r2 = r2.f7253B
        L_0x0409:
            if (r2 != 0) goto L_0x041d
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0410
            goto L_0x0418
        L_0x0410:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x041b
        L_0x0418:
            r32 = r14
            goto L_0x041f
        L_0x041b:
            java.lang.String r2 = r2.f7253B
        L_0x041d:
            r32 = r2
        L_0x041f:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0424
            goto L_0x042c
        L_0x0424:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x042e
        L_0x042c:
            r2 = r14
            goto L_0x0430
        L_0x042e:
            java.lang.Integer r2 = r2.f7254C
        L_0x0430:
            if (r2 != 0) goto L_0x0444
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0437
            goto L_0x043f
        L_0x0437:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0442
        L_0x043f:
            r33 = r14
            goto L_0x0446
        L_0x0442:
            java.lang.Integer r2 = r2.f7254C
        L_0x0444:
            r33 = r2
        L_0x0446:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x044b
            goto L_0x0453
        L_0x044b:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0455
        L_0x0453:
            r2 = r14
            goto L_0x0457
        L_0x0455:
            java.lang.Integer r2 = r2.f7255D
        L_0x0457:
            if (r2 != 0) goto L_0x046b
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x045e
            goto L_0x0466
        L_0x045e:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0469
        L_0x0466:
            r34 = r14
            goto L_0x046d
        L_0x0469:
            java.lang.Integer r2 = r2.f7255D
        L_0x046b:
            r34 = r2
        L_0x046d:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0472
            goto L_0x047a
        L_0x0472:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x047c
        L_0x047a:
            r2 = r14
            goto L_0x047e
        L_0x047c:
            java.lang.Integer r2 = r2.f7256E
        L_0x047e:
            if (r2 != 0) goto L_0x0492
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0485
            goto L_0x048d
        L_0x0485:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x0490
        L_0x048d:
            r35 = r14
            goto L_0x0494
        L_0x0490:
            java.lang.Integer r2 = r2.f7256E
        L_0x0492:
            r35 = r2
        L_0x0494:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x0499
            goto L_0x04a1
        L_0x0499:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x04a3
        L_0x04a1:
            r2 = r14
            goto L_0x04a5
        L_0x04a3:
            java.lang.String r2 = r2.f7257F
        L_0x04a5:
            if (r2 != 0) goto L_0x04b9
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x04ac
            goto L_0x04b4
        L_0x04ac:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x04b7
        L_0x04b4:
            r36 = r14
            goto L_0x04bb
        L_0x04b7:
            java.lang.String r2 = r2.f7257F
        L_0x04b9:
            r36 = r2
        L_0x04bb:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x04c0
            goto L_0x04c8
        L_0x04c0:
            java.lang.Object r2 = r2.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x04ca
        L_0x04c8:
            r2 = r14
            goto L_0x04cc
        L_0x04ca:
            java.lang.Integer r2 = r2.f7258G
        L_0x04cc:
            if (r2 != 0) goto L_0x04e0
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r2 = r0.f33183a
            if (r2 != 0) goto L_0x04d3
            goto L_0x04db
        L_0x04d3:
            java.lang.Object r2 = r2.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r2 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r2
            if (r2 != 0) goto L_0x04de
        L_0x04db:
            r37 = r14
            goto L_0x04e2
        L_0x04de:
            java.lang.Integer r2 = r2.f7258G
        L_0x04e0:
            r37 = r2
        L_0x04e2:
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            com.cubic.umo.ad.types.AKAppContentProducer r2 = new com.cubic.umo.ad.types.AKAppContentProducer
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r3 = r0.f33183a
            if (r3 != 0) goto L_0x04ed
            goto L_0x04f5
        L_0x04ed:
            java.lang.Object r3 = r3.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r3 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r3
            if (r3 != 0) goto L_0x04f7
        L_0x04f5:
            r3 = r14
            goto L_0x04f9
        L_0x04f7:
            java.lang.String r3 = r3.f7259H
        L_0x04f9:
            if (r3 != 0) goto L_0x050c
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r3 = r0.f33183a
            if (r3 != 0) goto L_0x0500
            goto L_0x0508
        L_0x0500:
            java.lang.Object r3 = r3.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r3 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r3
            if (r3 != 0) goto L_0x050a
        L_0x0508:
            r3 = r14
            goto L_0x050c
        L_0x050a:
            java.lang.String r3 = r3.f7259H
        L_0x050c:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r4 = r0.f33183a
            if (r4 != 0) goto L_0x0511
            goto L_0x0519
        L_0x0511:
            java.lang.Object r4 = r4.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r4 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r4
            if (r4 != 0) goto L_0x051b
        L_0x0519:
            r4 = r14
            goto L_0x051d
        L_0x051b:
            java.lang.String r4 = r4.f7260I
        L_0x051d:
            if (r4 != 0) goto L_0x0530
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r4 = r0.f33183a
            if (r4 != 0) goto L_0x0524
            goto L_0x052c
        L_0x0524:
            java.lang.Object r4 = r4.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r4 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r4
            if (r4 != 0) goto L_0x052e
        L_0x052c:
            r4 = r14
            goto L_0x0530
        L_0x052e:
            java.lang.String r4 = r4.f7260I
        L_0x0530:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r5 = r0.f33183a
            if (r5 != 0) goto L_0x0535
            goto L_0x053d
        L_0x0535:
            java.lang.Object r5 = r5.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r5 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r5
            if (r5 != 0) goto L_0x053f
        L_0x053d:
            r5 = r14
            goto L_0x0541
        L_0x053f:
            java.util.List<java.lang.String> r5 = r5.f7261J
        L_0x0541:
            if (r5 != 0) goto L_0x0554
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r5 = r0.f33183a
            if (r5 != 0) goto L_0x0548
            goto L_0x0550
        L_0x0548:
            java.lang.Object r5 = r5.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r5 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r5
            if (r5 != 0) goto L_0x0552
        L_0x0550:
            r5 = r14
            goto L_0x0554
        L_0x0552:
            java.util.List<java.lang.String> r5 = r5.f7261J
        L_0x0554:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r6 = r0.f33183a
            if (r6 != 0) goto L_0x0559
            goto L_0x0561
        L_0x0559:
            java.lang.Object r6 = r6.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r6 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r6
            if (r6 != 0) goto L_0x0563
        L_0x0561:
            r6 = r14
            goto L_0x0565
        L_0x0563:
            java.lang.String r6 = r6.f7262K
        L_0x0565:
            if (r6 != 0) goto L_0x0578
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r6 = r0.f33183a
            if (r6 != 0) goto L_0x056c
            goto L_0x0579
        L_0x056c:
            java.lang.Object r6 = r6.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r6 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r6
            if (r6 != 0) goto L_0x0575
            goto L_0x0579
        L_0x0575:
            java.lang.String r14 = r6.f7262K
            goto L_0x0579
        L_0x0578:
            r14 = r6
        L_0x0579:
            r2.<init>(r3, r4, r5, r14)
            r1.f7379w = r2
            r13.f7355m = r1
            com.cubic.umo.ad.types.AKExt r1 = new com.cubic.umo.ad.types.AKExt
            r1.<init>()
            r13.f7356n = r1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C13368c.mo40247b():com.cubic.umo.ad.types.AKApp");
    }

    /* renamed from: c */
    public final AKPayloadExt mo40248c(boolean z) {
        String str;
        Integer num;
        Integer num2;
        UMOAdKitAdQueryParams d;
        UMOAdKitAdQueryParams c;
        AKHostedConfig aKHostedConfig;
        C4402a aVar = C13233c.f32844c;
        Integer num3 = null;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.f15455a;
        }
        if (str == null && ((aKHostedConfig = C13233c.f32845d) == null || (str = aKHostedConfig.getPublisherId()) == null)) {
            str = "Unknown";
        }
        String str2 = str;
        Pair<UMOAdKitAdQueryParams, UMOAdKitAdQueryParams> pair = this.f33183a;
        if (pair == null || (c = pair.mo59068c()) == null) {
            num = null;
        } else {
            num = c.f7281b0;
        }
        if (num == null) {
            Pair<UMOAdKitAdQueryParams, UMOAdKitAdQueryParams> pair2 = this.f33183a;
            if (!(pair2 == null || (d = pair2.mo59069d()) == null)) {
                num3 = d.f7281b0;
            }
            num2 = num3;
        } else {
            num2 = num;
        }
        return new AKPayloadExt(str2, "2.2.2", (String) null, z, num2, 4, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0114  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cubic.umo.p045ad.types.AKUser mo40249d(java.lang.String r12) {
        /*
            r11 = this;
            com.cubic.umo.ad.types.AKUser r0 = new com.cubic.umo.ad.types.AKUser
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            r2 = 0
            if (r1 != 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0012
        L_0x0010:
            r1 = r2
            goto L_0x0014
        L_0x0012:
            java.lang.Integer r1 = r1.f7269R
        L_0x0014:
            if (r1 != 0) goto L_0x0027
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0025
        L_0x0023:
            r1 = r2
            goto L_0x0027
        L_0x0025:
            java.lang.Integer r1 = r1.f7269R
        L_0x0027:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r3 = r11.f33183a
            if (r3 != 0) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            java.lang.Object r3 = r3.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r3 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r3
            if (r3 != 0) goto L_0x0036
        L_0x0034:
            r3 = r2
            goto L_0x0038
        L_0x0036:
            java.lang.String r3 = r3.f7270S
        L_0x0038:
            if (r3 != 0) goto L_0x004b
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r3 = r11.f33183a
            if (r3 != 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            java.lang.Object r3 = r3.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r3 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r3
            if (r3 != 0) goto L_0x0049
        L_0x0047:
            r3 = r2
            goto L_0x004b
        L_0x0049:
            java.lang.String r3 = r3.f7270S
        L_0x004b:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r4 = r11.f33183a
            if (r4 != 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            java.lang.Object r4 = r4.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r4 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r4
            if (r4 != 0) goto L_0x005a
        L_0x0058:
            r4 = r2
            goto L_0x005c
        L_0x005a:
            java.lang.String r4 = r4.f7271T
        L_0x005c:
            if (r4 != 0) goto L_0x006f
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r4 = r11.f33183a
            if (r4 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.Object r4 = r4.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r4 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r4
            if (r4 != 0) goto L_0x006d
        L_0x006b:
            r4 = r2
            goto L_0x006f
        L_0x006d:
            java.lang.String r4 = r4.f7271T
        L_0x006f:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r5 = r11.f33183a
            if (r5 != 0) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            java.lang.Object r5 = r5.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r5 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r5
            if (r5 != 0) goto L_0x007e
        L_0x007c:
            r5 = r2
            goto L_0x0080
        L_0x007e:
            java.lang.String r5 = r5.f7272U
        L_0x0080:
            if (r5 != 0) goto L_0x0093
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r5 = r11.f33183a
            if (r5 != 0) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            java.lang.Object r5 = r5.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r5 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r5
            if (r5 != 0) goto L_0x0091
        L_0x008f:
            r5 = r2
            goto L_0x0093
        L_0x0091:
            java.lang.String r5 = r5.f7272U
        L_0x0093:
            r0.<init>(r3, r4, r1, r5)
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x009b
            goto L_0x00a3
        L_0x009b:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00a5
        L_0x00a3:
            r1 = r2
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r1 = r1.f7273V
        L_0x00a7:
            if (r1 != 0) goto L_0x00ba
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00b8
        L_0x00b6:
            r4 = r2
            goto L_0x00bb
        L_0x00b8:
            java.lang.String r1 = r1.f7273V
        L_0x00ba:
            r4 = r1
        L_0x00bb:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x00c0
            goto L_0x00c8
        L_0x00c0:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00ca
        L_0x00c8:
            r1 = r2
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r1 = r1.f7274W
        L_0x00cc:
            if (r1 != 0) goto L_0x00df
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x00d3
            goto L_0x00db
        L_0x00d3:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00dd
        L_0x00db:
            r5 = r2
            goto L_0x00e0
        L_0x00dd:
            java.lang.String r1 = r1.f7274W
        L_0x00df:
            r5 = r1
        L_0x00e0:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x00e5
            goto L_0x00ed
        L_0x00e5:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x00ef
        L_0x00ed:
            r1 = r2
            goto L_0x00f1
        L_0x00ef:
            java.lang.String r1 = r1.f7275X
        L_0x00f1:
            if (r1 != 0) goto L_0x0104
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x00f8
            goto L_0x0100
        L_0x00f8:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0102
        L_0x0100:
            r7 = r2
            goto L_0x0105
        L_0x0102:
            java.lang.String r1 = r1.f7275X
        L_0x0104:
            r7 = r1
        L_0x0105:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x010a
            goto L_0x0112
        L_0x010a:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0114
        L_0x0112:
            r1 = r2
            goto L_0x0116
        L_0x0114:
            java.lang.String r1 = r1.f7276Y
        L_0x0116:
            if (r1 != 0) goto L_0x0129
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x011d
            goto L_0x0125
        L_0x011d:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0127
        L_0x0125:
            r8 = r2
            goto L_0x012a
        L_0x0127:
            java.lang.String r1 = r1.f7276Y
        L_0x0129:
            r8 = r1
        L_0x012a:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x012f
            goto L_0x0137
        L_0x012f:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0139
        L_0x0137:
            r1 = r2
            goto L_0x013b
        L_0x0139:
            java.lang.String r1 = r1.f7277Z
        L_0x013b:
            if (r1 != 0) goto L_0x014e
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x0142
            goto L_0x014a
        L_0x0142:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x014c
        L_0x014a:
            r9 = r2
            goto L_0x014f
        L_0x014c:
            java.lang.String r1 = r1.f7277Z
        L_0x014e:
            r9 = r1
        L_0x014f:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x0154
            goto L_0x015c
        L_0x0154:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x015e
        L_0x015c:
            r1 = r2
            goto L_0x0160
        L_0x015e:
            java.lang.String r1 = r1.f7279a0
        L_0x0160:
            if (r1 != 0) goto L_0x0173
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r11.f33183a
            if (r1 != 0) goto L_0x0167
            goto L_0x016f
        L_0x0167:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0171
        L_0x016f:
            r10 = r2
            goto L_0x0174
        L_0x0171:
            java.lang.String r1 = r1.f7279a0
        L_0x0173:
            r10 = r1
        L_0x0174:
            com.cubic.umo.ad.types.AKGeo r1 = new com.cubic.umo.ad.types.AKGeo
            r3 = r1
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f7608e = r1
            com.cubic.umo.ad.types.AKUserExt r12 = new com.cubic.umo.ad.types.AKUserExt
            d7.a r1 = wb0.C13233c.f32844c
            if (r1 != 0) goto L_0x0185
            r3 = r2
            goto L_0x0187
        L_0x0185:
            java.lang.String r3 = r1.f15459e
        L_0x0187:
            if (r1 != 0) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            com.cubic.umo.ad.ext.types.UMOAdKitAppUserType r2 = r1.f15460f
        L_0x018c:
            r1 = -1
            if (r2 != 0) goto L_0x0191
            r2 = -1
            goto L_0x0199
        L_0x0191:
            int[] r4 = zb0.C13368c.C13369a.f33184a
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L_0x0199:
            r4 = 1
            if (r2 == r4) goto L_0x01a2
            r5 = 2
            if (r2 == r5) goto L_0x01a0
            goto L_0x01a3
        L_0x01a0:
            r1 = 1
            goto L_0x01a3
        L_0x01a2:
            r1 = 0
        L_0x01a3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.<init>(r3, r1)
            r0.f7609f = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C13368c.mo40249d(java.lang.String):com.cubic.umo.ad.types.AKUser");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0220  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cubic.umo.p045ad.types.AKDevice mo40250f() {
        /*
            r41 = this;
            r0 = r41
            zb0.C13364a.m33639b()
            com.cubic.umo.ad.types.AKDevice r15 = new com.cubic.umo.ad.types.AKDevice
            java.lang.String r2 = zb0.C13364a.f33159e
            int r3 = zb0.C13364a.f33161g
            boolean r4 = zb0.C13364a.f33162h
            java.lang.String r5 = zb0.C13364a.f33163i
            int r1 = zb0.C13364a.f33164j
            r6 = 3
            r7 = 4
            r8 = 5
            r9 = 6
            r10 = 2
            r11 = 7
            r12 = 1
            r33 = 0
            if (r1 != r12) goto L_0x001f
            r1 = 1
            r11 = 1
            goto L_0x003c
        L_0x001f:
            if (r1 != r10) goto L_0x0024
            r1 = 2
            r11 = 2
            goto L_0x003c
        L_0x0024:
            if (r1 != r6) goto L_0x0029
            r1 = 3
            r11 = 3
            goto L_0x003c
        L_0x0029:
            if (r1 != r7) goto L_0x002e
            r1 = 4
            r11 = 4
            goto L_0x003c
        L_0x002e:
            if (r1 != r8) goto L_0x0033
            r1 = 5
            r11 = 5
            goto L_0x003c
        L_0x0033:
            if (r1 != r9) goto L_0x0038
            r1 = 6
            r11 = 6
            goto L_0x003c
        L_0x0038:
            if (r1 != r11) goto L_0x0306
            r1 = 7
            r11 = 7
        L_0x003c:
            java.lang.String r13 = zb0.C13364a.f33165k
            java.lang.String r14 = zb0.C13364a.f33166l
            java.lang.String r16 = zb0.C13364a.f33167m
            java.lang.String r17 = zb0.C13364a.f33168n
            java.lang.String r18 = zb0.C13364a.f33169o
            int r19 = zb0.C13364a.f33170p
            int r20 = zb0.C13364a.f33171q
            int r21 = zb0.C13364a.f33172r
            r22 = 0
            int r23 = zb0.C13364a.f33173s
            int r34 = zb0.C13364a.f33174t
            java.lang.String r35 = zb0.C13364a.f33175u
            java.lang.String r36 = zb0.C13364a.f33176v
            java.lang.String r37 = zb0.C13364a.f33177w
            java.lang.String r38 = zb0.C13364a.f33178x
            android.content.Context r1 = wb0.C13233c.m33333b()
            java.lang.String r9 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r9)
            if (r1 == 0) goto L_0x02fe
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x0098
            boolean r9 = r1.isConnected()
            if (r9 != 0) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            int r9 = r1.getType()
            if (r9 != r12) goto L_0x007d
            r1 = 4
            goto L_0x0099
        L_0x007d:
            int r9 = r1.getType()
            if (r9 != 0) goto L_0x0096
            int r1 = r1.getSubtype()
            switch(r1) {
                case 1: goto L_0x0094;
                case 2: goto L_0x0094;
                case 3: goto L_0x0092;
                case 4: goto L_0x0094;
                case 5: goto L_0x0092;
                case 6: goto L_0x0092;
                case 7: goto L_0x0094;
                case 8: goto L_0x0092;
                case 9: goto L_0x0092;
                case 10: goto L_0x0092;
                case 11: goto L_0x0094;
                case 12: goto L_0x0092;
                case 13: goto L_0x008f;
                case 14: goto L_0x0092;
                case 15: goto L_0x0092;
                case 16: goto L_0x0094;
                case 17: goto L_0x0092;
                case 18: goto L_0x008f;
                case 19: goto L_0x008f;
                case 20: goto L_0x008c;
                default: goto L_0x008a;
            }
        L_0x008a:
            r1 = 5
            goto L_0x0099
        L_0x008c:
            r1 = 9
            goto L_0x0099
        L_0x008f:
            r1 = 8
            goto L_0x0099
        L_0x0092:
            r1 = 7
            goto L_0x0099
        L_0x0094:
            r1 = 6
            goto L_0x0099
        L_0x0096:
            r1 = 2
            goto L_0x0099
        L_0x0098:
            r1 = 1
        L_0x0099:
            if (r1 != r12) goto L_0x009f
            r1 = -1
            r39 = -1
            goto L_0x00d4
        L_0x009f:
            if (r1 != r10) goto L_0x00a5
            r1 = 0
            r39 = 0
            goto L_0x00d4
        L_0x00a5:
            if (r1 != r6) goto L_0x00ab
            r1 = 1
            r39 = 1
            goto L_0x00d4
        L_0x00ab:
            if (r1 != r7) goto L_0x00b1
            r1 = 2
            r39 = 2
            goto L_0x00d4
        L_0x00b1:
            if (r1 != r8) goto L_0x00b7
            r1 = 3
            r39 = 3
            goto L_0x00d4
        L_0x00b7:
            r6 = 6
            if (r1 != r6) goto L_0x00be
            r1 = 4
            r39 = 4
            goto L_0x00d4
        L_0x00be:
            r6 = 7
            if (r1 != r6) goto L_0x00c5
            r1 = 5
            r39 = 5
            goto L_0x00d4
        L_0x00c5:
            r6 = 8
            if (r1 != r6) goto L_0x00cd
            r1 = 6
            r39 = 6
            goto L_0x00d4
        L_0x00cd:
            r6 = 9
            if (r1 != r6) goto L_0x02fd
            r1 = 7
            r39 = 7
        L_0x00d4:
            java.lang.String r24 = zb0.C13364a.f33160f
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 528482320(0x1f800010, float:5.421021E-20)
            r32 = 0
            r6 = 0
            r1 = r15
            r7 = r11
            r8 = r13
            r9 = r14
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r20
            r40 = r15
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r34
            r19 = r35
            r20 = r36
            r21 = r37
            r22 = r38
            r23 = r39
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            java.lang.String r2 = r2.getID()
            java.lang.String r3 = "Time Zone: "
            java.lang.String r2 = mf0.C24362h.m61216k(r2, r3)
            r1.mo6666c(r2)
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            int r2 = r1.getOffset(r2)
            r3 = 60000(0xea60, float:8.4078E-41)
            int r2 = r2 / r3
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4 = 0
            char r5 = r2.charAt(r4)
            r6 = 45
            r7 = 43
            if (r5 == r6) goto L_0x014d
            char r5 = r2.charAt(r4)
            if (r5 != r7) goto L_0x014b
            goto L_0x014d
        L_0x014b:
            r5 = 1
            goto L_0x0157
        L_0x014d:
            r5 = 1
            java.lang.String r2 = r2.substring(r5)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            mf0.C24362h.m61210e(r2, r6)
        L_0x0157:
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            java.util.Calendar r8 = java.util.Calendar.getInstance(r6)
            long r8 = r8.getTimeInMillis()
            int r6 = r6.getOffset(r8)
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 3600000(0x36ee80, float:5.044674E-39)
            int r10 = r6 / r10
            int r10 = java.lang.Math.abs(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r4] = r10
            int r3 = r6 / r3
            int r3 = r3 % 60
            int r3 = java.lang.Math.abs(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9[r5] = r3
            java.lang.String r3 = "%02d:%02d"
            java.lang.String r5 = "format(format, *args)"
            java.lang.String r3 = p379.C13555b.m33971j(r9, r8, r3, r5)
            java.lang.String r5 = "+"
            java.lang.String r8 = "-"
            if (r6 < 0) goto L_0x0197
            r6 = r5
            goto L_0x0198
        L_0x0197:
            r6 = r8
        L_0x0198:
            java.lang.String r3 = mf0.C24362h.m61216k(r3, r6)
            char r3 = r3.charAt(r4)
            if (r3 != r7) goto L_0x01a7
            java.lang.String r2 = mf0.C24362h.m61216k(r2, r8)
            goto L_0x01ab
        L_0x01a7:
            java.lang.String r2 = mf0.C24362h.m61216k(r2, r5)
        L_0x01ab:
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r1 = r1.getID()
            java.lang.String r1 = r1.toString()
            r3.<init>(r2, r1)
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r2 = "DEVICE_GEO: UTC Offset: "
            java.lang.StringBuilder r2 = ce0.C21100e.m49315J0(r2)
            java.lang.Object r4 = r3.mo59068c()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = ", Time Zone: "
            r2.append(r4)
            java.lang.Object r4 = r3.mo59069d()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.mo6666c(r2)
            java.lang.Object r1 = r3.mo59068c()
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x01ea
            goto L_0x01f2
        L_0x01ea:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x01f5
        L_0x01f2:
            r1 = r33
            goto L_0x01f7
        L_0x01f5:
            java.lang.String r1 = r1.f7263L
        L_0x01f7:
            if (r1 != 0) goto L_0x020b
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x01fe
            goto L_0x0206
        L_0x01fe:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0209
        L_0x0206:
            r5 = r33
            goto L_0x020c
        L_0x0209:
            java.lang.String r1 = r1.f7263L
        L_0x020b:
            r5 = r1
        L_0x020c:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0211
            goto L_0x0219
        L_0x0211:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x021c
        L_0x0219:
            r1 = r33
            goto L_0x021e
        L_0x021c:
            java.lang.String r1 = r1.f7264M
        L_0x021e:
            if (r1 != 0) goto L_0x0232
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0225
            goto L_0x022d
        L_0x0225:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0230
        L_0x022d:
            r6 = r33
            goto L_0x0233
        L_0x0230:
            java.lang.String r1 = r1.f7264M
        L_0x0232:
            r6 = r1
        L_0x0233:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0238
            goto L_0x0240
        L_0x0238:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0243
        L_0x0240:
            r1 = r33
            goto L_0x0245
        L_0x0243:
            java.lang.String r1 = r1.f7265N
        L_0x0245:
            if (r1 != 0) goto L_0x0259
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x024c
            goto L_0x0254
        L_0x024c:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0257
        L_0x0254:
            r8 = r33
            goto L_0x025a
        L_0x0257:
            java.lang.String r1 = r1.f7265N
        L_0x0259:
            r8 = r1
        L_0x025a:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x025f
            goto L_0x0267
        L_0x025f:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x026a
        L_0x0267:
            r1 = r33
            goto L_0x026c
        L_0x026a:
            java.lang.String r1 = r1.f7266O
        L_0x026c:
            if (r1 != 0) goto L_0x0280
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0273
            goto L_0x027b
        L_0x0273:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x027e
        L_0x027b:
            r9 = r33
            goto L_0x0281
        L_0x027e:
            java.lang.String r1 = r1.f7266O
        L_0x0280:
            r9 = r1
        L_0x0281:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x0286
            goto L_0x028e
        L_0x0286:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x0291
        L_0x028e:
            r1 = r33
            goto L_0x0293
        L_0x0291:
            java.lang.String r1 = r1.f7267P
        L_0x0293:
            if (r1 != 0) goto L_0x02a7
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x029a
            goto L_0x02a2
        L_0x029a:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x02a5
        L_0x02a2:
            r10 = r33
            goto L_0x02a8
        L_0x02a5:
            java.lang.String r1 = r1.f7267P
        L_0x02a7:
            r10 = r1
        L_0x02a8:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x02ad
            goto L_0x02b5
        L_0x02ad:
            java.lang.Object r1 = r1.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x02b8
        L_0x02b5:
            r1 = r33
            goto L_0x02ba
        L_0x02b8:
            java.lang.String r1 = r1.f7268Q
        L_0x02ba:
            if (r1 != 0) goto L_0x02cc
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r1 = r0.f33183a
            if (r1 != 0) goto L_0x02c1
            goto L_0x02c9
        L_0x02c1:
            java.lang.Object r1 = r1.mo59069d()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r1 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r1
            if (r1 != 0) goto L_0x02ca
        L_0x02c9:
            goto L_0x02ce
        L_0x02ca:
            java.lang.String r1 = r1.f7268Q
        L_0x02cc:
            r33 = r1
        L_0x02ce:
            r11 = r33
            com.cubic.umo.ad.types.AKGeo r1 = new com.cubic.umo.ad.types.AKGeo
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.cubic.umo.ad.types.AKDeviceGeoExt r2 = new com.cubic.umo.ad.types.AKDeviceGeoExt
            java.lang.Object r3 = r3.mo59069d()
            java.lang.String r3 = (java.lang.String) r3
            d7.a r4 = wb0.C13233c.f32844c
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x02e5
            goto L_0x02e9
        L_0x02e5:
            java.lang.String r6 = r4.f15457c
            if (r6 != 0) goto L_0x02ea
        L_0x02e9:
            r6 = r5
        L_0x02ea:
            if (r4 != 0) goto L_0x02ed
            goto L_0x02f3
        L_0x02ed:
            java.lang.String r4 = r4.f15458d
            if (r4 != 0) goto L_0x02f2
            goto L_0x02f3
        L_0x02f2:
            r5 = r4
        L_0x02f3:
            r2.<init>(r3, r6, r5)
            r1.f7511h = r2
            r2 = r40
            r2.f7452D = r1
            return r2
        L_0x02fd:
            throw r33
        L_0x02fe:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r1.<init>(r2)
            throw r1
        L_0x0306:
            throw r33
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C13368c.mo40250f():com.cubic.umo.ad.types.AKDevice");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r6 <= 0) goto L_0x0086;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cubic.umo.p045ad.types.AKImp mo40251g(mc0.C12912d r30, boolean r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            if (r1 != 0) goto L_0x0017
            com.cubic.umo.ad.types.AKImp r11 = new com.cubic.umo.ad.types.AKImp
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L_0x0017:
            com.cubic.umo.ad.types.AKImp r2 = new com.cubic.umo.ad.types.AKImp
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r1.f31966b
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            java.lang.String r3 = r3.mo11107d()
            if (r3 != 0) goto L_0x0028
        L_0x0026:
            r13 = r4
            goto L_0x0029
        L_0x0028:
            r13 = r3
        L_0x0029:
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 70
            r21 = 0
            r12 = r2
            r16 = r31
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r1.f31966b
            r5 = 0
            if (r3 != 0) goto L_0x0042
            r3 = r5
            goto L_0x0046
        L_0x0042:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r3 = r3.mo11114i()
        L_0x0046:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r6 = com.cubic.umo.p045ad.ext.types.UMOAdKitInlineBannerCreativeType.IMAGE
            if (r3 != r6) goto L_0x0133
            kotlin.Pair r3 = new kotlin.Pair
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r1.f31966b
            r7 = 0
            if (r6 != 0) goto L_0x0053
            r6 = 0
            goto L_0x0057
        L_0x0053:
            int r6 = r6.mo11123r()
        L_0x0057:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r8 = r1.f31966b
            if (r8 != 0) goto L_0x0061
            r8 = 0
            goto L_0x0065
        L_0x0061:
            int r8 = r8.mo11116k()
        L_0x0065:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.<init>(r6, r8)
            if (r31 == 0) goto L_0x0098
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r1.f31966b
            if (r6 != 0) goto L_0x0074
            r6 = 0
            goto L_0x0078
        L_0x0074:
            int r6 = r6.mo11123r()
        L_0x0078:
            if (r6 <= 0) goto L_0x0086
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r1.f31966b
            if (r6 != 0) goto L_0x0080
            r6 = 0
            goto L_0x0084
        L_0x0080:
            int r6 = r6.mo11116k()
        L_0x0084:
            if (r6 > 0) goto L_0x0098
        L_0x0086:
            kotlin.Pair r3 = zb0.C13364a.m33638a(r5)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.Object r8 = r3.mo59068c()
            java.lang.Object r3 = r3.mo59069d()
            r6.<init>(r8, r3)
            r3 = r6
        L_0x0098:
            java.lang.Object r6 = r3.mo59068c()
            java.lang.Number r6 = (java.lang.Number) r6
            int r10 = r6.intValue()
            java.lang.Object r3 = r3.mo59069d()
            java.lang.Number r3 = (java.lang.Number) r3
            int r11 = r3.intValue()
            r3 = 2
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r6 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r7] = r6
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r3[r7] = r6
            java.util.List r18 = p583jk.C17875h.m44281E(r3)
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r1.f31966b
            if (r3 != 0) goto L_0x00c7
            goto L_0x00cd
        L_0x00c7:
            java.lang.String r3 = r3.mo11107d()
            if (r3 != 0) goto L_0x00d0
        L_0x00cd:
            r19 = r4
            goto L_0x00d2
        L_0x00d0:
            r19 = r3
        L_0x00d2:
            int r14 = m33642a(r30, r31)
            com.cubic.umo.ad.types.AKBanner r3 = new com.cubic.umo.ad.types.AKBanner
            r9 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 2521(0x9d9, float:3.533E-42)
            r22 = 0
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.cubic.umo.ad.types.AKImpVideoOrBannerExt r4 = new com.cubic.umo.ad.types.AKImpVideoOrBannerExt
            android.content.Context r6 = wb0.C13233c.f32842a
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r6 = r0.f33183a
            if (r6 != 0) goto L_0x00f3
            goto L_0x00fb
        L_0x00f3:
            java.lang.Object r6 = r6.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r6 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r6
            if (r6 != 0) goto L_0x00fd
        L_0x00fb:
            r6 = r5
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r6 = r6.f7278a
        L_0x00ff:
            java.lang.String r24 = wb0.C13233c.m33336e(r1, r6)
            r25 = 0
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$Companion r6 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.f7241i
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r7 = r1.f31966b
            if (r7 != 0) goto L_0x010d
            r7 = r5
            goto L_0x0111
        L_0x010d:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerType r7 = r7.mo11122q()
        L_0x0111:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r1 = r1.f31966b
            if (r1 != 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r5 = r1.mo11114i()
        L_0x011a:
            r6.getClass()
            boolean r1 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.Companion.m5823c(r5, r7)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r1)
            r27 = 2
            r28 = 0
            r23 = r4
            r23.<init>(r24, r25, r26, r27, r28)
            r3.f7418m = r4
            r2.f7535h = r3
            goto L_0x018e
        L_0x0133:
            android.content.Context r3 = wb0.C13233c.f32842a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r1.f31966b
            if (r3 != 0) goto L_0x013b
            r3 = r5
            goto L_0x013f
        L_0x013b:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r3 = r3.mo11114i()
        L_0x013f:
            boolean r3 = wb0.C13233c.m33339h(r3)
            if (r3 == 0) goto L_0x018e
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r1.f31966b
            if (r3 != 0) goto L_0x014a
            goto L_0x0152
        L_0x014a:
            java.lang.String r3 = r3.mo11107d()
            if (r3 != 0) goto L_0x0151
            goto L_0x0152
        L_0x0151:
            r4 = r3
        L_0x0152:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r3 = r1.f31966b
            if (r3 != 0) goto L_0x0158
            r3 = r5
            goto L_0x0160
        L_0x0158:
            int r3 = r3.mo11123r()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0160:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r1.f31966b
            if (r6 != 0) goto L_0x0166
            r6 = r5
            goto L_0x016e
        L_0x0166:
            int r6 = r6.mo11116k()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x016e:
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r7 = r0.f33183a
            if (r7 != 0) goto L_0x0173
            goto L_0x017e
        L_0x0173:
            java.lang.Object r7 = r7.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r7 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r7
            if (r7 != 0) goto L_0x017c
            goto L_0x017e
        L_0x017c:
            java.lang.String r5 = r7.f7278a
        L_0x017e:
            java.lang.String r5 = wb0.C13233c.m33336e(r1, r5)
            com.cubic.umo.ad.types.AKVideo r3 = m33643e(r4, r3, r6, r5)
            r2.f7536i = r3
            int r1 = m33642a(r30, r31)
            r3.f7710v = r1
        L_0x018e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C13368c.mo40251g(mc0.d, boolean):com.cubic.umo.ad.types.AKImp");
    }
}
