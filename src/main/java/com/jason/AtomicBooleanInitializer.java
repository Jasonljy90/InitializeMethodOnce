package com.jason;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanInitializer {
    AtomicBoolean isInitialized = new AtomicBoolean(false);
    int callCount = 0;

    void initialize() {
        if (isInitialized.compareAndSet(false, true)) {
            initializationLogic();
        }
    }

    private void initializationLogic() {
        callCount++;
    }
}
