package d20;

import android.view.KeyEvent;
import android.widget.TextView;
import com.moovit.inputfields.TextInputFieldView;
import p977zz.C20935e;

/* renamed from: d20.b */
public final /* synthetic */ class C16534b implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ TextInputFieldView f43160b;

    /* renamed from: c */
    public final /* synthetic */ int f43161c;

    /* renamed from: d */
    public final /* synthetic */ C20935e f43162d;

    public /* synthetic */ C16534b(TextInputFieldView textInputFieldView, int i, C20935e eVar) {
        this.f43160b = textInputFieldView;
        this.f43161c = i;
        this.f43162d = eVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        TextInputFieldView textInputFieldView = this.f43160b;
        int i2 = this.f43161c;
        C20935e eVar = this.f43162d;
        int i3 = TextInputFieldView.f41839a1;
        textInputFieldView.getClass();
        if (i != i2) {
            return false;
        }
        eVar.invoke(textInputFieldView);
        return false;
    }
}
