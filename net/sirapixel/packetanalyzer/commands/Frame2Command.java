package net.sirapixel.packetanalyzer.commands;

import net.sirapixel.packetanalyzer.gui.MonitorFrame2;
import net.sirapixel.packetanalyzer.gui.PacketListener;
import net.sirapixel.packetanalyzer.packet.PacketBound;

public class Frame2Command extends Frame1Command {

    @Override
    protected PacketListener newClientPacketListener() {
        return new MonitorFrame2(PacketBound.CLIENT);
    }

    @Override
    protected PacketListener newServerPacketListener() {
        return new MonitorFrame2(PacketBound.SERVER);
    }
}
