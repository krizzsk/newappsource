package androidx.fragment.app;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Writer;

/* renamed from: androidx.fragment.app.r0 */
public final class C0964r0 extends Writer {

    /* renamed from: b */
    public StringBuilder f3847b = new StringBuilder(RecyclerView.C1119a0.FLAG_IGNORE);

    public final void close() {
        mo4187e();
    }

    /* renamed from: e */
    public final void mo4187e() {
        if (this.f3847b.length() > 0) {
            this.f3847b.toString();
            StringBuilder sb = this.f3847b;
            sb.delete(0, sb.length());
        }
    }

    public final void flush() {
        mo4187e();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo4187e();
            } else {
                this.f3847b.append(c);
            }
        }
    }
}
