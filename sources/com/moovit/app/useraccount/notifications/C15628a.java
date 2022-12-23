package com.moovit.app.useraccount.notifications;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.format.DateUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import ja0.C12797f;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p503fy.C17125a;
import p574iy.C17678a;
import p977zz.C20941h;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.useraccount.notifications.a */
public final class C15628a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C17125a f40626g;

    /* renamed from: h */
    public final ArrayList f40627h = new ArrayList();

    /* renamed from: i */
    public C15629a f40628i = null;

    /* renamed from: com.moovit.app.useraccount.notifications.a$a */
    public interface C15629a {
    }

    public C15628a(C17125a aVar) {
        C21100e.m49373x(aVar, "unm");
        this.f40626g = aVar;
    }

    public final int getItemCount() {
        return this.f40627h.size();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        boolean z;
        CharSequence charSequence;
        C12797f fVar = (C12797f) a0Var;
        GcmNotification gcmNotification = (GcmNotification) this.f40627h.get(i);
        C17125a aVar = this.f40626g;
        aVar.getClass();
        C21100e.m49373x(gcmNotification, "notification");
        boolean contains = aVar.f44338d.mo49719d().contains(gcmNotification.f41524g.f41546b);
        fVar.mo39639f(R.id.badge).setEnabled(!contains);
        TextView textView = (TextView) fVar.mo39639f(R.id.title);
        textView.setText(gcmNotification.f41519b);
        String str = C20964s0.f52718a;
        int j = C20941h.m49047j(R.attr.textAppearanceBody, textView.getContext());
        if (j != 0) {
            C0801k.m2424f(textView, j);
        }
        if (!contains) {
            i2 = R.attr.colorOnSurfaceEmphasisHigh;
        } else {
            i2 = R.attr.colorOnSurface;
        }
        ColorStateList g = C20941h.m49044g(i2, textView.getContext());
        if (g != null) {
            textView.setTextColor(g);
        }
        UiUtils.m40234B((TextView) fVar.mo39639f(R.id.subtitle), gcmNotification.f41520c);
        TextView textView2 = (TextView) fVar.mo39639f(R.id.time);
        Context context = fVar.itemView.getContext();
        long j2 = gcmNotification.f41523f;
        SimpleDateFormat simpleDateFormat = C7925b.f23934a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        if (currentTimeMillis >= j2 && currentTimeMillis - j2 <= 3600000) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            charSequence = DateUtils.getRelativeTimeSpanString(j2, System.currentTimeMillis(), 60000, SQLiteDatabase.OPEN_PRIVATECACHE);
        } else if (DateUtils.isToday(j2)) {
            charSequence = DateUtils.getRelativeTimeSpanString(context, j2);
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 >= j2 && currentTimeMillis2 - j2 <= 604800000) {
                z2 = true;
            }
            if (z2) {
                charSequence = DateUtils.formatDateRange(context, j2, j2, 2);
            } else {
                charSequence = DateUtils.formatDateRange(context, j2, j2, 98330);
            }
        }
        textView2.setText(charSequence);
        fVar.itemView.setOnClickListener(new C17678a(this, i, gcmNotification));
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, R.layout.user_notification_layout, viewGroup, false));
    }
}
