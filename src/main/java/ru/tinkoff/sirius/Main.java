package ru.tinkoff.sirius;

import com.google.gson.Gson;
import ru.tinkoff.sirius.entity.Delivery;
import ru.tinkoff.sirius.repository.DeliveryRepository;
import ru.tinkoff.sirius.repository.ReportWriterRepo;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeliveryRepository deliveryRepository = new DeliveryRepository();
        ReportWriterRepo writerRepo = new ReportWriterRepo(new Gson());
        List<Delivery> deliveries = deliveryRepository.getDeliveries();
        writerRepo.write(new File("deliveries.json"),deliveries);
    }
}
