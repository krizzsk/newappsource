package p853uu;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.MoovitActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.util.StyledText;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.List;
import java.util.UUID;
import l30.C5597z;
import p001a0.C0017h;
import p233r5.C6253a;
import p373au.C13536h;
import p397bu.C13690h;
import p977zz.C20944i0;
import s30.C6452b;

/* renamed from: uu.b */
public final /* synthetic */ class C19992b implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f50828b;

    /* renamed from: c */
    public final /* synthetic */ Object f50829c;

    /* renamed from: d */
    public final /* synthetic */ Object f50830d;

    /* renamed from: e */
    public final /* synthetic */ Object f50831e;

    public /* synthetic */ C19992b(int i, Object obj, Object obj2, Object obj3) {
        this.f50828b = i;
        this.f50831e = obj;
        this.f50829c = obj2;
        this.f50830d = obj3;
    }

    public final void onSuccess(Object obj) {
        Fragment fragment;
        MotActivationStationInfo motActivationStationInfo;
        String str;
        switch (this.f50828b) {
            case 0:
                MotQrCodeViewerActivity motQrCodeViewerActivity = (MotQrCodeViewerActivity) this.f50831e;
                String str2 = (String) this.f50829c;
                ServerId serverId = (ServerId) this.f50830d;
                int i = MotQrCodeViewerActivity.f39075X;
                motQrCodeViewerActivity.getClass();
                MotActivation motActivation = (MotActivation) C13717b.m34256c((List) obj);
                if (motActivation == null) {
                    motQrCodeViewerActivity.finish();
                    return;
                }
                FragmentManager supportFragmentManager = motQrCodeViewerActivity.getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                int i2 = MotQrCodeViewerActivity.C15171a.f39077a[motActivation.f38994k.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    int i3 = C19995e.f50836p;
                    Bundle bundle = new Bundle();
                    bundle.putString("price_reference", str2);
                    bundle.putParcelable("activation_id", serverId);
                    fragment = new C19995e();
                    fragment.setArguments(bundle);
                } else if (i2 == 3) {
                    int i4 = C20000j.f50847n;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("priceReference", str2);
                    bundle2.putParcelable("activationId", serverId);
                    fragment = new C20000j();
                    fragment.setArguments(bundle2);
                } else {
                    StringBuilder k = C13555b.m33972k("Unknown activation type: ");
                    k.append(motActivation.f38994k);
                    throw new IllegalStateException(k.toString());
                }
                K.mo4111f(R.id.fragments_container, fragment, (String) null);
                K.mo4040d();
                return;
            case 1:
                C19998h hVar = (C19998h) this.f50831e;
                String str3 = (String) this.f50829c;
                ServerId serverId2 = (ServerId) this.f50830d;
                List list = (List) obj;
                int i5 = C19998h.f50842n;
                A a = hVar.f40822c;
                if (a != null) {
                    View view = hVar.getView();
                    MotActivation motActivation2 = (MotActivation) C13717b.m34256c(list);
                    if (view != null && motActivation2 != null && (motActivationStationInfo = motActivation2.f38997n) != null) {
                        TransitStop transitStop = motActivationStationInfo.f39021b.get();
                        String l = C7925b.m18024l(a, motActivation2.f38998o);
                        TextView textView = (TextView) view.findViewById(R.id.info);
                        if (transitStop != null) {
                            str = hVar.getString(R.string.payment_mot_create_qr_info, l, transitStop.f23731c);
                        } else {
                            str = hVar.getString(R.string.payment_mot_create_qr_time, l);
                        }
                        textView.setText(str);
                        view.findViewById(R.id.create_qr_card_view).setOnClickListener(new C13536h(2, hVar, list));
                        view.findViewById(R.id.show_qr_code_button).setOnClickListener(new C13690h(2, hVar, str3, serverId2));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ListItemView listItemView = (ListItemView) this.f50831e;
                StyledText styledText = (StyledText) this.f50830d;
                CharSequence charSequence = (CharSequence) obj;
                if (((UUID) this.f50829c).equals(listItemView.getTag(C5597z.view_tag_param1))) {
                    listItemView.setAccessoryText(charSequence);
                    View accessoryView = listItemView.getAccessoryView();
                    if (accessoryView != null) {
                        accessoryView.setContentDescription(styledText.f23873e);
                        return;
                    }
                    return;
                }
                return;
            default:
                C6452b bVar = (C6452b) this.f50831e;
                ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView = (ImageOrTextSubtitleListItemView) this.f50829c;
                C20944i0 i0Var = (C20944i0) obj;
                int i6 = C6452b.f20158y;
                bVar.getClass();
                LocationDescriptor locationDescriptor = (LocationDescriptor) i0Var.f52692a;
                imageOrTextSubtitleListItemView.setTitle((CharSequence) locationDescriptor.f23651f);
                imageOrTextSubtitleListItemView.setSubtitleItems((List) i0Var.f52693b);
                imageOrTextSubtitleListItemView.setOnClickListener(new C6253a(3, bVar, locationDescriptor, (MoovitActivity) this.f50830d));
                imageOrTextSubtitleListItemView.setVisibility(0);
                return;
        }
    }
}
