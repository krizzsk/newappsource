package g30;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.moovit.C14688a;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.request.MetroRevisionMismatchException;
import java.util.ArrayList;
import java.util.HashSet;
import p435de.C16596f;
import p646lz.C18299a;
import p824tp.C19742t;
import p824tp.C19747y;

/* renamed from: g30.l */
public class C4780l extends C15676b<MoovitActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f16147n = 0;

    /* renamed from: h */
    public final C4781a f16148h = new C4781a();

    /* renamed from: i */
    public ServerId f16149i;

    /* renamed from: j */
    public long f16150j;

    /* renamed from: k */
    public C18299a f16151k;

    /* renamed from: l */
    public C14688a f16152l;

    /* renamed from: m */
    public C4782b f16153m;

    /* renamed from: g30.l$a */
    public class C4781a implements C14688a.C14690b {
        public C4781a() {
        }

        /* renamed from: a */
        public final void mo20300a() {
            C4780l.this.dismissAllowingStateLoss();
        }

        /* renamed from: c */
        public final void mo20301c(Object obj, String str) {
            C4780l.this.dismissAllowingStateLoss();
        }

        /* renamed from: d */
        public final void mo20302d(Object obj, String str) {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: g30.l$b */
    public class C4782b extends AsyncTask<Context, Void, Boolean> {
        public C4782b() {
        }

        public final Object doInBackground(Object[] objArr) {
            try {
                Context context = ((Context[]) objArr)[0];
                C4780l lVar = C4780l.this;
                C4789q.m12123e(context, lVar.f16149i, lVar.f16150j);
                return Boolean.TRUE;
            } catch (Exception e) {
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("metro id: ");
                k.append(C4780l.this.f16149i);
                a.mo49363b(k.toString());
                a.mo49363b("metro revision: " + C4780l.this.f16150j);
                a.mo49364c(new ApplicationBugException("Metro revision mismatch loading dialog failure", e));
                return Boolean.FALSE;
            }
        }

        public final void onPostExecute(Object obj) {
            C14688a aVar;
            Boolean bool = (Boolean) obj;
            if (!isCancelled()) {
                if (!Boolean.TRUE.equals(bool) || (aVar = C4780l.this.f16152l) == null || aVar.mo44597e()) {
                    C4780l.this.dismissAllowingStateLoss();
                }
            }
        }
    }

    public C4780l() {
        super(MoovitActivity.class);
        setStyle(0, C19747y.ThemeOverlay_Moovit_Dialog_Bottom);
        setCancelable(false);
    }

    /* renamed from: S1 */
    public static void m12112S1(FragmentManager fragmentManager, MetroRevisionMismatchException metroRevisionMismatchException, HashSet hashSet) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("metroId", metroRevisionMismatchException.mo49154b());
        bundle.putLong("metroRevision", metroRevisionMismatchException.mo49153a());
        bundle.putStringArrayList("preLoadDataParts", C13717b.m34264k(hashSet));
        C4780l lVar = new C4780l();
        lVar.setArguments(bundle);
        lVar.show(fragmentManager, "metro_updated_loading_dialog_tag");
        fragmentManager.mo3981x();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f16149i = (ServerId) K1.getParcelable("metroId");
        long j = K1.getLong("metroRevision", -1);
        this.f16150j = j;
        if (this.f16149i == null || j == -1) {
            dismissAllowingStateLoss();
            return;
        }
        ArrayList<String> stringArrayList = K1.getStringArrayList("preLoadDataParts");
        if (!C13717b.m34258e(stringArrayList)) {
            C18299a aVar = new C18299a(MoovitApplication.f37317k.f37321e);
            this.f16151k = aVar;
            this.f16152l = new C14688a(aVar, new HashSet(stringArrayList), this.f16148h);
        }
        C4782b bVar = new C4782b();
        this.f16153m = bVar;
        bVar.execute(new Context[]{getContext()});
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.metro_rev_mismatch_loading_layout, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        C4782b bVar = this.f16153m;
        if (bVar != null) {
            bVar.cancel(false);
            this.f16153m = null;
        }
        this.f16152l.mo44596d();
        this.f16152l = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        A a = this.f40792c;
        if (a != null && a.f37313z) {
            MoovitApplication.f37317k.mo44571s((Intent) null, a, this.f16151k);
        }
        super.onDismiss(dialogInterface);
    }
}
