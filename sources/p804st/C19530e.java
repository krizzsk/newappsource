package p804st;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c70.C13751d;
import ci0.C21211f;
import com.moovit.C15682c;
import com.moovit.app.intro.login.FirstTimeLoginActivity;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.taxi.MVSourceFeature;
import i00.C17522a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p471eq.C16850a;
import p906wz.C20431c;
import p906wz.C20436g;
import z90.C13346d;
import z90.C13347e;
import z90.C13352j;
import z90.C13353k;

/* renamed from: st.e */
public class C19530e extends C15682c<FirstTimeLoginActivity> {

    /* renamed from: v */
    public static final /* synthetic */ int f49634v = 0;

    /* renamed from: n */
    public final C19531a f49635n = new C19531a();

    /* renamed from: o */
    public final C19532b f49636o = new C19532b();

    /* renamed from: p */
    public final C19533c f49637p = new C19533c();

    /* renamed from: q */
    public String f49638q;

    /* renamed from: r */
    public EditText f49639r;

    /* renamed from: s */
    public ProgressBar f49640s;

    /* renamed from: t */
    public FormatTextView f49641t;

    /* renamed from: u */
    public Button f49642u;

    /* renamed from: st.e$a */
    public class C19531a extends C21211f {
        public C19531a() {
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C13352j jVar = (C13352j) cVar;
            C19530e.m46895m2(C19530e.this);
            C19530e eVar = C19530e.this;
            eVar.mo46795h2(C13751d.m34341b(eVar.requireContext(), (String) null, serverException));
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C13352j jVar = (C13352j) cVar;
            C19530e.m46895m2(C19530e.this);
            C19530e eVar = C19530e.this;
            eVar.mo46795h2(C13751d.m34341b(eVar.requireContext(), (String) null, iOException));
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C13352j jVar = (C13352j) cVar;
            C19530e.m46895m2(C19530e.this);
            C19530e eVar = C19530e.this;
            eVar.mo46795h2(C13751d.m34341b(eVar.requireContext(), (String) null, iOException));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13352j jVar = (C13352j) cVar;
            C13353k kVar = (C13353k) gVar;
            C19530e eVar = C19530e.this;
            int i = C19530e.f49634v;
            eVar.mo51892o2();
        }
    }

    /* renamed from: st.e$b */
    public class C19532b extends C21211f {
        public C19532b() {
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C13346d dVar = (C13346d) cVar;
            if (!(serverException instanceof UserRequestError)) {
                return false;
            }
            C19530e eVar = C19530e.this;
            eVar.mo46795h2(C13751d.m34341b(eVar.requireContext(), (String) null, serverException));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13346d dVar = (C13346d) cVar;
            C13347e eVar = (C13347e) gVar;
            FirstTimeLoginActivity firstTimeLoginActivity = (FirstTimeLoginActivity) C19530e.this.f40822c;
            if (firstTimeLoginActivity == null) {
                return;
            }
            if (eVar.f33136m) {
                firstTimeLoginActivity.mo45257D2();
                return;
            }
            FragmentManager supportFragmentManager = firstTimeLoginActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            supportFragmentManager.mo3975s(new FragmentManager.C0899o("PHONE_VERIFICATION", -1, 1), false);
            C0909a aVar = new C0909a(supportFragmentManager);
            int i = C19523a.f49621t;
            Bundle bundle = new Bundle();
            C19523a aVar2 = new C19523a();
            aVar2.setArguments(bundle);
            aVar.mo4111f(R.id.fragment_container, aVar2, "PERSONAL_DETAILS");
            aVar.mo4040d();
        }
    }

    /* renamed from: st.e$c */
    public class C19533c extends CountDownTimer {
        public C19533c() {
            super(60000, 1000);
        }

        public final void onFinish() {
            C19530e.m46895m2(C19530e.this);
        }

        public final void onTick(long j) {
            C19530e.this.f49641t.setArguments(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
        }
    }

    /* renamed from: st.e$d */
    public class C19534d extends C17522a {
        public C19534d() {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null && editable.length() == 4) {
                C19530e eVar = C19530e.this;
                String obj = editable.toString();
                int i = C19530e.f49634v;
                eVar.mo51892o2();
                eVar.f49640s.setVisibility(0);
                UiUtils.m40238F(4, eVar.f49641t, eVar.f49642u);
                RequestOptions L1 = eVar.mo46777L1();
                L1.f42909f = true;
                eVar.mo46793f2("send_verification_code", new C13346d(eVar.mo46783R1(), obj, MVSourceFeature.RIDE_SHARING), L1, eVar.f49636o);
            }
        }
    }

    public C19530e() {
        super(FirstTimeLoginActivity.class);
    }

    /* renamed from: m2 */
    public static void m46895m2(C19530e eVar) {
        eVar.f49642u.setVisibility(0);
        UiUtils.m40238F(4, eVar.f49640s, eVar.f49641t);
    }

    /* renamed from: n2 */
    public final void mo51891n2() {
        this.f49640s.setVisibility(0);
        UiUtils.m40238F(4, this.f49641t, this.f49642u);
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        mo46793f2("send_phone_number", new C13352j(mo46783R1(), (String) null, this.f49638q), L1, this.f49635n);
    }

    /* renamed from: o2 */
    public final void mo51892o2() {
        this.f49637p.cancel();
        this.f49641t.setArguments(DateUtils.formatElapsedTime(60));
        this.f49641t.setVisibility(0);
        UiUtils.m40238F(4, this.f49640s, this.f49642u);
        this.f49637p.start();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49638q = mo46782Q1().getString("phoneNumber");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.first_time_login_phone_verification, viewGroup, false);
        ((FormatTextView) inflate.findViewById(R.id.title)).setArguments(this.f49638q);
        EditText editText = (EditText) inflate.findViewById(R.id.phone_verification_code);
        this.f49639r = editText;
        editText.addTextChangedListener(new C19534d());
        this.f49640s = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f49641t = (FormatTextView) inflate.findViewById(R.id.count_down);
        Button button = (Button) inflate.findViewById(R.id.resent_button);
        this.f49642u = button;
        button.setOnClickListener(new C16850a(this, 11));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UiUtils.m40239G(this.f49639r);
        mo51891n2();
    }
}
