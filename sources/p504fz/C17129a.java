package p504fz;

import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import p552hz.C17520c;

/* renamed from: fz.a */
public final /* synthetic */ class C17129a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f44351b;

    /* renamed from: c */
    public final /* synthetic */ TextView f44352c;

    public /* synthetic */ C17129a(TextView textView, int i) {
        this.f44351b = i;
        this.f44352c = textView;
    }

    public final void onSuccess(Object obj) {
        switch (this.f44351b) {
            case 0:
                TextView textView = this.f44352c;
                String str = (String) obj;
                int i = C17131c.f44358w;
                if (str != null) {
                    textView.setText(str);
                    return;
                }
                return;
            default:
                TextView textView2 = this.f44352c;
                String str2 = (String) obj;
                int i2 = C17520c.f45103w;
                if (str2 != null) {
                    textView2.setText(str2);
                    return;
                }
                return;
        }
    }
}
