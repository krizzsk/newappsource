package zendesk.core;

import ck0.C21226b;
import ek0.C23322f;
import ek0.C23336t;

interface BlipsService {
    @C23322f("/embeddable_blip")
    C21226b<Void> send(@C23336t("data") String str);
}
