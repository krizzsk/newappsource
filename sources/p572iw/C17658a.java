package p572iw;

import a00.C13382a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.app.suggestedroutes.TimeQuickAction;
import com.tranzmate.R;
import java.util.List;
import m00.C18310d;

/* renamed from: iw.a */
public final class C17658a extends C18310d<TimeQuickAction, TextView, Void> {
    public C17658a(Context context, List<TimeQuickAction> list) {
        super(context, R.layout.spinner_text_item_dropdown, list);
    }

    /* renamed from: d */
    public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        TimeQuickAction timeQuickAction = (TimeQuickAction) obj;
        textView.setText(timeQuickAction.textResId);
        if (timeQuickAction.contentDescriptionResId != 0) {
            C13382a.m33674j(textView, textView.getText(), this.f46688b.getString(timeQuickAction.contentDescriptionResId));
            return;
        }
        textView.setContentDescription((CharSequence) null);
    }
}
