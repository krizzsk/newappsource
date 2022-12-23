package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements C23588c<ActionHandlerRegistry> {
    private static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

    public static ActionHandlerRegistry actionHandlerRegistry() {
        ActionHandlerRegistry actionHandlerRegistry = ZendeskProvidersModule.actionHandlerRegistry();
        C13641g.m34117e(actionHandlerRegistry);
        return actionHandlerRegistry;
    }

    public static ZendeskProvidersModule_ActionHandlerRegistryFactory create() {
        return INSTANCE;
    }

    public ActionHandlerRegistry get() {
        return actionHandlerRegistry();
    }
}
