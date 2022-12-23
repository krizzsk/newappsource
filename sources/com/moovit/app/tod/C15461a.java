package com.moovit.app.tod;

import android.widget.RatingBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.tod.TodRideRatingDialogFragment;
import com.moovit.commons.utils.ApplicationBugException;

/* renamed from: com.moovit.app.tod.a */
public final /* synthetic */ class C15461a implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TodRideRatingDialogFragment f40051a;

    public /* synthetic */ C15461a(TodRideRatingDialogFragment todRideRatingDialogFragment) {
        this.f40051a = todRideRatingDialogFragment;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        TodRideRatingDialogFragment todRideRatingDialogFragment = this.f40051a;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            todRideRatingDialogFragment.f40021i.setRating(1.0f);
            return;
        }
        String str = TodRideRatingDialogFragment.f40018q;
        todRideRatingDialogFragment.getClass();
        TodRideRatingDialogFragment.RatingReaction ratingReaction = TodRideRatingDialogFragment.f40019r.get((int) Math.floor((double) f));
        if (ratingReaction != null) {
            todRideRatingDialogFragment.f40022j.setText(ratingReaction.reactionResId);
            todRideRatingDialogFragment.f40024l.setHint(ratingReaction.commentHintResId);
            todRideRatingDialogFragment.f40023k.setVisibility(0);
            todRideRatingDialogFragment.f40025m.setEnabled(true);
            return;
        }
        throw new ApplicationBugException(String.format("Did you forget to include a mapping for this rating: %1$.2f?", new Object[]{Float.valueOf(f)}));
    }
}
