package p757qu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotActivation;
import com.tranzmate.R;
import p073e7.C4585c;
import p242s1.C6333d0;
import p310x5.C7158c;
import p543hq.C17474b;

/* renamed from: qu.a */
public class C19177a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f48763h = 0;

    /* renamed from: qu.a$a */
    public static /* synthetic */ class C19178a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48764a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.mot.model.MotActivation$ActivationType[] r0 = com.moovit.app.mot.model.MotActivation.ActivationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48764a = r0
                com.moovit.app.mot.model.MotActivation$ActivationType r1 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_AND_EXIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f48764a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.mot.model.MotActivation$ActivationType r1 = com.moovit.app.mot.model.MotActivation.ActivationType.DEPARTURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f48764a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.mot.model.MotActivation$ActivationType r1 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p757qu.C19177a.C19178a.<clinit>():void");
        }
    }

    public C19177a() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_existing_ride_explanation_dialog, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_active_ride_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onViewCreated(view, bundle);
        MotActivation.ActivationType activationType = (MotActivation.ActivationType) mo46752K1().getParcelable("activationType");
        int[] iArr = C19178a.f48764a;
        if (iArr[activationType.ordinal()] != 1) {
            i = R.string.payment_mot_newride_popup_title;
        } else {
            i = R.string.payment_mot_newride_train_popup_title;
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(i);
        C6333d0.m15030r(textView, true);
        if (iArr[activationType.ordinal()] != 1) {
            i2 = R.string.payment_mot_newride_popup_subtitle;
        } else {
            i2 = R.string.payment_mot_newride_train_popup_subtitle;
        }
        ((TextView) view.findViewById(R.id.subtitle)).setText(i2);
        Button button = (Button) view.findViewById(R.id.primary_button);
        if (iArr[activationType.ordinal()] != 1) {
            i3 = R.string.payment_mot_newride_popup_confirm;
        } else {
            i3 = R.string.payment_mot_newride_train_popup_end_button;
        }
        button.setText(i3);
        button.setOnClickListener(new C7158c(4, this, activationType));
        Button button2 = (Button) view.findViewById(R.id.secondary_button);
        button2.setText(R.string.action_cancel);
        button2.setOnClickListener(new C4585c(this, 17));
    }
}
