package p194o5;

import com.appboy.models.cards.Card;
import com.appboy.p044ui.AppboyFeedFragment;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import p277ub.C6805t;

/* renamed from: o5.d */
public final /* synthetic */ class C5993d implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f19151b;

    public /* synthetic */ C5993d(int i) {
        this.f19151b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f19151b) {
            case 0:
                return AppboyFeedFragment.lambda$sortFeedCards$4((Card) obj, (Card) obj2);
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = DefaultTrackSelector.f14029f;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            default:
                return Float.compare(((C6805t.C6806a) obj).f21056c, ((C6805t.C6806a) obj2).f21056c);
        }
    }
}
