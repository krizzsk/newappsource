package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21667gf;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.data.C24424c;
import p583jk.C17875h;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B/\b\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5¨\u00066"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/FlowStep;", "", "Lcom/veriff/sdk/Strings;", "strings", "", "", "getStepInfoTags", "Lkotlin/Function1;", "cameraText", "Llf0/l;", "getCameraText", "()Llf0/l;", "", "getFirstPhotoContext", "()Ljava/lang/String;", "firstPhotoContext", "Lcom/veriff/sdk/internal/data/InstructionGuideAssets;", "guideAssets", "Lcom/veriff/sdk/internal/data/InstructionGuideAssets;", "getGuideAssets", "()Lcom/veriff/sdk/internal/data/InstructionGuideAssets;", "", "isUseFaceDetection", "()Z", "Lcom/veriff/sdk/internal/data/PhotoContext;", "photoContext", "Lcom/veriff/sdk/internal/data/PhotoContext;", "getPhotoContext", "()Lcom/veriff/sdk/internal/data/PhotoContext;", "getSecondPhotoContext", "secondPhotoContext", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "getVideoContext", "()Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "videoContext", "<init>", "(Ljava/lang/String;ILcom/veriff/sdk/internal/data/PhotoContext;Llf0/l;Lcom/veriff/sdk/internal/data/InstructionGuideAssets;)V", "Companion", "TAKE_PORTRAIT", "TAKE_PHOTO_OF_PASSPORT", "TAKE_PHOTO_OF_DRIVERS_LICENSE_FRONT", "TAKE_PHOTO_OF_ID_CARD_FRONT", "TAKE_PHOTO_OF_RESIDENCE_PERMIT_FRONT", "TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK", "TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK_AFTER_BARCODE", "TAKE_PHOTO_OF_ID_CARD_BACK", "TAKE_PHOTO_OF_RESIDENCE_PERMIT_BACK", "SCAN_BARCODE_OF_DRIVERS_LICENSE_BACK", "SCAN_NFC_OF_MRTD_PASSPORT", "TAKE_PORTRAIT_WITH_PASSPORT", "TAKE_PORTRAIT_WITH_DRIVERS_LICENSE", "TAKE_PORTRAIT_WITH_ID_CARD", "TAKE_PORTRAIT_WITH_RESIDENCE_PERMIT", "TAKE_PROOF_OF_ADDRESS", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.iy */
public enum C21791iy {
    TAKE_PORTRAIT(C21882jp.FACE, C217921.f55203a, new C21869jc(C2179512.f55206a, C2180723.f55218a, R$drawable.vrff_instruction_portrait, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PHOTO_OF_PASSPORT(r14, C2181934.f55230a, new C21869jc(C2183044.f55241a, C2183145.f55242a, R$drawable.vrff_instruction_passport, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PHOTO_OF_DRIVERS_LICENSE_FRONT(r5, r6, new C21869jc(r16, r17, r26, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PHOTO_OF_ID_CARD_FRONT(r5, C218032.f55214a, new C21869jc(C218143.f55225a, C218254.f55236a, r21, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PHOTO_OF_RESIDENCE_PERMIT_FRONT(r5, C218355.f55246a, new C21869jc(C218366.f55247a, C218377.f55248a, r21, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK(r14, r7, new C21869jc(r9, r10, r11, r12, true)),
    TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK_AFTER_BARCODE(r5, C2179411.f55205a, new C21869jc(C2179613.f55207a, C2179714.f55208a, r23, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PHOTO_OF_ID_CARD_BACK(r5, C2179815.f55209a, new C21869jc(C2179916.f55210a, C2180017.f55211a, r11, r12, true)),
    TAKE_PHOTO_OF_RESIDENCE_PERMIT_BACK(r5, C2180118.f55212a, new C21869jc(C2180219.f55213a, C2180420.f55215a, r11, r12, true)),
    SCAN_BARCODE_OF_DRIVERS_LICENSE_BACK(C21882jp.DOCUMENT_BACK_BARCODE, C2180521.f55216a, new C21869jc(C2180622.f55217a, C2180824.f55219a, r11, R$drawable.vrff_instruction_doc_back_barcode_new, true)),
    SCAN_NFC_OF_MRTD_PASSPORT(C21882jp.DOCUMENT_NFC, C2180925.f55220a, new C21869jc(C2181026.f55221a, C2181127.f55222a, R$drawable.vrff_instruction_emrtd, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PORTRAIT_WITH_PASSPORT(r9, r7, new C21869jc(r11, r12, r21, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PORTRAIT_WITH_DRIVERS_LICENSE(r5, C2181631.f55227a, new C21869jc(C2181732.f55228a, C2181833.f55229a, r16, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PORTRAIT_WITH_ID_CARD(r5, C2182035.f55231a, new C21869jc(C2182136.f55232a, C2182237.f55233a, r16, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PORTRAIT_WITH_RESIDENCE_PERMIT(r5, C2182338.f55234a, new C21869jc(C2182439.f55235a, C2182640.f55237a, r16, 0, false, 24, (DefaultConstructorMarker) null)),
    TAKE_PROOF_OF_ADDRESS(C21882jp.ADDRESS, C2182741.f55238a, new C21869jc(C2182842.f55239a, C2182943.f55240a, R$drawable.vrff_document_front_new, 0, false, 24, (DefaultConstructorMarker) null));
    

    /* renamed from: q */
    public static final C21840a f55198q = null;

    /* renamed from: s */
    private final C21882jp f55200s;

    /* renamed from: t */
    private final C24236l<C21616ex, CharSequence> f55201t;

    /* renamed from: u */
    private final C21869jc f55202u;

    /* access modifiers changed from: public */
    static {
        f55198q = new C21840a((DefaultConstructorMarker) null);
    }

    private C21791iy(C21882jp jpVar, C24236l<? super C21616ex, ? extends CharSequence> lVar, C21869jc jcVar) {
        this.f55200s = jpVar;
        this.f55201t = lVar;
        this.f55202u = jcVar;
    }

    /* renamed from: a */
    public static final C21791iy m53250a(String str) {
        return f55198q.mo55538a(str);
    }

    /* renamed from: b */
    public static final C21791iy m53251b(String str) {
        return f55198q.mo55542c(str);
    }

    /* renamed from: a */
    public final String mo55481a() {
        return this.f55200s.mo55595a();
    }

    /* renamed from: b */
    public final String mo55483b() {
        return this.f55200s.mo55596b();
    }

    /* renamed from: c */
    public final boolean mo55484c() {
        return this.f55200s.mo55598d();
    }

    /* renamed from: d */
    public final C22549tg mo55485d() {
        return this.f55200s.mo55597c();
    }

    /* renamed from: e */
    public final C21882jp mo55486e() {
        return this.f55200s;
    }

    /* renamed from: f */
    public final C24236l<C21616ex, CharSequence> mo55487f() {
        return this.f55201t;
    }

    /* renamed from: g */
    public final C21869jc mo55488g() {
        return this.f55202u;
    }

    /* renamed from: a */
    public final List<CharSequence> mo55482a(C21616ex exVar) {
        C24362h.m61211f(exVar, "strings");
        int i = C21841iz.f55251a[this.f55200s.ordinal()];
        if (i == 1) {
            return C17875h.m44281E(exVar.mo54671aO(), exVar.mo54672aP());
        } else if (i == 2 || i == 3) {
            return C17875h.m44281E(exVar.mo54673aQ(), exVar.mo54674aR(), exVar.mo54675aS(), exVar.mo54676aT());
        } else if (i == 4) {
            return C17875h.m44281E(exVar.mo54673aQ(), exVar.mo54671aO(), exVar.mo54677aU(), exVar.mo54678aV());
        } else {
            StringBuilder k = C13555b.m33972k("Unknown context ");
            k.append(this.f55200s);
            throw new IllegalStateException(k.toString());
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J2\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0018"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/FlowStep$Companion;", "", "()V", "getDocBackStep", "Lcom/veriff/sdk/internal/data/FlowStep;", "documentType", "", "getDocFrontStep", "getDocumentFlowSteps", "", "flags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "selectedCountry", "Lmobi/lab/veriff/data/Country;", "addNfcStep", "", "getFlowSteps", "poaEnabled", "getNfcDisabledReason", "Lcom/veriff/sdk/internal/analytics/Event$NfcDisabledReason;", "appHasNfcPermission", "deviceHasNfc", "getNonDocumentFlowSteps", "getPortraitWithDocStep", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.iy$a */
    public static final class C21840a {
        private C21840a() {
        }

        public /* synthetic */ C21840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C21791iy mo55538a(String str) {
            C24362h.m61211f(str, "documentType");
            Locale locale = Locale.US;
            C24362h.m61210e(locale, "Locale.US");
            String upperCase = str.toUpperCase(locale);
            C24362h.m61210e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            switch (upperCase.hashCode()) {
                case -1895130188:
                    if (upperCase.equals("ID_CARD")) {
                        return C21791iy.TAKE_PORTRAIT_WITH_ID_CARD;
                    }
                    break;
                case 84104461:
                    if (upperCase.equals("DRIVERS_LICENSE")) {
                        return C21791iy.TAKE_PORTRAIT_WITH_DRIVERS_LICENSE;
                    }
                    break;
                case 1305942932:
                    if (upperCase.equals("RESIDENCE_PERMIT")) {
                        return C21791iy.TAKE_PORTRAIT_WITH_RESIDENCE_PERMIT;
                    }
                    break;
                case 1999404050:
                    if (upperCase.equals("PASSPORT")) {
                        return C21791iy.TAKE_PORTRAIT_WITH_PASSPORT;
                    }
                    break;
            }
            throw new IllegalArgumentException(C25541a.m63881k("Unknown document type ", str));
        }

        /* renamed from: b */
        public final C21791iy mo55541b(String str) {
            C24362h.m61211f(str, "documentType");
            Locale locale = Locale.US;
            C24362h.m61210e(locale, "Locale.US");
            String upperCase = str.toUpperCase(locale);
            C24362h.m61210e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            switch (upperCase.hashCode()) {
                case -1895130188:
                    if (upperCase.equals("ID_CARD")) {
                        return C21791iy.TAKE_PHOTO_OF_ID_CARD_FRONT;
                    }
                    break;
                case 84104461:
                    if (upperCase.equals("DRIVERS_LICENSE")) {
                        return C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_FRONT;
                    }
                    break;
                case 1305942932:
                    if (upperCase.equals("RESIDENCE_PERMIT")) {
                        return C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_FRONT;
                    }
                    break;
                case 1999404050:
                    if (upperCase.equals("PASSPORT")) {
                        return C21791iy.TAKE_PHOTO_OF_PASSPORT;
                    }
                    break;
            }
            throw new IllegalArgumentException(C25541a.m63881k("Unknown document type ", str));
        }

        /* renamed from: c */
        public final C21791iy mo55542c(String str) {
            C24362h.m61211f(str, "documentType");
            Locale locale = Locale.US;
            C24362h.m61210e(locale, "Locale.US");
            String upperCase = str.toUpperCase(locale);
            C24362h.m61210e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            switch (upperCase.hashCode()) {
                case -1895130188:
                    if (upperCase.equals("ID_CARD")) {
                        return C21791iy.TAKE_PHOTO_OF_ID_CARD_BACK;
                    }
                    break;
                case 84104461:
                    if (upperCase.equals("DRIVERS_LICENSE")) {
                        return C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK;
                    }
                    break;
                case 1305942932:
                    if (upperCase.equals("RESIDENCE_PERMIT")) {
                        return C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_BACK;
                    }
                    break;
                case 1999404050:
                    if (upperCase.equals("PASSPORT")) {
                        throw new IllegalArgumentException("Passport document type does not have document-back photo");
                    }
                    break;
            }
            throw new IllegalArgumentException(C25541a.m63881k("Unknown document type ", str));
        }

        /* renamed from: a */
        public final List<C21791iy> mo55540a(C21789ix ixVar, boolean z) {
            C24362h.m61211f(ixVar, "flags");
            LinkedList linkedList = new LinkedList();
            if (z) {
                linkedList.add(C21791iy.TAKE_PROOF_OF_ADDRESS);
                return linkedList;
            }
            if (ixVar.mo55458j()) {
                linkedList.add(C21791iy.TAKE_PORTRAIT);
            }
            return linkedList;
        }

        /* renamed from: a */
        public final List<C21791iy> mo55539a(C21789ix ixVar, String str, C24424c cVar, boolean z, boolean z2) {
            C24362h.m61211f(ixVar, "flags");
            C24362h.m61211f(str, "documentType");
            C24362h.m61211f(cVar, "selectedCountry");
            LinkedList linkedList = new LinkedList();
            if (!ixVar.mo55462n()) {
                linkedList.addAll(m53308a(ixVar, str, cVar, z));
            }
            if (z2) {
                linkedList.add(C21791iy.TAKE_PROOF_OF_ADDRESS);
            }
            if (ixVar.mo55458j()) {
                linkedList.add(C21791iy.TAKE_PORTRAIT);
            }
            if (ixVar.mo55448c() && !ixVar.mo55462n()) {
                linkedList.add(mo55538a(str));
            }
            return linkedList;
        }

        /* renamed from: a */
        private final List<C21791iy> m53308a(C21789ix ixVar, String str, C24424c cVar, boolean z) {
            LinkedList linkedList = new LinkedList();
            if (C25081h.m62830A("PASSPORT", str, true)) {
                linkedList.add(C21791iy.TAKE_PHOTO_OF_PASSPORT);
                if (z) {
                    linkedList.add(C21791iy.SCAN_NFC_OF_MRTD_PASSPORT);
                }
            } else {
                linkedList.add(mo55541b(str));
                if (!ixVar.mo55455h() || !C25081h.m62830A("DRIVERS_LICENSE", str, true) || !C25081h.m62830A("US", cVar.mo60581a(), true)) {
                    linkedList.add(mo55542c(str));
                } else {
                    linkedList.add(C21791iy.SCAN_BARCODE_OF_DRIVERS_LICENSE_BACK);
                    linkedList.add(C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK_AFTER_BARCODE);
                }
            }
            return linkedList;
        }

        /* renamed from: a */
        public final C21667gf.C21713f mo55537a(String str, C24424c cVar, boolean z, boolean z2, C21789ix ixVar) {
            boolean z3;
            C24362h.m61211f(str, "documentType");
            C24362h.m61211f(cVar, "selectedCountry");
            C24362h.m61211f(ixVar, "flags");
            List<String> N = ixVar.mo55437N();
            if (!(N instanceof Collection) || !N.isEmpty()) {
                Iterator<T> it = N.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C25081h.m62830A((String) it.next(), cVar.mo60581a(), true)) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                return C21667gf.C21713f.country_unsupported;
            }
            if (!z) {
                return C21667gf.C21713f.app_unsupported;
            }
            if (!z2) {
                return C21667gf.C21713f.device_unsupported;
            }
            if (!C24362h.m61206a(str, "PASSPORT")) {
                return C21667gf.C21713f.document_unsupported;
            }
            if (C22465ry.m54758a(ixVar) == C22464rx.DISABLED) {
                return C21667gf.C21713f.flag_disabled;
            }
            return null;
        }
    }
}
