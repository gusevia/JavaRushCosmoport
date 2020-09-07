package com.space.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
//@Table(name="ship")
public class Ship {

    @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; //ID корабля

    private String name;  //Название корабля (до 50 знаков включительно)

    private String planet;  //Планета пребывания (до 50 знаков включительно)

    @Enumerated(EnumType.STRING)
    private ShipType shipType;  //Тип корабля

    private Date prodDate;  //Дата выпуска, 2800..3019 включительно

    private Boolean isUsed;  //Использованный или новый

    private Double speed;  //Максимальная скорость корабля, 0,01..0,99 включительно. Используй математическое округление до сотых.

    private Integer crewSize;  //Количество членов экипажа, 1..9999 включительно.

    private Double rating;  //Рейтинг корабля. Используй математическое округление до сотых.

    public Ship() {
    }

    public Ship(String name, String planet, ShipType shipType, Date prodDate,
                Boolean isUsed, Double speed, Integer crewSize, Double rating) {
        this.name = name;
        this.planet = planet;
        this.shipType = shipType;
        this.prodDate = prodDate;
        this.isUsed = isUsed;
        this.speed = speed;
        this.crewSize = crewSize;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(Integer crewSize) {
        this.crewSize = crewSize;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null||this.getClass()!=obj.getClass()) return false;
        Ship ship=(Ship)obj;
        return id.equals(ship.id)&&
                name.equals(ship.name)&&
                planet.equals(ship.planet)&&
                shipType.equals(ship.shipType)&&
                prodDate.equals(ship.prodDate)&&
                isUsed.equals(ship.isUsed)&&
                speed.equals(ship.speed)&&
                crewSize.equals(ship.crewSize)&&
                rating.equals(ship.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,planet,shipType,prodDate,isUsed,speed,crewSize,rating);
    }
}
