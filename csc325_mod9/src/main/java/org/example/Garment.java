package org.example;

public interface Garment {

    // method for shoes
    Shoes newShoes();
    // method for tops
    Tops newTop();
    // method for bottoms
    Bottoms newBottom();

    class CasualGarment implements Garment{

        // creates cas shoes
        public Shoes newShoes() {
            return new Shoes.CasualShoes();
        }
        // creates cas tops
        public Tops newTop() {
            return new Tops.CasualTop();
        }
        // creates cas bottoms
        public Bottoms newBottom() {
            return new Bottoms.CasualBottom();
        }
    }

    class PartyGarment implements Garment{

        // creates party shoes
        public Shoes newShoes() {
            return new Shoes.PartyShoes();
        }

        // creates party tops
        public Tops newTop() {
            return new Tops.PartyTop();
        }

        // creates party bottoms
        public Bottoms newBottom() {
            return new Bottoms.PartyBottom();
        }
    }

    class ProGarment implements Garment{

        // creates pro shoes
        public Shoes newShoes() {
            return new Shoes.ProShoes();
        }

        // creates pro tops
        public Tops newTop() {
            return new Tops.ProTops();
        }

        // creates pro bottoms
        public Bottoms newBottom() {
            return new Bottoms.ProBottom();
        }
    }
}