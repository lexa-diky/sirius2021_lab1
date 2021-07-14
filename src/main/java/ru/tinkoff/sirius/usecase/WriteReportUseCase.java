package ru.tinkoff.sirius.usecase;

import com.google.gson.Gson;
import ru.tinkoff.sirius.entity.Delivery;
import ru.tinkoff.sirius.repository.DeliveryRepository;
import ru.tinkoff.sirius.repository.ReportWriterRepo;

import java.io.File;
import java.util.List;

public final class WriteReportUseCase {

    protected DeliveryRepository dr;
    ReportWriterRepo writerRepo;

    public WriteReportUseCase(DeliveryRepository deliveryRepository, Gson gson) {
        this.dr = deliveryRepository;
        this.writerRepo = new ReportWriterRepo(gson);
    }

    public void run(String path) throws Exception {
        List<Delivery> deliveries = dr.getDeliveries();
        if (!writerRepo.write(new File(path), deliveries)) {
            throw new IllegalArgumentException("no success man!");
        }
    }
}
