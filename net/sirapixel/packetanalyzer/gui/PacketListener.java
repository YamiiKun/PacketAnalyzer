package net.sirapixel.packetanalyzer.gui;

import net.sirapixel.packetanalyzer.packet.PacketDetail;

import java.awt.Frame;

public interface PacketListener {
    void addPacket(PacketDetail e);

    Frame getFrame();
}
