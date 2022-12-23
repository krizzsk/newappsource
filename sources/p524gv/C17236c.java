package p524gv;

import android.view.KeyEvent;
import android.widget.TextView;
import com.appboy.support.ValidationUtils;

/* renamed from: gv.c */
public final class C17236c implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ C17237d f44557b;

    public C17236c(C17237d dVar) {
        this.f44557b = dVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if ((i & ValidationUtils.APPBOY_STRING_MAX_LENGTH) != 6) {
            return false;
        }
        C17237d dVar = this.f44557b;
        int i2 = C17237d.f44558r;
        dVar.mo49797n2();
        return false;
    }
}
