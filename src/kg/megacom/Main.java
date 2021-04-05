package kg.megacom;

import kg.megacom.services.ChooseAble;
import kg.megacom.services.ChooseAbleImpl;

public class Main {

    public static void main(String[] args) {

        ChooseAbleImpl chooseAble = new ChooseAbleImpl();
        chooseAble.addBicycles();
        chooseAble.getBicycles();
        chooseAble.createStream();

    }
}
