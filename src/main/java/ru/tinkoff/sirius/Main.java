package ru.tinkoff.sirius;

import com.google.gson.Gson;
import ru.tinkoff.sirius.entity.Delivery;
import ru.tinkoff.sirius.repository.DeliveryRepository;
import ru.tinkoff.sirius.repository.ReportWriterRepo;
import ru.tinkoff.sirius.usecase.WriteReportUseCase;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        new WriteReportUseCase(new DeliveryRepository(), new Gson()).run("deliveries.json");
    }
}
