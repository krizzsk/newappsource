package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Landroidx/fragment/app/strictmode/GetTargetFragmentRequestCodeUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "fragment_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentRequestCodeUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get target request code from fragment " + fragment);
        C24362h.m61211f(fragment, "fragment");
    }
}
