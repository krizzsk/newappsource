package p472er;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tranzmate.R;
import o00.C18671h;
import p297w5.C6994a;
import p977zz.C20935e;

/* renamed from: er.a */
public final class C16857a extends C18671h {

    /* renamed from: h */
    public final /* synthetic */ C20935e f43863h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16857a(int[] iArr, C16864f fVar) {
        super(iArr);
        this.f43863h = fVar;
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        onCreateViewHolder.itemView.findViewById(R.id.error_view).setOnClickListener(new C6994a(this.f43863h, 2));
        return onCreateViewHolder;
    }
}
