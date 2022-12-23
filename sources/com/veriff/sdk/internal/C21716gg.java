package com.veriff.sdk.internal;

import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21647fv;
import com.veriff.sdk.internal.C21667gf;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import mobi.lab.veriff.data.C24429e;
import p001a0.C0016g;

/* renamed from: com.veriff.sdk.internal.gg */
public class C21716gg {

    /* renamed from: com.veriff.sdk.internal.gg$1 */
    public static /* synthetic */ class C217171 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54927a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.internal.iy[] r0 = com.veriff.sdk.internal.C21791iy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54927a = r0
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_PASSPORT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_FRONT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_ID_CARD_FRONT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_FRONT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK_AFTER_BARCODE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_ID_CARD_BACK     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_BACK     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_PASSPORT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_DRIVERS_LICENSE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_ID_CARD     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_RESIDENCE_PERMIT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PROOF_OF_ADDRESS     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.SCAN_BARCODE_OF_DRIVERS_LICENSE_BACK     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f54927a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.SCAN_NFC_OF_MRTD_PASSPORT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21716gg.C217171.<clinit>():void");
        }
    }

    /* renamed from: A */
    public static C21667gf m52853A() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "portrait_instructions_screen_shown");
    }

    /* renamed from: B */
    public static C21667gf m52854B() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "document-front_instructions_screen_shown");
    }

    /* renamed from: C */
    public static C21667gf m52855C() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "document-and-face_instructions_screen_shown");
    }

    /* renamed from: D */
    public static C21667gf m52856D() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "passport_instructions_screen_shown");
    }

    /* renamed from: E */
    public static C21667gf m52857E() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "barcode_instructions_screen_shown");
    }

    /* renamed from: F */
    public static C21667gf m52858F() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "nfc_instructions_screen_shown");
    }

    /* renamed from: G */
    public static C21667gf m52859G() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "country-select-continue");
    }

    /* renamed from: H */
    public static C21667gf m52860H() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "country-select-dropdown");
    }

    /* renamed from: I */
    public static C21667gf m52861I() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "country-select-chosen");
    }

    /* renamed from: J */
    public static C21667gf m52862J() {
        return new C21667gf(InAppMessageBase.MESSAGE, "ui", "inflow-feedback-dark-room");
    }

    /* renamed from: K */
    public static C21667gf m52863K() {
        return new C21667gf(InAppMessageBase.MESSAGE, "ui", "inflow-feedback-dark-room-fixed");
    }

    /* renamed from: L */
    public static C21667gf m52864L() {
        return new C21667gf(InAppMessageBase.MESSAGE, "ui", "inflow-feedback-multiple-persons");
    }

    /* renamed from: M */
    public static C21667gf m52865M() {
        return new C21667gf(InAppMessageBase.MESSAGE, "ui", "inflow-feedback-no-person");
    }

    /* renamed from: N */
    public static C21667gf m52866N() {
        return new C21667gf("barcode_scan_screen_shown", "ui", "barcode");
    }

    /* renamed from: O */
    public static C21667gf m52867O() {
        return new C21667gf("barcode_scan_failed", "ui", "barcode", (C21667gf.C21668a) new C21667gf.C21668a.C21675af(C21667gf.C21715h.f54923a.mo55299a()));
    }

    /* renamed from: P */
    public static C21667gf m52868P() {
        return new C21667gf("barcode_scan_failed", "ui", "barcode", (C21667gf.C21668a) new C21667gf.C21668a.C21675af(C21667gf.C21715h.ERROR.mo55299a()));
    }

    /* renamed from: Q */
    public static C21667gf m52869Q() {
        return new C21667gf("barcode_scan_canceled", "ui", "barcode");
    }

    /* renamed from: R */
    public static C21667gf m52870R() {
        return new C21667gf("intro_screen_start_button_clicked", "ui", "intro_screen_button_clicked");
    }

    /* renamed from: S */
    public static C21667gf m52871S() {
        return new C21667gf("resubmission_feedback_continue_clicked", "ui", "resubmission_feedback");
    }

    /* renamed from: T */
    public static C21667gf m52872T() {
        return new C21667gf("waiting_decision_screen_shown", "ui", "decision_waiting");
    }

    /* renamed from: U */
    public static C21667gf m52873U() {
        return new C21667gf("waiting_decision_timeout", "ui", "decision_waiting");
    }

    /* renamed from: V */
    public static C21667gf m52874V() {
        return new C21667gf("nfc_mrz_review_screen_shown", "ui", "nfc");
    }

    /* renamed from: W */
    public static C21667gf m52875W() {
        return new C21667gf("nfc_screen_shown", "ui", "nfc");
    }

    /* renamed from: X */
    public static C21667gf m52876X() {
        return new C21667gf("nfc_scan_started", "info", "nfc");
    }

    /* renamed from: Y */
    public static C21667gf m52877Y() {
        return new C21667gf("nfc_scan_timeout", "ui", "nfc");
    }

    /* renamed from: Z */
    public static C21667gf m52878Z() {
        return new C21667gf("nfc_scan_skip", "ui", "nfc");
    }

    /* renamed from: a */
    public static C21667gf m52886a(C21667gf.C21712e eVar, String str, String str2, long j) {
        return new C21667gf("client_started", new C21667gf.C21668a.C21692j(eVar, str, str2, j));
    }

    /* renamed from: aa */
    public static C21667gf m52908aa() {
        return new C21667gf("nfc_scan_done_continue_clicked", "ui", "nfc");
    }

    /* renamed from: ab */
    public static C21667gf m52909ab() {
        return new C21667gf("nfc_mrz_skip", "ui", "nfc");
    }

    /* renamed from: ac */
    public static C21667gf m52910ac() {
        return new C21667gf("enable_nfc_screen_shown", "ui", "nfc");
    }

    /* renamed from: ad */
    public static C21667gf m52911ad() {
        return new C21667gf("enable_nfc_screen_allow", "ui", "nfc");
    }

    /* renamed from: b */
    public static C21667gf m52925b(boolean z, String str, String str2, String str3) {
        return new C21667gf("country_selected", "business", ServerParameters.COUNTRY, (C21667gf.C21668a) new C21667gf.C21668a.C21696n(str2, str, str3, Boolean.valueOf(z)));
    }

    /* renamed from: c */
    public static C21667gf m52934c(boolean z, String str, String str2, String str3) {
        return new C21667gf("preselected_country_assigned", "business", ServerParameters.COUNTRY, (C21667gf.C21668a) new C21667gf.C21668a.C21696n(str2, str, str3, Boolean.valueOf(z)));
    }

    /* renamed from: d */
    public static C21667gf m52936d() {
        return new C21667gf("document-front_approved", "business", "image");
    }

    /* renamed from: e */
    public static C21667gf m52943e() {
        return new C21667gf("document-back_approved", "business", "image");
    }

    /* renamed from: f */
    public static C21667gf m52947f() {
        return new C21667gf("face-document_approved", "business", "image");
    }

    /* renamed from: g */
    public static C21667gf m52949g() {
        return new C21667gf("upload_screen_shown", "info", "upload", "");
    }

    /* renamed from: h */
    public static C21667gf m52951h() {
        return new C21667gf("tos", Promotion.ACTION_VIEW, "pp", "Privacy Policy opened");
    }

    /* renamed from: i */
    public static C21667gf m52953i() {
        return new C21667gf("tos_accepted", "business", "doc-select", "User started the flow");
    }

    /* renamed from: j */
    public static C21667gf m52954j() {
        return new C21667gf("hardware_test_successful", "business", "camera", "Camera permissions granted");
    }

    /* renamed from: k */
    public static C21667gf m52955k() {
        return new C21667gf("hardware_test", "business", "camera", "Camera permissions denied");
    }

    /* renamed from: l */
    public static C21667gf m52956l() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "camera_permission_triggered");
    }

    /* renamed from: m */
    public static C21667gf m52957m() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "camera_permission_granted");
    }

    /* renamed from: n */
    public static C21667gf m52958n() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "camera_permission_declined");
    }

    /* renamed from: o */
    public static C21667gf m52959o() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "microphone_permission_triggered");
    }

    /* renamed from: p */
    public static C21667gf m52960p() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "microphone_permission_granted");
    }

    /* renamed from: q */
    public static C21667gf m52961q() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "microphone_permission_declined");
    }

    /* renamed from: r */
    public static C21667gf m52962r() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "video_recording_error_shown");
    }

    /* renamed from: s */
    public static C21667gf m52963s() {
        return new C21667gf(InAppMessageBase.MESSAGE, "business", "version-unsupported-error-shown");
    }

    /* renamed from: t */
    public static C21667gf m52964t() {
        return new C21667gf(InAppMessageBase.MESSAGE, "info", "upload_view_started");
    }

    /* renamed from: u */
    public static C21667gf m52965u() {
        return new C21667gf(InAppMessageBase.MESSAGE, "info", "upload_retry_failed");
    }

    /* renamed from: v */
    public static C21667gf m52966v() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "guide-portrait");
    }

    /* renamed from: w */
    public static C21667gf m52967w() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "guide-doc-front");
    }

    /* renamed from: x */
    public static C21667gf m52968x() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "guide-doc-back");
    }

    /* renamed from: y */
    public static C21667gf m52969y() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "guide-doc-portrait");
    }

    /* renamed from: z */
    public static C21667gf m52970z() {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "guide-passport");
    }

    /* renamed from: d */
    public static C21667gf m52940d(C21789ix ixVar) {
        return new C21667gf("device-info", "info", "analytics", (C21667gf.C21668a) new C21667gf.C21668a.C21699q(new C21664gd(), m52952h(ixVar)));
    }

    /* renamed from: e */
    public static C21667gf m52946e(C21789ix ixVar) {
        return new C21667gf(InAppMessageBase.MESSAGE, Promotion.ACTION_VIEW, "document-back_instructions_screen_shown", m52952h(ixVar));
    }

    /* renamed from: f */
    public static C21667gf m52948f(C21789ix ixVar) {
        return new C21667gf("intro_screen_shown", "ui", "intro_screen_shown", m52952h(ixVar));
    }

    /* renamed from: g */
    public static C21667gf m52950g(C21789ix ixVar) {
        return new C21667gf("nfc_step_enabled", new C21667gf.C21668a.C21672ac(true, (C21667gf.C21713f) null, m52952h(ixVar)));
    }

    /* renamed from: h */
    private static List<C21667gf.C21711d> m52952h(C21789ix ixVar) {
        ArrayList arrayList = new ArrayList();
        if (ixVar != null) {
            for (String str : C21647fv.f54668a) {
                str.getClass();
                if (str.equals("merged_ui_temp_android")) {
                    arrayList.add(new C21667gf.C21711d(str, Boolean.valueOf(ixVar.mo55466r())));
                } else if (str.equals("nfc_enabled")) {
                    arrayList.add(new C21667gf.C21711d(str, Boolean.valueOf(ixVar.mo55460l())));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C21667gf m52905a(boolean z, String str, String str2, C21789ix ixVar) {
        return new C21667gf("country_select_screen_shown", "business", ServerParameters.COUNTRY, (C21667gf.C21668a) new C21667gf.C21668a.C21696n(str2, str, (String) null, Boolean.valueOf(z), m52952h(ixVar)));
    }

    /* renamed from: b */
    public static C21667gf m52912b() {
        return new C21667gf("video-started", "business", "camera", "Local video started");
    }

    /* renamed from: c */
    public static C21667gf m52926c() {
        return new C21667gf("face_approved", "business", "image");
    }

    /* renamed from: d */
    public static C21667gf m52942d(String str) {
        return new C21667gf("capture_approved", "business", "selfid", String.format("Capture: %s", new Object[]{str}));
    }

    /* renamed from: e */
    public static C21667gf m52944e(int i) {
        return new C21667gf("error_screen_exit_clicked", "ui", "error", (C21667gf.C21668a) new C21667gf.C21668a.C21704v(C21647fv.C21648a.m52556a(i)));
    }

    /* renamed from: b */
    public static C21667gf m52918b(C21789ix ixVar) {
        return new C21667gf("upload_failed", "info", "upload", m52952h(ixVar));
    }

    /* renamed from: c */
    public static C21667gf m52927c(int i) {
        return new C21667gf("upload_success", "info", "upload", C16759e.m42349e("", i));
    }

    /* renamed from: d */
    public static C21667gf m52937d(int i) {
        return new C21667gf("error_screen_try_again_clicked", "ui", "error", (C21667gf.C21668a) new C21667gf.C21668a.C21704v(C21647fv.C21648a.m52556a(i)));
    }

    /* renamed from: a */
    public static C21667gf m52906a(boolean z, String str, String str2, String str3) {
        return new C21667gf("country_select_dropdown_item_chosen", "business", ServerParameters.COUNTRY, (C21667gf.C21668a) new C21667gf.C21668a.C21696n(str2, str, str3, Boolean.valueOf(z)));
    }

    /* renamed from: e */
    public static C21667gf m52945e(long j, long j2) {
        return new C21667gf("nfc_data_downloaded", "info", "nfc", (C21667gf.C21668a) new C21667gf.C21668a.C21673ad(((double) j) / 1000.0d, ((double) j2) / 1000.0d));
    }

    /* renamed from: b */
    public static C21667gf m52913b(int i) {
        return new C21667gf("retry_uploading", "info", "upload", C16759e.m42349e("", i));
    }

    /* renamed from: d */
    public static C21667gf m52939d(C21783is isVar, C21719gi giVar) {
        return new C21667gf("document_to_country_reopen", "ui", "doc-select", (C21667gf.C21668a) new C21667gf.C21668a.C21674ae(isVar, giVar.mo55300a()));
    }

    /* renamed from: a */
    public static C21667gf m52891a(C21789ix ixVar) {
        return new C21667gf("session-started", "business", "verification", (C21667gf.C21668a) new C21667gf.C21668a.C21670aa("Session started", m52952h(ixVar)));
    }

    /* renamed from: d */
    public static C21667gf m52938d(long j, long j2) {
        return new C21667gf("nfc_photo_downloaded", "info", "nfc", (C21667gf.C21668a) new C21667gf.C21668a.C21673ad(((double) j) / 1000.0d, ((double) j2) / 1000.0d));
    }

    /* renamed from: d */
    public static C21667gf m52941d(C21791iy iyVar, C21789ix ixVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_auto_capture_enabled"), new C21667gf.C21668a.C21678ai(true, (C21667gf.C21709b) null, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52879a() {
        return new C21667gf("camera-started", "business", "verification", "Permissions are granted and camera flow is started");
    }

    /* renamed from: a */
    public static C21667gf m52901a(String str, int i, int i2) {
        return new C21667gf("video_first_frame_received", "info", "camera", (C21667gf.C21668a) new C21667gf.C21668a.C21682am(str, i, i2));
    }

    /* renamed from: a */
    public static C21667gf m52884a(long j, long j2) {
        return new C21667gf("video_file_saved", "info", "camera", (C21667gf.C21668a) new C21667gf.C21668a.C21681al(j, j2));
    }

    /* renamed from: c */
    public static C21667gf m52930c(C21789ix ixVar) {
        return new C21667gf(WidgetMessageParser.KEY_SUCCESS, "business", "verification", m52952h(ixVar));
    }

    /* renamed from: a */
    public static C21667gf m52882a(int i, C21789ix ixVar) {
        return new C21667gf("session-submitted", "business", "verification", (C21667gf.C21668a) new C21667gf.C21668a.C21670aa(String.valueOf(i), m52952h(ixVar)));
    }

    /* renamed from: b */
    public static C21667gf m52922b(String str) {
        return new C21667gf("doc-select", "business", "doc-select", String.format("Document selected: %s", new Object[]{str}));
    }

    /* renamed from: c */
    public static C21667gf m52932c(String str) {
        return new C21667gf(InAppMessageBase.MESSAGE, "info", "upload_session_update", str);
    }

    /* renamed from: a */
    public static C21667gf m52900a(String str) {
        return new C21667gf("uploading", "business", "upload", str);
    }

    /* renamed from: b */
    public static C21667gf m52921b(C21791iy iyVar, C21789ix ixVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_auto_capture_manual_controls_shown"), "ui", "camera", (C21667gf.C21668a) new C21667gf.C21668a.C21702t(m52952h(ixVar)));
    }

    /* renamed from: c */
    public static C21667gf m52931c(C21791iy iyVar, C21789ix ixVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_instructions_screen_shown"), "ui", "feature_instructions", m52952h(ixVar));
    }

    /* renamed from: a */
    public static C21667gf m52880a(int i) {
        return new C21667gf("retry_shown", "info", "upload", C16759e.m42349e("", i));
    }

    /* renamed from: c */
    public static C21667gf m52929c(C21783is isVar, C21719gi giVar) {
        return new C21667gf("quit_session_cancelled", "ui", "quit_session", (C21667gf.C21668a) new C21667gf.C21668a.C21674ae(isVar, giVar.mo55300a()));
    }

    /* renamed from: b */
    public static C21667gf m52916b(long j, long j2) {
        return new C21667gf("barcode_scanned", "ui", "barcode", (C21667gf.C21668a) new C21667gf.C21668a.C21691i(j, j2));
    }

    /* renamed from: b */
    public static C21667gf m52914b(int i, C21789ix ixVar) {
        return new C21667gf("error_screen_shown", "ui", "error", (C21667gf.C21668a) new C21667gf.C21668a.C21704v(C21647fv.C21648a.m52556a(i), m52952h(ixVar)));
    }

    /* renamed from: c */
    public static C21667gf m52928c(long j, long j2) {
        return new C21667gf("nfc_tag_connected", "info", "nfc", (C21667gf.C21668a) new C21667gf.C21668a.C21673ad(((double) j) / 1000.0d, ((double) j2) / 1000.0d));
    }

    /* renamed from: a */
    public static C21667gf m52902a(String str, C21667gf.C21714g gVar) {
        return new C21667gf("language_assigned", new C21667gf.C21668a.C21708z(str.toUpperCase(Locale.US), gVar));
    }

    /* renamed from: c */
    public static C21667gf m52933c(String str, String str2) {
        return new C21667gf("consent_screen_cancel_pressed", new C21667gf.C21668a.C21694l(str, str2));
    }

    /* renamed from: a */
    public static C21667gf m52888a(C21783is isVar) {
        return new C21667gf("change_language_clicked", new C21667gf.C21668a.C21677ah(isVar));
    }

    /* renamed from: c */
    private static String m52935c(C21791iy iyVar) {
        switch (C217171.f54927a[iyVar.ordinal()]) {
            case 1:
                return "portrait";
            case 2:
                return "passport";
            case 3:
            case 4:
            case 5:
                return "document_front";
            case 6:
            case 7:
            case 8:
            case 9:
                return "document_back";
            case 10:
                return "passport_and_face";
            case 11:
            case 12:
            case 13:
                return "document_and_face";
            case 14:
                return "address";
            case 15:
                return "barcode";
            case 16:
                return "nfc";
            default:
                throw new IllegalArgumentException("Unknown step");
        }
    }

    /* renamed from: a */
    public static C21667gf m52899a(C21791iy iyVar, Long l, boolean z, C21789ix ixVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_auto_capture_taking_picture"), "ui", "camera", (C21667gf.C21668a) new C21667gf.C21668a.C21688f(l.longValue(), z, m52952h(ixVar)));
    }

    /* renamed from: b */
    public static C21667gf m52924b(C24429e eVar, boolean z) {
        return new C21667gf("document_selected", "ui", "doc-select", (C21667gf.C21668a) new C21667gf.C21668a.C21700r(eVar.mo60618a(), Boolean.valueOf(z)));
    }

    /* renamed from: b */
    public static C21667gf m52920b(C21791iy iyVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_screen_shown"), "ui", "camera_screen");
    }

    /* renamed from: a */
    public static C21667gf m52896a(C21791iy iyVar, C21789ix ixVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_auto_capture_fallback_option_shown"), "ui", "camera", (C21667gf.C21668a) new C21667gf.C21668a.C21702t(m52952h(ixVar)));
    }

    /* renamed from: b */
    public static C21667gf m52917b(C21783is isVar, C21719gi giVar) {
        return new C21667gf("quit_session_confirmed", "ui", "quit_session", (C21667gf.C21668a) new C21667gf.C21668a.C21674ae(isVar, giVar.mo55300a()));
    }

    /* renamed from: b */
    public static C21667gf m52915b(long j) {
        return new C21667gf("waiting_decision_continue_clicked", "ui", "decision_waiting", (C21667gf.C21668a) new C21667gf.C21668a.C21697o((int) (j / 1000)));
    }

    /* renamed from: b */
    public static C21667gf m52919b(C21789ix ixVar, C21791iy iyVar, List<String> list) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_feedback_try_again"), new C21667gf.C21668a.C21705w(list, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52885a(C21667gf.C21710c cVar, Throwable th, String str, C21720gj gjVar) {
        return new C21667gf("error", "error", "error-reporting", (C21667gf.C21668a) new C21667gf.C21668a.C21703u(String.format("Error captured at %s. %n %s", new Object[]{str, th.toString()}), cVar, gjVar));
    }

    /* renamed from: a */
    public static C21667gf m52883a(long j) {
        return new C21667gf("barcode_scan_started", "ui", "barcode", (C21667gf.C21668a) new C21667gf.C21668a.C21690h(j));
    }

    /* renamed from: a */
    public static C21667gf m52881a(int i, long j) {
        return new C21667gf("barcode_accepted", new C21667gf.C21668a.C21689g(i, j));
    }

    /* renamed from: b */
    public static C21667gf m52923b(String str, String str2) {
        return new C21667gf("consent_screen_approved_pressed", new C21667gf.C21668a.C21693k(str, str2));
    }

    /* renamed from: a */
    public static C21667gf m52894a(C21789ix ixVar, Integer num, boolean z) {
        return new C21667gf("resubmission_feedback_screen_shown", "ui", "resubmission_feedback", (C21667gf.C21668a) new C21667gf.C21668a.C21676ag(num, z, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52907a(C24429e[] eVarArr, C21789ix ixVar) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (C24429e a : eVarArr) {
            arrayList.add(a.mo60618a());
        }
        if (eVarArr.length == 1) {
            z = true;
        }
        return new C21667gf("document_select_screen_shown", "ui", "doc-select", (C21667gf.C21668a) new C21667gf.C21668a.C21701s(arrayList, Boolean.valueOf(z), m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52904a(C24429e eVar, boolean z) {
        return new C21667gf("document_from_list_chosen", "ui", "doc-select", (C21667gf.C21668a) new C21667gf.C21668a.C21700r(eVar.mo60618a(), Boolean.valueOf(z)));
    }

    /* renamed from: a */
    public static C21667gf m52895a(C21791iy iyVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_instructions_screen_continue"), "ui", "feature_instructions");
    }

    /* renamed from: a */
    public static C21667gf m52897a(C21791iy iyVar, C21789ix ixVar, long j) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_screen_take_picture_clicked"), "ui", "camera_screen", (C21667gf.C21668a) new C21667gf.C21668a.C21679aj(j, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52890a(C21783is isVar, C21719gi giVar) {
        return new C21667gf("quit_session_button_clicked", "ui", "quit_session", (C21667gf.C21668a) new C21667gf.C21668a.C21674ae(isVar, giVar.mo55300a()));
    }

    /* renamed from: a */
    public static C21667gf m52887a(C21667gf.C21713f fVar, C21789ix ixVar) {
        return new C21667gf("nfc_step_enabled", new C21667gf.C21668a.C21672ac(false, fVar, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52898a(C21791iy iyVar, C21789ix ixVar, C21667gf.C21709b bVar) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_auto_capture_enabled"), new C21667gf.C21668a.C21678ai(false, bVar, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52892a(C21789ix ixVar, C21791iy iyVar, String str, boolean z, List<String> list, Double d) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_feedback_screen_shown"), new C21667gf.C21668a.C21706x(str, z, list, d, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52893a(C21789ix ixVar, C21791iy iyVar, List<String> list) {
        return new C21667gf(C0016g.m31o(new StringBuilder(), m52935c(iyVar), "_feedback_continue"), new C21667gf.C21668a.C21705w(list, m52952h(ixVar)));
    }

    /* renamed from: a */
    public static C21667gf m52889a(C21783is isVar, long j) {
        return new C21667gf("video_playback_started", new C21667gf.C21668a.C21683an(isVar, j));
    }

    /* renamed from: a */
    public static C21667gf m52903a(String str, String str2) {
        return new C21667gf("consent_screen_shown", new C21667gf.C21668a.C21695m(str, str2));
    }
}
