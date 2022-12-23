package r60;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: r60.f */
public final class C19241f extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ Intent f48868b;

    /* renamed from: c */
    public final /* synthetic */ C19234e f48869c;

    public C19241f(C19234e eVar, Intent intent) {
        this.f48869c = eVar;
        this.f48868b = intent;
    }

    public final void onClick(View view) {
        this.f48869c.startActivity(this.f48868b);
    }
}
