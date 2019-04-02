package ua.lviv.iot.SkiResortMachinery.managers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.SkiResortMachinery.models.SkiResortMachinery;

public class SkiResortMachineryWriter {

    public SkiResortMachineryWriter() {

    }

    public final void writeToFile(final List<SkiResortMachinery> list, final File file) throws IOException {
        int i = 0;
        try (FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                BufferedWriter bufWriter = new BufferedWriter(osw);) {

            for (i = 0; i < list.size(); i++) {
                bufWriter.write(list.get(i).getHeaders());
                bufWriter.newLine();
                bufWriter.write(list.get(i).toCSV());
                if (i < list.size() - 1) {
                    bufWriter.newLine();
                }
            }
        }

    }
}
