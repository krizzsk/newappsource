package p926xv;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15676b;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceAlert;
import com.tranzmate.R;
import j80.C12778f;
import java.util.Collections;
import java.util.Set;
import p028ba.C1513g;
import p073e7.C4583a;
import p242s1.C6333d0;
import p297w5.C6996c;
import p455dy.C16753e;
import p824tp.C19731i;
import p977zz.C20941h;

/* renamed from: xv.k */
public class C20630k extends C15676b<MoovitAppActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f52155o = 0;

    /* renamed from: h */
    public C12778f f52156h;

    /* renamed from: i */
    public ServerId f52157i;

    /* renamed from: j */
    public String f52158j;

    /* renamed from: k */
    public ServiceAlert f52159k;

    /* renamed from: l */
    public View f52160l;

    /* renamed from: m */
    public ListItemView f52161m;

    /* renamed from: n */
    public TextView f52162n;

    /* renamed from: xv.k$a */
    public interface C20631a {
        /* renamed from: q */
        void mo45423q(String str);
    }

    public C20630k() {
        super(MoovitAppActivity.class);
        setStyle(0, 2131952793);
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return Collections.singleton("USER_ACCOUNT");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        mo52815S1();
    }

    /* renamed from: S1 */
    public final void mo52815S1() {
        View view = getView();
        ServiceAlert serviceAlert = this.f52159k;
        if (view != null && this.f40795f.mo44593a() && serviceAlert != null) {
            ListItemView listItemView = (ListItemView) view.findViewById(R.id.favorite_action);
            C16753e d = ((UserAccountManager) mo46750H1("USER_ACCOUNT")).mo46573d();
            ServerId serverId = this.f52157i;
            if (serverId == null || d.mo49441p(serverId) || !serviceAlert.mo23925b(this.f52157i)) {
                listItemView.setVisibility(8);
                return;
            }
            C6333d0.m15032t(listItemView, C20941h.m49044g(R.attr.colorSurfaceInfo, view.getContext()));
            listItemView.setOnCheckedChangeListener(new C20629j(this, d, serviceAlert));
            listItemView.setVisibility(0);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52156h = C19731i.m47197a(this.f40792c).f50174d;
        Bundle K1 = mo46752K1();
        this.f52157i = (ServerId) K1.getParcelable("lineGroupId");
        String string = K1.getString("alertId");
        this.f52158j = string;
        if (string == null) {
            throw new ApplicationBugException("Did you use ServiceAlertPreviewDialogFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.service_alert_preview_dialog_fragment, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f52156h.mo39623c(this.f52158j).mo49544c(Long.valueOf(System.currentTimeMillis()));
        mo46753L1(C20631a.class, new C1513g(this, 6));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52160l = view.findViewById(R.id.status_color_badge);
        ListItemView listItemView = (ListItemView) view.findViewById(R.id.status);
        this.f52161m = listItemView;
        listItemView.getAccessoryView().setOnClickListener(new C4583a(this, 24));
        this.f52162n = (TextView) view.findViewById(R.id.preview);
        view.findViewById(R.id.action_read).setOnClickListener(new C6996c(this, 28));
        A a = this.f40792c;
        C12778f fVar = this.f52156h;
        String str = this.f52158j;
        fVar.getClass();
        Tasks.call(MoovitExecutors.f37327IO, new C12778f.C12781c(str)).addOnCompleteListener((Activity) a, new C20628i(this, 0));
    }
}
