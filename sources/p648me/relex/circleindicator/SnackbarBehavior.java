package p648me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;

/* renamed from: me.relex.circleindicator.SnackbarBehavior */
public class SnackbarBehavior extends CoordinatorLayout.Behavior<BaseCircleIndicator> {
    public SnackbarBehavior() {
    }

    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        BaseCircleIndicator baseCircleIndicator = (BaseCircleIndicator) view;
        return view2 instanceof Snackbar.SnackbarLayout;
    }

    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        BaseCircleIndicator baseCircleIndicator = (BaseCircleIndicator) view;
        ArrayList q = coordinatorLayout.mo3296q(baseCircleIndicator);
        int size = q.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < size; i++) {
            View view3 = (View) q.get(i);
            if ((view3 instanceof Snackbar.SnackbarLayout) && coordinatorLayout.mo3278h(baseCircleIndicator, view3)) {
                f = Math.min(f, view3.getTranslationY() - ((float) view3.getHeight()));
            }
        }
        baseCircleIndicator.setTranslationY(f);
        return true;
    }

    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
