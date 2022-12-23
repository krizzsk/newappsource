package m30;

import android.widget.Toast;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.MoovitActivity;
import com.moovit.search.SearchLocationActivity;
import p824tp.C19746x;
import z70.C13321a;

/* renamed from: m30.a */
public final /* synthetic */ class C5678a implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f18457b;

    /* renamed from: c */
    public final /* synthetic */ Object f18458c;

    /* renamed from: d */
    public final /* synthetic */ Object f18459d;

    public /* synthetic */ C5678a(int i, Object obj, Object obj2) {
        this.f18457b = i;
        this.f18458c = obj;
        this.f18459d = obj2;
    }

    public final void onFailure(Exception exc) {
        switch (this.f18457b) {
            case 0:
                C5679b bVar = (C5679b) this.f18458c;
                int i = C5679b.f18460q;
                bVar.getClass();
                bVar.mo46795h2(C13751d.m34341b((MoovitActivity) this.f18459d, (String) null, exc));
                return;
            default:
                SearchLocationActivity searchLocationActivity = (SearchLocationActivity) this.f18458c;
                int i2 = SearchLocationActivity.f23120s0;
                searchLocationActivity.getClass();
                String str = ((C13321a) this.f18459d).f33070b;
                Toast.makeText(searchLocationActivity, C19746x.response_read_error_message, 1).show();
                return;
        }
    }
}
