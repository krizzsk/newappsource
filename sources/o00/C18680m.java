package o00;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.appboy.models.MessageButton;
import p622kz.C18162d;

/* renamed from: o00.m */
public final class C18680m extends C18671h {

    /* renamed from: h */
    public final CharSequence f47557h;

    public C18680m(int i, String str) {
        super(i);
        C21100e.m49373x(str, MessageButton.TEXT);
        this.f47557h = str;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        ((TextView) a0Var.itemView.findViewById(C18162d.text)).setText(this.f47557h);
    }
}
