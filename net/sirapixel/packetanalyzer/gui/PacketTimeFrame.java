package net.sirapixel.packetanalyzer.gui;

import net.sirapixel.packetanalyzer.packet.PacketDetail;

import java.util.Collection;

public class PacketTimeFrame extends TableFrame {
    public PacketTimeFrame(Collection<PacketDetail> packets) {
        super("Packets", new PacketTimeTable(packets));
    }
}
