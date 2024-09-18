package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.producer.BulldozerProducer;
import core.mate.academy.producer.ExcavatorProducer;
import core.mate.academy.producer.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> list = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            list = new ArrayList<>(new BulldozerProducer().get());
        }
        if (type.equals(Excavator.class)) {
            list = new ArrayList<>(new ExcavatorProducer().get());
        }
        if (type.equals(Truck.class)) {
            list = new ArrayList<>(new TruckProducer().get());
        }
        return list;
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        if (!machines.isEmpty()) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, value);
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
