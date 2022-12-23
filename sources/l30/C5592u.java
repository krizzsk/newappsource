package l30;

import a00.C13382a;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C13717b;
import c00.C13723g;
import c70.C13751d;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.util.StyledText;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m80.C12868d;
import m80.C12869e;
import m80.C12873i;
import p310x5.C7156a;
import p310x5.C7157b;
import p310x5.C7158c;
import p310x5.C7159d;
import p373au.C13535g;
import p373au.C13536h;
import p451du.C16723t;
import p665mv.C18467c;
import p732pq.C18949j;
import p872vp.C20195b;
import p926xv.C20626g;
import p977zz.C20964s0;
import s90.C13076d;

/* renamed from: l30.u */
public final /* synthetic */ class C5592u implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f18323b;

    /* renamed from: c */
    public final /* synthetic */ Object f18324c;

    /* renamed from: d */
    public final /* synthetic */ Object f18325d;

    /* renamed from: e */
    public final /* synthetic */ Object f18326e;

    public /* synthetic */ C5592u(int i, Object obj, Object obj2, Object obj3) {
        this.f18323b = i;
        this.f18324c = obj;
        this.f18325d = obj2;
        this.f18326e = obj3;
    }

    public final void onSuccess(Object obj) {
        String str;
        int i = 0;
        switch (this.f18323b) {
            case 0:
                TextView textView = (TextView) this.f18324c;
                List<StyledText> list = (List) this.f18326e;
                CharSequence charSequence = (CharSequence) obj;
                if (((UUID) this.f18325d).equals(textView.getTag(C5597z.view_tag_param1))) {
                    textView.setText(charSequence);
                    CharSequence[] charSequenceArr = new CharSequence[1];
                    int i2 = C20195b.f51234b;
                    if (C13717b.m34258e(list)) {
                        str = "";
                    } else {
                        StringBuilder e = C13382a.m33669e();
                        for (StyledText styledText : list) {
                            String str2 = styledText.f23873e;
                            if (str2 == null) {
                                str2 = styledText.f23871c;
                            }
                            if (!C20964s0.m49090h(str2)) {
                                C13382a.m33666b(e, str2);
                            }
                        }
                        str = e.toString();
                    }
                    charSequenceArr[0] = str;
                    C13382a.m33674j(textView, charSequenceArr);
                    if (C20964s0.m49090h(charSequence)) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    return;
                }
                return;
            default:
                C7632a aVar = (C7632a) this.f18324c;
                View view = (View) this.f18325d;
                C13076d dVar = (C13076d) obj;
                int i3 = C7632a.f23237h;
                aVar.getClass();
                C7632a.m17440T1(view, false);
                Ticket ticket = (Ticket) C13723g.m34286g(dVar.f32346a, new C18949j((TicketId) this.f18326e, 6));
                if (ticket != null) {
                    C7755c cVar = ticket.f23487p;
                    if (cVar != null) {
                        if (C13717b.m34263j(Arrays.asList(new Ticket.Status[]{Ticket.Status.ACTIVE}), new C20626g(cVar, 1)) > 0) {
                            ((ImageView) view.findViewById(C12869e.activation_image)).setImageResource(C12868d.img_ticket_warning);
                            ((TextView) view.findViewById(C12869e.title)).setText(aVar.getString(C12873i.ticket_activation_same_ticket_error_title));
                            ((TextView) view.findViewById(C12869e.message)).setText(C12873i.ticket_activation_same_ticket_error_passbook_title);
                            Button button = (Button) view.findViewById(C12869e.confirm);
                            button.setText(C12873i.ticket_activation_same_ticket_error_yes_button);
                            button.setOnClickListener(new C13536h(5, aVar, ticket));
                            Button button2 = (Button) view.findViewById(C12869e.cancel);
                            button2.setText(C12873i.not_now_button);
                            button2.setOnClickListener(new C7156a(7, aVar, ticket));
                            aVar.mo23977V1("passbook_ticket_with_active", cVar, ticket.f23474c);
                            return;
                        }
                        ((ImageView) view.findViewById(C12869e.activation_image)).setImageResource(C12868d.img_ticket);
                        ((TextView) view.findViewById(C12869e.title)).setText(C12873i.ticket_activation_passbook_confirm_dialog_title);
                        ((TextView) view.findViewById(C12869e.message)).setText(aVar.getString(C12873i.ticket_activation_confirm_dialog_message));
                        Button button3 = (Button) view.findViewById(C12869e.confirm);
                        button3.setText(C12873i.ticket_activation_passbook_confirm_dialog_yes);
                        button3.setOnClickListener(new C13535g(7, aVar, ticket));
                        Button button4 = (Button) view.findViewById(C12869e.cancel);
                        button4.setText(C12873i.ticket_activation_passbook_confirm_dialog_no);
                        button4.setOnClickListener(new C16723t(8, aVar, ticket));
                        aVar.mo23977V1("passbook_ticket", cVar, ticket.f23474c);
                        return;
                    } else if (!C13717b.m34258e(dVar.mo39943a(Ticket.Status.ACTIVE))) {
                        ((ImageView) view.findViewById(C12869e.activation_image)).setImageResource(C12868d.img_ticket_warning);
                        ((TextView) view.findViewById(C12869e.title)).setText(aVar.getString(C12873i.ticket_activation_same_ticket_error_title));
                        ((TextView) view.findViewById(C12869e.message)).setText(aVar.getString(C12873i.ticket_activation_same_ticket_error_message));
                        Button button5 = (Button) view.findViewById(C12869e.confirm);
                        button5.setText(C12873i.ticket_activation_same_ticket_error_yes_button);
                        button5.setOnClickListener(new C7157b(6, aVar, ticket));
                        Button button6 = (Button) view.findViewById(C12869e.cancel);
                        button6.setText(C12873i.not_now_button);
                        button6.setOnClickListener(new C7158c(7, aVar, ticket));
                        aVar.mo23977V1("single_ticket_with_active", (C7755c) null, ticket.f23474c);
                        return;
                    } else {
                        ((ImageView) view.findViewById(C12869e.activation_image)).setImageResource(C12868d.img_ticket);
                        ((TextView) view.findViewById(C12869e.title)).setText(aVar.getString(C12873i.ticket_activation_confirm_dialog_title));
                        ((TextView) view.findViewById(C12869e.message)).setText(aVar.getString(C12873i.ticket_activation_confirm_dialog_message));
                        Button button7 = (Button) view.findViewById(C12869e.confirm);
                        button7.setText(C12873i.ticket_item_activate);
                        button7.setOnClickListener(new C7159d(5, aVar, ticket));
                        Button button8 = (Button) view.findViewById(C12869e.cancel);
                        button8.setText(C12873i.ticket_activation_passbook_confirm_dialog_no);
                        button8.setOnClickListener(new C18467c(3, aVar, ticket));
                        aVar.mo23977V1("single_ticket", (C7755c) null, ticket.f23474c);
                        return;
                    }
                } else {
                    aVar.f40792c.mo44530n2(C13751d.m34341b(aVar.requireContext(), (String) null, (Exception) null));
                    aVar.dismissAllowingStateLoss();
                    return;
                }
        }
    }
}
