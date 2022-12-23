package ga0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.moovit.MoovitActivity;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19747y;

@Deprecated
/* renamed from: ga0.i */
public class C12709i extends Dialog {

    /* renamed from: b */
    public static final C12708h f31386b = new C12708h();

    public C12709i(MoovitActivity moovitActivity, int i, int i2) {
        super(moovitActivity, i);
        requestWindowFeature(1);
        setContentView(i2);
        mo39503d();
    }

    /* renamed from: a */
    public final void mo39500a(int i, int i2, CharSequence charSequence, int i3, DialogInterface.OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(i);
        if (charSequence == null) {
            charSequence = getContext().getText(i3);
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
        textView.setOnClickListener(new C12707g(this, onClickListener, i2));
        mo39503d();
    }

    /* renamed from: b */
    public final void mo39501b(View view) {
        FrameLayout frameLayout = (FrameLayout) findViewById(C19740r.content);
        frameLayout.removeAllViews();
        if (view == null) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.addView(view);
        frameLayout.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo39502c(CharSequence charSequence) {
        int i;
        TextView textView = (TextView) findViewById(C19740r.message);
        textView.setText(charSequence);
        if (charSequence == null) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        View findViewById = findViewById(C19740r.message_container);
        if (findViewById != null) {
            findViewById.setVisibility(textView.getVisibility());
        }
    }

    /* renamed from: d */
    public final void mo39503d() {
        boolean z;
        ViewGroup viewGroup = (ViewGroup) findViewById(C19740r.buttons);
        int childCount = viewGroup.getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                z = false;
                break;
            } else if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = (TextView) findViewById(C19740r.title);
        textView.setText(charSequence);
        textView.setVisibility(charSequence == null ? 8 : 0);
    }

    public C12709i(MoovitActivity moovitActivity) {
        this(moovitActivity, C19747y.ThemeOverlay_Moovit_Dialog, C19742t.std_dialog);
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }
}
