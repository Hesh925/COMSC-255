package org.hesh925.week5.as19;

import org.hesh925.week5.as19.Exceptions.*;

import javax.swing.*;

public class TestValidate {
    public static void main(String[] args) {

        String out;

        while (true) {
            try {
                String id = JOptionPane.showInputDialog("Enter Id");
                if (id.equalsIgnoreCase("0")) {
                    JOptionPane.showMessageDialog(null, "Bye");
                    return;
                }
                validateId(id);
                out = "Validated id: " + id + "\n";
                JOptionPane.showMessageDialog(null, out);

                String name = JOptionPane.showInputDialog("Enter name");
                validateName(name);

                out = "Validated name: " + name + "\n";
                JOptionPane.showMessageDialog(null, out);

            } catch (IdNotWholeNumberException | NotAlphabeticException |
                     IdOutOfRangeException | NotSpecifiedException e) {

                String msg = e.getMessage();
                JOptionPane.showMessageDialog(null, msg);
                //e.printStackTrace();
            }
        }
    }

    public static void validateId(String sId) throws IdNotWholeNumberException, IdOutOfRangeException {
        int idInt;
        try {
            idInt = Integer.parseInt(sId);
        } catch (NumberFormatException ex) {
            throw new IdNotWholeNumberException();
        }

        if (idInt < 1 || idInt > 999) {
            throw new IdOutOfRangeException();
        }
    }

    public static void validateName(String name) throws NotSpecifiedException, NotAlphabeticException {
        if (name.isEmpty()) {
            throw new NotSpecifiedException();
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new NotAlphabeticException();
        }
    }
}

