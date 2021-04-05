package kg.megacom.services;

import kg.megacom.enums.BikeColor;
import kg.megacom.enums.BikeMakers;
import kg.megacom.enums.BikeType;
import kg.megacom.models.Bike;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ChooseAbleImpl{

    List<Bike> bicycles = new ArrayList<>();

public void addBicycles (){

    bicycles.add(new Bike(BikeMakers.GALAXY, BikeType.CLASSIC, BikeColor.BLACK,23000));
    bicycles.add(new Bike(BikeMakers.SCOTH, BikeType.MOUNTAIN, BikeColor.BLUE,32000));
    bicycles.add(new Bike(BikeMakers.LAUX, BikeType.SPORT, BikeColor.WHITE,44000));
    bicycles.add(new Bike(BikeMakers.GALAXY, BikeType.CLASSIC, BikeColor.GREEN,25000));
 }

    ChooseAble makerName = bike -> bike.getBikeMakers().equals(BikeMakers.LAUX);

    ChooseAble bikeType = bike -> bike.getBikeType().equals(BikeType.SPORT);

    ChooseAble bikeColor = bike -> bike.getBikeColor().equals(BikeColor.WHITE);

    ChooseAble price = bike -> bike.getPrice() == 44000;

public void getBicycles (){

    bicycles.forEach(bike -> System.out.println(bike.getBikeMakers()+":"+(makerName.ChooseBike(bike) && bikeType.ChooseBike(bike)
            && bikeColor.ChooseBike(bike) && price.ChooseBike(bike))));
}

public void createStream() {

    Stream<Object> bicyclesStream = Stream
            .builder()

            .add(new Bike(BikeMakers.GALAXY, BikeType.CLASSIC, BikeColor.BLACK, 23000))
            .add(new Bike(BikeMakers.SCOTH, BikeType.MOUNTAIN, BikeColor.BLUE, 32000))
            .add(new Bike(BikeMakers.LAUX, BikeType.SPORT, BikeColor.WHITE, 44000))
            .add(new Bike(BikeMakers.GALAXY, BikeType.CLASSIC, BikeColor.GREEN, 25000))

            .build();

    long count = bicyclesStream
            .count();

    Stream<Bike> bicyclesStreamOf = Stream.of(
            new Bike(BikeMakers.GALAXY, BikeType.CLASSIC, BikeColor.BLACK, 23000),
            new Bike(BikeMakers.SCOTH, BikeType.MOUNTAIN, BikeColor.BLUE, 32000),
            new Bike(BikeMakers.LAUX, BikeType.SPORT, BikeColor.WHITE, 44000),
            new Bike(BikeMakers.GALAXY, BikeType.CLASSIC, BikeColor.GREEN, 25000)

    );

    long countOf = bicyclesStreamOf
            .filter(bike -> bike.getPrice() > 25000)
            .count();
    System.out.println("Количество классических велосипедов == " + countOf);

 }
}