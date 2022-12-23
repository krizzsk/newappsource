package p293w1;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.C0387b1;

/* renamed from: w1.b */
public final class C6966b extends Filter {

    /* renamed from: a */
    public C6967a f21728a;

    /* renamed from: w1.b$a */
    public interface C6967a {
    }

    public C6966b(C6967a aVar) {
        this.f21728a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return ((C0387b1) this.f21728a).mo2043c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            w1.b$a r0 = r3.f21728a
            androidx.appcompat.widget.b1 r0 = (androidx.appcompat.widget.C0387b1) r0
            if (r4 != 0) goto L_0x0009
            java.lang.String r4 = ""
            goto L_0x0010
        L_0x0009:
            r0.getClass()
            java.lang.String r4 = r4.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.f1442l
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x002f
            androidx.appcompat.widget.SearchView r1 = r0.f1442l
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0022
            goto L_0x002f
        L_0x0022:
            android.app.SearchableInfo r1 = r0.f1443m     // Catch:{ RuntimeException -> 0x002e }
            android.database.Cursor r4 = r0.mo2049h(r1, r4)     // Catch:{ RuntimeException -> 0x002e }
            if (r4 == 0) goto L_0x002f
            r4.getCount()     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x0030
        L_0x002e:
        L_0x002f:
            r4 = r2
        L_0x0030:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r4 == 0) goto L_0x0040
            int r1 = r4.getCount()
            r0.count = r1
            r0.values = r4
            goto L_0x0045
        L_0x0040:
            r4 = 0
            r0.count = r4
            r0.values = r2
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p293w1.C6966b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C6967a aVar = this.f21728a;
        Cursor cursor = ((C6963a) aVar).f21721d;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((C0387b1) aVar).mo2042b((Cursor) obj);
        }
    }
}
