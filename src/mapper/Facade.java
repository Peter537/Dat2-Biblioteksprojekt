package mapper;

import entities.*;

import java.util.List;

public class Facade {

    public static List<Bruger> getBrugerList() {
        return BrugerMapper.getBrugerList();
    }

    public static List<Bog> getBogList() {
        return BogMapper.getBogList();
    }

    public static List<Forfatter> getForfatterList() {
        return ForfatterMapper.getForfatterList();
    }

    public static List<Udlaan> getUdlaanList() {
        return UdlaanMapper.getUdlaanList();
    }

    public static List<Postnr> getPostnrList() {
        return PostnrMapper.getPostnrList();
    }
}