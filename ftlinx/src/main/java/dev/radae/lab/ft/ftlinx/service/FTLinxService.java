package dev.radae.lab.ft.ftlinx.service;

import dev.radae.lab.ft.ftlinx.domain.Device;

import java.util.List;

public interface FTLinxService {
    List<Device> listDevice();
    Device findById(int id);
}
