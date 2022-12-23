package z70;

import android.content.Context;
import android.view.View;
import com.moovit.search.SearchLocationActivity;

/* renamed from: z70.f */
public final /* synthetic */ class C13328f implements View.OnClickListener {
    public final void onClick(View view) {
        Context context = view.getContext();
        if (context instanceof SearchLocationActivity) {
            ((SearchLocationActivity) context).mo23890A2("choose_map_footer_clicked");
        }
    }
}
