package p976zy;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import m80.C12873i;
import p977zz.C20949l;
import z80.C13338a;

/* renamed from: zy.b */
public final /* synthetic */ class C20921b implements SuccessContinuation, C20949l {

    /* renamed from: b */
    public final /* synthetic */ boolean f52670b;

    public /* synthetic */ C20921b(boolean z) {
        this.f52670b = z;
    }

    public final boolean invoke(Object obj) {
        boolean z = this.f52670b;
        PurchaseSplitActivity purchaseSplitActivity = (PurchaseSplitActivity) obj;
        int i = C13338a.f33117x;
        if (z) {
            purchaseSplitActivity.mo24048y2("primary_edit_cc_tag", C12873i.payment_split_method_1_title, C12873i.payment_split_extra_card_subtitle, true);
        } else {
            purchaseSplitActivity.mo24048y2("secondary_edit_cc_tag", C12873i.payment_split_method_2_title, C12873i.payment_split_extra_card_subtitle, false);
        }
        return true;
    }

    public final Task then(Object obj) {
        boolean z = this.f52670b;
        FirebaseUser firebaseUser = (FirebaseUser) obj;
        if (firebaseUser != null) {
            return FirebaseAuth.getInstance(firebaseUser.mo43284n2()).mo43272e(firebaseUser, z);
        }
        return Tasks.forResult(null);
    }
}
