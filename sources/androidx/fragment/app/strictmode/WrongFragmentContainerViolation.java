package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Landroidx/fragment/app/strictmode/WrongFragmentContainerViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroid/view/ViewGroup;", "container", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class WrongFragmentContainerViolation extends Violation {
    private final ViewGroup container;

    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        this.container = viewGroup;
    }
}
