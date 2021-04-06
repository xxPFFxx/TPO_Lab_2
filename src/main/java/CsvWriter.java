import trig.FunctionInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWriter {
    public static void write(ArrayList<FunctionInterface> functions, double start, double end, double step) throws IOException {
        double res;
        File file = new File("test.csv");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);
        //FileWriter file = new FileWriter("csvOutput.csv");
        for (FunctionInterface function: functions){
            for (double x = start; x <= end; x+=step){
                res = function.calculate(x);
                writer.write(String.format("%f;%f;%s;\n", x, res, function.getClass()));
            }
        }
        writer.close();
    }
}
