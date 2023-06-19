package HomeWork07.model.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger {
    String fileName;
    DateTimeFormatter fileNameDate = DateTimeFormatter.ofPattern("день-месяц-год");

    public FileLogger() {
        this.fileName = LocalDateTime.now().format(fileNameDate) + ".log";
    }

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("день-месяц-год часы:минуты:секунды ");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(LocalDateTime.now().format(formatter) + str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
