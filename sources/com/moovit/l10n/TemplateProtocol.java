package com.moovit.l10n;

import c00.C13720d;
import c00.C13722f;
import c00.C13733n;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.tranzmate.moovit.protocol.presentation.MVConditional;
import com.tranzmate.moovit.protocol.presentation.MVDelimiterToken;
import com.tranzmate.moovit.protocol.presentation.MVLineTemplate;
import com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken;
import com.tranzmate.moovit.protocol.presentation.MVTokenConditional;
import g20.C17142d;
import g20.C17145e;
import g20.C17148g;
import g20.C17163k;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public final class TemplateProtocol {

    /* renamed from: a */
    public static final C16171a f42153a = new C16171a();

    /* renamed from: b */
    public static final C16172b f42154b = new C16172b();

    /* renamed from: c */
    public static final C16173c f42155c = new C16173c();

    public enum FrozenLineTextProperty {
        NULL,
        TRANSIT_TYPE,
        AGENCY_NAME,
        LINE_PRIMARY_CAPTION,
        LINE_SECONDARY_CAPTION,
        LINE_NUMBER,
        LINE_ORIGIN,
        LINE_DESTINATION,
        LINE_LONG_NAME,
        LINE_SUBGROUP_NAME;
        
        public static final C19584i<FrozenLineTextProperty> CODER = null;

        /* access modifiers changed from: public */
        static {
            FrozenLineTextProperty frozenLineTextProperty;
            FrozenLineTextProperty frozenLineTextProperty2;
            FrozenLineTextProperty frozenLineTextProperty3;
            FrozenLineTextProperty frozenLineTextProperty4;
            FrozenLineTextProperty frozenLineTextProperty5;
            FrozenLineTextProperty frozenLineTextProperty6;
            FrozenLineTextProperty frozenLineTextProperty7;
            FrozenLineTextProperty frozenLineTextProperty8;
            FrozenLineTextProperty frozenLineTextProperty9;
            FrozenLineTextProperty frozenLineTextProperty10;
            CODER = new C19577c(FrozenLineTextProperty.class, frozenLineTextProperty, frozenLineTextProperty2, frozenLineTextProperty3, frozenLineTextProperty4, frozenLineTextProperty5, frozenLineTextProperty6, frozenLineTextProperty7, frozenLineTextProperty8, frozenLineTextProperty9, frozenLineTextProperty10);
        }
    }

    /* renamed from: com.moovit.l10n.TemplateProtocol$a */
    public class C16171a implements C13733n<MVLineTemplate, C16179g> {
        public final Object convert(Object obj) throws Exception {
            C17163k kVar;
            MVLineTemplate mVLineTemplate = (MVLineTemplate) obj;
            ServerId serverId = new ServerId(mVLineTemplate.lineTemplateId);
            MVTokenConditional mVTokenConditional = mVLineTemplate.titleConditional;
            MVConditional mVConditional = mVTokenConditional.condition;
            C16177f fVar = new C16177f(new C16175e(TemplateProtocol.m41221a(mVConditional.condition), mVConditional.conditionLength), TemplateProtocol.m41221a(mVTokenConditional.ifGreater), TemplateProtocol.m41221a(mVTokenConditional.ifLess));
            MVConditional mVConditional2 = mVLineTemplate.imageConditional;
            C16175e eVar = new C16175e(TemplateProtocol.m41221a(mVConditional2.condition), mVConditional2.conditionLength);
            MVTokenConditional mVTokenConditional2 = mVLineTemplate.imageTextConditional;
            MVConditional mVConditional3 = mVTokenConditional2.condition;
            C16177f fVar2 = new C16177f(new C16175e(TemplateProtocol.m41221a(mVConditional3.condition), mVConditional3.conditionLength), TemplateProtocol.m41221a(mVTokenConditional2.ifGreater), TemplateProtocol.m41221a(mVTokenConditional2.ifLess));
            ArrayList<O> c = C13720d.m34273c(mVLineTemplate.detailsList, (C13722f) null, TemplateProtocol.f42154b);
            MVDelimiterToken mVDelimiterToken = mVLineTemplate.delimiterToken;
            int i = C16174d.f42159d[mVDelimiterToken.ordinal()];
            if (i == 1) {
                kVar = C17163k.f44397a;
            } else if (i == 2) {
                kVar = C17163k.f44398b;
            } else if (i == 3) {
                kVar = C17163k.f44399c;
            } else if (i == 4) {
                kVar = C17163k.f44400d;
            } else {
                throw new IllegalArgumentException("Unknown or unsupported template delimiter: " + mVDelimiterToken);
            }
            return new C16179g(serverId, fVar, eVar, fVar2, c, kVar);
        }
    }

    /* renamed from: com.moovit.l10n.TemplateProtocol$b */
    public class C16172b implements C13733n<MVLineTemplateToken, FrozenLineTextProperty> {
        public final Object convert(Object obj) throws Exception {
            return TemplateProtocol.m41221a((MVLineTemplateToken) obj);
        }
    }

    /* renamed from: com.moovit.l10n.TemplateProtocol$c */
    public class C16173c implements C13733n<FrozenLineTextProperty, C17142d<TransitLine, String>> {
        public final Object convert(Object obj) throws Exception {
            return TemplateProtocol.m41223c((FrozenLineTextProperty) obj);
        }
    }

    /* renamed from: com.moovit.l10n.TemplateProtocol$d */
    public static /* synthetic */ class C16174d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42156a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f42157b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f42158c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f42159d;

        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|(2:31|32)|33|(2:35|36)|37|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|(2:31|32)|33|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|31|32|33|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(66:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|31|32|33|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|(2:55|56)|57|(2:59|60)|61|63|64|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(69:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|31|32|33|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|(2:55|56)|57|59|60|61|63|64|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(72:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|(2:55|56)|57|59|60|61|63|64|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|88) */
        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|59|60|61|63|64|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|88) */
        /* JADX WARNING: Can't wrap try/catch for region: R(76:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|59|60|61|63|64|65|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|88) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0105 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x010f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0123 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x012d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0137 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0141 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x014b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0155 */
        static {
            /*
                com.tranzmate.moovit.protocol.presentation.MVDelimiterToken[] r0 = com.tranzmate.moovit.protocol.presentation.MVDelimiterToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42159d = r0
                r1 = 1
                com.tranzmate.moovit.protocol.presentation.MVDelimiterToken r2 = com.tranzmate.moovit.protocol.presentation.MVDelimiterToken.Empty     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f42159d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.presentation.MVDelimiterToken r3 = com.tranzmate.moovit.protocol.presentation.MVDelimiterToken.Dot     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f42159d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.presentation.MVDelimiterToken r4 = com.tranzmate.moovit.protocol.presentation.MVDelimiterToken.Arrow     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f42159d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.presentation.MVDelimiterToken r5 = com.tranzmate.moovit.protocol.presentation.MVDelimiterToken.BiDirectionalArrow     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tranzmate.moovit.protocol.presentation.MVPresentationType[] r4 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f42158c = r4
                com.tranzmate.moovit.protocol.presentation.MVPresentationType r5 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.LineDetail     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f42158c     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tranzmate.moovit.protocol.presentation.MVPresentationType r5 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.StopDetail     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f42158c     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tranzmate.moovit.protocol.presentation.MVPresentationType r5 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.RideMode     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = f42158c     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.tranzmate.moovit.protocol.presentation.MVPresentationType r5 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.LineNews     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                r4 = 5
                int[] r5 = f42158c     // Catch:{ NoSuchFieldError -> 0x006d }
                com.tranzmate.moovit.protocol.presentation.MVPresentationType r6 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.NearMe     // Catch:{ NoSuchFieldError -> 0x006d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                r5 = 6
                int[] r6 = f42158c     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.presentation.MVPresentationType r7 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.Itinerary     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                r6 = 7
                int[] r7 = f42158c     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.tranzmate.moovit.protocol.presentation.MVPresentationType r8 = com.tranzmate.moovit.protocol.presentation.MVPresentationType.LineSchedule     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken[] r7 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f42157b = r7
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r8 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.Empty     // Catch:{ NoSuchFieldError -> 0x0094 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0094 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0094 }
            L_0x0094:
                int[] r7 = f42157b     // Catch:{ NoSuchFieldError -> 0x009e }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r8 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.RouteType     // Catch:{ NoSuchFieldError -> 0x009e }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r7 = f42157b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r8 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.AgencyName     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r7 = f42157b     // Catch:{ NoSuchFieldError -> 0x00b2 }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r8 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.LineGroupCaption1     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                int[] r7 = f42157b     // Catch:{ NoSuchFieldError -> 0x00bc }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r8 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.LineGroupCaption2     // Catch:{ NoSuchFieldError -> 0x00bc }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bc }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x00bc }
            L_0x00bc:
                int[] r7 = f42157b     // Catch:{ NoSuchFieldError -> 0x00c6 }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r8 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.LineNumber     // Catch:{ NoSuchFieldError -> 0x00c6 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c6 }
                r7[r8] = r5     // Catch:{ NoSuchFieldError -> 0x00c6 }
            L_0x00c6:
                int[] r7 = f42157b     // Catch:{ NoSuchFieldError -> 0x00d0 }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r8 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.LineOrigin     // Catch:{ NoSuchFieldError -> 0x00d0 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d0 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00d0 }
            L_0x00d0:
                r7 = 8
                int[] r8 = f42157b     // Catch:{ NoSuchFieldError -> 0x00dc }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r9 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.LineDestination     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                r8 = 9
                int[] r9 = f42157b     // Catch:{ NoSuchFieldError -> 0x00e8 }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r10 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.LineLongName     // Catch:{ NoSuchFieldError -> 0x00e8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e8 }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x00e8 }
            L_0x00e8:
                r9 = 10
                int[] r10 = f42157b     // Catch:{ NoSuchFieldError -> 0x00f4 }
                com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken r11 = com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken.LineSubGroupCaption     // Catch:{ NoSuchFieldError -> 0x00f4 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f4 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x00f4 }
            L_0x00f4:
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty[] r10 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.values()
                int r10 = r10.length
                int[] r10 = new int[r10]
                f42156a = r10
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r11 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.NULL     // Catch:{ NoSuchFieldError -> 0x0105 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0105 }
                r10[r11] = r1     // Catch:{ NoSuchFieldError -> 0x0105 }
            L_0x0105:
                int[] r1 = f42156a     // Catch:{ NoSuchFieldError -> 0x010f }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r10 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.TRANSIT_TYPE     // Catch:{ NoSuchFieldError -> 0x010f }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x010f }
                r1[r10] = r0     // Catch:{ NoSuchFieldError -> 0x010f }
            L_0x010f:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x0119 }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.AGENCY_NAME     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x0123 }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.LINE_PRIMARY_CAPTION     // Catch:{ NoSuchFieldError -> 0x0123 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0123 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0123 }
            L_0x0123:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x012d }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.LINE_SECONDARY_CAPTION     // Catch:{ NoSuchFieldError -> 0x012d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x012d }
            L_0x012d:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x0137 }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.LINE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0137 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0137 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0137 }
            L_0x0137:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x0141 }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.LINE_ORIGIN     // Catch:{ NoSuchFieldError -> 0x0141 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0141 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0141 }
            L_0x0141:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x014b }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.LINE_DESTINATION     // Catch:{ NoSuchFieldError -> 0x014b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014b }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x014b }
            L_0x014b:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x0155 }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.LINE_LONG_NAME     // Catch:{ NoSuchFieldError -> 0x0155 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0155 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0155 }
            L_0x0155:
                int[] r0 = f42156a     // Catch:{ NoSuchFieldError -> 0x015f }
                com.moovit.l10n.TemplateProtocol$FrozenLineTextProperty r1 = com.moovit.l10n.TemplateProtocol.FrozenLineTextProperty.LINE_SUBGROUP_NAME     // Catch:{ NoSuchFieldError -> 0x015f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015f }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x015f }
            L_0x015f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.l10n.TemplateProtocol.C16174d.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.l10n.TemplateProtocol$e */
    public static class C16175e {

        /* renamed from: c */
        public static final C16176a f42160c = new C16176a();

        /* renamed from: a */
        public final FrozenLineTextProperty f42161a;

        /* renamed from: b */
        public final int f42162b;

        /* renamed from: com.moovit.l10n.TemplateProtocol$e$a */
        public class C16176a extends C19619s<C16175e> {
            public C16176a() {
                super(0, C16175e.class);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                C19584i<FrozenLineTextProperty> iVar = FrozenLineTextProperty.CODER;
                pVar.getClass();
                return new C16175e(iVar.read(pVar), pVar.mo51924l());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C16175e eVar = (C16175e) obj;
                FrozenLineTextProperty frozenLineTextProperty = eVar.f42161a;
                C19584i<FrozenLineTextProperty> iVar = FrozenLineTextProperty.CODER;
                qVar.getClass();
                iVar.write(frozenLineTextProperty, qVar);
                qVar.mo51939l(eVar.f42162b);
            }
        }

        public C16175e(FrozenLineTextProperty frozenLineTextProperty, int i) {
            C21100e.m49373x(frozenLineTextProperty, "testProperty");
            this.f42161a = frozenLineTextProperty;
            C21100e.m49365t(i, "length");
            this.f42162b = i;
        }
    }

    /* renamed from: com.moovit.l10n.TemplateProtocol$f */
    public static class C16177f {

        /* renamed from: d */
        public static final C16178a f42163d = new C16178a();

        /* renamed from: a */
        public final C16175e f42164a;

        /* renamed from: b */
        public final FrozenLineTextProperty f42165b;

        /* renamed from: c */
        public final FrozenLineTextProperty f42166c;

        /* renamed from: com.moovit.l10n.TemplateProtocol$f$a */
        public class C16178a extends C19619s<C16177f> {
            public C16178a() {
                super(0, C16177f.class);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                C16175e.C16176a aVar = C16175e.f42160c;
                pVar.getClass();
                C19584i<FrozenLineTextProperty> iVar = FrozenLineTextProperty.CODER;
                return new C16177f((C16175e) aVar.read(pVar), iVar.read(pVar), iVar.read(pVar));
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C16177f fVar = (C16177f) obj;
                C16175e eVar = fVar.f42164a;
                C16175e.C16176a aVar = C16175e.f42160c;
                qVar.getClass();
                qVar.mo51939l(aVar.f49802v);
                aVar.mo179c(eVar, qVar);
                FrozenLineTextProperty frozenLineTextProperty = fVar.f42165b;
                C19584i<FrozenLineTextProperty> iVar = FrozenLineTextProperty.CODER;
                iVar.write(frozenLineTextProperty, qVar);
                iVar.write(fVar.f42166c, qVar);
            }
        }

        public C16177f(C16175e eVar, FrozenLineTextProperty frozenLineTextProperty, FrozenLineTextProperty frozenLineTextProperty2) {
            C21100e.m49373x(eVar, "condition");
            this.f42164a = eVar;
            C21100e.m49373x(frozenLineTextProperty, "successProperty");
            this.f42165b = frozenLineTextProperty;
            C21100e.m49373x(frozenLineTextProperty2, "failProperty");
            this.f42166c = frozenLineTextProperty2;
        }
    }

    /* renamed from: com.moovit.l10n.TemplateProtocol$g */
    public static class C16179g implements C5384a {

        /* renamed from: h */
        public static final C16180a f42167h = new C16180a();

        /* renamed from: b */
        public final ServerId f42168b;

        /* renamed from: c */
        public final C16177f f42169c;

        /* renamed from: d */
        public final C16175e f42170d;

        /* renamed from: e */
        public final C16177f f42171e;

        /* renamed from: f */
        public final List<FrozenLineTextProperty> f42172f;

        /* renamed from: g */
        public final C17163k f42173g;

        /* renamed from: com.moovit.l10n.TemplateProtocol$g$a */
        public class C16180a extends C19619s<C16179g> {
            public C16180a() {
                super(0, C16179g.class);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                pVar.getClass();
                ServerId serverId = new ServerId(pVar.mo51924l());
                C16177f.C16178a aVar = C16177f.f42163d;
                return new C16179g(serverId, (C16177f) aVar.read(pVar), (C16175e) C16175e.f42160c.read(pVar), (C16177f) aVar.read(pVar), pVar.mo51959g(FrozenLineTextProperty.CODER), C17163k.f44401e.read(pVar));
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C16179g gVar = (C16179g) obj;
                ServerId serverId = gVar.f42168b;
                qVar.getClass();
                qVar.mo51939l(serverId.f15142b);
                C16177f fVar = gVar.f42169c;
                C16177f.C16178a aVar = C16177f.f42163d;
                qVar.mo51939l(aVar.f49802v);
                aVar.mo179c(fVar, qVar);
                C16175e eVar = gVar.f42170d;
                C16175e.C16176a aVar2 = C16175e.f42160c;
                qVar.mo51939l(aVar2.f49802v);
                aVar2.mo179c(eVar, qVar);
                C16177f fVar2 = gVar.f42171e;
                qVar.mo51939l(aVar.f49802v);
                aVar.mo179c(fVar2, qVar);
                qVar.mo51965h(gVar.f42172f, FrozenLineTextProperty.CODER);
                C17163k.f44401e.write(gVar.f42173g, qVar);
            }
        }

        public C16179g() {
            throw null;
        }

        public C16179g(ServerId serverId, C16177f fVar, C16175e eVar, C16177f fVar2, ArrayList arrayList, C17163k kVar) {
            this.f42168b = serverId;
            C21100e.m49373x(fVar, "titleProperty");
            this.f42169c = fVar;
            C21100e.m49373x(eVar, "iconCondition");
            this.f42170d = eVar;
            C21100e.m49373x(fVar2, "iconTextProperty");
            this.f42171e = fVar2;
            C21100e.m49373x(arrayList, "subtitleProperties");
            this.f42172f = arrayList;
            C21100e.m49373x(kVar, "delimiter");
            this.f42173g = kVar;
        }

        public final ServerId getServerId() {
            return this.f42168b;
        }
    }

    /* renamed from: a */
    public static FrozenLineTextProperty m41221a(MVLineTemplateToken mVLineTemplateToken) {
        switch (C16174d.f42157b[mVLineTemplateToken.ordinal()]) {
            case 1:
                return FrozenLineTextProperty.NULL;
            case 2:
                return FrozenLineTextProperty.TRANSIT_TYPE;
            case 3:
                return FrozenLineTextProperty.AGENCY_NAME;
            case 4:
                return FrozenLineTextProperty.LINE_PRIMARY_CAPTION;
            case 5:
                return FrozenLineTextProperty.LINE_SECONDARY_CAPTION;
            case 6:
                return FrozenLineTextProperty.LINE_NUMBER;
            case 7:
                return FrozenLineTextProperty.LINE_ORIGIN;
            case 8:
                return FrozenLineTextProperty.LINE_DESTINATION;
            case 9:
                return FrozenLineTextProperty.LINE_LONG_NAME;
            case 10:
                return FrozenLineTextProperty.LINE_SUBGROUP_NAME;
            default:
                throw new IllegalArgumentException("Unknown or unsupported line template property: " + mVLineTemplateToken);
        }
    }

    /* renamed from: b */
    public static C17145e m41222b(C16177f fVar) {
        C16175e eVar = fVar.f42164a;
        return new C17145e(m41223c(eVar.f42161a), eVar.f42162b, m41223c(fVar.f42165b), m41223c(fVar.f42166c));
    }

    /* renamed from: c */
    public static C17142d<TransitLine, String> m41223c(FrozenLineTextProperty frozenLineTextProperty) {
        switch (C16174d.f42156a[frozenLineTextProperty.ordinal()]) {
            case 1:
                return C17142d.f44377a;
            case 2:
                return C17148g.f44385a;
            case 3:
                return C17148g.f44386b;
            case 4:
                return C17148g.f44387c;
            case 5:
                return C17148g.f44388d;
            case 6:
                return C17148g.f44389e;
            case 7:
                return C17148g.f44390f;
            case 8:
                return C17148g.f44391g;
            case 9:
                return C17148g.f44392h;
            case 10:
                return C17148g.f44393i;
            default:
                throw new IllegalArgumentException("Unknown or unsupported line template property: " + frozenLineTextProperty);
        }
    }
}
