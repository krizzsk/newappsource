package od0;

import android.text.TextUtils;
import ce0.C21119t;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.concurrent.TimeUnit;
import p359ag.C13452i;
import p389bl.C13641g;

/* renamed from: od0.l */
public final class C24565l {

    /* renamed from: a */
    public final C24559j f62255a;

    /* renamed from: b */
    public final C23192a f62256b;

    public C24565l(C23192a aVar, C21119t tVar) {
        this.f62256b = aVar;
        C24559j jVar = (C24559j) aVar.mo58281p(C24559j.class, "consentIsImportantToVungle").get(tVar.mo53295a(), TimeUnit.MILLISECONDS);
        if (jVar == null) {
            jVar = new C24559j("consentIsImportantToVungle");
            jVar.mo60827d("", "consent_message_version");
            jVar.mo60827d("unknown", "consent_status");
            jVar.mo60827d("no_interaction", "consent_source");
            jVar.mo60827d(0L, "timestamp");
        }
        this.f62255a = jVar;
    }

    /* renamed from: a */
    public final void mo60830a(C13452i iVar) throws DatabaseHelper.DBException {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!C13641g.m34129r(iVar, "is_country_data_protected") || !iVar.mo40351I("is_country_data_protected").mo40333i()) {
            z = false;
        } else {
            z = true;
        }
        String str6 = "";
        if (C13641g.m34129r(iVar, "consent_title")) {
            str = iVar.mo40351I("consent_title").mo40326B();
        } else {
            str = str6;
        }
        if (C13641g.m34129r(iVar, "consent_message")) {
            str2 = iVar.mo40351I("consent_message").mo40326B();
        } else {
            str2 = str6;
        }
        if (C13641g.m34129r(iVar, "consent_message_version")) {
            str3 = iVar.mo40351I("consent_message_version").mo40326B();
        } else {
            str3 = str6;
        }
        if (C13641g.m34129r(iVar, "button_accept")) {
            str4 = iVar.mo40351I("button_accept").mo40326B();
        } else {
            str4 = str6;
        }
        if (C13641g.m34129r(iVar, "button_deny")) {
            str5 = iVar.mo40351I("button_deny").mo40326B();
        } else {
            str5 = str6;
        }
        this.f62255a.mo60827d(Boolean.valueOf(z), "is_country_data_protected");
        C24559j jVar = this.f62255a;
        if (TextUtils.isEmpty(str)) {
            str = "Targeted Ads";
        }
        jVar.mo60827d(str, "consent_title");
        C24559j jVar2 = this.f62255a;
        if (TextUtils.isEmpty(str2)) {
            str2 = "To receive more relevant ad content based on your interactions with our ads, click \"I Consent\" below. Either way, you will see the same amount of ads.";
        }
        jVar2.mo60827d(str2, "consent_message");
        if (!"publisher".equalsIgnoreCase(this.f62255a.mo60826c("consent_source"))) {
            C24559j jVar3 = this.f62255a;
            if (!TextUtils.isEmpty(str3)) {
                str6 = str3;
            }
            jVar3.mo60827d(str6, "consent_message_version");
        }
        C24559j jVar4 = this.f62255a;
        if (TextUtils.isEmpty(str4)) {
            str4 = "I Consent";
        }
        jVar4.mo60827d(str4, "button_accept");
        C24559j jVar5 = this.f62255a;
        if (TextUtils.isEmpty(str5)) {
            str5 = "I Do Not Consent";
        }
        jVar5.mo60827d(str5, "button_deny");
        this.f62256b.mo58288w(this.f62255a);
    }
}
