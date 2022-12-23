package g50;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import p761qy.C19201a;
import v40.C25751f;

/* renamed from: g50.f */
public final class C25732f extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C19201a f64167g = new C19201a(this, 9);

    /* renamed from: h */
    public final List<PaymentProfile> f64168h;

    /* renamed from: i */
    public final C25733a f64169i;

    /* renamed from: g50.f$a */
    public interface C25733a {
    }

    public C25732f(ArrayList arrayList, C25730d dVar) {
        C21100e.m49373x(arrayList, "profiles");
        this.f64168h = arrayList;
        this.f64169i = dVar;
    }

    public final int getItemCount() {
        return this.f64168h.size();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        PaymentProfile paymentProfile = this.f64168h.get(i);
        ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
        listItemView.setOnClickListener(this.f64167g);
        listItemView.setTitle((CharSequence) paymentProfile.f42829c);
        listItemView.setSubtitle((CharSequence) paymentProfile.f42834h);
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12797f fVar = new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.payment_account_add_profile_list_item, viewGroup, false));
        fVar.itemView.setTag(fVar);
        return fVar;
    }
}
