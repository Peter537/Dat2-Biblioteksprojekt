package mappers;

import database.ConnectionConfiguration;
import entities.Postnr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PostnrMapper {

    private static List<Postnr> postnrList = new ArrayList<>();

    protected static List<Postnr> getPostnrList() {
        if (!postnrList.isEmpty()) {
            return postnrList;
        }

        List<Postnr> tempPostnrList = new ArrayList<>();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.postnr");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int postnr = result.getInt("postnr");
                String bynavn = result.getString("bynavn");
                tempPostnrList.add(new Postnr(postnr, bynavn));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        postnrList = tempPostnrList;
        return postnrList;
    }

    protected static Postnr opretPostnr(Postnr postnr) {
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            String sql = "INSERT INTO bibliotek.postnr (postnr, bynavn) VALUES (?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, postnr.getPostnr());
            statement.setString(2, postnr.getBynavn());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        postnrList.add(postnr);
        return postnr;
    }
}