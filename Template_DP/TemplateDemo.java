// Step 1: Abstract class defines the template
abstract class DataProcessor {

    // Template method - defines the steps
    public final void processData() {
        readData();
        processDataLogic();
        saveData();
    }

    // Common steps
    void readData() {
        System.out.println("Reading data from source...");
    }

    void saveData() {
        System.out.println("Saving processed data...");
    }

    // Step to be implemented by subclasses
    abstract void processDataLogic();
}

// Step 2: Concrete classes implement specific steps
class ExcelDataProcessor extends DataProcessor {
    @Override
    void processDataLogic() {
        System.out.println("Processing Excel data...");
    }
}

class TextDataProcessor extends DataProcessor {
    @Override
    void processDataLogic() {
        System.out.println("Processing Text data...");
    }
}

// Step 3: Client code
public class TemplateDemo {
    public static void main(String[] args) {
        DataProcessor excel = new ExcelDataProcessor();
        excel.processData();

        System.out.println("--------------------");

        DataProcessor text = new TextDataProcessor();
        text.processData();
    }
}
