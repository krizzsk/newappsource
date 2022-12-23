package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, mo59060d2 = {"Lkotlinx/coroutines/channels/ClosedSendChannelException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException() {
        super("Channel was closed");
    }
}
