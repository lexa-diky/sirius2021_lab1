package ru.tinkoff.sirius.repository;

import com.google.gson.Gson;
import ru.tinkoff.sirius.entity.Delivery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportWriterRepo {

    Gson gson;

    public ReportWriterRepo(Gson gson) {
        this.gson = gson;
    }

    public boolean write(File destination, List<Delivery> deliveries) {
        try {
            FileWriter fileWriter = new FileWriter(destination);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(gson.toJson(deliveries));
            bufferedWriter.close();
            Thread.sleep(5_000);
            return true;
        } catch (IOException | InterruptedException e) {
            return false;
        }
    }
}
