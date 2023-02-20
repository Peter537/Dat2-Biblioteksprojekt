import entities.Bog;
import entities.Bruger;
import entities.Udlaan;
import mapper.BogMapper;
import mapper.BrugerMapper;
import mapper.UdlaanMapper;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(" **********************************");
        System.out.println("  Brugerliste");
        System.out.println();
        List<Bruger> brugerList = BrugerMapper.getBrugerList();
        for (Bruger bruger : brugerList) {
            System.out.println(bruger);
        }

        System.out.println();
        System.out.println(" **********************************");
        System.out.println("  Bogliste");
        System.out.println();
        List<Bog> bogList = BogMapper.getBogList();
        for (Bog bog : bogList) {
            System.out.println(bog);
        }

        System.out.println();
        System.out.println(" **********************************");
        System.out.println("  Udlånliste");
        System.out.println();
        List<Udlaan> udlaanList = UdlaanMapper.getUdlaanList();
        for (Udlaan udlaan : udlaanList) {
            System.out.println(udlaan);
        }
    }
}