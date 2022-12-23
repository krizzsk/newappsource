package t60;

import a00.C13382a;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.C2341k;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.inputfields.C16069a;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.inputfields.TextInputFieldView;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationTextSpec;
import p583jk.C17884p;
import p808sx.C19568d;
import p810sz.C19617r;
import t60.C19634d;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25765g;

/* renamed from: t60.e */
public class C19636e extends C15682c<MoovitActivity> implements C19634d, C16069a.C16070a {

    /* renamed from: r */
    public static final /* synthetic */ int f49821r = 0;

    /* renamed from: n */
    public ProfileCertificationTextSpec f49822n;

    /* renamed from: o */
    public TextInputFieldView f49823o;

    /* renamed from: p */
    public Button f49824p;

    /* renamed from: q */
    public ImageView f49825q;

    public C19636e() {
        super(MoovitActivity.class);
    }

    /* renamed from: B1 */
    public final void mo51976B1() {
        TextInputFieldView textInputFieldView = this.f49823o;
        ProfileCertificationTextSpec profileCertificationTextSpec = this.f49822n;
        textInputFieldView.mo48264C(profileCertificationTextSpec.f42859g, profileCertificationTextSpec.f42860h);
    }

    /* renamed from: D0 */
    public final boolean mo51977D0() {
        return !TextUtils.isEmpty(this.f49823o.getValue());
    }

    /* renamed from: H0 */
    public final void mo23440H0() {
        this.f49824p.setEnabled(!TextUtils.equals(this.f49823o.getValue(), this.f49822n.f42860h));
        mo46786U1(C19634d.C19635a.class, new C2341k(10));
    }

    /* renamed from: P0 */
    public final ProfileCertificateData mo51978P0() {
        InputFieldValue a;
        if (mo51977D0() && (a = this.f49823o.mo48265a()) != null) {
            return new ProfileCertificateTextData(a);
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49822n = (ProfileCertificationTextSpec) mo46782Q1().getParcelable("certificateTextSpec");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        int i2;
        int i3;
        View inflate = layoutInflater.inflate(C25751f.certificate_text_card_fragment, viewGroup, false);
        UiUtils.m40234B((TextView) inflate.findViewById(C25750e.title), this.f49822n.f42856d);
        UiUtils.m40234B((TextView) inflate.findViewById(C25750e.subtitle), this.f49822n.f42857e);
        TextInputFieldView textInputFieldView = (TextInputFieldView) inflate.findViewById(C25750e.input);
        this.f49823o = textInputFieldView;
        ProfileCertificationTextSpec profileCertificationTextSpec = this.f49822n;
        textInputFieldView.mo48264C(profileCertificationTextSpec.f42859g, profileCertificationTextSpec.f42860h);
        this.f49823o.setInputFieldListener(this);
        Button button = (Button) inflate.findViewById(C25750e.action);
        this.f49824p = button;
        PaymentCertificateStatus paymentCertificateStatus = this.f49822n.f42854c;
        C19617r rVar = C25765g.f64279a;
        int[] iArr = C25765g.C25766a.f64281a;
        int i4 = iArr[paymentCertificateStatus.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
            i = C25754i.action_save;
        } else {
            i = 0;
        }
        if (i != 0) {
            button.setText(i);
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
        this.f49824p.setOnClickListener(new C19568d(this, 10));
        this.f49824p.setEnabled(!TextUtils.equals(this.f49823o.getValue(), this.f49822n.f42860h));
        ImageView imageView = (ImageView) inflate.findViewById(C25750e.icon);
        this.f49825q = imageView;
        ProfileCertificationTextSpec profileCertificationTextSpec2 = this.f49822n;
        PaymentCertificateStatus paymentCertificateStatus2 = profileCertificationTextSpec2.f42854c;
        if (paymentCertificateStatus2 == PaymentCertificateStatus.NONE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Image image = profileCertificationTextSpec2.f42858f;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(this.f49825q);
            this.f49825q.setContentDescription((CharSequence) null);
        } else {
            int i5 = iArr[paymentCertificateStatus2.ordinal()];
            if (i5 == 1) {
                i2 = C25749d.ic_pending_filled_24_problem;
                i3 = C25754i.voiceover_certification_pending;
            } else if (i5 == 2) {
                i2 = C25749d.ic_alert_filled_24_critical;
                i3 = C25754i.voiceover_certification_expired;
            } else if (i5 == 3) {
                i2 = C25749d.ic_alert_filled_24_critical;
                i3 = C25754i.voiceover_certification_not_valid;
            } else if (i5 == 4) {
                i2 = C25749d.ic_alert_filled_24_critical;
                i3 = C25754i.voiceover_certification_not_uploaded;
            } else if (i5 == 5) {
                i2 = C25749d.ic_check_mark_circ_24_good;
                i3 = C25754i.voiceover_certification_approved;
            } else {
                throw new IllegalStateException("Unknown status: " + paymentCertificateStatus2);
            }
            imageView.setImageResource(i2);
            C13382a.m33674j(imageView, imageView.getContext().getString(i3));
        }
        return inflate;
    }
}
