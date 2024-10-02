package Exercise1.StructuralDesignPattern.Usecase2;

import java.util.logging.Logger;

public class LegacyToModernAdapter implements ModernAPI {
    private final LegacySystem legacySystem;
    private static final Logger logger = Logger.getLogger(LegacyToModernAdapter.class.getName());

    public LegacyToModernAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
        logger.info("Legacy system adapted to modern system.");
    }

    @Override
    public void performModernAction() {
        legacySystem.performLegacyAction();
        logger.info("Legacy action executed through modern adapter.");
    }
}
