package mapper;

import entities.*;

import java.util.List;

public class Facade {

    public static List<Bruger> getBrugerList() {
        return BrugerMapper.getBrugerList();
    }

    public static Bruger opretBruger(Bruger bruger) {
        return BrugerMapper.opretBruger(bruger);
    }

    public static List<Bog> getBogList() {
        return BogMapper.getBogList();
    }

    public static Bog opretBog(Bog bog) {
        return BogMapper.opretBog(bog);
    }

    public static List<Forfatter> getForfatterList() {
        return ForfatterMapper.getForfatterList();
    }

    public static Forfatter opretForfatter(Forfatter forfatter) {
        return ForfatterMapper.opretForfatter(forfatter);
    }

    public static List<Udlaan> getUdlaanList() {
        return UdlaanMapper.getUdlaanList();
    }

    public static Udlaan opretUdlaan(Udlaan udlaan) {
        return UdlaanMapper.opretUdlaan(udlaan);
    }

    public static List<Postnr> getPostnrList() {
        return PostnrMapper.getPostnrList();
    }

    public static Postnr opretPostnr(Postnr postnr) {
        return PostnrMapper.opretPostnr(postnr);
    }
}