package net.sirapixel.packetanalyzer.gui;

import net.sirapixel.packetanalyzer.packet.PacketBound;
import net.sirapixel.packetanalyzer.packet.PacketDetail;

import java.awt.Frame;

public class MonitorFrame2 extends TableFrame implements PacketListener {

    private final PacketBound bound;

    public MonitorFrame2(PacketBound bound) {
        super("Packet Monitor (" + bound + ")", new PacketTimeTable());
        this.bound = bound;
    }

    @Override
    public void addPacket(PacketDetail e) {
        if (e.getBound() == bound)
            ((PacketTimeTable) getTable()).addPacket(e);
    }

    @Override
    public Frame getFrame() {
        return this;
    }
}
