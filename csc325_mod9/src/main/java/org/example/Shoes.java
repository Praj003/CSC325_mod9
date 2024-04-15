package org.example;

public interface Shoes {
    String getInfo();
    class PartyShoes implements Shoes{
        // info on party shoes
        public String getInfo() {
            return "Party Shoes";
        }
    }

    class CasualShoes implements Shoes{
        // info on cas shoes
        public String getInfo() {
            return "Casual shoes";
        }
    }

    class ProShoes implements Shoes{
        // info on pro shoes
        public String getInfo() {
            return "Professional Shoes";
        }
    }
}