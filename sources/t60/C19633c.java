package t60;

import a00.C13382a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.ImageProviderFragment;
import com.moovit.image.model.Image;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec;
import java.io.File;
import p543hq.C17474b;
import p583jk.C17884p;
import p672ne.C18540b;
import p739px.C19037a;
import p810sz.C19617r;
import t60.C19634d;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25765g;

/* renamed from: t60.c */
public class C19633c extends ImageProviderFragment<MoovitActivity> implements C19634d {

    /* renamed from: t */
    public static final /* synthetic */ int f49816t = 0;

    /* renamed from: p */
    public ProfileCertificationPhotoSpec f49817p;

    /* renamed from: q */
    public File f49818q;

    /* renamed from: r */
    public ImageView f49819r;

    /* renamed from: s */
    public MaterialCardView f49820s;

    public C19633c() {
        super(MoovitActivity.class);
    }

    /* renamed from: B1 */
    public final void mo51976B1() {
        File file = this.f49818q;
        if (file != null) {
            file.delete();
            this.f49818q = null;
        }
        mo51979v2();
    }

    /* renamed from: D0 */
    public final boolean mo51977D0() {
        return this.f49818q != null;
    }

    /* renamed from: P0 */
    public final ProfileCertificateData mo51978P0() {
        if (this.f49818q == null) {
            return null;
        }
        return new ProfileCertificatePhotoData(this.f49818q, this.f49817p.f42853b);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49817p = (ProfileCertificationPhotoSpec) mo46782Q1().getParcelable("certification");
        if (bundle != null) {
            this.f49818q = (File) bundle.getSerializable("selected_photo");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(C25751f.certificate_photo_card_fragment, viewGroup, false);
        UiUtils.m40234B((TextView) inflate.findViewById(C25750e.title), this.f49817p.f42850d);
        UiUtils.m40234B((TextView) inflate.findViewById(C25750e.subtitle), this.f49817p.f42851e);
        TextView textView = (TextView) inflate.findViewById(C25750e.action);
        PaymentCertificateStatus paymentCertificateStatus = this.f49817p.f42854c;
        C19617r rVar = C25765g.f64279a;
        switch (C25765g.C25766a.f64281a[paymentCertificateStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                i = C25754i.payment_profile_update_doc;
                break;
            case 6:
                i = C25754i.payment_profile_upload_doc;
                break;
        }
        UiUtils.m40235C(textView, i, 8);
        MaterialCardView materialCardView = (MaterialCardView) inflate.findViewById(C25750e.certification_cardview);
        this.f49820s = materialCardView;
        materialCardView.setOnClickListener(new C19037a(this, 13));
        this.f49819r = (ImageView) inflate.findViewById(C25750e.icon);
        mo51979v2();
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("selected_photo", this.f49818q);
    }

    /* renamed from: s1 */
    public final void mo47928s1(File file, boolean z, Bundle bundle) {
        this.f41702n = null;
        if (getContext() != null && bundle != null) {
            String string = bundle.getString("certificate_id");
            if (this.f49817p.f42853b.equals(string)) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.PHOTO_TAKEN);
                aVar.mo49939g(AnalyticsAttributeKey.ID, string);
                mo46797j2(aVar.mo49933a());
                this.f49818q = file;
                mo51979v2();
                C13382a.m33665a(this.f49820s, this.f49819r.getContentDescription());
                mo46786U1(C19634d.C19635a.class, new C18540b(4, this, string));
            }
        }
    }

    /* renamed from: v2 */
    public final void mo51979v2() {
        boolean z;
        int i;
        int i2;
        PaymentCertificateStatus paymentCertificateStatus = this.f49817p.f42854c;
        if (paymentCertificateStatus != PaymentCertificateStatus.NONE || mo51977D0()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Image image = this.f49817p.f42852f;
            C17884p.m44354Y(this.f49819r).mo51642v(image).mo51628o0(image).mo10850T(this.f49819r);
            this.f49819r.setContentDescription((CharSequence) null);
            return;
        }
        ImageView imageView = this.f49819r;
        C19617r rVar = C25765g.f64279a;
        switch (C25765g.C25766a.f64281a[paymentCertificateStatus.ordinal()]) {
            case 1:
                i2 = C25749d.ic_pending_filled_24_problem;
                i = C25754i.voiceover_certification_pending;
                break;
            case 2:
                i2 = C25749d.ic_alert_filled_24_critical;
                i = C25754i.voiceover_certification_expired;
                break;
            case 3:
                i2 = C25749d.ic_alert_filled_24_critical;
                i = C25754i.voiceover_certification_not_valid;
                break;
            case 4:
                i2 = C25749d.ic_alert_filled_24_critical;
                i = C25754i.voiceover_certification_not_uploaded;
                break;
            case 5:
                i2 = C25749d.ic_check_mark_circ_24_good;
                i = C25754i.voiceover_certification_approved;
                break;
            case 6:
                i2 = C25749d.ic_check_mark_circ_24_good;
                i = C25754i.voiceover_certification_added;
                break;
            default:
                i2 = 0;
                i = 0;
                break;
        }
        imageView.setImageResource(i2);
        C13382a.m33674j(imageView, imageView.getContext().getString(i));
    }
}
