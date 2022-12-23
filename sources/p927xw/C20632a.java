package p927xw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import p572iw.C17662e;

/* renamed from: xw.a */
public class C20632a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f52163h = 0;

    public C20632a() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public static C20632a m48506S1(String str, int i, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("errorCode", i);
        bundle.putString("title", str);
        bundle.putString("subtitle", str2);
        bundle.putBoolean("fromTodBookingOrderFlow", z);
        C20632a aVar = new C20632a();
        aVar.setArguments(bundle);
        return aVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.tod_error_message_dialog_fragment, viewGroup, false);
        Bundle arguments = getArguments();
        int i3 = -1;
        if (arguments != null) {
            i3 = arguments.getInt("errorCode", -1);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image);
        if (3 == i3) {
            i = R.drawable.img_u_turn;
        } else {
            i = R.drawable.img_empty_warning;
        }
        imageView.setImageResource(i);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle);
        if (arguments != null) {
            UiUtils.m40234B(textView, arguments.getString("title"));
            UiUtils.m40234B(textView2, arguments.getString("subtitle"));
        } else {
            UiUtils.m40233A(textView, R.string.general_error_title);
            UiUtils.m40233A(textView2, R.string.general_error_description);
        }
        Button button = (Button) inflate.findViewById(R.id.button);
        button.setOnClickListener(new C17662e(this, 1));
        if (arguments != null && arguments.getBoolean("fromTodBookingOrderFlow")) {
            z = true;
        }
        if (z) {
            i2 = R.string.tod_passenger_order_error_action_back;
        } else if (3 == i3) {
            i2 = R.string.action_retry;
        } else {
            i2 = R.string.action_cancel;
        }
        button.setText(i2);
        return inflate;
    }
}
