package p448dr;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.moovit.app.ataf.AtafTicketsActivity;
import com.tranzmate.R;
import java.util.Collections;
import p977zz.C20927a0;

/* renamed from: dr.a */
public final /* synthetic */ class C16696a implements View.OnClickListener {
    public final void onClick(View view) {
        int i = C16697b.f43487n;
        Context context = view.getContext();
        if (AtafTicketsActivity.f37610U.mo19759a(context.getSharedPreferences("ataf_tickets", 0)).booleanValue()) {
            context.startActivity(C20927a0.m49013h(context.getString(R.string.ataf), Collections.singletonList(context.getString(R.string.ataf_phone_number))));
            return;
        }
        context.startActivity(new Intent(context, AtafTicketsActivity.class));
    }
}
