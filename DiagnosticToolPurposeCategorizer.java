import java.util.HashMap;
import java.util.Map;

public class DiagnosticToolPurposeCategorizer {
    public static void categorize(DiagnosticTool[] diagnosticTools) {
        Map<String, Integer> purposeCount = new HashMap<>();

        for (DiagnosticTool tool : diagnosticTools) {
            String purpose = tool.purpose;
            purposeCount.put(purpose, purposeCount.getOrDefault(purpose, 0) + 1);
        }

        System.out.println("\n---- Diagnostic Tools by Purpose ----");
        for (Map.Entry<String, Integer> entry : purposeCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " tool(s)");
        }
        System.out.println("-------------------------------------");
    }
}
