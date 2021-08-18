package dev.radae.lab.ft.ftlinx.service.impl;

import dev.radae.lab.ft.ftlinx.domain.Device;
import dev.radae.lab.ft.ftlinx.service.FTLinxService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FTLinxServiceImpl implements FTLinxService {
    private static final Map<Integer,Device> daoMap= new HashMap<>();

    static {
        Device d1 = new Device(1,"1.0","127.0.0.1","ControllerA");
        Device d2 = new Device(2,"1.0","127.0.0.1","ControllerB");
        Device d3 = new Device(3,"1.0","127.0.0.1","ControllerC");
        Device d4 = new Device(4,"1.0","127.0.0.1","ControllerD");
        Device d5 = new Device(5,"1.0","127.0.0.1","ControllerE");
        Device d6 = new Device(6,"1.0","127.0.0.1","ControllerF");

        daoMap.put(d1.getId(),d1);
        daoMap.put(d2.getId(),d2);
        daoMap.put(d3.getId(),d3);
        daoMap.put(d4.getId(),d4);
        daoMap.put(d5.getId(),d5);
        daoMap.put(d6.getId(),d6);

    }
    @Override
    public List<Device> listDevice() {
        Collection<Device> collection = daoMap.values();
        List<Device> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Device findById(int id) {
        return null;
    }
}
