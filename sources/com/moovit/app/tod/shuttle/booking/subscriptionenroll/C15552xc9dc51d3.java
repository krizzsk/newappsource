package com.moovit.app.tod.shuttle.booking.subscriptionenroll;

import android.content.Context;
import android.widget.TextView;
import bf0.C21050d;
import ce0.C21100e;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingInfo;
import com.moovit.app.tod.shuttle.model.TodShuttlePattern;
import com.moovit.app.tod.shuttle.model.TodShuttleSchedule;
import com.moovit.app.tod.shuttle.model.TodShuttleStop;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.app.tod.shuttle.model.TodSubscriptionEnroll;
import com.moovit.app.tod.shuttle.model.TodSubscriptionProposal;
import com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionEnroll;
import com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionProposal;
import com.moovit.design.view.DaysOfWeekPickerView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p988j$.time.DayOfWeek;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/booking/subscriptionenroll/TodShuttleBookingSubscriptionEnrollState;", "selectionState", "Lbf0/d;", "invoke", "(Lcom/moovit/app/tod/shuttle/booking/subscriptionenroll/TodShuttleBookingSubscriptionEnrollState;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
/* renamed from: com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollDialogFragment$onViewCreated$3 */
public final class C15552xc9dc51d3 extends Lambda implements C24236l<TodShuttleBookingSubscriptionEnrollState, C21050d> {
    public final /* synthetic */ TodShuttleBookingSubscriptionEnrollDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15552xc9dc51d3(TodShuttleBookingSubscriptionEnrollDialogFragment todShuttleBookingSubscriptionEnrollDialogFragment) {
        super(1);
        this.this$0 = todShuttleBookingSubscriptionEnrollDialogFragment;
    }

    public final Object invoke(Object obj) {
        Set set;
        TodShuttleBookingSubscriptionEnrollState todShuttleBookingSubscriptionEnrollState = (TodShuttleBookingSubscriptionEnrollState) obj;
        TodShuttleBookingSubscriptionEnrollDialogFragment todShuttleBookingSubscriptionEnrollDialogFragment = this.this$0;
        int i = TodShuttleBookingSubscriptionEnrollDialogFragment.f40407n;
        if (todShuttleBookingSubscriptionEnrollState == null) {
            todShuttleBookingSubscriptionEnrollDialogFragment.dismissAllowingStateLoss();
        } else {
            todShuttleBookingSubscriptionEnrollDialogFragment.getClass();
            TodShuttleBookingInfo todShuttleBookingInfo = todShuttleBookingSubscriptionEnrollState.f40414b;
            TodShuttleTrip todShuttleTrip = todShuttleBookingInfo.f40396d;
            C24362h.m61210e(todShuttleTrip, "displayedInfo.selectedTrip");
            TodShuttlePattern todShuttlePattern = todShuttleTrip.f40432c;
            C24362h.m61210e(todShuttlePattern, "selectedTrip.pattern");
            TextView textView = todShuttleBookingSubscriptionEnrollDialogFragment.f40409i;
            if (textView != null) {
                textView.setText(todShuttlePattern.f40419c);
                ListItemView listItemView = todShuttleBookingSubscriptionEnrollDialogFragment.f40410j;
                if (listItemView != null) {
                    listItemView.setTitle((CharSequence) todShuttlePattern.f40420d.get(0).f40429d);
                    ListItemView listItemView2 = todShuttleBookingSubscriptionEnrollDialogFragment.f40410j;
                    if (listItemView2 != null) {
                        List<TodShuttleStop> list = todShuttlePattern.f40420d;
                        listItemView2.setSubtitle((CharSequence) list.get(list.size() - 1).f40429d);
                        Context requireContext = todShuttleBookingSubscriptionEnrollDialogFragment.requireContext();
                        C24362h.m61210e(requireContext, "requireContext()");
                        TodShuttleSchedule todShuttleSchedule = todShuttleTrip.f40433d;
                        int i2 = todShuttleBookingInfo.f40397e;
                        long[] jArr = todShuttleSchedule.f40425b;
                        C21100e.m49375y(0, jArr.length - 1, "index", i2);
                        long j = jArr[i2];
                        ListItemView listItemView3 = todShuttleBookingSubscriptionEnrollDialogFragment.f40411k;
                        if (listItemView3 != null) {
                            listItemView3.setAccessoryText((CharSequence) C7925b.m18018f(requireContext, j, false));
                            CurrencyAmount currencyAmount = todShuttleBookingSubscriptionEnrollState.f40415c.f40439c;
                            ListItemView listItemView4 = todShuttleBookingSubscriptionEnrollDialogFragment.f40412l;
                            if (listItemView4 != null) {
                                listItemView4.setAccessoryText((CharSequence) String.valueOf(currencyAmount));
                                TodSubscriptionProposal todSubscriptionProposal = todShuttleBookingSubscriptionEnrollState.f40415c.f40440d.f40441b;
                                DaysOfWeekPickerView daysOfWeekPickerView = todShuttleBookingSubscriptionEnrollDialogFragment.f40413m;
                                if (daysOfWeekPickerView != null) {
                                    if (todSubscriptionProposal instanceof TodWeeklySubscriptionProposal) {
                                        set = ((TodWeeklySubscriptionProposal) todSubscriptionProposal).f40445d.f40238b;
                                    } else {
                                        set = EmptySet.f60175b;
                                    }
                                    daysOfWeekPickerView.setValidDaysOfWeek(set);
                                    TodSubscriptionEnroll todSubscriptionEnroll = todShuttleBookingSubscriptionEnrollState.f40416d;
                                    DaysOfWeekPickerView daysOfWeekPickerView2 = todShuttleBookingSubscriptionEnrollDialogFragment.f40413m;
                                    if (daysOfWeekPickerView2 != null) {
                                        Set<DayOfWeek> selectedDays = daysOfWeekPickerView2.getSelectedDays();
                                        DaysOfWeekPickerView daysOfWeekPickerView3 = todShuttleBookingSubscriptionEnrollDialogFragment.f40413m;
                                        if (daysOfWeekPickerView3 != null) {
                                            if ((todSubscriptionEnroll instanceof TodWeeklySubscriptionEnroll) && selectedDays.isEmpty()) {
                                                selectedDays = ((TodWeeklySubscriptionEnroll) todSubscriptionEnroll).f40443d.f40238b;
                                            }
                                            daysOfWeekPickerView3.setSelectedDays(selectedDays);
                                        } else {
                                            C24362h.m61217l("daysOfWeekPickerView");
                                            throw null;
                                        }
                                    } else {
                                        C24362h.m61217l("daysOfWeekPickerView");
                                        throw null;
                                    }
                                } else {
                                    C24362h.m61217l("daysOfWeekPickerView");
                                    throw null;
                                }
                            } else {
                                C24362h.m61217l("rideFareView");
                                throw null;
                            }
                        } else {
                            C24362h.m61217l("pickupTimeView");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("patternOrgDstView");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("patternOrgDstView");
                    throw null;
                }
            } else {
                C24362h.m61217l("patternNameView");
                throw null;
            }
        }
        return C21050d.f52856a;
    }
}
