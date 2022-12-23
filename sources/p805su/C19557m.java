package p805su;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnFailureListener;
import j80.C12773b;
import p926xv.C20622c;

/* renamed from: su.m */
public final /* synthetic */ class C19557m implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f49708b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f49709c;

    /* renamed from: d */
    public final /* synthetic */ View f49710d;

    public /* synthetic */ C19557m(Fragment fragment, View view, int i) {
        this.f49708b = i;
        this.f49709c = fragment;
        this.f49710d = view;
    }

    public final void onFailure(Exception exc) {
        switch (this.f49708b) {
            case 0:
                int i = C19560p.f49719q;
                ((C19560p) this.f49709c).mo51909q2((RecyclerView) this.f49710d);
                return;
            default:
                C20622c cVar = (C20622c) this.f49709c;
                cVar.mo52812S1(this.f49710d, cVar.f52135h, (C12773b) null);
                return;
        }
    }
}
