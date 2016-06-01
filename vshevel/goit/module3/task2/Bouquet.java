package vshevel.goit.module3.task2;

import java.util.List;

/**
 * Created by Vladimir on 31.05.2016.
 */
public class Bouquet {
   public List<Tulip> tulip;
   public List<Flower> flowers;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Tulip> getTulip() {
        return tulip;
    }

    public void setTulip(List<Tulip> tulip) {
        this.tulip = tulip;
    }
}
