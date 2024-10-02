package Exercise1.StructuralDesignPattern.Usecase2;

public class Main {
    public static void main(String[] args) {
        // Using Modern API directly
        ModernAPI modernSystem = new ModernSystem();
        modernSystem.performModernAction();

        // Using Legacy System through an Adapter
        LegacySystem legacySystem = new LegacySystem();
        ModernAPI adaptedLegacySystem = new LegacyToModernAdapter(legacySystem);
        adaptedLegacySystem.performModernAction();
    }
}

