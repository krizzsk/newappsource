package z00;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.design.view.AlertMessageView;
import o00.C18671h;
import p073e7.C4584b;
import p739px.C19037a;
import w00.C20264e;

/* renamed from: z00.a */
public final class C20795a extends C18671h {

    /* renamed from: h */
    public final Drawable f52484h;

    /* renamed from: i */
    public final CharSequence f52485i;

    /* renamed from: j */
    public final CharSequence f52486j;

    /* renamed from: k */
    public final CharSequence f52487k = null;

    /* renamed from: l */
    public final CharSequence f52488l = null;

    public C20795a(Drawable drawable, CharSequence charSequence, CharSequence charSequence2) {
        super(C20264e.recyler_alert_message_view);
        this.f52484h = drawable;
        this.f52485i = charSequence;
        this.f52486j = charSequence2;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        AlertMessageView alertMessageView = (AlertMessageView) a0Var.itemView;
        alertMessageView.setImage(this.f52484h);
        alertMessageView.setTitle(this.f52485i);
        alertMessageView.setSubtitle(this.f52486j);
        alertMessageView.setPositiveButton(this.f52487k);
        alertMessageView.setNegativeButton(this.f52488l);
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        AlertMessageView alertMessageView = (AlertMessageView) onCreateViewHolder.itemView;
        alertMessageView.setPositiveButtonClickListener(new C4584b(this, 27));
        alertMessageView.setNegativeButtonClickListener(new C19037a(this, 3));
        return onCreateViewHolder;
    }
}
